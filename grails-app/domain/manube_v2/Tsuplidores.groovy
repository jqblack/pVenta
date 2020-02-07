/**
 * The Tsuplidores entity.
 *
 * @author    
 *
 *
 */

package manube_v2

class Tsuplidores {
    static mapping = {
         table 't_suplidores'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    Long fId
    String fNombre
    String fVendedor
    String fDireccion
    String fFax
    String fTelefono
    String fEmail
    String fRnc
    BigDecimal fBalance
    String fPais
    String fWeb
    String fCuentaContable
    Boolean fEsFormal
    String fNit
    String fRif
    Long fTipoMoneda
    Long fTipoSuplidor
    Long fZona
    String fDireccionEnvio
    String fFormaEnvio
    BigDecimal fPorcentajeRetencion
    String fReferencia
    Long fIdComprador
    Long fTiempoEntrega
    Date fFechaIngreso
    String fTipoNegociacion

    static constraints = {
        fIdempresa(nullable: true, max: 9999999999L)
        fId(nullable: true, max: 9999999999L)
        fNombre(size: 0..60)
        fVendedor(size: 0..60)
        fDireccion(size: 0..2147483640)
        fFax(size: 0..20)
        fTelefono(size: 0..15)
        fEmail(size: 0..80)
        fRnc(size: 0..20)
        fBalance(nullable: true)
        fPais(size: 0..30)
        fWeb(size: 0..100)
        fCuentaContable(size: 0..2147483640)
        fEsFormal(nullable: true)
        fNit(size: 0..25)
        fRif(size: 0..25)
        fTipoMoneda(nullable: true, max: 9999999999L)
        fTipoSuplidor(nullable: true, max: 9999999999L)
        fZona(nullable: true, max: 9999999999L)
        fDireccionEnvio(size: 0..2147483640)
        fFormaEnvio(size: 0..2147483640)
        fPorcentajeRetencion(nullable: true)
        fReferencia(size: 0..25)
        fIdComprador(nullable: true, max: 9999999999L)
        fTiempoEntrega(nullable: true, max: 9999999999L)
        fFechaIngreso(nullable: true)
        fTipoNegociacion(size: 0..30)
    }
    String toString() {
    }
}
