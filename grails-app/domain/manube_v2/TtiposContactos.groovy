/**
 * The TtiposContactos entity.
 *
 * @author    
 *
 *
 */
package manube_v2
class TtiposContactos {
    static mapping = {
         table 't_tipos_contactos'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    String fContacto

    static constraints = {
        fIdempresa(nullable: true, max: 9999999999L)
        fContacto(size: 0..20)
    }
    String toString() {
    }
}
