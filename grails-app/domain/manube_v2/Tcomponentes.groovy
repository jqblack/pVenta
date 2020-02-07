/**
 * The Tcomponentes entity.
 *
 * @author  Julio J. Capellan  
 *
 *
 */

package manube_v2
class Tcomponentes {
    static mapping = {
         table 't_componentes'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    String fName
    Boolean fActivo

    static constraints = {
        fIdempresa(nullable: true, max: 9999999999L)
        fName(size: 0..20)
        fActivo(nullable: true)
    }
    String toString() {

    }
}
