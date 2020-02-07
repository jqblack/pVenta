package manube_v2

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

       //"/"(redirect: "products")
        "/"(redirect: "/login")
        "/login"(controller: "login"){
            action=[GET:"index"]
        }



        "500"(view:'/error')
        //"404"(view:'/notFound')
        "404"(view:'/error/404')

        "/login/authenticate" (controller: "login") {
            action = [POST: "authenticate"]
        }

        "/empresa/get_empresa" (controller: "empresa") {
            action = [POST: "getEmpresa"]
        }

        "/get_ventas_y_ultima_actualizacion/$dato" (controller: "home") {
            action = [POST: "get_ventas_y_ultima_actualizacion"]
        }


        "/logout" (controller: "login") {
            action = [POST: "logout"]
        }

        "/home" (controller: "home") {
            action = [GET: "index"]
        }

        "/home/getDataToChart" (controller: "home") {
            action = [POST: "getDataToChart"]
        }

        "/home/activar_pedidos" (controller: "home") {
            action = [POST: "activar_pedidos"]
        }

        "/home/getConfiguracionesToPrint" (controller: "home") {
            action = [POST: "getConfiguracionesToPrint"]
        }

        "/salida"(controller: "inventario"){
            action = [GET:"salida"]
        }
        "/salida/store_salida" (controller: "inventario") {
            action = [POST: "store_salida"]
        }

        "/salida/get_conceptos" (controller: "inventario") {
            action = [POST: "get_conceptos"]
        }

        "/salida/get_suplidores" (controller: "inventario") {
            action = [POST: "get_suplidores"]
        }

        "/entrada"(controller: "inventario"){
            action = [GET:"entrada"]
        }

        "/entrada/get_suplidores" (controller: "inventario") {
            action = [POST: "get_suplidores"]
        }

        "/entrada/store_entrada" (controller: "inventario") {
            action = [POST: "store_entrada"]
        }

        "/entrada/get_conceptos" (controller: "inventario") {
            action = [POST: "get_conceptos"]
        }

        "/products/get_lista_productos" (controller: "products") {
            action = [POST: "get_lista_productos"]
        }

        "/products/get_producto" (controller: "products") {
            action = [POST: "get_producto"]
        }

        "/products/get_data_combo" (controller: "products") {
            action = [POST: "get_data_combo"]
        }

        "/products/store" (controller: "products") {
            action = [POST: "store"]
        }

        "/products/uploadImage" (controller: "products") {
            action = [POST: "uploadImage"]
        }

        "/categoria" (controller: "categoria") {
            action = [GET: "index"]
        }

        "/categoria/lista" (controller: "categoria") {
            action = [POST: "get_categorias"]
        }

        "/categoria/store" (controller: "categoria") {
            action = [POST: "store"]
        }

        "/unidad" (controller: "unidad") {
            action = [GET: "index"]
        }
        "/unidad/store" (controller: "unidad") {
            action = [POST: "store"]
        }
        "/unidad/get_unidades" (controller: "unidad") {
            action = [POST: "get_unidades"]
        }

        /**
         *  URLs para el formulario de cambiar precios a los productos
         * */
        "/cambiar_precio" (controller: "products") {
            action = [GET: "cambiar_precio"]
        }
        ///cambiar-precio/update_precio
        "/cambiar_precio/update" (controller: "products") {
            action = [POST: "update_precio"]
        }

        "/cambiar_precio/get_lista_productos" (controller: "products") {
            action = [POST: "get_lista_productos"]
        }



        "/horario_precio" (controller: "products") {
            action = [GET: "horario_precio"]
        }


        "/horario_precio/add_horario_precio" (controller: "products") {
            action = [POST: "add_horario_precio"]
        }

        "/horario_precio/get_data_combo" (controller: "products") {
            action = [POST: "get_data_combo"]
        }

        "/horario_precio/get_lista_productos" (controller: "products") {
            action = [POST: "get_lista_productos"]
        }

        "/horario_precio/get_producto" (controller: "products") {
            action = [POST: "get_producto"]
        }

        "/cliente" (controller: "cliente") {
            action = [GET: "index"]
        }
        "/cliente/data_combos" (controller: "cliente") {
            action = [POST: "get_data_combos"]
        }
        "/cliente/store" (controller: "cliente") {
            action = [POST: "store"]
        }

        "/cliente/lista" (controller: "cliente") {
            action = [POST: "get_lista_clientes"]
        }

        "/cliente/get_cliente" (controller: "cliente") {
            action = [POST: "get_cliente"]
        }

        "/cliente/guardar" (controller: "cliente") {
            action = [POST: "store"]
        }


        "/seccion" (controller: "seccion") {
            action = [GET: "index"]
        }

        "/seccion/store" (controller: "seccion") {
            action = [POST: "store"]
        }

        "/seccion/get_secciones" (controller: "seccion") {
            action = [POST: "get_secciones"]
        }

        "/area" (controller: "area") {
            action = [GET: "index"]
        }

        "/area/get_areas" (controller: "area")
        {
            action = [POST: "get_areas"]
        }

        "/area/store" (controller: "area")
        {
            action = [POST: "store"]
        }

        "/propiedad" (controller: "propiedad")
        {
            action = [GET: "index"]
        }

        "/propiedad_producto" (controller: "propiedad")
        {
            action = [GET: "propiedad_producto"]
        }
        "/propiedad_producto/get_lista_productos" (controller: "products") {
            action = [POST: "get_lista_productos"]
        }

        "/propiedad_producto/add_propiedades" (controller: "propiedad") {
            action = [POST: "add_propiedades_producto"]
        }

        "/propiedad_producto/get_producto_propiedades" (controller: "propiedad") {
            action = [POST: "get_producto_propiedades"]
        }

        "/propiedad/get_categorias" (controller: "categoria")
        {
            action = [POST: "get_categorias"]
        }

        "/propiedad/get_propiedades" (controller: "propiedad")
        {
            action = [POST: "get_propiedades"]
        }
        "/propiedad/store" (controller: "propiedad")
        {
            action = [POST: "store"]
        }

        "/camarero" (controller: "camarero")
        {
            action = [GET: "index"]
        }

        "/camarero/store" (controller: "camarero")
        {
            action = [POST: "store"]
        }

        "/camarero/lista" (controller: "camarero")
        {
            action = [POST: "get_lista_camareros"]
        }

        "/camarero/get_camarero" (controller: "camarero")
        {
            action = [POST: "get_camarero"]
        }

        "/camarero/data_combos" (controller: "products")
        {
            action = [POST: "get_data_combo"]
        }
        "/mesa" (controller: "mesa")
        {
            action = [GET: "index"]
        }


        "/mesa/data_combos" (controller: "products")
        {
            action = [POST: "get_data_combo"]
        }

        "/mesa/lista" (controller: "mesa")
        {
            action = [POST: "get_lista_mesas"]
        }
        "/mesa/store" (controller: "mesa")
        {
            action = [POST: "store"]
        }

        "/tipos_monedas" (controller: "moneda") {
            action = [GET: "tipos_monedas"]
        }

        "/tipos_monedas/lista" (controller: "moneda")
        {
            action = [POST: "get_lista_monedas"]
        }

        "/tipos_monedas/store" (controller: "moneda")
        {
            action = [POST: "store_tipo_moneda"]
        }

        "/tasas_monedas" (controller: "moneda") {
            action = [GET: "tasa_monedas"]
        }
        "/tasas_monedas/lista" (controller: "moneda")
        {
            action = [POST: "get_lista_tasas_monedas"]
        }

        "/tasas_monedas/get_monedas" (controller: "moneda")
        {
            action = [POST: "get_lista_monedas"]
        }
        "/tasas_monedas/store" (controller: "moneda")
        {
            action = [POST: "store_tasa"]
        }
        "/tarjetas" (controller: "moneda") {
            action = [GET: "tarjetas"]
        }

        "/tarjetas/lista" (controller: "moneda")
        {
            action = [POST: "get_lista_tarjetas"]
        }
        "/tarjetas/store" (controller: "moneda")
        {
            action = [POST: "store_tarjeta"]
        }
        "/billetes" (controller: "moneda")
        {
            action = [GET: "billetes"]
        }
        "/billetes/lista" (controller: "moneda")
        {
            action = [POST:"get_billetes_by_moneda_id"]
        }
        "/billetes/store" (controller: "moneda")
        {
            action = [POST:"store_billetes"]
        }

        "/usuario"(controller: "user"){
            action = [GET:"index"]
        }

        "/usuario/lista_permisos"(controller: "user"){
            action = [POST:"get_permisos"]
        }

        "/usuario/store"(controller: "user"){
            action = [POST:"store"]
        }

        "/usuario/lista"(controller: "user"){
            action = [POST:"get_usuarios"]
        }
        "/usuario/get_usuario"(controller: "user"){
            action = [POST:"get_usuario_y_permisos"]
        }

        "/ncf"(controller: "ncf"){
            action = [GET:"index"]
        }

        "/ncf/lista"(controller: "ncf"){
            action = [POST:"get_lista_ncf"]
        }
        "/ncf/store"(controller: "ncf"){
            action = [POST:"store"]
        }

        "/ncf/lista_logs"(controller: "ncf"){
            action = [POST:"get_ncf_logs"]
        }

        "/ncf/store_secuencia"(controller: "ncf"){
            action = [POST:"store_secuencia"]
        }

        "/ventas_contado"(controller: "report"){
            action = [GET:"ventas_contado"]
        }

        "/ventas_credito"(controller: "report"){
            action = [GET:"ventas_credito"]
        }

        "/diez_mas_vendidos"(controller: "report"){
            action = [GET:"diez_mas_vendidos"]
        }
        "/productos_vendidos"(controller: "report"){
            action = [GET:"productos_vendidos"]
        }

        "/diez_menos_vendidos"(controller: "report"){
            action = [GET:"diez_menos_vendidos"]
        }

        "/vendidos_por_categoria"(controller: "report"){
            action = [GET:"vendidos_por_categoria"]
        }

        "/vendidos_por_utilidad"(controller: "report"){
            action = [GET:"vendidos_por_utilidad"]
        }

        "/generar"(controller: "report"){
            action = [POST:"generar"]
        }

        "/facturas_mensajeros"(controller: "report"){
            action = [GET:"facturas_mensajeros"]
        }

        "/reporte_cuadre_caja"(controller: "report"){
            action = [GET:"reporte_cuadre_caja"]
        }

        "/reporte_cuadre_general"(controller: "report"){
            action = [GET:"reporte_cuadre_general"]
        }


        "/reporte_cuadre/generar"(controller: "report"){
            action = [POST:"generarReporteCuadre"]
        }

        "/reporte_cuadre_general/generar"(controller: "report"){
            action = [POST:"generarReporteCuadreGeneral"]
        }

        "/reporte_cuadre/reimprimirCuadre"(controller: "punto_venta"){
            action = [POST:"reimprimirCuadre"]
        }

        "/reporte_cuadre_general/reimprimirCuadreGeneral"(controller: "punto_venta"){
            action = [POST:"reimprimirCuadreGeneral"]
        }


        "/preferencia"(controller: "empresa"){
            action = [GET:"index"]
        }

        "/preferencia/store"(controller: "empresa"){
            action = [POST:"store"]
        }

        "/preferencia/horario"(controller: "empresa"){
            action = [POST:"get_horario"]
        }

        "/preferencia/configuracion_procesos"(controller: "empresa"){
            action = [POST:"getConfiguracionProcesosToPrint"]
        }

        "/preferencia/cambiar_configuracion_procesos"(controller: "empresa"){
            action = [POST:"setConfiguracionProcesos"]
        }

        "/comandas" (controller: "punto_venta")
        {
            action = [GET: "comandas"]
        }

        "/comandas/lista" (controller: "punto_venta")
        {
            action = [POST: "getComandas"]
        }
        "/comandas/entregar" (controller: "punto_venta")
        {
            action = [POST: "entregar"]
        }
        "/comandas/entregar_producto" (controller: "punto_venta")
        {
            action = [POST: "entregar_producto"]
        }

        "/facturas" (controller: "facturas")
        {
            action = [GET: "index"]
        }

        "/facturas/get_productos_by_categoria" (controller: "facturas")
        {
            action = [POST: "get_productos_by_categoria"]
        }

        "/facturas/get_producto" (controller: "facturas")
        {
            action = [POST: "get_producto_by_id"]
        }

        "/facturas/get_productos_by_reference_or_descripcion" (controller: "facturas")
        {
            action = [POST: "get_productos_by_reference_or_descripcion"]
        }

        "/facturas/validarVigenciaNcf" (controller: "facturas")
        {
            action = [POST: "validarVigenciaNcf"]
        }

        "/facturas/validar_rnc" (controller: "facturas")
        {
            action = [POST: "validarRNC"]
        }
        "/facturas/get_cliente_by_telefono" (controller: "facturas")
        {
            action = [POST: "get_cliente_by_telefono"]
        }
        "/facturas/store" (controller: "facturas")
        {
            action = [POST: "store"]
        }

        "/facturas/store_direccion" (controller: "facturas")
        {
            action = [POST: "agregarDireccion"]
        }

        "/pedidos" (controller: "punto_venta")
        {
            action = [GET: "pedidos"]
        }

        "/pedidos/get_mensajeros" (controller: "punto_venta")
        {
            action = [POST: "get_mensajeros"]
        }

        "/pedidos/get_pedido" (controller: "punto_venta")
        {
            action = [POST: "getPedido"]
        }

        "/pedidos/get_pedidos" (controller: "punto_venta")
        {
            action = [POST: "getPedidos"]
        }
        "/pedidos/get_factura_cerrada" (controller: "punto_venta")
        {
            action = [POST: "getFacturaCerrada"]
        }
        "/pedidos/get_pedidos_cerrado" (controller: "punto_venta")
        {
            action = [POST: "getPedidosCerrados"]
        }

        "/pedidos/store_estado" (controller: "punto_venta")
        {
            action = [POST: "store_estado"]
        }
        "/pedidos/asignar_mensajero" (controller: "punto_venta")
        {
            action = [POST: "asignar_mensajero"]
        }
        "/pedidos/facturar" (controller: "punto_venta")
        {
            action = [POST: "facturar"]
        }
        "/pedidos/reimprimir" (controller: "punto_venta")
        {
            action = [POST: "reimprimir"]
        }
        "/pedidos/setIdPrintNodo" (controller: "punto_venta")
        {
            action = [POST: "setIdPrintNodo"]
        }
        "/pedidos/imprimir_pedido" (controller: "punto_venta")
        {
            action = [POST: "imprimirPedido"]
        }

        "/web/$dato"(controller: "login"){
            action = [GET: 'web']
        }


        "/cuadre_general"(controller: "punto_venta"){
            action = [GET: 'cuadre_general']
        }

        "/cuadre_general/generar"(controller: "punto_venta"){
            action = [POST: 'generar_cuadre_general']
        }

        "/cuadre_caja"(controller: "punto_venta"){
            action = [GET: 'cuadre_caja']
        }

        "/cuadre_caja/generar"(controller: "punto_venta"){
            action = [POST: 'generar_cuadre_caja']
        }
        "/mensajero"(controller: "user"){
            action = [GET: 'mensajero']
        }

        "/mensajero/lista"(controller: "user"){
            action = [POST: 'getMensajeros']
        }
        "/mensajero/store"(controller: "user"){
            action = [POST: 'store_mensajero']
        }
        "/mensajero/getMensajero"(controller: "user"){
            action = [POST: 'getMensajero']
        }
        "/zona"(controller: "empresa"){
            action = [GET: 'zona']
        }
        "/zona/lista"(controller: "empresa"){
            action = [POST: 'getZonas']
        }
        "/zona/store"(controller: "empresa"){
            action = [POST: 'store_zona']
        }
        "/zona/getSectores"(controller: "empresa"){
            action = [POST: 'getSectores']
        }

        "/zona/deleteSector"(controller: "empresa"){
            action = [POST: 'deleteSector']
        }
        "/registrar_factura" (controller: "punto_venta")
        {
            action = [GET: "registrar_factura"]
        }
        "/registrar_factura/facturar" (controller: "punto_venta")
        {
            action = [POST: "store_factura_no_delivery"]
        }
        "/registrar_factura/autorizacion_porciento_ley" (controller: "punto_venta")
        {
            action = [POST: "autorizacion_porciento_ley"]
        }

        "/cuentas_por_cobrar" (controller: "empresa") {

            action = [GET: "cuenta_por_cobrar"]
        }


        "/cuentas_por_cobrar/get_cuentas_por_cobrar" (controller: "empresa") {

            action = [POST: "getCuentasPorCobrar"]
        }

        "/cuentas_por_cobrar/pago_factura" (controller: "empresa") {

            action = [POST: "storePagoFactura"]
        }


        "/notas_credito" (controller: "empresa") {

            action = [GET: "notas_credito"]
        }

        "/notas_credito/nota_credito_factura" (controller: "empresa") {

            action = [POST: "storeNotaCredito"]
        }

        "/otras_cuentas_por_cobrar" (controller: "empresa") {

            action = [GET: "otras_cuentas_por_cobrar"]
        }

        "/otras_cuentas_por_cobrar/generar_cuenta" (controller: "empresa") {

            action = [POST: "storeOtraCuentaPorCobrar"]
        }

        "/ayuda" (controller: "empresa") {
            action = [GET: "ayuda"]
        }
        "/ayuda/getTutoriales" (controller: "empresa") {
            action = [POST: "getTutoriales"]
        }

        "/politica_privacidad" (controller: "empresa") {
            action = [GET: "politica_privacidad"]
        }

        "/logout_sessions" (controller: "logoutSession"){
            action=[GET:"logoutSession"]
        }
        "/logout_sessions/getSessionesActivas" (controller: "logoutSession"){
            action=[POST:"getSessionesActivas"]
        }
        "/logout_sessions/logoutSessionByToken" (controller: "logoutSession"){
            action=[POST:"logoutSessionByToken"]
        }
    }
}
