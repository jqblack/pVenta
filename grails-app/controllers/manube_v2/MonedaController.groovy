package manube_v2

import grails.converters.JSON

class MonedaController {
    /*
    * controlador para la gestion de
    * Tipos de monedas
    * Tasas de monedas
    * Tipos de tarjetas
    * Tipos de billetes
    * **/
    FuncionesSQLService funcionesSQLService
    ValidacionesService validacionesService

    def index() { }
    def tipos_monedas() {}
    def tasa_monedas() {}
    def tarjetas() {}
    def billetes() {}


    def get_lista_monedas() {
        Map<String, Object> data = new HashMap<String, Object>()
        data.put("monedas", TtipoMoneda.findAllByFIdempresa(session.user.fIdempresa))
        render data as JSON
    }
    def get_lista_tasas_monedas() {
        Map<String, Object> data = new HashMap<String, Object>()
        data.put("tasas", funcionesSQLService.getTiposMonedas(session.user.fIdempresa))
        render data as JSON
    }
    def get_lista_tarjetas() {
        Map<String, Object> data = new HashMap<String, Object>()
        data.put("tarjetas", TtipoTarjeta.list())
        render data as JSON
    }
    def get_billetes_by_moneda_id() {
        Map<String, Object> data = new HashMap<String, Object>()
        def params_data = JSON.parse(params.data)
        data.put("billetes", TtipoBillete.findAllByFIdtipoMoneda(params_data.idmoneda, [sort: "fValor", order: "DESC"]))
        render data as JSON
    }

    def store_tipo_moneda(){

        Map<String, Object> response_data = new HashMap<String, Object>()

        def data = JSON.parse(params.data)

        List errorValidacione
        errorValidacione = validacionesService.validarTipoMoneda(data)

        if (errorValidacione.size() > 0)
        {
            response_data.put("errors", errorValidacione)
            render response_data as JSON
            return
        }

        def item = funcionesSQLService.guardarTipoMoneda(data, session.user.fIdempresa)


        if(item) {
            response_data.put("success", true)
            render response_data as JSON
        }
        else{
            response_data.put("success", false)
            render response_data as JSON
        }

    }

    def store_tasa(){

        Map<String, Object> response_data = new HashMap<String, Object>()

        def data = JSON.parse(params.data)

        List errorValidacione
        errorValidacione = validacionesService.validarTasaMoneda(data)

        if (errorValidacione.size() > 0)
        {
            response_data.put("errors", errorValidacione)
            render response_data as JSON
            return
        }

        def item = funcionesSQLService.guardarTasaMoneda(data, session.user.fIdempresa)


        if(item) {
            response_data.put("success", true)
            render response_data as JSON
        }
        else{
            response_data.put("success", false)
            render response_data as JSON
        }

    }

    def store_tarjeta(){

        Map<String, Object> response_data = new HashMap<String, Object>()

        def data = JSON.parse(params.data)

        List errorValidacione
        errorValidacione = validacionesService.validarTarjeta(data)

        if (errorValidacione.size() > 0)
        {
            response_data.put("errors", errorValidacione)
            render response_data as JSON
            return
        }

        def item = funcionesSQLService.guardarTarjeta(data)

        if(item) {
            response_data.put("success", true)
            render response_data as JSON
        }
        else{
            response_data.put("success", false)
            render response_data as JSON
        }
    }

    def store_billetes(){

        Map<String, Object> response_data = new HashMap<String, Object>()

        def data = JSON.parse(params.data)

        List errorValidacion
        errorValidacion = validacionesService.validarBillete(data)

        if (errorValidacion.size() > 0)
        {
            response_data.put("errors", errorValidacion)
            render response_data as JSON
            return
        }

        def item = funcionesSQLService.guardarBillete(data)

        if(item) {
            response_data.put("success", true)
            render response_data as JSON
        }
        else{
            response_data.put("success", false)
            render response_data as JSON
        }
    }
}
