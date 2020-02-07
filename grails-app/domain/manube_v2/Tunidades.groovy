package manube_v2
class Tunidades {
    static mapping = {
         table 't_unidades'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    String fDescripcion

    static constraints = {
        fIdempresa(nullable: true, max: 9999999999L)
        fDescripcion(size: 0..20)
    }
    String toString() {
    }
}
