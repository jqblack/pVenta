package com.example.demo.controladores

import com.example.demo.FuncionesGenrales.Funciones
import com.example.demo.Servicios.SeguridadService
import com.example.demo.Servicios.SqlServices
import com.example.demo.Servicios.WsService
import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = "/cxc")
class Cxc {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    def test()
    {
        1.upto(10){println it.toString();}
        return "Hola mundo";
    }


    @Autowired
    SqlServices sqlServices;
    @Autowired
    SeguridadService seguridadService
    @Autowired
    WsService wsService;



    def Boolean chekToken(String token) {
        Object []  params = [token] as Object
        Map login = sqlServices.getQueryMap("select * from web.t_login b where b.f_token = ?",params);
        if (!login.isEmpty())
            return true;
        else
            return false;
    }

    def String convertir(String key, String data) {
        String json = "{'f_key':'$key','f_data':$data}";
        return json;
    }



    @RequestMapping(value = "/get_cuentas_por_cobrar_clientes",method = RequestMethod.POST)
    def get_cuentas_por_cobrar_clientes(@RequestParam(value = "dato") String dato) {
        JsonSlurper jsonSlurper = new JsonSlurper();
        def decodificado = new String(dato.toString().decodeBase64());
        def string = new String(decodificado);
        def json = jsonSlurper.parseText(string);
        Funciones funciones = new Funciones();
        if (chekToken(json.getAt("f_key").toString())) {
            def tupla = json.getAt("f_data");
            Object [] params = [json.f_key.toString()] as Object;
            Map login = sqlServices.getQueryMap("select * from web.t_login b where b.f_token = ? ",params)
            params = [login.f_idempresa.toString().toLong()]
            Map emp = sqlServices.getQueryMap("select * from cfg.t_empresas b where b.f_idrecord = ?",params);
            if (!emp.isEmpty()) {
                params = [login.f_usuario.toString(),emp.f_idrecord.toString().toLong()] as Object;
                Map user = sqlServices.getQueryMap("select * from t_usuarios as b where b.f_username = ? and b.f_idempresa = ?",params);
                if (!user.isEmpty()) {
                    List list_cliente = wsService.ListarClientesById(emp.f_idrecord.toString(),tupla.getAt("f_idrecord").toString());
                    List list_cuentas = wsService.ListaCuentasPorCobrar(emp.f_idrecord.toString(),tupla.getAt("f_idrecord").toString());
                    String[] campos = ["f_cliente","f_cuentas"];
                    String[] valore = [(JsonOutput.toJson(list_cliente)).toString(), (JsonOutput.toJson(list_cuentas)).toString()];
                    /** impresion**/
                    return convertir('1', funciones.crearJSON(campos, valore)).replace("'", '"').replace('"[', '[').replace(']"', ']');
                } else {
                    /** usuario desactivado */
                    return convertir('-2', 'NONE').replace("'", '"');
                }
            } else {
                /** empresa desactivada o no existe */
                return convertir('-1', 'NONE').replace("'", '"')
            }
        } else {
            return convertir('-4', 'NONE').replace("'", '"')
        }
    }

    @RequestMapping(value = "/set_salvar_otra_cuenta_por_cobrar",method = RequestMethod.POST)
    def set_salvar_otra_cuenta_por_cobrar(@RequestParam(value = "dato") String dato) {
        JsonSlurper jsonSlurper = new JsonSlurper();
        def decodificado = new String(dato.toString().decodeBase64());
        def string = new String(decodificado);
        def json = jsonSlurper.parseText(string);
        Funciones funciones = new Funciones();
        if (chekToken(json.getAt("f_key").toString())) {
            def tupla = json.getAt("f_data");
            Object [] params = [json.f_key.toString()] as Object;
            Map login = sqlServices.getQueryMap("select * from web.t_login b where b.f_token = ? ",params)
            params = [login.f_idempresa.toString().toLong()]
            Map emp = sqlServices.getQueryMap("select * from cfg.t_empresas b where b.f_idrecord = ?",params);
            if (!emp.isEmpty()) {
                params = [login.f_usuario.toString(),emp.f_idrecord.toString().toLong()] as Object;
                Map user = sqlServices.getQueryMap("select * from t_usuarios as b where b.f_username = ? and b.f_idempresa = ?",params);
                if (!user.isEmpty()) {
                    Map map = tupla.getAt("f_cuenta_por_cobrar") as Map;
                    Date fecha = new Date(map.getAt("f_fecha_vencimiento").toString());
                    String id =  wsService.crearOtrasCuentasPorCobrar(
                            map.getAt("f_idcliente").toString().toLong(),
                            emp.f_idrecord.toString().toLong(),
                            map.getAt("f_numero_externo").toString(),
                            fecha,
                            map.getAt("f_concepto").toString(),
                            map.getAt("f_total").toString().toBigDecimal(),
                            user.f_idrecord.toString().toLong()
                    );

                    return convertir('1', '"true-'+id+'"').replace("'", '"')
                } else {
                    /** usuario desactivado */
                    return convertir('-2', 'NONE').replace("'", '"');
                }
            } else {
                /** empresa desactivada o no existe */
                return convertir('-1', 'NONE').replace("'", '"')
            }
        } else {
            return convertir('-4', 'NONE').replace("'", '"')
        }
    }



    @RequestMapping(value = "/get_imprimir_cuenta_cobrar",method = RequestMethod.POST)
    def get_imprimir_cuenta_cobrar(@RequestParam(value = "dato") String dato) {
        JsonSlurper jsonSlurper = new JsonSlurper();
        def decodificado = new String(dato.toString().decodeBase64());
        def string = new String(decodificado);
        def json = jsonSlurper.parseText(string);
        Funciones funciones = new Funciones();
        if (chekToken(json.getAt("f_key").toString())) {
            def tupla = json.getAt("f_data");
            Object [] params = [json.f_key.toString()] as Object;
            Map login = sqlServices.getQueryMap("select * from web.t_login b where b.f_token = ? ",params)
            params = [login.f_idempresa.toString().toLong()]
            Map emp = sqlServices.getQueryMap("select * from cfg.t_empresas b where b.f_idrecord = ?",params);
            if (!emp.isEmpty()) {
                params = [login.f_usuario.toString(),emp.f_idrecord.toString().toLong()] as Object;
                Map user = sqlServices.getQueryMap("select * from t_usuarios as b where b.f_username = ? and b.f_idempresa = ?",params);
                if (!user.isEmpty()) {
                    List list = wsService.ListarImprimirCuentaCobrar(tupla.getAt("f_idrecord").toString(),emp.f_idrecord.toString());
                    return convertir('1', (JsonOutput.toJson(list)).toString()).replace("'", '"');
                } else {
                    /** usuario desactivado */
                    return convertir('-2', 'NONE').replace("'", '"');
                }
            } else {
                /** empresa desactivada o no existe */
                return convertir('-1', 'NONE').replace("'", '"')
            }
        } else {
            return convertir('-4', 'NONE').replace("'", '"')
        }

    }


    @RequestMapping(value = "/set_salvar_recibo",method = RequestMethod.POST)
    def set_salvar_recibo(@RequestParam(value = "dato") String dato) {
        JsonSlurper jsonSlurper = new JsonSlurper();
        def decodificado = new String(dato.toString().decodeBase64());
        def string = new String(decodificado);
        def json = jsonSlurper.parseText(string);
        Funciones funciones = new Funciones();
        if (chekToken(json.getAt("f_key").toString())) {
            def tupla = json.getAt("f_data");
            Object [] params = [json.f_key.toString()] as Object;
            Map login = sqlServices.getQueryMap("select * from web.t_login b where b.f_token = ? ",params)
            params = [login.f_idempresa.toString().toLong()]
            Map emp = sqlServices.getQueryMap("select * from cfg.t_empresas b where b.f_idrecord = ?",params);
            if (!emp.isEmpty()) {
                params = [login.f_usuario.toString(),emp.f_idrecord.toString().toLong()] as Object;
                Map user = sqlServices.getQueryMap("select * from t_usuarios as b where b.f_username = ? and b.f_idempresa = ?",params);
                if (!user.isEmpty()) {
                    def map = tupla.getAt("f_recibo") as Map;
                    List<Map<String,Object>> list = map.getAt("f_detalle") as List;
                    String id =  wsService.crearRecibos(
                            map.getAt("f_idcliente").toString().toLong(),
                            emp.f_idrecord.toString().toLong(),
                            map.getAt("f_aplicado").toString(),
                            sqlServices.GetNow(),
                            map.getAt("f_concepto").toString(),
                            map.getAt("f_total").toString().toDouble(),
                            list,
                            user.f_idrecord.toString().toLong()
                    );
                    return convertir('1', '"true-'+id+'"').replace("'", '"')
                } else {
                    /** usuario desactivado */
                    return convertir('-2', 'NONE').replace("'", '"');
                }
            } else {
                /** empresa desactivada o no existe */
                return convertir('-1', 'NONE').replace("'", '"')
            }
        } else {
            return convertir('-4', 'NONE').replace("'", '"')
        }
    }



    @RequestMapping(value = "/get_imprimir_recibos",method = RequestMethod.POST)
    def get_imprimir_recibos(@RequestParam(value = "dato") String dato) {
        JsonSlurper jsonSlurper = new JsonSlurper();
        def decodificado = new String(dato.toString().decodeBase64());
        def string = new String(decodificado);
        def json = jsonSlurper.parseText(string);
        Funciones funciones = new Funciones();
        if (chekToken(json.getAt("f_key").toString())) {
            def tupla = json.getAt("f_data");
            Object [] params = [json.f_key.toString()] as Object;
            Map login = sqlServices.getQueryMap("select * from web.t_login b where b.f_token = ? ",params)
            params = [login.f_idempresa.toString().toLong()]
            Map emp = sqlServices.getQueryMap("select * from cfg.t_empresas b where b.f_idrecord = ?",params);
            if (!emp.isEmpty()) {
                params = [login.f_usuario.toString(),emp.f_idrecord.toString().toLong()] as Object;
                Map user = sqlServices.getQueryMap("select * from t_usuarios as b where b.f_username = ? and b.f_idempresa = ?",params);
                if (!user.isEmpty()) {
                    List list = wsService.ListarImprimirRecibo(tupla.getAt("f_idrecord").toString(),emp.f_idrecord.toString());
                    return convertir('1', (JsonOutput.toJson(list)).toString()).replace("'", '"');
                } else {
                    /** usuario desactivado */
                    return convertir('-2', 'NONE').replace("'", '"');
                }
            } else {
                /** empresa desactivada o no existe */
                return convertir('-1', 'NONE').replace("'", '"')
            }
        } else {
            return convertir('-4', 'NONE').replace("'", '"')
        }

    }



    @RequestMapping(value = "/get_cuentas_por_cobrar_balance",method = RequestMethod.POST)
    def get_cuentas_por_cobrar_balance(@RequestParam(value = "dato") String dato) {
        JsonSlurper jsonSlurper = new JsonSlurper();
        def decodificado = new String(dato.toString().decodeBase64());
        def string = new String(decodificado);
        def json = jsonSlurper.parseText(string);
        Funciones funciones = new Funciones();
        if (chekToken(json.getAt("f_key").toString())) {
            def tupla = json.getAt("f_data");
            Object [] params = [json.f_key.toString()] as Object;
            Map login = sqlServices.getQueryMap("select * from web.t_login b where b.f_token = ? ",params)
            params = [login.f_idempresa.toString().toLong()]
            Map emp = sqlServices.getQueryMap("select * from cfg.t_empresas b where b.f_idrecord = ?",params);
            if (!emp.isEmpty()) {
                params = [login.f_usuario.toString(),emp.f_idrecord.toString().toLong()] as Object;
                Map user = sqlServices.getQueryMap("select * from t_usuarios as b where b.f_username = ? and b.f_idempresa = ?",params);
                if (!user.isEmpty()) {
                    params = [tupla.getAt("f_idrecord").toString().toLong(),emp.f_idrecord.toString().toLong()] as Object
                    Map cobrar = sqlServices.getQueryMap("select * from cxc.t_cuenta_cobrar b where b.f_idrecord = ? and b.f_idempresa = ?;",params);
                    if (cobrar)
                    {
                        /** impresion**/
                        return convertir('1', cobrar.f_balance.toString()).replace("'", '"');
                    }else{
                        /** impresion**/
                        return convertir('1','NONE').replace("'", '"');
                    }
                } else {
                    /** usuario desactivado */
                    return convertir('-2', 'NONE').replace("'", '"');
                }
            } else {
                /** empresa desactivada o no existe */
                return convertir('-1', 'NONE').replace("'", '"')
            }
        } else {
            return convertir('-4', 'NONE').replace("'", '"')
        }
    }




    @RequestMapping(value = "/get_reimprimir_reicibos",method = RequestMethod.POST)
    def get_reimprimir_reicibos(@RequestParam(value = "dato") String dato) {
        JsonSlurper jsonSlurper = new JsonSlurper();
        def decodificado = new String(dato.toString().decodeBase64());
        def string = new String(decodificado);
        def json = jsonSlurper.parseText(string);
        Funciones funciones = new Funciones();
        if (chekToken(json.getAt("f_key").toString())) {
            def tupla = json.getAt("f_data");
            Object [] params = [json.f_key.toString()] as Object;
            Map login = sqlServices.getQueryMap("select * from web.t_login b where b.f_token = ? ",params)
            params = [login.f_idempresa.toString().toLong()]
            Map emp = sqlServices.getQueryMap("select * from cfg.t_empresas b where b.f_idrecord = ?",params);
            if (!emp.isEmpty()) {
                params = [login.f_usuario.toString(),emp.f_idrecord.toString().toLong()] as Object;
                Map user = sqlServices.getQueryMap("select * from t_usuarios as b where b.f_username = ? and b.f_idempresa = ?",params);
                if (!user.isEmpty()) {
                    List list = wsService.ListarReimprimirRecibos(emp.f_idrecord.toString(),tupla.getAt("f_desde").toString(),tupla.getAt("f_hasta").toString(),tupla.getAt("f_numero").toString());
                    /** impresion**/
                    return convertir('1', (JsonOutput.toJson(list)).toString()).replace("'", '"');
                } else {
                    /** usuario desactivado */
                    return convertir('-2', 'NONE').replace("'", '"');
                }
            } else {
                /** empresa desactivada o no existe */
                return convertir('-1', 'NONE').replace("'", '"')
            }
        } else {
            return convertir('-4', 'NONE').replace("'", '"')
        }
    }


}
