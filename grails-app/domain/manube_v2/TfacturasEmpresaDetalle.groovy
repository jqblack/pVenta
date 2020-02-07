/**
 * The TfacturasEmpresaDetalle entity.
 *
 * @author    
 *
 *
 */
package manube_v2

class TfacturasEmpresaDetalle {
    static mapping = {
         table 't_facturas_empresa_detalle'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdfacturaEmpresa
    Long fIdorden

    static constraints = {
        fIdfacturaEmpresa(nullable: true, max: 9999999999L)
        fIdorden(nullable: true, max: 9999999999L)
    }
    String toString() {
    }
}
