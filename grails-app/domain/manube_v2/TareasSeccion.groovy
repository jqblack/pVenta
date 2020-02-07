/**
 * The TareasSeccion entity.
 *
 * @author    
 *
 *
 */

package manube_v2

class TareasSeccion {
    static mapping = {
         table 't_areas_seccion'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    String fDescripcion

    static constraints = {
        fIdempresa(nullable: true, max: 9999999999L)
        fDescripcion(size: 0..2147483640)
    }
    String toString() {
    }
}
