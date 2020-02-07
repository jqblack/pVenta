package manube_v2
class TproductosCategorias {
    static mapping = {
         table 't_productos_categorias'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    String fDescripcion
    Long fOrden

    static constraints = {
        fIdempresa(nullable: true, max: 9999999999L)
        fDescripcion(size: 0..20)
        fOrden(nullable: true, max: 9999999999L)
    }
    String toString() {
    }
}
