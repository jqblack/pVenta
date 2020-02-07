/**
 * The TproductosComponentes entity.
 *
 * @author    
 *
 *
 */

package manube_v2

class TproductosComponentes {
    static mapping = {
         table 't_productos_componentes'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdproducto
    Long fIdcomponente
    Boolean fActivo
    Boolean fStandard

    static constraints = {
        fIdproducto(nullable: true, max: 9999999999L)
        fIdcomponente(nullable: true, max: 9999999999L)
        fActivo(nullable: true)
        fStandard()
    }
    String toString() {

    }
}
