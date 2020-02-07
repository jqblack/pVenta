package manube_v2

import groovy.json.JsonOutput

class LogoutSessionController {

    FuncionesSQLService funcionesSQLService;
    def index() { }

    def logoutSession(){}

    def getSessionesActivas(){
        List lista = funcionesSQLService.ListarSessionesPuntoVentasActivas(session.user.fIdempresa as Long);
        render JsonOutput.toJson(lista);
    }

    def logoutSessionByToken(){
        boolean  valor = funcionesSQLService.LogoutSessionPuntoVenta(params.f_token as String,session.user.fIdempresa as Long);
        render valor;
    }
}
