package manube_v2

import grails.converters.JSON

class NcfController {

    FuncionesSQLService funcionesSQLService
    ValidacionesService validacionesService

    def index() { }

    def get_lista_ncf() {
        Map<String, Object> data = new HashMap<String, Object>()
        data.put("ncf", funcionesSQLService.listaNcf(session.user.fIdempresa))
        render data as JSON
    }

    def get_ncf_logs() {
        Map<String, Object> data = new HashMap<String, Object>()
        data.put("logs", funcionesSQLService.getNcfLogs(params.id as Long, session.user.fIdempresa))
        render data as JSON
    }

    def store(){

        Map<String, Object> response_data = new HashMap<String, Object>()

        def data = JSON.parse(params.data)

        List errorValidacione
        errorValidacione = validacionesService.validarNcf(data)


        if (errorValidacione.size() > 0)
        {
            response_data.put("errors", errorValidacione)
            render response_data as JSON
            return
        }

        def ncf = funcionesSQLService.guardarNcf(data, session.user.fIdempresa)


        if(ncf) {
            response_data.put("success", true)
            render response_data as JSON
        }
        else{
            response_data.put("success", false)
            render response_data as JSON
        }

    }
    def store_secuencia(){

        Map<String, Object> response_data = new HashMap<String, Object>()

        def data = JSON.parse(params.data)

//        print("print")
//        data.each { row ->
//            println(row.uid)
//        }
//        println("")
//        return

        List errorValidacion
        errorValidacion = validacionesService.validarNcfLog(data)


        if (errorValidacion.size() > 0)
        {
            response_data.put("errors", errorValidacion)
            render response_data as JSON
            return
        }

        def ncf = funcionesSQLService.guardarNcfLog(data, session.user.fIdempresa, session.user.id)


        if(ncf) {
            response_data.put("success", true)
            render response_data as JSON
        }
        else{
            response_data.put("success", false)
            render response_data as JSON
        }

    }
}
