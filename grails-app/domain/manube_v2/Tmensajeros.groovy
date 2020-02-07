/**
 * The Tmensajeros entity.
 *
 * @author    
 *
 *
 */
package manube_v2
class Tmensajeros {
    static mapping = {
         table 'envios.t_mensajeros'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    String fNombre
    String fTelefono
    String fEmail
    String fDeviceid
    Long fZona

    static constraints = {
        fIdempresa(nullable: true, max: 9999999999L)
        fNombre(size: 0..30)
        fTelefono(size: 0..12)
        fEmail(size: 0..80)
        fDeviceid(size: 0..15)
        fZona(nullable: true, max: 9999999999L)
    }
    String toString() {
    }
}
