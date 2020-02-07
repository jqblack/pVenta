/**
 * The TfacturasImpresionPendiente entity.
 *
 * @author    
 *
 *
 */
package manube_v2
class TfacturasImpresionPendiente {
    static mapping = {
         table 't_facturas_impresion_pendiente'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    String fIdsession
    String fFactura
    Date fFecha
    Long fIdempresa

    static constraints = {
        fIdsession(size: 0..15)
        fFactura()
        fFecha(nullable: true)
        fIdempresa(nullable: true, max: 9999999999L)
    }
    String toString() {
    }
}
