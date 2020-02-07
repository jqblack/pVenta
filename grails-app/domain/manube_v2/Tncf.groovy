/**
 * The Tncf entity.
 *
 * @author    
 *
 *
 */
package manube_v2
class Tncf {
    static mapping = {
         table 't_ncf'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    String fDescripcion
    String fTipo
    Long fReorden
    Long fSecuenciaSolicitada
    Long fSecuencia
    Boolean fVisible
    Long fIdempresa
    Long fOrden
    Boolean fCobraItebis
    Date fFechaInicio
    Date fFechaFin
    Boolean fValidaFechaVigencia
    Boolean fValidaRnc

    static constraints = {
        fDescripcion(size: 0..100)
        fTipo(size: 0..30)
        fReorden(nullable: true, max: 9999999999L)
        fSecuenciaSolicitada(nullable: true, max: 9999999999L)
        fSecuencia(nullable: true, max: 9999999999L)
        fVisible(nullable: true)
        fIdempresa(nullable: true, max: 9999999999L)
        fOrden(nullable: true, max: 9999999999L)
        fCobraItebis(nullable: true)
        fFechaInicio(nullable: true)
        fFechaFin(nullable: true)
        fValidaFechaVigencia(nullable: true)
        fValidaRnc(nullable: true)
    }
    String toString() {
    }
}
