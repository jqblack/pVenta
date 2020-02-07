/**
 * The TsalidaInventario entity.
 *
 * @author    
 *
 *
 */

package manube_v2

class TsalidaInventario {
    static mapping = {
         table 't_salida_inventario'
         // version is set to false, because this isn't available by default for legacy databases
         version false
        id generator:'identity', column:'f_idrecord'

    }
    Long fIdempresa
    Long fIdconcepto
    Long fHechopor
    Long fNodocumento
    Date fFecha
    String fComentario

    static constraints = {
        fIdempresa(nullable: true, max: 9999999999L)
        fIdconcepto(nullable: true, max: 9999999999L)
        fHechopor(nullable: true, max: 9999999999L)
        fNodocumento(nullable: true, max: 9999999999L)
        fFecha(nullable: true)
        fComentario(size: 0..60)
    }
    String toString() {
    }
}
