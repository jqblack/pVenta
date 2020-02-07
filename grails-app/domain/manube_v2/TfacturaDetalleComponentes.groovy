/**
 * The TfacturaDetalleComponentes entity.
 *
 * @author    
 *
 *
 */
package manube_v2

class TfacturaDetalleComponentes {
    static mapping = {
         table 't_factura_detalle_componentes'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIddetalle
    Long fIngrediente
    Long fIdprodcutoComponente
    java.math.BigDecimal fCantidad
    Boolean fCobrable
    java.math.BigDecimal fMontoCobrar

    static constraints = {
        fIddetalle(nullable: true, max: 9999999999L)
        fIngrediente(nullable: true, max: 9999999999L)
        fIdprodcutoComponente(nullable: true, max: 9999999999L)
        fCantidad(nullable: true)
        fCobrable(nullable: true)
        fMontoCobrar(nullable: true)
    }
    String toString() {
    }
}
