package manube_v2

import FuncionesGenerales.Funciones
import grails.gorm.transactions.Transactional
import grails.plugins.jasper.*
import grails.websocket.example.ServerPrinterNodo
import org.exolab.castor.types.DateTime
import org.grails.web.json.JSONObject

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Transactional
class ReportService {

   JasperService jasperService
   SqlService sqlService
    FuncionesSQLService funcionesSQLService

    def getVentasContado(Long idempresa, String username, JSONObject params) {

        def report
        def header
        List facturas
        report = new JasperReportDef()
        report.setName("reporte_ventas_contado.jasper")

        header = this.getHeader(idempresa)

        report.setFileFormat(JasperExportFormat.PDF_FORMAT)
        String sql="SELECT \n" +
                "f.f_fecha_registro_factura,\n" +
                "'' as f_cliente,\n" +
                "f.f_tipo_documento_factura||to_char(f.f_numero_factura,'FM000000') as f_numero,\n" +
                "COALESCE(f.f_total,0) as f_total,\n" +
                "COALESCE(f.f_itebis,0) as f_itbis,\n" +
                "COALESCE(f.f_porciento_ley,0) as f_ley,\n" +
                "(COALESCE(f.f_total,0) - COALESCE(f.f_itebis,0)-COALESCE(f.f_porciento_ley,0)) as f_costo,\n" +
                "(COALESCE(f.f_total,0) - (COALESCE(f.f_total,0) - COALESCE(f.f_itebis,0)-COALESCE(f.f_porciento_ley,0))) as f_utilidad\n" +
                "FROM \n" +
                "t_facturas as f \n" +
                "WHERE upper(f.f_tipo_documento_factura) = upper(get_tipo_doc(6)) and f.f_idempresa =${idempresa} " +
                "" +
                " and f.f_fecha_registro_factura::date BETWEEN '${params.fechaInicio}'::date and '${params.fechaFinal}'::date order by f.f_fecha_registro_factura asc;"

        facturas = sqlService.getQuery(sql)


        header.put("usuario", username)
        header.put("titulo", "Ventas al contado")

        String f2 = params.fechaFinal.toString()
        f2 = f2.substring(0,10)
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date2= formatter.parse(f2);


        String f1 = params.fechaInicio.toString()
        f1 = f1.substring(0,10)
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1= formatter1.parse(f1);

        //header.put("titulo", "Top 10 Productos Mas Vendidos")
        header.put("fecha1", date1.toTimestamp() )
        header.put("fecha2", date2.toTimestamp())

        report.setParameters(header)
        report.setReportData(facturas)

        def rsBase64 = jasperService.generateReport(report).toByteArray().encodeBase64();
        return rsBase64
    }

    def getVentasCredito(Long idempresa, String username, JSONObject params) {

        def report
        def header
        List facturas
        report = new JasperReportDef()
        report.setName("reporte_ventas_creditos.jasper")

        header = this.getHeader(idempresa)

        report.setFileFormat(JasperExportFormat.PDF_FORMAT)

        String sql="SELECT \n" +
                "f.f_fecha_registro_factura,\n" +
                "COALESCE(cli.f_nombre,'')||' '||COALESCE(cli.f_apellido,'') as f_cliente,\n" +
                "f.f_tipo_documento_factura||to_char(f.f_numero_factura,'FM000000') as f_numero,\n" +
                "COALESCE(f.f_total,0) as f_total,\n" +
                "COALESCE(f.f_itebis,0) as f_itbis,\n" +
                "COALESCE(f.f_porciento_ley,0) as f_ley,\n" +
                "(COALESCE(f.f_total,0) - COALESCE(f.f_itebis,0)-COALESCE(f.f_porciento_ley,0)) as f_costo,\n" +
                "(COALESCE(f.f_total,0) - (COALESCE(f.f_total,0) - COALESCE(f.f_itebis,0)-COALESCE(f.f_porciento_ley,0))) as f_utilidad\n" +
                "FROM \n" +
                "t_facturas as f \n" +
                "INNER JOIN t_clientes as cli on cli.f_idrecord = f.f_idcliente\n" +
                "\n" +
                "WHERE upper(f.f_tipo_documento_factura) = upper(get_tipo_doc(4)) and f.f_idempresa = ${idempresa} " +
                "" +
                " and f.f_fecha_registro_factura::date BETWEEN '${params.fechaInicio}'::date and '${params.fechaFinal}'::date order by f.f_fecha_registro_factura asc;"

        facturas = sqlService.getQuery(sql)

        header.put("usuario", username)

        String f2 = params.fechaFinal.toString()
        f2 = f2.substring(0,10)
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date2= formatter.parse(f2);


        String f1 = params.fechaFinal.toString()
        f1 = f1.substring(0,10)
        Date date1= formatter.parse(f1);

        //header.put("titulo", "Top 10 Productos Mas Vendidos")
        header.put("fecha1", date1.toTimestamp() )
        header.put("fecha2", date2.toTimestamp())


        header.put("usuario", username)

//        header.put("fecha1", new Date(params.fechaInicio.toString().toLong()).toTimestamp())
//        header.put("fecha2", new Date(params.fechaFinal.toString().toLong()).toTimestamp())
        report.setParameters(header)
        report.setReportData(facturas)

        def rsBase64 = jasperService.generateReport(report).toByteArray().encodeBase64();
       // println(rsBase64)
        return rsBase64
    }

    def getDiezProductosMasVendidos(Long idempresa, String username, JSONObject params) {

        def report
        def header
        List facturas
        report = new JasperReportDef()
        report.setName("reporte_10_productos_mas_vendidos.jasper")

        header = this.getHeader(idempresa)

        report.setFileFormat(JasperExportFormat.PDF_FORMAT)

        String sql="SELECT\n" +
                "p.f_referencia,\n" +
                "p.f_descripcion,\n" +
                "cat.f_descripcion as f_categoria,\n" +
                "sum(d.f_cantidad) as f_cantidad  \n" +
                "from\n" +
                "t_productos as p\n" +
                "INNER JOIN t_detalle_factura as d on d.f_idproducto = p.f_idrecord\n" +
                "INNER JOIN t_facturas as f on d.f_idfactura = f.f_idrecord\n" +
                "INNER JOIN t_productos_categorias as cat on cat.f_idrecord = p.f_idcategoria\n" +
                "WHERE p.f_idempresa = ${idempresa} \n" +
                " AND  f.f_fecha_registro_factura::date BETWEEN to_timestamp(${params.fechaInicio} / 1000)::date and to_timestamp(${params.fechaFinal} / 1000)::date\n" +
                " \n" +
                "GROUP BY p.f_referencia,p.f_descripcion,f_categoria \n" +
                "ORDER BY f_cantidad DESC limit 10"
        facturas = sqlService.getQuery(sql)
        //println(sql)

        header.put("usuario", username)
        header.put("titulo", "Top 10 Productos Mas Vendidos")
        header.put("fecha1", new Date(params.fechaInicio.toString().toLong()).toTimestamp())
        header.put("fecha2", new Date(params.fechaFinal.toString().toLong()).toTimestamp())

       // println(header.empresa)
        report.setParameters(header)
        report.setReportData(facturas)

        def rsBase64 = jasperService.generateReport(report).toByteArray().encodeBase64()
        return rsBase64
    }

    def getVendidosPorCategoria(Long idempresa, String username, JSONObject params) {

        def report
        def header
        List facturas
        report = new JasperReportDef()
        report.setName("reporte_productos_vendidos_por_categorias.jasper")

        header = this.getHeader(idempresa)

        report.setFileFormat(JasperExportFormat.PDF_FORMAT)

        String sql="SELECT\n" +
                "f.f_fecha_registro_factura::date,\n" +
                "p.f_referencia,\n" +
                "p.f_descripcion,\n" +
                "cat.f_descripcion as f_categoria,\n" +
                "d.f_cantidad as f_cantidad,\n" +
                "d.f_precio as f_monto\n" +
                "FROM\n" +
                "t_productos as p\n" +
                "INNER JOIN t_detalle_factura as d on d.f_idproducto = p.f_idrecord\n" +
                "INNER JOIN t_facturas as f on d.f_idfactura = f.f_idrecord\n" +
                "INNER JOIN t_productos_categorias as cat on cat.f_idrecord = p.f_idcategoria\n" +
                "WHERE p.f_idempresa = ${idempresa} \n" +
                " AND  f.f_fecha_registro_factura::date BETWEEN to_timestamp(${params.fechaInicio} / 1000)::date and to_timestamp(${params.fechaFinal} / 1000)::date\n"



        if (params.categoria.toString().toLong() == 0.toLong())
        {
            sql = sql +" ORDER BY f_categoria,f_referencia,f_descripcion ASC  ";
        }
        else {
            sql = sql+ " and  p.f_idcategoria = ${params.categoria}  ORDER BY f_categoria,f_referencia,f_descripcion ASC ";
        }

        facturas = sqlService.getQuery(sql)
        //println(sql)
        header.put("usuario", username)
        header.put("titulo", "ventas por categoria")
        header.put("fecha1", new Date(params.fechaInicio.toString().toLong()).toTimestamp())
        header.put("fecha2", new Date(params.fechaFinal.toString().toLong()).toTimestamp())

       // println(header.empresa)
        report.setParameters(header)
        report.setReportData(facturas)

        def rsBase64 = jasperService.generateReport(report).toByteArray().encodeBase64()
        return rsBase64
    }

    def getVentasPorProductosUtilidad(Long idempresa, String username, JSONObject params) {

        def report
        def header
        List facturas
        report = new JasperReportDef()
        report.setName("reporte_ventas_por_productos_utilidad.jasper")

        header = this.getHeader(idempresa)

        report.setFileFormat(JasperExportFormat.PDF_FORMAT)

        String sql="SELECT\n" +
                "f.f_fecha_registro_factura::date,\n" +
                "p.f_referencia,\n" +
                "p.f_descripcion,\n" +
                "d.f_cantidad as f_cantidad,\n" +
                "COALESCE(d.f_precio,0) as f_monto,\n" +
                "(COALESCE(p.f_ultimocosto,0)* d.f_cantidad) as f_costo,\n" +
                "(COALESCE(d.f_precio,0) - (COALESCE(p.f_ultimocosto,0) *  d.f_cantidad)) as f_utilidad,\n" +
                "\n" +
                "(((COALESCE(d.f_precio,0) - (COALESCE(p.f_ultimocosto,0) *  d.f_cantidad))/COALESCE(d.f_precio,0))*100)::NUMERIC as f_porciento\n" +
                "\n" +
                "FROM\n" +
                "t_productos as p\n" +
                "INNER JOIN t_detalle_factura as d on d.f_idproducto = p.f_idrecord\n" +
                "INNER JOIN t_facturas as f on d.f_idfactura = f.f_idrecord\n" +
                "INNER JOIN t_productos_categorias as cat on cat.f_idrecord = p.f_idcategoria\n" +
                "WHERE p.f_idempresa = ${idempresa} \n" +
                " AND  f.f_fecha_registro_factura::date BETWEEN to_timestamp(${params.fechaInicio} / 1000)::date and to_timestamp(${params.fechaFinal} / 1000)::date\n"+
                "ORDER BY f_fecha_registro_factura::date,f_referencia,f_descripcion ASC";


        facturas = sqlService.getQuery(sql)
        //println(sql)
        header.put("usuario", username)
        header.put("titulo", "Ventas Por Producto Utilidad")
        header.put("fecha1", new Date(params.fechaInicio.toString().toLong()).toTimestamp())
        header.put("fecha2", new Date(params.fechaFinal.toString().toLong()).toTimestamp())

       // println(header.empresa)
        report.setParameters(header)
        report.setReportData(facturas)

        def rsBase64 = jasperService.generateReport(report).toByteArray().encodeBase64()
        return rsBase64
    }

    def getFacturasMensajeros(Long idempresa, String username, JSONObject params) {

        def report
        def header
        List facturas
        report = new JasperReportDef()
        report.setName("reporte_facturas_mensajeros.jasper")

        header = this.getHeader(idempresa)

        report.setFileFormat(JasperExportFormat.PDF_FORMAT)

        String sql= " select cli.f_nombre,\n" +
                "             cli.f_direccion,\n" +
                "             fac.f_fecha_regstro_orden,\n" +
                "             men.f_nombre as f_mensajero,\n" +
                "             COALESCE(fac.f_total, 0) as f_total\n" +
                "      from t_facturas as fac\n" +
                "           left join envios.t_mensajeros as men on fac.f_mensajero =\n" +
                "            men.f_idrecord\n" +
                "           LEFT join envios.t_clientes_envios as cli on cli.f_idrecord =\n" +
                "            fac.f_idcliente\n" +
                "WHERE men.f_idempresa = ${idempresa} and fac.f_modulo = 3 \n" +
                " AND  fac.f_fecha_registro_factura::date BETWEEN to_timestamp(${params.fechaInicio} / 1000)::date and to_timestamp(${params.fechaFinal} / 1000)::date\n"+
                "";


        facturas = sqlService.getQuery(sql)
        //println(sql)
        header.put("usuario", username)
        header.put("titulo", "Facturas de mensajeros")
        header.put("fecha1", new Date(params.fechaInicio.toString().toLong()).toTimestamp())
        header.put("fecha2", new Date(params.fechaFinal.toString().toLong()).toTimestamp())
        header.put("fecha", new Date().toTimestamp())

       // println(header.empresa)
        report.setParameters(header)
        report.setReportData(facturas)

        def rsBase64 = jasperService.generateReport(report).toByteArray().encodeBase64()
        return rsBase64
    }

    def getDiezProductosMenosVendidos(Long idempresa, String username, JSONObject params) {

        def report
        def header
        List facturas
        report = new JasperReportDef()
        report.setName("reporte_10_productos_menos_vendidos.jasper")

        header = this.getHeader(idempresa)

        report.setFileFormat(JasperExportFormat.PDF_FORMAT)

        String sql="SELECT\n" +
                "p.f_referencia,\n" +
                "p.f_descripcion,\n" +
                "cat.f_descripcion as f_categoria,\n" +
                "sum(d.f_cantidad) as f_cantidad  \n" +
                "from\n" +
                "t_productos as p\n" +
                "INNER JOIN t_detalle_factura as d on d.f_idproducto = p.f_idrecord\n" +
                "INNER JOIN t_facturas as f on d.f_idfactura = f.f_idrecord\n" +
                "INNER JOIN t_productos_categorias as cat on cat.f_idrecord = p.f_idcategoria\n" +
                "WHERE p.f_idempresa = ${idempresa} \n" +
                " AND  f.f_fecha_registro_factura::date BETWEEN to_timestamp(${params.fechaInicio} / 1000)::date and to_timestamp(${params.fechaFinal} / 1000)::date\n"+
                " \n" +
                "GROUP BY p.f_referencia,p.f_descripcion,f_categoria \n" +
                "ORDER BY f_cantidad ASC limit 10"
        facturas = sqlService.getQuery(sql)
        //println(sql)
        header.put("usuario", username)
        header.put("titulo", "Top 10 Productos Menos Vendidos")
        header.put("fecha1", new Date(params.fechaInicio.toString().toLong()).toTimestamp())
        header.put("fecha2", new Date(params.fechaFinal.toString().toLong()).toTimestamp())

       // println(header.empresa)
        report.setParameters(header)
        report.setReportData(facturas)

        def rsBase64 = jasperService.generateReport(report).toByteArray().encodeBase64()
        return rsBase64
    }

    def getHeader(Long idempresa) {
        Map<String, String> params = new HashMap<>()
        def empresa
        def sql = "select f_nombre,f_web, f_header from cfg.t_empresas where f_idrecord = ${idempresa}"

        empresa = sqlService.getQuery(sql)
        params.put("empresa", empresa.get(0).f_nombre )
        params.put("direccion", empresa.get(0).f_header)
        params.put("web", empresa.get(0).f_web)
        params.put("hora", new Date().toTimestamp())
        params.put("fecha", new Date().toTimestamp())
        params
    }
    def getReportVentas(Long idempresa, String username) {
        def report
        List facturas
        Map<String, String> params = new HashMap<>()
        report = new JasperReportDef()
        report.setName("reporte_ventas_menube.jasper")

        report.setFileFormat(JasperExportFormat.PDF_FORMAT)
        String sql = "SELECT  \n" +
                " emp.f_nombre as empresa,\n" +
                " emp.f_header as direccion,\n" +
                " f.f_tipo_documento_factura||to_char(f.f_numero_orden,'FM000000') as noOrden,\n" +
                " cam.f_nombre as camarero,\n" +
                " mesa.f_descripcion as mesa,\n" +
                " f.f_itebis as itbis,\n" +
                " f.f_subtotal as subtotal,\n" +
                " f.f_total as total,\n" +
                " f.f_total_extra as total_extra,\n" +
                " f.f_fecha_regstro_orden as fecha_orden,\n" +
                " ar.f_nombre_area as area\n" +
                " FROM t_facturas as f\n" +
                " INNER JOIN t_camareros as cam on cam.f_idrecord = f.f_camarero\n" +
                " INNER JOIN t_mesas as mesa on mesa.f_idrecord = f.f_mesa\n" +
                " INNER JOIN t_areas as ar on ar.f_idrecord = mesa.f_id_area\n" +
                " INNER JOIN cfg.t_empresas as emp on emp.f_idrecord = f.f_idempresa\n" +
                " WHERE f.f_idempresa = ${idempresa}\n" +
                " and f.f_factura_abierta = TRUE\n" +
                " AND f.f_cancelada = false\n" +
                " and f.f_anulada = false\n" +
                " AND f.f_modulo = 2"

        facturas = sqlService.getQuery(sql)
        params.put("empresa", facturas.get(0).empresa )
        params.put("direccion", facturas.get(0).direccion)
        params.put("usuario", username)

        report.setParameters(params)
        report.setReportData(facturas)

        def rsBase64 = jasperService.generateReport(report).toByteArray().encodeBase64();

        rsBase64
    }

    def  GetVentasContado(String fecha1,String fecha2, Long idUser, Long idEmpresa)  {
//        String f1=fecha1.format('yyyy/MM/dd')
//        String f2=fecha2.format('yyyy/MM/dd')
       //String idEmpresa = idEmpresa.toString()

        String sql = "SELECT \n" +
                "f.f_fecha_registro_factura::date as f_fecha_registro_factura,\n" +
                "'' as f_cliente,\n" +
                "f.f_tipo_documento_factura||to_char(f.f_numero_factura,'FM000000') as f_numero,\n" +
                "COALESCE(f.f_total,0) as f_total,\n" +
                "COALESCE(f.f_itebis,0) as f_itbis,\n" +
                "COALESCE(f.f_porciento_ley,0) as f_ley,\n" +
                "(COALESCE(f.f_total,0) - COALESCE(f.f_itebis,0)-COALESCE(f.f_porciento_ley,0)) as f_costo,\n" +
                "(COALESCE(f.f_total,0) - (COALESCE(f.f_total,0) - COALESCE(f.f_itebis,0)-COALESCE(f.f_porciento_ley,0))) as f_utilidad\n" +
                "FROM \n" +
                "t_facturas as f \n" +
                "WHERE upper(f.f_tipo_documento_factura) = upper(get_tipo_doc(6)) and f.f_idempresa = ${idEmpresa.toString()} " +
                "" +
                " and f.f_fecha_registro_factura::date BETWEEN '${fecha1}'::date and '${fecha2}'::date order by f.f_fecha_registro_factura::date asc;"

        List list=sqlService.GetQuery(sql)
        list
    }

    def getVentasAnoEnCurso(Long idempresa) {
        List list

        def sql = "SELECT \n" +
                " \n" +
                " \tSUM( f.f_total ) as sum_ventas,\n" +
                " \tCOUNT( * ) as count_ventas,\n" +
                "\t(CASE\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 1 THEN 'Enero'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 2 THEN 'Febrero'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 3 THEN 'Marzo'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 4 THEN 'Abril'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 5 THEN 'Mayo'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 6 THEN 'Junio'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 7 THEN 'Julio'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 8 THEN 'Agosto'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 9 THEN 'Septiembre'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 10 THEN 'Octubre'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 11 THEN 'Noviembre'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 12 THEN 'Diciembre'\n" +
                "    END) AS mes\n" +
                "FROM \n" +
                " \tt_facturas as f\n" +
                "WHERE \n" +
                " \tf.f_idempresa = ${idempresa}\n AND f.f_fecha_registro_factura is not null " +
                " \tAND f.f_modulo = 2\n" +
                "GROUP BY\n" +
                "\tmes"

        sql = "SELECT \n" +
                " \n" +
                " \tSUM( f.f_total ) as sum_ventas,\n" +
                " \tCOUNT( * ) as count_ventas,\n" +
                "\tEXTRACT(WEEK FROM f.f_fecha_registro_factura) as mes\n" +
                "FROM \n" +
                " \tt_facturas as f\n" +
                "WHERE \n" +
                " \tf.f_idempresa = ${idempresa}\n" +
                " AND \n" +
                " \tf.f_fecha_registro_factura is not null  \n" +
//                " AND \n" +
//                " \tf.f_modulo = 3\n" +
                " AND \n" +
                " \tEXTRACT(MONTH FROM f.f_fecha_registro_factura) > ( EXTRACT(MONTH FROM CURRENT_TIMESTAMP) - 1 )\n" +
                " AND \n" +
                " \tEXTRACT(MONTH FROM f.f_fecha_registro_factura) <=  EXTRACT(MONTH FROM CURRENT_TIMESTAMP)\n" +
                "GROUP BY\n" +
                "\tmes\n" +
                "ORDER BY \n" +
                "\tmes ASC"

        //prinln sql
        list = (sqlService.GetQuery(sql))
        list
    }

    def getVentasDeliveryAnoEnCurso(Long idempresa) {
        List list

        def sql = "SELECT \n" +
                " \n" +
                " \tSUM( f.f_total ) as sum_ventas,\n" +
                " \tCOUNT( * ) as count_ventas,\n" +
                "\t(CASE\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 1 THEN 'Enero'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 2 THEN 'Febrero'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 3 THEN 'Marzo'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 4 THEN 'Abril'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 5 THEN 'Mayo'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 6 THEN 'Junio'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 7 THEN 'Julio'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 8 THEN 'Agosto'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 9 THEN 'Septiembre'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 10 THEN 'Octubre'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 11 THEN 'Noviembre'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 12 THEN 'Diciembre'\n" +
                "    END) AS mes\n" +
                "FROM \n" +
                " \tt_facturas as f\n" +
                "WHERE \n" +
                " \tf.f_idempresa = ${idempresa}\n AND f.f_fecha_registro_factura is not null " +
                " \tAND f.f_modulo = 3\n" +
                "GROUP BY\n" +
                "\tmes"

        sql = "SELECT \n" +
                " \n" +
                " \tSUM( f.f_total ) as sum_ventas,\n" +
                " \tCOUNT( * ) as count_ventas,\n" +
                "\tEXTRACT(WEEK FROM f.f_fecha_registro_factura) as mes\n" +
                "FROM \n" +
                " \tt_facturas as f\n" +
                "WHERE \n" +
                " \tf.f_idempresa = ${idempresa}\n" +
                " AND \n" +
                " \tf.f_fecha_registro_factura is not null  \n" +
                " AND \n" +
                " \tf.f_modulo = 3\n" +
                " AND \n" +
                " \tEXTRACT(MONTH FROM f.f_fecha_registro_factura) > ( EXTRACT(MONTH FROM CURRENT_TIMESTAMP) - 1 )\n" +
                " AND \n" +
                " \tEXTRACT(MONTH FROM f.f_fecha_registro_factura) <=  EXTRACT(MONTH FROM CURRENT_TIMESTAMP)\n" +
                "GROUP BY\n" +
                "\tmes\n" +
                "ORDER BY \n" +
                "\tmes ASC"


        list = (sqlService.GetQuery(sql))
        list
    }

    def getMontoVentasAnoEnCurso(Long idempresa)  {
        List list

        def sql = "SELECT \n" +
                " \n" +
                " \tSUM( f.f_total ) as sum_ventas,\n" +
                " \tSUM( f.f_total ) as count_ventas,\n" +
                "\t(CASE\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 1 THEN 'Enero'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 2 THEN 'Febrero'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 3 THEN 'Marzo'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 4 THEN 'Abril'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 5 THEN 'Mayo'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 6 THEN 'Junio'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 7 THEN 'Julio'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 8 THEN 'Agosto'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 9 THEN 'Septiembre'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 10 THEN 'Octubre'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 11 THEN 'Noviembre'\n" +
                "    \tWHEN \n" +
                "    \t\tEXTRACT(MONTH FROM f.f_fecha_registro_factura) = 12 THEN 'Diciembre'\n" +
                "    END) AS mes," +
                "\n" +
                "    EXTRACT(MONTH FROM f.f_fecha_registro_factura) as num_mes\n" +
                "FROM \n" +
                " \tt_facturas as f\n" +
                "WHERE \n" +
                " \tf.f_idempresa = ${idempresa}\n AND f.f_fecha_registro_factura is not null " +
                "GROUP BY\n" +
                "\tmes, num_mes ORDER BY num_mes "

        list = (sqlService.GetQuery(sql))
        list
    }

    def printFactura(String idfactura, String idempresa) {
        String p = "Pabel dionicio lopez mena";
        String tipo_printer = "1"
        String accion = ""
        String json = ""
        String xsession = "181103124608324"
        Funciones utilidades = new Funciones()


        List resultado
        resultado = funcionesSQLService.ListarFacturaReimprimirById(idempresa, idfactura, true)
        println resultado
        //response_data.put("data", resultado[0])
        //render response_data as JSON
        //json = [f_data:resultado[0]] as JSON
        p = utilidades.GenerarStringFacturaImprimirTermica(resultado, tipo_printer, accion)
        //println resultado[0].toString()

        ServerPrinterNodo.enviar(p, xsession)

        return true
    }

    def getProductosVendidos(Long idempresa, String username, JSONObject params) {

        def report
        def header
        List facturas
        report = new JasperReportDef()
        report.setName("reporte_productos_vendidos.jasper")

        header = this.getHeader(idempresa)

        report.setFileFormat(JasperExportFormat.PDF_FORMAT)

        String sql="SELECT\n" +
                "f.f_fecha_registro_factura::date,\n" +
                "p.f_referencia,\n" +
                "p.f_descripcion,\n" +
                "cat.f_descripcion as f_categoria,\n" +
                "sum(d.f_cantidad) as f_cantidad," +
                "sum(d.f_itebis + d.f_precio) as f_monto \n" +
                "from\n" +
                "t_productos as p\n" +
                "INNER JOIN t_detalle_factura as d on d.f_idproducto = p.f_idrecord\n" +
                "INNER JOIN t_facturas as f on d.f_idfactura = f.f_idrecord\n" +
                "INNER JOIN t_productos_categorias as cat on cat.f_idrecord = p.f_idcategoria\n" +
                "WHERE p.f_idempresa = ${idempresa} \n" +
                " AND  f.f_fecha_registro_factura::date BETWEEN to_timestamp(${params.fechaInicio} / 1000)::date and to_timestamp(${params.fechaFinal} / 1000)::date\n" +
                " \n" +
                "GROUP BY p.f_referencia,p.f_descripcion,f_categoria,f.f_fecha_registro_factura::date \n" +
                "ORDER BY f.f_fecha_registro_factura::date desc,p.f_descripcion ASC "
        facturas = sqlService.getQuery(sql)

        header.put("usuario", username)
        header.put("titulo", "Productos Vendidos")
        header.put("fecha1", new Date(params.fechaInicio.toString().toLong()).toTimestamp())
        header.put("fecha2", new Date(params.fechaFinal.toString().toLong()).toTimestamp())

        // println(header.empresa)
        report.setParameters(header)
        report.setReportData(facturas)

        def rsBase64 = jasperService.generateReport(report).toByteArray().encodeBase64()
        return rsBase64
    }
    def serviceMethod() {

    }
}
