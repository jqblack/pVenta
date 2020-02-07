package manube_v2

import grails.converters.JSON
import grails.gorm.transactions.Transactional
import org.grails.web.json.JSONArray
import org.grails.web.json.JSONObject

import java.sql.Blob
import java.text.SimpleDateFormat


@Transactional
class FuncionesSQLService {
    SqlService sqlService
    HelperService helpers
    ReportService reportService

    def listaCategorias(Long idEmpresa) {
        TproductosCategorias.findAllByFIdempresa(idEmpresa)
    }

    def listaAreas(Long idEmpresa) {
        Tareas.findAllByFIdempresa(idEmpresa)
    }

    def listaSecciones(Long idEmpresa) {
        TareasSeccion.findAllByFIdempresa(idEmpresa)
    }

    List<Map<String, Object>> ListarSessionesPuntoVentasActivas(Long idempresa) {
        String sql = "SELECT\n" +
                "l.f_token as f_token,\n" +
                "l.f_usuario as f_usuario,\n" +
                "to_char(l.f_fecha,'dd-MM-yyyy') as f_fecha,\n" +
                "l.f_imei as f_ip\n" +
                "FROM web.t_login l where l.f_idempresa = $idempresa and l.f_activo = true;";
        sqlService.GetQuery(sql);
    }

    boolean LogoutSessionPuntoVenta(String token, Long idempresa) {
        try {
            String sql = "UPDATE web.t_login set f_activo = false where f_idempresa = $idempresa and f_token = '$token'";
            sqlService.EjecutarSql(sql);
            return true;
        } catch (Exception e) {
            return false
        }

    }

    def listaLocalizaciones(Long idEmpresa) {
        Tlocalizaciones.findAllByFIdempresa(idEmpresa)
    }

    def listaNcf(Long idEmpresa) {
        Tncf.findAllByFIdempresa(idEmpresa)
    }

    def listaUnidades(Long idEmpresa) {
        Tunidades.findAllByFIdempresa(idEmpresa)
    }

    def guardarProducto(JSONObject data, Long idEmpresa) {


        def producto

        if (!data.id.toString().equals("") && data.id.toString().toLong() > 0) {
            producto = Tproductos.findById(data.id.toString().toLong())
        } else {
            producto = new Tproductos()
            producto.fExistencia = 0
        }

        producto.fReferencia = data.referencia.toString().trim().toUpperCase()
        producto.fDescripcion = data.descripcion.toString().toUpperCase()
        producto.fMensaje = data.mensaje
        producto.fTax = data.impuesto ? data.impuesto as BigDecimal : 0
        producto.fIdlocalizacion = data.localizaciones as Long
        producto.fIdcategoria = data.categoria as int
        producto.fIdunidad = data.unidad as int
        producto.fFechaVencimiento = new Date(data.vencimiento.toString())
        producto.fControlinventario = (data.control_inventario) ? true : false
        producto.fDescontinuado = (data.descontinuado) ? true : false
        producto.fPlato = (data.plato) ? true : false
        producto.fVentasDecimales = (data.ventas_decimales) ? true : false
        producto.fReceta = (data.receta) ? true : false
        producto.fComanda = (data.comandas) ? true : false
        producto.fKit = (data.combo) ? true : false

        producto.fPrecio = data.precio ? data.precio as BigDecimal : 0
        producto.fPrecioDelivery = data.precio_delivery ? data.precio_delivery as BigDecimal : 0
        producto.fUltimocosto = data.ultimo_costo ? data.ultimo_costo as BigDecimal : 0
        producto.fUltimocosto1 = data.ultimo_costo1 ? data.ultimo_costo1 as BigDecimal : 0
        producto.fUltimocosto2 = data.ultimo_costo2 ? data.ultimo_costo2 as BigDecimal : 0
        producto.fLimitemaximo = data.nivel_maximo ? data.nivel_maximo as BigDecimal : 0
        producto.fLimiteminimo = data.nivel_minimo ? data.nivel_minimo as BigDecimal : 0
        producto.fReorden = data.reorden ? data.reorden as Integer : 0
        producto.fTragos = data.tragos ? data.tragos as Integer : 0

//        producto.fExistencia = data.existencia as float
        producto.fMaxdescuento = data.maximo_descuento ? data.maximo_descuento as BigDecimal : 0
        producto.fMakeup = data.makeup ? data.makeup as BigDecimal : 0
        producto.fIdempresa = idEmpresa
        producto.fFecha = sqlService.GetNow()


        if (producto.save(failOnError: true)) {
            Collection colleccion1 = []
            colleccion1.add(producto.id)


            if (!data.fotos.isEmpty()) {
                String Sql1 = " delete  TproductosFotos as b where b.fIdproducto = ? "
                TproductosFotos.executeUpdate(Sql1, colleccion1)

                data.fotos.each { row ->
                    def foto = new TproductosFotos(
                            fIdproducto: producto.id,
                            fIdempresa: idEmpresa,
                            fMenu: row.menu,
                            fFoto: row.imagen_base64.toString().decodeBase64(),
                            fNombre: producto.fReferencia
                    )
                    foto.save(failOnError: true)
                }
            }


            if (!data.precios.isEmpty()) {
                String Sql1 = " delete TproductosPrecios as b where b.fIdproducto = ? "
                TproductosPrecios.executeUpdate(Sql1, colleccion1)

                data.precios.eachWithIndex { row, i ->
                    def precio = new TproductosPrecios(
                            fIdproducto: producto.id,
                            fIdarea: row.fNombreArea,
                            fDia: row.dia_list,
                            fPrecio: row.precio,
                            fComentario: row.comentario,
                            fDoble: row.doble,
                            fPrecioActivo: row.activo,
                            fHoraInicio: row.hora_inicial,
                            fHoraFin: row.hora_final,
                            fIdempresa: idEmpresa
                    )
                    precio.save(failOnError: true)
                }
            }

            if (!data.plato) {
                String Sql2 = " delete  TproductosComponentes as b where b.fIdproducto = ? "
                TproductosComponentes.executeUpdate(Sql2, colleccion1)

                String Sql3 = " delete  TproductosComOpciones as b where b.fIdproducto = ? "
                TproductosComOpciones.executeUpdate(Sql3, colleccion1)
            }

            if (data.productos_componentes && data.productos_componentes.size() > 0) {

                String Sql2 = " delete  TproductosComponentes as b where b.fIdproducto = ? "
                TproductosComponentes.executeUpdate(Sql2, colleccion1)

                String Sql3 = " delete  TproductosComOpciones as b where b.fIdproducto = ? "
                TproductosComOpciones.executeUpdate(Sql3, colleccion1)

                data.productos_componentes.eachWithIndex { row, i ->
                    def componenteProducto = new TproductosComponentes(
                            fIdproducto: producto.id,
                            fIdcomponente: row.id,
                            fStandard: row.standard
                    )

//                    println(row.productos[0])
                    componenteProducto.save(failOnError: true)
                    row.productos.each { compronente_producto ->
                        def productosComOpciones = new TproductosComOpciones(
                                fIdproducto: compronente_producto.id as Long,
                                fIdcomponente: compronente_producto.componente_id.toString() as Long,
                                fStandard: compronente_producto.standard,
                                fQty: compronente_producto.cantidad.toString().toBigDecimal(),
                                fIdproductoComponente: componenteProducto.id as Long,
                                fActivo: true
                        )
                        productosComOpciones.save(failOnError: true)
                    }


                }
            }
        }
        producto
    }


    def guardarEntrada(JSONObject data, Long idEmpresa, Long idUser) {
        def entrada = new TentradaInventario()

        def tipoDoc = Ttiposdocumentos.findByFIdempresaAndFIdordenador(idEmpresa, 8).fTipodoc
        entrada.fIdempresa = idEmpresa as Long
        entrada.fHechopor = idUser as Long
        //entrada.fIdsuplidor = data.id_suplidor.toString().toLong()
        entrada.fIdconcepto = data.id_concepto.toString().toLong()
        entrada.fComentario = data.nota.toString()
        entrada.fTipo = tipoDoc
        entrada.fNodocumento = sqlService.GetSecuencia(tipoDoc, idEmpresa)
        entrada.fFecha = sqlService.GetNow()

        if (entrada.save(failOnError: true)) {
            data.detalle.each { row ->
                def detalle = new TentradaInventarioDetalle()
                detalle.fIdentrada = entrada.id
                detalle.fPrecio = row.precio.toString().toBigDecimal()
                detalle.fCantidad = row.cantidad.toString().toBigDecimal()
                detalle.fCosto = row.costo.toString().toBigDecimal()
                detalle.fIdproducto = row.id.toString().toLong()
                detalle.fFecha = sqlService.GetNow()
                detalle.save()
            }
        }
        entrada
    }

    def entegarComanda(List<Object> data) {
        if (!data.isEmpty()) {
            data.each { row ->
                sqlService.EjecutarSql("UPDATE t_detalle_factura SET f_comanda = true where f_idcomanda = ${row.f_idcomanda}")
            }
            return true
        }

        return false
    }

    def entegarComanda(Long detalle_id) {
        sqlService.EjecutarSql("UPDATE t_detalle_factura SET f_comanda = true where f_idrecord = ${detalle_id}")
        true
    }

    def guardarUsuario(JSONObject data, Long idEmpresa) {
        def usuario

        if (data.id.toString().toLong() > 0) {
            usuario = Tusuarios.findById(data.id.toString().toLong())
            if (!data.contrasena.toString().equals("") && !usuario.fPassword.equals(data.contrasena.toString().encodeAsMD5())) {
                usuario.fPassword = data.contrasena.toString().encodeAsMD5()
            }
        } else {
            usuario = new Tusuarios()
            usuario.fPassword = data.contrasena.toString().encodeAsMD5()
        }

        usuario.fIdempresa = idEmpresa as Long
        usuario.fNombre = data.nombre.toString()
        usuario.fApellido = data.apellido.toString()
        usuario.fUsername = data.usuario.toString()
        usuario.fEmail = data.email.toString()
        usuario.fTelefono = data.telefono.toString()
        usuario.fIdidioma = data.idioma.toString().toLong()
        usuario.fActivo = data.fActivo
        usuario.fDescuento = data.fDescuento
        usuario.fEstadoCaja = data.fEstadoCaja
        usuario.fRecibo = data.fRecibo
        usuario.fCambioPrecio = data.fCambioPrecio
        usuario.fFacturaCredito = data.fFacturaCredito
        usuario.fFacturaOficial = data.fFacturaOficial
        usuario.fActivarPedidos = data.fActivarPedidos
        usuario.fTaxfree = data.fTaxfree
        usuario.fAbrirCaja = data.fAbrirCaja
        usuario.fCuadre = data.fCuadre
        usuario.fAnularFactura = data.fAnularFactura
        usuario.fAnularLinea = data.fAnularLinea
        usuario.fPorcientoLey = data.fPorcientoLey
        usuario.fTipoUsuarioPuntoVenta = data.tipo_usuario.toString().toInteger()


        if (usuario.save(failOnError: true)) {
            if (data.id.toString().toLong() > 0) {
                String Sql1 = " delete TpermisosUsuario as b where b.fIdusuario = :id "
                TclientesContactos.executeUpdate(Sql1, [id: data.id as Long])
            }
            data.permisos.each { row ->

                //if (row.isadd) {
                def permiso = new TpermisosUsuario()
                permiso.fIdopcion = row.id.toString().toLong()
                permiso.fIdusuario = usuario.id
                permiso.save()
                //  }
            }
        }
        usuario
    }

    def guardarPreferencias(JSONObject data) {
        Tempresas preferencia

        if (data.f_idrecord.toString().toLong() > 0) {
            preferencia = Tempresas.findById(data.f_idrecord.toString().toLong())
        } else {
            preferencia = new Tempresas()
        }

        preferencia.fNombre = data.f_nombre.toString()
        preferencia.fTelefono = data.f_telefono.toString()
        preferencia.fEmail = data.f_email.toString()
        preferencia.fWeb = data.f_web.toString()
        preferencia.fImpuestoIncluido = data.f_impuesto_incluido.toString().toBoolean()
        preferencia.fCobrarPorcientoLey = data.f_cobrar_porciento_ley.toString().toBoolean()
        preferencia.fImpresionDetalleFactura = data.f_impresion_detalle_factura.toString().toBoolean()
        preferencia.fDireccion = data.f_direccion.toString()
        preferencia.fHeaderFacturasPequenas = data.f_header_facturas_pequenas.toString()
        preferencia.fHeader = data.f_header.toString()
        preferencia.fLema = data.f_lema.toString()
        preferencia.fPrecioEnvio = data.f_precio_envio?data.f_precio_envio.toString().toBigDecimal():0.00;
        preferencia.fNcfDefectoDelivery = data.f_ncf_defecto_delivery.toString().toLong();
        preferencia.fTipoPapelImpresion = data.fTipoPapelImpresion.toString().toLong();
        preferencia.fPorcientoLey = data.f_porciento_ley?data.f_porciento_ley.toString().toBigDecimal():0.00;

        if (!data.f_logo.toString().equals("0")) {
            preferencia.fFoto = data.f_logo.decodeBase64()
        }

        preferencia.fMensajeOrden = data.f_mensaje_orden.toString()
        preferencia.fMensajeFactura = data.f_mensaje_factura.toString()
        preferencia.fLatitud = data.f_latitud.toString()
        preferencia.fLongitud = data.f_longitud.toString()

        preferencia.fPedidosMinimos = (data.f_pedidos_minimos.toString().equals("")) ? 0 : data.f_pedidos_minimos.toString().toBigDecimal()

        preferencia.fHorario1 = data.f_horario_7.toString()
        preferencia.fHorario2 = data.f_horario_1.toString()
        preferencia.fHorario3 = data.f_horario_2.toString()
        preferencia.fHorario4 = data.f_horario_3.toString()
        preferencia.fHorario5 = data.f_horario_4.toString()
        preferencia.fHorario6 = data.f_horario_5.toString()
        preferencia.fHorario7 = data.f_horario_6.toString()


        preferencia.save(failOnError: true)

        if (!data.f_configuraciones_impresion.isEmpty()) {
            this.guardarPreferenciasProcesosImpresion(data.f_configuraciones_impresion, preferencia.id)
        }

        preferencia
    }

    def guardarPreferenciasProcesosImpresion(JSONArray data, Long idempresa) {
        sqlService.Ejecutarsql("DELETE FROM cfg.t_preferencias_procesos_impresion WHERE f_idempresa = ${idempresa}")
        data.each { row ->
            String sql = " \n" +
                    "    INSERT INTO \n" +
                    "  cfg.t_preferencias_procesos_impresion\n" +
                    "(\n" +
                    "  f_idproceso_impresion,\n" +
                    "  f_idconfiguracion_printer,\n" +
                    "  f_idempresa\n" +
                    ")\n" +
                    "VALUES (\n" +
                    "  ${row.idproceso},\n" +
                    "  ${row.idconfiguracion},\n" +
                    "  ${idempresa}\n" +
                    ");"
            sqlService.Ejecutarsql(sql)
        }
    }

    def guardarSalida(JSONObject data, Long idEmpresa, Long idUser) {
        def salida = new TsalidaInventario()

        def tipoDoc = Ttiposdocumentos.findByFIdempresaAndFIdordenador(idEmpresa, 9).fTipodoc

        salida.fIdempresa = idEmpresa as Long
        salida.fHechopor = idUser as Long
        salida.fIdconcepto = data.id_concepto as Long
        salida.fComentario = data.nota.toString()
        salida.fNodocumento = sqlService.GetSecuencia(tipoDoc, idEmpresa)
        salida.fFecha = sqlService.GetNow()

        if (salida.save(failOnError: true)) {
            data.detalle.each { row ->
                def detalle = new TsalidaDetalle()
                detalle.fIdsalida = salida.id
                detalle.fPrecio = row.precio.toString().toBigDecimal()
                detalle.fCantidad = row.cantidad.toString().toBigDecimal()
                detalle.fCosto = row.costo.toString().toBigDecimal()
                detalle.fIdproducto = row.id as Long
                detalle.fFecha = sqlService.GetNow()
                detalle.save()
            }
        }
        salida
    }

    def guardarCliente(JSONObject data, Long idEmpresa) {
        Tclientes cliente
        if (!data.id.toString().equals("") && data.id.toString().toLong() > 0) {
            cliente = Tclientes.findByIdAndFIdempresa(data.id.toString().toLong(), idEmpresa)
        } else {
            cliente = new Tclientes()
            cliente.fBalance = 0

        }

        cliente.fIdempresa = idEmpresa as Long
        cliente.fNombre = data.nombre.toString()
        cliente.fApellido = data.apellido.toString()
        cliente.fCodigoCliente = data.codigo.toString()
        // cliente.fIdcompania = !data.cbcompania.toString().equals("") ? data.cbcompania.toString().toLong() : 0
        cliente.fIdcompania = 0
        cliente.fCedula = data.cedula.toString()
        cliente.fEmailPrincipal = data.email.toString()
        cliente.fLimiteCredito = !data.limite_credito.toString().equals("") ? data.limite_credito.toString().toBigDecimal() : 0
        cliente.fLimiteCreditoCompania = 0
        // cliente.fLimiteCreditoCompania = !data.limite_credito_compania.toString().equals("") || !data.limite_credito_compania.toString().equals("0") ? data.limite_credito_compania.toString().toBigDecimal() : 0
        // cliente.fBalance = !data.balance.toString().equals("") ? data.balance.toString().toBigDecimal() : 0
        cliente.fDireccion = data.direccion.toString()
        cliente.fTieneCredito = data.hasCredito.toString().toBoolean()
        cliente.fAccesoweb = data.acceso_web.toString().toBoolean()
        cliente.fEmpresa = data.empresa.toString().toBoolean()
        cliente.fUsuario = data.usuario.toString()
        cliente.fPassword = !data.password.toString().equals("") ? data.password.toString().encodeAsMD5() : ""
        cliente.fFechaNacimiento = new Date(data.fecha_nacimiento.toString())
        cliente.fDiasCredito = !data.dias_credito.toString().equals("") ? data.dias_credito.toString().toInteger() : 0
        cliente.fFecha = sqlService.GetNow()

        if (cliente.save(failOnError: true)) {
            if (!data.contacto.isEmpty()) {
                String Sql1 = " delete TclientesContactos as b where b.fIdcliente = :id "
                TclientesContactos.executeUpdate(Sql1, [id: data.id as Long])

                data.contacto.each { row ->
                    def contacto = new TclientesContactos()

                    contacto.fIdempresa = idEmpresa
                    contacto.fIdcliente = cliente.id
                    contacto.fIdtipo = row.id_tipo.toString().toBigDecimal()
                    contacto.fContacto = row.contacto.toString()

                    contacto.save(failOnError: true)
                }
            }
        }
        cliente
    }

    def guardarNcf(JSONObject data, Long idEmpresa) {
        Tncf ncf
        if (data.id.toString().toLong() > 0) {
            ncf = Tncf.findByIdAndFIdempresa(data.id.toString().toLong(), idEmpresa)
        } else {
            ncf = new Tncf()
        }

        ncf.fDescripcion = data.descripcion.toString().toUpperCase()
        ncf.fIdempresa = idEmpresa
        ncf.fTipo = data.tipo.toString().toUpperCase()
        ncf.fReorden = data.reorden.toString().toInteger()
        ncf.fOrden = data.orden.toString().toInteger()
        ncf.fVisible = data.visible
        ncf.fValidaFechaVigencia = data.validavigencia
        ncf.fValidaRnc = data.validarnc

        ncf.save(failOnError: true)
        ncf
    }

    def guardarEstado(JSONObject data) {
        String sql = "INSERT INTO \n" +
                "\tt_pedidos_estatus \n" +
                "    \t(\n" +
                "        \tf_idestatus,\n" +
                "        \tf_idfactura,\n" +
                "        \tf_intervalo\n" +
                "        ) \n" +
                "    values\n" +
                "    \t(\n" +
                "        \t${data.idestado.toString().toInteger()},\n" +
                "            ${data.idfactura.toString().toInteger()},\n" +
                "            get_estatus_intervalo(${data.idfactura})\n" +
                "            \n" +
                "        )"
        sqlService.Ejecutarsql(sql)
        return true
    }

    def guardarEstado(Long idfactura, Long idestado) {
        String sql = "INSERT INTO \n" +
                "\tt_pedidos_estatus \n" +
                "    \t(\n" +
                "        \tf_idestatus,\n" +
                "        \tf_idfactura,\n" +
                "        \tf_intervalo\n" +
                "        ) \n" +
                "    values\n" +
                "    \t(\n" +
                "        \t${idestado},\n" +
                "            ${idfactura},\n" +
                "            get_estatus_intervalo(${idfactura})\n" +
                "            \n" +
                "        )"
        sqlService.Ejecutarsql(sql)
        return true
    }

    List<Map<String, Object>> getCuentasPorCobrarByClienteId(Long idcliente, Long idempresa) {
        List resultado
        String sql = "SELECT \n" +
                "  c.f_tipodoc||to_char(c.f_nodoc,'FM000000') as f_documento,\n" +
                "  c.f_idrecord,\n" +
                "  c.f_tipodoc,\n" +
                "  c.f_nodoc,\n" +
                "  c.f_noexterno,\n" +
                "  to_char(c.f_fecha, 'dd/MM/yyyy HH:MM:SS') as f_fecha,\n" +
                "  c.f_monto,\n" +
                "  c.f_balance,\n" +
                "  c.f_idcliente,\n" +
                "  c.f_pagado,\n" +
                "  c.f_concepto,\n" +
                "  c.f_registradopor,\n" +
                "  c.f_anulado,\n" +
                "  to_char(c.f_fecha_vencimiento, 'dd/MM/yyyy') as f_fecha_vencimiento,\n" +
                "  c.f_idempresa,\n" +
                "  cli.f_nombre || ' ' || cli.f_apellido as f_nombre_cliente,\n" +
                "  case when cli.f_direccion = 'null' then '' else cli.f_direccion END as f_direccion\n" +
                "FROM \n" +
                "  cxc.t_cuenta_cobrar c inner join t_clientes cli ON c.f_idcliente = cli.f_idrecord\n" +
                "WHERE\n" +
                "\tc.f_idempresa = ${idempresa} AND\n" +
                "    c.f_idcliente = ${idcliente} AND\n" +
                "    c.f_pagado = FALSE;"
        resultado = sqlService.GetQuery(sql)
        return resultado
    }

    def facturarPedido(String idorden, Long idfactura, Long idmensajero, Long idempresa, Long idusuario) {
        //def factura = Tfacturas.findById(idfactura)
        def factura = sqlService.GetQueryMap("select \n" +
                "\t* \n" +
                "from \n" +
                "\tt_facturas f \n" +
                "where \n" +
                "\t(f.f_idrecord = ${idfactura}\n" +
                "OR\n" +
                "\tf_tipo_documento_factura || to_char(f_numero_orden, 'FM000000') = '${idorden.toUpperCase()}') and f_idempresa = ${idempresa}");

        Integer idEstatusCerrado = 5
        Long idOrdenadorDocumento = 6
        def tipoDocumento = Ttiposdocumentos.findByFIdordenadorAndFIdempresa(idOrdenadorDocumento, idempresa)
        def numeroSecuenciaDocumento = sqlService.GetSecuencia(tipoDocumento.fTipodoc, idempresa)
        def numeroSecuenciaNCF = sqlService.Get_Secuencia_Ncf(factura.f_tipo_ncf as Integer)

        String sql = "UPDATE t_facturas SET " +
                "f_tipo_documento_factura = '${tipoDocumento.fTipodoc}'," +
                "f_numero_factura = ${numeroSecuenciaDocumento}," +
                "f_numero_ncf = '${numeroSecuenciaNCF}', " +
                "f_mensajero = ${idmensajero}, " +
                "f_facturada = true, " +
                "f_envio = (select e.f_precio_envio from cfg.t_empresas e where e.f_idrecord = ${idempresa}), " +
                "f_fecha_registro_factura = NOW(), " +
                "f_facturado_por = ${idusuario} " +
                "WHERE f_idrecord = ${factura.f_idrecord} "

        guardarEstado(factura.f_idrecord as Long, idEstatusCerrado)

        sqlService.Ejecutarsql(sql)

        //reportService.printFactura(idfactura.toString(), idempresa.toString())
        return Tfacturas.findById(factura.f_idrecord as Long)
    }

    def guardarCuentaPorCobrar(JSONObject data, Long idempresa, Long idusuario) {
        Long idOrdenadorDocumento = 7
        def tipoDocumento = Ttiposdocumentos.findByFIdordenadorAndFIdempresa(idOrdenadorDocumento, idempresa)
        def numeroSecuenciaDocumento = sqlService.GetSecuencia(tipoDocumento.fTipodoc, idempresa)
        Map response

        String sql = " WITH t AS ( INSERT INTO \n" +
                "  cxc.t_cuenta_cobrar\n" +
                "(\n" +
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
                ")\n" +
                "VALUES (\n" +
                "  '${tipoDocumento.fTipodoc}',\n" +
                "  '${numeroSecuenciaDocumento}',\n" +
                "  '${tipoDocumento.fTipodoc}' || to_char(${numeroSecuenciaDocumento},'FM000000'),\n" +
                "  NOW(),\n" +
                "  ${data.monto},\n" +
                "  ${data.monto},\n" +
                "  ${data.cliente_id},\n" +
                "  FALSE,\n" +
                "  '${data.concepto.toString()}',\n" +
                "  ${idusuario},\n" +
                "  FALSE,\n" +
                "  current_date + (select COALESCE(c.f_dias_credito,0) from t_clientes c where c.f_idrecord = ${data.cliente_id}),\n" +
                "  ${idempresa}\n" +
                ") RETURNING * ) SELECT * FROM t;"
        //sqlService.Ejecutarsql(sql)
        response = sqlService.GetQueryMap(sql)
        //println response.f_idrecord
        response
    }

    def guardarCuentaPorCobrar(Tfacturas factura) {
        Long idOrdenadorDocumento = 7
        def tipoDocumento = Ttiposdocumentos.findByFIdordenadorAndFIdempresa(idOrdenadorDocumento, factura.fIdempresa)
        def numeroSecuenciaDocumento = sqlService.GetSecuencia(tipoDocumento.fTipodoc, factura.fIdempresa)

        String sql = "INSERT INTO \n" +
                "  cxc.t_cuenta_cobrar\n" +
                "(\n" +
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
                ")\n" +
                "VALUES (\n" +
                "  '${tipoDocumento.fTipodoc}',\n" +
                "  '${numeroSecuenciaDocumento}',\n" +
                "  '${factura.fTipoDocumentoFactura}' || to_char(${factura.fNumeroFactura}, 'FM000000'),\n" +
                "  NOW(),\n" +
                "  ${factura.fTotal + factura.fPorcientoLey},\n" +
                "  ${factura.fTotal + factura.fPorcientoLey},\n" +
                "  ${factura.fIdcliente},\n" +
                "  false,\n" +
                "  'Cuenta por cobrar',\n" +
                "  ${factura.fFacturadoPor},\n" +
                "  false,\n" +
                "  current_date + (select COALESCE(c.f_dias_credito,0) from t_clientes c where c.f_idrecord = ${factura.fIdcliente}),\n" +
                "  ${factura.fIdempresa}\n" +
                ")"
        sqlService.Ejecutarsql(sql)
    }

    def guardarFacturaDelivery(JSONObject data, Long idEmpresa, Long idusuario) {
        Integer idEstatusFactura = 1
        Integer modulo = 3
        Integer mesa = 0
        Long idOrdenadorFacturaContado = 3
        BigDecimal total = 0
        BigDecimal subTotal = 0
        BigDecimal tax = 0
        BigDecimal descuento = 0
        Tclientes cliente

        def numeroSecuenciaNCF = ""
        def tipoDocumento = Ttiposdocumentos.findByFIdordenadorAndFIdempresa(idOrdenadorFacturaContado, idEmpresa)
        def numeroSecuenciaDocumento = sqlService.GetSecuencia(tipoDocumento.fTipodoc, idEmpresa)
        //numeroSecuenciaNCF = (data.ncf) ? sqlService.Get_Secuencia_Ncf(data.ncf.toString().toInteger()) : 0

        data.detalle.each { row ->
            total += row.total.toString().toBigDecimal()
            tax += row.tax.toString().toBigDecimal()
            subTotal += row.precio.toString().toBigDecimal() * row.cantidad.toString().toBigDecimal()
            //descuento += (row.descuento.toString().equals("")) ? 0 : row.descuento.toString().toBigDecimal()
        }


        if (data.f_idcliente.toString().toInteger() != 0) {
            cliente = Tclientes.findById(data.f_idcliente.toString().toInteger())
        } else {
            cliente = new Tclientes()
            Integer idtipoTelefono = 1
            TclientesContactos telefono = new TclientesContactos()
            TclientesDireccionesEnvios direccion = new TclientesDireccionesEnvios()

            cliente.fIdempresa = idEmpresa as Long
            cliente.fNombre = data.nombre.toString()
            cliente.fApellido = ""
            cliente.fDireccion = data.direccion.toString()
            cliente.fEmailPrincipal = ""
            cliente.fUsuario = ""
            cliente.fPassword = ""
            cliente.fCodigoCliente = 0
            cliente.fCedula = 0
            cliente.fTelefono = data.telefono.toString()
            cliente.fFecha = sqlService.GetNow()

            cliente.save(failOnError: true)

            telefono.fIdtipo = idtipoTelefono
            telefono.fContacto = data.telefono.toString()
            telefono.fIdempresa = idEmpresa
            telefono.fIdcliente = cliente.id
            telefono.save(failOnError: true)

            direccion.fIdcliente = cliente.id
            direccion.fIdempresa = idEmpresa
            direccion.fFecha = sqlService.GetNow()
            direccion.fDireccion = data.direccion.toString()
            direccion.fDireccionPrincipal = true
            direccion.fSector = data.sector.toString().toInteger()

            direccion.save(failOnError: true)
        }

        def factura = new Tfacturas(
                fIdempresa: idEmpresa,
                fFacturada: false,
                fCancelada: false,
                fFechaRegstroOrden: sqlService.GetNow(),
                fHechoPor: idusuario,
                fIdcliente: cliente.id.toString().toInteger(),
                fItebis: tax,
                fModulo: modulo,
                fMesa: mesa,
                fNumeroOrden: numeroSecuenciaDocumento,
                fSubtotal: subTotal,
                fDescuento: descuento,
                fTipoDocumentoFactura: tipoDocumento.fTipodoc,
                fTotal: total,
                fTotalExtra: 0,
                fObservacion: (!data.notas.toString().equals("")) ? data.notas.toString() : "",
                fTipoNcf: data.ncf.toString().toInteger(),
                fporciento_ley: 0 as BigDecimal,
                fmodulo: 3 as BigDecimal,
                ffactura_abierta: false,
                fanulada: false,
                fpagada: false,
                fNumeroNcf: "",
                fasignada: false,
                fCuenta: "TODO - Delivery",
                fFacturadoPor: idusuario,
                fWholenumCliente: "C" + cliente.id.toString(),
                fDireccionEnvio: data.direccion.toString(),
                fRnc: data.rnc.toString(),
                fRazonSocial: data.razon_social.toString()
        )

        factura.save(failOnError: true)

        data.detalle.each { row ->

            def detalle = new TdetalleFactura()

            detalle.fIdfactura = factura.id
            detalle.fIdproducto = row.idproducto
            detalle.fReferencia = row.referencia
            detalle.fCantidad = row.cantidad
            detalle.fItebis = row.tax
            detalle.fPrecio = row.precio
            detalle.fIdempresa = idEmpresa
            detalle.fComanda = false
            detalle.fIdcomanda = sqlService.getSecuenciaComanda()

            detalle.save(failOnError: true)

        }

        guardarEstado(factura.id, idEstatusFactura)

        factura
    }

    def guardarFactura(JSONObject data, Long idEmpresa, Long idusuario) {
        Integer idEstatusFactura = 5
        Integer modulo = 2
        Integer mesa = 0
        Long idOrdenadorFacturaContado = data.cliente_id.toString().toLong() == 0 ? 6 : 4
        BigDecimal total = 0
        BigDecimal subTotal = 0
        BigDecimal tax = 0
        BigDecimal propina = (!data.propina.toString().equals("")) ? data.propina.toString().toBigDecimal() : 0
        BigDecimal porciento_ley = 0
        BigDecimal descuento = 0
        Tclientes cliente;
        Long numero_orden = 0;

        def numeroSecuenciaNCF = ""
        def tipoDocumento = Ttiposdocumentos.findByFIdordenadorAndFIdempresa(idOrdenadorFacturaContado, idEmpresa)
        def numeroSecuenciaDocumento = sqlService.GetSecuencia(tipoDocumento.fTipodoc, idEmpresa)
        numero_orden = sqlService.GetSecuencia(Ttiposdocumentos.findByFIdempresaAndFIdordenador(idEmpresa,3).fTipodoc,idEmpresa);
        numeroSecuenciaNCF = (data.ncf) ? sqlService.Get_Secuencia_Ncf(data.ncf.toString().toInteger()) : 0

        data.detalle.each { row ->
            total += row.total.toString().toBigDecimal()
            tax += row.tax.toString().toBigDecimal()
            subTotal += row.precio.toString().toBigDecimal() * row.cantidad.toString().toBigDecimal()
            porciento_ley += row.porciento_ley.toString().toBigDecimal()
            //descuento += (row.descuento.toString().equals("")) ? 0 : row.descuento.toString().toBigDecimal()
        }


        def factura = new Tfacturas(
                fIdempresa: idEmpresa,
                fNumeroNcf: numeroSecuenciaNCF.toString(),
                fFacturada: false,
                fCancelada: false,
                fFechaRegstroOrden: sqlService.GetNow(),
                fFechaRegistroFactura: sqlService.GetNow(),
                fHechoPor: idusuario,
                fIdcliente: data.cliente_id.toString().toLong() > 0 ? data.cliente_id.toString().toLong() : 0,
                fItebis: tax,
                fModulo: modulo,
                fMesa: mesa,
                fPorcientoLey: data.ck_porciento_ley.toString().toBoolean() ? porciento_ley : 0,
                fNumeroFactura: numeroSecuenciaDocumento,
                fNumeroOrden: numero_orden,
                fSubtotal: subTotal,
                fDescuento: descuento,
                fTipoDocumentoFactura: tipoDocumento.fTipodoc,
                fDevuelta: data.cambio.toString().toBigDecimal() > 0 ? data.cambio.toString().toBigDecimal() : 0,
                fMontoEfectivo: data.efectivo.toString().toBigDecimal() > 0 ? data.efectivo.toString().toBigDecimal() : 0,
                fTotal: total,
                fTotalExtra: 0,
                fObservacion: (!data.notas.toString().equals("")) ? data.notas.toString() : "",
                fTipoNcf: data.ncf.toString().toInteger(),
                fporciento_ley: 0 as BigDecimal,
                fmodulo: 2 as BigDecimal,
                ffactura_abierta: false,
                fanulada: false,
                fpagada: false,
                fasignada: false,
                fCuenta: "TODO - Delivery",
                fFacturadoPor: idusuario,
                fWholenumCliente: data.cliente_id.toString().toLong() > 0 ? "C" + data.cliente_id.toString().toLong() : 0,
                fDireccionEnvio: data.direccion.toString(),
                fRnc: data.rnc.toString(),
                fRazonSocial: data.razon_social.toString()
        )

        factura.save(failOnError: true)

        data.detalle.each { row ->

            def detalle = new TdetalleFactura()

            detalle.fIdfactura = factura.id
            detalle.fIdproducto = row.idproducto
            detalle.fReferencia = row.referencia
            detalle.fCantidad = row.cantidad
            detalle.fItebis = row.tax
            detalle.fPrecio = row.precio
            detalle.fIdempresa = idEmpresa
            detalle.fComanda = false
            detalle.fIdcomanda = sqlService.getSecuenciaComanda()

            detalle.save(failOnError: true)

        }


        guardarEstado(factura.id, 1)
        guardarEstado(factura.id, idEstatusFactura)


        if (data.tipo_tarjeta.toString().toLong() > 0) {
            this.guardarPagosTarjeta(data.tipo_tarjeta.toString().toLong(), data.autorizacion.toString(), data.monto_tarjeta.toString().toBigDecimal(), propina, factura.id, idEmpresa, idusuario)
        }
        if (factura.fIdcliente > 0) {
            this.guardarCuentaPorCobrar(factura)
        }
        factura
    }

    def guardarPagosTarjeta(Long tipoTarjeta, String autorizacion, BigDecimal monto, BigDecimal propina, Long idfactura, Long idempresa, Long idusuario) {
        String sql = "INSERT INTO \n" +
                "  public.t_pagos_tarjeta\n" +
                "(\n" +
                "  f_tipotarjeta,\n" +
                "  f_autorizacion,\n" +
                "  f_monto,\n" +
                "  f_fecha,\n" +
                "  f_hechopor,\n" +
                "  f_idfactura,\n" +
                "  f_propina,\n" +
                "  f_fecha_operacion\n" +
                ")\n" +
                "VALUES (\n" +
                "  ${tipoTarjeta},\n" +
                "  '${autorizacion}',\n" +
                "  ${monto},\n" +
                "  NOW(),\n" +
                "  ${idusuario},\n" +
                "  ${idfactura},\n" +
                "  ${propina},\n" +
                "  get_fecha_operacion(${idempresa})\n" +
                ");"
        sqlService.Ejecutarsql(sql)
    }

    def guardarDireccion(JSONObject data, Long idEmpresa, Long idusuario) {
        Tclientes cliente
        cliente = Tclientes.findById(data.f_idcliente.toString().toInteger())
        TclientesDireccionesEnvios direccion = new TclientesDireccionesEnvios()
        direccion.fIdcliente = cliente.id
        direccion.fIdempresa = idEmpresa
        direccion.fFecha = sqlService.GetNow()
        direccion.fDireccion = data.new_direccion.toString()
        direccion.fDireccionPrincipal = false
        direccion.fSector = data.new_sector.toString().toInteger()

        direccion.save(failOnError: true)
        direccion
    }

    def guardarNcfLog(org.grails.web.json.JSONArray data, Long idEmpresa, Long idUser) {
        if (!data.isEmpty()) {

            data.each { row ->
                if (row.id.toString().toLong() > 0) {
                    TlogsNcf log = TlogsNcf.findById(row.id.toString().toLong())
                    log.fIdempresa = idEmpresa
                    log.fSecuenciaInicial = row.fsecuenciainicial.toString().toInteger()
                    log.fSecuenciaFinal = row.fsecuenciafinal.toString().toInteger()
                    log.fFechaFinal = new Date(row.ffechafinal.toString().toLong())
                    log.fFechaInicio = new Date(row.ffechainicio.toString().toLong())
                    log.fTipoNcf = row.tiponcf.toString().toInteger()
                    log.fHechoPor = idUser
                    log.fActivo = row.factivo.toString().toBoolean()
                    log.fFecha = sqlService.GetNow()

                    log.save(failOnError: true)
                } else {
                    TlogsNcf log = new TlogsNcf()

                    log.fIdempresa = idEmpresa
                    log.fSecuenciaInicial = row.fsecuenciainicial.toString().toInteger()
                    log.fSecuenciaFinal = row.fsecuenciafinal.toString().toInteger()
                    log.fFechaFinal = new Date(row.ffechafinal.toString().toLong())
                    log.fFechaInicio = new Date(row.ffechainicio.toString().toLong())
                    log.fTipoNcf = row.tiponcf.toString().toInteger()
                    log.fHechoPor = idUser
                    log.fActivo = row.factivo.toString().toBoolean()
                    log.fFecha = sqlService.GetNow()

                    log.save(failOnError: true)
                }
            }
        }
    }

    def guardarCamarero(JSONObject data, Long idEmpresa) {


        if (data.id.toString().toLong() > 0) {
            def Ucamarero = Tcamareros.findByIdAndFIdempresa(data.id.toString().toLong(), idEmpresa)
            Ucamarero.fNombre = data.nombre.toString()
            Ucamarero.fApellido = data.apellido.toString()
            Ucamarero.fCedula = data.cedula.toString()
            Ucamarero.fSueldo = data.sueldo.toString().toBigDecimal()
            Ucamarero.fDireccion = data.direccion.toString()
            Ucamarero.fIdArea = data.cbarea.toString().toLong()
            Ucamarero.fActivo = data.activo
            Ucamarero.fCamareroActivo = data.camareroactivo

            Ucamarero.save(failOnError: true)
            Ucamarero
        } else {
            def camarero = new Tcamareros()
            camarero.fIdempresa = idEmpresa as Long

            camarero.fNombre = data.nombre.toString()
            camarero.fApellido = data.apellido.toString()
            camarero.fCedula = data.cedula.toString()
            camarero.fSueldo = data.sueldo.toString().toBigDecimal()
            camarero.fDireccion = data.direccion.toString()
            camarero.fIdArea = data.cbarea.toString().toLong()
            camarero.fActivo = data.activo
            camarero.fCamareroActivo = data.camareroactivo

            camarero.save(failOnError: true)
            camarero
        }

    }

    def guardarHorarioPrecio(JSONObject data, Long idEmpresa) {
        if (!data.precios.isEmpty()) {
            String Sql1 = " delete TproductosPrecios as b where b.fIdproducto = :id "

            TproductosPrecios.executeUpdate(Sql1, [id: data.id as Long])

            data.precios.eachWithIndex { row, i ->
                println "entron";
                def precio = new TproductosPrecios(
                        fIdproducto: data.id,
                        fIdarea: row.fNombreArea,
                        fDia: row.dia_list,
                        fPrecio: row.precio,
                        fComentario: row.comentario,
                        fDoble: row.doble,
                        fPrecioActivo: row.activo,
                        fHoraInicio: row.hora_inicial,
                        fHoraFin: row.hora_final,
                        fIdempresa: idEmpresa
                )
                precio.save(failOnError: true)
            }
            return true
        }
        return false
    }

    def actualizar_precio(JSONObject data, Long idEmpresa) {

//        String sql = "update t_productos set f_precio = ${data.precio.toString().toLong()} " +
//                "where t_productos.f_idrecord = ${data.id.toString().toLong()} " +
//                " and t_productos.f_idempresa = ${idEmpresa} "
//
//        sqlService.EjecutarSql(sql)

        Tproductos tproductos = Tproductos.findByIdAndFIdempresa(data.id.toString().toLong(), idEmpresa)

        if (tproductos) {
            //tproductos.setfPrecio(data.precio?data.precio.toString().toBigDecimal():0.00)

            tproductos.fPrecio = data.precio ? data.precio.toString().toBigDecimal() : 0.00
            tproductos.save(failOnError: true)
        }
        tproductos
    }

    def guardarPropiedad(JSONObject data, Long idEmpresa) {

        if (data.id.toString().toLong() > 0) {
            Tpropiedades propiedad = Tpropiedades.findByIdAndFIdempresa(data.id.toString().toLong(), idEmpresa)
            propiedad.fDescripcion = data.descripcion.toString().toUpperCase()
            propiedad.save(failOnError: true)
            propiedad
        } else {
            Tpropiedades propiedad = new Tpropiedades(
                    fDescripcion: data.descripcion.toString().toUpperCase(),
                    fIdcategoria: data.categoria.toString().toLong(),
                    fIdempresa: idEmpresa,
                    fFecha: sqlService.GetNow()
            )
            propiedad.save(failOnError: true)
            propiedad
        }
    }

    def guardarMesa(JSONObject data, Long idEmpresa) {

        if (data.id.toString().toLong() > 0) {
            Tmesas mesa = Tmesas.findByIdAndFIdempresa(data.id.toString().toLong(), idEmpresa)
            mesa.fDescripcion = data.mesa.toString()
            mesa.fIdempresa = idEmpresa
            mesa.fCubiertos = data.cubiertos.toString().toLong()
            mesa.fIdArea = data.idarea.toString().toLong()
            mesa.fIdSeccion = data.idseccion.toString().toLong()
            mesa.save(failOnError: true)
            mesa
        } else {
            Tmesas mesa = new Tmesas()
            mesa.fDescripcion = data.mesa.toString()
            mesa.fIdempresa = idEmpresa
            mesa.fCubiertos = data.cubiertos.toString().toLong()
            mesa.fIdArea = data.idarea.toString().toLong()
            mesa.fIdSeccion = data.idseccion.toString().toLong()
            mesa.save(failOnError: true)
            mesa
        }
    }

    def guardarTipoMoneda(JSONObject data, Long idEmpresa) {

        if (data.id.toString().toLong() > 0) {
            TtipoMoneda tipoMoneda = TtipoMoneda.findByIdAndFIdempresa(data.id.toString().toLong(), idEmpresa)
            tipoMoneda.fDescripcion = data.descripcion.toString().toUpperCase()
            tipoMoneda.fIdempresa = idEmpresa
            tipoMoneda.fSigla = data.sigla.toString().toUpperCase()
            tipoMoneda.save(failOnError: true)
            tipoMoneda
        } else {
            TtipoMoneda tipoMoneda = new TtipoMoneda()
            tipoMoneda.fDescripcion = data.descripcion.toString().toUpperCase()
            tipoMoneda.fIdempresa = idEmpresa
            tipoMoneda.fSigla = data.sigla.toString().toUpperCase()
            tipoMoneda.save(failOnError: true)
            tipoMoneda
        }
    }

    def guardarTasaMoneda(JSONObject data, Long idEmpresa) {

        if (data.id.toString().toLong() > 0) {
            TtasasMonedas tasa = TtasasMonedas.findByIdAndFIdempresa(data.id.toString().toLong(), idEmpresa)
            tasa.fTasa = data.tasa.toString().toFloat()
            tasa.fIdempresa = idEmpresa
            tasa.fFecha = new Date(data.fecha.toString())
            tasa.fMoneda = data.idmoneda.toString().toLong()
            tasa.save(failOnError: true)
            tasa
        } else {

            TtasasMonedas tasa = new TtasasMonedas()
            tasa.fTasa = data.tasa.toString().toFloat()
            tasa.fIdempresa = idEmpresa
            tasa.fFecha = new Date(data.fecha.toString())
            tasa.fMoneda = data.idmoneda.toString().toLong()
            tasa.save(failOnError: true)
            tasa
        }
    }

    def guardarTarjeta(JSONObject data) {

        if (data.id.toString().toLong() > 0) {
            TtipoTarjeta tarjeta = TtipoTarjeta.findById(data.id.toString().toLong())
            tarjeta.fDescripcion = data.descripcion.toString().toUpperCase()
            tarjeta.save(failOnError: true)
            tarjeta
        } else {

            TtipoTarjeta tarjeta = new TtipoTarjeta()
            tarjeta.fDescripcion = data.descripcion.toString().toUpperCase()
            tarjeta.save(failOnError: true)
            tarjeta
        }
    }

    def guardarBillete(JSONObject data) {

        if (data.id.toString().toLong() > 0) {
            TtipoBillete billete = TtipoBillete.findById(data.id.toString().toLong())
            billete.fDescripcion = data.descripcion.toString().toUpperCase()
            billete.fValor = data.valor.toString().toInteger()
            billete.fIdtipoMoneda = data.idmoneda.toString().toLong()
            billete.save(failOnError: true)
            billete
        } else {

            TtipoBillete billete = new TtipoBillete()
            billete.fDescripcion = data.descripcion.toString().toUpperCase()
            billete.fValor = data.valor.toString().toInteger()
            billete.fIdtipoMoneda = data.idmoneda.toString().toLong()
            billete.save(failOnError: true)
            billete
        }
    }

    def addPropiedadesProducto(JSONObject data, Long idEmpresa) {

        String sql = " delete  TproductosPropiedades as b where b.fIdproducto = :id and b.fIdempresa = :idempresa"
        TproductosPropiedades.executeUpdate(sql, [
                id       : data.idproducto.toString().toLong(),
                idempresa: idEmpresa
        ])

        data.propiedades.each { row ->
            if (row.hasproducto) {
                def detalle = new TproductosPropiedades()
                detalle.fIdempresa = idEmpresa
                detalle.fIdproducto = data.idproducto.toString().toLong()
                detalle.fIdpropiedad = row.idpropiedad.toString().toLong()
                detalle.save(failOnError: true)
            }
        }

    }

    def getUsarios(Long idEmpresa) {
        String sql = "select f_idrecord as id, f_nombre as fNombre,f_username as fUsername, f_activo as factivo , f_apellido as fApellido from t_usuarios where f_idempresa = ${idEmpresa}"
        List list = sqlService.GetQuery(sql)
        list
    }

    def getNcfLogs(Long idncf, Long idEmpresa) {
        String sql = "SELECT \n" +
                "\tn.f_descripcion as fdescripcion, \n" +
                "    l.f_fecha_final as ffechafinal,\n" +
                "    l.f_fecha_inicio as ffechainicio,\n" +
                "    l.f_fecha::date as ffecha,\n" +
                "    l.f_secuencia_final as fsecuenciafinal,\n" +
                "    l.f_secuencia_inicial as fsecuenciainicial,\n" +
                "    l.f_activo as factivo,\n" +
                "    l.f_idrecord as id,\n" +
                "    l.f_tipo_ncf as tiponcf,\n" +
                "    u.f_nombre as fusuario\n" +
                "FROM\n" +
                "\tt_ncf as n inner join t_logs_ncf as l on n.f_idrecord = l.f_tipo_ncf\n" +
                "    inner join t_usuarios as u on u.f_idrecord = l.f_hecho_por\n" +
                "WHERE\n" +
                "\tn.f_idrecord = ${idncf} and l.f_idempresa =${idEmpresa}"

        List list = sqlService.GetQuery(sql)
        list
    }

    def getUsarioConPermisos(Long idusuario) {

        Map<String, Object> data = new HashMap<String, Object>()
        String sql = "select  \n" +
                "    m.f_descripcion as fDescripcion,\n" +
                "    m.f_id as id,\n" +
                "    m.f_padre as fpadre,\n" +
                "    CASE WHEN p.f_idusuario is null then\n" +
                "    \tFALSE\n" +
                "    ELSE\n" +
                "    \tTRUE\n" +
                "    END as isAdd,\n" +
                "    m.f_padre as fpadre\n" +
                "    \n" +
                "    \n" +
                "from \n" +
                " cfg.t_opciones_menu m left join cfg.t_permisos_usuario p on p.f_idopcion = m.f_id and p.f_idusuario = ${idusuario}\n"
        List list = sqlService.GetQuery(sql)

        data.put("permisos", list)
        data.put("usuario", Tusuarios.findById(idusuario))
        data
    }

    def getPropiedadesEnProducto(Long idProducto, Long idCategoria, Long idEmpresa) {
        String sql = "SELECT\n" +
                "\tp.f_descripcion as descripcion,\n" +
                "    p.f_idrecord as idpropiedad,\n" +
                "    p.f_idcategoria as idcategoria, \n" +
                "    (\n" +
                "    \tCASE \n" +
                "        \tWHEN\n" +
                "        \t\t(SELECT count(pp.f_idredord) FROM t_productos_propiedades as pp where pp.f_idproducto = ${idProducto} AND pp.f_idpropiedad = p.f_idrecord) > 0\n" +
                "        \tTHEN\n" +
                "            \ttrue\n" +
                "        \tWHEN\n" +
                "        \t\t(SELECT count(pp.f_idredord) FROM t_productos_propiedades as pp where pp.f_idproducto = ${idProducto} AND pp.f_idpropiedad = p.f_idrecord) < 1\n" +
                "        \tTHEN\n" +
                "            \tfalse\n" +
                "            END\n" +
                "    ) as hasProducto\n" +
                "FROM\n" +
                "\tt_propiedades as p \n" +
                "WHERE\n" +
                "\tp.f_idcategoria = ${idCategoria} AND p.f_idempresa = ${idEmpresa}"

        List list = sqlService.GetQuery(sql)
        list
    }

    def getProductoByReferenceOrDescripcion(String filtro, Long idEmpresa) {

        String sql = "SELECT \n" +
                "  p.f_idrecord as \"id\",\n" +
                "  p.f_idempresa as \"fIdempresa\",\n" +
                "  p.f_referencia as \"fReferencia\",\n" +
                "  p.f_descripcion as \"fDescripcion\",\n" +
                "  p.f_controlinventario as \"fControlinventario\",\n" +
                "  p.f_idcategoria as \"fIdcategoria\",\n" +
                "  p.f_reorden  as \"fReorden\",\n" +
                "  p.f_maxdescuento as  \"fMaxdescuento\",\t\n" +
                "  CASE WHEN p.f_precio_delivery > 0 THEN p.f_precio_delivery ELSE p.f_precio END as \"fPrecio\",\n" +
                "  p.f_ultimocosto as \"fUltimocosto\",\n" +
                "  p.f_limiteminimo as \"fLimiteminimo\",\n" +
                "  p.f_limitemaximo as \"fLimitemaximo\",\n" +
                "  p.f_existencia as \"fExistencia\",\n" +
                "  p.f_tax as \"fTax\",\n" +
                "  p.f_fecha as \"fFecha\",\n" +
                "  p.f_makeup as \"fMakeup\",\n" +
                "  p.f_ultimocosto1 as \"fUltimocosto1\",\n" +
                "  p.f_ultimocosto2 as \"fUltimocosto2\",\n" +
                "  p.f_fecha_vencimiento as \"fFechaVencimiento\",\n" +
                "  p.f_idlocalizacion as \"fIdlocalizacion\",\n" +
                "  p.f_kit as \"fKit\",\n" +
                "  p.f_descontinuado as \"fDescontinuado\",\n" +
                "  p.f_mensaje as \"fMensaje\",\n" +
                "  p.f_idunidad as \"fIdunidad\",\n" +
                "  p.f_plato as \"fPlato\",\n" +
                "  p.f_receta as \"fReceta\",\n" +
                "  p.f_tragos as \"fTragos\",\n" +
                "  p.f_ventas_decimales as \"fVentasDecimales\",\n" +
                "  p.f_imprime_ingrediente as \"fImprimeIngrediente\",\n" +
                "  p.f_comanda as \"fComanda\",\n" +
                "  p.f_precio_delivery as \"fPrecioDelivery\"\n" +
                "FROM \n" +
                "  public.t_productos p where p.f_idempresa = ${idEmpresa} AND (p.f_referencia = '${filtro}' or p.f_descripcion ilike '%${filtro}%')"

        List list = sqlService.GetQuery(sql)
        list
    }

    def getMesas(Long idEmpresa) {

        List mesas
        def sql = "\n" +
                "SELECT\n" +
                "\tm.f_descripcion as mesa,\n" +
                "    m.f_idrecord as id,\n" +
                "    m.f_cubiertos as cubiertos,\n" +
                "    m.f_id_area as idarea,\n" +
                "    m.f_id_seccion as idseccion,\n" +
                "    a.f_nombre_area as area,\n" +
                "    s.f_descripcion as seccion\n" +
                "FROM\n" +
                "\tt_mesas as m inner join t_areas_seccion as s on m.f_id_seccion = s.f_idrecord\n" +
                "    inner join t_areas as a on m.f_id_area = a.f_idrecord where m.f_idempresa = ${idEmpresa}"

        mesas = sqlService.GetQuery(sql)
        mesas
    }

    def getTiposMonedas(Long idEmpresa) {

        List resultado

        def sql = "\n" +
                "SELECT \n" +
                "\t(t.f_descripcion || ' - ' || t.f_sigla) as moneda,\n" +
                "    m.f_idrecord as id,\n" +
                "    m.f_tasa as tasa,\n" +
                "    m.f_fecha::date as fecha,\n" +
                "    m.f_moneda as idmoneda\n" +
                "FROM\n" +
                "\tt_tipo_moneda as t inner join t_tasas_monedas as m on t.f_idrecord = m.f_moneda\n" +
                "WHERE\n" +
                "\tt.f_idempresa = ${idEmpresa}\n" +
                "\t"

        resultado = sqlService.GetQuery(sql)
        resultado
    }

    def getLanguaje() {
        def lang = Tidiomas.list()
        lang
    }

    def getPermisos() {
        List permisos
        //Query viejo para traer los permisos sin filtrar los permisos deshabilitados
        //def sql = "select f_id as id,f_padre as fpadre, false as isadd, f_descripcion as fdescripcion from cfg.t_opciones_menu where f_padre <> -1"

        def sql = "select \n" +
                "\tf_id as id,\n" +
                "\tf_padre as fpadre,\n" +
                "\tfalse as isadd, \n" +
                "\tf_descripcion as fdescripcion \n" +
                "from \n" +
                "\tcfg.t_opciones_menu \n" +
                "where \n" +
                "\tf_padre <> -1 \n" +
                "    and f_padre not in (select f_id from cfg.t_opciones_menu where f_padre = -1)"
        permisos = sqlService.GetQuery(sql)
        permisos
    }

    def hassPermission(Long idusuario, String controller, String method) {

        String uri = ""
        if (method.equals("index")) {
            uri = (controller.equals("user")) ? "usuario" : controller
        } else {
            uri = method
        }


//        println "Controlador -> "+ controller
//        println "method -> "+ method
//        println "uri -> "+ uri
        List url
        def sqlUri = "select f_id from  cfg.t_opciones_menu o where o.f_url ='${uri}'";


        url = sqlService.GetQuery(sqlUri);

        //Validamos que existe la url
        //se valida para no bloquear las URLs que son
        //Mediante AJAX y solo bloquear las que son del menu
        //y el usuario puede o no tener acceso
        if (url.size() > 0) {
            def sqlUrlUsuario = "SELECT \n" +
                    "  m.f_url\n" +
                    "FROM \n" +
                    "  cfg.t_opciones_menu m \n" +
                    "  inner join cfg.t_permisos_usuario u ON m.f_id = u.f_idopcion\n" +
                    "where\n" +
                    "\tu.f_idusuario = ${idusuario} and m.f_url = '${uri}' ";

            def rs = sqlService.GetQuery(sqlUrlUsuario)
            // println rs.size()

            if (rs.size() > 0) {
                //Si el permiso existe y el usuario lo tiene agregado retornamos true
                //println "tiene permiso"
                return true
            } else {
                //si el permiso existe pero el usuario no lo tiene retornamos false
                //println "no tiene permiso"
                return false
            }
        }
        return true
    }

    def List<Map<String, Object>> getOrdenesFromApp(Long idempresa) {
        List ordenes

        String sql = "select\n" +
                "     f.f_idrecord as id,\n" +
                "      f.f_tipo_documento_factura || to_char(f.f_numero_orden,'FM000000') as fOrden,\n" +
                "      to_char(f.f_fecha_regstro_orden, 'dd/mm/yyy HH:MI:SS') as fFecha,\n" +
                "      f.f_direccion_envio as fDireccion,\n" +
                "      c.f_nombre as fNombre,\n" +
                "      m.f_nombre as fmensajero,\n" +
                "      max(p.f_idestatus) as fIdestatus," +
                "       to_char(f.f_total, 'l9,999,999D99') as f_total\n" +
                "      \n" +
                "from\n" +
                "\tt_pedidos_estatus p \n" +
                "    INNER JOIN t_facturas f ON p.f_idfactura = f.f_idrecord\n" +
                "    LEFT JOIN v_clientes c ON c.f_wholenum = f.f_wholenum_cliente\n" +
                "    LEFT JOIN envios.t_mensajeros m ON f.f_mensajero = m.f_idrecord\n" +
                "WHERE \n" +
                "\tf.f_modulo = 3 and f.f_idempresa = ${idempresa} \n" +
                "group by\n" +
                "\tid, c.f_nombre, m.f_nombre HAVING \n" +
                "  max(p.f_idestatus) in (1,2,3,4)\n" +
                "ORDER BY fFecha DESC"
        //println sql
        ordenes = sqlService.getQuery(sql)
        ordenes
    }

    def List<Map<String, Object>> getOrdenesEstatus() {
        List estatus

        String sql = "SELECT f_idrecord as value, f_descripcion as label FROM t_estatus WHERE f_idrecord <> 5 order by f_idrecord"
        estatus = sqlService.getQuery(sql)
        estatus
    }

    def List<Map<String, Object>> getOrdenesCerradaFromApp(Long idempresa) {
        List ordenes
        String sql = "select\n" +
                "     f.f_idrecord as id,\n" +
                "      f.f_tipo_documento_factura||to_char(f.f_numero_orden,'FM000000') as fOrden,\n" +
                "      to_char(f.f_fecha_regstro_orden, 'dd/mm/yyy HH:MI:SS') as fFecha,\n" +
                "      f.f_direccion_envio as fDireccion,\n" +
                "      c.f_nombre as fNombre,\n" +
                "      m.f_nombre as fmensajero,\n" +
                "      e.f_descripcion as estatus,\n" +
                "      max(p.f_idestatus) as fIdestatus\n" +
                "      \n" +
                "from\n" +
                "\tt_pedidos_estatus p \n" +
                "    inner join t_facturas f ON p.f_idfactura = f.f_idrecord\n" +
                "    LEFT JOIN v_clientes c ON c.f_wholenum = f.f_wholenum_cliente\n" +
                "    LEFT JOIN envios.t_mensajeros m ON f.f_mensajero = m.f_idrecord\n" +
                "    LEFT JOIN t_estatus e ON e.f_idrecord = p.f_idestatus\n" +
                "    LEFT JOIN cfg.t_empresas emp ON emp.f_idrecord = f.f_idrecord\n" +
                "WHERE \n" +
                "\tf.f_modulo = 3 and f.f_idempresa = ${idempresa} \n" +
                "group by\n" +
                "\tid, c.f_nombre, m.f_nombre, estatus  HAVING max(p.f_idestatus) in (5,6,7)\n" +
                "ORDER BY \n" +
                "\tfFecha \n" +
                "    DESC"
        //println sql
        ordenes = sqlService.getQuery(sql)
        ordenes
    }

    def List<Map<String, Object>> getOrdenesComandaOnCurrentDayByIdEmpresa(Long idempresa, List comandasEnPantalla) {
        List ordenes
        String sql2 = " ";

        if (comandasEnPantalla.size() > 0) {
            sql2 += " f.f_idrecord not in ( "
            comandasEnPantalla.eachWithIndex { row, i ->
                sql2 += (i < (comandasEnPantalla.size() - 1)) ? row + "," : row + ") and"
            }
        }
        String sql = "SELECT distinct \n" +
                "\tf.f_idrecord as factura_id,\n" +
                "  (to_char(f.f_numero_orden, '000000')) as orden,\n" +
                "  f.f_fecha_regstro_orden,\n" +
                "  AGE(current_timestamp, f.f_fecha_regstro_orden) as edad,\n" +
                "  me .f_descripcion as f_mesa\n" +
                "FROM \n" +
                "  public.t_facturas f \n" +
                "  inner join public.t_detalle_factura d on f.f_idrecord = d.f_idfactura \n" +
                "  left join public.t_mesas as me on me.f_idrecord = f.f_mesa\n" +
                "where\n" +
                "    d.f_comanda = false and\n" +
                "    f.f_fecha_regstro_orden::date BETWEEN CURRENT_DATE and CURRENT_DATE and\n" +
                "--    date_part('minute',age(current_timestamp, f.f_fecha_regstro_orden)) <= 5 and\n" +
                " --   date_part('hour',age(current_timestamp, f.f_fecha_regstro_orden)) = 0 and \n" + sql2 +
                "    f.f_idempresa = ${idempresa}\n" + " ORDER BY f.f_fecha_regstro_orden ASC ";

        ordenes = sqlService.getQuery(sql)
        ordenes
    }

    def List<Map<String, Object>> getOrdeneOnCurrentDayByIdorden(Long idorden) {
        List ordenes

        String sql = "SELECT distinct\n" +
                "\tf.f_idrecord as factura_id,\n" +
                "  (to_char(f.f_numero_orden, '000000')) as orden,\n" +
                "  f.f_fecha_regstro_orden,\n" +
                "  to_char(f.f_total, 'l9,999,999D99') as f_total,\n" +
                "  AGE(current_timestamp, f.f_fecha_regstro_orden) as edad,\n" +
                "  f.f_mesa,\n" +
                "  f.f_direccion_envio as direccion,\n" +
                "  c.f_nombre as cliente,\n" +
                "  e.f_idrecord as idstatus,\n" +
                "  e.f_descripcion as estatus\n" +
                "FROM \n" +
                "  public.t_facturas f \n" +
                "  inner join public.t_detalle_factura d on f.f_idrecord = d.f_idfactura\n" +
                "  inner JOIN t_pedidos_estatus pe ON f.f_idrecord = pe.f_idfactura \n" +
                "  inner JOIN t_estatus e ON pe.f_idestatus = e.f_idrecord\n" +
                "  inner JOIN v_clientes c ON c.f_wholenum = f.f_wholenum_cliente\n" +
                "where\n" +
                "    d.f_comanda = false and\n" +
                "    f.f_idrecord = ${idorden}\n" +
                " ORDER BY f.f_fecha_regstro_orden ASC "
//        println sql
        ordenes = sqlService.getQuery(sql)
        return ordenes
    }

    List<Map<String, Object>> getOrdenesCerradasByFacturaId(Long idorden) {
        List ordenes

        String sql = "SELECT\n" +
                "\tf.f_idrecord as factura_id,\n" +
                "  (to_char(f.f_numero_factura, 'FM000000')) as orden,\n" +
                "  f.f_fecha_registro_factura,\n" +
                "  to_char(f.f_total, 'l9,999,999D99') as f_total,\n" +
                "  AGE(current_timestamp, f.f_fecha_registro_factura) as edad,\n" +
                "  f.f_mesa,\n" +
                "  f.f_direccion_envio as direccion,\n" +
                "  c.f_nombre as cliente,\n" +
                "  e.f_idrecord as idstatus,\n" +
                "  e.f_descripcion as estatus,\n" +
                "  max(pe.f_idestatus) as fIdestatus\n" +
                "FROM \n" +
                "  public.t_facturas f \n" +
                "  inner join public.t_detalle_factura d on f.f_idrecord = d.f_idfactura\n" +
                "  inner JOIN t_pedidos_estatus pe ON f.f_idrecord = pe.f_idfactura \n" +
                "  inner JOIN t_estatus e ON pe.f_idestatus = e.f_idrecord\n" +
                "  inner JOIN v_clientes c ON c.f_wholenum = f.f_wholenum_cliente\n" +
                "where\n" +
                "    f.f_idrecord = ${idorden}\n" +
                "GROUP BY\n" +
                "\tfactura_id,\n" +
                "    cliente,\n" +
                "    idstatus,\n" +
                "    estatus\n" +
                "HAVING \n" +
                "\tmax(pe.f_idestatus) IN (5, 6, 7)\n" +
                " ORDER BY f.f_fecha_regstro_orden ASC "
        // println sql
        ordenes = sqlService.getQuery(sql)
        ordenes
    }


    def List<Map<String, Object>> getOrdenDetalleComandaByFacturaId(Long idfactura) {
        List productos

        String sql = "SELECT \n" +
                "  \n" +
                "  d.f_idrecord as detalle_id, " +
                "  d.f_idcomanda, " +
                "  p.f_idrecord as producto_id, " +
                "  p.f_descripcion as f_descripcion,\n" +
                "  d.f_cantidad\n" +
                "FROM \n" +
                "  public.t_detalle_factura d\n" +
                "  inner join public.t_productos p on d.f_idproducto = p.f_idrecord\n" +
                "where\n" +
                "\td.f_idfactura = ${idfactura}\n" +
                "    and \n" +
                "    d.f_comanda = false"

        productos = sqlService.getQuery(sql)
        productos
    }


    def List<Map<String, Object>> getOrdenDetalleByFacturaId(Long idfactura) {
        List productos

        String sql = "SELECT \n" +
                "  \n" +
                "  d.f_idrecord as detalle_id, " +
                "  d.f_idcomanda, " +
                "  p.f_idrecord as producto_id, " +
                "  p.f_descripcion as f_descripcion,\n" +
                "  d.f_cantidad\n" +
                "FROM \n" +
                "  public.t_detalle_factura d\n" +
                "  inner join public.t_productos p on d.f_idproducto = p.f_idrecord\n" +
                "where\n" +
                "\td.f_idfactura = ${idfactura}\n"

        productos = sqlService.getQuery(sql)
        productos
    }

    def getTotalPedidos(Long idempresa) {
        List pedidos
        String sql = "WITH t AS (\n" +
                "\tselect\n" +
                "     f.f_idrecord as id,\n" +
                "      f.f_tipo_documento_factura||to_char(f.f_numero_orden,'FM000000') as fOrden,\n" +
                "      to_char(f.f_fecha_regstro_orden, 'dd/mm/yyy HH:MI:SS') as fFecha,\n" +
                "      f.f_direccion_envio as fDireccion,\n" +
                "      c.f_nombre as fNombre,\n" +
                "      m.f_nombre as fmensajero,\n" +
                "      max(p.f_idestatus) as fIdestatus," +
                "       to_char(f.f_total, 'l9,999,999D99') as f_total\n" +
                "      \n" +
                "from\n" +
                "\tt_pedidos_estatus p \n" +
                "    INNER JOIN t_facturas f ON p.f_idfactura = f.f_idrecord\n" +
                "    LEFT JOIN v_clientes c ON c.f_wholenum = f.f_wholenum_cliente\n" +
                "    LEFT JOIN envios.t_mensajeros m ON f.f_mensajero = m.f_idrecord\n" +
                "WHERE \n" +
                "\tf.f_modulo = 3 and f.f_idempresa = ${idempresa} \n" +
                "group by\n" +
                "\tid, c.f_nombre, m.f_nombre HAVING \n" +
                "  max(p.f_idestatus) in (1,2,3,4)\n" +
                "ORDER BY fFecha DESC\n" +
                ") SELECT COUNT(*) AS total_pedidos FROM t;"

        pedidos = sqlService.GetQuery(sql)

        pedidos
    }

    def getMontoCerrado(Long idempresa) {
        List pedidos
        String sql = "SELECT \n" +
                "\tCOALESCE(to_char(sum(f.f_total), 'l9,999,999D99'),to_char(0, 'l0')) as monto_total_cerrado\n" +
                "FROM \n" +
                "\tt_facturas f \n" +
                "where \n" +
                "\tf.f_fecha_operacion = (select e.f_fecha_inicio_operaciones from cfg.t_empresas e where e.f_idrecord = ${idempresa}) \n" +
                "    and\n" +
                "    \tf.f_idrecord IN ( SELECT f_idfactura FROM t_pedidos_estatus p WHERE p.f_idestatus = 5)\n" +
                "    and \n" +
                "    f.f_modulo = 3"
        //println sql
        pedidos = sqlService.GetQuery(sql)

        pedidos
    }

    def getMontoTotal(Long idempresa) {
        List pedidos
        String sql = "SELECT \n" +
                "\tCOALESCE(to_char(sum(f.f_total), 'l9,999,999D99'), to_char(0, 'l0')) as monto_total \n" +
                "FROM \n" +
                "\tt_facturas f \n" +
                "where \n" +
                "\tf.f_fecha_operacion = (select e.f_fecha_inicio_operaciones from cfg.t_empresas e where e.f_idrecord = ${idempresa}) \n" +
                "    and \n" +
                "    f.f_modulo = 3"

        pedidos = sqlService.GetQuery(sql)

        pedidos
    }

    def List<Map<String, Object>> getOrdenComponentesDetalleComandaByFacturaId(Long idfactura) {
        List componentes

        String sql = "SELECT \n" +
                "  cd.f_idprodcuto_componente,\n" +
                "  cd.f_cantidad,\n" +
                "  cd.f_iddetalle as detalle_id,\n" +
                "  p.f_descripcion\n" +
                "FROM \n" +
                "  public.t_factura_detalle_componentes cd\n" +
                "  inner join t_productos p on cd.f_idprodcuto_componente = p.f_idrecord\n" +
                "  inner join t_detalle_factura df on cd.f_iddetalle = df.f_idrecord\n" +
                "where\n" +
                "\tdf.f_idfactura = ${idfactura}"

        componentes = sqlService.getQuery(sql)
        componentes
    }

    def List<Map<String, Object>> getOrdenPropiedadesByDetalleId(Long iddetalle) {
        List propiedades

        String sql = "SELECT \n" +
                "  p.f_idrecord as idpropiedad,\n" +
                "  p.f_descripcion,\n" +
                "  d.f_iddetalle as detalle_id\n" +
                "FROM \n" +
                "\tt_propiedades p \n" +
                "    INNER JOIN t_detalles_propiedades_factura d ON\n" +
                "    p.f_idrecord = d.f_idpropiedad\n" +
                "WHERE \n" +
                "\td.f_iddetalle = ${iddetalle}"

        //println sql

        propiedades = sqlService.getQuery(sql)
        propiedades
    }

    def List<Map<String, Object>> getOrdenPropiedadesByOrdenId(Long idfactura) {
        List propiedades

        String sql = "SELECT \n" +
                "  p.f_idrecord as idpropiedad,\n" +
                "  p.f_descripcion,\n" +
                "  d.f_iddetalle as detalle_id\n" +
                "FROM \n" +
                "\tt_propiedades p \n" +
                "    INNER JOIN t_detalles_propiedades_factura d ON\n" +
                "    p.f_idrecord = d.f_idpropiedad\n" +
                "    inner join t_detalle_factura df on d.f_iddetalle = df.f_idrecord\n" +
                "WHERE \n" +
                "\tdf.f_idfactura = ${idfactura}"

        //println sql

        propiedades = sqlService.getQuery(sql)
        propiedades
    }

    def getClienteByTelefono(String filtro, Long idempresa) {
        List cliente

        String sql = "select * from v_clientes as c where c.f_idempresa = ${idempresa} AND c.f_telefono = ${filtro}"

        cliente = sqlService.getQuery(sql)
        cliente
    }

    def getListaDireccioneCliente(String telefono, Long empresa) {
        String sql = "select \n" +
                "coalesce(cli.f_nombre,'')||' '||coalesce(cli.f_apellido,'') as f_nombre,\n" +
                "e.f_direccion,\n" +
                "e.f_sector,\n" +
                "e.f_idrecord as f_idrecord_direccion, \n" +
                "e.f_idcliente as f_idrecord," +
                "e.f_direccion_principal \n" +
                "FROM t_clientes_direcciones_envios as  e " +
                "INNER JOIN t_clientes as cli on cli.f_idrecord = e.f_idcliente " +
                "where e.f_idempresa = $empresa and cli.f_telefono = '$telefono' ";

        List list = sqlService.GetQuery(sql);

        //println list
        return list;
    }

    def asignarMsj(Long idfactura, Long idmensajero) {
        String sql = "UPDATE t_facturas SET f_mensajero = ${idmensajero} WHERE f_idrecord = ${idfactura}"
        sqlService.Ejecutarsql(sql)
        return true
    }

    def ListarFacturaReimprimirById(String empresa, String idrecord, Boolean abierta) {

        String campo = "";
        String campo_fecha = "";
        String titulo = "";
        if (abierta) {
            campo = "fac.f_numero_orden";
            campo_fecha = "fac.f_fecha_regstro_orden";
            titulo = "Orden";
        } else {
            campo = "fac.f_numero_factura";
            campo_fecha = "fac.f_fecha_registro_factura";
            titulo = "Factura";
        }


        String sql = "select fac.f_tipo_documento_factura || to_char(fac.f_numero_factura, 'FM000000') as f_numero,\n" +
                "       COALESCE(to_char(fac.f_numero_factura, 'FM000000'),'') as f_numero1,\n" +
                "       to_char(fac.f_fecha_registro_factura, 'yyyy/MM/dd HH24:MI:SS') as f_fecha_registro_factura,\n" +
                "       COALESCE(cli.f_nombre, '') || ' ' || COALESCE(cli.f_apellido,'') as f_camarero,\n" +
                "       'Factura' as f_titulo,\n" +
                "       de.f_idrecord as f_iddetalle,\n" +
                "       COALESCE(fac.f_total, 0) as f_total,\n" +
                "       COALESCE(fac.f_total + emp.f_precio_envio, 0) as f_total_con_envio,\n" +
                "       COALESCE(fac.f_subtotal, 0) as f_subtotal,\n" +
                "       COALESCE(fac.f_total + fac.f_porciento_ley, 0) as f_total_con_porciento_ley,\n" +
                "       COALESCE(fac.f_porciento_ley, 0) as f_porciento_ley,\n" +
                "       COALESCE(fac.f_itebis, 0) as f_tax,\n" +
                "       COALESCE(fac.f_total_extra, 0) as f_extra,\n" +
                "       pr.f_referencia,\n" +
                "       pr.f_descripcion,\n" +
                "       de.f_cantidad,\n" +
                "       COALESCE(de.f_itebis, 0) as f_itebis,\n" +
//                "      CASE WHEN emp.f_impresion_detalle_factura = TRUE AND emp.f_impuesto_incluido = true \n" +
//                "       \tTHEN COALESCE(de.f_precio, 0) - COALESCE(de.f_itebis,0)\n" +
//                "       WHEN emp.f_impresion_detalle_factura = TRUE AND emp.f_impuesto_incluido = FALSE\n" +
//                "       \tTHEN COALESCE(de.f_precio, 0) + COALESCE(de.f_itebis,0)\n" +
//                "        ELSE\n" +
//                "       \tCOALESCE(de.f_precio, 0)\n" +
//                "       END\n" +
//                "       as f_precio," +
                "       COALESCE(de.f_precio, 0) as f_precio, \n" +
                "       COALESCE(fac.f_numero_ncf, '') as f_numero_ncf,\n" +
                "       COALESCE(fac.f_descuento, 0) as f_descuento,\n" +
                "       m.f_descripcion as f_mesa,\n" +
                "       COALESCE(u.f_nombre, '') || ' ' || COALESCE(u.f_apellido, '') as f_cajero,\n" +
                "       COALESCE(fac.f_monto_efectivo, 0) as f_monto_efectivo,\n" +
                "       COALESCE(fac.f_devuelta, 0) as f_devuelta,\n" +
                "       COALESCE(pt.f_monto, 0) as f_monto_tarjeta,\n" +
                "       COALESCE(pt.f_propina, 0) as f_propina,\n" +
                "       COALESCE(de.f_itebis, 0) as f_itebis_producto,\n" +
                "       emp.f_nombre as f_nombre_empresa,\n" +
                "       emp.f_web as f_web,\n" +
                "       emp.f_precio_envio as f_precio_envio,\n" +
                "       emp.f_header_facturas_pequenas as f_header_factura_pequena,\n" +
                "       COALESCE(emp.f_mensaje_factura,'') as f_mensaje_factura,\n" +
                "       get_componentes_detalles_impresion_json(de.f_idrecord) as f_componentes,\n" +
                "       emp.f_mensaje_orden as f_mensaje_orden,\n" +
                "       COALESCE(cliente.f_nombre,'') as f_cliente,\n" +
                "        CASE WHEN COALESCE(fac.f_observacion, '') = 'null' THEN ''\n" +
                "       ELSE COALESCE(fac.f_observacion, '') END as f_observacion,\n" +
                "       COALESCE(fac.f_rnc,'') as f_rnc,\n" +
                "       COALESCE(fac.f_razon_social,'') as f_razon_social,\n" +
                "       get_fecha_vigencia_ncf(fac.f_tipo_ncf,fac.f_idempresa) as f_fecha_vigencia_ncf,\n" +
                "       CASE WHEN COALESCE(fac.f_rnc,'') <> '' THEN 'Factura de credito fiscal ' || COALESCE(doc.f_descripcion_tipo,'')  " +
                "       ELSE COALESCE(doc.f_descripcion_tipo,'') END as titulo_impresion,\n" +
                "       emp.f_impresion_detalle_factura,\n" +
                "       fac.f_modulo,\n" +
                "       CASE WHEN COALESCE(fac.f_direccion_envio,'') = 'null' THEN ''\n" +
                "       ELSE COALESCE(fac.f_direccion_envio,'') END as f_direccion,\n" +
                "       COALESCE(msj.f_nombre,'')  as f_mensajero\n" +
                "FROM t_facturas as fac\n" +
                "     INNER JOIN t_detalle_factura as de on fac.f_idrecord = de.f_idfactura\n" +
                "     LEFT join t_camareros as cli on cli.f_idrecord = fac.f_camarero\n" +
                "     INNER join t_productos as pr on pr.f_idrecord = de.f_idproducto\n" +
                "     LEFT JOIN t_mesas as m on m.f_idrecord = fac.f_mesa\n" +
                "     LEFT JOIN t_pagos_tarjeta pt on pt.f_idfactura = fac.f_idrecord\n" +
                "     LEFT join t_usuarios as u on u.f_idrecord = fac.f_facturado_por\n" +
                "     INNER JOIN cfg.t_empresas as emp on emp.f_idrecord = fac.f_idempresa\n" +
                "     LEFT JOIN v_clientes as cliente on cliente.f_wholenum = fac.f_wholenum_cliente \n" +
                "     LEFT JOIN t_tiposdocumentos doc on fac.f_tipo_documento_factura = doc.f_tipodoc and doc.f_idempresa = ${empresa}     \n" +
                "     LEFT JOIN envios.t_mensajeros msj on msj.f_idrecord = fac.f_mensajero     \n" +
                "     WHERE      \n" +
                "     fac.f_idrecord = ${idrecord}    \n" +
                "     and fac.f_idempresa=${empresa}"
        //println sql;

        List list = sqlService.GetQuery(sql);
        return list;
    }

    def getDataOrdenToPrint(String empresa, String idrecord) {

        String campo = "";
        String campo_fecha = "";
        String titulo = "";
//        if (abierta)
//        {
//            campo = "fac.f_numero_orden";
//            campo_fecha = "fac.f_fecha_regstro_orden";
//            titulo = "Orden";
//        }else{
//            campo = "fac.f_numero_factura";
//            campo_fecha = "fac.f_fecha_registro_factura";
//            titulo = "Factura";
//        }

        campo = "fac.f_numero_factura";
        campo_fecha = "fac.f_fecha_registro_factura";
        //stitulo = "Factura";


        String sql = " select fac.f_tipo_documento_factura || to_char(fac.f_numero_orden, 'FM000000') as f_numero,\n" +
                "       to_char(f_fecha_regstro_orden, 'yyyy/MM/dd HH24:MI:SS') as f_fecha_registro_factura,\n" +
                "       cli.f_nombre || ' ' || cli.f_apellido as f_camarero,\n" +
                "       de.f_idrecord as f_iddetalle,\n" +
                "       COALESCE(fac.f_total, 0) as f_total,\n" +
                "       COALESCE(fac.f_total + emp.f_precio_envio, 0) as f_total_con_envio,\n" +
                "       COALESCE(fac.f_subtotal, 0) as f_subtotal,\n" +
                "       COALESCE(fac.f_total + fac.f_porciento_ley, 0) as f_total_con_porciento_ley,\n" +
                "       COALESCE(fac.f_porciento_ley, 0) as f_porciento_ley,\n" +
                "       COALESCE(fac.f_itebis, 0) as f_tax,\n" +
                "       COALESCE(fac.f_total_extra, 0) as f_extra,\n" +
                "       pr.f_referencia,\n" +
                "       pr.f_descripcion,\n" +
                "       de.f_cantidad,\n" +
                "       COALESCE(de.f_itebis, 0) as f_itebis,\n" +
                "      CASE WHEN emp.f_impresion_detalle_factura = TRUE AND emp.f_impuesto_incluido = true \n" +
                "       \tTHEN COALESCE(de.f_precio, 0) - COALESCE(de.f_itebis,0)\n" +
                "       WHEN emp.f_impresion_detalle_factura = TRUE AND emp.f_impuesto_incluido = FALSE\n" +
                "       \tTHEN COALESCE(de.f_precio, 0) + COALESCE(de.f_itebis,0)\n" +
                "        ELSE\n" +
                "       \tCOALESCE(de.f_precio, 0)\n" +
                "       END\n" +
                "       as f_precio," +
                "       COALESCE(fac.f_numero_ncf, '') as f_numero_ncf,\n" +
                "       COALESCE(fac.f_descuento, 0) as f_descuento,\n" +
                "       m.f_descripcion as f_mesa,\n" +
                "       COALESCE(u.f_nombre, '') || ' ' || COALESCE(u.f_apellido, '') as f_cajero,\n" +
                "       COALESCE(fac.f_monto_efectivo, 0) as f_monto_efectivo,\n" +
                "       COALESCE(fac.f_devuelta, 0) as f_devuelta,\n" +
                "       COALESCE(pt.f_monto, 0) as f_monto_tarjeta,\n" +
                "       COALESCE(pt.f_propina, 0) as f_propina,\n" +
                "       COALESCE(de.f_itebis, 0) as f_itebis_producto,\n" +
                "       emp.f_nombre as f_nombre_empresa,\n" +
                "       emp.f_web as f_web,\n" +
                "       emp.f_precio_envio as f_precio_envio,\n" +
                "       emp.f_header_facturas_pequenas as f_header_factura_pequena,\n" +
                "       COALESCE(emp.f_mensaje_factura,'') as f_mensaje_factura,\n" +
                "       get_componentes_detalles_impresion_json(de.f_idrecord) as f_componentes,\n" +
                "       emp.f_mensaje_orden as f_mensaje_orden,\n" +
                "       COALESCE(cliente.f_nombre,'') as f_cliente,\n" +
                "        CASE WHEN fac.f_observacion = 'null' THEN ''\n" +
                "       ELSE fac.f_observacion END as f_observacion,\n" +
                "       COALESCE(fac.f_rnc,'') as f_rnc,\n" +
                "       COALESCE(fac.f_razon_social,'') as f_razon_social,\n" +
                "       get_fecha_vigencia_ncf(fac.f_tipo_ncf,fac.f_idempresa) as f_fecha_vigencia_ncf,\n" +
                "       COALESCE(doc.f_descripcion_tipo,'')as titulo_impresion,\n" +
                "       emp.f_impresion_detalle_factura,\n" +
                "       de.f_idrecord as detalle_id,\n" +
                "       fac.f_modulo,\n" +
                "       CASE WHEN fac.f_direccion_envio = 'null' THEN ''\n" +
                "       ELSE fac.f_direccion_envio END as f_direccion, " +
                "\n" +
                "       COALESCE(fac.f_observacion, '') AS f_observacion,\n" +
                "       COALESCE(de.f_comentario, '') AS f_comentario\n" +
                "FROM t_facturas as fac\n" +
                "     INNER JOIN t_detalle_factura as de on fac.f_idrecord = de.f_idfactura\n" +
                "     LEFT join t_camareros as cli on cli.f_idrecord = fac.f_camarero\n" +
                "     INNER join t_productos as pr on pr.f_idrecord = de.f_idproducto\n" +
                "     LEFT JOIN t_mesas as m on m.f_idrecord = fac.f_mesa\n" +
                "     LEFT JOIN t_pagos_tarjeta pt on pt.f_idfactura = fac.f_idrecord\n" +
                "     LEFT join t_usuarios as u on u.f_idrecord = fac.f_facturado_por\n" +
                "     INNER JOIN cfg.t_empresas as emp on emp.f_idrecord = fac.f_idempresa\n" +
                "     LEFT JOIN v_clientes as cliente on cliente.f_wholenum = fac.f_wholenum_cliente \n" +
                "     LEFT JOIN t_tiposdocumentos doc on fac.f_tipo_documento_factura = doc.f_tipodoc and doc.f_idempresa = ${empresa}" +
                "     WHERE " +
                "     fac.f_idrecord = $idrecord " +
                "     and fac.f_idempresa='$empresa' ";
        // println sql;

        List list = sqlService.GetQuery(sql);
        return list;
    }

    def getCuadreToPrint(Long idcuadre) {
        String sql = "SELECT \n" +
                "\te.f_header_facturas_pequenas,\n" +
                "    e.f_nombre as f_nombre_empresa,\n" +
                "    'Cuadre de caja' as titulo_impresion,\n" +
                "    e.f_web as f_web,\n" +
                "    COALESCE(u.f_nombre, '') || ' ' || COALESCE(u.f_apellido, '') as cajero,\n" +
                "    --c.* ,\n" +
                "   COALESCE(c.f_factcontado,0) as f_factcontado,\n" +
                "  COALESCE(c.f_factcredito,0) as f_factcredito,\n" +
                "  COALESCE(c.f_pedidos,0) as f_pedidos,\n" +
                "  COALESCE(c.f_montocredito,0) as f_montocredito,\n" +
                "  COALESCE(c.f_montocontado,0) as f_montocontado,\n" +
                "  COALESCE(c.f_monto_pedidos,0) as f_monto_pedidos,\n" +
                "  COALESCE(c.f_montotarjeta,0) as f_montotarjeta,\n" +
                "  COALESCE(c.f_montoitbis,0) as f_montoitbis,\n" +
                "  COALESCE(c.f_montocheque,0) as f_montocheque,\n" +
                "  COALESCE(c.f_montoenvio,0) as f_montoenvio,\n" +
                "  COALESCE(c.f_monto_caja,0) as f_monto_caja,\n" +
                "  COALESCE(c.f_monto_recibo,0) as f_monto_recibo,\n" +
                "  COALESCE(c.f_monto_cancelado,0) as f_monto_cancelado,\n" +
                "      to_char(c.f_fecha_generado, 'dd/MM/yyyy  hh:mi:ss pm') as  f_fecha_generado\n" +
                "     \n" +
                "FROM \n" +
                "\tcfg.t_empresas e INNER JOIN t_cuadre_cajero c ON e.f_idrecord = c.f_idempresa\n" +
                "    LEFT JOIN t_usuarios u ON c.f_cajero = u.f_idrecord\n" +
                "WHERE \n" +
                "\tc.f_idrecord =  ${idcuadre}"

        println sql
        Map response = sqlService.GetQueryMap(sql)
        return response
    }

    def getCuadreGeneralToPrint(Long idcuadre) {
        String sql = "SELECT \n" +
                "\te.f_header_facturas_pequenas,\n" +
                "    e.f_nombre as f_nombre_empresa,\n" +
                "    'Cuadre General' as titulo_impresion,\n" +
                "    e.f_web as f_web,\n" +
                "    COALESCE(u.f_nombre, '') || ' ' || COALESCE(u.f_apellido, '') as cajero,\n" +
                "    --c.* ,\n" +
                "   COALESCE(c.f_factcontado,0) as f_factcontado,\n" +
                "  COALESCE(c.f_factcredito,0) as f_factcredito,\n" +
                "  COALESCE(c.f_pedidos,0) as f_pedidos,\n" +
                "  COALESCE(c.f_montocredito,0) as f_montocredito,\n" +
                "  COALESCE(c.f_montocontado,0) as f_montocontado,\n" +
                "  COALESCE(c.f_monto_pedidos,0) as f_monto_pedidos,\n" +
                "  COALESCE(c.f_montotarjeta,0) as f_montotarjeta,\n" +
                "  COALESCE(c.f_montoitbis,0) as f_montoitbis,\n" +
                "  COALESCE(c.f_montocheque,0) as f_montocheque,\n" +
                "  COALESCE(c.f_montoenvio,0) as f_montoenvio,\n" +
                "  COALESCE(c.f_monto_caja,0) as f_monto_caja,\n" +
                "  COALESCE(c.f_monto_recibo,0) as f_monto_recibo,\n" +
                "  COALESCE(c.f_monto_cancelado,0) as f_monto_cancelado,\n" +
                "      to_char(c.f_fecha_generado, 'dd/MM/yyyy  hh:mi:ss pm') as  f_fecha_generado\n" +
                "     \n" +
                "FROM \n" +
                "\tcfg.t_empresas e INNER JOIN t_cuadre_diario c ON e.f_idrecord = c.f_idempresa\n" +
                "    LEFT JOIN t_usuarios u ON c.f_hecho_por = u.f_idrecord\n" +
                "WHERE \n" +
                "\tc.f_idrecord =  ${idcuadre}"
        // println sql
        Map response = sqlService.GetQueryMap(sql)
        return response
    }

    def ListarFacturadDeliveryReimprimirById(String empresa, String idrecord, Boolean abierta) {

        String campo = "";
        String campo_fecha = "";
        String titulo = "";
        if (abierta) {
            campo = "fac.f_numero_orden";
            campo_fecha = "fac.f_fecha_regstro_orden";
            titulo = "Orden";
        } else {
            campo = "fac.f_numero_factura";
            campo_fecha = "fac.f_fecha_registro_factura";
            titulo = "Factura";
        }


        String sql = "select fac.f_tipo_documento_factura || to_char($campo, 'FM000000') as f_numero,\n" +
                "       COALESCE(to_char(fac.f_numero_factura, 'FM000000'),'') as f_numero1,\n" +
                "       to_char($campo_fecha, 'yyyy/MM/dd hh:mm') as f_fecha_registro_factura,\n" +
                "       cli.f_nombre || ' ' || cli.f_apellido as f_camarero,\n" +
                "       '$titulo' as f_titulo,\n" +
                "       de.f_idrecord as f_iddetalle,\n" +
                "       COALESCE(fac.f_total + emp.f_precio_envio, 0) as f_total,\n" +
                "       COALESCE(fac.f_subtotal, 0) as f_subtotal,\n" +
                "       COALESCE(fac.f_porciento_ley, 0) as f_porciento_ley,\n" +
                "       COALESCE(fac.f_itebis, 0) as f_tax,\n" +
                "       COALESCE(fac.f_total_extra, 0) as f_extra,\n" +
                "       pr.f_referencia,\n" +
                "       pr.f_descripcion,\n" +
                "       de.f_cantidad,\n" +
                "       COALESCE(de.f_itebis, 0) as f_itebis,\n" +
                "       COALESCE(de.f_precio, 0) as f_precio,\n" +
                "       COALESCE(fac.f_numero_ncf, '') as f_numero_ncf,\n" +
                "       COALESCE(fac.f_descuento, 0) as f_descuento,\n" +
                "       m.f_descripcion as f_mesa,\n" +
                "       u.f_nombre || ' ' || u.f_apellido as f_cajero,\n" +
                "       COALESCE(fac.f_monto_efectivo, 0) as f_monto_efectivo,\n" +
                "       COALESCE(fac.f_devuelta, 0) as f_devuelta,\n" +
                "       COALESCE(pt.f_monto, 0) as f_monto_tarjeta,\n" +
                "       COALESCE(pt.f_propina, 0) as f_propina,\n" +
                "       COALESCE(de.f_itebis, 0) as f_itebis_producto,\n" +
                "       emp.f_nombre as f_nombre_empresa,\n" +
                "       emp.f_web as f_web,\n" +
                "       emp.f_precio_envio as f_precio_envio,\n" +
                "       emp.f_header_facturas_pequenas as f_header_factura_pequena,\n" +
                "       COALESCE(emp.f_mensaje_factura,'') as f_mensaje_factura,\n" +
                "       get_componentes_detalles_impresion_json(de.f_idrecord) as f_componentes,\n" +
                "       emp.f_mensaje_orden as f_mensaje_orden,\n" +
                "       COALESCE(cliente.f_nombre,'') as f_cliente,\n" +
                "       COALESCE(fac.f_observacion,'') as f_observacion,\n" +
                "       COALESCE(fac.f_direccion_envio,'') as f_direccion\n" +
                "FROM t_facturas as fac\n" +
                "     INNER JOIN t_detalle_factura as de on fac.f_idrecord = de.f_idfactura\n" +
                "     LEFT join t_camareros as cli on cli.f_idrecord = fac.f_camarero\n" +
                "     INNER join t_productos as pr on pr.f_idrecord = de.f_idproducto\n" +
                "     LEFT JOIN t_mesas as m on m.f_idrecord = fac.f_mesa\n" +
                "     LEFT JOIN t_pagos_tarjeta pt on pt.f_idfactura = fac.f_idrecord\n" +
                "     LEFT join t_usuarios as u on u.f_idrecord = fac.f_facturado_por\n" +
                "     INNER JOIN cfg.t_empresas as emp on emp.f_idrecord = fac.f_idempresa\n" +
                "     LEFT JOIN v_clientes as cliente on cliente.f_idrecord = fac.f_idcliente \n" +
                "     WHERE " +
                "     fac.f_idrecord = $idrecord " +
                "     and fac.f_idempresa='$empresa' ";
        // println sql;

        List list = sqlService.GetQuery(sql);
        return list;
    }

    def generarCuadreCaja(Long idusuario, Long idEmpresa) {
        String sql = "select generar_cuadre_cajero('${idusuario}'::Integer, '${idEmpresa}'::Integer) as id"
        Map response = sqlService.GetQueryMap(sql)


        return response
    }

    def generarCuadreGeneral(Long idusuario, Long idEmpresa) {
        String sql = "select generar_cuadre_diario('${idusuario}'::Integer, '${idEmpresa}'::Integer) as id"
        Map response = sqlService.GetQueryMap(sql)


        return response
    }

    def getMensajerosFiltradoByName(Long idempresa, String nombre) {
        String sql = "select \n" +
                "m.f_email,\n" +
                "z.f_nombre_zona as f_zona,\n" +
                "z.f_idrecord as f_idzona,\n" +
                "m.f_telefono,\n" +
                "m.f_nombre,\n" +
                "m.f_deviceid,\n" +
                "m.f_idrecord\n" +
                "from envios.t_mensajeros m \n" +
                "inner join envios.t_zonas z on m.f_zona = z.f_idrecord  \n" +
                "where m.f_idempresa = ${idempresa} and m.f_nombre ILIKE '%${nombre}%' "
        List response = sqlService.GetQuery(sql)
        return response
    }

    def getMensajero(Long idempresa, Long idmensajero) {
        String sql = "select \n" +
                "m.f_email,\n" +
                "z.f_nombre_zona as f_zona,\n" +
                "z.f_idrecord as f_idzona,\n" +
                "m.f_telefono,\n" +
                "m.f_nombre,\n" +
                "m.f_deviceid,\n" +
                "m.f_idrecord\n" +
                "from envios.t_mensajeros m \n" +
                "inner join envios.t_zonas z on m.f_zona = z.f_idrecord  \n" +
                "where m.f_idempresa = ${idempresa} and  m.f_idrecord = ${idmensajero}"
        Map response = sqlService.GetQueryMap(sql)
        return response
    }

    def guardarMensajero(JSONObject data, Long idEmpresa) {

        Tmensajeros mensajeros

        if (data.id.toString().toLong() > 0 && !data.id.toString().equals("")) {
            mensajeros = Tmensajeros.findById(data.id.toString().toLong())
        } else {
            mensajeros = new Tmensajeros()
        }

        mensajeros.fNombre = data.f_nombre.toString()
        mensajeros.fEmail = data.f_email.toString()
        mensajeros.fTelefono = data.f_telefono.toString()
        mensajeros.fZona = data.f_zona.toString().toInteger()
        mensajeros.fDeviceid = data.f_device.toString()
        mensajeros.fIdempresa = idEmpresa

        mensajeros.save(failOnError: true)
        mensajeros

    }

    def guardarZona(JSONObject data, Long idEmpresa) {

        Tzonas zona
        TzonasSectores sectores
        TzonasSectores listaSectores
        List sectoToDel
        List sectores_in
        String sql = "DELETE FROM envios.t_zonas_sectores where f_idrecord not in ("


        if (data.id.toString().toLong() > 0 && !data.id.toString().equals("")) {
            zona = Tzonas.findById(data.id.toString().toLong())
        } else {
            zona = new Tzonas()
        }

        zona.fIdempresa = idEmpresa
        zona.fNombreZona = data.f_nombre_zona.toString()
        zona.save(failOnError: true)

//        listaSectores = TzonasSectores.findAllByFIdzona(zona.id)

        if (zona && !data.sectores.isEmpty()) {
            sectores_in = data.sectores
            sectores_in.eachWithIndex { row, i ->
                sectores = TzonasSectores.findById(row.f_idsector)

                if (sectores) {
                    sectores.fSector = row.f_sector.toString()
                    sectores.fIdzona = zona.id
                } else {
                    sectores = new TzonasSectores()
                    sectores.fSector = row.f_sector.toString()
                    sectores.fIdzona = zona.id
                }
                sectores.save(failOnError: true)
                sql += (i < (sectores_in.size() - 1)) ? sectores.id + "," : sectores.id + ""
            }
            // sectoToDel.add(sectores.id)
            sql += ") AND f_idzona = ${zona.id}"
            sqlService.Ejecutarsql(sql)
        }

        //  println sectoToDel

        zona
    }

    def getSectores(Long idzona) {
        String sql = "SELECT \n" +
                "  z.f_idrecord as f_idzona,\n" +
                "  z.f_nombre_zona,\n" +
                "  COALESCE(s.f_idrecord, 0) as f_idsector,\n" +
                "  COALESCE(f_sector, '') as f_sector\n" +
                "FROM \n" +
                "  envios.t_zonas_sectores s right join envios.t_zonas z on s.f_idzona = z.f_idrecord\n" +
                "where z.f_idrecord = ${idzona} \n" +
                "\t"
        List response
        response = sqlService.getQuery(sql)
        return response
    }

    List<Map<String, Object>> getProductosByCategoria(Long idempresa, Long idcategoria) {
        String sql = "SELECT \n" +
                "  p.f_idrecord as \"id\",\n" +
                "  p.f_idempresa as \"fIdempresa\",\n" +
                "  p.f_referencia as \"fReferencia\",\n" +
                "  p.f_descripcion as \"fDescripcion\",\n" +
                "  p.f_controlinventario as \"fControlinventario\",\n" +
                "  p.f_idcategoria as \"fIdcategoria\",\n" +
                "  p.f_reorden  as \"fReorden\",\n" +
                "  p.f_maxdescuento as  \"fMaxdescuento\",\t\n" +
                "  CASE WHEN p.f_precio_delivery > 0 THEN p.f_precio_delivery ELSE p.f_precio END as \"fPrecio\",\n" +
                "  p.f_ultimocosto as \"fUltimocosto\",\n" +
                "  p.f_limiteminimo as \"fLimiteminimo\",\n" +
                "  p.f_limitemaximo as \"fLimitemaximo\",\n" +
                "  p.f_existencia as \"fExistencia\",\n" +
                "  p.f_tax as \"fTax\",\n" +
                "  p.f_fecha as \"fFecha\",\n" +
                "  p.f_makeup as \"fMakeup\",\n" +
                "  p.f_ultimocosto1 as \"fUltimocosto1\",\n" +
                "  p.f_ultimocosto2 as \"fUltimocosto2\",\n" +
                "  p.f_fecha_vencimiento as \"fFechaVencimiento\",\n" +
                "  p.f_idlocalizacion as \"fIdlocalizacion\",\n" +
                "  p.f_kit as \"fKit\",\n" +
                "  p.f_descontinuado as \"fDescontinuado\",\n" +
                "  p.f_mensaje as \"fMensaje\",\n" +
                "  p.f_idunidad as \"fIdunidad\",\n" +
                "  p.f_plato as \"fPlato\",\n" +
                "  p.f_receta as \"fReceta\",\n" +
                "  p.f_tragos as \"fTragos\",\n" +
                "  p.f_ventas_decimales as \"fVentasDecimales\",\n" +
                "  p.f_imprime_ingrediente as \"fImprimeIngrediente\",\n" +
                "  p.f_comanda as \"fComanda\",\n" +
                "  p.f_precio, " +
                "  p.f_precio_delivery as \"fPrecioDelivery\"\n" +
                "FROM \n" +
                "  public.t_productos p WHERE p.f_idcategoria = ${idcategoria} and p.f_idempresa = ${idempresa}  ORDER BY" +
                " length(p.f_descripcion) ASC"

        List response
        // println sql
        response = sqlService.getQuery(sql)
        return response
    }

    Map<String, Object> getProductosById(Long idproducto, Long idempresa) {
        Map response

        String sql = "SELECT \n" +
                "  p.f_idrecord as \"id\",\n" +
                "  p.f_idempresa as \"fIdempresa\",\n" +
                "  p.f_referencia as \"fReferencia\",\n" +
                "  p.f_descripcion as \"fDescripcion\",\n" +
                "  p.f_controlinventario as \"fControlinventario\",\n" +
                "  p.f_idcategoria as \"fIdcategoria\",\n" +
                "  p.f_reorden  as \"fReorden\",\n" +
                "  p.f_maxdescuento as  \"fMaxdescuento\",\t\n" +
                "  CASE WHEN p.f_precio_delivery > 0 THEN p.f_precio_delivery ELSE p.f_precio END as \"fPrecio\",\n" +
                "  p.f_ultimocosto as \"fUltimocosto\",\n" +
                "  p.f_limiteminimo as \"fLimiteminimo\",\n" +
                "  p.f_limitemaximo as \"fLimitemaximo\",\n" +
                "  p.f_existencia as \"fExistencia\",\n" +
                "  p.f_tax as \"fTax\",\n" +
                "  p.f_fecha as \"fFecha\",\n" +
                "  p.f_makeup as \"fMakeup\",\n" +
                "  p.f_ultimocosto1 as \"fUltimocosto1\",\n" +
                "  p.f_ultimocosto2 as \"fUltimocosto2\",\n" +
                "  p.f_fecha_vencimiento as \"fFechaVencimiento\",\n" +
                "  p.f_idlocalizacion as \"fIdlocalizacion\",\n" +
                "  p.f_kit as \"fKit\",\n" +
                "  p.f_descontinuado as \"fDescontinuado\",\n" +
                "  p.f_mensaje as \"fMensaje\",\n" +
                "  p.f_idunidad as \"fIdunidad\",\n" +
                "  p.f_plato as \"fPlato\",\n" +
                "  p.f_receta as \"fReceta\",\n" +
                "  p.f_tragos as \"fTragos\",\n" +
                "  p.f_ventas_decimales as \"fVentasDecimales\",\n" +
                "  p.f_imprime_ingrediente as \"fImprimeIngrediente\",\n" +
                "  p.f_comanda as \"fComanda\",\n" +
                "  p.f_precio,\n" +
                "  p.f_precio_delivery as \"fPrecioDelivery\"\n" +
                "FROM \n" +
                "  public.t_productos p WHERE p.f_idrecord = ${idproducto} and p.f_idempresa = ${idempresa}"

        response = sqlService.GetQueryMap(sql)
        return response

    }

    def guardarPagoCuentaPorPagar(JSONObject pago, Long idempresa, Long idusuario) {
        Long numeroRecibo = 5
        Map recibo
        String concepto = pago.concepto
        def tipoDocumento = Ttiposdocumentos.findByFIdordenadorAndFIdempresa(numeroRecibo, idempresa)
        def numeroSecuenciaDocumento = sqlService.GetSecuencia(tipoDocumento.fTipodoc, idempresa)

        String insertRecibo = "WITH t AS (\n" +
                "\tINSERT INTO \n" +
                "    public.t_recibos\n" +
                "  (\n" +
                "    f_idempresa,\n" +
                "    f_fecha,\n" +
                "    f_idcliente,\n" +
                "    f_numrecibo,\n" +
                "    f_concepto,\n" +
                "    f_monto,\n" +
                "    f_aplicado,\n" +
                "    f_tiporecibo,\n" +
                "    f_descargado,\n" +
                "    f_hecho_por\n" +
                "  )\n" +
                "  VALUES (\n" +
                "    ${idempresa},\n" +
                "    NOW(),\n" +
                "    ${pago.f_idcliente},\n" +
                "    ${numeroSecuenciaDocumento},\n" +
                "    '${concepto}',\n" +
                "    ${pago.monto},\n" +
                "    '${pago.f_documento},${concepto},${pago.monto}',\n" +
                "    '${tipoDocumento.fTipodoc}',\n" +
                "    false,\n" +
                "    ${idusuario}\n" +
                "  ) RETURNING *\t\n" +
                ")\n" +
                "SELECT * FROM t;"

        recibo = sqlService.GetQueryMap(insertRecibo)

        String insertPago = "\n" +
                "\tINSERT INTO \n" +
                "  cxc.t_aplicaciones\n" +
                "(\n" +
                "  f_iddocumentoaplicado,\n" +
                "  f_iddocumentoaplico,\n" +
                "  f_monto,\n" +
                "  f_fecha,\n" +
                "  f_concepto,\n" +
                "  f_hecho_por\n" +
                ")\n" +
                "VALUES (\n" +
                "  ${pago.f_idrecord},\n" +
                "  ${recibo.f_idrecord},\n" +
                "  ${pago.monto},\n" +
                "  NOW(),\n" +
                "  '${concepto}',\n" +
                "  ${idusuario}\n" +
                ");"
        sqlService.Ejecutarsql(insertPago)
        sqlService.Ejecutarsql("UPDATE cxc.t_cuenta_cobrar SET f_balance = f_balance - ${pago.monto}  WHERE f_idrecord = ${pago.f_idrecord}")
        //println recibo.f_idrecord
        return recibo
    }

    def guardarSaldoDeCuentas(JSONObject pago, Long idempresa, Long idusuario) {
        Long numeroRecibo = 5
        Map recibo
        String concepto = pago.concepto
        def tipoDocumento = Ttiposdocumentos.findByFIdordenadorAndFIdempresa(numeroRecibo, idempresa)
        def numeroSecuenciaDocumento = sqlService.GetSecuencia(tipoDocumento.fTipodoc, idempresa)
        String insertRecibo = ""
        String detalleRecibo = ""
        String insertPago = ""

        //
        if (!pago.rows.isEmpty()) {
            pago.rows.eachWithIndex { row, i ->
                detalleRecibo += "${row.f_documento},${concepto},${row.f_monto};"
            }
        }

        insertRecibo = "WITH t AS (\n" +
                "\tINSERT INTO \n" +
                "    public.t_recibos\n" +
                "  (\n" +
                "    f_idempresa,\n" +
                "    f_fecha,\n" +
                "    f_idcliente,\n" +
                "    f_numrecibo,\n" +
                "    f_concepto,\n" +
                "    f_monto,\n" +
                "    f_aplicado,\n" +
                "    f_tiporecibo,\n" +
                "    f_descargado,\n" +
                "    f_hecho_por\n" +
                "  )\n" +
                "  VALUES (\n" +
                "    ${idempresa},\n" +
                "    NOW(),\n" +
                "    ${pago.rows[0].f_idcliente},\n" +
                "    ${numeroSecuenciaDocumento},\n" +
                "    '${concepto}',\n" +
                "    ${pago.monto},\n" +
                "    '${detalleRecibo}',\n" +
                "    '${tipoDocumento.fTipodoc}',\n" +
                "    FALSE,\n" +
                "    ${idusuario}\n" +
                "  ) RETURNING *\t\n" +
                ")\n" +
                "SELECT * FROM t;"


        recibo = sqlService.GetQueryMap(insertRecibo)


        if (!pago.rows.isEmpty()) {
            pago.rows.eachWithIndex { row, i ->
                insertPago = "\n" +
                        "\tINSERT INTO \n" +
                        "  cxc.t_aplicaciones\n" +
                        "(\n" +
                        "  f_iddocumentoaplicado,\n" +
                        "  f_iddocumentoaplico,\n" +
                        "  f_monto,\n" +
                        "  f_fecha,\n" +
                        "  f_concepto,\n" +
                        "  f_hecho_por\n" +
                        ")\n" +
                        "VALUES (\n" +
                        "  ${row.f_idrecord},\n" +
                        "  ${recibo.f_idrecord},\n" +
                        "  ${row.f_monto},\n" +
                        "  NOW(),\n" +
                        "  '${concepto}',\n" +
                        "  ${idusuario}\n" +
                        ");"
                sqlService.Ejecutarsql(insertPago)
                sqlService.Ejecutarsql("UPDATE cxc.t_cuenta_cobrar SET f_balance = 0  WHERE f_idrecord = ${row.f_idrecord}")
            }
        }

        //println recibo.f_idrecord
        return recibo
    }


    def guardarNotaCuentas(JSONObject pago, Long idempresa, Long idusuario) {
        Long numeroRecibo = 11
        Map recibo
        String concepto = pago.concepto
        def tipoDocumento = Ttiposdocumentos.findByFIdordenadorAndFIdempresa(numeroRecibo, idempresa)
        def numeroSecuenciaDocumento = sqlService.GetSecuencia(tipoDocumento.fTipodoc, idempresa)
        String insertRecibo = ""
        String detalleRecibo = ""
        String insertPago = ""

        //
        if (!pago.rows.isEmpty()) {
            pago.rows.eachWithIndex { row, i ->
                detalleRecibo += "${row.f_documento},${concepto},${row.f_monto};"
            }
        }

        insertRecibo = "WITH t AS (\n" +
                "\tINSERT INTO \n" +
                "    cxc.t_nota_credito\n" +
                "  (\n" +
                "    f_idempresa,\n" +
                "    f_fecha,\n" +
                "    f_idcliente,\n" +
                "    f_numrecibo,\n" +
                "    f_concepto,\n" +
                "    f_monto,\n" +
                "    f_aplicado,\n" +
                "    f_tiporecibo,\n" +
                "    f_descargado,\n" +
                "    f_hecho_por\n" +
                "  )\n" +
                "  VALUES (\n" +
                "    ${idempresa},\n" +
                "    NOW(),\n" +
                "    ${pago.rows[0].f_idcliente},\n" +
                "    ${numeroSecuenciaDocumento},\n" +
                "    '${concepto}',\n" +
                "    ${pago.monto},\n" +
                "    '${detalleRecibo}',\n" +
                "    '${tipoDocumento.fTipodoc}',\n" +
                "    false,\n" +
                "    ${idusuario}\n" +
                "  ) RETURNING *\t\n" +
                ")\n" +
                "SELECT * FROM t;"


        recibo = sqlService.GetQueryMap(insertRecibo)


        if (!pago.rows.isEmpty()) {
            pago.rows.eachWithIndex { row, i ->
                insertPago = "\n" +
                        "\tINSERT INTO \n" +
                        "  cxc.t_aplicaciones\n" +
                        "(\n" +
                        "  f_iddocumentoaplicado,\n" +
                        "  f_iddocumentoaplico,\n" +
                        "  f_monto,\n" +
                        "  f_fecha,\n" +
                        "  f_concepto,\n" +
                        "  f_hecho_por\n" +
                        ")\n" +
                        "VALUES (\n" +
                        "  ${row.f_idrecord},\n" +
                        "  ${recibo.f_idrecord},\n" +
                        "  ${row.f_monto},\n" +
                        "  NOW(),\n" +
                        "  '${concepto}',\n" +
                        "  ${idusuario}\n" +
                        ");"
                sqlService.Ejecutarsql(insertPago)
                sqlService.Ejecutarsql("UPDATE cxc.t_cuenta_cobrar SET f_balance = 0  WHERE f_idrecord = ${row.f_idrecord}")
            }
        }

        //println recibo.f_idrecord
        return recibo
    }

    def guardarNotaCuenta(JSONObject pago, Long idempresa, Long idusuario) {
        Long numeroRecibo = 11
        Map recibo
        String concepto = pago.concepto
        def tipoDocumento = Ttiposdocumentos.findByFIdordenadorAndFIdempresa(numeroRecibo, idempresa)
        def numeroSecuenciaDocumento = sqlService.GetSecuencia(tipoDocumento.fTipodoc, idempresa)

        String insertRecibo = "WITH t AS (\n" +
                "\tINSERT INTO \n" +
                "    cxc.t_nota_credito\n" +
                "  (\n" +
                "    f_idempresa,\n" +
                "    f_fecha,\n" +
                "    f_idcliente,\n" +
                "    f_numrecibo,\n" +
                "    f_concepto,\n" +
                "    f_monto,\n" +
                "    f_aplicado,\n" +
                "    f_tiporecibo,\n" +
                "    f_descargado,\n" +
                "    f_hecho_por\n" +
                "  )\n" +
                "  VALUES (\n" +
                "    ${idempresa},\n" +
                "    NOW(),\n" +
                "    ${pago.f_idcliente},\n" +
                "    ${numeroSecuenciaDocumento},\n" +
                "    '${concepto}',\n" +
                "    ${pago.monto},\n" +
                "    '${pago.f_documento},${concepto},${pago.monto}',\n" +
                "    '${tipoDocumento.fTipodoc}',\n" +
                "    false,\n" +
                "    ${idusuario}\n" +
                "  ) RETURNING *\t\n" +
                ")\n" +
                "SELECT * FROM t;"

        recibo = sqlService.GetQueryMap(insertRecibo)

        String insertPago = "\n" +
                "\tINSERT INTO \n" +
                "  cxc.t_aplicaciones\n" +
                "(\n" +
                "  f_iddocumentoaplicado,\n" +
                "  f_iddocumentoaplico,\n" +
                "  f_monto,\n" +
                "  f_fecha,\n" +
                "  f_concepto,\n" +
                "  f_hecho_por\n" +
                ")\n" +
                "VALUES (\n" +
                "  ${pago.f_idrecord},\n" +
                "  ${recibo.f_idrecord},\n" +
                "  ${pago.monto},\n" +
                "  NOW(),\n" +
                "  '${concepto}',\n" +
                "  ${idusuario}\n" +
                ");"
        sqlService.Ejecutarsql(insertPago)
        sqlService.Ejecutarsql("UPDATE cxc.t_cuenta_cobrar SET f_balance = f_balance - ${pago.monto}  WHERE f_idrecord = ${pago.f_idrecord}")
        //println recibo.f_idrecord
        return recibo
    }

    def imprimirReciboCuentaPorCobrar(String empresa, String id) {
        List resultado
        String sql = "SELECT \n" +
                "r.f_tiporecibo||to_char(r.f_numrecibo,'FM000000') as f_numero,\n" +
                "emp.f_header_facturas_pequenas as f_header_factura_pequena,\n" +
                "emp.f_nombre as f_nombre_empresa,\n" +
                "r.f_fecha as f_fecha,\n" +
                "COALESCE(cli.f_nombre,'')||' '||COALESCE(cli.f_apellido,'') as f_cliente,\n" +
                "r.f_monto as f_total,\n" +
                "emp.f_mensaje_orden,\n" +
                "emp.f_web,\n" +
                "COALESCE(doc.f_descripcion_tipo,'') as titulo_impresion,\n" +
                "r.f_aplicado\n" +
                "from t_recibos as r\n" +
                "INNER JOIN t_clientes as cli on cli.f_idrecord = r.f_idcliente\n" +
                "INNER JOIN cfg.t_empresas as emp on emp.f_idrecord = r.f_idempresa\n" +
                "LEFT JOIN t_tiposdocumentos doc on r.f_tiporecibo = doc.f_tipodoc and doc.f_idempresa = ${empresa}\n" +
                "WHERE r.f_idempresa = $empresa and r.f_idrecord = $id";
        //println sql
        resultado = sqlService.getQuery(sql);
        return resultado
    }

    def listarImprimirReciboNotaCredito(String empresa, String id) {
        List resultado
        String sql = "SELECT \n" +
                "r.f_tiporecibo||to_char(r.f_numrecibo,'FM000000') as f_numero,\n" +
                "emp.f_header_facturas_pequenas as f_header_factura_pequena,\n" +
                "emp.f_nombre as f_nombre_empresa,\n" +
                "r.f_fecha as f_fecha,\n" +
                "COALESCE(cli.f_nombre,'')||' '||COALESCE(cli.f_apellido,'') as f_cliente,\n" +
                "r.f_monto as f_total,\n" +
                "emp.f_mensaje_orden,\n" +
                "emp.f_web,\n" +
                "COALESCE(doc.f_descripcion_tipo,'') as titulo_impresion,\n" +
                "r.f_aplicado\n" +
                "from cxc.t_nota_credito as r\n" +
                "INNER JOIN t_clientes as cli on cli.f_idrecord = r.f_idcliente\n" +
                "INNER JOIN cfg.t_empresas as emp on emp.f_idrecord = r.f_idempresa\n" +
                "LEFT JOIN t_tiposdocumentos doc on r.f_tiporecibo = doc.f_tipodoc and doc.f_idempresa = ${empresa}\n" +
                "WHERE r.f_idempresa = $empresa and r.f_idrecord = $id";
        //println sql
        resultado = sqlService.getQuery(sql);
        return resultado
    }

    def imprimirCuentaPorCobrar(String empresa, String id) {
        List resultado
        String sql = "SELECT \n" +
                "r.f_tipodoc||to_char(r.f_nodoc,'FM000000') as f_numero,\n" +
                "emp.f_header_facturas_pequenas as f_header_factura_pequena,\n" +
                "emp.f_nombre as f_nombre_empresa,\n" +
                "to_char(r.f_fecha, 'dd/MM/yyyy HH24:mm') as f_fecha,\n" +
                "to_char(r.f_fecha_vencimiento, 'dd/MM/yyyy')  as f_fecha_vencimiento,\n" +
                "COALESCE(cli.f_nombre,'')||' '||COALESCE(cli.f_apellido,'') as f_cliente,\n" +
                "r.f_monto as f_total,\n" +
                "emp.f_mensaje_orden,\n" +
                "emp.f_web,\n" +
                "COALESCE(doc.f_descripcion_tipo,'') as titulo_impresion,\n" +
                "COALESCE(r.f_concepto,'') as f_concepto\n" +
                "from cxc.t_cuenta_cobrar as r\n" +
                "INNER JOIN t_clientes as cli on cli.f_idrecord = r.f_idcliente\n" +
                "INNER JOIN cfg.t_empresas as emp on emp.f_idrecord = r.f_idempresa\n" +
                "LEFT JOIN t_tiposdocumentos doc on r.f_tipodoc = doc.f_tipodoc and doc.f_idempresa = ${empresa}\n" +
                "WHERE r.f_idempresa = ${empresa} and r.f_idrecord = ${id}";
        //println sql
        resultado = sqlService.getQuery(sql)
        return resultado
    }

    def generarReporteCuadreCaja(Long fechaInicio, Long fechaFinal, Long idempresa) {
        List resultado
        String sql = "SELECT \n" +
                "  c.f_idrecord,\n" +
                "  c.f_idempresa,\n" +
                "  to_char(c.f_fecha, 'dd/MM/yyyy') as f_fecha,\n" +
                "  c.f_fecha_generado,\n" +
                "  COALESCE(u.f_nombre, '') || COALESCE(u.f_apellido, '') AS f_cajero,\n" +
                "  c.f_factcontado,\n" +
                "  c.f_factcredito,\n" +
                "  c.f_pedidos,\n" +
                "  c.f_montocredito,\n" +
                "  c.f_montocontado,\n" +
                "  c.f_monto_pedidos,\n" +
                "  c.f_montotarjeta,\n" +
                "  c.f_montoitbis,\n" +
                "  c.f_montocheque,\n" +
                "  c.f_montoenvio,\n" +
                "  c.f_monto_caja,\n" +
                "  c.f_monto_recibo,\n" +
                "  c.f_monto_cancelado,\n" +
                "  c.f_posteado,\n" +
                "  c.f_hecho_por\n" +
                "FROM \n" +
                "  public.t_cuadre_cajero c inner join t_usuarios u on c.f_cajero = u.f_idrecord\n" +
                "WHERE\n" +
                "  c.f_fecha BETWEEN to_timestamp(${fechaInicio} / 1000)::date AND to_timestamp(${fechaFinal} / 1000)::date AND c.f_idempresa = ${idempresa} ;";
        //println sql
        resultado = sqlService.getQuery(sql)
        return resultado
    }

    def generarReporteCuadreGeneral(Long fechaInicio, Long fechaFinal, Long idempresa) {
        List resultado
        String sql = "SELECT \n" +
                "  c.f_idrecord,\n" +
                "  c.f_idempresa,\n" +
                "  to_char(c.f_fecha, 'dd/MM/yyyy') as f_fecha,\n" +
                "  c.f_fecha_generado,\n" +
                "  COALESCE(u.f_nombre, '') || COALESCE(u.f_apellido, '') AS f_cajero,\n" +
                "  c.f_factcontado,\n" +
                "  c.f_factcredito,\n" +
                "  c.f_pedidos,\n" +
                "  c.f_montocredito,\n" +
                "  c.f_montocontado,\n" +
                "  c.f_monto_pedidos,\n" +
                "  c.f_montotarjeta,\n" +
                "  c.f_montoitbis,\n" +
                "  c.f_montocheque,\n" +
                "  c.f_montoenvio,\n" +
                "  c.f_monto_caja,\n" +
                "  c.f_monto_recibo,\n" +
                "  c.f_monto_cancelado,\n" +
                "  c.f_hecho_por\n" +
                "FROM \n" +
                "  public.t_cuadre_diario c inner join t_usuarios u on c.f_hecho_por = u.f_idrecord\n" +
                "WHERE\n" +
                "  c.f_fecha BETWEEN to_timestamp(${fechaInicio} / 1000)::date AND to_timestamp(${fechaFinal} / 1000)::date AND c.f_idempresa = ${idempresa} ;";
        // println sql
        resultado = sqlService.getQuery(sql)
        return resultado
    }

    def getAllProcesosImpresion(Long idempresa) {
        List resultado
        String sql = "select\n" +
                "\tDISTINCT \n" +
                "\tp.f_idrecord as idproceso,\n" +
                "    p.f_descripcion as descripcion_proceso,\n" +
                "    COALESCE(pr.f_idconfiguracion_printer, 0) as idconfiguracion\n" +
                "    \n" +
                "from\n" +
                "\tcfg.t_procesos_de_impresion p \n" +
                "    left join cfg.t_preferencias_procesos_impresion pr\n" +
                "    on p.f_idrecord = pr.f_idproceso_impresion and pr.f_idempresa = ${idempresa}\n" +
                "\n" +
                "order by\n" +
                "\tp.f_descripcion"
        resultado = sqlService.getQuery(sql)
        return resultado
    }

    def getOpcionesConfiguracionImpresion() {
        List resultado
        String sql = "select f_idrecord as value, f_descripcion as label from cfg.t_configuraciones_printers order by f_descripcion"
        resultado = sqlService.getQuery(sql)
        return resultado
    }

    def getOpcionesConfiguracionImpresion(Integer fakeParam) {
        List resultado
        String sql = "select f_idrecord as id, f_descripcion as \"fDescripcion\" from cfg.t_configuraciones_printers order by f_descripcion"
        resultado = sqlService.getQuery(sql)
        return resultado
    }


    def getAllConfiguracionProcesosImpresion(Long idempresa) {
        List resultado
        String sql = "select\n" +
                "\tDISTINCT \n" +
                "\tp.f_idrecord as idproceso,\n" +
                "    p.f_descripcion as descripcion_proceso,\n" +
                "    COALESCE(pr.f_idconfiguracion_printer, 0) as idconfiguracion,\n" +
                "    c.*\n" +
                "    \n" +
                "from\n" +
                "\tcfg.t_procesos_de_impresion p \n" +
                "    left join cfg.t_preferencias_procesos_impresion pr\n" +
                "    on p.f_idrecord = pr.f_idproceso_impresion and pr.f_idempresa = ${idempresa}\n" +
                "\tleft join cfg.t_configuraciones_printers c on c.f_idrecord = pr.f_idconfiguracion_printer\n" +
                "\n" +
                "order by\n" +
                "\tp.f_descripcion"
        resultado = sqlService.getQuery(sql)
        return resultado
    }

    Map getPrintconfig(Long idcondfig) {

        Map rs

        println("Se Ejecuto Esta Accion: ");
        println("select * from cfg.t_configuraciones_printers where f_idrecord = ${idcondfig}");

        if ("${idcondfig}" as Integer == 0) {

            Map<String, Object> rs2 = new HashMap<String, Object>();

            rs2.f_marca = "0";
            rs2.f_columnas = "0";

            println("Se Retorno el mapa  vacio");


            return rs;
        }

        rs = sqlService.GetQueryMap("select * from cfg.t_configuraciones_printers where f_idrecord = ${idcondfig} ");


        rs
    }

    List getTutoriales() {
        List rs
        rs = sqlService.getQuery("select * from cfg.t_videos_ayuda")
        rs
    }

    def serviceMethod() {

    }

}
