package manube_v2


class LoginInterceptor {

    LoginInterceptor() {
        matchAll()
        //matchAll().except(controller: 'login')
    }

    boolean before() {
        if (request.getServletPath().contains("get_ventas_y_ultima_actualizacion")) {
            return true
        } else {
            if (session.user == null && controllerName != 'login') {
                redirect(controller: 'login', actionName: ' ')
                return false
            } else if (session.user != null && controllerName == "login" && actionName != "logout") {
                redirect(controller: 'home')
                return false
            } else {
                return true
            }

        }


    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
