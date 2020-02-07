/**
 * The Tareas entity.
 *
 * @author    
 *
 *
 */
package manube_v2
class Tareas {
    static mapping = {
         table 't_areas'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    String fNombreArea
    Long fTiempoCamarero

    static constraints = {
        fIdempresa(nullable: true, max: 9999999999L)
        fNombreArea(size: 1..20, blank: false)
        fTiempoCamarero(nullable: true, max: 9999999999L)
    }
    String toString() {
    }
}
