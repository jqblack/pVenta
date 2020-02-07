package manube_v2
class TopcionesMenuEmpresa {
    static mapping = {
         table 'cfg.t_opciones_menu_empresa'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    Long fIdopcionmenu

    static constraints = {
        fIdempresa(nullable: true, max: 9999999999L)
        fIdopcionmenu(nullable: true, max: 9999999999L)
    }
    String toString() {
    }
}
