package manube_v2

import grails.converters.JSON

class SeccionController {
    static allowedMethods = [store: 'POST', get_secciones: 'POST']

    FuncionesSQLService funcionesSQLService
    ValidacionesService validacionesService

    def index() { }

    def get_secciones()
    {
        Map<String, Object> data = new HashMap<String, Object>()
        def secciones = TareasSeccion.findAllByFIdempresa(session.user.fIdempresa as Long)
        data.put("secciones", secciones)
        render data as JSON
    }

    def store(){

        Map<String, Object> response_data = new HashMap<String, Object>()
        Map<String, Object> errors = new HashMap<String, Object>()

        def data = JSON.parse(params.data)


        if (data)
        {
            List errorValidacione
            errorValidacione = validacionesService.validarCategoria(data)

            if (errorValidacione.size() > 0)
            {
                response_data.put("errors", errorValidacione)
                render response_data as JSON
            }


            if(data.id.toString().toLong() > 0) {
                def seccione =  TareasSeccion.get(data.id as Long)
                seccione.fDescripcion = data.descripcion.toString().toUpperCase()
                seccione.fIdempresa = session.user.fIdempresa
                if (seccione.save(flush: true))
                {
                    response_data.put("success", true)
                    render response_data as JSON
                    return
                }

            }
            else{
                def seccione = new TareasSeccion()
                seccione.fDescripcion = data.descripcion.toString().toUpperCase()
                seccione.fIdempresa = session.user.fIdempresa
                if (seccione.save(failOnError: true))
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
