/**
 * The TtipoMoneda entity.
 *
 * @author    
 *
 *
 */
package manube_v2

class TtipoMoneda {
    static mapping = {
         table 't_tipo_moneda'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    String fDescripcion
    String fSigla
    Long fIdempresa

    static constraints = {
        fDescripcion(size: 0..10)
        fSigla(size: 0..20)
        fIdempresa(nullable: true, max: 9999999999L)
    }
    String toString() {
    }
}
