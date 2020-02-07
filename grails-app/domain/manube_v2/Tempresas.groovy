/**
 * The Tempresas entity.
 *
 * @author    
 *
 *
 */
package manube_v2

class Tempresas {
    static mapping = {
         table 'cfg.t_empresas'
        fHorario1 column: 'f_horario_1'
        fHorario2 column: 'f_horario_2'
        fHorario3 column: 'f_horario_3'
        fHorario4 column: 'f_horario_4'
        fHorario5 column: 'f_horario_5'
        fHorario6 column: 'f_horario_6'
        fHorario7 column: 'f_horario_7'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    String fNombre
    String fHeader
    String fWeb
    String fHeaderFacturasPequenas
    String fMensajeFactura
    String fMensajeOrden
    java.math.BigDecimal fPorcientoLey
    Long fTipoPapelImpresion
    byte[] fFoto
    Boolean fImpuestoIncluido
    Boolean fImpresionDetalleFactura
    Boolean fCobrarPorcientoLey
    Boolean fRecibirPedidosApp
    String fLatitud
    String fLongitud
    java.math.BigDecimal fDistanciaDelibery
    java.math.BigDecimal fPrecioEnvio
    String fTelefono
    String fTipoNegocio
    BigDecimal fPedidosMinimos
    String fEmail
    String fDireccion
    String fHorario1
    String fHorario2
    String fHorario3
    String fHorario4
    String fHorario5
    String fHorario6
    String fHorario7
    String fLema
    Date fFechaInicioOperaciones
    Long fNcfDefectoDelivery

    static constraints = {
        fNombre(size: 0..40)
        fHeader(size: 0..3000)
        fWeb(size: 0..50)
        fHeaderFacturasPequenas(size: 0..3000)
        fMensajeFactura(size: 0..3000)
        fMensajeOrden(size: 0..3000)
        fPorcientoLey(nullable: true)
        fTipoPapelImpresion(nullable: true, max: 9999999999L)
        fFoto(nullable: true)
        fImpuestoIncluido(nullable: true)
        fImpresionDetalleFactura(nullable: true)
        fCobrarPorcientoLey(nullable: true)
        fRecibirPedidosApp(nullable: true)
        fLatitud(nullable: true)
        fLongitud(nullable: true)
        fDistanciaDelibery(nullable: true)
        fPrecioEnvio(nullable: true)
        fTelefono(size: 0..16)
        fTipoNegocio(nullable: true)
        fPedidosMinimos(nullable: true)
        fEmail(nullable: true)
        fDireccion(nullable: true)
        fHorario1(nullable: true)
        fHorario2(nullable: true)
        fHorario3(nullable: true)
        fHorario4(nullable: true)
        fHorario5(nullable: true)
        fHorario6(nullable: true)
        fHorario7(nullable: true)
        fLema(nullable: true)
        fFechaInicioOperaciones(nullable: true)
        fNcfDefectoDelivery(max: 9999999999L)
    }
    String toString() {
    }
}
