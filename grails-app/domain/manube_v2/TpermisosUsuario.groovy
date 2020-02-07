package manube_v2

class TpermisosUsuario {

    static mapping = {
         table 'cfg.t_permisos_usuario'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_id'
    }
    Long fIdusuario
    Long fIdopcion

    static constraints = {
        fIdusuario(nullable: true, max: 9999999999L)
        fIdopcion(nullable: true, max: 9999999999L)
    }
    String toString() {
    }
}
