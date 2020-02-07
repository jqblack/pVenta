package manube_v2

class Tusuarios {

    static mapping = {
         table 't_usuarios'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    Integer fTipoUsuarioPuntoVenta
    String fUsername
    String fPassword
    Boolean fActivo
    Long fIdidioma
    String fNombre
    String fApellido
    Boolean fCambioPrecio
    Boolean fAbrirCaja
    Boolean fDescuento
    Boolean fFacturaCredito
    Boolean fCuadre
    Boolean fEstadoCaja
    Boolean fFacturaOficial
    Boolean fAnularLinea
    Boolean fRecibo
    Boolean fPorcientoLey
    Boolean fActivarPedidos
    Boolean fTaxfree
    String fEmail
    String fTelefono
    Boolean fAnularFactura



    static constraints = {
        fIdempresa(nullable: true, max: 9999999999L)
        fUsername(size: 0..20)
        fPassword(size: 0..32)
        fActivo(nullable: true)
        fIdidioma(nullable: true, max: 9999999999L)
        fNombre(size: 0..50)
        fApellido(size: 0..50)
        fCambioPrecio(nullable: true)
        fAbrirCaja(nullable: true)
        fDescuento(nullable: true)
        fFacturaCredito(nullable: true)
        fCuadre(nullable: true)
        fEstadoCaja(nullable: true)
        fFacturaOficial(nullable: true)
        fAnularLinea(nullable: true)
        fRecibo(nullable: true)
        fPorcientoLey(nullable: true)
        fActivarPedidos(nullable: true)
        fTaxfree(nullable: true)
        fEmail(size: 0..50)
        fTelefono(size: 0..15)
        fAnularFactura(nullable: true)
    }
    String toString() {

    }
}
