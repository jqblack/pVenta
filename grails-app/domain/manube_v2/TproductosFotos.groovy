package manube_v2

class TproductosFotos {
    static mapping = {
         table 't_productos_fotos'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdproducto
    byte[] fFoto
    Boolean fMenu
    Long fIdempresa
    String fNombre

    static constraints = {
        fIdproducto(nullable: true, max: 9999999999L)
        fFoto(nullable: true)
        fMenu(nullable: true)
        fIdempresa(nullable: true, max: 9999999999L)
        fNombre(size: 0..100)
    }
    String toString() {

    }
}
