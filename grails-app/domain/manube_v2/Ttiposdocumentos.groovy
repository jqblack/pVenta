/**
 * The Ttiposdocumentos entity.
 *
 * @author    
 *
 *
 */
package manube_v2

class Ttiposdocumentos {
    static mapping = {
         table 't_tiposdocumentos'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    String fTipodoc
    String fDescripcionTipo
    Long fIdempresa
    Long fIdordenador

    static constraints = {
        fTipodoc(size: 0..10)
        fDescripcionTipo(size: 0..30)
        fIdempresa(nullable: true, max: 9999999999L)
        fIdordenador(nullable: true, max: 9999999999L)
    }
    String toString() {
    }
}
