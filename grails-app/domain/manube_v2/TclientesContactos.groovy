/**
 * The TclientesContactos entity.
 *
 * @author    
 *
 *
 */
package manube_v2
class TclientesContactos {
    static mapping = {
         table 't_clientes_contactos'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdcliente
    Long fIdtipo
    String fContacto
    Long fIdempresa

    static constraints = {
        fIdcliente(nullable: true, max: 9999999999L)
        fIdtipo(nullable: true, max: 9999999999L)
        fContacto(size: 0..80)
        fIdempresa(nullable: true, max: 9999999999L)
    }
    String toString() {
    }
}
