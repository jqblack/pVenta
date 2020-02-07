package manube_v2

class TopcionesMenu {

    static mapping = {
         table 'cfg.t_opciones_menu'
         // version is set to false, because this isn't available by default for legacy databases
         version false
        id generator:'identity', column:'f_id'
    }
    String fDescripcion
    Long fPadre
    String fUrlIcono
    String fUrl
    Long fOrden
    String fComando
    Long fIdidioma
    String fIconoWeb

    static constraints = {
        fDescripcion(size: 0..50)
        fIconoWeb(size: 0..100)
        fPadre(nullable: true, max: 9999999999L)
        fUrlIcono()
        fUrl()
        fOrden(max: 9999999999L)
        fComando()
        fIdidioma(max: 9999999999L)
    }
    String toString() {
    }
}
