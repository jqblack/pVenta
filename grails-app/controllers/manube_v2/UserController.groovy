package manube_v2

import grails.converters.JSON

class UserController {

    HelperService helperService
    FuncionesSQLService funcionesSQLService
    ValidacionesService validacionesService

    def index() {
        println session.user.fActivarPedidos
        render (
                view:'index',
                model:
                        [
                                permisos: helperService.permisosUsuarios(),
                                tipos_usuarios: helperService.tiposUsuarios(),
                                lang: funcionesSQLService.getLanguaje()
                        ]
        )
    }

    def mensajero() {
        def zonas = Tzonas.findAllByFIdempresa(session.user.fIdempresa)

        render (
                view:'mensajero',
                model:
                        [
                                zonas: zonas
                        ]
        )
    }

    def get_permisos()
    {
        Map<String, Object> data = new HashMap<String, Object>()
        data.put("permisos", funcionesSQLService.getPermisos())
        render data as JSON
    }
    def get_usuarios()
    {
        Map<String, Object> data = new HashMap<String, Object>()
        data.put("usuarios", funcionesSQLService.getUsarios(session.user.fIdempresa))
        render data as JSON
    }
    def get_usuario_y_permisos()
    {
        render funcionesSQLService.getUsarioConPermisos(params.id as Long) as JSON
    }

    def store () {
        Map<String, Object> response_data = new HashMap<String, Object>()

        def data = JSON.parse(params.data)

        List errorValidacione
        errorValidacione = validacionesService.validarUsuario(data,session.user.fIdempresa as Long)

        if (errorValidacione.size() > 0)
        {
            response_data.put("errors", errorValidacione)
            render response_data as JSON
            return
        }

        def usuario = funcionesSQLService.guardarUsuario(data, session.user.fIdempresa)


        if(usuario) {
            response_data.put("success", true)
            render response_data as JSON
        }
        else{
            response_data.put("success", false)
            render response_data as JSON
        }
    }

    def store_mensajero() {
        Map<String, Object> response_data = new HashMap<String, Object>()

        def data = JSON.parse(params.data)

        List errorValidacione
        errorValidacione = validacionesService.validarMensajero(data)

        if (errorValidacione.size() > 0)
        {
            response_data.put("errors", errorValidacione)
            render response_data as JSON
            return
        }

        def usuario = funcionesSQLService.guardarMensajero(data, session.user.fIdempresa)


        if(usuario) {
            response_data.put("success", true)
            render response_data as JSON
        }
        else{
            response_data.put("success", false)
            render response_data as JSON
        }
    }

    def getMensajeros() {
        Map<String, Object> data = new HashMap<String, Object>()
        data.put("data", funcionesSQLService.getMensajerosFiltradoByName(session.user.fIdempresa, params.filtro.toString()))
        render data as JSON
    }

    def getMensajero() {
        Map<String, Object> data = new HashMap<String, Object>()
        data.put("data", funcionesSQLService.getMensajero(session.user.fIdempresa,params.idmensajero.toString().toLong()))
        render data as JSON
    }

}
