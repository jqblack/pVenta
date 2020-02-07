package manube_v2

import FuncionesGenerales.Funciones
import grails.converters.JSON
import grails.websocket.example.ServerPrinterNodo

class EmpresaController {

    FuncionesSQLService funcionesSQLService
    ValidacionesService validacionesService
    HelperService helperService

    def index() {
        def preferencias = Tempresas.findById(session.user.fIdempresa)
        def comprobantes = Tncf.findAllByFIdempresa(session.user.fIdempresa)

        def tipos_impresora = [[id: 1, fDescripcion: 'Start'], [id: 2, fDescripcion: 'Epson']]

        render(view: "index", model: [
                preferencias     : preferencias,
                comprobantes     : comprobantes,
                tipos_impresora  : tipos_impresora
        ])
    }

    def cuenta_por_cobrar() {}

    def notas_credito() {}

    def otras_cuentas_por_cobrar() {}
    def ayuda() {}
    def politica_privacidad() {
        render (view: "politicas")
    }

    def getEmpresa() {
        def preferencias = Tempresas.findById(session.user.fIdempresa)
        Map<String, Object> data = new HashMap<String, Object>()

        data.put("data", preferencias)
        render data as JSON
    }

    def getTutoriales() {
        def data = [data:funcionesSQLService.getTutoriales()]
        render data as JSON
    }

    def getCuentasPorCobrar() {
        Map<String, Object> data = new HashMap<String, Object>()
        data.put("data", funcionesSQLService.getCuentasPorCobrarByClienteId(params.cliente_id.toString().toLong(), session.user.fIdempresa))
        render data as JSON
    }

    def zona() {
//       def preferencias = Tempresas.findById(session.user.fIdempresa)
//        //def preferencias = Tempresas.findById(2)
//        render(view: "index", model: [preferencias: preferencias])
    }


    def getZonas() {
        Map<String, Object> data = new HashMap<String, Object>()
        data.put("data", Tzonas.findAllByFIdempresa(session.user.fIdempresa))
        render data as JSON
    }

    def getConfiguracionProcesosToPrint() {
        Map<String, Object> data = new HashMap<String, Object>()
        def procesosImpresion = funcionesSQLService.getAllProcesosImpresion(session.user.fIdempresa)
        def opcinesConfiguracion = funcionesSQLService.getOpcionesConfiguracionImpresion()
        data.put("data", procesosImpresion)
        data.put("opciones", opcinesConfiguracion)
        render data as JSON
    }

    def getSectores() {
        Map<String, Object> data = new HashMap<String, Object>()
        data.put("data", funcionesSQLService.getSectores(params.id.toString().toLong()))
        render data as JSON
    }

    def get_horario() {
        Map<String, Object> data = new HashMap<String, Object>()
        def sql = "select fHorario1,fHorario2,fHorario3,fHorario4,fHorario5,fHorario6,fHorario7 from Tempresas where id = ?"
        def horarios = Tempresas.findAll(sql, [session.user.fIdempresa])
        data.put("data", horarios)
        render data as JSON
    }

    def store() {

        Map<String, Object> response_data = new HashMap<String, Object>()

        def data = JSON.parse(params.data)


        List errorValidacion
        errorValidacion = validacionesService.validarPreferencias(data)

        if (errorValidacion.size() > 0) {
            response_data.put("errors", errorValidacion)
            render response_data as JSON
            return
        }

        def item
        item = funcionesSQLService.guardarPreferencias(data)

        if (item) {
            response_data.put("success", true)
            render response_data as JSON
        } else {
            response_data.put("success", false)
            render response_data as JSON
        }
    }

    def store_zona() {

        Map<String, Object> response_data = new HashMap<String, Object>()

        def data = JSON.parse(params.data)

//        List errorValidacion
//        errorValidacion = validacionesService.validarPreferencias(data)
//
//        if (errorValidacion.size() > 0)
//        {
//            response_data.put("errors", errorValidacion)
//            render response_data as JSON
//            return
//        }

        def item
        item = funcionesSQLService.guardarZona(data, session.user.fIdempresa)

        if (item) {
            response_data.put("success", true)
            render response_data as JSON
        } else {
            response_data.put("success", false)
            render response_data as JSON
        }
    }

    def storePagoFactura() {

        Map<String, Object> response_data = new HashMap<String, Object>()
        Map currentConfigToPrint
        Integer idProcesoToPrintFactura = 5

        def data = JSON.parse(params.data)

        // println data

        List errorValidacion
//        errorValidacion = validacionesService.validarPagoCuentaPorCobrar(data)
//
//        if (errorValidacion.size() > 0)
//        {
//            response_data.put("errors", errorValidacion)
//            render response_data as JSON
//            return
//        }

        def item
        if (!data.rows.isEmpty()) {

            errorValidacion = validacionesService.validarPagoCuentaPorCobrar(data.rows, session.user.fIdempresa, data.pagoTotal as BigDecimal)

            if (errorValidacion.size() > 0) {

                //ESTE ERROR si el balance es menor a lo que usted le mando el retorna una JULIADA

                response_data.put("errors", errorValidacion)
                render response_data as JSON
                return
            }

            println("La cuenta se SALDARA COMPLETA");

            item = funcionesSQLService.guardarSaldoDeCuentas(data, session.user.fIdempresa, session.user.id);

        } else {


            errorValidacion = validacionesService.validarPagoCuentaPorCobrar(data, session.user.fIdempresa);

            if (errorValidacion.size() > 0) {

                response_data.put("errors", errorValidacion)

                render response_data as JSON

                return
            }

            println("La cuenta se le saldara solamente parte de una factura");
            item = funcionesSQLService.guardarPagoCuentaPorPagar(data, session.user.fIdempresa, session.user.id);

        }


        if (item) {

//            println(session);

            //CUANDO ENTRE A ESTE IF EL PAGO SE REALIZARA A ESE USUARIO SASTIFACTORIAMENTE
            //SE LE REBAJARA A BD Y ESTO TODOS BIEN YA FINALIZA CON RETURN
            if (session.idnodo.toString().equals("") || !session.idnodo) {

                response_data.is_printer_conected = false
                response_data.success = true


                //agregado por maycol porque el ajax espera respose server
                Map<String, Object> Patch_f_key = new HashMap<String, Object>();

                Patch_f_key.f_key = 1;

                response_data.response_server_print =  Patch_f_key;

                response_data.document_impreso= false;
                //agregado por maycol porque el ajax espera respose server

                render response_data as JSON

                println("El pago fue sastifcatorio se devolvio a AJAX ESTO: "+response_data);
                return
            }





            //LOGICA PARA IMPRIMIR LA FACTURA
            //LOGICA PARA IMPRIMIR LA FACTURA
            //LOGICA PARA IMPRIMIR LA FACTURA
            //
            String stringFactura = ""
            String tipo_printer = "1"
            String accion = "Factura"
            String json = ""
            String xsession = session.idnodo.toString()
            Funciones utilidades = new Funciones()


            List resultado

            resultado = funcionesSQLService.imprimirReciboCuentaPorCobrar(
                    session.user.fIdempresa.toString(),
                    item.f_idrecord.toString()
            )

            //println resultado.size()
            //println resultado.first().
            //response_data.put("data", resultado[0])
            //render response_data as JSON
            //json = [f_data:resultado[0]] as JSON
            // stringFactura = utilidades.generarStringReciboImprimirTermica(resultado, tipo_printer, accion)
//            println resultado[0].toString()

            println("Se va a SET la variable currentConfigToPrint");

            currentConfigToPrint = helperService.getCurrentConfigToPrint(session.default_config_impresion, idProcesoToPrintFactura)

            if(currentConfigToPrint == null){
                println("currentConfigToPrint null");
                response_data.is_printer_conected = false
                response_data.success = true


                //agregado por maycol porque el ajax espera respose server
                Map<String, Object> Patch_f_key = new HashMap<String, Object>();

                Patch_f_key.f_key = 1;
//                Patch_f_key.error = "currentConfigToPrint=> No Fue Configurada La Impresora";

                response_data.response_server_print =  Patch_f_key;

                response_data.document_impreso= false;
                //agregado por maycol porque el ajax espera respose server


                render response_data as JSON

                return ;
            }

//            if(currentConfigToPrint.f_marca && currentConfigToPrint.f_columnas as Integer == "0"){
//
//                response_data.is_printer_conected = false
//                response_data.success = true
//
//
//                //agregado por maycol porque el ajax espera respose server
//                Map<String, Object> Patch_f_key = new HashMap<String, Object>();
//
//                Patch_f_key.f_key = 1;
//
//                response_data.response_server_print =  Patch_f_key;
//
//                response_data.document_impreso= false;
//                //agregado por maycol porque el ajax espera respose server
//
//                render response_data as JSON
//
//                return ;
//            }

            stringFactura = utilidades.generarImpresionRecibo(
                    resultado,
                    currentConfigToPrint.f_marca as Integer,
                    currentConfigToPrint.f_columnas as Integer
            )

            println("Ya se obtuvo currentConfigToPrint ahora se trabajara con ssesion");


            session.session_printer_serverjq.f_data.f_factura = stringFactura.encodeAsBase64()
            session.last_status_printer = helperService.sendMessageToPrint(session.session_printer_serverjq)

            response_data.success = 1 == session.last_status_printer.f_key
            response_data.response_server_print = session.last_status_printer

            //ServerPrinterNodo.enviar(stringFactura, session.idnodo.toString())

//            println(response_data as JSON);

            response_data.document_impreso= true;

            response_data.put("success", true)
            render response_data as JSON
        } else {

            println("el item es falso y se ejecuto error BD");

            //agregado por maycol porque el ajax espera respose server
            response_data.is_printer_conected = false

            Map<String, Object> Patch_f_key = new HashMap<String, Object>();

            Patch_f_key.f_key = 1;

            response_data.response_server_print =  Patch_f_key;

            response_data.errors = ["Los Datos No Fueron Guardados, Revisar Conexion a la BD\n codigo error: 204 EmpresaController "];
            //agregado por maycol porque el ajax espera respose server


            response_data.put("success", false)
            render response_data as JSON
        }
    }

    def storeOtraCuentaPorCobrar() {

        Map<String, Object> response_data = new HashMap<String, Object>()
        Map currentConfigToPrint
        Integer idProcesoToPrintFactura = 5
        def data = JSON.parse(params.data)

        List errorValidacion
        def item
        errorValidacion = validacionesService.validarCuentaPorCobrar(data)



        if (errorValidacion.size() > 0) {
            response_data.put("errors", errorValidacion)
            render response_data as JSON
            return
        }

        item = funcionesSQLService.guardarCuentaPorCobrar(data, session.user.fIdempresa, session.user.id)

        if (item) {
            if (session.last_status_printer.f_key != 1 || !session.idnodo) {
                response_data.is_printer_conected = false
                response_data.success = true
                render response_data as JSON
                return
            }
//            if (session.idnodo.toString().equals("") || !session.idnodo) {
//                response_data.is_printer_conected = false
//                response_data.success = true
//                render response_data as JSON
//                return
//            }

            //LOGICA PARA IMPRIMIR LA FACTURA
            //
            String stringFactura = ""
            String tipo_printer = "1"
            String accion = "Factura"
            String json = ""
            String xsession = session.idnodo.toString()
            Funciones utilidades = new Funciones()
            List resultado

            resultado = funcionesSQLService.imprimirCuentaPorCobrar(
                    session.user.fIdempresa.toString(),
                    item.f_idrecord.toString()
            )
            //println resultado
            //stringFactura = utilidades.generarStringCuentaPorCobrarImprimirTermica(resultado, tipo_printer, accion)
            currentConfigToPrint = helperService.getCurrentConfigToPrint(session.default_config_impresion, idProcesoToPrintFactura)
            stringFactura = utilidades.generarImpresionRecibo(
                    resultado,
                    currentConfigToPrint.f_marca as Integer,
                    currentConfigToPrint.f_columnas as Integer
            )


            session.session_printer_serverjq.f_data.f_factura = stringFactura.encodeAsBase64()
            session.last_status_printer = helperService.sendMessageToPrint(session.session_printer_serverjq)

            response_data.success = 1 == session.last_status_printer.f_key
            response_data.response_server_print = session.last_status_printer

            //ServerPrinterNodo.enviar(stringFactura, session.idnodo.toString())
            response_data.put("success", true)
            render response_data as JSON
        } else {
            response_data.put("success", false)
            render response_data as JSON
        }
    }


    def storeNotaCredito() {

        Map<String, Object> response_data = new HashMap<String, Object>()
        def data = JSON.parse(params.data)
        Map currentConfigToPrint
        Integer idProcesoToPrintFactura = 5
        List errorValidacion


        def item
        if (!data.rows.isEmpty()) {
            errorValidacion = validacionesService.validarPagoCuentaPorCobrar(data.rows, session.user.fIdempresa, data.pagoTotal as BigDecimal)

            if (errorValidacion.size() > 0) {
                response_data.put("errors", errorValidacion)
                render response_data as JSON
                return
            }
            item = funcionesSQLService.guardarNotaCuentas(data, session.user.fIdempresa, session.user.id)

        } else {
            errorValidacion = validacionesService.validarPagoCuentaPorCobrar(data, session.user.fIdempresa)

            if (errorValidacion.size() > 0) {
                response_data.put("errors", errorValidacion)
                render response_data as JSON
                return
            }
            item = funcionesSQLService.guardarNotaCuenta(data, session.user.fIdempresa, session.user.id)

        }

        if (item) {

            if (session.last_status_printer.f_key != 1 || !session.idnodo) {
                response_data.is_printer_conected = false
                response_data.success = true

                //agregado por maycol porque el ajax espera respose server
                Map<String, Object> Patch_f_key = new HashMap<String, Object>();

                Patch_f_key.f_key = 1;

                response_data.response_server_print =  Patch_f_key;

                response_data.document_impreso= false;
                //agregado por maycol porque el ajax espera respose server

                render response_data as JSON
                return
            }

//            if (session.idnodo.toString().equals("") || !session.idnodo) {
//                response_data.is_printer_conected = false
//                response_data.success = true
//                render response_data as JSON
//                return
//            }

            //LOGICA PARA IMPRIMIR LA FACTURA
            //
            String stringFactura = ""
            String tipo_printer = "1"
            String accion = "Factura"
            String json = ""
            String xsession = session.idnodo.toString()
            Funciones utilidades = new Funciones()


            List resultado

            resultado = funcionesSQLService.listarImprimirReciboNotaCredito(
                    session.user.fIdempresa.toString(),
                    item.f_idrecord.toString()
            )

            //println resultado.size()
            //println resultado.first().
            //response_data.put("data", resultado[0])
            //render response_data as JSON
            //json = [f_data:resultado[0]] as JSON
           // stringFactura = utilidades.generarStringReciboImprimirTermica(resultado, tipo_printer, accion)

            currentConfigToPrint = helperService.getCurrentConfigToPrint(session.default_config_impresion, idProcesoToPrintFactura)
            stringFactura = utilidades.generarImpresionRecibo(
                    resultado,
                    currentConfigToPrint.f_marca as Integer,
                    currentConfigToPrint.f_columnas as Integer
            )


            session.session_printer_serverjq.f_data.f_factura = stringFactura.encodeAsBase64()
            session.last_status_printer = helperService.sendMessageToPrint(session.session_printer_serverjq)

            response_data.success = 1 == session.last_status_printer.f_key
            response_data.response_server_print = session.last_status_printer
            //println resultado[0].toString()

            //ServerPrinterNodo.enviar(stringFactura, session.idnodo.toString())
            response_data.put("success", true)

            // //agregado por maycol porque el ajax espera
            response_data.document_impreso= true;
            //agregado por maycol porque el ajax espera
            render response_data as JSON

        } else {
            response_data.put("success", false)

            //agregado por maycol porque el ajax espera respose server
            response_data.is_printer_conected = false

            Map<String, Object> Patch_f_key = new HashMap<String, Object>();

            Patch_f_key.f_key = 1;

            response_data.response_server_print =  Patch_f_key;

            response_data.errors = ["Los Datos No Fueron Guardados, Revisar Conexion a la BD\n codigo error: 487 EmpresaController "];
            //agregado por maycol porque el ajax espera respose server

            render response_data as JSON
        }
    }

    def setConfiguracionProcesos() {
        Map<String, Object> response_data = new HashMap<String, Object>()
        def listaConfiguracion = session.default_config_impresion
        Map configChanged

        listaConfiguracion.each { row ->

            if (row.idproceso as Integer == params.idproceso as Integer) {
                row.idconfiguracion = params.idconfiguracion
                configChanged = row
            }
        }

        session.default_config_impresion = listaConfiguracion
        response_data.put("success", true)
        response_data.put("configChanged", configChanged)
        render response_data as JSON
    }

}
