package com.aplicacion.menube_app_server.servicios

import com.aplicacion.menube_app_server.funciones.Funciones
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class SeguridadService {

    @Autowired
    SqlService sqlService;

    @Transactional
    def GetLogin(String usuario,String pass){
        String sql = "Select  * from movil.t_usuarios_movil as u where  u.f_email = ? and u.f_password = md5(?) and u.f_activo = ? limit 1;";
        Object [] parametros = [usuario,pass,true] as Object;
        return sqlService.GetQuery(sql,parametros);
    }

    @Transactional
    def GetValidarUsuarioExistente(String usuario){
        String sql = "Select  * from movil.t_usuarios_movil as u where  u.f_email = ? ;";
        Object [] parametros = [usuario] as Object;
        return sqlService.GetQuery(sql,parametros);
    }
    @Transactional
    def GetLoginByToken(String token){
        String sql = "Select  * from movil.t_login as u where  u.f_token = ? ;";
        Object [] parametros = [token] as Object;
        return sqlService.GetQueryMap(sql,parametros);
    }
    @Transactional
    def GetEliminarSessionesUsuario(String usuario){
        try {
            String sql = "update  movil.t_login  set f_activo = ? where  f_usuario = ?;";
            Object [] parametros = [false,usuario] as Object;
            sqlService.EjecutarQuery(sql,parametros);


            parametros= [usuario] as Object
            Map tusuario = sqlService.GetQueryMap("Select * from movil.t_usuarios_movil as b where b.f_email = ? ",parametros);
            sql = "UPDATE movil.t_factura_detalle_temporal set f_regresa_inventario = true where f_idusuario = ? ;";
            parametros = [tusuario.f_idrecord.toString().toLong()];
            sqlService.EjecutarQuery(sql,parametros);
            sql = " delete from movil.t_detalle_propiedades_temporal where f_idusuario = ?";
//            println(sql);
            parametros = [tusuario.f_idrecord.toString().toLong()];
            sqlService.EjecutarQuery(sql,parametros);

        }catch(Exception e)
        {
            println e.getMessage();
        }

    }

    @Transactional
    def GetEliminarDetallesUsuario(String usuario){
        try {
            Object [] parametros ;
            parametros= [usuario] as Object
            String sql ="";
            Map tusuario = sqlService.GetQueryMap("Select * from movil.t_usuarios_movil as b where b.f_email = ? ",parametros);
            sql = "UPDATE movil.t_factura_detalle_temporal set f_regresa_inventario = true where f_idusuario = ? ;";
            parametros = [tusuario.f_idrecord.toString().toLong()];
            sqlService.EjecutarQuery(sql,parametros);
            sql = " delete from movil.t_detalle_propiedades_temporal where f_idusuario = ?";
            parametros = [tusuario.f_idrecord.toString().toLong()];
            sqlService.EjecutarQuery(sql,parametros);

        }catch(Exception e)
        {
            println e.getMessage();
        }

    }

    @Transactional
    def ValidarTokenNoLogin(String token){

        Funciones funciones = new Funciones();
        if (funciones.encodeAsMD5("jQmS#2013@2019#@").equals(token))
            return true;
        else
            return false;
    }
    @Transactional
    def ValidarToken(String token){
        String sql = "select  * from movil.t_login as l where  l.f_token = ? and l.f_activo = ?;";
        Object [] parametros = [token,true] as Object;
        List list = sqlService.GetQuery(sql,parametros);

        if (list.size() > 0)
            return true;
        else
            return false;
    }
    @Transactional
    def InsertarLogin(String token,String  usuario,Long idempresa,String modelo,String banda,String operadora,BigDecimal tamano,String emei,Long idusuario){


        try {
            String sql = "INSERT INTO \n" +
                    "  movil.t_login\n" +
                    "(\n" +
                    "  f_usuario,\n" +
                    "  f_token,\n" +
                    "  f_fecha,\n" +
                    "  f_idempresa,\n" +
                    "  f_modelo,\n" +
                    "  f_banda,\n" +
                    "  f_operadora,\n" +
                    "  f_tamano,\n" +
                    "  f_imei,\n" +
                    "  f_activo,\n" +
                    "  f_fecha_ultima_session,\n" +
                    "  f_idusuario" +
                    "\n" +
                    ")\n" +
                    "VALUES (?,?,?,?,?,?,?,?,?,?,?,?);";

            Object [] parametros = [
                    usuario,
                    token,
                    sqlService.GetNow(),
                    idempresa,
                    modelo,
                    banda,
                    operadora,
                    tamano,
                    emei,
                    true,
                    sqlService.GetNow(),
                    idusuario
            ] as Object;

            sqlService.EjecutarQuery(sql,parametros);
        }catch(Exception e){

            println "Error Insertando el dato en la tabla login ==> " + e.getMessage();
        }
    }

    @Transactional
    def ListarEmpresasLogin(){
        String sql = "select   f_idrecord,\n" +
                "  f_nombre,\n" +
                "  f_header,\n" +
                "  f_web,\n" +
                "  f_header_facturas_pequenas,\n" +
                "  f_mensaje_factura,\n" +
                "  f_mensaje_orden,\n" +
                "  f_porciento_ley,\n" +
                "  f_tipo_papel_impresion,\n" +
                "  f_impuesto_incluido,\n" +
                "  f_latitud,\n" +
                "  f_longitud,\n" +
                "  f_distancia_delibery,\n" +
                "  f_telefono,\n" +
                "  f_tipo_negocio,\n" +
                "  f_pedidos_minimos,\n" +
                "  f_email,\n" +
                "  f_direccion,\n" +
                "  f_horario_1,\n" +
                "  f_horario_2,\n" +
                "  f_horario_3,\n" +
                "  f_horario_4,\n" +
                "  f_horario_5,\n" +
                "  f_horario_6,\n" +
                "  f_horario_7,\n" +
                "  f_lema from cfg.t_empresas  ";
        Object [] parametros = [] as Object;
        return sqlService.GetQuery(sql,parametros);
    }


    @Transactional
    def InsertarNuevoUsuario(String id,String nombre,String telefono,String direccion,String email,String pass,String latitud,String longitud){

        String sql = "";

        Object [] parametros;
        if (!id.equals(""))
        {
            sql = "UPDATE \n" +
                    "  movil.t_usuarios_movil \n" +
                    "SET \n" +
                    "  f_nombre = ?,\n" +
                    "  f_telefono = ?,\n" +
                    "  f_direccion = ?,\n" +
                    "  f_email = ?,\n" +
                    "  f_password = md5(?),\n" +
                    "  f_latitud = ?,\n" +
                    "  f_longitud = ?\n" +
                    "WHERE f_idrecord = ? RETURNING *\n" +
                    "; "
             parametros = [
                    nombre,
                    telefono,
                    direccion,
                    email,
                    pass,
                    latitud,
                    longitud,
                     id.toString().toLong()
            ] as Object;
        }else {

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
                    "VALUES (\n" +
                    "  ?,\n" +
                    "  ?,\n" +
                    "  ?,\n" +
                    "  ?,\n" +
                    "  md5(?),\n" +
                    "  ?,\n" +
                    "  ?,\n" +
                    "  ?\n" +
                    ") RETURNING *;"
            parametros = [
                    nombre,
                    telefono,
                    direccion,
                    email,
                    pass,
                    latitud,
                    longitud,
                    true
            ] as Object;

        }

        try {
            return sqlService.GetQuery(sql,parametros);
        }catch(Exception e){
            println "Error  Insertando o actualizando   un nuevo usuario  ==> " + e.getMessage();
        }

    }



}
