/**
 * The TentradaInventario entity.
 *
 * @author    
 *
 *
 */
package manube_v2
class TentradaInventario {
    static mapping = {
         table 't_entrada_inventario'
         // version is set to false, because this isn't available by default for legacy databases
         version false
        id generator:'identity', column:'f_idrecord'
    }

    Long fIdempresa
    Long fIdconcepto
    Long fHechopor
    Long fNodocumento
    String fTipo
    String fComentario
    Date fFecha
    Long fIdsuplidor

    static constraints = {

        fIdempresa(nullable: true, max: 9999999999L)
        fIdconcepto(nullable: true, max: 9999999999L)
        fHechopor(nullable: true, max: 9999999999L)
        fNodocumento(nullable: true, max: 9999999999L)
        fTipo(size: 0..10)
        fComentario(size: 0..60)
        fFecha(nullable: true)
        fIdsuplidor(nullable: true, max: 9999999999L)
    }
    String toString() {

    }
}
