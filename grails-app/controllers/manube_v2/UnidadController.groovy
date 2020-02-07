package manube_v2

import grails.converters.JSON

class UnidadController {
    static allowedMethods = [store: 'POST', get_unidades: 'POST']

    FuncionesSQLService funcionesSQLService
    ValidacionesService validacionesService

    def index() { }

    def get_unidades()
    {
        Map<String, Object> data = new HashMap<String, Object>()
        def unidades = Tunidades.findAllByFIdempresa(session.user.fIdempresa as Long)
        data.put("unidades", unidades)
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




            if (data.id.toString().toLong() > 0){
                def unidad = Tunidades.get(data.id.toString().toLong())
                unidad.fDescripcion = data.descripcion.toString().toUpperCase()
                unidad.fIdempresa = session.user.fIdempresa as Long
                if (unidad.save(flush:true))
                {
                    response_data.put("success", true)
                    render response_data as JSON
                }
            }
            else{
                def unidad = new Tunidades()
                unidad.fDescripcion = data.descripcion.toString().toUpperCase()
                unidad.fIdempresa = session.user.fIdempresa as Long
                if (unidad.save(flush:true))
                {
                    response_data.put("success", true)
                    render response_data as JSON
                }
            }

        }
        else{
            response_data.put("success", false)
            render response_data as JSON
        }
    }
}
