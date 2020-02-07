/**
 * The TtipoBillete entity.
 *
 * @author    
 *
 *
 */
package manube_v2

class TtipoBillete {
    static mapping = {
         table 't_tipo_billete'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    String fDescripcion
    java.math.BigDecimal fValor
    Long fIdtipoMoneda

    static constraints = {
        fDescripcion(size: 0..30)
        fValor(nullable: true)
        fIdtipoMoneda(nullable: true, max: 9999999999L)

    }
    String toString() {
    }
}
