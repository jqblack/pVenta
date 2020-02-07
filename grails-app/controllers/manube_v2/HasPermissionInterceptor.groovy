package manube_v2


class HasPermissionInterceptor {
    FuncionesSQLService funcionesSQLService
    HasPermissionInterceptor()
    {
        //matchAll()
        matchAll()
                .except(controller: 'login')
                .except(controller: 'error')
                .except(controller: 'home')
    }

    boolean before() {
        if (!funcionesSQLService.hassPermission(session.user.id,controllerName, actionName))
        {
            redirect(
                    controller: 'error',
                    action: 'error',
                    params: [
                            errorMsgTitle: "No tienes permiso.",
                            errorMsg: "Este usuario no tiene permiso para acceder a esta opcion.",
                            errorCode: 403
                    ]
            )

            return false
        }
        else {
            return true
        }

    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
