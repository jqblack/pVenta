/**
 * The Tfacturas entity.
 *
 * @author    
 *
 *
 */
package manube_v2

class Tfacturas {
    static mapping = {
         table 't_facturas'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fNumeroFactura
    Long fNumeroOrden
    String fTipoDocumentoFactura
    Long fIdempresa
    Long fIdcliente
    Date fFechaRegstroOrden
    Date fFechaRegistroFactura
    Long fHechoPor
    Long fFacturadoPor
    java.math.BigDecimal fDescuento
    java.math.BigDecimal fSubtotal
    java.math.BigDecimal fItebis
    java.math.BigDecimal fTotal
    Long fTipoNcf
    String fNumeroNcf
    Long fModificadoPor
    Boolean fCancelada
    Boolean fFacturada
    java.math.BigDecimal fTotalExtra
    Long fIdcompania
    Boolean fEnviada
    String fObservacion
    Boolean fFacturar
    java.math.BigDecimal fPorcientoLey
    Long fModulo
    Long fMesa
    Long fCamarero
    Boolean fFacturaAbierta
    Boolean fAnulada
    Boolean fPagada
    java.math.BigDecimal fDevuelta
    java.math.BigDecimal fMontoEfectivo
    java.math.BigDecimal fBalancePendiente
    String fCuenta
    Boolean fAsignada
    Long fMensajero
    Boolean fRecibido
    String fWholenumCliente
    String fDireccionEnvio
    String fRnc
    String fRazonSocial

    static constraints = {
        fNumeroFactura(nullable: true, max: 9999999999L)
        fNumeroOrden(nullable: true, max: 9999999999L)
        fTipoDocumentoFactura(nullable:true, size: 0..10)
        fIdempresa(nullable: true, max: 9999999999L)
        fIdcliente(nullable: true, max: 9999999999L)
        fFechaRegstroOrden(nullable: true)
        fFechaRegistroFactura(nullable: true)
        fHechoPor(nullable: true, max: 9999999999L)
        fFacturadoPor(nullable: true, max: 9999999999L)
        fDescuento(nullable: true)
        fSubtotal(nullable: true)
        fItebis(nullable: true)
        fTotal(nullable: true)
        fTipoNcf(nullable: true, max: 9999999999L)
        fNumeroNcf(nullable: true,size: 0..50)
        fModificadoPor(nullable: true, max: 9999999999L)
        fCancelada(nullable: true)
        fFacturada(nullable: true)
        fTotalExtra(nullable: true)
        fIdcompania(nullable: true, max: 9999999999L)
        fEnviada(nullable: true)
        fObservacion(nullable: true)
        fFacturar(nullable: true)
        fPorcientoLey(nullable: true)
        fModulo(nullable: true, max: 9999999999L)
        fMesa(nullable: true, max: 9999999999L)
        fCamarero(nullable: true, max: 9999999999L)
        fFacturaAbierta(nullable: true)
        fAnulada(nullable: true)
        fPagada(nullable: true)
        fDevuelta(nullable: true)
        fMontoEfectivo(nullable: true)
        fBalancePendiente(nullable: true)
        fCuenta(size: 0..300)
        fAsignada(nullable: true)
        fMensajero(nullable: true, max: 9999999999L)
        fRecibido(nullable: true)
        fWholenumCliente(nullable: true)
        fDireccionEnvio(nullable: true)
        fRnc(nullable: true)
        fRazonSocial(nullable: true)
    }
    String toString() {
        return "${fIdrecord}" 
    }
}
