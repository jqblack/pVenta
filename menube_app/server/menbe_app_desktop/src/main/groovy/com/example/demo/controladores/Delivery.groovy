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
@RequestMapping(value = "/delivery")
class Delivery {

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


    @RequestMapping(value = "/get_productos_by_id",method = RequestMethod.POST)
    def get_productos_by_id(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarProductosPorId(emp.f_idrecord.toString(), tupla.getAt("f_idproducto").toString(), tupla.getAt("f_idarea").toString());
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


    @RequestMapping(value = "/get_direcciones_clientes",method = RequestMethod.POST)
    def get_direcciones_clientes(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarDireccioneClientes(tupla.getAt("f_telefono").toString(),emp.f_idrecord.toString());
                    String[] campos = ["f_detalles"];
                    String[] valore = [(JsonOutput.toJson(list)).toString()];
                    /** impresion**/
                    return convertir('1', funciones.crearJSON(campos, valore)).replace("'", '"').replace('"[', '[').replace(']"', ']');
//                    render convertir('1', (list as JSON).toString()).replace("'", '"');
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


    @RequestMapping(value = "/set_salvar_orden_delivery",method = RequestMethod.POST)
    def set_salvar_orden_delivery(@RequestParam(value = "dato") String dato) {
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

                    def factura = tupla.getAt("f_factura");
                    List  detalle = factura.getAt("f_detalle") as List
                    wsService.crearOrdenDelibery(
                            factura.getAt("f_idfactura").toString(),
                            factura.getAt("f_idcliente").toString().toLong(),
                            factura.getAt("f_itbis").toString().toBigDecimal(),
                            factura.getAt("f_sub_total").toString().toBigDecimal(),
                            factura.getAt("f_total").toString().toBigDecimal(),
                            factura.getAt("f_total_extras").toString().toBigDecimal(),
                            detalle,
                            factura.getAt("f_nota").toString(),
                            factura.getAt("f_tipo_ncf").toString().toLong(),
                            emp.f_idrecord.toString().toLong(),
                            user.f_idrecord.toString().toLong(),
                            factura.getAt("f_direccion").toString()
                    );
                    return convertir('1', "true").replace("'", '"');;
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


    @RequestMapping(value = "/set_facturar_roden_delivery",method = RequestMethod.POST)
    def set_facturar_roden_delivery(@RequestParam(value = "dato") String dato) {
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
                    def valor =  wsService.FacturarOrden(
                            tupla.getAt("f_idrecord").toString().toLong(),
                            emp.f_idrecord.toString().toLong(),
                            user.f_idrecord.toString().toLong(),
                            emp.f_precio_envio?emp.f_precio_envio.toString().toBigDecimal():0.00.toBigDecimal()
                    );
                    return convertir('1', "'$valor'").replace("'", '"');
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


    @RequestMapping(value = "/get_imprimir_factura_delivery_by_id",method = RequestMethod.POST)
    def get_imprimir_factura_delivery_by_id(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarFacturaDeliveryReimprimirById(emp.f_idrecord.toString().toLong().toString(),tupla.getAt("f_idrecord").toString(),tupla.getAt("f_abierta").toString().toBoolean());
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


    @RequestMapping(value = "/get_sectores",method = RequestMethod.POST)
    def get_sectores(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarSectores(emp.f_idrecord.toString());
                    String[] campos = ["f_detalles"];
                    String[] valore = [(JsonOutput.toJson(list)).toString()];
                    /** impresion**/
                    return convertir('1', funciones.crearJSON(campos, valore)).replace("'", '"').replace('"[', '[').replace(']"', ']');
//                    render convertir('1', (list as JSON).toString()).replace("'", '"');
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


    @RequestMapping(value = "/set_salvar_clientes_delivery",method = RequestMethod.POST)
    def set_salvar_clientes_delivery(@RequestParam(value = "dato") String dato) {
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
                    wsService.crearClienteDelibery(
                            "",
                            tupla.getAt("f_nombre").toString(),
                            tupla.getAt("f_direccion").toString(),
                            tupla.getAt("f_sector").toString(),
                            tupla.getAt("f_telefono").toString(),
                            emp.f_idrecord as Long,
                            tupla.getAt("f_idcliente") as Long,
                            tupla.getAt("f_principal") as Boolean
                    );
                    return convertir('1', "true").replace("'", '"');;
                   //                    render convertir('1', (list as JSON).toString()).replace("'", '"');
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


    @RequestMapping(value = "/get_clientes_by_telefono",method = RequestMethod.POST)
    def get_clientes_by_telefono(@RequestParam(value = "dato") String dato) {
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
                    Map list = wsService.get_clientes_by_telefono(tupla.getAt("f_telefono").toString(), emp.f_idrecord.toString().toLong());
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
