/**
 * The TfacturaEmpresa entity.
 *
 * @author    
 *
 *
 */
package manube_v2

class TfacturaEmpresa {
    static mapping = {
         table 't_factura_empresa'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    String fTipo
    Long fNumeroFactura
    Long fIdempresa
    Date fFecha
    java.math.BigDecimal fMontoTotal
    String fNcf
    java.math.BigDecimal fDescuento
    java.math.BigDecimal fTax
    Long fTotalOrdenes
    Long fHechoPor
    Boolean fCancelada
    Boolean fPagado
    String fPeriodo
    Long fIdcompania
    java.math.BigDecimal fBalance

    static constraints = {
        fTipo(size: 0..10)
        fNumeroFactura(nullable: true, max: 9999999999L)
        fIdempresa(nullable: true, max: 9999999999L)
        fFecha(nullable: true)
        fMontoTotal(nullable: true)
        fNcf(size: 0..50)
        fDescuento(nullable: true)
        fTax(nullable: true)
        fTotalOrdenes(nullable: true, max: 9999999999L)
        fHechoPor(nullable: true, max: 9999999999L)
        fCancelada(nullable: true)
        fPagado(nullable: true)
        fPeriodo(size: 0..30)
        fIdcompania(nullable: true, max: 9999999999L)
        fBalance(nullable: true)
    }
    String toString() {
    }
}
