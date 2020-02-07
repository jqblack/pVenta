/**
 * The TprinterSession entity.
 *
 * @author    
 *
 *
 */
package manube_v2

class TprinterSession {
    static mapping = {
         table 't_printer_session'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    String fIdClientPrinter
    String tSeccion
    Date fFecha

    static constraints = {
        fIdClientPrinter(size: 0..15)
        tSeccion(size: 0..1)
        fFecha(nullable: true)
    }
    String toString() {

      }
}
