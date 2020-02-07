package manube_v2

import grails.converters.JSON

class AreaController {

    static allowedMethods = [store: 'POST', get_areas: 'POST']

    FuncionesSQLService funcionesSQLService
    ValidacionesService validacionesService

    def index() { }

    def get_areas()
    {
        Map<String, Object> data = new HashMap<String, Object>()
        def areas = Tareas.findAllByFIdempresa(session.user.fIdempresa as Long)
        data.put("areas", areas)
        render data as JSON
    }

    def store(){

        Map<String, Object> response_data = new HashMap<String, Object>()
        Map<String, Object> errors = new HashMap<String, Object>()

        def data = JSON.parse(params.data)

        //println(data.descripcion)

        if (data)
        {
            List errorValidacione
            errorValidacione = validacionesService.validarCategoria(data)

            if (errorValidacione.size() > 0)
            {
                 response_data.put("errors", errorValidacione)
                render response_data as JSON
                return
            }


            if(data.id.toString().toLong() > 0) {
                def areas =  Tareas.get(data.id as Long)
                areas.fNombreArea = data.descripcion.toString().toUpperCase()
                areas.fTiempoCamarero = data.tiempo_camarero.toString().toLong()
                areas.fIdempresa = session.user.fIdempresa
                if (areas.save(flush: true))
                {

                    response_data.put("success", true)
                    render response_data as JSON
                    return

                }

            }
            else{
                def areas = new Tareas()
                areas.fNombreArea = data.descripcion.toString().toUpperCase()
                areas.fTiempoCamarero = data.tiempo_camarero.toString().toLong()
                areas.fIdempresa = session.user.fIdempresa
                if (areas.save(failOnError: true))
                {

                    response_data.put("success", true)
                    render response_data as JSON
                    return
                }
            }


        }
        else{
            response_data.put("success", false)
            render response_data as JSON
        }
    }
}
