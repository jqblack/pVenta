/**
 * The Tzonas entity.
 *
 * @author    
 *
 *
 */
package manube_v2
class Tzonas {
    static mapping = {
         table 'envios.t_zonas'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    String fNombreZona

    static constraints = {
        fIdempresa(nullable: true, max: 9999999999L)
        fNombreZona(size: 0..30)
    }
    String toString() {
    }
}
