/**
 * The Tmesas entity.
 *
 * @author    
 *
 *
 */
package manube_v2

class Tmesas {
    static mapping = {
         table 't_mesas'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    String fDescripcion
    Long fIdArea
    Long fIdSeccion
    Long fCubiertos
    Long fIdempresa

    static constraints = {
        fDescripcion(size: 1..30, blank: false)
        fIdArea(max: 9999999999L)
        fIdSeccion(max: 9999999999L)
        fCubiertos(max: 9999999999L)
        fIdempresa(nullable: true, max: 9999999999L)
    }
    String toString() {
    }
}
