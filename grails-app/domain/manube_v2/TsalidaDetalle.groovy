/**
 * The TsalidaDetalle entity.
 *
 * @author    
 *
 *
 */
package manube_v2

class TsalidaDetalle {
    static mapping = {
         table 't_salida_detalle'
         // version is set to false, because this isn't available by default for legacy databases
         version false
        id generator:'identity', column:'f_idrecord'

    }
    Long fIdsalida
    java.math.BigDecimal fPrecio
    java.math.BigDecimal fCantidad
    Long fIdproducto
    java.math.BigDecimal fCosto
    Date fFecha

    static constraints = {
        fIdsalida(nullable: true, max: 9999999999L)
        fPrecio(nullable: true)
        fCantidad(nullable: true)
        fIdproducto(nullable: true, max: 9999999999L)
        fCosto(nullable: true)
        fFecha(nullable: true)
    }
    String toString() {
    }
}
