/**
 * The Tpropiedades entity.
 *
 * @author    
 *
 *
 */
package manube_v2

class Tpropiedades {
    static mapping = {
         table 't_propiedades'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    String fDescripcion
    Long fIdcategoria
    Date fFecha

    static constraints = {
        fIdempresa(max: 9999999999L)
        fDescripcion()
        fIdcategoria(max: 9999999999L)
        fFecha(nullable: true)
    }
    String toString() {
    }
}
