/**
 * The TproductosComOpciones entity.
 *
 * @author    
 *
 *
 */
package manube_v2
class TproductosComOpciones {
    static mapping = {
         table 't_productos_com_opciones'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdcomponente
    Long fIdproducto
    Boolean fActivo
    Boolean fStandard
    BigDecimal fQty
    Long fIdproductoComponente

    static constraints = {
        fIdcomponente(max: 9999999999L)
        fIdproducto(max: 9999999999L)
        fActivo(nullable: true)
        fStandard()
        fQty()
        fIdproductoComponente(nullable: true, max: 9999999999L)
    }
    String toString() {
    }
}
