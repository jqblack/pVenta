/**
 * The Tproductos entity.
 *
 * @author  Julio J. Capellan  
 *
 *
 */

package manube_v2
class Tproductos {
    static mapping = {
         table 't_productos'

        fPrecioDelivery column: 'f_precio_delivery'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    String fReferencia
    String fDescripcion
    Boolean fControlinventario
    Long fIdcategoria
    BigDecimal fReorden
    BigDecimal fMaxdescuento
    BigDecimal fPrecio
    BigDecimal fUltimocosto
    BigDecimal fLimiteminimo
    BigDecimal fLimitemaximo
    BigDecimal fExistencia
    BigDecimal fTax
    Date fFecha
    BigDecimal fMakeup
    BigDecimal fUltimocosto1
    BigDecimal fUltimocosto2
    Date fFechaVencimiento
    Long fIdlocalizacion
    Boolean fKit
    Boolean fDescontinuado
    String fMensaje
    Long fIdunidad
    Boolean fPlato
    Boolean fReceta
    BigDecimal fTragos
    BigDecimal fPrecioDelivery
    Boolean fVentasDecimales
    Boolean fImprimeIngrediente
    Boolean fComanda

    static constraints = {
        fIdempresa(nullable: false)
        fReferencia(nullable: false,size: 0..30,blank: false)
        fDescripcion(nullable: false, size: 0..60, blank: false)
        fControlinventario(nullable: true)
        fIdcategoria(nullable: false)
        fReorden(nullable: false)
        fMaxdescuento(nullable: false)
        fPrecio(nullable: false)
        fPrecioDelivery(nullable: false)
        fUltimocosto(nullable: true)
        fLimiteminimo(nullable: false)
        fLimitemaximo(nullable: false)
        fExistencia(nullable: true)
        fTax(nullable: false)
        fFecha(nullable: true)
        fMakeup(nullable: false)
        fUltimocosto1(nullable: true)
        fUltimocosto2(nullable: true)
        fFechaVencimiento(nullable: false)
        fIdlocalizacion(nullable: false)
        fKit(nullable: true)
        fDescontinuado(nullable: true)
        fMensaje(nullable: true)
        fIdunidad(nullable: false)
        fPlato(nullable: true)
        fReceta(nullable: true)
        fComanda(nullable: true)
        fTragos(nullable: true)
        fVentasDecimales(nullable: true)
        fImprimeIngrediente(nullable: true)
    }
    String toString() {
    }
}
