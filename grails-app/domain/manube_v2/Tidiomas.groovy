/**
 * The Tidiomas entity.
 *
 * @author    
 *
 *
 */
package  manube_v2
class Tidiomas {
    static mapping = {
         table 't_idiomas'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    String fDescripcion
    String fSigla

    static constraints = {
        fDescripcion(size: 0..100)
        fSigla(size: 0..5)
    }
    String toString() {
    }
}
