package manube_v2
class Tlocalizaciones {
    static mapping = {
         table 't_localizaciones'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idreocrd'
    }
    Long fIdempresa
    String fDescripcion

    static constraints = {
        fIdempresa(max: 9999999999L)
        fDescripcion(size: 0..40)
    }
    String toString() {
    }
}
