/**
 * The Tcamareros entity.
 *
 * @author    
 *
 *
 */
package manube_v2

class Tcamareros {
    static mapping = {
         table 't_camareros'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    String fNombre
    String fApellido
    String fDireccion
    java.math.BigDecimal fSueldo
    String fCedula
    Boolean fActivo
    Boolean fCamareroActivo
    Long fIdArea
    Long fIdUsuario
    Long fIdempresa

    static constraints = {
        fNombre(size: 0..20)
        fApellido(size: 0..80)
        fDireccion()
        fSueldo(nullable: true)
        fCedula(size: 0..15)
        fActivo(nullable: true)
        fCamareroActivo(nullable: true)
        fIdArea(nullable: true, max: 9999999999L)
        fIdUsuario(nullable: true, max: 9999999999L)
        fIdempresa(nullable: true, max: 9999999999L)
    }
    String toString() {
    }
}
