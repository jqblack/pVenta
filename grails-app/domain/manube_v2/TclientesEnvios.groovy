/**
 * The TclientesEnvios entity.
 *
 * @author    
 *
 *
 */
package manube_v2
class TclientesEnvios {
    static mapping = {
         table 'envios.t_clientes_envios'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    String fTelefono
    String fNombre
    Date fFecha
    String fSector
    String fDireccion
    Long fIdoriginal
    String fEmail
    Long fIdusuarioMovil

    static constraints = {
        fIdempresa(nullable: true, max: 9999999999L)
        fTelefono(size: 0..12)
        fNombre(size: 0..30)
        fFecha(nullable: true)
        fSector(size: 0..20)
        fDireccion()
        fIdoriginal(nullable: true, max: 9999999999L)
        fEmail(size: 0..200)
        fIdusuarioMovil(nullable: true, max: 9999999999L)
    }
    String toString() {
    }
}
