package manube_v2

import com.google.gson.annotations.JsonAdapter
import grails.converters.JSON

class MesaController {
    FuncionesSQLService funcionesSQLService
    ValidacionesService validacionesService
    def index() { }


    def get_lista_mesas() {
        Map<String, Object> data = new HashMap<String, Object>()
        data.put("mesas", funcionesSQLService.getMesas(session.user.fIdempresa))
        render data as JSON
    }

    def store(){

        Map<String, Object> response_data = new HashMap<String, Object>()

        def data = JSON.parse(params.data)

        List errorValidacione
        errorValidacione = validacionesService.validarMesa(data, session.user.fIdempresa)
        //validacionesService.validarMesa()

        if (errorValidacione.size() > 0)
        {
            response_data.put("errors", errorValidacione)
            render response_data as JSON
            return
        }

        def mesa = funcionesSQLService.guardarMesa(data, session.user.fIdempresa)


        if(mesa) {
            response_data.put("success", true)
            render response_data as JSON
        }
        else{
            response_data.put("success", false)
            render response_data as JSON
        }

    }
}
