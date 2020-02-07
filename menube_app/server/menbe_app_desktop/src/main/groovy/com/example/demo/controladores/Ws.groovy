package com.example.demo.controladores

import com.example.demo.DemoApplication
import com.example.demo.FuncionesGenrales.Funciones
import com.example.demo.Servicios.SeguridadService
import com.example.demo.Servicios.SqlServices
import com.example.demo.Servicios.WsService
import grails.converters.JSON
import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = "/ws")
class Ws {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    def test()
    {
        return "Hola mundo como estas";
    }

//    @RequestMapping(value = "restart")
//    def restart(){
//        DemoApplication.restart();
//    }


    @Autowired
    SqlServices sqlServices;
    @Autowired
    SeguridadService seguridadService
    @Autowired
    WsService wsService;



    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    def logout(@RequestParam(value = "dato") String dato) {
        JsonSlurper jsonSlurper = new JsonSlurper();
        def decodificado = new String(dato.toString().decodeBase64());
        def string = new String(decodificado);
        def json = jsonSlurper.parseText(string);
//        if (chekToken(json.getAt("f_key").toString())) {
            String token = json.getAt("f_key").toString();
            Object []  params = [token] as Object
            Map login = sqlServices.getQueryMap("select * from web.t_login b where b.f_token = ?",params);
            if (!login.isEmpty()) {
                String sql = "Update web.t_login set f_activo = ? where  f_token = ? ";
                params = [false,token] as Object;
                sqlServices.ejecutarQuery(sql,params)
                return convertir('OK', "'OK'").replace("'", '"');
            } else{
                /** empresa desactivada o no existe */
                return convertir('-1', 'NONE').replace("'", '"')
            }
//        }
    }

    def Boolean chekToken(String token) {
//        Map login = Tlogin.findByFToken(token);
        Object []  params = [token] as Object
        Map login = sqlServices.getQueryMap("select * from web.t_login b where b.f_token = ? and b.f_activo = true",params);
        if (!login.isEmpty())
            return true;
        else
            return false;
    }

    def String convertir(String key, String data) {
        String json = "{'f_key':'$key','f_data':$data}";
        return json;
    }






    @RequestMapping(value = "/login_punto_venta",method = RequestMethod.POST)
    def login_punto_venta(@RequestParam(value = "dato") String dato) {
        JsonSlurper jsonSlurper = new JsonSlurper();
        def decodificado = new String(dato.toString().decodeBase64());
        def string = new String(decodificado);
        def json = jsonSlurper.parseText(string);
        Funciones funciones = new Funciones()
        def data = json.getAt("f_data");
        Map tupla = data;
        Object [] params = [tupla.getAt("f_empresa").toString().toLong()] as Object;
        Map emp = sqlServices.getQueryMap("SELECT  * from cfg.t_empresas b where  b.f_idrecord = ?",params)
        if (emp) {

            List list = seguridadService.getUsuariosPuntoVenta(tupla.getAt("f_usuario").toString(), tupla.getAt("f_contrasena").toString(), tupla.getAt("f_empresa").toString().toInteger());
            if (list.size() > 0) {
                Map user = list.first();
//                List<Tlogin> login_existente = Tlogin.findAllByFIdempresaAndFUsuarioAndFActivo(emp.id, user.fusername, true);
                params=[emp.f_idrecord.toString().toLong(),user.f_username.toString(),true] as Object
                List login_existente = sqlServices.getQuery("select * from web.t_login as b where b.f_idempresa = ? and b.f_usuario = ? and b.f_activo = ? ",params);


                if (login_existente.size() > 0 ) {
                    if ( login_existente.first().f_imei.toString().equals(tupla.getAt("f_imei").toString()) && login_existente.first().f_usuario.toString().equals(user.f_username.toString())){
                        /**Existe un usuario logueado */
//                        login_existente.first().setfFechaUltimaSession(sqlService.GetNow());
                        params = [login_existente.first().f_idrecord.toString().toLong()] as Object
                        sqlServices.ejecutarQuery("Update web.t_login set f_fecha_ultima_session = now() where  f_idrecord = ?",params);
                        return funciones.convertir('-3', '"NONE"').replace("'", '"');
                    }

                } else {

                    String token = funciones.encodeAsMD5((user.f_username.toString() + (new Date()).toString()));

                    /** Registro de la tabla de login con el token generado**/

                    seguridadService.InsertarLogin(
                            token,
                            user.f_username.toString(),
                            tupla.f_empresa.toString().toLong(),
                            tupla.getAt("f_modelo").toString(),
                            tupla.getAt("f_banda").toString(),
                            tupla.getAt("f_fOperadora").toString(),
                            tupla.getAt("f_tamano").toString().toBigDecimal(),
                            tupla.getAt("f_imei").toString()
                    );

                    String[] campos = [
                            "f_idrecord",
                            "f_nombre",
                            "f_porciento_ley",
                            "f_impuesto_incluido",
                            "f_tipo_usuario_punto_venta",
                            "f_solo_mesa",
                            "f_area",
                            "f_mesa"
                    ];
                    String[] valore = [
                            "${user.f_idrecord.toString()}",
                            user.f_nombre.toString() + " " + user.f_apellido.toString(),
                            emp.f_porciento_ley.toString().toBigDecimal(),
                            emp.f_impuesto_incluido,
                            user.f_tipo_usuario_punto_venta,
                            true,
                            0,
                            0
                    ];

                    /** impresion**/

                    return funciones.convertir(token, funciones.crearJSON(campos, valore)).replace("'", '"').replace('"[', '[').replace(']"', ']');

                }

            } else {
                /** usuario desactivado */
                return funciones.convertir('-2', 'NONE').replace("'", '"');
            }
        } else {
            /** empresa desactivada o no existe */
            return funciones.convertir('-1', 'NONE').replace("'", '"')
        }

    }


    @RequestMapping(value = "/get_categorias_productos",method = RequestMethod.POST)
    def get_categorias_productos(@RequestParam(value = "dato") String dato) {
        JsonSlurper jsonSlurper = new JsonSlurper();
        def decodificado = new String(dato.toString().decodeBase64());
        def string = new String(decodificado);
        def json = jsonSlurper.parseText(string);
        Funciones funciones = new Funciones();

        if (chekToken(json.getAt("f_key").toString())) {
            def data = json.getAt("f_data");
            def tupla =data;
            Object [] params = [json.f_key.toString()] as Object;
            Map login = sqlServices.getQueryMap("select * from web.t_login b where b.f_token = ? ",params)
            params = [login.f_idempresa.toString().toLong()]
            Map emp = sqlServices.getQueryMap("select * from cfg.t_empresas b where b.f_idrecord = ?",params);
            if (!emp.isEmpty()) {
//                TUsuarios user = TUsuarios.findByFusernameAndFidempresa(login.fUsuario, emp);
                params = [login.f_usuario.toString(),emp.f_idrecord.toString().toLong()] as Object;
                Map user = sqlServices.getQueryMap("select * from t_usuarios as b where b.f_username = ? and b.f_idempresa = ?",params);
                if (!user.isEmpty()) {
                    List list = wsService.ListarCategoriasProductos(emp.f_idrecord.toString());
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

    @RequestMapping(value = "/get_areas",method = RequestMethod.POST)
    def get_areas(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarAreas(emp.f_idrecord.toString());
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

    @RequestMapping(value = "/get_mesas_by_areas",method = RequestMethod.POST)
    def get_mesas_by_areas(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarMesasByAreas(emp.f_idrecord.toString(), tupla.getAt("f_idarea").toString());
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


    @RequestMapping(value = "/get_cuentas_mesas",method = RequestMethod.POST)
    def get_cuentas_mesas(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.GEtCuentasMesa(emp.f_idrecord.toString(), tupla.getAt("f_idmesa").toString());
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

    @RequestMapping(value = "/get_factura_abierta_cargar",method = RequestMethod.POST)
    def get_factura_abierta_cargar(@RequestParam(value = "dato") String dato) {
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

                    params=[tupla.f_idfactura.toString().toLong(),emp.f_idrecord.toString().toLong()] as Object
                    Map tfacturas = sqlServices.getQueryMap("select * from t_facturas as b where b.f_idrecord = ? and b.f_idempresa = ?;",params);
                    String idcamarero = "0";
                    String nombre_camarero = "";
                    if (!tfacturas.isEmpty()) {

                        params = [tfacturas.f_camarero.toString().toLong(),emp.f_idrecord.toString().toLong()] as Object
                        Map tcamareros = sqlServices.getQueryMap("select * from t_camareros b where b.f_idrecord = ? and b.f_idempresa = ?",params);
                        if (!tcamareros.isEmpty()) {
                            idcamarero = tcamareros.f_idrecord.toString().toLong();
                            nombre_camarero = tcamareros.f_nombre ? tcamareros.f_nombre.toString() : '' + ' ' + tcamareros.f_apellido ? tcamareros.f_apellido.toString() : '';
                        }
                    }
                    List list = wsService.GetDetalleFactura(emp.f_idrecord.toString(), tupla.getAt("f_idfactura").toString());
                    String[] campos = ["f_detalles", "f_idcamarero", "f_nombre_camarero","f_descuento","f_cuenta"];
                    String[] valore = [
                            (JsonOutput.toJson(list)).toString(),
                            "$idcamarero",
                            "$nombre_camarero",
                            "${tfacturas.f_descuento.toString()}",
                            "${tfacturas.f_cuenta.toString()}"];
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


    @RequestMapping(value = "/get_productos_por_categorias",method = RequestMethod.POST)
    def get_productos_por_categorias(@RequestParam(value = "dato") String dato) {
        JsonSlurper jsonSlurper = new JsonSlurper();
        def decodificado = new String(dato.toString().decodeBase64());
        def string = new String(decodificado);
        def json = jsonSlurper.parseText(string);
        Funciones funciones = new Funciones();
        if (chekToken(json.getAt("f_key").toString())) {
            def tupla = json.getAt("f_data");
            Object [] params = [json.f_key.toString()] as Object;
            Map login = sqlServices.getQueryMap("select * from web.t_login b where b.f_token = ? ",params)
//            TEmpresa emp = TEmpresa.findById(login.fIdempresa);
            params = [login.f_idempresa.toString().toLong()]
            Map emp = sqlServices.getQueryMap("select * from cfg.t_empresas b where b.f_idrecord = ?",params);
            if (!emp.isEmpty()) {
                params = [login.f_usuario.toString(),emp.f_idrecord.toString().toLong()] as Object;
                Map user = sqlServices.getQueryMap("select * from t_usuarios as b where b.f_username = ? and b.f_idempresa = ?",params);
                if (!user.isEmpty()) {
                    List list = wsService.ListarProductosPorCategorias(emp.f_idrecord.toString(), tupla.getAt("f_idcategoria").toString());
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
    @RequestMapping(value = "/get_componentes_producto_by_producto",method = RequestMethod.POST)
    def get_componentes_producto_by_producto(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarComponentesByProducto(emp.f_idrecord.toString(), tupla.getAt("f_idrecord").toString());
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

    @RequestMapping(value = "/get_ingredientes",method = RequestMethod.POST)
    def get_ingredientes(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarIngredientes(emp.f_idrecord.toString());
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

    @RequestMapping(value = "/get_opcion_componente_by_id",method = RequestMethod.POST)
    def get_opcion_componente_by_id(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarComponentesOpcionesById(emp.f_idrecord.toString(), tupla.getAt("f_idrecord").toString());
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

    @RequestMapping(value = "/get_componentes_opciones",method = RequestMethod.POST)
    def get_componentes_opciones(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarComponentesOpcionesByProducto(emp.f_idrecord.toString(), tupla.getAt("f_idrecord").toString(), tupla.getAt("f_idcomponente").toString());
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

    @RequestMapping(value = "/get_productos_by_parametro",method = RequestMethod.POST)
    def get_productos_by_parametro(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarProductosPorParametro(emp.f_idrecord.toString(), tupla.getAt("f_parametro").toString());
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
    @RequestMapping(value = "/get_camareros_by_parametros",method = RequestMethod.POST)
    def get_camareros_by_parametros(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarCamarerosByParametros(emp.f_idrecord.toString(), tupla.getAt("f_parametro").toString());
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

    @RequestMapping(value = "/get_facturas_abiertas",method = RequestMethod.POST)
    def get_facturas_abiertas(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarFacturasAbiertas(emp.f_idrecord.toString(),tupla.getAt("f_parametro").toString());
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

    @RequestMapping(value = "/set_salvar_factura",method = RequestMethod.POST)
    def set_salvar_factura(@RequestParam(value = "dato") String dato) {
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
                    def json_factura = tupla.getAt("f_factura");
                    wsService.crearFacturaRestaurante(
                            json_factura.getAt("f_idfactura").toString(),
                            user.f_idrecord.toString().toLong(),
                            emp.f_idrecord.toString().toLong(),
                            json_factura.getAt("f_itbis").toString().toBigDecimal(),
                            json_factura.getAt("f_descuento").toString().toBigDecimal(),
                            json_factura.getAt("f_ley").toString().toBigDecimal(),
                            json_factura.getAt("f_sub_total").toString().toBigDecimal(),
                            json_factura.getAt("f_total").toString().toBigDecimal(),
                            json_factura.getAt("f_detalle") as List,
                            json_factura.getAt("f_idcamarero").toString().toLong(),
                            json_factura.getAt("f_idmesa").toString().toLong(),
                            json_factura.getAt("f_componentes") as List,
                            json_factura.getAt("f_total_extras").toString().toBigDecimal(),
                            json_factura.getAt("f_nombre_cuenta").toString(),
                            json_factura.getAt("f_agregar_cuenta").toString().toBoolean()
                    );
                    return convertir('1', 'true').replace("'", '"');

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

    @RequestMapping(value = "/set_anular_factura",method = RequestMethod.POST)
    def set_anular_factura(@RequestParam(value = "dato") String dato) {
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
                    wsService.Anular_factura(tupla.getAt("f_idrecord").toString().toLong(), emp.f_idrecord.toString().toLong());
                    return funciones.convertir('1', 'true').replace("'", '"');
                } else {
                    /** usuario desactivado */
                    return funciones.convertir('-2', 'NONE').replace("'", '"');
                }
            } else {
                /** empresa desactivada o no existe */
                return funciones.convertir('-1', 'NONE').replace("'", '"')
            }
        } else {
            return funciones.convertir('-4', 'NONE').replace("'", '"')
        }

    }

    @RequestMapping(value = "/get_validar_super_usuario",method = RequestMethod.POST)
    def get_validar_super_usuario(@RequestParam(value = "dato") String dato) {
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
                    String valor = wsService.VerificarPermisos(tupla.getAt("f_usuario").toString(), tupla.getAt("f_password").toString(), tupla.getAt("f_opcion").toString(), emp.f_idrecord.toString().toLong());
                    return funciones.convertir('1', valor).replace("'", '"');

                } else {
                    /** usuario desactivado */
                    return funciones.convertir('-2', 'NONE').replace("'", '"');
                }
            } else {
                /** empresa desactivada o no existe */
                return funciones.convertir('-1', 'NONE').replace("'", '"')
            }
        } else {
            return funciones.convertir('-4', 'NONE').replace("'", '"')
        }

    }

    @RequestMapping(value = "/get_activar_camareros_by_parametros",method = RequestMethod.POST)
    def get_activar_camareros_by_parametros(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarActivarDesactivarCamarerosByParametros(emp.f_idrecord.toString(), tupla.getAt("f_parametro").toString());
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

    @RequestMapping(value = "/set_activar_camareros",method = RequestMethod.POST)
    def set_activar_camareros(@RequestParam(value = "dato") String dato) {
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
                    wsService.ActivarCamarero(tupla.getAt("f_idrecord").toString(), tupla.getAt("f_parametro").toString(), emp.f_idrecord.toString().toLong());
                    return convertir('1', 'true').replace("'", '"');
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

    @RequestMapping(value = "/set_crear_cuadre_cajero",method = RequestMethod.POST)
    def set_crear_cuadre_cajero(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.crear_cuadre_cajero(tupla.getAt("f_idusuario").toString(), emp.f_idrecord.toString().toLong());
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


    @RequestMapping(value = "/get_comprobante_fiscales",method = RequestMethod.POST)
    def get_comprobante_fiscales(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarNCF(emp.f_idrecord.toString());
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


    @RequestMapping(value = "/get_tipo_tarjetas",method = RequestMethod.POST)
    def get_tipo_tarjetas(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarTipoTarjetas(emp.f_idrecord.toString());
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

    @RequestMapping(value = "/get_clientes_by_id",method = RequestMethod.POST)
    def get_clientes_by_id(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarClientesById(emp.f_idrecord.toString(),tupla.getAt("f_idrecord").toString());
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

    @RequestMapping(value = "/get_validar_ncf",method = RequestMethod.POST)
    def get_validar_ncf(@RequestParam(value = "dato") String dato) {
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
                    String monto= seguridadService.ValidarNcf(tupla.getAt("f_idrecord").toString().toLong(),emp.f_idrecord.toString().toLong());
                    return convertir('1',"\"$monto\"").replace("'", '"');
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


    @RequestMapping(value = "/get_clientes_by_parametro",method = RequestMethod.POST)
    def get_clientes_by_parametro(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarClientesByParametros(emp.f_idrecord.toString(),tupla.getAt("f_parametro").toString());
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

    @RequestMapping(value = "/set_cerrar_factura",method = RequestMethod.POST)
    def set_cerrar_factura(@RequestParam(value = "dato") String dato) {
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

                    Map json_factura = tupla.getAt("f_factura") as Map;

                    String idfactura = wsService.cerrarFactura(
                            json_factura.getAt("f_idfactura").toString(),
                            user.f_idrecord.toString().toLong(),
                            emp.f_idrecord.toString().toLong(),
                            json_factura.getAt("f_itbis").toString().toBigDecimal(),
                            json_factura.getAt("f_descuento").toString().toBigDecimal(),
                            json_factura.getAt("f_ley").toString().toBigDecimal(),
                            json_factura.getAt("f_sub_total").toString().toBigDecimal(),
                            json_factura.getAt("f_total").toString().toBigDecimal(),
                            json_factura.getAt("f_detalle") as List,
                            json_factura.getAt("f_idcamarero").toString().toLong(),
                            json_factura.getAt("f_idmesa").toString().toLong(),
                            json_factura.getAt("f_componentes") as List,
                            json_factura.getAt("f_total_extras").toString().toBigDecimal(),
                            json_factura.getAt("f_nombre_cuenta").toString(),
                            json_factura.getAt("f_agregar_cuenta").toString().toBoolean(),
                            json_factura.getAt("f_tipo_pago").toString().toLong(),
                            json_factura.getAt("f_idcliente").toString().toLong(),
                            json_factura.getAt("f_devuelta").toString().toBigDecimal(),
                            json_factura.getAt("f_tipo_ncf").toString().toLong(),
                            json_factura.getAt("f_tipo_tarjeta").toString().toLong(),
                            json_factura.getAt("f_propina").toString().toBigDecimal(),
                            json_factura.getAt("f_numero_autorizacion").toString(),
                            json_factura.getAt("f_monto_tarjeta").toString().toBigDecimal(),
                            json_factura.getAt("f_monto_efectivo").toString().toBigDecimal(),
                            json_factura.getAt("f_razon_social").toString(),
                            json_factura.getAt("f_rnc").toString()
                    );
                    return convertir('1', "\"true;$idfactura\"").replace("'", '"');

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

    @RequestMapping(value = "/get_imprimir_factura_by_id",method = RequestMethod.POST)
    def get_imprimir_factura_by_id(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarFacturaReimprimirById(emp.f_idrecord.toString(),tupla.getAt("f_idrecord").toString(),tupla.getAt("f_abierta").toString().toBoolean());
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

    @RequestMapping(value = "/get_facturas_reimprimir",method = RequestMethod.POST)
    def get_facturas_reimprimir(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.ListarFacturasReimprimir(emp.f_idrecord.toString(),tupla.getAt("f_parametro").toString(),tupla.getAt("f_abierta").toString().toBoolean(),tupla.getAt("f_desde").toString(),tupla.getAt("f_hasta").toString());
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

    @RequestMapping(value = "/set_unir_mesas",method = RequestMethod.POST)
    def set_unir_mesas(@RequestParam(value = "dato") String dato) {
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
                if (!user.isEmpty()) {                    def json_factura = JSON.parse(tupla.getAt("f_factura").toString());
                    wsService.UnirMesas(emp.f_idrecord.toString(),tupla.getAt("f_mesa_principal").toString(),tupla.getAt("f_mesa_secundaria").toString());
                    return convertir('1', 'true').replace("'", '"');
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

    @RequestMapping(value = "/get_ordenes_today",method = RequestMethod.POST)
    def get_ordenes_today(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.GetOrdernsToday(emp.f_idrecord.toString());
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


    @RequestMapping(value = "/get_productos_by_orden_today",method = RequestMethod.POST)
    def get_productos_by_orden_today(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.GetProductsByOrder(tupla.getAt("f_idrecord").toString().toLong(), emp.f_idrecord.toString().toLong());
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

    @RequestMapping(value = "/get_componentes_by_detalle_today",method = RequestMethod.POST)
    def get_componentes_by_detalle_today(@RequestParam(value = "dato") String dato) {
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
                    List list = wsService.GetComponentsByOrderDetail(tupla.getAt("f_iddetalle").toString().toLong());
                    List list2 = wsService.GetComponentsExtrasByOrderDetail(tupla.getAt("f_iddetalle").toString().toLong());
                    List list3 = wsService.GetIngredientsByOrderDetail(tupla.getAt("f_iddetalle").toString().toLong());
                    String[] campos = ["f_lista_componentes", "f_lista_componentes_extras","f_lista_ingredientes"];
                    String[] valore = [(JsonOutput.toJson(list)),(JsonOutput.toJson(list2)),(JsonOutput.toJson(list3))];

                    /** impresion**/

                    return convertir("1", funciones.crearJSON(campos, valore)).replace("'", '"').replace('"[', '[').replace(']"', ']');

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
