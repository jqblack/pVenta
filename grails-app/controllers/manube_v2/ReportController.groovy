package manube_v2

import grails.converters.JSON

class ReportController {

    FuncionesSQLService funcionesSQLService
    ReportService reportService

    def index() { }

    def ventas_contado() {  }

    def ventas_credito() {  }

    def diez_mas_vendidos() {  }

    def diez_menos_vendidos() {  }

    def vendidos_por_utilidad() {  }

    def facturas_mensajeros() {  }

    def reporte_cuadre_general() {  }

    def reporte_cuadre_caja() {  }

    def productos_vendidos() {  }

    def vendidos_por_categoria() {
        def categorias = TproductosCategorias.findAllByFIdempresa(session.user.fIdempresa as Long)

        render (view: "vendidos_por_categoria", model: [categorias: categorias])
    }


    def generar() {

        def REPORTE_VENTAS_CONTADO = 1
        def REPORTE_VENTAS_CREDITO = 2
        def REPORTE_DIEZ_MAS_VENDIDOS = 3
        def REPORTE_DIEZ_MENOS_VENDIDOS = 4
        def REPORTE_VENDIDOS_POR_CATEGORIA = 5
        def REPORTE_VENTAS_UTILIDAD = 6
        def REPORTE_FACTURAS_MENSAJEROS = 7
        def REPORTE_PRODUCTOS_VENDIDOS = 8
        //def reporte = 1
        def data
        def reportAsBase64 = ""

        Map<String, Object> response = new HashMap<String, Object>()

        data = JSON.parse(params.data)

        switch (data.report.toString().toInteger()) {
            case REPORTE_VENTAS_CONTADO: reportAsBase64 = reportService.getVentasContado(
                    session.user.fIdempresa,
                    session.user.fUsername,
                    data
            )
                break
            case REPORTE_VENTAS_CREDITO: reportAsBase64 = reportService.getVentasCredito(
                    session.user.fIdempresa,
                    session.user.fUsername,
                    data
            )
                break
            case REPORTE_DIEZ_MAS_VENDIDOS: reportAsBase64 = reportService.getDiezProductosMasVendidos(
                    session.user.fIdempresa,
                    session.user.fUsername,
                    data
            )
                break
            case REPORTE_DIEZ_MENOS_VENDIDOS: reportAsBase64 = reportService.getDiezProductosMenosVendidos(
                    session.user.fIdempresa,
                    session.user.fUsername,
                    data
            )
                break
            case REPORTE_VENDIDOS_POR_CATEGORIA: reportAsBase64 = reportService.getVendidosPorCategoria(
                    session.user.fIdempresa,
                    session.user.fUsername,
                    data
            )
                break
            case REPORTE_VENTAS_UTILIDAD: reportAsBase64 = reportService.getVentasPorProductosUtilidad(
                    session.user.fIdempresa,
                    session.user.fUsername,
                    data
            )
                break
            case REPORTE_FACTURAS_MENSAJEROS: reportAsBase64 = reportService.getFacturasMensajeros(
                    session.user.fIdempresa,
                    session.user.fUsername,
                    data
            )
            case REPORTE_PRODUCTOS_VENDIDOS: reportAsBase64 = reportService.getProductosVendidos(
                    session.user.fIdempresa,
                    session.user.fUsername,
                    data
            )
                break
                break
            default: break
        }

        response.put('reportAsBase64', reportAsBase64.toString())
        render response as JSON
    }

    def generarReporteCuadre() {

        Map<String, Object> response_data = new HashMap<String, Object>()
        //response_data.put("is_printer_conected", false)
        //response_data.put("success", true)
        //response_data.put("errors", [])
        response_data.put("data", [])
        def data = funcionesSQLService.generarReporteCuadreCaja(params.fechaInicio as Long, params.fechaFinal as Long,session.user.fIdempresa)
        response_data.data = data
        render response_data as JSON
    }

    def generarReporteCuadreGeneral() {

        Map<String, Object> response_data = new HashMap<String, Object>()
        //response_data.put("is_printer_conected", false)
        //response_data.put("success", true)
        //response_data.put("errors", [])
        response_data.put("data", [])
        def data = funcionesSQLService.generarReporteCuadreGeneral(params.fechaInicio as Long, params.fechaFinal as Long,session.user.fIdempresa)
        response_data.data = data
        render response_data as JSON
    }
}
