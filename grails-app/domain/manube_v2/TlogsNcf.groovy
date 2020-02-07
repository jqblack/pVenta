/**
 * The TlogsNcf entity.
 *
 * @author    
 *
 *
 */
package manube_v2
class TlogsNcf {
    static mapping = {
         table 't_logs_ncf'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    Date fFecha
    Long fTipoNcf
    Long fHechoPor
    Date fFechaInicio
    Date fFechaFinal
    Long fSecuenciaInicial
    Long fSecuenciaFinal
    Long fIdempresa
    Boolean fActivo

    static constraints = {
        fFecha(nullable: true)
        fTipoNcf(nullable: true, max: 9999999999L)
        fHechoPor(nullable: true, max: 9999999999L)
        fFechaInicio(nullable: true)
        fFechaFinal(nullable: true)
        fSecuenciaInicial(nullable: true, max: 9999999999L)
        fSecuenciaFinal(nullable: true, max: 9999999999L)
        fIdempresa(nullable: true, max: 9999999999L)
        fActivo(nullable: true)
    }
    String toString() {
    }
}
