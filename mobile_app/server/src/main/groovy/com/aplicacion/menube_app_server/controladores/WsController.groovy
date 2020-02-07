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
            return funciones.convertir('1', (JsonOutput.toJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE').replace("'", '"');
        }
    }

    @RequestMapping(value = "/get_categorias_by_parametros", method = RequestMethod.POST)
    def get_categorias_by_parametros(@RequestParam(name = "json") String dato) {

        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {

            String sql = "select  * from t_productos_categorias as cat where  cat.f_idempresa = ? and cat.f_descripcion ilike  ? ";
            Object[] parametros = [tupla.get("f_idempresa").toString().toLong(), "%" + tupla.get("f_parametro").toString() + "%"];
            List list = sqlService.GetQuery(sql, parametros);
            return funciones.convertir('1', (funciones.ListToJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE').replace("'", '"');
        }
    }

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
            return funciones.convertir('1', (JsonOutput.toJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE').replace("'", '"');
        }
    }

    @RequestMapping(value = "/get_propiedades_by_producto", method = RequestMethod.POST)
    def get_propiedades_by_producto(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());

        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
            String sql = "select \n" +
                    "pr.*\n" +
                    "FROM t_productos_propiedades p\n" +
                    "INNER JOIN t_propiedades as pr on p.f_idpropiedad = pr.f_idrecord\n" +
                    "WHERE  p.f_idempresa = ? and p.f_idproducto = ? "
            Object[] parametros = [
                    tupla.get("f_idempresa").toString().toLong(),
                    tupla.get("f_idproducto").toString().toLong()
            ];
            List list = sqlService.GetQuery(sql, parametros);
            return funciones.convertir('1', (funciones.ListToJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE').replace("'", '"');
        }
    }


    @RequestMapping(value = "/get_lugares_favoritos", method = RequestMethod.POST)
    def get_lugares_favoritos(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());

        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
            Map<String, Object> map_login = seguridadService.GetLoginByToken(map.get("f_key").toString());
            List list = services.ListarSitiosFavoritos(map_login.get("f_idusuario").toString().toLong());
            return funciones.convertir('1', (funciones.ListToJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE').replace("'", '"');
        }
    }

    @RequestMapping(value = "/get_diez_productos_mas_vendidos", method = RequestMethod.POST)
    def get_diez_productos_mas_vendidos(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());

        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {

            String sql = "SELECT\n" +
                    "p.f_referencia,\n" +
                    "p.f_descripcion,\n" +
                    "cat.f_descripcion as f_categoria,\n" +
                    "coalesce(p.f_precio,0) as f_precio,\n" +
                    "coalesce(p.f_tax,0) as f_tax,\n" +
                    "sum(d.f_cantidad) as f_cantidad  \n" +
                    "from\n" +
                    "t_productos as p\n" +
                    "INNER JOIN t_detalle_factura as d on d.f_idproducto = p.f_idrecord\n" +
                    "INNER JOIN t_facturas as f on d.f_idfactura = f.f_idrecord\n" +
                    "INNER JOIN t_productos_categorias as cat on cat.f_idrecord = p.f_idcategoria\n" +
                    "WHERE p.f_idempresa = ? \n" +
                    " \n" +
                    "GROUP BY p.f_referencia,p.f_descripcion,f_categoria,p.f_precio \n" +
                    "ORDER BY f_cantidad DESC limit 10"
            Object[] parametros = [
                    tupla.get("f_idempresa").toString().toLong()
            ];
            List list = sqlService.GetQuery(sql, parametros);
            return funciones.convertir('1', (funciones.ListToJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE').replace("'", '"');
        }
    }

    @RequestMapping(value = "/get_productos_by_paramentros", method = RequestMethod.POST)
    def get_productos_by_paramentros(@RequestParam(name = "json") String dato) {
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
            return funciones.convertir('1', (JsonOutput.toJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE').replace("'", '"');
        }
    }

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
            return funciones.convertir('1', (funciones.ListToJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE').replace("'", '"');
        }
    }

    @RequestMapping(value = "/get_direcciones_usuario", method = RequestMethod.POST)
    def get_direcciones_usuario(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {

            Map tlogin = seguridadService.GetLoginByToken(map.get("f_key").toString())
            Object[] parametros = [tlogin.get("f_usuario").toString()] as Object
            Map tusuario = sqlService.GetQueryMap("Select * from movil.t_usuarios_movil as b where b.f_email = ? ", parametros);
            String sql = "select d.f_idrecord,d.f_principal,d.f_fecha::timestamp,encode(d.f_direccion::bytea,'base64') as f_direccion from movil.t_direcciones_usuarios as d where d.f_idusuario = ? ";
            parametros = [
                    tusuario.f_idrecord.toString().toLong()
            ];
            List list = sqlService.GetQuery(sql, parametros);
            return funciones.convertir('1', (funciones.ListToJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE').replace("'", '"');
        }
    }

    @RequestMapping(value = "/set_salvar_direcciones_usuario", method = RequestMethod.POST)
    def set_salvar_direccione_usuario(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
            Map tlogin = seguridadService.GetLoginByToken(map.get("f_key").toString())
            Object[] parametros = [tlogin.get("f_usuario").toString()] as Object
            Map tusuario = sqlService.GetQueryMap("Select * from movil.t_usuarios_movil as b where b.f_email = ? ", parametros);
            services.InsertarDireccion(tupla.f_idrecord.toString(), new String(tupla.f_direccion.toString().decodeBase64()), tusuario.f_idrecord.toString().toLong(), tupla.f_principal.toString().toBoolean());
            funciones.convertir('1', 'TRUE').replace("'", '"');
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE').replace("'", '"');
        }
    }

    @RequestMapping(value = "/set_salvar_usuario", method = RequestMethod.POST)
    def set_salvar_usuario(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());

        Object[] parametros = [tupla.get("f_email").toString()] as Object
        String sql = "Select b.* from movil.t_usuarios_movil as b where b.f_email = ? ";
        Map tusuario = sqlService.GetQueryMap(sql, parametros);
        if (!tusuario.isEmpty()){
            return   funciones.convertir('-3', 'TRUE').replace("'", '"');
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
            return   funciones.convertir('1', 'TRUE').replace("'", '"');
        }

    }

    @RequestMapping(value = "/get_productos_main_page", method = RequestMethod.POST)
    def get_productos_main_page(@RequestParam(name = "json") String dato) {
        String dato1 = new String(dato.decodeBase64());

        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {

            String sql = "SELECT\n" +
                    "p.f_idrecord,\n" +
                    "p.f_referencia,\n" +
                    "p.f_descripcion,\n" +
                    "cat.f_descripcion as f_categoria,\n" +
                    "coalesce(p.f_precio,0) as f_precio,\n" +
                    "coalesce(p.f_tax,0) as f_tax\n" +
                    "from\n" +
                    "t_productos as p\n" +
                    "INNER JOIN t_productos_categorias as cat on cat.f_idrecord = p.f_idcategoria\n" +
                    "WHERE p.f_idempresa = ? and p.f_main_page = true\n" +
                    " \n" +
                    "ORDER BY f_descripcion Asc "
            Object[] parametros = [
                    tupla.get("f_idempresa").toString().toLong()
            ];
            List list = sqlService.GetQuery(sql, parametros);
            return funciones.convertir('1', (funciones.ListToJson(list))).replace("'", '"').replace('"[', '[').replace(']"', ']');
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', 'NONE').replace("'", '"');
        }
    }
}
