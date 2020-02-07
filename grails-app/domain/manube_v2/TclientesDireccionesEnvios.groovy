/**
 * The TclientesDireccionesEnvios entity.
 *
 * @author    
 *
 *
 */
package manube_v2

class TclientesDireccionesEnvios {
    static mapping = {
         table 't_clientes_direcciones_envios'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    Long fIdcliente
    String fDireccion
    Boolean fDireccionPrincipal
    Date fFecha
    String fSector

    static constraints = {
        fIdempresa(nullable: true, max: 9999999999L)
        fIdcliente(nullable: true, max: 9999999999L)
        fDireccion()
        fDireccionPrincipal(nullable: true)
        fFecha(nullable: true)
        fSector(size: 0..50)
    }
    String toString() {
    }
}
