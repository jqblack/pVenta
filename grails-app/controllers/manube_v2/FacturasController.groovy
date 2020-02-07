package manube_v2

import grails.converters.JSON

class FacturasController {
    FuncionesSQLService funcionesSQLService
    ValidacionesService validacionesService

    def index() {
        def ncf
        def sectores
        def sql = "from Tzonas z inner join TzonasSectores s ON z.id = s.fIdzona WHERE z.fIdempresa = :id"

        def preferencias = Tempresas.findById(session.user.fIdempresa)
        def comprobantes = Tncf.findAllByFIdempresa(session.user.fIdempresa)
        //def preferencias = Tempresas.findById(2)

        ncf = Tncf.findAllByFIdempresa(session.user.fIdempresa)

        sectores = TzonasSectores.findAll(sql, [id: session.user.fIdempresa])
        render (view: 'index', model:[preferencias: preferencias, comprobantes: comprobantes, sectores:sectores])
    }

    def validarVigenciaNcf() {

        Map<String, Object> data = new HashMap<String, Object>()
        data.put("isvalid", validacionesService.ValidarVigenciaNcf(params.idncf as Long, session.user.fIdempresa))
        data.put("validar_rnc", validacionesService.ValidarNCFConRNC(params.idncf as Long, session.user.fIdempresa))
        render data as JSON
    }

    def validarRNC() {

        Map<String, Object> data = new HashMap<String, Object>()
        def isvalid = true

        data.put("data", validacionesService.validarRNC(params.rnc.toString()))

        if (data.data.toString().equals("Rnc o Cedula no existe")) {
            isvalid = false
        }

        data.put("isvalid", isvalid)
        render data as JSON
    }

    def get_productos_by_categoria() {
        Map<String, Object> data = new HashMap<String, Object>()

        //data.put("data", Tproductos.findAllByFIdcategoriaAndFIdempresa(params.idcategoria, session.user.fIdempresa))
        data.put("data", funcionesSQLService.getProductosByCategoria(session.user.fIdempresa,params.idcategoria as Long))

        render data as JSON
    }

    def get_producto_by_id() {
        Map<String, Object> data = new HashMap<String, Object>()

        //data.put("data", Tproductos.findAllByFIdcategoriaAndFIdempresa(params.idcategoria, session.user.fIdempresa))
        data.put("producto", funcionesSQLService.getProductosById(params.id as Long, session.user.fIdempresa))
        //println data
        render data as JSON
    }

    def get_productos_by_reference_or_descripcion() {
        Map<String, Object> data = new HashMap<String, Object>()
        data.put("data", funcionesSQLService.getProductoByReferenceOrDescripcion(params.filtro.toString(), session.user.fIdempresa))
        render data as JSON
    }
    def get_cliente_by_telefono() {
        Map<String, Object> data = new HashMap<String, Object>()
        data.put("data", funcionesSQLService.getListaDireccioneCliente(params.filtro.toString(), session.user.fIdempresa))
        render data as JSON
    }

    def store() {
        Map<String, Object> response_data = new HashMap<String, Object>()
        response_data.put("is_printer_conected", false)
        response_data.put("success", false)
        response_data.put("errors", [])

        def data = JSON.parse(params.data)

        List errorValidacion
        errorValidacion = validacionesService.validarDetalleDelivery(data.detalle)


        if (errorValidacion.size() > 0)
        {
            response_data.errors = errorValidacion
            render response_data as JSON
            return
        }

        errorValidacion = validacionesService.validarOrdenesConRNC(data)

        if (errorValidacion.size() > 0)
        {
            response_data.errors = errorValidacion
            render response_data as JSON
            return
        }

        def factura = funcionesSQLService.guardarFacturaDelivery(data, session.user.fIdempresa, session.user.id)

        if(factura) {

            //LOGICA PARA IMPRIMIR LA FACTURA
            //
//            String stringFactura = ""
//            String tipo_printer = "1"
//            String accion = ""
//            String json = ""
//            String xsession = session.idnodo.toString()
//            Funciones utilidades = new Funciones()
//
//
//            List resultado
//
//            resultado = funcionesSQLService.ListarFacturadDeliveryReimprimirById(
//                    session.user.fIdempresa.toString(),
//                    factura.id.toString(),
//                    true
//            )
//
//            //response_data.put("data", resultado[0])
//            //render response_data as JSON
//            //json = [f_data:resultado[0]] as JSON
//            stringFactura = utilidades.GenerarStringFacturaImprimirTermica(resultado, tipo_printer, accion)
//            //println resultado[0].toString()
//
//            ServerPrinterNodo.enviar(stringFactura, session.idnodo.toString())
            response_data.success = true
            render response_data as JSON
        }
        else{
            response_data.success = false
            render response_data as JSON
        }
    }



    def agregarDireccion() {
        Map<String, Object> response_data = new HashMap<String, Object>()
        response_data.put("success", false)
        response_data.put("data", null)

        def data = JSON.parse(params.data)

        List errorValidacion
        errorValidacion = validacionesService.validarDireccionDelivery(data)


        if (errorValidacion.size() > 0)
        {
            response_data.put("errors", errorValidacion)
            render response_data as JSON
            return
        }

        def item = funcionesSQLService.guardarDireccion(data, session.user.fIdempresa, session.user.id)

        if(item) {

            response_data.data = item
            response_data.success = true
            render response_data as JSON
        }
        else{
            response_data.success = false
            render response_data as JSON
        }
    }
}
