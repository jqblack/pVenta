/**
 * The TzonasSectores entity.
 *
 * @author    
 *
 *
 */
package manube_v2
class TzonasSectores {
    static mapping = {
         table 'envios.t_zonas_sectores'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdzona
    String fSector

    static constraints = {
        fIdzona(max: 9999999999L)
        fSector(size: 0..20)
    }
    String toString() {
    }
}
