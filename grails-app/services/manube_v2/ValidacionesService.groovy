package manube_v2

import grails.gorm.transactions.Transactional
import org.grails.web.json.JSONArray
import org.grails.web.json.JSONObject
import org.grails.web.json.parser.JSONParser
import org.omg.CORBA.Object

import java.math.RoundingMode

@Transactional
class ValidacionesService {

    SqlService sqlService
    FuncionesSQLService funcionesSQLService
    def validarCategoria(JSONObject params)
    {
        List<String> list = new ArrayList<String>()

        if ( params.descripcion.toString().equals("")) {
            list.add('Descripcion no puede estar vacia.')
        }
        list
    }

    def validarDireccionDelivery(JSONObject params) {
        List<String> list = new ArrayList<String>()

        if ( params.new_direccion.toString().equals("")) {
            list.add('Descripcion no puede estar vacia.')
        }

        if ( params.new_sector.toString().toInteger() == 0) {
            list.add('')
        }
        list
    }

    def validarNcf(JSONObject params)
    {
        List<String> list = new ArrayList<String>()


        if ( params.descripcion.toString().equals("")) {
            list.add('Descripcion no puede estar vacia.')
        }

        if ( params.tipo.toString().equals("")) {
            list.add('Tipo no puede estar vacio.')
        }


        if ( params.reorden.toString().equals("")) {
            list.add('Reorden no puede estar vacio.')
        }


        if (params.reorden.toString().toInteger() < 0) {
            list.add('Reorden no puede ser menor a 0')
        }

        if (params.orden.toString().toInteger() < 0) {
            list.add('Orden no puede ser menor a 0')
        }
        list
    }

    def validarPagoCuentaPorCobrar(JSONObject params, Long idempresa)
    {
        Map resultado
        List<String> errors = new ArrayList<String>()
        String sql = "SELECT \n" +
                "  f_idrecord,\n" +
                "  f_tipodoc,\n" +
                "  f_nodoc,\n" +
                "  f_noexterno,\n" +
                "  f_fecha,\n" +
                "  f_monto,\n" +
                "  f_balance,\n" +
                "  f_idcliente,\n" +
                "  f_pagado,\n" +
                "  f_concepto,\n" +
                "  f_registradopor,\n" +
                "  f_anulado,\n" +
                "  f_fecha_vencimiento,\n" +
                "  f_idempresa\n" +
                "FROM \n" +
                " cxc.t_cuenta_cobrar where f_pagado = false AND f_idrecord = ${params.f_idrecord} AND f_idempresa = ${idempresa}"

        resultado = sqlService.GetQueryMap(sql)
        println resultado.f_balance
        BigDecimal totalBalance = 0
        totalBalance = resultado.f_balance - params.monto.toString().toBigDecimal()

        if (totalBalance < 0) {
            errors.add("Al parecer el balance de la cuenta cambio consultalo de nuevo")
        }
        errors

    }

    def validarCuentaPorCobrar(JSONObject params) {
        List<String> errors = new ArrayList<String>()

        if (params.cliente_id.toString().equals("")) {
            errors.add("Seleccione un cliente")
        }

        if (params.concepto.toString().equals("")) {
            errors.add("Agrege un con concepto")
        }


        if (params.concepto.toString().length() > 80) {
            errors.add("<b>Concepto</b> muy largo.")
        }

        if (params.monto.toString().equals("") || params.monto.toString().toBigDecimal() == 0) {
            errors.add("EL monto es obligatorio")
        }

        errors
    }

    def validarPagoCuentaPorCobrar(JSONArray params, Long idempresa, BigDecimal pagoTotal)
    {
        Map resultado
        List<String> errors = new ArrayList<String>()
        BigDecimal totalBalance = 0
        String sql = ""

        params.each { row ->
            sql = "SELECT \n" +
                    "  f_idrecord,\n" +
                    "  f_tipodoc,\n" +
                    "  f_nodoc,\n" +
                    "  f_noexterno,\n" +
                    "  f_fecha,\n" +
                    "  f_monto,\n" +
                    "  f_balance,\n" +
                    "  f_idcliente,\n" +
                    "  f_pagado,\n" +
                    "  f_concepto,\n" +
                    "  f_registradopor,\n" +
                    "  f_anulado,\n" +
                    "  f_fecha_vencimiento,\n" +
                    "  f_idempresa\n" +
                    "FROM \n" +
                    " cxc.t_cuenta_cobrar where f_pagado = false AND f_idrecord = ${row.f_idrecord} AND f_idempresa = ${idempresa}"

            resultado = sqlService.GetQueryMap(sql)
            //println resultado.f_balance
            totalBalance += resultado.f_balance
            //println totalBalance
        }

        totalBalance -= pagoTotal

        if (totalBalance < 0) {
            errors.add("Al parecer el balance de una de las cuentas ha cambiado, consultalo de nuevo")
        }
        //errors.add("Al parecer el balance de la cuenta cambio consultalo de nuevo")

    //RETURNO ERROR
        errors

    }

    def validarNcfLog(JSONArray  ncflogs)
    {
        List<String> list = new ArrayList<String>()
        Integer countNcfActivos = 0
        ncflogs.each{ row ->
            countNcfActivos = row.factivo == true ? countNcfActivos + 1: countNcfActivos
            if ( row.fsecuenciainicial.toString().toInteger() > row.fsecuenciafinal.toString().toInteger()) {
                list.add('Secuencia incorrecta')
            }
        }

        if (countNcfActivos > 1)
        {
            list.add('Hay mas de 1 Secuencia activa. Solo puede tener 1 activa a la vez')
        }
        println countNcfActivos
        list
    }

    def validacionEstado(JSONObject data) {
        List<String> list = new ArrayList<String>()

        String sql = "SELECT\n" +
                "\t*\n" +
                "FROM\n" +
                "\tt_pedidos_estatus p \n" +
                "WHERE\n" +
                "\tp.f_idfactura = ${data.idfactura} and p.f_idestatus = ${data.idestado}"

        def rs = sqlService.GetQuery(sql)

        if (!rs.isEmpty()) {
            list.add("No se pudo cambiar el Estado")
        }

        if (data.idestado.toString().toInteger() == 5) {
            list.add("No se pudo cambiar el Estado")
        }

        String sql2 = "SELECT\n" +
                "\t*\n" +
                "FROM\n" +
                "\tt_pedidos_estatus p \n" +
                "WHERE\n" +
                "\tp.f_idfactura = ${data.idfactura} order by p.f_fecha DESC limit 1"

        def rs2 = sqlService.GetQuery(sql2)

        if (rs2.first().f_idestatus.toString().toInteger() >= data.idestado.toString().toInteger()) {
            list.add("No se pudo cambiar el Estado")
        }
        list
    }

    def validarOrdenesConRNC(JSONObject data) {
        List<String> list = new ArrayList<String>()
        Tncf ncf = Tncf.findById(data.ncf.toString().toLong())
        if (ncf.fValidaRnc) {

            if (data.rnc.toString().equals("")) {
                list.add("Esta orden requiere RNC");
            }
            if (data.razon_social.toString().equals("")) {
                list.add("Esta orden requiere la razon social/nombre de la empresa");
            }
        }

        list
    }


    def validarOrdenesConRNC(JSONObject data, Long idempresa) {
        List<String> list = new ArrayList<String>()
        Tncf ncf = Tncf.findById(data.ncf.toString().toLong())
        if (ncf.fValidaRnc) {

            if (data.rnc.toString().equals("")) {
                list.add("Esta orden requiere RNC");
            }
            if (data.razon_social.toString().equals("")) {
                list.add("Esta orden requiere la razon social/nombre de la empresa");
            }
        }

        if ( !this.ValidarVigenciaNcf(ncf.id, idempresa)) {
            list.add("Comprobante vencido");
        }


        list
    }

    def validarDetalleDelivery(org.grails.web.json.JSONArray  factura)
    {
        List<String> list = new ArrayList<String>()

        if (factura.detalle.isEmpty()) {
            list.add('No se ha agragado ningun producto.')
        } else {
            factura.each { row ->
                Tproductos producto =  Tproductos.findById(row.idproducto.toString().toLong())
                if (producto.fExistencia < 1 && producto.fControlinventario) {

                    list.add(producto.fDescripcion.toString().toUpperCase() +
                            ' producto agotado.')
                }
            }
        }

        list
    }
    def validarFactura(JSONObject  factura)
    {
        List<String> list = new ArrayList<String>()
        Integer decimales = 2
        BigDecimal total = factura.total.toString().toBigDecimal().setScale(decimales,RoundingMode.HALF_EVEN)


        if (
                factura.tipo_tarjeta.toString().toLong() == 0 &&
                factura.efectivo.toString().toBigDecimal() == 0 &&
                factura.cliente_id.toString().toLong() == 0
        ) {
            list.add("Seleccione un metodo de pago")
        }

        if (
                factura.tipo_tarjeta.toString().toLong() == 0 &&
                factura.efectivo.toString().toBigDecimal() > 0 &&
                factura.cliente_id.toString().toLong() == 0 &&
                factura.efectivo.toString().toBigDecimal().setScale(decimales, RoundingMode.HALF_EVEN) < factura.total.toString().toBigDecimal().setScale(decimales, RoundingMode.HALF_EVEN)
        ) {
            list.add("Pago descuadrado")
        }

        if (
                factura.cliente_id.toString().toLong() == 0 &&
                factura.tipo_tarjeta.toString().toLong() > 0 &&
                factura.efectivo.toString().toBigDecimal() == 0
        ) {

            if (factura.monto_tarjeta.toString().toBigDecimal() < factura.total.toString().toBigDecimal().setScale(decimales,RoundingMode.HALF_EVEN)) {
                list.add("Pago descuadrado")
            }

            if (factura.autorizacion_tarjeta.toString().equals("")) {
                list.add("En los pagos con tarjeta, se requiere el codigo de autorizacion.")
            }
        }

        if (factura.cliente_id.toString().toLong() > 0) {
            Tclientes cliente = Tclientes.findById(factura.cliente_id.toString().toLong())
            BigDecimal balanceDisponible = 0
            //println cliente.fBalance
            balanceDisponible = cliente.fLimiteCredito - cliente.fBalance

            if (balanceDisponible < factura.total.toString().toBigDecimal()) {
                list.add("Este monto sobrepasa el balance disponible del cliente")
            }
        }

        list
    }
//    def validarDetalleFactura(Long  idfactura)
//    {
//        List<String> list = new ArrayList<String>()
//        TdetalleFactura detalle =  TdetalleFactura.findAllByFIdfactura(idfactura)
//
//        detalle.eachWithIndex{ TdetalleFactura item, int i ->
//
//        }
//        list
//    }
    def validarTarjeta(JSONObject params)
    {
        List<String> list = new ArrayList<String>()

        if ( params.descripcion.toString().equals("")) {
            list.add('Descripcion no puede estar vacia.')
        }
        list
    }
    def validarBillete(JSONObject params)
    {
        List<String> list = new ArrayList<String>()

        if ( params.descripcion.toString().equals("")) {
            list.add('Descripcion no puede estar vacia.')
        }
        if ( params.valor.toString().equals("")) {
            list.add('Valor no puede estar vacia.')
        }
        list
    }

    def validarPreferencias(JSONObject params)
    {
        List<String> list = new ArrayList<String>()

        if ( params.nombre.toString().equals("")) {
            list.add('Nombre no puede estar vacia.')
        }
        list
    }

    def validarUsuario(JSONObject params,Long idempresa)
    {
        List<String> list = new ArrayList<String>()

        if ( params.nombre.toString().equals("")) {
            list.add('Nombre no puede estar vacio.')
        }

        if ( params.apellido.toString().equals("")) {
            list.add('Apellido no puede estar vacio.')
        }

        if ( params.contrasena.toString().equals("") && params.id.toString().toLong() == 0) {
            list.add('Contraseña no puede estar vacio.')
        }

        if ( params.usuario.toString().equals("")) {
            list.add('Nombre no puede estar vacio.')
        }

//        if ( params.email.toString().equals("")) {
//            list.add('E-mail no puede estar vacio.')
//        }

//        if ( params.telefono.toString().equals("")) {
//            list.add('Telefono no puede estar vacio.')
//        }
        if (!params.telefono.toString().equals("") && !params.telefono.toString().isNumber() ) {
            list.add('Telefono solo puede contener numeros.')
        }

        if (params.tipo_usuario.toString().toLong() < 1)
        {
            list.add("Te falto seleccionar un tipo")
        }

        if (params.idioma.toString().toLong() < 1)
        {
            list.add("Te falto seleccionar un idioma")
        }

        if (Tusuarios.findByFUsernameAndFIdempresa(params.usuario.toString(),idempresa) && params.id.toString().toLong() == 0)
        {
            list.add("Este usuario ya existe")
        }

        list
    }
    def validarMesa(JSONObject params, Long idEmresa)
    {
        List<String> list = new ArrayList<String>()

        if ( params.mesa.toString().toLong() < 0) {
            list.add('Mesa no puede estar vacia.')
        }

        if ( params.cubiertos.toString().toLong() < 0) {
            list.add('Mesa no puede estar vacia.')
        }
        if ( params.idarea.toString().toLong() == 0) {
            list.add('Seleccione un area')
        }
        if ( params.idseccion.toString().toLong() == 0) {
            list.add('Seleccione un seccion')
        }

        def mesa = Tmesas.find("from Tmesas as m where m.fIdempresa = :idempresa and m.fDescripcion = :id and m.fIdArea = :idarea and m.fIdSeccion = :idseccion", [
                id: params.mesa.toString(),
                idarea: params.idarea as Long,
                idseccion: params.idseccion as Long,
                idempresa: idEmresa
        ])

        if (mesa) {
            list.add('Ya existe esta mesa')
        }
        list
    }

    def validarTipoMoneda(JSONObject params)
    {
        List<String> list = new ArrayList<String>()

        if ( params.descripcion.toString().equals("")) {
            list.add('Descripcion no puede estar vacia.')
        }

        if ( params.siglas.toString().equals("")) {
            list.add('Siglas no puede estar vacia.')
        }


        list
    }

    def validarTasaMoneda(JSONObject params)
    {
        List<String> list = new ArrayList<String>()

        if (params.tasa.toString().toFloat() < 0)
        {
            list.add("Tasa no puede estar vacia")
        }
        list
    }

    def validarPropiedad(JSONObject params)
    {
        List<String> list = new ArrayList<String>()

        if ( params.descripcion.toString().equals("")) {
            list.add('Descripcion no puede estar vacia.')
        }

        if (params.categoria.toString().toLong() < 1)
        {
            list.add("Te falto seleccionar una categoria")
        }
        list
    }

    def validarListaComponentesProductos(List<Object> componentes)
    {
        Map<String, Object> errors = new HashMap<String, Object>()
        List<String> list = new ArrayList<String>()

        componentes.each{ componente ->
            if (!componente.productos.isEmpty())
            {
                componente.productos.each { producto ->
                    if (producto.cantidad < 1) {
                        list.add("La cantidad de productos no puede ser menor a 1 en los componentes.")
                    }
                }
            }
        }
        list
    }

    def validarListaPrecios(List<Object> precios)
    {
        Map<String, Object> errors = new HashMap<String, Object>()
        List<String> list = new ArrayList<String>()


        if (precios.size() > 0)
        {
            precios.eachWithIndex  { row, i->
                if (row.dia_list.toString().toLong() < 0)
                {
                    list.add("Te falto seleccionar el dia en la fila "+ (i + 1)+" de la tabla de precios.")
                }

                if (row.fNombreArea.toString().toLong() < 1)
                {
                    list.add("Te falto seleccionar el area en la fila "+(i + 1)+" de la tabla de precios.")
                }

                if (row.precio.toString().equals(""))
                {
                    list.add("Precio no puede estar vacia en la fila "+(i + 1)+" de la tabla de precios.")
                }

                if (row.precio.toString().toFloat() < 0)
                {
                    list.add("Precio no puede ser menor a 0 en la fila "+i+" de la tabla de precios.")
                }

                if (row.hora_inicial > row.hora_final)
                {
                    list.add("La hora inicial no puede ser mayor a la final")
                }

                if (row.hora_inicial > 2359 || row.hora_inicial < 0)
                {
                    list.add("La hora inicial no puede ser mayor a 2359 ni menor a 0")
                }

                if (row.hora_final > 2359 || row.hora_final < 0)
                {
                    list.add("La hora final no puede ser mayor a 2359 ni menor a 0")
                }
            }
        }
        list

    }

    def validarDetalleEntradaInventario(List<Object> precios)
    {
        Map<String, Object> errors = new HashMap<String, Object>()
        List<String> list = new ArrayList<String>()


        if (precios.size() > 0)
        {
            precios.eachWithIndex  { row, i->
                if (row.dia_list == 0)
                {
                    list.add("Te falto seleccionar el dia en la fila "+i+" de la tabla de precios.")
                }

                if (row.fNombreArea == 0)
                {
                    list.add("Te falto seleccionar el area en la fila "+i+" de la tabla de precios.")
                }

                if (row.precio.toString().equals(""))
                {
                    list.add("Precio no puede estar vacia en la fila "+i+" de la tabla de precios.")
                }

                if (row.precio < 0)
                {
                    list.add("Precio no puede ser menor a 0 en la fila "+i+" de la tabla de precios.")
                }

                if (row.hora_inicial > row.hora_final)
                {
                    list.add("La hora inicial no puede ser mayor a la final")
                }

                if (row.hora_inicial > 24 || row.hora_inicial < 0)
                {
                    list.add("La hora inicial no puede ser mayor a 24 ni menor a 0")
                }

                if (row.hora_final > 24 || row.hora_final < 0)
                {
                    list.add("La hora final no puede ser mayor a 24 ni menor a 0")
                }
            }
        }
        list

    }

    def validarSalidaInventario(JSONObject params)
    {
        List<String> list = new ArrayList<String>()

        if ( params.nota.toString().equals("")) {
            list.add('Nota no puede estar vacia.')
        }

        if ( Integer.parseInt(params.id_concepto)  < 1) {
            list.add('Seleccione el concepto')
        }

        list
    }
    def validarEntradaInventario(JSONObject params)
    {
        List<String> list = new ArrayList<String>()

        if ( params.nota.toString().equals("")) {
            list.add('Nota no puede estar vacia.')
        }

//        if ( Integer.parseInt(params.id_suplidor)  < 1) {
//            list.add('Seleccione el suplidor')
//        }

        if ( Integer.parseInt(params.id_concepto)  < 1) {
            list.add('Seleccione el concepto')
        }

        list
    }


    def validarProducto(JSONObject params,Long idempresa)
    {
        Map<String, Object> errors = new HashMap<String, Object>()
        List<String> list = new ArrayList<String>()

        if ( params.referencia.toString().equals("")) {
            list.add('Referencia no puede estar vacia.')
        }
        if (params.plato && params.productos_componentes.size() < 1) {
            list.add('El producto fue seleccionado como plato por favor, agrege los componentes.')
        }

        if ( params.descripcion.toString().equals("")) {
            list.add('Descripcion no puede estar vacia.')
        }

        if ( params.precio.toString().equals("")) {
            list.add('Precio no puede estar vacio.')
        }else {
            if ( (params.precio as BigDecimal)  < 0) {
                list.add('Precio no puede ser menor a 0')
            }
        }


        if ( params.impuesto.toString().equals("")) {
            list.add('Impuesto no puede estar vacio.')
        }

//        if ( params.reorden.toString().equals("")) {
//            list.add('Reorden no puede estar vacio.')
//        }

//        if ( params.makeup.toString().equals("")) {
//            list.add('Makeup no puede estar vacio.')
//        }

        if ( params.categoria.toString().equals("0")) {
            list.add('Seleccione una categoria')
        }

        if ( params.localizaciones.toString().equals("0")) {
            list.add('Seleccione una localizacion')
        }

//        if ( params.nivel_maximo.toString().equals("")) {
//            list.add('Nivel maximo no puede estar vacio.')
//        }

        if ( params.unidad.toString().equals("0")) {
            list.add('Seleccione una unidad')
        }
//
//        if ( params.maximo_descuento.toString().equals("")) {
//            list.add('Descuento maximo no puede estar vacio.')
//        }

//        if ( params.ultimo_costo.toString().equals("")) {
//            list.add('Ultimo costo no puede estar vacio.')
//        }
//
//        if ( params.ultimo_costo1.toString().equals("")) {
//            list.add('Ultimo costo 1  no puede estar vacio.')
//        }

//        if ( params.ultimo_costo2.toString().equals("")) {
//            list.add('Ultimo costo 2  no puede estar vacio.')
//        }

        if ( params.vencimiento.toString().equals("")) {
            list.add('Fecha de vencimiento  no puede estar vacio.')
        }



        if (Tproductos.findByFReferenciaAndFIdempresa(params.referencia,idempresa) &&  params.id.toString().equals("") )
        {
            list.add('Existe un producto con esta referencia.')
        }

       list
    }
    def validarCliente(JSONObject params)
    {
        List<String> list = new ArrayList<String>()

        if ( params.nombre.toString().equals("")) {
            list.add('Nombre no puede estar vacio.')
        }

        if ( params.apellido.toString().equals("")) {
            list.add('Apellido no puede estar vacio.')
        }
//
//        if ( params.codigo.toString().equals("")) {
//            list.add('Codigo no puede estar vacio.')
//        }

        if ( !params.cedula.toString().equals("") ) {
//            if ( params.cedula.toString().trim().length() != 11) {
//                list.add('Cedula debe tener una longitud de 11 digitos')
//
//            }

            if (Tclientes.findByFCedula(params.cedula.toString()) && params.id.toString().toLong() == 0)
            {
                list.add('Esta cedula pertenece a otro cliente')
            }

        }

//        if (Tclientes.findByFCodigoCliente(params.codigo.toString()) && params.id.toString().toLong() == 0)
//        {
//            list.add('Esta codigo pertenece a otro cliente')
//        }

//        if ( params.email.toString().equals("")) {
//            list.add('E-mail no puede estar vacio.')
//        }

        if (params.limite_credito.toString().equals("") || params.limite_credito.toString().toFloat() < 0) {
            list.add('El <b>limite de credito</b> no puede ser menor a 0')
        }
        if (!params.limite_credito.toString().equals("")) {

            if (params.dias_credito.toString().equals("")) {
                list.add('Es necesario los <b> Dias de credito</b>')
            }
        }

//        if ( params.limite_credito_compania.toString().toFloat() < 0) {
//            list.add('El limite de credito de compañia no puede ser menor a 0')
//        }

//        if ( params.balance.toString().toBigDecimal() < 0) {
//            list.add('El balance no puede ser menor a 0')
//        }

//        if ( params.cbcompania.toString().toLong() == 0) {
//            list.add('Seleccione una compañia')
//        }

//        if ( params.fecha_nacimiento.toString().equals("")) {
//            list.add('Fecha de nacimiento no puede estar vacio')
//        }



        if ( !params.usuario.toString().equals("")) {

            if ( params.password.toString().equals("")) {
                list.add('Contraseña no puede estar vacia')
            }
        }

       list
    }

    def validarCamarero(JSONObject params,Long empresa)
    {
        List<String> list = new ArrayList<String>()

        if ( params.nombre.toString().equals("")) {
            list.add('Nombre no puede estar vacio.')
        }

        if ( params.apellido.toString().equals("")) {
            list.add('Apellido no puede estar vacio.')
        }

        if ( params.cedula.toString().equals("")) {
            list.add('Cedula no puede estar vacio.')

        }

        if ( params.cedula.toString().trim().length() != 11) {
            list.add('Cedula debe tener una longitud de 11 digitos')

        }

        if (Tcamareros.findByFCedulaAndFIdempresa(params.cedula.toString(),empresa) && params.id.toString().toLong() == 0)
        {
            list.add('Esta cedula pertenece a otro camarero')
        }


        if ( params.sueldo.toString().toBigDecimal() < 0) {
            list.add('El sueldo no puede ser menor a 0')
        }

        if ( params.cbarea.toString().toLong() == 0) {
            list.add('Seleccione una area')
        }
       list
    }

    def ValidarVigenciaNcf(Long id, Long empresa) {
        boolean valido = true
        Tncf tncf = Tncf.findByIdAndFIdempresa(id, empresa);
        TlogsNcf logs = TlogsNcf.findByFTipoNcfAndFIdempresaAndFActivo(id,empresa,true);

        if(tncf && logs) {
            if (tncf.fValidaFechaVigencia) {
               if (logs.fFechaFinal >= new Date()) {
                   valido = true
               } else {
                   valido = false
               }
            } else {
                valido = true
            }
        } else {
            valido = false
        }
        valido
    }

    boolean ValidarNCFConRNC(Long id, Long empresa) {
        //Validar si el NCF al momento de registrar en la factura
        // Lleva RNC
        Tncf tncf = Tncf.findByIdAndFIdempresa(id, empresa);

        return tncf.fValidaRnc
    }

    def validarIdNodo(String idnodo) {
        Map tprinterSession = sqlService.GetQueryMap("select * from t_printer_session where f_id_client_printer = '${idnodo.toString()}' order by f_fecha DESC limit 1 ")
        return !tprinterSession.isEmpty()
    }

    def validacionCuadreCaja(String usuario, String password, Long idempresa) {
        Map response = sqlService.GetQueryMap(" select * from t_usuarios u " +
                                "where u.f_username = '${usuario}' " +
                                "and u.f_password ='${password.toString().encodeAsMD5()}' and" +
                                " u.f_cuadre = true and" +
                                " u.f_idempresa = ${idempresa}")
        return !response.isEmpty()
    }
    def validarPermisoPorcientoLey(String usuario, String password, Long idempresa) {
        Map response = sqlService.GetQueryMap(" select * from t_usuarios u " +
                                "where u.f_username = '${usuario}' " +
                                "and u.f_password ='${password.toString().encodeAsMD5()}' and" +
                                " u.f_porciento_ley = true and" +
                                " u.f_idempresa = ${idempresa}")
        return !response.isEmpty()
    }

    def validarMensajero(JSONObject params) {
        List<String> list = new ArrayList<String>()

        if ( params.f_nombre.toString().equals("")) {
            list.add('Nombre no puede estar vacio.')
        }

        if (params.f_zona.toString().toLong() < 1)
        {
            list.add("Te falto seleccionar un zona")
        }


        list
    }

    String validarRNC(String rnc) {
        String  respuesta = ""
        Map rs;
        try {

            URL url = new URL("http://jqmicrosistemas.com/rnc/run.php?rnc=$rnc");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            String charset = "UTF-8";
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream()), charset));
            respuesta = br.readLine();
            respuesta

        }catch(Exception e){
            e.printStackTrace()
        }
        respuesta
    }


    def validarPedido(String idorden, Long idfactura, Long idempresa) {

        List<String> list = new ArrayList<String>()
        Map factura = sqlService.GetQueryMap("select \n" +
                "\t* \n" +
                "from \n" +
                "\tt_facturas f \n" +
                "where \n" +
                "\t(f.f_idrecord = ${idfactura}\n" +
                "OR\n" +
                "\tf_tipo_documento_factura || to_char(f_numero_orden, 'FM000000') = '${idorden.toUpperCase()}') and f_idempresa = ${idempresa}");

        if ( factura.isEmpty() ) {
            list.add("Esta orden ha sido facturada")
        }

        list
    }


    def validarFacturasAbiertas(Long idempresa) {

        List<String> list = new ArrayList<String>()

        if (funcionesSQLService.getTotalPedidos(idempresa)[0].total_pedidos > 0) {
            list.add("Existen facturas abiertas")
        }

        list
    }


    def serviceMethod() {

    }
}
