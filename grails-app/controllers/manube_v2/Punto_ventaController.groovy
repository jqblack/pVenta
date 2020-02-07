package manube_v2

import FuncionesGenerales.Funciones
import grails.converters.JSON
import grails.websocket.example.ServerPrinterNodo

import java.text.SimpleDateFormat

class Punto_ventaController {

    static allowedMethods = [
            generar_reporte_ventas_contado: "POST"
    ]

    FuncionesSQLService funcionesSQLService
    ValidacionesService validacionesService
    ReportService reportService
    SqlService sqlService
    HelperService helperService

    def index() {}

    def comandas() {}

//    def prueba_lista() {
//        List list  = [1,2,3,4,5,123];
//        list.findAll { it > 10 }
//        render list.findAll { it > 10 }.toString()
//    }


    def ventas_contado() {

    }

    def pedidos() {
        Tempresas emp = Tempresas.findById(session.user.fIdempresa)
        def configuracionesToPrint = funcionesSQLService.getOpcionesConfiguracionImpresion()

        render(view: 'pedidos', model: [fechaOperacion: emp.fFechaInicioOperaciones, configuracionesToPrint: configuracionesToPrint])
    }

    def cuadre_general() {

    }

    def cuadre_caja() {

    }

    def registrar_factura() {
        def configuracionesToPrint = funcionesSQLService.getOpcionesConfiguracionImpresion()
        def preferencias = Tempresas.findById(session.user.fIdempresa)
        def comprobantes = Tncf.findAllByFIdempresa(session.user.fIdempresa)
        def tarjetas = TtipoTarjeta.list()
        render(view: 'factura', model: [
                tarjetas              : tarjetas,
                preferencias          : preferencias,
                comprobantes          : comprobantes,
                fechaOperacion        : preferencias.fFechaInicioOperaciones,
                configuracionesToPrint: configuracionesToPrint
        ])
    }

    def generar_reporte_ventas_contado() {
        def data = JSON.parse(params.data)
        def resultado
        Map<String, Object> response_data = new HashMap<String, Object>()

        resultado = reportService.GetVentasContado(data.fecha_inicio, data.fecha_fin, session.user.id, session.user.fIdempresa)
        response_data.put("success", true)
        response_data.put("resultado", resultado)

        render response_data as JSON
    }

    def get_mensajeros() {
        Map<String, Object> response_data = new HashMap<String, Object>()

        response_data.put("data", Tmensajeros.findAllByFIdempresa(session.user.fIdempresa))

        render response_data as JSON
    }

    def getPedido() {
        List resultado
        List productos
        Map<String, Object> response_data = new HashMap<String, Object>()
        resultado = funcionesSQLService.getOrdeneOnCurrentDayByIdorden(params.idorden as Long)

//        println(resultado)

        if (resultado) {
            productos = funcionesSQLService.getOrdenDetalleByFacturaId(resultado[0].factura_id as Long)
            //resultado[0].put('productos',)

            productos.each { row ->
                //Map<String, Object> componentes = new HashMap<String, Object>()
                row.put('componentes', funcionesSQLService.getOrdenPropiedadesByDetalleId(row.detalle_id as Long))
                //row.add(componentes)
            }
            resultado[0].put('productos', productos)
            response_data.put("data", resultado[0])
            render response_data as JSON
        } else {
            response_data.put("success", false);
            render response_data as JSON
        }

    }

    def getFacturaCerrada() {
        List resultado
        List productos
        Map<String, Object> response_data = new HashMap<String, Object>()
        resultado = funcionesSQLService.getOrdenesCerradasByFacturaId(params.idorden as Long)

        if (resultado) {

            productos = funcionesSQLService.getOrdenDetalleByFacturaId(resultado[0].factura_id as Long)
            //resultado[0].put('productos',)

            productos.each { row ->
                //Map<String, Object> componentes = new HashMap<String, Object>()
                row.put('componentes', funcionesSQLService.getOrdenPropiedadesByDetalleId(row.detalle_id as Long))
                //row.add(componentes)
            }
            resultado[0].put('productos', productos)
            response_data.put("data", resultado[0])
            render response_data as JSON
        } else {
            response_data.put("success", false);
            render response_data as JSON
        }

    }

    def getComandas() {
        List resultado
        Map<String, Object> response_data = new HashMap<String, Object>()
        Map<String, Object> productos
        List comandasEnPantalla
        comandasEnPantalla = JSON.parse(params.data)
        resultado = funcionesSQLService.getOrdenesComandaOnCurrentDayByIdEmpresa(session.user.fIdempresa, comandasEnPantalla)
        resultado.each { row ->
            row.put('productos', funcionesSQLService.getOrdenDetalleComandaByFacturaId(row.factura_id as Long))
            row.put('componentes', funcionesSQLService.getOrdenComponentesDetalleComandaByFacturaId(row.factura_id as Long))

        }
        response_data.put("data", resultado)
        render response_data as JSON
    }

    def getPedidos() {
        Map<String, Object> response_data = new HashMap<String, Object>()
        response_data.put("data", [
                rows               : funcionesSQLService.getOrdenesFromApp(session.user.fIdempresa),
                estatus            : funcionesSQLService.getOrdenesEstatus(),
                monto_total        : funcionesSQLService.getMontoTotal(session.user.fIdempresa)[0].monto_total,
                monto_total_cerrado: funcionesSQLService.getMontoCerrado(session.user.fIdempresa)[0].monto_total_cerrado,
                count_pedidos      : funcionesSQLService.getTotalPedidos(session.user.fIdempresa)[0].total_pedidos
        ])
        render response_data as JSON
    }

    def getPedidosCerrados() {
        Map<String, Object> response_data = new HashMap<String, Object>()
        response_data.put("data", [
                rows               : funcionesSQLService.getOrdenesCerradaFromApp(session.user.fIdempresa),
                estatus            : funcionesSQLService.getOrdenesEstatus(),
                monto_total        : funcionesSQLService.getMontoTotal(session.user.fIdempresa)[0].monto_total,
                monto_total_cerrado: funcionesSQLService.getMontoCerrado(session.user.fIdempresa)[0].monto_total_cerrado,
                count_pedidos      : funcionesSQLService.getTotalPedidos(session.user.fIdempresa)[0].total_pedidos
        ])
        render response_data as JSON
    }


    def store_estado() {
        Map<String, Object> response_data = new HashMap<String, Object>()
        Map<String, Object> errors = new HashMap<String, Object>()
        def data

        data = JSON.parse(params.data)
        List errorValidacione
        errorValidacione = validacionesService.validacionEstado(data)

        if (errorValidacione.size() > 0) {
            response_data.put("errors", errorValidacione)
            render response_data as JSON
        }

        def item
        item = funcionesSQLService.guardarEstado(data)

        if (item) {
            response_data.put("success", true)
            render response_data as JSON
        } else {
            response_data.put("success", false)
            render response_data as JSON
        }
    }

    def asignar_mensajero() {
        Map<String, Object> response_data = new HashMap<String, Object>()

        def item
        item = funcionesSQLService.asignarMsj(params.idfactura.toString().toLong(), params.idmensajero.toString().toLong())

        if (item) {
            response_data.put("success", true)
            render response_data as JSON
        } else {
            response_data.put("success", false)
            render response_data as JSON
        }
    }

    def entregar() {
        Map<String, Object> response_data = new HashMap<String, Object>()
        List productos

        productos = JSON.parse(params.data)

        def item
        item = funcionesSQLService.entegarComanda(productos)

        if (item) {
            response_data.put("success", true)
            render response_data as JSON
        } else {
            response_data.put("success", false)
            render response_data as JSON
        }
    }

    def entregar_producto() {
        Map<String, Object> response_data = new HashMap<String, Object>()
        //List productos

        //productos = JSON.parse(params.deta)

        def item
        item = funcionesSQLService.entegarComanda(params.detalle_id.toString().toLong())

        if (item) {
            response_data.put("success", true)
            render response_data as JSON
        } else {
            response_data.put("success", false)
            render response_data as JSON
        }
    }

    def facturar() {
        Map<String, Object> response_data = new HashMap<String, Object>()
        Map currentConfigToPrint
        Integer idProcesoToPrintFactura = 1

        response_data.put("is_printer_conected", true)
        response_data.put("success", false)
        response_data.put("success", false)
        response_data.put("errors", [])
        //response_data.put("errors", [])
        def item

        List errorValidacione
        errorValidacione = validacionesService.validarPedido(params.idorden.toString(), params.idfactura.toString().toLong(), session.user.fIdempresa)

        if (errorValidacione.size() > 0) {
            response_data.errors = errorValidacione
            render response_data as JSON
            return
        }

        if (session.last_status_printer.f_key != 1 || !session.idnodo) {
            response_data.is_printer_conected = false
            render response_data as JSON
            return
        }

//        if (session.idnodo.toString().equals("") || !session.idnodo) {
//            response_data.is_printer_conected = false
//            render response_data as JSON
//            return
//        }


        item = funcionesSQLService.facturarPedido(params.idorden.toString(), params.idfactura.toString().toLong(), params.idmensajero.toString().toLong(), session.user.fIdempresa, session.user.id)

        if (item) {

            if (session.idnodo.toString().equals("") || !session.idnodo) {
                response_data.is_printer_conected = false
                response_data.success = true
                render response_data as JSON
                return
            }

            //LOGICA PARA IMPRIMIR LA FACTURA
            //
            String stringFactura = ""

            String tipo_printer = Tempresas.findById(session.user.fIdempresa).fTipoPapelImpresion.toString()
            String accion = ""
            String json = ""
            String xsession = session.idnodo.toString()
            Funciones utilidades = new Funciones()


            List resultado

            resultado = funcionesSQLService.ListarFacturaReimprimirById(
                    session.user.fIdempresa.toString(),
                    item.id.toString(),
                    false
            )

            currentConfigToPrint = helperService.getCurrentConfigToPrint(session.default_config_impresion, idProcesoToPrintFactura)

            stringFactura = utilidades.generarImpresion(
                    resultado,
                    currentConfigToPrint.f_marca as Integer,
                    currentConfigToPrint.f_columnas as Integer
            )

            session.session_printer_serverjq.f_data.f_factura = stringFactura.encodeAsBase64()
            session.last_status_printer = helperService.sendMessageToPrint(session.session_printer_serverjq)

            //response_data.put("data", resultado[0])
            //render response_data as JSON
            //json = [f_data:resultado[0]] as JSON
            stringFactura = utilidades.GenerarStringFacturaImprimirTermica(resultado, tipo_printer, accion)
            //println resultado[0].toString()

            //ServerPrinterNodo.enviar(stringFactura, session.idnodo.toString())

            //response_data.put("xsession", session.idnodo.toString())

            response_data.factura = resultado
            response_data.success = 1 == session.last_status_printer.f_key
            response_data.response_server_print = session.last_status_printer
            render response_data as JSON
        } else {
            response_data.success = false
            render response_data as JSON
        }
    }

    def store_factura_no_delivery() {
        Map<String, Object> response_data = new HashMap<String, Object>()
        Map currentConfigToPrint
        Integer idProcesoToPrintFactura = 1
        response_data.put("is_printer_conected", false)
        response_data.put("success", false)
        response_data.put("errors", [])
        def data = JSON.parse(params.data)

        if (session.last_status_printer.f_key != 1 || !session.idnodo) {
            response_data.is_printer_conected = false
            response_data.success = 1 == session.last_status_printer.f_key
            response_data.response_server_print = session.last_status_printer
            render response_data as JSON
            return
        }

        List errorValidacion
        errorValidacion = validacionesService.validarDetalleDelivery(data.detalle)


        if (errorValidacion.size() > 0) {
            response_data.errors = errorValidacion
            render response_data as JSON
            return
        }
        
        errorValidacion = validacionesService.validarOrdenesConRNC(data, session.user.fIdempresa)

        if (errorValidacion.size() > 0) {
            response_data.errors = errorValidacion
            render response_data as JSON
            return
        }

        errorValidacion = validacionesService.validarFactura(data)

        if (errorValidacion.size() > 0) {
            response_data.errors = errorValidacion
            render response_data as JSON
            return
        }

        def factura = funcionesSQLService.guardarFactura(data, session.user.fIdempresa, session.user.id)

        if (factura) {

            //LOGICA PARA IMPRIMIR LA FACTURA

            String stringFactura = ""

            String tipo_printer = Tempresas.findById(session.user.fIdempresa).fTipoPapelImpresion.toString()
            String accion = ""
            String json = ""
            String xsession = session.idnodo.toString()
            Funciones utilidades = new Funciones()


            List resultado

            resultado = funcionesSQLService.ListarFacturaReimprimirById(
                    session.user.fIdempresa.toString(),
                    factura.id.toString(),
                    false
            )

            currentConfigToPrint = helperService.getCurrentConfigToPrint(session.default_config_impresion, idProcesoToPrintFactura)

            stringFactura = utilidades.generarImpresion(
                    resultado,
                    currentConfigToPrint.f_marca as Integer,
                    currentConfigToPrint.f_columnas as Integer
            )

            session.session_printer_serverjq.f_data.f_factura = stringFactura.encodeAsBase64()
            session.last_status_printer = helperService.sendMessageToPrint(session.session_printer_serverjq)

            //response_data.put("data", resultado[0])
            //render response_data as JSON
            //json = [f_data:resultado[0]] as JSON
            //stringFactura = utilidades.GenerarStringFacturaImprimirTermica(resultado, tipo_printer, accion)
            //println resultado[0].toString()

            //ServerPrinterNodo.enviar(stringFactura, session.idnodo.toString())
            response_data.success = 1 == session.last_status_printer.f_key
            response_data.response_server_print = session.last_status_printer
            render response_data as JSON
        } else {
            response_data.success = false
            render response_data as JSON
        }
    }


    def setIdPrintNodo() {
        Map<String, Object> response_data = new HashMap<String, Object>()
        response_data.put("isvalid", false)
        response_data.put("isconected", false)
        response_data.put("response_server_print", [])

        // TODO
        // Modificar este metodo para aceptar las 2 formas de impresion

//        if (validacionesService.validarIdNodo(params.idnodo.toString()) && session.idnodo.toString().equals(params.idnodo.toString())) {
//            response_data.put("isconected", true)
//        } else if (validacionesService.validarIdNodo(params.idnodo.toString())) {
//            session.idnodo = params.idnodo
//            response_data.put("isvalid", true)
//        }


        session["session_printer_serverjq"] = [
                f_key : "${new SimpleDateFormat("yyyy-MM-dd").format(new Date())}-${session.user.fIdempresa}".encodeAsMD5(),
                f_data: [
                        f_print_nodo: true,
                        f_empresa   : session.user.fIdempresa,
                        f_factura   : "menube prueba de impresion".encodeAsBase64(),
                        f_idsesion  : params.idnodo
                ],

        ]
        session.last_status_printer = helperService.sendMessageToPrint(session.session_printer_serverjq)
        response_data.isvalid = 1 == session.last_status_printer.f_key
        session.idnodo = 1 == session.last_status_printer.f_key ? params.idnodo : ""
        response_data.response_server_print = session.last_status_printer
        render response_data as JSON
    }

    def generar_cuadre_caja() {
        Map<String, Object> response_data = new HashMap<String, Object>()
        def item
        Map currentConfigToPrint
        Integer idProcesoToPrintFactura = 3

        response_data.put("has_permission", true)
        response_data.put("is_printer_conected", true)
        response_data.put("data", [])
        response_data.put("success", false)
        response_data.put("msj", "")

        if (session.last_status_printer.f_key != 1 || !session.idnodo) {
            response_data.is_printer_conected = false
            render response_data as JSON
            return
        }

//        if (session.idnodo.toString().equals("") || !session.idnodo) {
//            response_data.is_printer_conected = false
//            render response_data as JSON
//            return
//        }

        if (!validacionesService.validacionCuadreCaja(params.usuario.toString(), params.password.toString(), session.user.fIdempresa)) {
            response_data.has_permission = false
            render response_data as JSON
            return
        }

        item = funcionesSQLService.generarCuadreCaja(session.user.id, session.user.fIdempresa)
//
//        if(item.id == 0) {
//            response_data.success = false
//            response_data.msj = "No hay cuadre de "
//            render response_data as JSON
//            return
        //  }

        if (item) {
            if (session.idnodo.toString().equals("") || !session.idnodo) {
                response_data.is_printer_conected = false
                response_data.success = true
                render response_data as JSON
                return
            }

            //LOGICA PARA IMPRIMIR LA FACTURA
            //
            String stringFactura = ""

            String tipo_printer = Tempresas.findById(session.user.fIdempresa).fTipoPapelImpresion.toString()
            String accion = "Cuadre Caja"
            String json = ""
            String xsession = session.idnodo.toString()
            Funciones utilidades = new Funciones()


            Map resultado

            resultado = funcionesSQLService.getCuadreToPrint(item.id.toString().toLong())
            currentConfigToPrint = helperService.getCurrentConfigToPrint(session.default_config_impresion, idProcesoToPrintFactura)
            stringFactura = utilidades.generarImpresion(
                    resultado,
                    currentConfigToPrint.f_marca as Integer,
                    currentConfigToPrint.f_columnas as Integer
            )

            session.session_printer_serverjq.f_data.f_factura = stringFactura.encodeAsBase64()
            session.last_status_printer = helperService.sendMessageToPrint(session.session_printer_serverjq)

            response_data.success = 1 == session.last_status_printer.f_key
            response_data.response_server_print = session.last_status_printer

            //stringFactura = utilidades.GenerarStringCuadreImprimirTermica(resultado, tipo_printer, accion)

            //ServerPrinterNodo.enviar(stringFactura, session.idnodo.toString())
            response_data.data = resultado
            response_data.success = true
            render response_data as JSON
        } else {
            response_data.success = false
            render response_data as JSON
        }
    }


    def generar_cuadre_general() {
        Map<String, Object> response_data = new HashMap<String, Object>()
        List errorValidacion
        Map currentConfigToPrint
        Integer idProcesoToPrintFactura = 3
        def item

        response_data.put("has_permission", true)
        response_data.put("is_printer_conected", true)
        response_data.put("data", [])
        response_data.put("success", false)
        response_data.put("msj", "")

        if (session.last_status_printer.f_key != 1 || !session.idnodo) {
            response_data.is_printer_conected = false
            render response_data as JSON
            return
        }
//
//        if (session.idnodo.toString().equals("") || !session.idnodo) {
//            response_data.is_printer_conected = false
//            render response_data as JSON
//            return
//        }

        if (!validacionesService.validacionCuadreCaja(params.usuario.toString(), params.password.toString(), session.user.fIdempresa)) {
            response_data.has_permission = false
            render response_data as JSON
            return
        }

        errorValidacion = validacionesService.validarFacturasAbiertas(session.user.fIdempresa)


        if (errorValidacion.size() > 0) {
            response_data.errors = errorValidacion
            render response_data as JSON
            return
        }

        item = funcionesSQLService.generarCuadreGeneral(session.user.id, session.user.fIdempresa)


        if (item.id == 0) {
            response_data.success = false
            response_data.msj = "No hay cuadre de cajeros para cuadre general"
            render response_data as JSON
            return
        }

        if (item) {
            //LOGICA PARA IMPRIMIR LA FACTURA
            //
            String stringFactura = ""
            String tipo_printer = Tempresas.findById(session.user.fIdempresa).fTipoPapelImpresion.toString()
            String accion = "Cuadre General"
            String json = ""
            String xsession = session.idnodo.toString()
            Funciones utilidades = new Funciones()


            Map resultado

            resultado = funcionesSQLService.getCuadreGeneralToPrint(item.id.toString().toLong())

            currentConfigToPrint = helperService.getCurrentConfigToPrint(session.default_config_impresion, idProcesoToPrintFactura)
            stringFactura = utilidades.generarImpresion(
                    resultado,
                    currentConfigToPrint.f_marca as Integer,
                    currentConfigToPrint.f_columnas as Integer
            )

            session.session_printer_serverjq.f_data.f_factura = stringFactura.encodeAsBase64()
            session.last_status_printer = helperService.sendMessageToPrint(session.session_printer_serverjq)

            response_data.success = 1 == session.last_status_printer.f_key
            response_data.response_server_print = session.last_status_printer

            //stringFactura = utilidades.GenerarStringCuadreImprimirTermica(resultado, tipo_printer, accion)

            //ServerPrinterNodo.enviar(stringFactura, session.idnodo.toString())

            Tempresas empresa = Tempresas.get(session.user.fIdempresa)
            Tusuarios user = Tusuarios.findById(session.user.id)

            if (user.fActivarPedidos) {
                empresa.fRecibirPedidosApp = false
                empresa.save(flush: true)
                response_data.isconected = empresa.fRecibirPedidosApp
                response_data.has_permission = true
            }

            response_data.data = resultado
            //response_data.success = true
            render response_data as JSON
        } else {
            response_data.success = false
            render response_data as JSON
        }
    }

    def autorizacion_porciento_ley() {
        Map<String, Object> response_data = new HashMap<String, Object>()
        response_data.put("has_permission", true)
        response_data.put("success", true)

        response_data.has_permission = validacionesService.validarPermisoPorcientoLey(params.usuario.toString(), params.password.toString(), session.user.fIdempresa)
        render response_data as JSON

    }

    def reimprimir() {
        Map<String, Object> response_data = new HashMap<String, Object>()
        Map currentConfigToPrint
        Integer idProcesoToPrintFactura = 1
        def item

        response_data.put("is_printer_conected", true)
        response_data.put("success", false)
        response_data.put("response_server_print", [])

        //Metodo antiguo de validacion de conexion del printer
        //
//        if (session.idnodo.toString().equals("") || !session.idnodo) {
//            response_data.is_printer_conected = false
//            render response_data as JSON
//            return
//        }

        if (session.last_status_printer.f_key != 1 || !session.idnodo) {
            response_data.is_printer_conected = false
            render response_data as JSON
            return
        }

        item = Tfacturas.findById(params.idfactura.toString().toLong())

        if (item) {
            //LOGICA PARA IMPRIMIR LA FACTURA
            String stringFactura = ""
            String accion = "Copia - "
            Funciones utilidades = new Funciones()
            List resultado
            resultado = funcionesSQLService.ListarFacturaReimprimirById(
                    session.user.fIdempresa.toString(),
                    item.id.toString(),
                    false
            )
            //println resultado

            // Metodo antiguo de impresion
            //stringFactura = utilidades.GenerarStringFacturaImprimirTermica(resultado, tipo_printer, accion, 32)
            // ServerPrinterNodo.enviar(stringFactura, session.idnodo.toString())

            // Buscar la configuracion para imprimir
            currentConfigToPrint = helperService.getCurrentConfigToPrint(session.default_config_impresion, idProcesoToPrintFactura)
            resultado.first().titulo_impresion = accion + resultado.first().titulo_impresion
            stringFactura = utilidades.generarImpresion(
                    resultado,
                    currentConfigToPrint.f_marca as Integer,
                    currentConfigToPrint.f_columnas as Integer
            )

            session.session_printer_serverjq.f_data.f_factura = stringFactura.encodeAsBase64()
            session.last_status_printer = helperService.sendMessageToPrint(session.session_printer_serverjq)

            // Siempre se almacena el ultimo estatus de la impresion por motivos de respuesta a la vista
            response_data.success = 1 == session.last_status_printer.f_key
            response_data.response_server_print = session.last_status_printer
            render response_data as JSON
        } else {
            response_data.success = false
            render response_data as JSON
        }
    }

    def imprimirPedido() {
        Map<String, Object> response_data = new HashMap<String, Object>()
        Map response_request
        Map currentConfigToPrint
        Integer idProcesoToPrintFactura = 1

        response_data.put("is_printer_conected", true)
        response_data.put("success", false)

        def item

//        if (session.idnodo.toString().equals("") || !session.idnodo) {
//            response_data.is_printer_conected = false
//            render response_data as JSON
//            return
//        }

        if (session.last_status_printer.f_key != 1 || !session.idnodo) {
            response_data.is_printer_conected = false
            render response_data as JSON
            return
        }

        item = Tfacturas.findById(params.idfactura.toString().toLong())

        if (item) {
            //LOGICA PARA IMPRIMIR LA FACTURA
            //
            String stringFactura = ""
//
//            String tipo_printer = Tempresas.findById(session.user.fIdempresa).fTipoPapelImpresion.toString()
//            String accion = ""
//            String json = ""
//            String xsession = session.idnodo.toString()
            Funciones utilidades = new Funciones()

            List resultado
            List componentes

            resultado = funcionesSQLService.getDataOrdenToPrint(
                    session.user.fIdempresa.toString(),
                    item.id.toString()
            )

            componentes = funcionesSQLService.getOrdenPropiedadesByOrdenId(item.id)
            //stringFactura = utilidades.generarStringOrdenImprimirTermica(resultado, componentes, tipo_printer, accion)
            currentConfigToPrint = helperService.getCurrentConfigToPrint(session.default_config_impresion, idProcesoToPrintFactura)

            stringFactura = utilidades.generarImpresion(
                    resultado,
                    componentes,
                    currentConfigToPrint.f_marca as Integer,
                    currentConfigToPrint.f_columnas as Integer
            )
            session.session_printer_serverjq.f_data.f_factura = stringFactura.encodeAsBase64()
            session.last_status_printer = helperService.sendMessageToPrint(session.session_printer_serverjq)

            //ServerPrinterNodo.enviar(stringFactura, session.idnodo.toString())


            response_data.success = 1 == session.last_status_printer.f_key
            response_data.response_server_print = session.last_status_printer
            render response_data as JSON
        } else {
            response_data.success = false
            render response_data as JSON
        }
    }

    def reimprimirCuadre() {
        Map<String, Object> response_data = new HashMap<String, Object>()
        Map currentConfigToPrint
        Integer idProcesoToPrintFactura = 3
        def item
        response_data.put("has_permission", true)
        response_data.put("is_printer_conected", true)
        response_data.put("data", [])
        response_data.put("success", false)
        response_data.put("msj", "")

        if (session.last_status_printer.f_key != 1 || !session.idnodo) {
            response_data.is_printer_conected = false
            render response_data as JSON
            return
        }

//        if (session.idnodo.toString().equals("") || !session.idnodo) {
//            response_data.is_printer_conected = false
//            render response_data as JSON
//            return
//        }
//
//        if (session.idnodo.toString().equals("") || !session.idnodo) {
//            response_data.is_printer_conected = false
//            response_data.success = true
//            render response_data as JSON
//            return
//        }

        //LOGICA PARA IMPRIMIR LA FACTURA
        //
        String stringFactura = ""
        String tipo_printer = Tempresas.findById(session.user.fIdempresa).fTipoPapelImpresion.toString()
        String accion = "Copia - Cuadre Caja"
        String json = ""
        String xsession = session.idnodo.toString()
        Funciones utilidades = new Funciones()

        Map resultado
        resultado = funcionesSQLService.getCuadreToPrint(params.idcuadre.toString().toLong())

        //stringFactura = utilidades.GenerarStringCuadreImprimirTermica(resultado, tipo_printer, accion)
        currentConfigToPrint = helperService.getCurrentConfigToPrint(session.default_config_impresion, idProcesoToPrintFactura)
        resultado.titulo_impresion = 'Copia - ' + resultado.titulo_impresion
        stringFactura = utilidades.generarImpresion(
                resultado,
                currentConfigToPrint.f_marca as Integer,
                currentConfigToPrint.f_columnas as Integer
        )

        session.session_printer_serverjq.f_data.f_factura = stringFactura.encodeAsBase64()
        session.last_status_printer = helperService.sendMessageToPrint(session.session_printer_serverjq)

        //ServerPrinterNodo.enviar(stringFactura, session.idnodo.toString())


        response_data.success = 1 == session.last_status_printer.f_key
        response_data.response_server_print = session.last_status_printer
        response_data.data = resultado
        render response_data as JSON
    }

    def reimprimirCuadreGeneral() {
        Map<String, Object> response_data = new HashMap<String, Object>()
        //def item
        Map currentConfigToPrint
        Integer idProcesoToPrintFactura = 3

        response_data.put("has_permission", true)
        response_data.put("is_printer_conected", true)
        response_data.put("data", [])
        response_data.put("success", false)
        response_data.put("msj", "")

        if (session.last_status_printer.f_key != 1 || !session.idnodo) {
            response_data.is_printer_conected = false
            render response_data as JSON
            return
        }

//        if (session.idnodo.toString().equals("") || !session.idnodo) {
//            response_data.is_printer_conected = false
//            render response_data as JSON
//            return
//        }

//        if (session.idnodo.toString().equals("") || !session.idnodo) {
//            response_data.is_printer_conected = false
//            response_data.success = true
//            render response_data as JSON
//            return
//        }

        //LOGICA PARA IMPRIMIR LA FACTURA
        //
        String stringFactura = ""

        String tipo_printer = Tempresas.findById(session.user.fIdempresa).fTipoPapelImpresion.toString()
        String accion = "Copia - Cuadre General"
        String json = ""
        String xsession = session.idnodo.toString()
        Funciones utilidades = new Funciones()


        Map resultado

        resultado = funcionesSQLService.getCuadreGeneralToPrint(params.idcuadre.toString().toLong())

        currentConfigToPrint = helperService.getCurrentConfigToPrint(session.default_config_impresion, idProcesoToPrintFactura)
        resultado.titulo_impresion = 'Copia - ' + resultado.titulo_impresion
        stringFactura = utilidades.generarImpresion(
                resultado,
                currentConfigToPrint.f_marca as Integer,
                currentConfigToPrint.f_columnas as Integer
        )

        session.session_printer_serverjq.f_data.f_factura = stringFactura.encodeAsBase64()
        session.last_status_printer = helperService.sendMessageToPrint(session.session_printer_serverjq)

        //stringFactura = utilidades.GenerarStringCuadreImprimirTermica(resultado, tipo_printer, accion)

        //ServerPrinterNodo.enviar(stringFactura, session.idnodo.toString())
        response_data.data = resultado
        response_data.success = 1 == session.last_status_printer.f_key
        response_data.response_server_print = session.last_status_printer
        render response_data as JSON
    }

}
