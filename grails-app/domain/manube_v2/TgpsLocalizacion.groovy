/**
 * The TgpsLocalizacion entity.
 *
 * @author    
 *
 *
 */
package manube_v2
class TgpsLocalizacion {
    static mapping = {
         table 't_gps_localizacion'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    java.math.BigDecimal fLatitud
    java.math.BigDecimal fLongitud
    Long fIdmensajero
    String fDeviceid
    Date fFecha

    static constraints = {
        fIdempresa(nullable: true, max: 9999999999L)
        fLatitud(nullable: true)
        fLongitud(nullable: true)
        fIdmensajero(nullable: true, max: 9999999999L)
        fDeviceid(size: 0..15)
        fFecha(nullable: true)
    }
    String toString() {
    }
}
