package manube_v2
class TproductosReceta {
    static mapping = {
         table 't_productos_receta'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdproducto
    Long fIdproductocomponente
    java.math.BigDecimal fCantidad

    static constraints = {
        fIdproducto(max: 9999999999L)
        fIdproductocomponente(max: 9999999999L)
        fCantidad(nullable: true)
    }
    String toString() {
    }
}
