package manube_v2

import FuncionesGenerales.Funciones
import grails.converters.JSON
import grails.websocket.example.ServerPrinterNodo
import org.apache.commons.collections.map.HashedMap

class HomeController {
    static allowedMethods = [
            get_menu_options: 'POST',
            getDataToChart: 'POST'
    ]

    ReportService reportService
    FuncionesSQLService funcionesSQLService
    SqlService sqlService



    def index() {

    }


    def get_menu_options()
    {
        def menu = TopcionesMenu.findAll()

        render menu as JSON
    }

    def getDataToChart()
    {

        Map<String, Object> data = new HashedMap<>()
        data.put('ventas', reportService.getVentasAnoEnCurso(session.user.fIdempresa))
        data.put('ventasDelivery', reportService.getVentasDeliveryAnoEnCurso(session.user.fIdempresa))
        data.put('montoVentasAnoEnCurso', reportService.getMontoVentasAnoEnCurso(session.user.fIdempresa))
        render data as JSON
    }

    def getConfiguracionesToPrint()
    {

        Map<String, Object> data = new HashedMap<>()
        data.put('data', funcionesSQLService.getOpcionesConfiguracionImpresion(1))
        render data as JSON
    }

    def activar_pedidos()
    {

        Map<String, Object> response_data = new HashMap<String, Object>()
        response_data.put("isconected", false)
        response_data.put("has_permission", false)
        Tempresas empresa = Tempresas.get(session.user.fIdempresa)
        Tusuarios user = Tusuarios.findById(session.user.id)


        if (user.fActivarPedidos) {
            empresa.fRecibirPedidosApp = !empresa.fRecibirPedidosApp

            empresa.save(flush: true)
            response_data.isconected = empresa.fRecibirPedidosApp
            response_data.has_permission = true
        }


        render response_data as JSON
    }

    def get_ventas_y_ultima_actualizacion(String dato) {
        def decodificado = new String(dato.decodeBase64());
        def string = new String(decodificado);
        def json = JSON.parse(string);
        Funciones funciones = new Funciones();
        String data = json.getAt("f_data");
        Tempresas emp = Tempresas.findById(data as Long);
        if (emp) {
            String sql = "SELECT\n" +
                    "          (SELECT to_char(max(f.f_fecha_operacion),'yyyy/MM/dd') FROM   t_facturas as f WHERE f.f_idempresa = $data ) as ultima_actualizacion,\n" +
                    "           COALESCE( sum(COALESCE(fac.f_total,0)),0) as total\n" +
                    "      FROM\n" +
                    "           t_facturas as fac WHERE fac.f_idempresa = $data and fac.f_fecha_operacion::date = CURRENT_DATE";
            Map map = sqlService.getQuery(sql).first();
            println map
            render convertir('1', (map as JSON ) as String);
        } else {
            /** empresa desactivada o no existe */
            render convertir('-1', 'NONE')
        }
    }
    def String convertir(String key,String data)
    {
        String json="{'f_key':'$key','f_data':$data}";
        return json;
    }



}


