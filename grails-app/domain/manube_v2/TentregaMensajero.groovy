/**
 * The TentregaMensajero entity.
 *
 * @author    
 *
 *
 */
package manube_v2
class TentregaMensajero {
    static mapping = {
         table 'envios.t_entrega_mensajero'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdfactura
    Long fIdmensajero
    java.math.BigDecimal fMontoRecibir
    Date fFecha
    java.math.BigDecimal fMontoRecibido
    Long fHechoPor
    Boolean fAnulado
    Date fHoraAnulacion
    Long fIdempresa

    static constraints = {
        fIdfactura(nullable: true, max: 9999999999L)
        fIdmensajero(nullable: true, max: 9999999999L)
        fMontoRecibir(nullable: true)
        fFecha(nullable: true)
        fMontoRecibido(nullable: true)
        fHechoPor(nullable: true, max: 9999999999L)
        fAnulado(nullable: true)
        fHoraAnulacion(nullable: true)
        fIdempresa(nullable: true, max: 9999999999L)
    }
    String toString() {
    }
}
