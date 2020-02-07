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

@RequestMapping(value = "/ws")
@RestController
@Transactional
class WsController {
    @Autowired
    SeguridadService seguridadService
    @Autowired
    SqlService sqlService;
    @Autowired
    ConfiguracionServices services;
    Funciones funciones = new Funciones();


    //NO BORRAR
    @RequestMapping(value = "/get_categorias_by_empresa", method = RequestMethod.POST)
    def get_categorias_by_empresa(@RequestParam(name = "json") String dato) {

        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {

            String sql = "select f_idrecord,f_idempresa,f_descripcion,f_orden,encode(f_foto,'base64') as f_foto from t_productos_categorias as cat where  cat.f_idempresa = ? "
            Object[] parametros = [tupla.get("f_idempresa").toString().toLong()];
            List list = sqlService.GetQuery(sql, parametros);
            if (list.size() > 0) {
                list.each { e ->

                    if (!e.f_foto.is(null)) {
                        def file = File.createTempFile("imagen", ".png");
                        file.setBytes(e.f_foto.toString().decodeBase64());
                        byte[] bytes = funciones.ReducirAumentarImagen(file, 200, 200);
                        e.putAt("f_foto", bytes.encodeBase64().toString());
                        file.delete();
                    }else {
                        e.putAt("f_foto", "");
                    }

                }
            }
            return funciones.convertir('1', list);
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE');
        }
    }
//
//    @RequestMapping(value = "/get_categorias_by_parametros", method = RequestMethod.POST)
//    def get_categorias_by_parametros(@RequestParam(name = "json") String dato) {
//
//        String dato1 = new String(dato.decodeBase64());
//        Map map = JSON.parse(dato1);
//        Map tupla = JSON.parse(map.get("f_data").toString());
//        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
//
//            String sql = "select  * from t_productos_categorias as cat where  cat.f_idempresa = ? and cat.f_descripcion ilike  ? ";
//            Object[] parametros = [tupla.get("f_idempresa").toString().toLong(), "%" + tupla.get("f_parametro").toString() + "%"];
//            List list = sqlService.GetQuery(sql, parametros);
//            return funciones.convertir('1', (funciones.ListToJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
//        } else {
//            /*******Usuario Desactivado*/
//            funciones.convertir('-2', 'NONE').replace("'", '"');
//        }
//    }

    //NO BORRAR
    @RequestMapping(value = "/get_productos_by_categoria", method = RequestMethod.POST)
    def get_productos_by_categoria(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());

        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {

            String sql = "select\n" +
                    "       p.f_idrecord as f_idrecord,\n" +
                    "       p.f_referencia as f_referencia,\n" +
                    "       p.f_descripcion as f_descripcion,\n" +
                    "       coalesce(p.f_tax,0) as f_tax,\n" +
                    "(select  encode(foto.f_foto,'base64') as f_foto from t_productos_fotos as foto WHERE foto.f_idempresa = p.f_idempresa and foto.f_idproducto = p.f_idrecord and foto.f_menu = true) as f_foto," +
                    "       coalesce(p.f_precio,0) as f_precio\n" +
                    "from t_productos p\n" +
                    "where p.f_idempresa = ? and p.f_idcategoria = ?; "
            Object[] parametros = [
                    tupla.get("f_idempresa").toString().toLong(),
                    tupla.get("f_idcategoria").toString().toLong()
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
                    }else {
                        e.putAt("f_foto", "");
                    }

                }
            }
            return funciones.convertir('1', list)
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE')
        }
    }

//    @RequestMapping(value = "/get_propiedades_by_producto", method = RequestMethod.POST)
//    def get_propiedades_by_producto(@RequestParam(name = "json") String dato) {
//        String dato1 = new String(dato.decodeBase64());
//
//        Map map = JSON.parse(dato1);
//        Map tupla = JSON.parse(map.get("f_data").toString());
//        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
//            String sql = "select \n" +
//                    "pr.*\n" +
//                    "FROM t_productos_propiedades p\n" +
//                    "INNER JOIN t_propiedades as pr on p.f_idpropiedad = pr.f_idrecord\n" +
//                    "WHERE  p.f_idempresa = ? and p.f_idproducto = ? "
//            Object[] parametros = [
//                    tupla.get("f_idempresa").toString().toLong(),
//                    tupla.get("f_idproducto").toString().toLong()
//            ];
//            List list = sqlService.GetQuery(sql, parametros);
//            return funciones.convertir('1', (funciones.ListToJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
//        } else {
//            /*******Usuario Desactivado*/
//            funciones.convertir('-2', 'NONE').replace("'", '"');
//        }
//    }


//    @RequestMapping(value = "/get_lugares_favoritos", method = RequestMethod.POST)
//    def get_lugares_favoritos(@RequestParam(name = "json") String dato) {
//        String dato1 = new String(dato.decodeBase64());
//
//        Map map = JSON.parse(dato1);
//        Map tupla = JSON.parse(map.get("f_data").toString());
//        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
//            Map<String, Object> map_login = seguridadService.GetLoginByToken(map.get("f_key").toString());
//            List list = services.ListarSitiosFavoritos(map_login.get("f_idusuario").toString().toLong());
//            return funciones.convertir('1', (funciones.ListToJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
//        } else {
//            /*******Usuario Desactivado*/
//            funciones.convertir('-2', 'NONE').replace("'", '"');
//        }
//    }
//
//    @RequestMapping(value = "/get_diez_productos_mas_vendidos", method = RequestMethod.POST)
//    def get_diez_productos_mas_vendidos(@RequestParam(name = "json") String dato) {
//        String dato1 = new String(dato.decodeBase64());
//
//        Map map = JSON.parse(dato1);
//        Map tupla = JSON.parse(map.get("f_data").toString());
//        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
//
//            String sql = "SELECT\n" +
//                    "p.f_referencia,\n" +
//                    "p.f_descripcion,\n" +
//                    "cat.f_descripcion as f_categoria,\n" +
//                    "coalesce(p.f_precio,0) as f_precio,\n" +
//                    "coalesce(p.f_tax,0) as f_tax,\n" +
//                    "sum(d.f_cantidad) as f_cantidad  \n" +
//                    "from\n" +
//                    "t_productos as p\n" +
//                    "INNER JOIN t_detalle_factura as d on d.f_idproducto = p.f_idrecord\n" +
//                    "INNER JOIN t_facturas as f on d.f_idfactura = f.f_idrecord\n" +
//                    "INNER JOIN t_productos_categorias as cat on cat.f_idrecord = p.f_idcategoria\n" +
//                    "WHERE p.f_idempresa = ? \n" +
//                    " \n" +
//                    "GROUP BY p.f_referencia,p.f_descripcion,f_categoria,p.f_precio \n" +
//                    "ORDER BY f_cantidad DESC limit 10"
//            Object[] parametros = [
//                    tupla.get("f_idempresa").toString().toLong()
//            ];
//            List list = sqlService.GetQuery(sql, parametros);
//            return funciones.convertir('1', (funciones.ListToJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
//        } else {
//            /*******Usuario Desactivado*/
//            funciones.convertir('-2', 'NONE').replace("'", '"');
//        }
//    }

    //NO BORRAR
    @RequestMapping(value = "/get_productos_by_paramentros", method = RequestMethod.POST)
    def get_productos_by_paramentros(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarTokenNoLogin(map.get("f_key").toString())) {
            String sql = "select\n" +
                    "       p.f_idrecord as f_idrecord,\n" +
                    "       p.f_referencia as f_referencia,\n" +
                    "       p.f_descripcion as f_descripcion,\n" +
                    "       coalesce(p.f_tax,0) as f_tax,\n" +
                    "(select  encode(foto.f_foto,'base64') as f_foto from t_productos_fotos as foto WHERE foto.f_idempresa = p.f_idempresa and foto.f_idproducto = p.f_idrecord and foto.f_menu = true) as f_foto," +
                    "       coalesce(p.f_precio,0) as f_precio\n" +
                    "from t_productos p\n" +
                    "where p.f_idempresa = ? and (p.f_referencia::text = ? or p.f_descripcion ilike ?); "
            Object[] parametros = [
                    tupla.get("f_idempresa").toString().toLong(),
                    tupla.get("f_parametro").toString(),
                    "%" + tupla.get("f_parametro").toString() + "%"
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
                    }else {
                        e.putAt("f_foto", "");
                    }

                }
            }
//            return funciones.convertir('1', (JsonOutput.toJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
            return funciones.convertir('1', list);
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE');
        }
    }

    @RequestMapping(value = "/get_productos_by_paramentros2", method = RequestMethod.POST)
    def get_productos_by_paramentros2(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarTokenNoLogin(map.get("f_key").toString())) {
            String sql = "select\n" +
                    "       p.f_idrecord as f_idrecord,\n" +
                    "       p.f_referencia as f_referencia,\n" +
                    "       p.f_descripcion as f_descripcion,\n" +
                    "       coalesce(p.f_tax,0) as f_tax,\n" +
                    "(select  encode(foto.f_foto,'base64') as f_foto from t_productos_fotos as foto WHERE foto.f_idempresa = p.f_idempresa and foto.f_idproducto = p.f_idrecord and foto.f_menu = true) as f_foto," +
                    "       coalesce(p.f_precio,0) as f_precio\n" +
                    "from t_productos p\n" +
                    "where p.f_idempresa = ? and (p.f_referencia::text = ? or p.f_descripcion ilike ?) limit 21 "
            Object[] parametros = [
                    tupla.get("f_idempresa").toString().toLong(),
                    tupla.get("f_parametro").toString(),
                    "%" + tupla.get("f_parametro").toString() + "%"
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
                    }else {
                        e.putAt("f_foto", "");
                    }

                }
            }
//            return funciones.convertir('1', (JsonOutput.toJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
            return funciones.convertir('1', list);
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE');
        }
    }

    //NO BORRAR
    @RequestMapping(value = "/get_datos_preferencia", method = RequestMethod.POST)
    def get_datos_preferencia(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {

            String sql = "WITH  tabla as(\n" +
                    "SELECT \n" +
                    "emp.f_tipo_negocio,\n" +
                    "emp.f_pedidos_minimos,\n" +
                    "emp.f_telefono,\n" +
                    "emp.f_direccion,\n" +
                    "emp.f_lema,\n" +
                    "emp.f_nombre,\n" +
                    "emp.f_ncf_defecto_delivery,\n" +
                    "emp.f_adressusa,\n"+
                    "coalesce( emp.f_precio_envio,0) as f_precio_envio,\n" +
                    "CASE date_part('dow',CURRENT_DATE) + 1\n" +
                    "WHEN 1 THEN emp.f_horario_1\n" +
                    "WHEN 2 THEN emp.f_horario_2\n" +
                    "WHEN 3 THEN emp.f_horario_3\n" +
                    "WHEN 4 THEN emp.f_horario_4\n" +
                    "WHEN 5 THEN emp.f_horario_5\n" +
                    "WHEN 6 THEN emp.f_horario_6\n" +
                    "WHEN 7 THEN emp.f_horario_7 END as f_horario\n" +
                    "FROM cfg.t_empresas as emp\n" +
                    "WHERE emp.f_idrecord = ?\n" +
                    ") \n" +
                    "SELECT \n" +
                    "tabla.*,\n" +
                    "CASE \n" +
                    "WHEN to_char(now(),'HH24:MI')::TIME BETWEEN split_part(tabla.f_horario,';',1)::TIME AND split_part(tabla.f_horario,';',2)::TIME\n" +
                    "THEN TRUE ELSE FALSE END as f_laborando\n" +
                    "FROM tabla"
            Object[] parametros = [
                    tupla.get("f_idempresa").toString().toLong()
            ];
            List list = sqlService.GetQuery(sql, parametros);
            return funciones.convertir('1', list);
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE');
        }
    }

    //NO BORRAR
    @RequestMapping(value = "/get_direcciones_usuario", method = RequestMethod.POST)
    def get_direcciones_usuario(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {

            Map tlogin = seguridadService.GetLoginByToken(map.get("f_key").toString())
            Object[] parametros = [tlogin.get("f_usuario").toString()] as Object
            Map tusuario = sqlService.GetQueryMap("Select * from movil.t_usuarios_movil as b where b.f_email = ? ", parametros);
            String sql = "select d.f_idrecord,d.f_principal,EXTRACT(EPOCH from d.f_fecha) * 1000 as f_fecha,\n" +
                    "                    encode(d.f_direccion::bytea,'base64') as f_direccion1, encode(d.f_direccion2::bytea,'base64') as f_direccion2,\n" +
                    "                    d.f_usa, d.f_sector_city, d.f_state_provincia, d.f_zipcode, e.f_descripcion as f_nom_estado, d.f_nombre_direccion\n" +
                    "                     from movil.t_direcciones_usuarios as d left join movil.t_estados_usa as e on d.f_state_provincia = e.f_idrecord \n" +
                    "                      where d.f_idusuario = ?";

            parametros = [
                    tusuario.f_idrecord.toString().toLong()
            ];
            List list = sqlService.GetQuery(sql, parametros);
            return funciones.convertir('1',list);
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE');
        }
    }

    @RequestMapping(value = "/borrar_direccion", method = RequestMethod.POST)
    def borrar_direccion(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {

            String sql = "delete from movil.t_direcciones_usuarios as e where e.f_idrecord = "+tupla.f_idrecord.toString().toLong();

            Boolean add = sqlService.addProductosFavoritos(sql);
            return funciones.convertir('1',add);
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE');
        }
    }

    //NO BORRAR
    @RequestMapping(value = "/set_salvar_direcciones_usuario", method = RequestMethod.POST)
    def set_salvar_direccione_usuario(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);

        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
            Map tlogin = seguridadService.GetLoginByToken(map.get("f_key").toString())
            Object[] parametros = [tlogin.get("f_usuario").toString()] as Object

            Map tusuario = sqlService.GetQueryMap("Select * from movil.t_usuarios_movil as b where b.f_email = ? ", parametros);

            if(tupla.containsKey("f_iddireccion")){
                services.InsertarDireccion(tupla.f_idrecord.toString(), new String(tupla.f_direccion1.toString().decodeBase64()),tusuario.f_idrecord.toString().toLong(),
                        tupla.f_principal.toString().toBoolean(),tupla.get("f_iddireccion").toString().toLong(),new String(tupla.f_direccion2.toString().decodeBase64()),
                        tupla.get("f_usa").toString().toBoolean(), tupla.get("f_sector_city").toString(),tupla.get("f_zipcode").toString(), tupla.get("f_state_prov").toString().toLong(),tupla.get("f_nombre_direccion").toString());
            }
            else{
                services.InsertarDireccion(tupla.f_idrecord.toString(), new String(tupla.f_direccion1.toString().decodeBase64()), tusuario.f_idrecord.toString().toLong(),
                        tupla.f_principal.toString().toBoolean(),0,new String(tupla.f_direccion2.toString().decodeBase64()),
                        tupla.get("f_usa").toString().toBoolean(), tupla.get("f_sector_city").toString(),tupla.get("f_zipcode").toString(), tupla.get("f_state_prov").toString().toLong(),tupla.get("f_nombre_direccion").toString());
            }

            funciones.convertir('1', true)
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE')
        }
    }
//NO BORRAR
    @RequestMapping(value = "/set_salvar_usuario", method = RequestMethod.POST)
    def set_salvar_usuario(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());

        Object[] parametros = [tupla.get("f_email").toString()] as Object
        String sql = "Select b.* from movil.t_usuarios_movil as b where b.f_email = ? ";
        Map tusuario = sqlService.GetQueryMap(sql, parametros);
        if (!tusuario.isEmpty()){
            return   funciones.convertir('-3', true);
        }else{
            services.IsertarUsuario(
                    tupla.f_idrecord.toString(),
                    tupla.f_nombre.toString(),
                    tupla.f_telefono.toString(),
                    tupla.f_direccion.toString(),
                    tupla.f_email.toString(),
                    tupla.f_password.toString(),
                    tupla.f_latitud.toString(),
                    tupla.f_longitud.toString()
            );
            return   funciones.convertir('1', true);
        }

    }

//NO BORRAR
    @RequestMapping(value = "/get_productos_main_page", method = RequestMethod.POST)
    def get_productos_main_page(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());

        if (seguridadService.ValidarTokenNoLogin(map.get("f_key").toString())) {

            String sql = "select p.f_idrecord,\n" +
                    "       p.f_descripcion,\n" +
                    "      encode(f.f_foto, 'base64') as f_foto,\n" +
                    "       coalesce(p.f_precio,0) as f_precio,\n" +
                    "       sum(de.f_cantidad)as f_cantidad,\n" +
                    "p.f_tax \n"+
                    "from\n" +
                    " t_productos as p inner join t_detalle_factura as de on de.f_idproducto = p.f_idrecord\n" +
                    "left join t_productos_fotos as f\n" +
                    "on p.f_idrecord = f.f_idproducto where f_cantidad is not null and p.f_idempresa = ? \n" +
                    " group by p.f_idrecord, f_foto, p.f_descripcion, p.f_tax order by f_cantidad desc limit 15";
            Object[] parametros = [
                    tupla.get("f_idempresa").toString().toLong()
            ];
            List list = sqlService.GetQuery(sql, parametros);
            return funciones.convertir('1', list);

        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE');
        }
    }

    @RequestMapping(value = "/Buscar_lista_estados", method = RequestMethod.POST)
    def Buscar_lista_estados(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());

        if (seguridadService.ValidarToken(map.get("f_key").toString())){
            String sql = "";

            if (tupla.get("f_usa").toString().toBoolean()){
                sql = "select * from movil.t_estados_usa limit 51"
            }else{
                sql = "select * from movil.t_estados_usa as e where e.f_siglas = 'RD'";
            }

             List list = sqlService.GetQuery(sql);

            return   funciones.convertir('1', list);
        }
        else{
            return   funciones.convertir('-2', 'NONE');
        }


    }

}
