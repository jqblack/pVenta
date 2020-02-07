
package manube_v2;

class TprintersNodo {
    static mapping = {
         table 't_printers_nodo'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Long fIdempresa
    Long fIdsucursal
    String fUsuario
    String fPass
    Long fTipoimpresion
    Boolean fActivo
    Long fTipodevice
    String fPrinter

    static constraints = {
        fIdempresa(max: 9999999999L)
        fIdsucursal(max: 9999999999L)
        fUsuario(size: 1..32, blank: false)
        fPass(size: 1..32, blank: false)
        fTipoimpresion(max: 9999999999L)
        fActivo(nullable: true)
        fTipodevice(max: 9999999999L)
        fPrinter(size: 0..100)
    }
    String toString() {
    }
}
