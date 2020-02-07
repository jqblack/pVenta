package manube_v2
class TproductosPrecios {
    static mapping = {
         table 't_productos_precios'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdproducto
    Long fIdarea
    Long fDia
    BigDecimal fPrecio
    String fComentario
    Boolean fDoble
    Boolean fPrecioActivo
    Long fHoraInicio
    Long fHoraFin
    Long fIdempresa

    static constraints = {
        fIdproducto(nullable: true, max: 9999999999L)
        fIdarea(nullable: true, max: 9999999999L)
        fDia(nullable: true, max: 9999999999L)
        fPrecio(nullable: true)
        fComentario(size: 0..50,nullable: true)
        fDoble(nullable: true)
        fPrecioActivo(nullable: true)
        fHoraInicio(nullable: true, max: 9999999999L)
        fHoraFin(nullable: true, max: 9999999999L)
        fIdempresa(nullable: true, max: 9999999999L)
    }
    String toString() {
    }
}
