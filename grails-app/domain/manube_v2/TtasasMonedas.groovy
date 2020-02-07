/**
 * The TtasasMonedas entity.
 *
 * @author    
 *
 *
 */
package manube_v2

class TtasasMonedas {
    static mapping = {
         table 't_tasas_monedas'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    Date fFecha
    java.math.BigDecimal fTasa
    Long fMoneda

    static constraints = {
        fIdempresa(nullable: true, max: 9999999999L)
        fFecha()
        fTasa(nullable: true)
        fMoneda(nullable: true, max: 9999999999L)
    }
    String toString() {
    }
}
