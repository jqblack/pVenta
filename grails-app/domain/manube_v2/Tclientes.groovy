package manube_v2
class Tclientes {
    static mapping = {
         table 't_clientes'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    Long fDiasCredito
    String fNombre
    String fApellido
    String fDireccion
    Long fIdcompania
    String fCodigoCliente
    java.math.BigDecimal fLimiteCreditoCompania
    java.math.BigDecimal fLimiteCredito
    java.math.BigDecimal fBalance
    Boolean fTieneCredito
    Boolean fEmpresa
    Date fFecha
    String fCedula
    String fPassword
    Boolean fAccesoweb
    String fEmailPrincipal
    String fUsuario
    String fTelefono
    Date fFechaNacimiento

    static constraints = {
        fIdempresa(max: 9999999999L)
        fDiasCredito(nullable: true, max: 9999999999L)
        fNombre(size: 0..20)
        fApellido(size: 0..20)
        fDireccion()
        fTelefono(nullable: true)
        fIdcompania(nullable: true, max: 9999999999L)
        fCodigoCliente(size: 0..10)
        fLimiteCreditoCompania(nullable: true)
        fLimiteCredito(nullable: true)
        fBalance(nullable: true)
        fTieneCredito(nullable: true)
        fEmpresa(nullable: true)
        fFecha()
        fCedula(size: 0..12)
        fPassword(size: 0..50)
        fAccesoweb(nullable: true)
        fEmailPrincipal(size: 0..80)
        fUsuario(size: 0..20)
        fFechaNacimiento(nullable: true)
    }
    String toString() {

    }
}
