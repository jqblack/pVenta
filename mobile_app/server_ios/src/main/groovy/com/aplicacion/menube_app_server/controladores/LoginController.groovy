package com.aplicacion.menube_app_server.controladores

import com.aplicacion.menube_app_server.funciones.Funciones
import com.aplicacion.menube_app_server.servicios.ConfiguracionServices
import com.aplicacion.menube_app_server.servicios.SeguridadService
import com.aplicacion.menube_app_server.servicios.SqlService
import grails.converters.JSON
import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RequestMapping(value = "/login")
@RestController
class LoginController{

    @Autowired
    SeguridadService seguridadService
    @Autowired
    SqlService sqlService
    @Autowired
    ConfiguracionServices services

    Funciones funciones = new Funciones();
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    def test() {

        BigDecimal a = new BigDecimal("0.00");
        println(a.toString().length())
        def json = new JsonSlurper();

        String var = '[{"f_nombre":"HOLA MUNDO","f_apellido":"HOLA MUNDO 2"},{"f_nombre":"HOLA MUNDO","f_apellido":"HOLA MUNDO 2"}]';
        List map = json.parseText(var) ;
        return JsonOutput.toJson(map);

    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    def test1() {
        return funciones.encodeAsMD5("jQmS#2013@2019#@");
    }

    @RequestMapping(value = "/test1", method = RequestMethod.POST)
    def test1(@RequestParam(value = "valor")String valor,@RequestParam(value = "valor2")String valor2) {
        Map<String,Object> map = new HashMap<>();
        map.put("valor1",valor)
        map.put("valor2",valor2)
        List<Map<String,Object>>list = new ArrayList<Map<String,Object>>();
        list.add(map);
        list.add(map);
        String[] campos = ["f_nombre"];
        String[] valore = [funciones.ListToJson(list)]
        return funciones.convertir("token", funciones.crearJSON(campos, valore)).replace("'", '"').replace('"[', '[').replace(']"', ']');
    }

    @Transactional
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    def login(@RequestParam(name = "json") String dato) {

        String dato1 = new String(dato.decodeBase64());

        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
            List<Map<String, Object>> list = new ArrayList<>()
            seguridadService.GetEliminarSessionesUsuario(tupla.get("f_usuario").toString());
            list = seguridadService.GetLogin(tupla.get("f_usuario").toString(), tupla.get("f_contrasena").toString());
            if (list.size() > 0) {

                String token = funciones.encodeAsMD5 (tupla.get("f_usuario").toString() + (new Date()).toString())
                Map map_usuario = list.first();
                seguridadService.InsertarLogin(
                        token,
                        map_usuario.get("f_email").toString(),
                        0,
                        tupla.get("f_modelo").toString(),
                        tupla.get("f_banda").toString(),
                        tupla.get("f_operadora").toString(),
                        tupla.get("f_tamano").toString().toBigDecimal(),
                        tupla.get("f_imei").toString(),
                        map_usuario.get("f_idrecord").toString().toLong()
                );

                List lista_lugares_favoritos = services.ListarSitiosFavoritos(map_usuario.get("f_idrecord").toString().toLong());

                String [] campos = [
                        "f_idrecord",
                        "f_nombre",
                        "f_latitud",
                        "f_longitud",
                        "f_lugares_favoritos"
                ]
                String [] valores = [
                        map_usuario.get("f_idrecord").toString(),
                        map_usuario.get("f_nombre").toString(),
                        map_usuario.get("f_latitud").toString(),
                        map_usuario.get("f_longitud").toString(),
                        funciones.ListToJson(lista_lugares_favoritos)
                ]
                return funciones.convertir(token, funciones.crearJSON(campos, valores)).replace("'", '"').replace('"[', '[').replace(']"', ']');
            } else {
                /*******Usuario Desactivado*/
                funciones.convertir('-1', '"NONE"').replace("'", '"');
            }

    }
    @RequestMapping(value = "/get_negocios", method = RequestMethod.POST)
    def get_negocios(@RequestParam(name = "json") String dato)  {

        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {
            String latitud =  tupla.get("f_latitud").toString();
            String longitud =  tupla.get("f_longitud").toString();
            /***************LISTAMOS TODAS LAS EMPRESA EN UN RANGO ESPECIFICO******************/
            List list = seguridadService.ListarEmpresasLogin();
            List<Map<String,Object>> lista_empresas = new ArrayList<>();
            list.each { e ->
                Map<String,Object> map_empresas = new HashMap<>();
                BigDecimal distancia = funciones.distanciaCoord(latitud.toDouble(),longitud.toDouble(),e.get("f_latitud").toString().toDouble(),e.get("f_longitud").toString().toDouble())
                if (distancia <= e.get("f_distancia_delibery").toString().toDouble())
                {
                    map_empresas.put("f_idrecord",e.get("f_idrecord").toString());
                    map_empresas.put("f_nombre",e.get("f_nombre").toString());
                    map_empresas.put("f_header",e.get("f_header").toString().getBytes().encodeBase64().toString());
                    map_empresas.put("f_telefono",e.get("f_telefono").toString());
                    map_empresas.put("f_direccion",e.get("f_direccion").toString().getBytes().encodeBase64().toString());
                    map_empresas.put("f_tipo_negocio",e.get("f_tipo_negocio").toString());
                    map_empresas.put("f_pedidos_minimos",e.get("f_pedidos_minimos").toString().toString());
                    map_empresas.put("f_horario_1",e.get("f_horario_1").toString());//Domingo
                    map_empresas.put("f_horario_2",e.get("f_horario_2").toString());//Lunes
                    map_empresas.put("f_horario_3",e.get("f_horario_3").toString());//Martes
                    map_empresas.put("f_horario_4",e.get("f_horario_4").toString());//Miercoles
                    map_empresas.put("f_horario_5",e.get("f_horario_5").toString());//Jueves
                    map_empresas.put("f_horario_6",e.get("f_horario_6").toString());//Viernes
                    map_empresas.put("f_horario_7",e.get("f_horario_7").toString());//Sabado
                    map_empresas.put("f_correo",e.get("f_email").toString());
                    map_empresas.put("f_lema",e.get("f_lema").toString().getBytes().encodeBase64().toString());
                    lista_empresas.add(map_empresas);
                }
            }
            return funciones.convertir('1',(funciones.ListToJson(lista_empresas))).replace("'", '"').replace('"[', '[').replace(']"', ']');
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', '"NONE"').replace("'", '"');
        }
    }
    @RequestMapping(value = "/get_imagen_empresa_by_id", method = RequestMethod.POST)
    def get_imagen_empresa_by_id(@RequestParam(name = "json") String dato)  {

        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarToken(map.get("f_key").toString())) {

            def file = File.createTempFile("imagen","jpg");
            String sql = "Select  b.f_foto as f_foto from cfg.t_empresas as b where b.f_idrecord = ? ";
            Object [] parametros = [tupla.get("f_idempresa").toString().toLong()] as Object;
            List list = sqlService.GetQuery(sql,parametros);
            if (list.size()>0)
            {
                file.setBytes(list.first().get("f_foto"));
            }
            /******************APLICAMOS LA REDUCCION DE LA IMAGEN***************/
            byte[] imagen  = funciones.ReducirAumentarImagen(file,300,300);
            file.delete();
            return funciones.convertir('1',"'"+imagen.encodeBase64().toString()+"'").replace("'", '"').replace('"[', '[').replace(']"', ']');
        } else {
            /*******Usuario Desactivado*/
            funciones.convertir('-2', '"NONE"').replace("'", '"');
        }
    }

    @Transactional
    @RequestMapping(value = "/set_registrar_usuario", method = RequestMethod.POST)
    def set_registrar_usuario(@RequestParam(name = "json") String dato) {

        String dato1 = new String(dato.decodeBase64());

        Map map = JSON.parse(dato1);
//        println dato
        Map tupla = JSON.parse(map.get("f_data").toString());
        List<Map<String, Object>> list = new ArrayList<>()
        list = seguridadService.GetValidarUsuarioExistente(tupla.get("f_usuario").toString());
        if (list.size() <= 0) {

         String token = funciones.encodeAsMD5 (tupla.get("f_usuario").toString() + (new Date()).toString());
         String latitud =  tupla.get("f_latitud").toString();
         String longitud =  tupla.get("f_longitud").toString();

          Map<String,Object> map_usuario = seguridadService.InsertarNuevoUsuario(
                    tupla.get("f_idrecord").toString(),
                    tupla.get("f_nombre").toString(),
                    tupla.get("f_telefono").toString(),
                    tupla.get("f_direccion").toString(),
                    tupla.get("f_usuario").toString(),
                    tupla.get("f_password").toString(),
                    tupla.get("f_latitud").toString(),
                    tupla.get("f_longitud").toString()
            ).first();
            /*************************INSERTAMOS EL LOGIN INMEDIATO*******************************/
            seguridadService.InsertarLogin(
                    token,
                    tupla.get("f_usuario").toString(),
                    0,
                    tupla.get("f_modelo").toString(),
                    tupla.get("f_banda").toString(),
                    tupla.get("f_operadora").toString(),
                    tupla.get("f_tamano").toString().toBigDecimal(),
                    tupla.get("f_imei").toString(),
                    map_usuario.get("f_idrecord").toString().toLong()
            );
            List list_empresas = seguridadService.ListarEmpresasLogin();
            List<Map<String,Object>> lista_empresas_final = new ArrayList<>();
            list_empresas.each { e ->
                Map<String, Object> map_empresas = new HashMap<>();
                BigDecimal distancia = funciones.distanciaCoord(latitud.toDouble(), longitud.toDouble(), e.get("f_latitud").toString().toDouble(), e.get("f_longitud").toString().toDouble())
                if (distancia <= e.get("f_distancia_delibery").toString().toDouble()) {
                    map_empresas.put("f_idrecord", e.get("f_idrecord").toString());
                    map_empresas.put("f_nombre", e.get("f_nombre").toString());
                    map_empresas.put("f_header", e.get("f_header").toString().getBytes().encodeBase64().toString());
                    map_empresas.put("f_telefono", e.get("f_telefono").toString());
                    map_empresas.put("f_direccion", e.get("f_direccion").toString().getBytes().encodeBase64().toString());
                    map_empresas.put("f_tipo_negocio", e.get("f_tipo_negocio").toString());
                    map_empresas.put("f_pedidos_minimos", e.get("f_pedidos_minimos").toString().toString());
                    map_empresas.put("f_horario_1", e.get("f_horario_1").toString());//Domingo
                    map_empresas.put("f_horario_2", e.get("f_horario_2").toString());//Lunes
                    map_empresas.put("f_horario_3", e.get("f_horario_3").toString());//Martes
                    map_empresas.put("f_horario_4", e.get("f_horario_4").toString());//Miercoles
                    map_empresas.put("f_horario_5", e.get("f_horario_5").toString());//Jueves
                    map_empresas.put("f_horario_6", e.get("f_horario_6").toString());//Viernes
                    map_empresas.put("f_horario_7", e.get("f_horario_7").toString());//Sabado
                    map_empresas.put("f_correo", e.get("f_email").toString());
                    map_empresas.put("f_lema", e.get("f_lema").toString().getBytes().encodeBase64().toString());
                    lista_empresas_final.add(map_empresas);
                }
            }
            String [] campos = [
                    "f_idrecord",
                    "f_nombre",
                    "f_latitud",
                    "f_longitud",
                    "f_empresas"
            ]
            String [] valores = [
                    map_usuario.get("f_idrecord").toString(),
                    map_usuario.get("f_nombre").toString(),
                    map_usuario.get("f_latitud").toString(),
                    map_usuario.get("f_longitud").toString(),
                    funciones.ListToJson(lista_empresas_final)
            ]
            return funciones.convertir(token, funciones.crearJSON(campos, valores)).replace("'", '"').replace('"[', '[').replace(']"', ']');
        } else {
            /*******Usuario Existente*/
            funciones.convertir('-3', '"NONE"').replace("'", '"');
        }
    }

    @Transactional
    @RequestMapping(value = "/set_salvar_contactos",method = RequestMethod.POST)
    def set_salvar_contactos(@RequestParam(name = "json")String dato)
    {
        String dato1 = new String(dato.decodeBase64());
        Map map = JSON.parse(dato1);
        Map tupla = JSON.parse(map.get("f_data").toString());
        if (seguridadService.ValidarTokenNoLogin(map.get("f_key").toString())) {

            Map tlogin = seguridadService.GetLoginByToken(map.get("f_key").toString())
            Object [] parametros= [tlogin.get("f_usuario").toString()] as Object
            Map tusuario = sqlService.GetQueryMap("Select * from movil.t_usuarios_movil as b where b.f_email = ? ",parametros);

            if (!tusuario.isEmpty())
            {
                services.crearContactosClientes(tusuario.f_idrecord.toString().toLong(),tupla.f_agenda.toString());
                /**Usuario No encontrado en respuesta**/
                return funciones.convertir('1', "\"NONE\"").replace("'", '"');
            }else{
                /**Usuario No encontrado en respuesta**/
                return funciones.convertir('-4', '"NONE"').replace("'", '"');
            }
        } else {
            /**Usuario Desactivado**/
            return funciones.convertir('-2', '"NONE"').replace("'", '"');
        }
    }

}
