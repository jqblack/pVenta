package manube_v2

import grails.converters.JSON
import grails.websocket.example.ServerPrinterNodo


class LoginController {
    //static allowedMethods = [authenticate: 'POST', logout: 'POST']
    def sqlService
    def reportService

    FuncionesSQLService funcionesSQLService

    def index() {

    }

//    def web(String dato){
//
//        String p = "Pabel dionicio lopez mena";
//        ServerPrinterNodo.enviar(p,dato)
//        println("Hola mundo");
//
//        render dato;
//    }

    def logout() {
        Map<String, Object> mensaje = new HashMap<String, Object>()
        session.removeAttribute("user")
        mensaje.put("success", true)
        render mensaje as JSON
    }

    def authenticate() {
//        String sql =" select * from t_areas ;";
//        List list2 = sqlService.GetQuery(sql);
//        println list2;

        //reportService.getReport()


        List<String> list = new ArrayList<String>()
        Map<String, Object> mapAux = new HashMap<>()


        if (params.username.toString().equals("")) {
            list.add("El usuario esta vacio.")
        }
        if (params.bussines.toString().equals("")) {
            list.add("La empresa esta vacia.")
        }
        if (params.password.toString().equals("")) {
            list.add("La contraseña esta vacia.")

        }

        if (list.size() > 0) {
            mapAux.put("errors", list)

            render mapAux as JSON
        }

        try {
            def user = Tusuarios
                    .findByFUsernameAndFPasswordAndFIdempresaAndFActivo(
                    params.username,
                    params.password.toString().encodeAsMD5(),
                    params.bussines.toString() as Long,
                    true
            )

            if (user != null) {
                //def userPermission = TpermisosUsuario.findAllByFIdusuario(user.id)

                session.setMaxInactiveInterval(28800)
                list.add(true)
                mapAux.put("success", list)
                session['user'] = user
                session['idnodo'] = ""
                session['last_status_printer'] = ["f_key": "-6", "f_mensaje": "printer desconectado"]
                session['empresa'] = Tempresas.findById(user.fIdempresa)
                session['default_config_impresion'] = funcionesSQLService.getAllConfiguracionProcesosImpresion(user.fIdempresa)

                // Configuracion personalizable
                //session['config_impresion'] = new ArrayList<HashMap<Object, Object>>()

                //session.setMaxInactiveInterval(2880)

                userMenu()
                render mapAux as JSON
            } else {
                list.add("Usuario y/o contraseña invalida.")
                mapAux.put("errors", list)
                render mapAux as JSON
                return
            }
        }
        catch (NumberFormatException nfe) {
            list.add("Solo se permiten valores numericos")
            mapAux.put("errors", list)
            render mapAux as JSON
            return
        }


    }

    def userMenu() {
        def sql = " select opciones FROM\n" +
                "\t TopcionesMenu as opciones\n" +
                "    inner join TpermisosUsuario as permisos on opciones.id = permisos.fIdopcion\n" +
                "WHERE\n" +
                "\topciones.fPadre = 0 and permisos.fIdusuario = ? order by opciones.fOrden asc"

        Collection e = [session.user.id]

        def miMenu = TopcionesMenu.findAll(sql, e)
        StringBuilder html = new StringBuilder()

        miMenu.each { row ->
            html.append(generarMenu(row.id))
        }

        session['menu'] = html.toString()

    }

    def generarMenu(Long id) {
        TopcionesMenu padre = TopcionesMenu.findById(id)

        String sql = " from TopcionesMenu as b where b.fPadre = ?  order by b.fOrden asc"
        Collection e = [padre.id]
        List<TopcionesMenu> menu = TopcionesMenu.findAll(sql, e)
        StringBuilder html = new StringBuilder()

        if (menu.size() == 0) {
            html.append("<li class=\"nav-item\">  <a class=\"nav-link\"href=\"${(padre.fUrl) ? request.getContextPath() + "/" + padre.fUrl : "#"}\"><i class=\"${padre.fIconoWeb}\"></i> ${padre.fDescripcion}</a></li>")
        } else {
            html.append("<li class=\"nav-item nav-dropdown\">")
            html.append("<a href='#' class=\"nav-link nav-dropdown-toggle\"> <i class=\"${padre.fIconoWeb}\"></i> ${padre.fDescripcion} <a/>")
            html.append("<ul class=\"nav-dropdown-items\">")

            menu.each { tupla ->
                TpermisosUsuario tpermisosUsuario = TpermisosUsuario.findByFIdopcionAndFIdusuario(tupla.id, session.user.id)
                if (tpermisosUsuario) {
                    html.append(generarMenu(tupla.id))
                }

            }
            html.append("</ul>")
            html.append("</li>")
        }

        return html

    }
}
