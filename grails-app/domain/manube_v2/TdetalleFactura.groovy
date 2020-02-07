/**
 * The TdetalleFactura entity.
 *
 * @author    
 *
 *
 */
package manube_v2
class TdetalleFactura {
    static mapping = {
         table 't_detalle_factura'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdfactura
    Long fIdproducto
    String fReferencia
    java.math.BigDecimal fCantidad
    java.math.BigDecimal fItebis
    java.math.BigDecimal fPrecio
    Long fIdempresa
    Boolean fComanda
    Long fIdcomanda
    Boolean fMovil

    static constraints = {
        fIdfactura(nullable: true, max: 9999999999L)
        fIdproducto(nullable: true, max: 9999999999L)
        fReferencia(size: 0..2147483646)
        fCantidad(nullable: true)
        fItebis(nullable: true)
        fPrecio(nullable: true)
        fIdempresa(nullable: true, max: 9999999999L)
        fComanda(nullable: true)
        fIdcomanda(nullable: true, max: 9999999999L)
        fMovil(nullable: true)
    }

}
