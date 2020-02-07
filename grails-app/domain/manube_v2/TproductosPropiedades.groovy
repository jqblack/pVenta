/**
 * The TproductosPropiedades entity.
 *
 * @author    
 *
 *
 */

package manube_v2

class TproductosPropiedades {
    static mapping = {
         table 't_productos_propiedades'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idredord'
    }
    Long fIdempresa
    Long fIdpropiedad
    Long fIdproducto

    static constraints = {
        fIdempresa(max: 9999999999L)
        fIdpropiedad(max: 9999999999L)
        fIdproducto(max: 9999999999L)
    }
    String toString() {
    }
}
