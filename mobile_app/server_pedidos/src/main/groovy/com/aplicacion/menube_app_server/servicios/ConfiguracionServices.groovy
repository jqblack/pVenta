package com.aplicacion.menube_app_server.servicios

import com.aplicacion.menube_app_server.funciones.Funciones
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ConfiguracionServices {
    @Autowired
    SqlService sqlService;
    @Transactional
    def ListarSitiosFavoritos(Long idusurio) {
        String sql = "Select * from movil.t_lugares_favoritos where f_idusuario_movil = ? ";
        Object[] parametros = [idusurio] as Object
        return sqlService.GetQuery(sql, parametros);
    }


    @Transactional
    def InsertarDetalleTemporal(Long idproducto, String referencia, BigDecimal cantidad, BigDecimal precio, BigDecimal tax, String token, BigDecimal importe, Long idempresa, Boolean regresa_inventario, BigDecimal descuento, Long idusuario, BigDecimal porciento_descuento, BigDecimal porciento_tax,String f_comentario) {
        String sql = "INSERT INTO \n" +
                "  movil.t_factura_detalle_temporal\n" +
                "(\n" +
                "  f_idproducto,\n" +
                "  f_referencia,\n" +
                "  f_cantidad,\n" +
                "  f_precio,\n" +
                "  f_tax,\n" +
                "  f_key,\n" +
                "  f_importe,\n" +
                "  f_idempresa,\n" +
                "  f_regresa_inventario,\n" +
                "  f_descuento,\n" +
                "  f_idusuario,\n" +
                "  f_fecha,\n" +
                "  f_porciento_descuento,\n" +
                "  f_porciento_tax,\n" +
                "  f_comentario\n" +
                ")\n" +
                "VALUES (\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?\n" +
                ") returning *;";

        Object[] parametros = [
                idproducto,
                referencia,
                cantidad,
                precio,
                tax,
                token,
                importe,
                idempresa,
                regresa_inventario,
                descuento,
                idusuario,
                sqlService.GetNow(),
                porciento_descuento,
                porciento_tax,
                f_comentario
        ] as Object;
        return sqlService.GetQueryMap(sql, parametros)
    }

    @Transactional
    def InsertarDetalleTemporal2(Long idproducto, String referencia, BigDecimal cantidad, BigDecimal precio, BigDecimal tax, String token, BigDecimal importe, Long idempresa, Boolean regresa_inventario, BigDecimal descuento, Long idusuario, BigDecimal porciento_descuento, BigDecimal porciento_tax,String f_comentario) {
        String sql = "INSERT INTO \n" +
                "  movil.t_carritomovil\n" +
                "(\n" +
                "  f_idproducto,\n" +
                "  f_referencia,\n" +
                "  f_cantidad,\n" +
                "  f_precio,\n" +
                "  f_tax,\n" +
                "  f_key,\n" +
                "  f_importe,\n" +
                "  f_idempresa,\n" +
                "  f_regresa_inventario,\n" +
                "  f_descuento,\n" +
                "  f_imei,\n" +
                "  f_fecha,\n" +
                "  f_porciento_descuento,\n" +
                "  f_porciento_tax,\n" +
                "  f_comentario\n" +
                ")\n" +
                "VALUES (\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?\n" +
                ") returning *;";

        Object[] parametros = [
                idproducto,
                referencia,
                cantidad,
                precio,
                tax,
                token,
                importe,
                idempresa,
                regresa_inventario,
                descuento,
                idusuario,
                sqlService.GetNow(),
                porciento_descuento,
                porciento_tax,
                f_comentario
        ] as Object;
        return sqlService.GetQueryMap(sql, parametros)
    }

    @Transactional
    def IsertarLogsInventario(String antes, String despues, Long tipo, Long empresa, Long hecho_por) {
        String sql = "INSERT INTO \n" +
                "  movil.t_logs_inventario\n" +
                "(\n" +
                "  f_antes,\n" +
                "  f_despues,\n" +
                "  f_tipo,\n" +
                "  f_idempresa,\n" +
                "  f_hecho_por\n" +
                ")\n" +
                "VALUES (\n" +
                "  '$antes'::jsonb,\n" +
                "  '$despues'::jsonb,\n" +
                "  $tipo,\n" +
                "  $empresa,\n" +
                "  $hecho_por\n" +
                ");"
        sqlService.EjecutarQuery(sql);
    }

    def crearOrdenDelivery(String IDvalue, Long idempresa, Long idusuario, Long idcliente, BigDecimal sub_total, BigDecimal itbis, BigDecimal total, String token, String nota,String direccion_envio,Boolean comprobante_fiscal) {
        Long ID;
        println idempresa;
        Object[] parametros = [idempresa] as Object;
        Map empresa = sqlService.GetQueryMap("select * from cfg.t_empresas as d where  d.f_idrecord = ? ", parametros);
        parametros = [3, empresa.f_idrecord.toString().toLong()] as Object
        Map ttipodocuementos = sqlService.GetQueryMap("SELECT * from  t_tiposdocumentos as d where d.f_idordenador = ? and d.f_idempresa = ? ", parametros);
        Funciones funciones = new Funciones();
        if (!IDvalue.equals("")) {
            ID = IDvalue.toLong();
            parametros = [empresa.f_idrecord.toString().toLong(), ID] as Object
            Map torden = sqlService.GetQueryMap("SELECT * from t_facturas as d where d.f_idempresa = ? and d.f_idrecord = ? ", parametros);
            if (torden.isEmpty()) {

            } else {

                Integer numero = sqlService.GetSecuencia(ttipodocuementos.f_tipodoc.toString(), empresa.f_idrecord.toString().toLong());
                Long idncf = empresa.f_ncf_defecto_delivery?f_ncf_defecto_delivery.toString().toLong():0.toLong()
                String numero_comprobante = "";
                String sql = "INSERT INTO \n" +
                        "  public.t_facturas\n" +
                        "(\n" +
                        "  f_idempresa,\n" +
                        "  f_cancelada,\n" +
                        "  f_fecha_regstro_orden,\n" +
                        "  f_hecho_por,\n" +
                        "  f_idcliente,\n" +
                        "  f_itebis,\n" +
                        "  f_numero_orden,\n" +
                        "  f_subtotal,\n" +
                        "  f_tipo_documento_factura,\n" +
                        "  f_total,\n" +
                        "  f_total_extra,\n" +
                        "  f_observacion,\n" +
                        "  f_tipo_ncf,\n" +
                        "  f_porciento_ley,\n" +
                        "  f_modulo,\n" +
                        "  f_factura_abierta,\n" +
                        "  f_anulada,\n" +
                        "  f_pagada,\n" +
                        "  f_numero_ncf,\n" +
                        "  f_asignada,\n" +
                        "  f_direccion_envio,\n" +
                        "  f_wholenum_cliente,\n "+
                        "  f_con_credito\n" +
                        ")\n" +
                        "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) returning *;";
                parametros = [
                        empresa.f_idrecord.toString().toLong(),
                        false,
                        sqlService.GetNow(),
                        idusuario,
                        idcliente,
                        itbis,
                        numero,
                        sub_total,
                        ttipodocuementos.f_tipodoc.toString(),
                        total,
                        0.00,
                        nota,
                        idncf,
                        0.00,
                        3,
                        true,
                        false,
                        false,
                        numero_comprobante,
                        false,
                        direccion_envio,
                        'CM'+idcliente,
                        comprobante_fiscal
                ] as Object;
                Map tfactura = sqlService.GetQueryMap(sql, parametros);

                sql = "Select * from movil.t_factura_detalle_temporal where f_key = ? and f_idempresa = ? ";
                parametros = [token, empresa.f_idrecord.toString().toLong()] as Object;
                List tdetallesTemporal = sqlService.GetQuery(sql, parametros);
                tdetallesTemporal.each { e ->
                    Object[] parametros_detalles = [] as Object;
                    parametros_detalles = [empresa.f_idrecord.toString().toLong(), e.f_idproducto.toString().toLong()] as Object
                    Map tproducto = sqlService.GetQueryMap("SELECT * from t_productos as p where  p.f_idempresa =  ? and p.f_idrecord = ?", parametros_detalles);
                    if (!tproducto.isEmpty()) {
                        Long idcomanda = sqlService.GetIdComanda();
                        String sql_detalle = "INSERT INTO \n" +
                                "  public.t_detalle_factura\n" +
                                "(\n" +
                                "  f_idfactura,\n" +
                                "  f_idproducto,\n" +
                                "  f_referencia,\n" +
                                "  f_cantidad,\n" +
                                "  f_itebis,\n" +
                                "  f_precio,\n" +
                                "  f_idempresa,\n" +
                                "  f_comanda,\n" +
                                "  f_movil,\n" +
                                "  f_idcomanda\n" +
                                ")\n" +
                                "VALUES (?,?,?,?,?,?,?,?,?,?) returning *;";
                        parametros_detalles = [
                                tfactura.f_idrecord.toString().toLong(),
                                e.f_idproducto.toString().toLong(),
                                e.f_referencia.toString(),
                                e.f_cantidad.toString().toBigDecimal(),
                                e.f_tax.toString().toBigDecimal(),
                                e.f_precio.toString().toBigDecimal(),
                                empresa.f_idrecord.toString().toLong(),
                                !tproducto.f_comanda.toString().toBoolean(),
                                false,
                                idcomanda

                        ] as Object

                        Map tdetalle = sqlService.GetQueryMap(sql_detalle,parametros_detalles);
                        parametros_detalles = [e.f_idrecord.toString().toLong()] as Object
                        List tdetallePropiedades = sqlService.GetQuery("SELECT * from movil.t_detalle_propiedades_temporal as d where d.f_iddetalle = ?",parametros_detalles);
                        tdetallePropiedades.each {propiedades ->
                            sql_detalle = " \n" +
                                    "INSERT INTO \n" +
                                    "  public.t_detalles_propiedades_factura\n" +
                                    "(\n" +
                                    "  f_idempresa,\n" +
                                    "  f_iddetalle,\n" +
                                    "  f_idpropiedad\n" +
                                    ")\n" +
                                    "VALUES (?,?,?);";
                            parametros_detalles = [
                                    empresa.f_idrecord.toString().toLong(),
                                    tdetalle.f_idrecord.toString().toLong(),
                                    propiedades.f_idpropiedad.toString().toLong()] as Object;
                            sqlService.EjecutarQuery(sql_detalle,parametros_detalles);
                        }
                    }
                }
                parametros = [token];
                sqlService.EjecutarQuery("DELETE  from movil.t_factura_detalle_temporal where f_key = ?",parametros)
                sqlService.EjecutarQuery("DELETE  from movil.t_detalle_propiedades_temporal where f_key = ?",parametros);
                return  tfactura.f_tipo_documento_factura+tfactura.f_numero_orden.toString().padLeft(6,'0');
            }

        } else {

            Integer numero = sqlService.GetSecuencia(ttipodocuementos.f_tipodoc.toString(), empresa.f_idrecord.toString().toLong());
            String numero_comprobante = "";
            Long idncf = empresa.f_ncf_defecto_delivery?empresa.f_ncf_defecto_delivery.toString().toLong():0.toLong()
            String sql = "INSERT INTO \n" +
                    "  public.t_facturas\n" +
                    "(\n" +
                    "  f_idempresa,\n" +
                    "  f_cancelada,\n" +
                    "  f_fecha_regstro_orden,\n" +
                    "  f_hecho_por,\n" +
                    "  f_idcliente,\n" +
                    "  f_itebis,\n" +
                    "  f_numero_orden,\n" +
                    "  f_subtotal,\n" +
                    "  f_tipo_documento_factura,\n" +
                    "  f_total,\n" +
                    "  f_total_extra,\n" +
                    "  f_observacion,\n" +
                    "  f_tipo_ncf,\n" +
                    "  f_porciento_ley,\n" +
                    "  f_modulo,\n" +
                    "  f_factura_abierta,\n" +
                    "  f_anulada,\n" +
                    "  f_pagada,\n" +
                    "  f_numero_ncf,\n" +
                    "  f_asignada,\n" +
                    "  f_direccion_envio,\n" +
                    "  f_wholenum_cliente,\n"+
                    "  f_con_credito\n" +
                    ")\n" +
                    "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) returning *;";
            parametros = [
                    empresa.f_idrecord.toString().toLong(),
                    false,
                    sqlService.GetNow(),
                    idusuario,
                    idcliente,
                    itbis,
                    numero,
                    sub_total,
                    ttipodocuementos.f_tipodoc.toString(),
                    total,
                    0.00,
                    nota,
                    idncf,
                    0.00,
                    3,
                    true,
                    false,
                    false,
                    numero_comprobante,
                    false,
                    direccion_envio,
                    'CM'+idcliente,
                    comprobante_fiscal
            ] as Object;
            Map tfactura = sqlService.GetQueryMap(sql, parametros);

            sql = "Select * from movil.t_factura_detalle_temporal where f_key = ? and f_idempresa = ? ";
            parametros = [token, empresa.f_idrecord.toString().toLong()] as Object;
            List tdetallesTemporal = sqlService.GetQuery(sql, parametros);
            tdetallesTemporal.each { e ->
                Object[] parametros_detalles = [] as Object;
                parametros_detalles = [empresa.f_idrecord.toString().toLong(), e.f_idproducto.toString().toLong()] as Object
                Map tproducto = sqlService.GetQueryMap("SELECT * from t_productos as p where  p.f_idempresa =  ? and p.f_idrecord = ?", parametros_detalles);
                if (!tproducto.isEmpty()) {
                    Long idcomanda = sqlService.GetIdComanda();
                    String sql_detalle = "INSERT INTO \n" +
                            "  public.t_detalle_factura\n" +
                            "(\n" +
                            "  f_idfactura,\n" +
                            "  f_idproducto,\n" +
                            "  f_referencia,\n" +
                            "  f_cantidad,\n" +
                            "  f_itebis,\n" +
                            "  f_precio,\n" +
                            "  f_idempresa,\n" +
                            "  f_comanda,\n" +
                            "  f_movil,\n" +
                            "  f_idcomanda\n" +
                            ")\n" +
                            "VALUES (?,?,?,?,?,?,?,?,?,?) returning *;";
                    parametros_detalles = [
                            tfactura.f_idrecord.toString().toLong(),
                            e.f_idproducto.toString().toLong(),
                            e.f_referencia.toString(),
                            e.f_cantidad.toString().toBigDecimal(),
                            e.f_tax.toString().toBigDecimal(),
                            e.f_precio.toString().toBigDecimal(),
                            empresa.f_idrecord.toString().toLong(),
                            !tproducto.f_comanda.toString().toBoolean(),
                            false,
                            idcomanda

                    ] as Object

                    Map tdetalle = sqlService.GetQueryMap(sql_detalle,parametros_detalles);
                    parametros_detalles = [e.f_idrecord.toString().toLong()] as Object
                    List tdetallePropiedades = sqlService.GetQuery("SELECT * from movil.t_detalle_propiedades_temporal as d where d.f_iddetalle = ?",parametros_detalles);
                    tdetallePropiedades.each {propiedades ->
                        sql_detalle = " \n" +
                                "INSERT INTO \n" +
                                "  public.t_detalles_propiedades_factura\n" +
                                "(\n" +
                                "  f_idempresa,\n" +
                                "  f_iddetalle,\n" +
                                "  f_idpropiedad\n" +
                                ")\n" +
                                "VALUES (?,?,?);";
                        parametros_detalles = [
                                empresa.f_idrecord.toString().toLong(),
                                tdetalle.f_idrecord.toString().toLong(),
                                propiedades.f_idpropiedad.toString().toLong()] as Object;
                        sqlService.EjecutarQuery(sql_detalle,parametros_detalles);
                    }
                }


            }
            parametros = [token];
            sqlService.EjecutarQuery("DELETE  from movil.t_factura_detalle_temporal where f_key = ?",parametros)
            sqlService.EjecutarQuery("DELETE  from movil.t_detalle_propiedades_temporal where f_key = ?",parametros);
            return  tfactura.f_tipo_documento_factura+tfactura.f_numero_orden.toString().padLeft(6,'0');
        }
    }

    def crearOrdenDelivery2(String IDvalue, Long idempresa, Long idusuario, Long idcliente, BigDecimal sub_total, BigDecimal itbis,
                            BigDecimal total, String token, String nota,String direccion_envio,Boolean comprobante_fiscal,String imei) {
        Long ID;
        println idempresa;
        Object[] parametros = [idempresa] as Object;
        Map empresa = sqlService.GetQueryMap("select * from cfg.t_empresas as d where  d.f_idrecord = ? ", parametros);
        parametros = [3, empresa.f_idrecord.toString().toLong()] as Object
        Map ttipodocuementos = sqlService.GetQueryMap("SELECT * from  t_tiposdocumentos as d where d.f_idordenador = ? and d.f_idempresa = ? ", parametros);
        Funciones funciones = new Funciones();
        if (!IDvalue.equals("")) {
            ID = IDvalue.toLong();
            parametros = [empresa.f_idrecord.toString().toLong(), ID] as Object
            Map torden = sqlService.GetQueryMap("SELECT * from t_facturas as d where d.f_idempresa = ? and d.f_idrecord = ? ", parametros);
            if (torden.isEmpty()) {

            } else {

                Integer numero = sqlService.GetSecuencia(ttipodocuementos.f_tipodoc.toString(), empresa.f_idrecord.toString().toLong());
                Long idncf = empresa.f_ncf_defecto_delivery?f_ncf_defecto_delivery.toString().toLong():0.toLong()
                String numero_comprobante = "";
                String sql = "INSERT INTO \n" +
                        "  public.t_facturas\n" +
                        "(\n" +
                        "  f_idempresa,\n" +
                        "  f_cancelada,\n" +
                        "  f_fecha_regstro_orden,\n" +
                        "  f_hecho_por,\n" +
                        "  f_idcliente,\n" +
                        "  f_itebis,\n" +
                        "  f_numero_orden,\n" +
                        "  f_subtotal,\n" +
                        "  f_tipo_documento_factura,\n" +
                        "  f_total,\n" +
                        "  f_total_extra,\n" +
                        "  f_observacion,\n" +
                        "  f_tipo_ncf,\n" +
                        "  f_porciento_ley,\n" +
                        "  f_modulo,\n" +
                        "  f_factura_abierta,\n" +
                        "  f_anulada,\n" +
                        "  f_pagada,\n" +
                        "  f_numero_ncf,\n" +
                        "  f_asignada,\n" +
                        "  f_direccion_envio,\n" +
                        "  f_wholenum_cliente,\n "+
                        "  f_con_credito\n" +
                        ")\n" +
                        "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) returning *;";
                parametros = [
                        empresa.f_idrecord.toString().toLong(),
                        false,
                        sqlService.GetNow(),
                        idusuario,
                        idcliente,
                        itbis,
                        numero,
                        sub_total,
                        ttipodocuementos.f_tipodoc.toString(),
                        total,
                        0.00,
                        nota,
                        idncf,
                        0.00,
                        3,
                        true,
                        false,
                        false,
                        numero_comprobante,
                        false,
                        direccion_envio,
                        'CM'+idcliente,
                        comprobante_fiscal
                ] as Object;
                Map tfactura = sqlService.GetQueryMap(sql, parametros);

                sql = "Select * from movil.t_carritomovil where f_imei = ? ";
                parametros = [imei] as Object;
                List tdetallesTemporal = sqlService.GetQuery(sql, parametros);
                tdetallesTemporal.each { e ->
                    Object[] parametros_detalles = [] as Object;
                    parametros_detalles = [empresa.f_idrecord.toString().toLong(), e.f_idproducto.toString().toLong()] as Object
                    Map tproducto = sqlService.GetQueryMap("SELECT * from t_productos as p where  p.f_idempresa =  ? and p.f_idrecord = ?", parametros_detalles);
                    if (!tproducto.isEmpty()) {
                        Long idcomanda = sqlService.GetIdComanda();
                        String sql_detalle = "INSERT INTO \n" +
                                "  public.t_detalle_factura\n" +
                                "(\n" +
                                "  f_idfactura,\n" +
                                "  f_idproducto,\n" +
                                "  f_referencia,\n" +
                                "  f_cantidad,\n" +
                                "  f_itebis,\n" +
                                "  f_precio,\n" +
                                "  f_idempresa,\n" +
                                "  f_comanda,\n" +
                                "  f_movil,\n" +
                                "  f_idcomanda\n" +
                                ")\n" +
                                "VALUES (?,?,?,?,?,?,?,?,?,?) returning *;";
                        parametros_detalles = [
                                tfactura.f_idrecord.toString().toLong(),
                                e.f_idproducto.toString().toLong(),
                                e.f_referencia.toString(),
                                e.f_cantidad.toString().toBigDecimal(),
                                e.f_tax.toString().toBigDecimal(),
                                e.f_precio.toString().toBigDecimal(),
                                empresa.f_idrecord.toString().toLong(),
                                !tproducto.f_comanda.toString().toBoolean(),
                                false,
                                idcomanda

                        ] as Object

                        Map tdetalle = sqlService.GetQueryMap(sql_detalle,parametros_detalles);
//                        parametros_detalles = [e.f_idrecord.toString().toLong()] as Object
//                        List tdetallePropiedades = sqlService.GetQuery("SELECT * from movil.t_detalle_propiedades_temporal as d where d.f_iddetalle = ?",parametros_detalles);
//                        tdetallePropiedades.each {propiedades ->
//                            sql_detalle = " \n" +
//                                    "INSERT INTO \n" +
//                                    "  public.t_detalles_propiedades_factura\n" +
//                                    "(\n" +
//                                    "  f_idempresa,\n" +
//                                    "  f_iddetalle,\n" +
//                                    "  f_idpropiedad\n" +
//                                    ")\n" +
//                                    "VALUES (?,?,?);";
//                            parametros_detalles = [
//                                    empresa.f_idrecord.toString().toLong(),
//                                    tdetalle.f_idrecord.toString().toLong(),
//                                    propiedades.f_idpropiedad.toString().toLong()] as Object;
//                            sqlService.EjecutarQuery(sql_detalle,parametros_detalles);
//                        }
                    }
                }
                parametros = [imei];
                sqlService.EjecutarQuery("DELETE  from movil.t_carritomovil where f_imei = ?",parametros)
              //  sqlService.EjecutarQuery("DELETE  from movil.t_detalle_propiedades_temporal where f_key = ?",parametros);
                return  tfactura.f_tipo_documento_factura+tfactura.f_numero_orden.toString().padLeft(6,'0');
            }

        } else {

            Integer numero = sqlService.GetSecuencia(ttipodocuementos.f_tipodoc.toString(), empresa.f_idrecord.toString().toLong());
            String numero_comprobante = "";
            Long idncf = empresa.f_ncf_defecto_delivery?empresa.f_ncf_defecto_delivery.toString().toLong():0.toLong()
            String sql = "INSERT INTO \n" +
                    "  public.t_facturas\n" +
                    "(\n" +
                    "  f_idempresa,\n" +
                    "  f_cancelada,\n" +
                    "  f_fecha_regstro_orden,\n" +
                    "  f_hecho_por,\n" +
                    "  f_idcliente,\n" +
                    "  f_itebis,\n" +
                    "  f_numero_orden,\n" +
                    "  f_subtotal,\n" +
                    "  f_tipo_documento_factura,\n" +
                    "  f_total,\n" +
                    "  f_total_extra,\n" +
                    "  f_observacion,\n" +
                    "  f_tipo_ncf,\n" +
                    "  f_porciento_ley,\n" +
                    "  f_modulo,\n" +
                    "  f_factura_abierta,\n" +
                    "  f_anulada,\n" +
                    "  f_pagada,\n" +
                    "  f_numero_ncf,\n" +
                    "  f_asignada,\n" +
                    "  f_direccion_envio,\n" +
                    "  f_wholenum_cliente,\n"+
                    "  f_con_credito\n" +
                    ")\n" +
                    "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) returning *;";
            parametros = [
                    empresa.f_idrecord.toString().toLong(),
                    false,
                    sqlService.GetNow(),
                    idusuario,
                    idcliente,
                    itbis,
                    numero,
                    sub_total,
                    ttipodocuementos.f_tipodoc.toString(),
                    total,
                    0.00,
                    nota,
                    idncf,
                    0.00,
                    3,
                    true,
                    false,
                    false,
                    numero_comprobante,
                    false,
                    direccion_envio,
                    'CM'+idcliente,
                    comprobante_fiscal
            ] as Object;
            Map tfactura = sqlService.GetQueryMap(sql, parametros);

            sql = "Select * from movil.t_carritomovil where f_imei = ? ";
            parametros = [imei] as Object;
            List tdetallesTemporal = sqlService.GetQuery(sql, parametros);
            tdetallesTemporal.each { e ->
                Object[] parametros_detalles = [] as Object;
                parametros_detalles = [empresa.f_idrecord.toString().toLong(), e.f_idproducto.toString().toLong()] as Object
                Map tproducto = sqlService.GetQueryMap("SELECT * from t_productos as p where  p.f_idempresa =  ? and p.f_idrecord = ?", parametros_detalles);
                if (!tproducto.isEmpty()) {
                    Long idcomanda = sqlService.GetIdComanda();
                    String sql_detalle = "INSERT INTO \n" +
                            "  public.t_detalle_factura\n" +
                            "(\n" +
                            "  f_idfactura,\n" +
                            "  f_idproducto,\n" +
                            "  f_referencia,\n" +
                            "  f_cantidad,\n" +
                            "  f_itebis,\n" +
                            "  f_precio,\n" +
                            "  f_idempresa,\n" +
                            "  f_comanda,\n" +
                            "  f_movil,\n" +
                            "  f_idcomanda\n" +
                            ")\n" +
                            "VALUES (?,?,?,?,?,?,?,?,?,?) returning *;";
                    parametros_detalles = [
                            tfactura.f_idrecord.toString().toLong(),
                            e.f_idproducto.toString().toLong(),
                            e.f_referencia.toString(),
                            e.f_cantidad.toString().toBigDecimal(),
                            e.f_tax.toString().toBigDecimal(),
                            e.f_precio.toString().toBigDecimal(),
                            empresa.f_idrecord.toString().toLong(),
                            !tproducto.f_comanda.toString().toBoolean(),
                            false,
                            idcomanda

                    ] as Object

                    Map tdetalle = sqlService.GetQueryMap(sql_detalle,parametros_detalles);
//                    parametros_detalles = [e.f_idrecord.toString().toLong()] as Object
//                    List tdetallePropiedades = sqlService.GetQuery("SELECT * from movil.t_detalle_propiedades_temporal as d where d.f_iddetalle = ?",parametros_detalles);
//                    tdetallePropiedades.each {propiedades ->
//                        sql_detalle = " \n" +
//                                "INSERT INTO \n" +
//                                "  public.t_detalles_propiedades_factura\n" +
//                                "(\n" +
//                                "  f_idempresa,\n" +
//                                "  f_iddetalle,\n" +
//                                "  f_idpropiedad\n" +
//                                ")\n" +
//                                "VALUES (?,?,?);";
//                        parametros_detalles = [
//                                empresa.f_idrecord.toString().toLong(),
//                                tdetalle.f_idrecord.toString().toLong(),
//                                propiedades.f_idpropiedad.toString().toLong()] as Object;
//                        sqlService.EjecutarQuery(sql_detalle,parametros_detalles);
//                    }
                }

            }
            parametros = [imei];
            sqlService.EjecutarQuery("DELETE  from movil.t_carritomovil where f_imei = ?",parametros)
            //sqlService.EjecutarQuery("DELETE  from movil.t_detalle_propiedades_temporal where f_key = ?",parametros);
            return  tfactura.f_tipo_documento_factura+tfactura.f_numero_orden.toString().padLeft(6,'0');
        }
    }
    @Transactional
    def InsertarDireccion(String id, String direccion, Long idusuario,Boolean principal,Long iddir, String direccion2,Boolean usa,String sector_city,String zipcode, Long state_prov,String nom_dir) {
        String sql = "";
        Object [] parametros = [] as Object;
        if (!id.equals("0"))
        {
            sql = "UPDATE  movil.t_direcciones_usuarios set f_direccion = ?, f_principal = ?, f_direccion2 = ?, f_usa = ?, f_sector_city = ?," +
                    "  f_zipcode = ?, f_state_provincia = ?, f_nombre_direccion = ?  WHERE f_idusuario = ? and f_idrecord = ?";
            parametros = [direccion,principal,direccion2,usa,sector_city,zipcode,state_prov,nom_dir,idusuario,iddir] as Object;
        }else{

            sql = "insert  into movil.t_direcciones_usuarios(f_idusuario,f_principal,f_direccion,f_direccion2,f_usa,f_sector_city,f_zipcode,f_state_provincia,f_nombre_direccion)" +
                    " values(?,?,?,?,?,?,?,?,?) ";
            parametros = [idusuario,principal,direccion,direccion2,usa,sector_city,zipcode,state_prov,nom_dir] as Object;
        }
        sqlService.EjecutarQuery(sql,parametros);

    }

    @Transactional
    def IsertarUsuario(String id,String nombre,String telefono,String direccion, String email,String password,String latitud,String longitud) {
        String sql = "";
        Object [] parametros = [] as Object;

        println(id);
        if (!id.equals("0"))
        {
            sql = "UPDATE \n" +
                    "  movil.t_usuarios_movil \n" +
                    "SET \n" +
                    "  f_nombre = ?,\n" +
                    "  f_telefono = ?,\n" +
                    "  f_direccion = ?,\n" +
                    "  f_email = ?,\n" +
                    "  f_latitud = ?,\n" +
                    "  f_longitud = ?\n" +
                    "WHERE \n" +
                    "  f_idrecord = ?\n" +
                    ";";
            parametros = [nombre,telefono,direccion,email,latitud,longitud,id.toString().toLong()] as Object;
        }else{

            sql = "INSERT INTO \n" +
                    "  movil.t_usuarios_movil\n" +
                    "(\n" +
                    "  f_nombre,\n" +
                    "  f_telefono,\n" +
                    "  f_direccion,\n" +
                    "  f_email,\n" +
                    "  f_password,\n" +
                    "  f_latitud,\n" +
                    "  f_longitud,\n" +
                    "  f_activo\n" +
                    ")\n" +
                    "VALUES (?,?,?,?,md5(?),?,?,?);";
            parametros = [nombre,telefono,direccion,email,password,latitud,longitud,true] as Object;
        }
        sqlService.EjecutarQuery(sql,parametros);

    }
    @Transactional
    def CancelarOrden(String id,String empresa) {
        String sql = "";
        Object [] parametros = [id.toLong(),empresa.toLong()] as Object;
        Map tfacturas = sqlService.GetQueryMap("SELECT * from  t_facturas as d where d.f_idrecord = ? and d.f_idempresa = ?",parametros);

        if (!tfacturas.isEmpty()) {
            parametros = [true,id.toLong(),empresa.toLong()] as Object;
            sqlService.EjecutarQuery("UPDATE t_facturas set f_anulada = ? where f_idrecord  = ? and f_idempresa = ?",parametros);
            parametros = [id.toString().toLong(),id.toString().toInteger()] as Object;
            sqlService.EjecutarQuery("insert into t_pedidos_estatus(f_idfactura,f_fecha,f_idestatus,f_intervalo) values (?,now(),6,get_estatus_intervalo(?))",parametros)

            parametros = [id.toLong(),empresa.toLong()] as Object;
            List tdetalleFacturaList = sqlService.GetQuery("SELECT * from t_detalle_factura where f_idfactura = ? and f_idempresa = ?",parametros);
            tdetalleFacturaList.each { e ->
                parametros = [e.f_idrecord.toString().toLong()] as Object
                sqlService.EjecutarQuery("delete from t_factura_detalle_componentes where  f_iddetalle = ? ",parametros);
                sqlService.EjecutarQuery("delete from t_detalles_propiedades_factura where  f_iddetalle = ? ",parametros);
            }
            parametros = [id.toLong(),empresa.toLong()] as Object;
            sqlService.EjecutarQuery("delete from t_detalle_factura where f_idfactura = ? and f_idempresa = ?",parametros);
        } else {
            return;
        }

    }
}
