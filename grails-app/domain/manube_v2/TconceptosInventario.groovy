/**
 * The TconceptosInventario entity.
 *
 * @author    
 *
 *
 */
package manube_v2
class TconceptosInventario {
    static mapping = {
         table 't_conceptos_inventario'
         // version is set to false, because this isn't available by default for legacy databases
         version false
        id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    String fDescripcion
    Boolean fEntrada
    Long fHechopor

    static constraints = {
        fIdempresa(nullable: true, max: 9999999999L)
        fDescripcion(size: 0..60)
        fEntrada(nullable: true)
        fHechopor(nullable: true, max: 9999999999L)
    }
    String toString() {

    }
}
