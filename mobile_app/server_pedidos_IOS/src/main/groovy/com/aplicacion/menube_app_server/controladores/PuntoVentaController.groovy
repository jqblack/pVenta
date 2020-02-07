package com.aplicacion.menube_app_server.controladores

import com.aplicacion.menube_app_server.funciones.Funciones
import com.aplicacion.menube_app_server.servicios.ConfiguracionServices
import com.aplicacion.menube_app_server.servicios.SeguridadService
import com.aplicacion.menube_app_server.servicios.SqlService
import grails.converters.JSON
import groovy.json.JsonOutput
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RequestMapping(value = "/puntoventa")
@RestController
class PuntoVentaController {
    @Autowired
    SeguridadService seguridadService;
    @Autowired
    SqlService sqlService;
    @Autowired
    ConfiguracionServices services;

    Funciones funciones = new Funciones();

    //NO BORRAR
    @Transactional
    @RequestMapping(value = "/salvar_detalle_temporal", method = RequestMethod.POST)
    def salvar_detalle_temporal(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
//        println(dato1);
        Map map = JSON.parse(dato1);

        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {

            Map tlogin = new HashMap<>();
            tlogin = seguridadService.GetLoginByToken(map.get("f_key").toString())

            Map tusuario = new HashMap<>();
            Object[] parametros_usuario = [tlogin.get("f_usuario").toString()] as Object
            tusuario = sqlService.GetQueryMap("Select * from movil.t_usuarios_movil as b where b.f_email = ? ", parametros_usuario);

            String valor = "1";
            if (!tusuario.isEmpty()) {

                if (tupla.get("f_tipo").toString().equals("1")) {
                    Map<String, Object> tproducto = new HashMap<>();
                    String sql_producto = "select * from t_productos as p where p.f_idrecord = ? and p.f_idempresa = ? ";
                    Object[] parametros = [tupla.get("f_idproducto").toString().toLong(), tupla.get("f_idempresa").toString().toLong()] as Object;
                    tproducto = sqlService.GetQueryMap(sql_producto, parametros);
                    String nombre = "PRODUCTO";
                    if (!tproducto.isEmpty()) {
                        nombre = tproducto.get("f_descripcion").toString();
                    }
                    if (tproducto.get("f_controlinventario").toString().toBoolean()) {
                        if (tupla.get("f_cantidad").toString().toBigDecimal() > tproducto.get("f_existencia").toString().toBigDecimal()) {
                            valor = "0";
                        }
                    }
                    Map temporal = services.InsertarDetalleTemporal(
                            tproducto.get("f_idrecord").toString().toLong(),
                            tproducto.get("f_referencia").toString(),
                            tupla.get("f_cantidad").toString().toBigDecimal(),
                            tupla.get("f_precio").toString().toBigDecimal(),
                            tupla.get("f_tax").toString().toBigDecimal(),
                            map.get("f_key").toString(),
                            tupla.get("f_importe").toString().toBigDecimal(),
                            tupla.get("f_idempresa").toString().toLong(),
                            false,
                            tupla.get("f_descuento").toString().toBigDecimal(),
                            tusuario.get("f_idrecord").toString().toLong(),
                            tupla.get("f_porciento_descuento").toString().toBigDecimal(),
                            tupla.get("f_porciento_tax").toString().toBigDecimal(),
                            ""//comentario

                    );
                    String despues = (funciones.MapToJson(temporal))
                    services.IsertarLogsInventario(despues, despues, 1.toLong(), tupla.get("f_idempresa").toString().toLong(), tusuario.get("f_idrecord").toString().toLong());
                    String[] campos = [
                            "f_idserver",
                            "f_precio",
                            "f_tax",
                            "f_nombre",
                            "f_referencia",
                            "f_paso",
                            "f_descuento",
                            "f_importe"
                    ];
                    String[] valore = [
                            temporal.get("f_idrecord").toString(),
                            temporal.get("f_precio").toString(),
                            temporal.get("f_tax").toString(),
                            nombre,
                            tproducto.getAt("f_referencia").toString(),
                            valor,
                            temporal.get("f_descuento").toString(),
                            temporal.get("f_importe").toString()
                    ];
                    /** impresion**/
                    return funciones.convertir('1', funciones.crearJSON(campos, valore)).replace("'", '"').replace('"[', '[').replace(']"', ']');
                    /******************Actualizar el detalle temporral************************/
                } else if (tupla.get("f_tipo").toString().equals("2")) {
                    Object[] paramtros = [tupla.get("f_idserver").toString().toLong()] as Object;
                    Map ttemporal = sqlService.GetQueryMap("Select * from  movil.t_factura_detalle_temporal as b where b.f_idrecord = ?", paramtros);
                    if (!ttemporal.isEmpty()) {

                        /*******************Esto es para eliminar un detalle temporal*****************************/
                        if (tupla.get("f_regresa").toString().toBoolean()) {
                            String antes = funciones.MapToJson(ttemporal);
                            String sql_regresa = "UPDATE movil.t_factura_detalle_temporal set  f_regresa_inventario = ? where f_idrecord = ? and f_idempresa = ? returning *";
                            paramtros = [true, tupla.get("f_idserver").toString().toLong(), tupla.get("f_idempresa").toString().toLong()] as Object
                            String despues = funciones.MapToJson(sqlService.GetQueryMap(sql_regresa, paramtros));
                            services.IsertarLogsInventario(antes, despues, 3.toLong(), tupla.get("f_idempresa").toString().toLong(), tusuario.get("f_idrecord").toString().toLong());
                            String[] campos = [
                                    "f_paso",
                            ];
                            String[] valore = [
                                    '1'
                            ];
                            return funciones.convertir('1', funciones.crearJSON(campos, valore)).replace("'", '"').replace('"[', '[').replace(']"', ']');
                        } else {

                            Map<String, Object> tproducto = new HashMap<>();
                            String sql_producto = "select * from t_productos as p where p.f_idrecord = ? and p.f_idempresa = ? ";
                            Object[] parametros = [ttemporal.get("f_idproducto").toString().toLong(), tupla.get("f_idempresa").toString().toLong()] as Object;
                            tproducto = sqlService.GetQueryMap(sql_producto, parametros);
                            if (tupla.get("f_diferencia").toString().toBigDecimal() > tproducto.get("f_existencia").toString().toBigDecimal()) {
                                valor = "0";
                            }
                            if (tupla.get("f_diferencia").toString().toBigDecimal() < 0) {
                                valor = "1";
                            }
                            if (!tproducto.get("f_controlinventario").toString().toBoolean()) {
                                valor = "1";
                            }
                            if (valor.equals("1")) {

                                String antes = funciones.MapToJson(ttemporal);
                                String sql_update = "Update movil.t_factura_detalle_temporal set \n" +
                                        "f_cantidad = ?,\n" +
                                        "f_precio = ?,\n" +
                                        "f_tax = ?,\n" +
                                        "f_importe = ?,\n" +
                                        "f_descuento = ?,\n" +
                                        "f_comentario = ?,\n" +
                                        "f_porciento_descuento = ? where f_idrecord = ? and f_idempresa = ?  returning * \n";
                                parametros = [
                                        tupla.get("f_cantidad").toString().toBigDecimal(),
                                        tupla.get("f_precio").toString().toBigDecimal(),
                                        tupla.get("f_tax").toString().toBigDecimal(),
                                        tupla.get("f_importe").toString().toBigDecimal(),
                                        tupla.get("f_descuento").toString().toBigDecimal(),
                                        tupla.get("f_comentario").toString(),
                                        tupla.get("f_porciento_descuento").toString().toBigDecimal(),
                                        tupla.get("f_idserver").toString().toLong(),
                                        tupla.get("f_idempresa").toString().toLong()
                                ] as Object;
                                String despues = funciones.MapToJson(sqlService.GetQueryMap(sql_update, parametros));


                                /*ELIMINAMOS LAS PROPIEDADES */
                                String sql_eliminar_propiedades = "delete from movil.t_detalle_propiedades_temporal  where f_iddetalle = ?";
                                parametros = [tupla.get("f_idserver").toString().toLong()];
                                sqlService.EjecutarQuery(sql_eliminar_propiedades, parametros);

                                /*INSETAMOS LAS PROPIEDADES*/
                                List lista_propiedades = JSON.parse(tupla.get("f_propiedades").toString()).collect();

                                lista_propiedades.each { e ->
                                    String sql_insert_propiedades = " INSERT INTO movil.t_detalle_propiedades_temporal (f_iddetalle,f_idpropiedad,f_key,f_idusuario)values (?,?,?,?)";
                                    parametros = [
                                            tupla.get("f_idserver").toString().toLong(),
                                            e.getAt("f_idrecord").toString().toLong(),
                                            map.f_key.toString(),
                                            tusuario.f_idrecord.toString().toLong()
                                    ] as Object;
                                    sqlService.EjecutarQuery(sql_insert_propiedades, parametros);
                                }
                                services.IsertarLogsInventario(antes, despues, 2.toLong(), tupla.get("f_idempresa").toString().toLong(), tusuario.get("f_idrecord").toString().toLong());
                                String[] campos = [
                                        "f_paso",
                                        "f_cantidad",
                                        "f_tax",
                                        "f_existencia",
                                        "f_importe"
                                ];
                                String[] valore = [
                                        valor,
                                        tupla.getAt("f_cantidad").toString(),
                                        tupla.getAt("f_tax").toString(),
                                        tproducto.get("f_existencia").toString(),
                                        tupla.getAt("f_importe").toString()
                                ];
                                return funciones.convertir('1', funciones.crearJSON(campos, valore)).replace("'", '"').replace('"[', '[').replace(']"', ']');
                            } else {
                                String[] campos = [
                                        "f_paso",
                                        "f_cantidad",
                                        "f_existencia"
                                ];
                                String[] valore = [
                                        valor,
                                        tupla.getAt("f_cantidad").toString(),
                                        tproducto.get("f_existencia").toString()
                                ];
                                return funciones.convertir('1', funciones.crearJSON(campos, valore)).replace("'", '"').replace('"[', '[').replace(']"', ']');
                            }
                        }
                    }
                }
            } else {
                /*******Usuario No encontrado en respuesta*/
                funciones.convertir('-4', 'NONE').replace("'", '"');
            }
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE').replace("'", '"');
        }
    }

    //NO BORRAR
    @Transactional
    @RequestMapping(value = "/salvar_detalle_temporal2", method = RequestMethod.POST)
    def salvar_detalle_temporal2(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        println("ENTROOOOOOOO: " + dato1);
        Map map = JSON.parse(dato1);

        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarTokenNoLogin(map.get("f_key").toString())) {

            String valor = "1";

            if (tupla.get("f_tipo").toString().equals("1")) {
                Map<String, Object> tproducto = new HashMap<>();
                String sql_producto = "select * from t_productos as p where p.f_idrecord = ? and p.f_idempresa = ? ";
                Object[] parametros = [tupla.get("f_idproducto").toString().toLong(), tupla.get("f_idempresa").toString().toLong()] as Object;
                tproducto = sqlService.GetQueryMap(sql_producto, parametros);
                String nombre = "PRODUCTO";
                if (!tproducto.isEmpty()) {
                    nombre = tproducto.get("f_descripcion").toString();
                }
                if (tproducto.get("f_controlinventario").toString().toBoolean()) {
                    if (tupla.get("f_cantidad").toString().toBigDecimal() > tproducto.get("f_existencia").toString().toBigDecimal()) {
                        valor = "0";
                    }
                }
                Map temporal = services.InsertarDetalleTemporal2(
                        tproducto.get("f_idrecord").toString().toLong(),
                        tproducto.get("f_referencia").toString(),
                        tupla.get("f_cantidad").toString().toBigDecimal(),
                        tupla.get("f_precio").toString().toBigDecimal(),
                        tupla.get("f_tax").toString().toBigDecimal(),
                        map.get("f_key").toString(),
                        tupla.get("f_importe").toString().toBigDecimal(),
                        tupla.get("f_idempresa").toString().toLong(),
                        false,
                        tupla.get("f_descuento").toString().toBigDecimal(),
                        tupla.get("f_imei").toString().toString(),
                        tupla.get("f_porciento_descuento").toString().toBigDecimal(),
                        tupla.get("f_porciento_tax").toString().toBigDecimal(),
                        "" //comentario

                );
                // String despues = (funciones.MapToJson(temporal))
                //services.IsertarLogsInventario(despues,despues,1.toLong(),tupla.get("f_idempresa").toString().toLong(),tusuario.get("f_idrecord").toString().toLong());
//                String[] campos = [
//                        "f_idserver",
//                        "f_precio",
//                        "f_tax",
//                        "f_nombre",
//                        "f_referencia",
//                        "f_paso",
//                        "f_descuento",
//                        "f_importe"
//                ];
//                String[] valore = [
//                        temporal.get("f_idrecord").toString(),
//                        temporal.get("f_precio").toString(),
//                        temporal.get("f_tax").toString(),
//                        nombre,
//                        tproducto.getAt("f_referencia").toString(),
//                        valor,
//                        temporal.get("f_descuento").toString(),
//                        temporal.get("f_importe").toString()
//                ];
                /** impresion**/
                //MIO

                Map mapa = new HashMap();
                mapa.put("f_idserver",temporal.get("f_idrecord").toString());
                mapa.put("f_precio",temporal.get("f_precio").toString());
                mapa.put("f_tax",temporal.get("f_tax").toString());
                mapa.put("f_nombre",nombre);
                mapa.put("f_referencia",tproducto.getAt("f_referencia").toString());
                mapa.put("f_paso",valor);
                mapa.put("f_descuento",temporal.get("f_descuento").toString());
                mapa.put("f_importe",temporal.get("f_importe").toString());

               // return funciones.convertir('1', funciones.crearJSON(campos, valore)).replace("'", '"').replace('"[', '[').replace(']"', ']');
                return funciones.convertir('1',mapa);
                /******************Actualizar el detalle temporral************************/
            } else if (tupla.get("f_tipo").toString().equals("2")) {
                Object[] paramtros = [tupla.get("f_idserver").toString().toLong()] as Object;
                Map ttemporal = sqlService.GetQueryMap("Select * from  movil.t_carritomovil as b where b.f_idrecord = ?", paramtros);
                if (!ttemporal.isEmpty()) {

                    /*******************Esto es para eliminar un detalle temporal*****************************/
                    if (tupla.get("f_regresa").toString().toBoolean()) {
                        String antes = funciones.MapToJson(ttemporal);
                        String sql_regresa = "delete from  movil.t_carritomovil  where f_idrecord = '" + tupla.get("f_idserver").toString().toLong() + "'";
                        boolean elimin = sqlService.addProductosFavoritos(sql_regresa);

                        if (elimin) {


                            Map mapa = new HashMap();
                            mapa.put("f_paso", "1");
                            // HASTA AQUI YA LO QUITE DE LA LISTA
                            return funciones.convertir('1',mapa);
                           // return funciones.convertir('1', funciones.crearJSON(campos, valore)).replace("'", '"').replace('"[', '[').replace(']"', ']');
                        }
                    } else {

                        Map<String, Object> tproducto = new HashMap<>();
                        String sql_producto = "select * from t_productos as p where p.f_idrecord = ? and p.f_idempresa = ? ";
                        Object[] parametros = [ttemporal.get("f_idproducto").toString().toLong(), tupla.get("f_idempresa").toString().toLong()] as Object;
                        tproducto = sqlService.GetQueryMap(sql_producto, parametros);
                        if (tupla.get("f_diferencia").toString().toBigDecimal() > tproducto.get("f_existencia").toString().toBigDecimal()) {
                            valor = "0";
                        }
                        if (tupla.get("f_diferencia").toString().toBigDecimal() < 0) {
                            valor = "1";
                        }
                        if (!tproducto.get("f_controlinventario").toString().toBoolean()) {
                            valor = "1";
                        }
                        if (valor.equals("1")) {

                            String antes = funciones.MapToJson(ttemporal);
                            String sql_update = "Update movil.t_carritomovil set \n" +
                                    "f_cantidad = ?,\n" +
                                    "f_precio = ?,\n" +
                                    "f_tax = ?,\n" +
                                    "f_importe = ?,\n" +
                                    "f_descuento = ?,\n" +
                                    "f_comentario = ?,\n" +
                                    "f_porciento_descuento = ? where f_idrecord = ? and f_idempresa = ?  returning * \n";
                            parametros = [
                                    tupla.get("f_cantidad").toString().toBigDecimal(),
                                    tupla.get("f_precio").toString().toBigDecimal(),
                                    tupla.get("f_tax").toString().toBigDecimal(),
                                    tupla.get("f_importe").toString().toBigDecimal(),
                                    tupla.get("f_descuento").toString().toBigDecimal(),
                                    tupla.get("f_comentario").toString(),
                                    tupla.get("f_porciento_descuento").toString().toBigDecimal(),
                                    tupla.get("f_idserver").toString().toLong(),
                                    tupla.get("f_idempresa").toString().toLong()
                            ] as Object;
                            String despues = funciones.MapToJson(sqlService.GetQueryMap(sql_update, parametros));


                            /*ELIMINAMOS LAS PROPIEDADES */
                            String sql_eliminar_propiedades = "delete from movil.t_detalle_propiedades_temporal  where f_iddetalle = ?";
                            parametros = [tupla.get("f_idserver").toString().toLong()];
                            sqlService.EjecutarQuery(sql_eliminar_propiedades, parametros);

                            /*INSETAMOS LAS PROPIEDADES*/
                            List lista_propiedades = JSON.parse(tupla.get("f_propiedades").toString()).collect();

                            lista_propiedades.each { e ->
                                String sql_insert_propiedades = " INSERT INTO movil.t_detalle_propiedades_temporal (f_iddetalle,f_idpropiedad,f_key,f_idusuario)values (?,?,?,?)";
                                parametros = [
                                        tupla.get("f_idserver").toString().toLong(),
                                        e.getAt("f_idrecord").toString().toLong(),
                                        map.f_key.toString(),
                                        tusuario.f_idrecord.toString().toLong()
                                ] as Object;
                                sqlService.EjecutarQuery(sql_insert_propiedades, parametros);
                            }
                            //MIO

                            Map mapa = new HashMap();
                            mapa.put("f_paso", valor);
                            mapa.put("f_cantidad",  tupla.getAt("f_cantidad").toString());
                            mapa.put("f_tax", tupla.getAt("f_tax").toString());
                            mapa.put("f_existencia", tproducto.get("f_existencia").toString());
                            mapa.put("f_importe", tupla.getAt("f_importe").toString());

                            return funciones.convertir('1',mapa);
                        } else {

                            //MIO
                            Map mapa = new HashMap();
                            mapa.put("f_paso", valor);
                            mapa.put("f_cantidad",  tupla.getAt("f_cantidad").toString());
                            mapa.put("f_existencia", tproducto.get("f_existencia").toString());

                            return funciones.convertir('1',mapa);
                        }
                    }
                }
            }
//            }else{
//                /*******Usuario No encontrado en respuesta*/
//                funciones.convertir('-4', 'NONE').replace("'", '"');
//            }
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE').replace("'", '"');
        }
    }

//    @RequestMapping(value = "/get_productos_temporales_by_key", method = RequestMethod.POST)
//    def get_productos_temporales_by_key(@RequestParam(name = "json") String dato) {
//        String dato1 = new String(dato.decodeBase64());
//        Map map = JSON.parse(dato1);
//        Map tupla = JSON.parse(map.get("f_data").toString());
//        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
//
//            String sql = "select\n" +
//                    "       d.f_idrecord as f_idserver,\n" +
//                    "       p.f_referencia as f_referencia,\n" +
//                    "       p.f_descripcion as f_descripcion,\n" +
//                    "       d.f_cantidad as f_cantidad,\n" +
//                    "       coalesce(d.f_precio,0) as f_precio,\n" +
//                    "       coalesce(p.f_precio,0) as f_precio_original,\n" +
//                    "       coalesce(d.f_tax,0) as f_tax,\n" +
//                    "       coalesce(d.f_importe,0) as f_importe,\n" +
//                    "       coalesce(d.f_descuento,0) as f_descuento,\n" +
//                    "       coalesce(d.f_porciento_tax,0) as f_porciento_tax,\n" +
//                    "       d.f_comentario as f_comentario,\n" +
//                    "       (select  encode(foto.f_foto,'base64') as f_foto from t_productos_fotos as foto WHERE foto.f_idempresa = d.f_idempresa and foto.f_idproducto = d.f_idproducto and foto.f_menu = true) as f_foto,\n" +
//                    "       coalesce(get_propiedades_productos_json(p.f_idempresa,p.f_idrecord,d.f_idrecord),'[]') as f_propiedades \n" +
//                    "from movil.t_factura_detalle_temporal as d  inner join t_productos as p on p.f_idrecord = d.f_idproducto\n" +
//                    "where  d.f_idempresa = ? and  d.f_key = ? order by d.f_idrecord asc ; ";
//
//            Object[] parametros = [
//                    tupla.get("f_idempresa").toString().toLong(),
//                    map.get("f_key").toString()
//            ];
//            List list = sqlService.GetQuery(sql, parametros);
//            if (list.size() > 0) {
//                list.each { e ->
//
//                    if (!e.f_foto.is(null)) {
//                        def file = File.createTempFile("imagen", ".png");
//                        file.setBytes(e.f_foto.toString().decodeBase64());
//                        byte[] bytes = funciones.ReducirAumentarImagen(file, 200, 200);
//                        e.putAt("f_foto", bytes.encodeBase64().toString());
//                        file.delete();
//                    } else {
//                        e.putAt("f_foto", "");
//                    }
//
//                }
//            }
////            return funciones.convertir('1',(funciones.ListToJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
//            return funciones.convertir('1', (JsonOutput.toJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
//        } else {
//            /*******Usuario Desactivado*/
//            funciones.convertir('-2', 'NONE').replace("'", '"');
//        }
//    }
//
//    @RequestMapping(value = "/pass_productos_temporales_by_key", method = RequestMethod.POST)
//    def pass_productos_temporales_by_key(@RequestParam(name = "json") String dato) {
//        String dato1 = new String(dato.decodeBase64());
//        Map map = JSON.parse(dato1);
//        Map tupla = JSON.parse(map.get("f_data").toString());
//        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
//
//            String sql = "select * from movil.t_carritomovil where f_imei = ? "
//
//            Object[] parametros = [
//                    tupla.get("f_imei").toString()
//            ];
//            List list = sqlService.GetQuery(sql, parametros);
//
//            String paso = "2";
//
//            if (list.size() > 0) {
//
//                Map tlogin = new HashMap<>();
//                tlogin = seguridadService.GetLoginByToken(map.get("f_key").toString())
//
//                Map tusuario = new HashMap<>();
//                Object[] parametros_usuario = [tlogin.get("f_usuario").toString()] as Object
//                tusuario = sqlService.GetQueryMap("Select * from movil.t_usuarios_movil as b where b.f_email = ? ", parametros_usuario);
//
//                String valor = "1";
//                if (!tusuario.isEmpty()) {
//                    list.each { e ->
//
//                        Map<String, Object> tproducto = new HashMap<>();
//                        String sql_producto = "select * from t_productos as p where p.f_idrecord = ? and p.f_idempresa = ? ";
//                        Object[] parametrospro = [e.get("f_idproducto").toString().toLong(), tupla.get("f_idempresa").toString().toLong()] as Object;
//                        tproducto = sqlService.GetQueryMap(sql_producto, parametrospro);
//
//                        String nombre = "PRODUCTO";
//                        if (!tproducto.isEmpty()) {
//                            nombre = tproducto.get("f_descripcion").toString();
//                        }
//
//                        Map temporal = services.InsertarDetalleTemporal(
//                                e.get("f_idproducto").toString().toLong(),
//                                e.get("f_referencia").toString(),
//                                e.get("f_cantidad").toString().toBigDecimal(),
//                                e.get("f_precio").toString().toBigDecimal(),
//                                e.get("f_tax").toString().toBigDecimal(),
//                                map.get("f_key").toString(),
//                                e.get("f_importe").toString().toBigDecimal(),
//                                e.get("f_idempresa").toString().toLong(),
//                                false,
//                                e.get("f_descuento").toString().toBigDecimal(),
//                                tusuario.get("f_idrecord").toString().toLong(),
//                                e.get("f_porciento_descuento").toString().toBigDecimal(),
//                                e.get("f_porciento_tax").toString().toBigDecimal(),
//                                ""//comentario
//
//                        );
//                        String despues = (funciones.MapToJson(temporal))
//                        services.IsertarLogsInventario(despues, despues, 1.toLong(), tupla.get("f_idempresa").toString().toLong(), tusuario.get("f_idrecord").toString().toLong());
//                        String[] campos = [
//                                "f_idserver",
//                                "f_precio",
//                                "f_tax",
//                                "f_nombre",
//                                "f_referencia",
//                                "f_paso",
//                                "f_descuento",
//                                "f_importe"
//                        ];
//                        String[] valore = [
//                                temporal.get("f_idrecord").toString(),
//                                temporal.get("f_precio").toString(),
//                                temporal.get("f_tax").toString(),
//                                nombre,
//                                tproducto.getAt("f_referencia").toString(),
//                                valor,
//                                temporal.get("f_descuento").toString(),
//                                temporal.get("f_importe").toString()
//                        ];
//                        /******************Actualizar el detalle temporral************************/
////                        return   funciones.convertir('1',funciones.crearJSON(campos,valore)).replace("'", '"').replace('"[','[').replace(']"',']');
//                    }
//
//                    String sqldelete = "delete from movil.t_carritomovil where" +
//                            " f_imei = '" + tupla.get("f_imei").toString() + "'";
//
//                    paso = sqlService.deleteProducto(sqldelete);
//
//                    return funciones.convertir('1', paso).replace("'", '"');
//                } else {
//                    /*******Usuario No encontrado en respuesta*/
//                    funciones.convertir('-4', 'NONE').replace("'", '"');
//                }
//            }
//
////            return funciones.convertir('1',(funciones.ListToJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
//            return funciones.convertir('1', paso).replace("'", '"');
//        } else {
//            /*******Usuario Desactivado*/
//            funciones.convertir('-2', 'NONE').replace("'", '"');
//        }
//    }

    //NO BORRAR

    @RequestMapping(value = "/get_productos_temporales_by_key2", method = RequestMethod.POST)
    def get_productos_temporales_by_key2(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarTokenNoLogin(map.get("f_key").toString())) {

            String sql = "select\n" +
                    "                           d.f_idrecord as f_idserver,\n" +
                    "                           p.f_referencia as f_referencia,\n" +
                    "                           p.f_descripcion as f_descripcion,\n" +
                    "                         d.f_cantidad as f_cantidad,\n" +
                    "                        coalesce(d.f_precio,0) as f_precio,\n" +
                    "                           coalesce(p.f_precio,0) as f_precio_original,\n" +
                    "                           coalesce(d.f_tax,0) as f_tax,\n" +
                    "                           coalesce(d.f_importe,0) as f_importe,\n" +
                    "                           coalesce(d.f_descuento,0) as f_descuento,\n" +
                    "                           coalesce(d.f_porciento_tax,0) as f_porciento_tax,\n" +
                    "                           d.f_comentario as f_comentario,\n" +
                    "                           (select  encode(foto.f_foto,'base64') as f_foto from t_productos_fotos as foto WHERE foto.f_idempresa = d.f_idempresa and foto.f_idproducto = d.f_idproducto and foto.f_menu = true) as f_foto,\n" +
                    "                          coalesce(get_propiedades_productos_json(p.f_idempresa,p.f_idrecord,d.f_idrecord),'[]') as f_propiedades\n" +
                    "                    from movil.t_carritomovil as d  inner join t_productos as p on p.f_idrecord = d.f_idproducto\n" +
                    "                    where  d.f_idempresa = ? and  d.f_imei = ? order by d.f_idrecord asc";

            Object[] parametros = [
                    tupla.get("f_idempresa").toString().toLong(),
                    tupla.get("f_imei").toString()
            ];
            List list = sqlService.GetQuery(sql, parametros);
            if (list.size() > 0) {
                list.each { e ->

                    if (!e.f_foto.is(null)) {
                        def file = File.createTempFile("imagen", ".png");
                        file.setBytes(e.f_foto.toString().decodeBase64());
                        byte[] bytes = funciones.ReducirAumentarImagen(file, 200, 200);
                        e.putAt("f_foto", bytes.encodeBase64().toString());
                        file.delete();
                    } else {
                        e.putAt("f_foto", "");
                    }

                }
            }
//            return funciones.convertir('1',(funciones.ListToJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
            return funciones.convertir('1', list);
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE');
        }
    }

    //NO BORRAR
    @RequestMapping(value = "/get_productos_temporalesLogged", method = RequestMethod.POST)
    def get_productos_temporalesLogged(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {

            String sql = "\n" +
                    "select\n" +
                    "         d.f_idrecord as f_idserver,\n" +
                    "         p.f_referencia as f_referencia,\n" +
                    "         p.f_descripcion as f_descripcion,\n" +
                    "         d.f_cantidad as f_cantidad,\n" +
                    "         coalesce(d.f_precio,0) as f_precio,\n" +
                    "         coalesce(p.f_precio,0) as f_precio_original,\n" +
                    "         coalesce(d.f_tax,0) as f_tax,\n" +
                    "         coalesce(d.f_importe,0) as f_importe,\n" +
                    "         coalesce(d.f_descuento,0) as f_descuento,\n" +
                    "         coalesce(d.f_porciento_tax,0) as f_porciento_tax,\n" +
                    "         d.f_comentario as f_comentario,\n" +
                    "         (select  encode(foto.f_foto,'base64') as f_foto \n" +
                    "         from t_productos_fotos as foto\n" +
                    "         WHERE foto.f_idempresa = d.f_idempresa and\n" +
                    "         foto.f_idproducto = d.f_idproducto\n" +
                    "         and foto.f_menu = true) as f_foto,\n" +
                    "         coalesce(get_propiedades_productos_json(p.f_idempresa,p.f_idrecord,d.f_idrecord),'[]') as f_propiedades\n" +
                    "         from movil.t_factura_detalle_temporal as d \n" +
                    "         inner join t_productos as p\n" +
                    "         on p.f_idrecord = d.f_idproducto\n" +
                    "         where  d.f_idempresa = '" + tupla.get("f_idempresa").toString().toLong() + "' \n" +
                    "         and d.f_idusuario = '" + tupla.get("f_idusuario").toString() + "' \n" +
                    "         order by d.f_idrecord asc\n" +
                    "                    ";

            println(tupla.get("f_idempresa").toString().toLong())
            println(tupla.get("f_idusuario").toString())
            Object[] parametros = [
                    tupla.get("f_idempresa").toString().toLong(),
                    tupla.get("f_idusuario").toString()
            ];
//            List list = sqlService.GetQuery(sql,parametros);
            List list = sqlService.GetQuery(sql);
            if (list.size() > 0) {

                list.each { e ->

                    if (!e.f_foto.is(null)) {
                        def file = File.createTempFile("imagen", ".png");
                        file.setBytes(e.f_foto.toString().decodeBase64());
                        byte[] bytes = funciones.ReducirAumentarImagen(file, 200, 200);
                        e.putAt("f_foto", bytes.encodeBase64().toString());
                        file.delete();
                    } else {
                        e.putAt("f_foto", "");
                    }

                }
            }
//            return funciones.convertir('1',(funciones.ListToJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
            return funciones.convertir('1', (JsonOutput.toJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE').replace("'", '"');
        }
    }
//
//    @Transactional
//    @RequestMapping(value = "/set_salvar_orden_delivery", method = RequestMethod.POST)
//    def set_salvar_orden_delivery(@RequestParam(name = "json") String dato) {
//        String dato1 = new String(dato.decodeBase64());
//        Map map = JSON.parse(dato1);
//        Map tupla = JSON.parse(map.get("f_data").toString());
//        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
//            Map tlogin = seguridadService.GetLoginByToken(map.get("f_key").toString())
//            Object[] parametros = [tlogin.get("f_usuario").toString()] as Object
//            Map tusuario = sqlService.GetQueryMap("Select * from movil.t_usuarios_movil as b where b.f_email = ? ", parametros);
//            if (!tusuario.isEmpty()) {
//
////                println(tupla);
//
////                return funciones.convertir('1', "$numero").replace("'", '"');
//                String numero = services.crearOrdenDelivery(
//                        "",
//                        tupla.f_idempresa.toString().toLong(),
//                        tusuario.f_idrecord.toString().toLong(),
//                        tusuario.f_idrecord.toString().toLong(),
//                        tupla.f_subtotal.toString().toBigDecimal(),
//                        tupla.f_itbis.toString().toBigDecimal(),
//                        tupla.f_total.toString().toBigDecimal(),
//                        map.f_key.toString(),
//                        tupla.f_nota.toString(),
//                        new String(tupla.f_direccion.toString().decodeBase64()),
//                        tupla.f_comprobante_fiscal.toString().toBoolean()
//                );
//                /*******Usuario No encontrado en respuesta*/
//                return funciones.convertir('1', "$numero").replace("'", '"');
//            } else {
//                /*******Usuario No encontrado en respuesta*/
//                return funciones.convertir('-4', 'NONE').replace("'", '"');
//            }
//        } else {
//            /*******Usuario Desactivado*/
//            return funciones.convertir('-2', 'NONE').replace("'", '"');
//        }
//    }

    //NO BORRAR
    @Transactional
    @RequestMapping(value = "/set_salvar_orden_delivery2", method = RequestMethod.POST)
    def set_salvar_orden_delivery2(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
            Map tlogin = seguridadService.GetLoginByToken(map.get("f_key").toString())
            Object[] parametros = [tlogin.get("f_usuario").toString()] as Object
            Map tusuario = sqlService.GetQueryMap("Select * from movil.t_usuarios_movil as b where b.f_email = ? ", parametros);
            if (!tusuario.isEmpty()) {

                String numero = services.crearOrdenDelivery2(
                        "",
                        tupla.f_idempresa.toString().toLong(),
                        tusuario.f_idrecord.toString().toLong(),
                        tusuario.f_idrecord.toString().toLong(),
                        tupla.f_subtotal.toString().toBigDecimal(),
                        tupla.f_itbis.toString().toBigDecimal(),
                        tupla.f_total.toString().toBigDecimal(),
                        map.f_key.toString(),
                        tupla.f_nota.toString(),
                        new String(tupla.f_direccion.toString().decodeBase64()),
                        tupla.f_comprobante_fiscal.toString().toBoolean(),
                        tupla.f_imei.toString()
                );

                return funciones.convertir('1', "$numero");
            } else {
                /*******Usuario No encontrado en respuesta*/
                return funciones.convertir('-4', 'NONE');
            }
        } else {
            /*******Usuario Desactivado*/
            return funciones.convertir('-2', 'NONE');
        }
    }

    //NO BORRAR
    @RequestMapping(value = "/get_ordenes_cliente", method = RequestMethod.POST)
    def get_direcciones_usuario(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
            Map tlogin = seguridadService.GetLoginByToken(map.get("f_key").toString())
            Object[] parametros = [tlogin.get("f_usuario").toString()] as Object
            Map tusuario = sqlService.GetQueryMap("Select * from movil.t_usuarios_movil as b where b.f_email = ? ", parametros);
            String sql = "SELECT  f.f_idrecord,\n" +
                    "  concat(f.f_tipo_documento_factura,' ',to_char(CASE f.f_facturada WHEN TRUE THEN f.f_numero_factura ELSE f.f_numero_orden END,'FM000000')) as f_numero,\n" +
                    "  to_char(f.f_fecha_regstro_orden,'yyyy-MM-dd HH:MI:SS pm')::varchar as f_fecha_regstro_orden,\n" +
                    "  e.f_nombre as f_negocio,\n" +
                    "  f.f_itebis as f_itbis,\n" +
                    "  f.f_total,\n" +
                    "  f.f_idempresa,\n" +
                    "  get_estatus_orden(f.f_idrecord) as f_status\n" +
                    "  FROM t_facturas as  f\n" +
                    "  INNER JOIN cfg.t_empresas as e on e.f_idrecord = f.f_idempresa\n" +
                    "  WHERE f.f_wholenum_cliente ='CM${tusuario.f_idrecord.toString()}' and f.f_modulo = 3 " +
                    "order by f_fecha_regstro_orden desc limit 100";

//            if (tupla.f_pendiente.toString().toBoolean()) {
//                sql += " AND (SELECT max(s.f_idestatus) from t_pedidos_estatus  as s WHERE s.f_idfactura = f.f_idrecord) <= 4 order by f_fecha_regstro_orden desc limit 100";
//            } else if (!tupla.f_fecha1.toString().equals("")) {
//                sql += " AND f.f_fecha_regstro_orden::date = '${tupla.f_fecha1.toString()}'::date order by f_fecha_regstro_orden desc limit 100";
//            }

            List list = sqlService.GetQuery(sql);
            return funciones.convertir('1', list);
//            return funciones.convertir('1',(groovy.json.JsonOutput.toJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
        } else {
            /*******Usuario Desactivado*/
            return funciones.convertir('-2', 'NONE');
        }
    }

    //NO BORRAR
    @RequestMapping(value = "/get_ordenes_cliente2", method = RequestMethod.POST)
    def get_direcciones_usuario2(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
            Map tlogin = seguridadService.GetLoginByToken(map.get("f_key").toString())

            Object[] parametros = [tlogin.get("f_usuario").toString()] as Object
            Map tusuario = sqlService.GetQueryMap("Select * from movil.t_usuarios_movil as b where b.f_email = ? ", parametros);
            String sql = "SELECT  f.f_idrecord,\n" +
                    "concat(f.f_tipo_documento_factura,' ',to_char(CASE f.f_facturada WHEN TRUE THEN\n" +
                    "f.f_numero_factura ELSE f.f_numero_orden END,'FM000000')) as f_numero,\n" +
                    "to_char(f.f_fecha_regstro_orden,'yyyy-MM-dd HH:MI:SS pm')::varchar as f_fecha_regstro_orden,\n" +
                    "e.f_nombre as f_negocio,\n" +
                    "f.f_itebis as f_itbis,\n" +
                    "f.f_total,\n" +
                    "f.f_idempresa,\n" +
                    "get_estatus_orden(f.f_idrecord) as f_status\n" +
                    "FROM t_facturas as  f\n" +
                    "INNER JOIN cfg.t_empresas as e on e.f_idrecord = f.f_idempresa\n" +
                    "WHERE f.f_wholenum_cliente = 'CM${tusuario.f_idrecord.toString()}' and f.f_modulo = 3  \n" +
                    "AND f_fecha_regstro_orden::date BETWEEN\n" +
                    "'${tupla.f_fecha1.toString()}'::date and '${tupla.f_fecha2.toString()}'::date order by \n" +
                    "f_fecha_regstro_orden desc limit 100";

            List list = sqlService.GetQuery(sql);
            return funciones.convertir('1', list);
//            return funciones.convertir('1',(groovy.json.JsonOutput.toJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
        } else {
            /*******Usuario Desactivado*/
            return funciones.convertir('-2', 'NONE');
        }
    }

//    @RequestMapping(value = "/get_eliminar_detalle_usuarios", method = RequestMethod.POST)
//    def get_eliminar_detalle_usuarios(@RequestParam(name = "json") String dato) {
//        String dato1 = new String(dato.decodeBase64());
//        Map map = JSON.parse(dato1);
//        Map tupla = JSON.parse(map.get("f_data").toString());
//        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
//            Map tlogin = seguridadService.GetLoginByToken(map.get("f_key").toString())
//            Object[] parametros = [tlogin.get("f_usuario").toString()] as Object
//            Map tusuario = sqlService.GetQueryMap("Select * from movil.t_usuarios_movil as b where b.f_email = ? ", parametros);
//            seguridadService.GetEliminarDetallesUsuario(tusuario.f_email.toString());
//            String[] campos = ["f_paso"];
//            String[] valores = ["1"];
//            return funciones.convertir('1', funciones.crearJSON(campos, valores)).replace("'", '"').replace('"[', '[').replace(']"', ']');
//
//        } else {
//            /*******Usuario Desactivado*/
//            return funciones.convertir('-2', 'NONE').replace("'", '"');
//        }
//    }

    //NO BORRAR
    @RequestMapping(value = "/get_eliminar_detalle_usuarios2", method = RequestMethod.POST)
    def get_eliminar_detalle_usuarios2(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarTokenNoLogin(map.get("f_key").toString())) {

            String sql = "delete from movil.t_carritomovil where f_imei = '" + tupla.get("f_imei") + "'";
            sqlService.deleteProducto(sql);

            //MIO
            Map mapa = new HashMap();
            mapa.put("f_paso","1");

            return funciones.convertir('1', mapa);

        } else {
            /*******Usuario Desactivado*/
            return funciones.convertir('-2', 'NONE');
        }
    }

    //NO BORRAR
    @Transactional
    @RequestMapping(value = "/set_eliminar_orden", method = RequestMethod.POST)
    def set_eliminar_orden(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
            Map tlogin = seguridadService.GetLoginByToken(map.get("f_key").toString())
            Object[] parametros = [tlogin.get("f_usuario").toString()] as Object
            Map tusuario = sqlService.GetQueryMap("Select * from movil.t_usuarios_movil as b where b.f_email = ? ", parametros);
            if (!tusuario.isEmpty()) {
                String sql = "select max(d.f_idestatus) as f_status from t_pedidos_estatus d where  d.f_idfactura = ? ";
                parametros = [tupla.f_idrecord.toString().toLong()] as Object;
                Map testatus = sqlService.GetQueryMap(sql, parametros);
                if (!testatus.isEmpty()) {
                    if (testatus.f_status.toString().toLong() >= 4) {

                        Map mapa = new HashMap();
                        mapa.put("f_paso","0");

                        return funciones.convertir('1', mapa);
                    }
                }
                services.CancelarOrden(
                        tupla.f_idrecord.toString(),
                        tupla.f_idempresa.toString()
                );
                /*******Orden cancelada correctamente*/

                Map mapa2 = new HashMap();
                mapa2.put("f_paso","1");

                return funciones.convertir('1', mapa2);
            } else {
                /*******Usuario No encontrado en respuesta*/
                return funciones.convertir('-4', 'NONE');
            }
        } else {
            /*******Usuario Desactivado*/
            return funciones.convertir('-2', 'NONE');
        }
    }

//NO BORRAR
    @Transactional
    @RequestMapping(value = "/buscarfav", method = RequestMethod.POST)
    def BuscarFavoritos(@RequestParam(name = "json") String dato) {

        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());

        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
            Map tlogin = seguridadService.GetLoginByToken(map.get("f_key").toString())
            Object[] parametros = [tlogin.get("f_usuario").toString()] as Object
            Map tusuario = sqlService.GetQueryMap("Select * from movil.t_usuarios_movil as b where b.f_email = ? ", parametros);

            if (!tusuario.isEmpty()) {
                String idusuario = tupla.get("f_idusuario");
                String idempresa = tupla.get("f_idempresa");
                String sql = " SELECT pro.*, encode(ft.f_foto,'base64') as f_foto \n" +
                        " FROM t_productos AS pro \n" +
                        " LEFT JOIN t_productos_fotos AS ft ON  pro.f_idrecord = ft.f_idproducto AND  ft.f_menu = TRUE \n" +
                        " WHERE  pro.f_idempresa = '" + idempresa + "' \n" +
                        " AND pro.f_idrecord IN (\n" +
                        "     SELECT \n" +
                        "     fav.f_idproducto \n" +
                        "     FROM movil.t_favoritovsusuario AS fav \n" +
                        "     WHERE f_idusuario = '" + idusuario + "'\n" +
                        " )";

                List lista = sqlService.getProductosFavoritos(sql);

                return funciones.convertir('1', lista);
            } else {
                /*******Usuario No encontrado en respuesta*/
                return funciones.convertir('-4', 'NONE');
            }
        } else {
            /*******Usuario Desactivado*/
            return funciones.convertir('-2', 'NONE');
        }
    }

//NO BORRAR
    @Transactional
    @RequestMapping(value = "/searchcategorias", method = RequestMethod.POST)
    def searchcategorias(@RequestParam(name = "json") String dato) {

        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());

        if (seguridadService.ValidarTokenNoLogin(map.get("f_key").toString())) {

            String sql = "select cat.f_descripcion as f_nombre\n" +
                    " , cat.f_idrecord as idcategoria\n" +
                    " ,count(pro.*) as f_cantidad, \n" +
                    " encode(cat.f_foto,'base64') as f_fotoCategoria \n" +
                    " from \n" +
                    " t_productos_categorias as cat\n" +
                    " LEFT join t_productos as pro\n" +
                    " on cat.f_idrecord = pro.f_idcategoria\n" +
                    " group by cat.f_descripcion, cat.f_idrecord";

            List lista = sqlService.GetQuery(sql);
            if (lista.size() > 0) {
                lista.each { e ->

                    if (!e.f_fotoCategoria.is(null)) {
                        def file = File.createTempFile("imagen", ".png");
                        file.setBytes(e.f_fotoCategoria.toString().decodeBase64());
                        byte[] bytes = funciones.ReducirAumentarImagen(file, 200, 200);
                        e.putAt("f_fotoCategoria", bytes.encodeBase64().toString());
                        file.delete();
                    } else {
                        e.putAt("f_fotoCategoria", "");
                    }

                }
            }

            return funciones.convertir('1',lista);
        } else {
            /*******Usuario Desactivado*/
            return funciones.convertir('-2', 'NONE').replace("'", '"');
        }
    }

    //NO BORRAR
    @Transactional
    @RequestMapping(value = "/productosbycat", method = RequestMethod.POST)
    def productosbycat(@RequestParam(name = "json") String dato) {

        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());

        if (seguridadService.ValidarTokenNoLogin(map.get("f_key").toString())) {

            String idCategoria = tupla.get("f_idcategoria");
            String sql = " select p.*, encode(f.f_foto, 'base64') as f_foto from t_productos as p \n" +
                    " left join t_productos_fotos as f\n" +
                    " on p.f_idrecord = f.f_idproducto\n" +
                    " where p.f_idcategoria = '" + idCategoria + "'";

            List lista = sqlService.GetQuery(sql);

           // return funciones.convertir('1', (funciones.ListToJson(lista))).replace("'", '"').replace('"[', '[').replace(']"', ']');
           return funciones.convertir('1',lista);
        } else {
            /*******Usuario Desactivado*/
            return funciones.convertir('-2', 'NONE').replace("'", '"');
        }
    }

    //NO BORRARsalvar_detalle_temporal2
    @Transactional
    @RequestMapping(value = "/addfav", method = RequestMethod.POST)
    def addFavoritos(@RequestParam(name = "json") String dato) {

        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());

        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
            Map tlogin = seguridadService.GetLoginByToken(map.get("f_key").toString())
            Object[] parametros = [tlogin.get("f_usuario").toString()] as Object
            Map tusuario = sqlService.GetQueryMap("Select * from movil.t_usuarios_movil as b where b.f_email = ? ", parametros);

            if (!tusuario.isEmpty()) {
                String idusuario = tupla.get("f_idusuario");
                String idproducto = tupla.get("f_idproducto");
                String sql = "insert into movil.t_favoritovsusuario(f_idusuario,f_idproducto)VALUES('" + idusuario + "'," + idproducto + ")";
println(sql);
                Boolean add = sqlService.addProductosFavoritos(sql);

                return funciones.convertir('1', add);
            } else {
                /*******Usuario No encontrado en respuesta*/
                return funciones.convertir('-4', 'NONE');
            }
        } else {
            /*******Usuario Desactivado*/
            return funciones.convertir('-2', 'NONE');
        }
    }

    //NO BORRAR
    @Transactional
    @RequestMapping(value = "/deletefav", method = RequestMethod.POST)
    def deleteFavoritos(@RequestParam(name = "json") String dato) {

        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());

        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
            Map tlogin = seguridadService.GetLoginByToken(map.get("f_key").toString())
            Object[] parametros = [tlogin.get("f_usuario").toString()] as Object
            Map tusuario = sqlService.GetQueryMap("Select * from movil.t_usuarios_movil as b where b.f_email = ? ", parametros);

            if (!tusuario.isEmpty()) {
                String idproducto = tupla.get("f_idproducto");
                String sql = "delete from movil.t_favoritovsusuario where f_idproducto = '" + idproducto + "'";

                Boolean add = sqlService.addProductosFavoritos(sql);

                return funciones.convertir('1', add);
            } else {
                /*******Usuario No encontrado en respuesta*/
                return funciones.convertir('-4', 'NONE');
            }
        } else {
            /*******Usuario Desactivado*/
            return funciones.convertir('-2', 'NONE');
        }
    }

    //NO BORRAR
    @Transactional
    @RequestMapping(value = "/perfil", method = RequestMethod.POST)
    def perfil(@RequestParam(name = "json") String dato) {

        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());

        if (seguridadService.ValidarToken(map.get("f_key").toString())) {

            String sql = "    select * from movil.t_usuarios_movil where f_idrecord = '" + tupla.get("f_idusuario") + "'"
            List lista = sqlService.GetQuery(sql);

            return funciones.convertir('1', lista);
        } else {
            /*******Usuario Desactivado*/
            return funciones.convertir('-2', 'NONE').replace("'", '"');
        }
    }

    //NO BORRAR
    @Transactional
    @RequestMapping(value = "/actualizar", method = RequestMethod.POST)
    def actualizar(@RequestParam(name = "json") String dato) {

        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());

        if (seguridadService.ValidarToken(map.get("f_key").toString())) {

            String sql = "update movil.t_usuarios_movil set f_nombre = '" + tupla.get("f_nombre") + "'," +
                    " f_telefono = '" + tupla.get("f_tel") + "' , f_direccion = '" + tupla.get("f_direccion") + "'" +
                    " , f_email = '" + tupla.get("f_email") + "' " +
                    "where f_idrecord = '" + tupla.get("f_idusuario") + "'";

            Boolean add = sqlService.addProductosFavoritos(sql);

            return funciones.convertir('1', "" + add);
        } else {
            /*******Usuario Desactivado*/
            return funciones.convertir('-2', 'NONE');
        }
    }

    //NO BORRAR
    @Transactional
    @RequestMapping(value = "/changePass", method = RequestMethod.POST)
    def changePass(@RequestParam(name = "json") String dato) {

        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());

        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
            println(tupla.get("f_antigua").toString());
            String password = funciones.encodeAsMD5(tupla.get("f_antigua").toString());
            println(password);
            String newpassword = funciones.encodeAsMD5(tupla.get("f_nueva").toString());

            String sql = " select * from movil.t_usuarios_movil where f_idrecord = '" + tupla.get("f_idusuario") + "' and \n" +
                    " f_password = '" + password + "'";

            Map mapa = sqlService.SearchMap(sql);
            Boolean add = false;

            if (!mapa.isEmpty()) {

                String sqlUpdate = "update movil.t_usuarios_movil set f_password = '" + newpassword + "' where " +
                        "f_idrecord = '" + tupla.get("f_idusuario") + "'";

                add = sqlService.deleteProducto(sqlUpdate);

                return funciones.convertir('1', "" + add);
            } else {

                return funciones.convertir('1', "" + add);
            }
        } else {
            /*******Usuario Desactivado*/
            return funciones.convertir('-2', 'NONE');
        }
    }
//NO BORRAR
    @Transactional
    @RequestMapping(value = "/get_canitdad_producto_Login", method = RequestMethod.POST)
    def get_canitdad_producto_Login(@RequestParam(name = "json") String dato) {

        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarTokenNoLogin(map.get("f_key").toString())) {

            String sql = "select count(*) as f_cantidad from movil.t_carritomovil where f_imei = '"+tupla.get("f_imei")+"'";
            Map cantidad = sqlService.SearchMap(sql);

            funciones.convertir('1', cantidad.get("f_cantidad").toString());

        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE').replace("'", '"');
        }
    }

    //NO BORRAR
    @RequestMapping(value = "/buscar_productos_by_orden", method = RequestMethod.POST)
    def buscar_productos_by_orden(@RequestParam(name = "json") String dato) {

        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {

            Object[] parametros = [tupla.get("f_idrecord").toString().toLong()] as Object

            String sql = "select\n" +
                    "p.f_idrecord,\n" +
                    "p.f_precio,\n" +
                    "p.f_tax,\n" +
                    "p.f_descripcion as f_nombre,\n" +
                    "encode(ft.f_foto, 'base64') as f_foto\n" +
                    "from t_productos as p inner join t_detalle_factura as d \n" +
                    "on d.f_idproducto = p.f_idrecord\n" +
                    " left join t_productos_fotos as ft\n" +
                    "on p.f_idrecord = ft.f_idproducto\n" +
                    "where d.f_idfactura = ?";
            List lista = sqlService.GetQuery(sql,parametros);

            return funciones.convertir('1', lista);

        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE');
        }
    }

}