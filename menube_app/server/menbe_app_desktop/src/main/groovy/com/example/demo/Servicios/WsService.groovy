package com.example.demo.Servicios

import com.example.demo.FuncionesGenrales.Funciones
import com.sun.org.apache.xpath.internal.operations.Bool
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import java.sql.Timestamp
import java.text.SimpleDateFormat


@Transactional
@Service
class WsService {

    @Autowired
    SqlServices sqlServices;

    def ListarCategoriasProductos(String empresa) {
        String sql = "SELECT \n" +
                "  f_idrecord,\n" +
                "  f_idempresa,\n" +
                "  f_descripcion,\n" +
                "  f_orden\n" +
                "FROM \n" +
                "  public.t_productos_categorias where  f_idempresa = $empresa    ORDER BY f_descripcion;";

        List list = sqlServices.getQuery(sql);
        return list;
    }

    def ListarAreas(String empresa) {

        String sql = "SELECT\n" +
                "    f_idrecord,\n" +
                "    f_idempresa,\n" +
                "    f_nombre_area,\n" +
                "    f_tiempo_camarero\n" +
                "    FROM\n" +
                "    public.t_areas where f_idempresa  = $empresa  ;";

        List list = sqlServices.getQuery(sql);
        return list;
    }

    def ListarMesasByAreas(String empresa, String idarea) {
        String sql = "SELECT\n" +
                "    m.f_idrecord,\n" +
                "    m.f_descripcion,\n" +
                "    a.f_nombre_area,\n" +
                "    m.f_id_area,\n" +
                "    m.f_id_seccion,\n" +
                "    m.f_cubiertos,\n" +
                "    m.f_idempresa,\n" +
                "    (SELECT count(fac.f_idrecord) from t_facturas as fac where fac.f_factura_abierta=true and fac.f_modulo='2' and fac.f_mesa=m.f_idrecord and fac.f_anulada = false) as f_cuentas\n" +
                "    FROM\n" +
                "    public.t_mesas as m" +
                "    INNER JOIN t_areas as a on a.f_idrecord = m.f_id_area " +
                "" +
                " WHERE m.f_idempresa  =$empresa   ";

        if (!idarea.equals("0")) {
            sql = sql + " and m.f_id_area = $idarea ";
        }

        // println sql;

        List list = sqlServices.getQuery(sql);
        return list;
    }


    def List GEtCuentasMesa(String empresa, String id) {

        String sql = "select\n" +
                "  fac.f_idrecord as f_idfactura,\n" +
                "   COALESCE(fac.f_cuenta,'') as f_cuenta,\n" +
                "  m.f_idrecord as f_idmensa, \n" +
                "  m.f_descripcion ,\n" +
                "  a.f_nombre_area,\n" +
                "  ca.f_nombre as f_camarero,\n" +
                "  COALESCE(fac.f_total,0) as f_total\n" +
                "  from t_facturas as fac\n" +
                "       left join t_mesas as m on m.f_idrecord = fac.f_mesa\n" +
                "       left join t_camareros as ca on ca.f_idrecord = fac.f_camarero\n" +
                "       INNER join t_areas as a on a.f_idrecord=m.f_id_area\n" +
                "  WHERE fac.f_mesa =$id and fac.f_idempresa = $empresa and \n" +
                "        fac.f_factura_abierta = true and fac.f_anulada= false";

//        println sql;
        return sqlServices.getQuery(sql);
    }

    def List GetDetalleFactura(String empresa, String id) {
        String sql = "SELECT \n" +
                "  d.f_idrecord,\n" +
                "  d.f_idfactura,\n" +
                "  d.f_idproducto,\n" +
                "  d.f_referencia,\n" +
                "  d.f_cantidad,\n" +
                "  d.f_itebis,\n" +
                "  d.f_precio,\n" +
                "  d.f_idempresa," +
                "  d.f_comanda," +
                "  coalesce(d.f_idcomanda,-1) as f_idcomanda," +
                "  (select get_componentes_detalles_json(d.f_idrecord)) as f_componentes\n" +
                "FROM \n" +
                "  public.t_detalle_factura  as d where d.f_idfactura =$id and d.f_idempresa =$empresa ;"

        return sqlServices.getQuery(sql);

    }

    def ListarSectores(String empresa) {
        String sql = "SELECT \n" +
                "  f_idrecord,\n" +
                "  f_idzona,\n" +
                "  f_sector\n" +
                "FROM \n" +
                "  envios.t_zonas_sectores order by f_sector asc ; ";

        List list = sqlServices.getQuery(sql);
        return list;
    }

    def ListarProductosPorId(String empresa, String idrecord, String area) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HHmm")
        Date fecha_hoy = new Date();
        String hora = simpleDateFormat.format(fecha_hoy);
        String dia = sqlServices.GetDiaSemana(2.toLong());
        String sql = "SELECT \n" +
                "  p.f_idrecord,\n" +
                "  p.f_idempresa,\n" +
                "  p.f_referencia,\n" +
                "  p.f_descripcion,\n" +
                "  p.f_controlinventario,\n" +
                "  p.f_idcategoria,\n" +
                "  COALESCE(p.f_reorden,0) as f_reorden,\n" +
                "  COALESCE(p.f_maxdescuento,0) as f_maxdescuento,\n" +
                "  get_precios_productos(p.f_idrecord,$empresa,$hora::text,$hora::text,$dia,$area) as f_precio,\n" +
                "  COALESCE(p.f_ultimocosto,0) as f_ultimocosto,\n" +
                "  COALESCE(p.f_limiteminimo,0) as f_limiteminimo,\n" +
                "  COALESCE(p.f_limitemaximo,0) as f_limitemaximo,\n" +
                "  COALESCE(p.f_existencia,0) asf_existencia ,\n" +
                "  COALESCE(p.f_tax,0) as f_tax,\n" +
                "  p.f_fecha,\n" +
                "  COALESCE(p.f_makeup,0) as f_makeup,\n" +
                "  COALESCE(p.f_ultimocosto1,0) as f_ultimocosto1,\n" +
                "  COALESCE(p.f_ultimocosto2,0) as f_ultimocosto2,\n" +
                "  p.f_fecha_vencimiento,\n" +
                "  p.f_idlocalizacion,\n" +
                "  p.f_kit,\n" +
                "  p.f_descontinuado,\n" +
                "  p.f_mensaje,\n" +
                "  p.f_idunidad,\n" +
                "  p.f_plato,\n" +
                "  p.f_receta,\n" +
                "  COALESCE(p.f_tragos,0) as f_tragos,\n" +
                "  p.f_ventas_decimales,\n" +
                "  p.f_comanda,\n" +
                "  p.f_imprime_ingrediente,\n" +
                "  (select count(*) from t_productos_componentes as c WHERE c.f_idproducto = p.f_idrecord) as f_componentes\n" +
                "FROM \n" +
                "  public.t_productos as p where p.f_idempresa = $empresa and p.f_idrecord = $idrecord;";

        List list = sqlServices.getQuery(sql);

        return list;
    }

    def ListarProductosPorCategorias(String empresa, String idcategoria) {
        String sql = "  \n" +
                "  SELECT \n" +
                "  f_idrecord,\n" +
                "  f_idempresa,\n" +
                "  f_referencia,\n" +
                "  f_descripcion,\n" +
                "  f_controlinventario,\n" +
                "  f_idcategoria,\n" +
                "  f_reorden,\n" +
                "  f_maxdescuento,\n" +
                "  f_precio,\n" +
                "  f_ultimocosto,\n" +
                "  f_limiteminimo,\n" +
                "  f_limitemaximo,\n" +
                "  f_existencia,\n" +
                "  f_tax,\n" +
                "  f_fecha,\n" +
                "  f_makeup,\n" +
                "  f_ultimocosto1,\n" +
                "  f_ultimocosto2,\n" +
                "  f_fecha_vencimiento,\n" +
                "  f_idlocalizacion,\n" +
                "  f_kit,\n" +
                "  f_descontinuado,\n" +
                "  f_mensaje,\n" +
                "  f_idunidad,\n" +
                "  f_plato,\n" +
                "  f_receta,\n" +
                "  f_tragos,\n" +
                "  f_ventas_decimales,\n" +
                "  f_imprime_ingrediente\n" +
                "FROM \n" +
                "  public.t_productos where f_idempresa = $empresa and f_idcategoria = $idcategoria ;";

        List list = sqlServices.getQuery(sql);
        return list;
    }

    def ListarComponentesByProducto(String empresa, String idproducto) {
        String sql = "SELECT \n" +
                "  c.f_idrecord,\n" +
                "  c.f_idempresa,\n" +
                "  c.f_name,\n" +
                "  c.f_activo\n" +
                "FROM \n" +
                "  public.t_componentes as c where c.f_idempresa = $empresa and c.f_activo = true" +
                "  and c.f_idrecord in (select pc.f_idcomponente from t_productos_componentes as pc where pc.f_idproducto = $idproducto and pc.f_activo = true) " +
                ";";

        List list = sqlServices.getQuery(sql);
        return list;
    }

    def ListarIngredientes(String empresa) {

        String sql = "SELECT \n" +
                "  f_idrecord,\n" +
                "  f_idempresa,\n" +
                "  f_descripcion\n" +
                "FROM \n" +
                "  public.t_ingredientes where f_idempresa = $empresa ;";
        List list = sqlServices.getQuery(sql);
        return list;
    }

    def ListarComponentesOpcionesById(String empresa, String idrecord) {
        String sql = "SELECT\n" +
                "co.f_idrecord as f_idrecord,\n" +
                "p.f_descripcion as f_opcion,\n" +
                "COALESCE(co.f_qty,0) as f_cantidad,\n" +
                "co.f_idproducto_componente as f_idproducto_componente,\n" +
                "COALESCE(p.f_precio,0) as f_precio \n" +
                "from t_productos_com_opciones as co\n" +
                "INNER JOIN t_productos as p on p.f_idrecord = co.f_idproducto_componente\n" +
                "\n" +
                "WHERE co.f_idrecord = $idrecord \n" +
                "AND co.f_activo = true";

        List list = sqlServices.getQuery(sql);
        return list;
    }


    def ListarComponentesOpcionesByProducto(String empresa, String idproducto, String idcomponente) {
        String sql = "SELECT\n" +
                "co.f_idrecord as f_idrecord,\n" +
                "p.f_descripcion as f_opcion\n" +
                "from t_productos_com_opciones as co\n" +
                "INNER JOIN t_productos as p on p.f_idrecord = co.f_idproducto_componente\n" +
                "\n" +
                "WHERE co.f_idcomponente = $idcomponente and co.f_idproducto = $idproducto\n" +
                "AND co.f_activo = true";
        List list = sqlServices.getQuery(sql);
        return list;
    }

    def ListarProductosPorParametro(String empresa, String parametro) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HHmm")
        Date fecha_hoy = new Date();
        String hora = simpleDateFormat.format(fecha_hoy);
        String dia = sqlServices.GetDiaSemana(2.toLong());


        String sql = "  \n" +
                "  SELECT \n" +
                "  f_idrecord,\n" +
                "  f_idempresa,\n" +
                "  f_referencia,\n" +
                "  f_descripcion,\n" +
                "  f_controlinventario,\n" +
                "  f_idcategoria,\n" +
                "  COALESCE(f_reorden,0) as f_reorden,\n" +
                "  COALESCE(f_maxdescuento,0) as f_maxdescuento,\n" +
                // "  --get_precios_productos(f_idrecord,$empresa,$hora::text,$hora::text,$dia,$area) as f_precio,\n" +
                "  COALESCE( f_precio,0) as f_precio,\n" +
                "  COALESCE( f_ultimocosto,0) as f_ultimocosto,\n" +
                "  COALESCE(f_limiteminimo,0) as f_limiteminimo,\n" +
                "  COALESCE(f_limitemaximo,0) as f_limitemaximo,\n" +
                "  COALESCE(f_existencia,0) as f_existencia ,\n" +
                "  COALESCE(f_tax,0) as f_tax,\n" +
                "  f_fecha,\n" +
                "  COALESCE(f_makeup,0) as f_makeup,\n" +
                "  COALESCE( f_ultimocosto1,0) as f_ultimocosto1,\n" +
                "  COALESCE(f_ultimocosto2,0) as f_ultimocosto2,\n" +
                "  f_fecha_vencimiento,\n" +
                "  f_idlocalizacion,\n" +
                "  f_kit,\n" +
                "  f_descontinuado,\n" +
                "  f_mensaje,\n" +
                "  f_idunidad,\n" +
                "  f_plato,\n" +
                "  f_receta,\n" +
                "  COALESCE(f_tragos,0) as f_tragos,\n" +
                "  f_ventas_decimales,\n" +
                "  f_imprime_ingrediente\n" +
                "FROM \n" +
                "  public.t_productos where f_idempresa = $empresa ";

        if (!parametro.equals("")) {
            sql = sql + " and (f_descripcion ilike '$parametro%' or f_referencia ilike '$parametro%' )  ";
        }

        List list = sqlServices.getQuery(sql);

        return list;
    }

    def ListarCamarerosByParametros(String empresa, String parametro) {
        String sql = "SELECT \n" +
                "  f_idrecord,\n" +
                "  f_nombre,\n" +
                "  f_apellido,\n" +
                "  f_direccion,\n" +
                "  f_cedula,\n" +
                "  f_activo,\n" +
                "  f_camarero_activo,\n" +
                "  f_id_area,\n" +
                "  f_id_usuario,\n" +
                "  f_idempresa\n" +
                "FROM \n" +
                "  public.t_camareros  where f_idempresa = $empresa and (f_nombre ILIKE '%$parametro%' or f_apellido ILIKE '%$parametro%') and f_activo = true;";

        List list = sqlServices.getQuery(sql);
        return list;
    }

    def ListarFacturasAbiertas(String empresa, String parametro) {

        //String sql=" from Tfacturas as b where b.fIdempresa=? and b.ffactura_abierta=true and b.fanulada=false";
        String sql = "SELECT \n" +
                "f.f_idrecord as f_idfactura,\n" +
                "m.f_descripcion as f_mesa,\n" +
                "a.f_nombre_area as f_area,\n" +
                "COALESCE(c.f_nombre,'') ||' '||COALESCE(c.f_apellido,'') as f_camarero,\n" +
                "COALESCE(f.f_cuenta,'') as f_nombre_cuenta,\n" +
                "COALESCE(f.f_total,0) as f_total,\n" +
                "f.f_mesa as f_idmesa,\n" +
                "m.f_id_area as f_idarea,\n" +
                "f.f_camarero as f_idcamarero\n" +
                "\n" +
                "FROM t_facturas as f\n" +
                "INNER JOIN t_mesas as m on m.f_idrecord = f.f_mesa \n" +
                "INNER JOIN t_camareros as c on c.f_idrecord = f.f_camarero\n" +
                "INNER JOIN t_areas as a on a.f_idrecord = m.f_id_area \n" +
                "WHERE f.f_idempresa = $empresa \n" +
                "and f.f_factura_abierta = true and f.f_anulada = false ";

        if (!parametro.equals("")) {
            sql = sql + " and f.f_cuenta ilike '%$parametro%' ";
        }


        List list = sqlServices.getQuery(sql);
        return list;
    }

    @Transactional
    def crearFacturaRestaurante(String IDvalue, Long idusuario, Long idempresa, BigDecimal tax, BigDecimal descuento, BigDecimal ley, BigDecimal subtotal, BigDecimal total, List tabla_detalles, Long idcamarero, Long idmesa, List ArrayListComponentes, BigDecimal extra, String nombre_cuenta, Boolean agregar_ceunta) {

        Long ID;

        Object[] params = [idempresa] as Object;
        Map empresa = sqlServices.getQueryMap("select * from cfg.t_empresas b where b.f_idrecord= ? ;", params);
        params = [3, empresa.f_idrecord.toString().toLong()] as Object
        Map tipoDocumentos = sqlServices.getQueryMap("select * from t_tiposdocumentos b where b.f_idordenador = ? and b.f_idempresa = ? ;", params);
        params = [idusuario, empresa.f_idrecord.toString().toLong()] as Object;
        Map user = sqlServices.getQueryMap("select * from t_usuarios as b where b.f_idrecord = ? and b.f_idempresa = ? ;", params);

        if (!IDvalue.equals('')) {
            ID = Long.valueOf(IDvalue);
            params = [ID] as Object;
            def orden = sqlServices.getQueryMap("select * from t_facturas b where b.f_idrecord = ? ", params);
            if (!orden.isEmpty()) {

                String nombre = '';
                if (agregar_ceunta) {
                    nombre = nombre_cuenta;
                }

                Object[] params_actualizar = [] as Object;
                String sql_actualizar = "update t_facturas set f_cuenta = ?,f_total = ?,f_total_extra = ?,f_subtotal = ?,f_descuento = ?,f_itebis = ?,f_porciento_ley = ? where f_idrecord = ?";
                params_actualizar = [nombre, total, extra, subtotal, descuento, tax, ley, ID] as Object;
                sqlServices.ejecutarQuery(sql_actualizar, params_actualizar);

                //Listamos todos los componentes por detalle
                List tdetalleFacturaList = GetDetalleFactura(empresa.f_idrecord.toString(), orden.f_idrecord.toString());

                for (Map<String, Object> detalle : tdetalleFacturaList) {
                    //Elimindamos todos los componente por detalle
                    String Sql = " delete  from  t_factura_detalle_componentes as b where b.f_iddetalle = " + detalle.get("f_idrecord").toString() + " ;";
                    sqlServices.ejecutarQuery(Sql);
                }

                //Eliminamos el detalle
                String Sql1 = " delete from public.t_detalle_factura  as d where d.f_idfactura =${orden.f_idrecord.toString()} and d.f_idempresa =${empresa.f_idrecord.toString()}";
                sqlServices.ejecutarQuery(Sql1);

                //Listamos todos los detalles enviado desde la app para su agregado a la base de datos
                List<Map<String, Object>> lista_detalles = tabla_detalles;
                //lista_detalles.size() + " este es el tamaño de la lista de detalles"
                lista_detalles.each { detalle ->
//                    Tproductos pr = Tproductos.findByIdAndFIdempresa(detalle.get("f_idproducto").toString().toLong(), empresa.id);
                    Object[] params_detalle = [detalle.f_idproducto.toString().toLong(), empresa.f_idrecord.toString().toLong()] as Object
                    Map pr = sqlServices.getQueryMap("select * from t_productos b where  b.f_idrecord = ? and b.f_idempresa = ? ", params_detalle);
                    if (pr) {
                        BigDecimal cant = detalle.getAt("f_cantidad").toString().toBigDecimal();
                        BigDecimal itebis = detalle.getAt("f_itbis").toString().toBigDecimal();
                        BigDecimal pre = detalle.getAt("f_precio").toString().toBigDecimal();
                        Boolean comandas = detalle.getAt("f_comanda").toString().toBoolean();
                        Long idcomanda = detalle.getAt("f_idcomanda").toString().toLong();

                        if (idcomanda == -1 || idcomanda.toString().equals("") || idcomanda.is(null))
                            idcomanda = sqlServices.GetIdComanda();

                        String sql_insert_detalle = "insert into t_detalle_factura(f_cantidad,f_idfactura,f_idproducto,f_itebis,f_precio,f_referencia,f_comanda,f_idcomanda,f_idempresa)" +
                                "values (?,?,?,?,?,?,?,?,?) returning * ";
                        params_detalle = [
                                cant,
                                orden.f_idrecord.toString().toLong(),
                                pr.f_idrecord.toString().toLong(),
                                itebis,
                                pre,
                                pr.f_referencia.toString(),
                                comandas,
                                idcomanda,
                                empresa.f_idrecord.toString().toLong()
                        ] as Object
                        Map det = sqlServices.getQueryMap(sql_insert_detalle, params_detalle);
                        List<Map<String, Object>> lista_componentes = ArrayListComponentes;

                        lista_componentes.each { tupla ->
                            Integer numero_fila = detalle.getAt("f_numero_fila").toString().toInteger()
                            if (numero_fila == tupla.getAt("fnumerofila").toString().toInteger()) {
                                sql_insert_detalle = "insert into t_factura_detalle_componentes(f_cantidad,f_cobrable,f_iddetalle,f_idprodcuto_componente, f_ingrediente, f_monto_cobrar) " +
                                        "values (?,?,?,?,?,?)";
                                params_detalle = [
                                        tupla.getAt("fCantidad").toString().toBigDecimal(),
                                        tupla.getAt("fCobrable").toString().toBoolean(),
                                        det.f_idrecord.toString().toLong(),
                                        tupla.getAt("fIdprodcutoComponente").toString().toLong(),
                                        tupla.getAt("fIngrediente").toString().toLong(),
                                        tupla.getAt("fMontoCobrar").toString().toBigDecimal()
                                ] as Object

                                sqlServices.ejecutarQuery(sql_insert_detalle, params_detalle);
                            }

                        }

                    }

                }

                return orden.f_idrecord.toString()
            } else {
                Integer numero = sqlServices.GetSecuencia(tipoDocumentos.f_tipodoc.toString(), empresa.f_idrecord.toString().toLong());
                String nombre = '';
                if (agregar_ceunta) {
                    nombre = nombre_cuenta + numero.toString();
                }

                String sql_insert_factura = "insert into t_facturas(" +
                        "f_numero_orden," +
                        "f_camarero," +
                        "f_modulo," +
                        "f_cancelada," +
                        "f_descuento," +
                        "f_factura_abierta," +
                        "f_facturada," +
                        "f_fecha_regstro_orden," +
                        "f_hecho_por," +
                        "f_idempresa," +
                        "f_itebis," +
                        "f_mesa," +
                        "f_porciento_ley," +
                        "f_subtotal," +
                        "f_tipo_documento_factura," +
                        "f_total," +
                        "f_total_extra," +
                        "f_anulada," +
                        "f_pagada," +
                        "f_devuelta," +
                        "f_cuenta," +
                        "f_asignada," +
                        "f_wholenum_cliente," +
                        "f_recibido" +
                        ")values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) returning *"
                Object[] params_factura = [
                        numero,
                        idcamarero,
                        2.toLong(),
                        false,
                        descuento,
                        true,
                        false,
                        sqlServices.GetNow(),
                        user.f_idrecord.toString().toLong(),
                        empresa.f_idrecord.toString().toLong(),
                        tax,
                        idmesa,
                        ley,
                        subtotal,
                        tipoDocumentos.f_tipodoc.toString(),
                        total,
                        extra,
                        false,
                        false,
                        0,
                        nombre,
                        false,
                        'CNull',
                        false
                ] as Object;
                Map a = sqlServices.getQueryMap(sql_insert_factura, params_factura);

                println(a);

                //Listamos todos los detalles enviado desde la app para su agregado a la base de datos
                List<Map<String, Object>> lista_detalles = tabla_detalles;
                //lista_detalles.size() + " este es el tamaño de la lista de detalles"
                lista_detalles.each { detalle ->
//                    Tproductos pr = Tproductos.findByIdAndFIdempresa(detalle.get("f_idproducto").toString().toLong(), empresa.id);
                    Object[] params_detalle = [detalle.f_idproducto.toString().toLong(), empresa.f_idrecord.toString().toLong()] as Object
                    Map pr = sqlServices.getQuery("select * from t_productos b where  b.f_idrecord = ? and b.f_idempresa = ? ", params_detalle).first();
                    if (pr) {
                        BigDecimal cant = detalle.getAt("f_cantidad").toString().toBigDecimal();
                        BigDecimal itebis = detalle.getAt("f_itbis").toString().toBigDecimal();
                        BigDecimal pre = detalle.getAt("f_precio").toString().toBigDecimal();
                        Boolean comandas = detalle.getAt("f_comanda").toString().toBoolean();
                        Long idcomanda = detalle.getAt("f_idcomanda").toString().toLong();

                        if (idcomanda == -1 || idcomanda.toString().equals("") || idcomanda.is(null))
                            idcomanda = sqlServices.GetIdComanda();

                        String sql_insert_detalle = "insert into t_detalle_factura(f_cantidad,f_idfactura,f_idproducto,f_itebis,f_precio,f_referencia,f_comanda,f_idcomanda,f_idempresa)" +
                                "values (?,?,?,?,?,?,?,?,?) returning * ";
                        params_detalle = [
                                cant,
                                a.f_idrecord.toString().toLong(),
                                pr.f_idrecord.toString().toLong(),
                                itebis,
                                pre,
                                pr.f_referencia.toString(),
                                comandas,
                                idcomanda,
                                empresa.f_idrecord.toString().toLong()
                        ] as Object
                        Map det = sqlServices.getQueryMap(sql_insert_detalle, params_detalle)
                        List<Map<String, Object>> lista_componentes = ArrayListComponentes;

                        lista_componentes.each { tupla ->
                            Integer numero_fila = detalle.getAt("f_numero_fila").toString().toInteger()
                            if (numero_fila == tupla.getAt("fnumerofila").toString().toInteger()) {
                                sql_insert_detalle = "insert into t_factura_detalle_componentes(f_cantidad,f_cobrable,f_iddetalle,f_idprodcuto_componente, f_ingrediente, f_monto_cobrar) " +
                                        "values (?,?,?,?,?,?)";
                                params_detalle = [
                                        tupla.getAt("fCantidad").toString().toBigDecimal(),
                                        tupla.getAt("fCobrable").toString().toBoolean(),
                                        det.f_idrecord.toString().toLong(),
                                        tupla.getAt("fIdprodcutoComponente").toString().toLong(),
                                        tupla.getAt("fIngrediente").toString().toLong(),
                                        tupla.getAt("fMontoCobrar").toString().toBigDecimal()
                                ] as Object
                                sqlServices.ejecutarQuery(sql_insert_detalle, params_detalle);
                            }

                        }

                    }

                }

                return a.f_idrecord.toString();

            }

        } else {
            Integer numero = sqlServices.GetSecuencia(tipoDocumentos.f_tipodoc.toString(), empresa.f_idrecord.toString().toLong());
            String nombre = '';
            if (agregar_ceunta) {
                nombre = nombre_cuenta + numero.toString();
            }

            String sql_insert_factura = "insert into t_facturas(" +
                    "f_numero_orden," +
                    "f_camarero," +
                    "f_modulo," +
                    "f_cancelada," +
                    "f_descuento," +
                    "f_factura_abierta," +
                    "f_facturada," +
                    "f_fecha_regstro_orden," +
                    "f_hecho_por," +
                    "f_idempresa," +
                    "f_itebis," +
                    "f_mesa," +
                    "f_porciento_ley," +
                    "f_subtotal," +
                    "f_tipo_documento_factura," +
                    "f_total," +
                    "f_total_extra," +
                    "f_anulada," +
                    "f_pagada," +
                    "f_devuelta," +
                    "f_cuenta," +
                    "f_asignada," +
                    "f_wholenum_cliente," +
                    "f_recibido" +
                    ")values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) returning *"
            Object[] params_factura = [
                    numero,
                    idcamarero,
                    2.toLong(),
                    false,
                    descuento,
                    true,
                    false,
                    sqlServices.GetNow(),
                    user.f_idrecord.toString().toLong(),
                    empresa.f_idrecord.toString().toLong(),
                    tax,
                    idmesa,
                    ley,
                    subtotal,
                    tipoDocumentos.f_tipodoc.toString(),
                    total,
                    extra,
                    false,
                    false,
                    0,
                    nombre,
                    false,
                    'CNull',
                    false
            ] as Object;
            Map a = sqlServices.getQueryMap(sql_insert_factura, params_factura);

            //Listamos todos los detalles enviado desde la app para su agregado a la base de datos
            List<Map<String, Object>> lista_detalles = tabla_detalles;
            //lista_detalles.size() + " este es el tamaño de la lista de detalles"
            lista_detalles.each { detalle ->
//                    Tproductos pr = Tproductos.findByIdAndFIdempresa(detalle.get("f_idproducto").toString().toLong(), empresa.id);
                Object[] params_detalle = [detalle.f_idproducto.toString().toLong(), empresa.f_idrecord.toString().toLong()] as Object
                Map pr = sqlServices.getQueryMap("select * from t_productos b where  b.f_idrecord = ? and b.f_idempresa = ? ", params_detalle);
                if (pr) {
                    BigDecimal cant = detalle.getAt("f_cantidad").toString().toBigDecimal();
                    BigDecimal itebis = detalle.getAt("f_itbis").toString().toBigDecimal();
                    BigDecimal pre = detalle.getAt("f_precio").toString().toBigDecimal();
                    Boolean comandas = detalle.getAt("f_comanda").toString().toBoolean();
                    Long idcomanda = detalle.getAt("f_idcomanda").toString().toLong();

                    if (idcomanda == -1 || idcomanda.toString().equals("") || idcomanda.is(null))
                        idcomanda = sqlServices.GetIdComanda();

                    String sql_insert_detalle = "insert into t_detalle_factura(f_cantidad,f_idfactura,f_idproducto,f_itebis,f_precio,f_referencia,f_comanda,f_idcomanda,f_idempresa)" +
                            "values (?,?,?,?,?,?,?,?,?) returning * ";
                    params_detalle = [
                            cant,
                            a.f_idrecord.toString().toLong(),
                            pr.f_idrecord.toString().toLong(),
                            itebis,
                            pre,
                            pr.f_referencia.toString(),
                            comandas,
                            idcomanda,
                            empresa.f_idrecord.toString().toLong()
                    ] as Object
                    Map det = sqlServices.getQueryMap(sql_insert_detalle, params_detalle);
                    List<Map<String, Object>> lista_componentes = ArrayListComponentes;

                    lista_componentes.each { tupla ->
                        Integer numero_fila = detalle.getAt("f_numero_fila").toString().toInteger()
                        if (numero_fila == tupla.getAt("fnumerofila").toString().toInteger()) {
                            sql_insert_detalle = "insert into t_factura_detalle_componentes(f_cantidad,f_cobrable,f_iddetalle,f_idprodcuto_componente, f_ingrediente, f_monto_cobrar) " +
                                    "values (?,?,?,?,?,?)";
                            params_detalle = [
                                    tupla.getAt("fCantidad").toString().toBigDecimal(),
                                    tupla.getAt("fCobrable").toString().toBoolean(),
                                    det.f_idrecord.toString().toLong(),
                                    tupla.getAt("fIdprodcutoComponente").toString().toLong(),
                                    tupla.getAt("fIngrediente").toString().toLong(),
                                    tupla.getAt("fMontoCobrar").toString().toBigDecimal()
                            ] as Object
                            sqlServices.ejecutarQuery(sql_insert_detalle, params_detalle);
                        }

                    }

                }

            }

            return a.f_idrecord.toString();


        }
    }


    def Anular_factura(Long id, Long empresa) {
        Object[] params = [id, empresa] as Object
        Map f = sqlServices.getQueryMap("select * from t_facturas b where f_idrecord =? and f_idempresa = ? ;", params);
        if (!f.isEmpty()) {
            params = [true, id, empresa] as Object;
            sqlServices.ejecutarQuery("update t_facturas set f_anulada = ?  where  f_idrecord = ? and f_idempresa = ? ;", params);
            params = [id] as Object;
            List tdetalleFacturaList = sqlServices.getQuery("select * from t_detalle_factura b where b.f_idfactura = ? ", params);
            tdetalleFacturaList.each { e ->
                params=[e.getAt("f_idrecord").toString().toLong()] as Object;
                String Sql = "delete from t_factura_detalle_componentes as b where b.f_iddetalle = ? ";
                sqlServices.ejecutarQuery(Sql, params);
            }
            params= [id] as Object;
            String Sql = "delete from t_detalle_factura as b where b.f_idfactura= ? ";
            sqlServices.ejecutarQuery(Sql, params);
        } else {
            return;
        }
    }


    def VerificarPermisos(String usuario, String password, String opcion, Long empresa) {
        Boolean retorno = false;

        Funciones funciones = new Funciones();
        Object[] params = [usuario, funciones.encodeAsMD5(password), empresa] as Object
        Map usuarios = sqlServices.getQueryMap("select * from t_usuarios b where b.f_username = ? and b.f_password = ? and b.f_idempresa = ? ;", params);

        if (!usuarios.isEmpty()) {
            switch (opcion) {
                case "1":
                    retorno = usuarios.f_cambio_precio ? usuarios.f_cambio_precio.toString().toBoolean() : false;
                    break
                case "2":
                    retorno = usuarios.f_abrir_caja ? usuarios.f_abrir_caja.toString().toBoolean() : false;
                    break
                case "3":
                    retorno = usuarios.f_descuento ? usuarios.f_descuento.toString().toBoolean() : false;
                    break
                case "4":
                    retorno = usuarios.f_factura_credito ? usuarios.f_factura_credito.toString().toBoolean() : false;
                    break
                case "5":
                    retorno = usuarios.f_cuadre ? usuarios.f_cuadre.toString().toBoolean() : false;
                    break
                case "6":
                    retorno = usuarios.f_estado_caja ? usuarios.f_estado_caja.toString().toBoolean() : false;
                    break
                case "7":
                    retorno = usuarios.f_factura_oficial ? usuarios.f_factura_oficial.toString().toBoolean() : false;
                    break
                case "8":
                    retorno = usuarios.f_anular_linea ? usuarios.f_anular_linea.toString().toBoolean() : false;
                    break
                case "9":
                    retorno = usuarios.f_recibo ? usuarios.f_recibo.toString().toBoolean() : false;
                    break
                case "10":
                    retorno = usuarios.f_porciento_ley ? usuarios.f_porciento_ley.toString().toBoolean() : false;
                    break
                case "11":
                    retorno = usuarios.f_taxfree ? usuarios.f_taxfree.toString().toBoolean() : false;
                    break
                case "12":
                    retorno = usuarios.f_anular_factura ? usuarios.f_anular_factura.toString().toBoolean() : false;
                    break
            }
            return retorno.toString();
        }


    }


    def ListarActivarDesactivarCamarerosByParametros(String empresa, String parametro) {
        String sql = "SELECT \n" +
                "  f_idrecord,\n" +
                "  f_nombre,\n" +
                "  f_apellido,\n" +
                "  f_direccion,\n" +
                "  f_cedula,\n" +
                "  f_activo,\n" +
                "  f_camarero_activo,\n" +
                "  f_id_area,\n" +
                "  f_id_usuario,\n" +
                "  f_idempresa\n" +
                "FROM \n" +
                "  public.t_camareros  where f_idempresa = $empresa and (f_nombre ILIKE '%$parametro%' or f_apellido ILIKE '%$parametro%') ";
        List list = sqlServices.getQuery(sql);
        return list;
    }

    def ActivarCamarero(String idcamarero, String activo, Long empresa) {
        Object[] params = [idcamarero.toLong(), empresa] as Object;
        Map tcamareros = sqlServices.getQueryMap("select * from t_camareros b where b.f_idrecord = ? and b.f_idempresa = ? ;", params);
        if (!tcamareros.isEmpty()) {
            params = [activo.toBoolean(), idcamarero.toLong(), empresa] as Object;
            sqlServices.ejecutarQuery("update t_camareros set f_activo  = ? where f_idrecord = ? and f_idempresa = ? ;", params)
        }
    }


    def crear_cuadre_cajero(String idusuario, Long empresa) {
        String sql = "select generar_cuadre_cajero(${idusuario},${empresa}) as f_idrecord";
        Map map = sqlServices.getQueryMap(sql);
        sql = "SELECT \n" +
                "       emp.f_nombre as f_nombre_empresa,\n" +
                "       emp.f_web as f_web,\n" +
                "       emp.f_header_facturas_pequenas as f_header_factura_pequena,\n" +
                "       COALESCE(emp.f_mensaje_factura,'') as f_mensaje_factura,\n" +
                "       COALESCE(usr.f_nombre,'')||' '||COALESCE(usr.f_apellido,'') as f_usuario_cajero,\n" +
                "       c.*\n" +
                "     FROM t_cuadre_cajero c\n" +
                "     INNER JOIN cfg.t_empresas as emp on emp.f_idrecord = c.f_idempresa\n" +
                "     INNER JOIN t_usuarios as usr on usr.f_idrecord = c.f_cajero\n" +
                "     WHERE c.f_idrecord = ${map.f_idrecord.toString()} and c.f_idempresa =${empresa} ";
        return sqlServices.getQuery(sql);
    }

    def ListarNCF(String empresa) {
        String sql = "SELECT \n" +
                "  f_idrecord,\n" +
                "  f_descripcion,\n" +
                "  f_tipo,\n" +
                "  f_reorden,\n" +
                "  f_secuencia_solicitada,\n" +
                "  f_secuencia,\n" +
                "  f_visible,\n" +
                "  f_idempresa,\n" +
                "  f_orden,\n" +
                "  f_cobra_itebis\n" +
                "FROM \n" +
                "  public.t_ncf  where  f_idempresa = $empresa order by f_orden asc;";

        List list = sqlServices.getQuery(sql);
        return list;
    }

    def ListarTipoTarjetas(String empresa) {
        String sql = "SELECT \n" +
                "  f_idrecord,\n" +
                "  f_descripcion\n" +
                "FROM \n" +
                "  public.t_tipo_tarjeta order by f_descripcion asc;";

        List list = sqlServices.getQuery(sql);
        return list;
    }

    def ListarClientesById(String empresa, String idrecord) {
        String sql = "SELECT \n" +
                "  f_idrecord,\n" +
                "  f_idempresa,\n" +
                "  f_nombre,\n" +
                "  f_apellido,\n" +
                "  f_direccion,\n" +
                "  f_idcompania,\n" +
                "  f_codigo_cliente,\n" +
                "  f_limite_credito_compania,\n" +
                "  f_limite_credito,\n" +
                "  f_balance,\n" +
                "  f_tiene_credito,\n" +
                "  f_empresa,\n" +
                "  f_fecha,\n" +
                "  f_cedula,\n" +
                "  f_password,\n" +
                "  f_accesoweb,\n" +
                "  f_email_principal,\n" +
                "  f_usuario,\n" +
                "  f_fecha_nacimiento\n" +
                "FROM \n" +
                "  public.t_clientes  where f_idempresa = $empresa  and f_idrecord = $idrecord";

        //println sql;
        List list = sqlServices.getQuery(sql);
        return list;
    }


    def ListarClientesByParametros(String empresa, String parametros) {
        String sql = "SELECT \n" +
                "  f_idrecord,\n" +
                "  f_idempresa,\n" +
                "  f_nombre,\n" +
                "  f_apellido,\n" +
                "  f_direccion,\n" +
                "  f_idcompania,\n" +
                "  f_codigo_cliente,\n" +
                "  f_limite_credito_compania,\n" +
                "  f_limite_credito,\n" +
                "  f_balance,\n" +
                "  f_tiene_credito,\n" +
                "  f_empresa,\n" +
                "  f_fecha,\n" +
                "  f_cedula,\n" +
                "  f_password,\n" +
                "  f_accesoweb,\n" +
                "  f_email_principal,\n" +
                "  f_usuario,\n" +
                "  f_fecha_nacimiento\n" +
                "FROM \n" +
                "  public.t_clientes  where f_idempresa = $empresa  ";

        if (!parametros.equals("")) {
            sql = sql + " and ( f_nombre ilike '%$parametros%' ";
            sql = sql + " or f_apellido ilike '%$parametros%' ";


            sql = sql + " )";
        }

        List list = sqlServices.getQuery(sql);
        return list;
    }


    def cerrarFactura(String IDvalue, Long idusuario, Long idempresa, BigDecimal tax, BigDecimal descuento, BigDecimal ley, BigDecimal subtotal, BigDecimal total, List tabla_detalles, Long idcamarero, Long idmesa, List ArrayListComponentes, BigDecimal extra, String nombre_cuenta, Boolean agregar_ceunta, Long tipo_pago, Long idcliente, BigDecimal devuelta, Long tipo_ncf, Long tipo_tarjeta, BigDecimal propina, String numero_autorizacion, BigDecimal monto_tarjeta, BigDecimal monto_efectivo,String razon_social,String rnc) {

        Long ID;


        Object[] params = [idempresa] as Object;
        Map empresa = sqlServices.getQueryMap("select * from cfg.t_empresas b where b.f_idrecord= ? ;", params);
        params = [idusuario, empresa.f_idrecord.toString().toLong()] as Object;
        Map user = sqlServices.getQueryMap("select * from t_usuarios as b where b.f_idrecord = ? and b.f_idempresa = ? ;", params);
        String idfactura = crearFacturaRestaurante(
                IDvalue,
                user.f_idrecord.toString().toLong(),
                empresa.f_idrecord.toString().toLong(),
                tax,
                descuento,
                ley,
                subtotal,
                total,
                tabla_detalles,
                idcamarero,
                idmesa,
                ArrayListComponentes,
                extra,
                nombre_cuenta,
                agregar_ceunta
        );

        params = [idfactura.toLong(), empresa.f_idrecord.toString().toLong()] as Object
        Map orden = sqlServices.getQueryMap("select * from t_facturas b where b.f_idrecord = ? and b.f_idempresa = ?;", params);
        String numero_ncf = sqlServices.Get_Secuencia_Ncf(tipo_ncf.toInteger());
        Map tipoDocumentos;

        Object[] params_actualizar = [] as Object;
        Object[] params_tipo_doc = [] as Object

        if (tipo_pago == 0 || tipo_pago == 1) {
            String sql_actualizar_orden = "update t_facturas " +
                    "set f_pagada = ?," +
                    "f_tipo_ncf = ?," +
                    "f_numero_ncf = ?," +
                    "f_fecha_registro_factura = now()," +
                    "f_factura_abierta = ?," +
                    "f_facturado_por = ?," +
                    "f_monto_efectivo =  ?," +
                    "f_razon_social =  ?," +
                    "f_rnc =  ?" +
                    " where f_idrecord = ? and f_idempresa = ? ";

            params_actualizar = [
                    true,
                    tipo_ncf,
                    numero_ncf,
                    false,
                    idusuario,
                    monto_efectivo,
                    razon_social,
                    rnc,
                    idfactura.toLong(),
                    empresa.f_idrecord.toString().toLong()
            ] as Object;
            sqlServices.ejecutarQuery(sql_actualizar_orden, params_actualizar)

            if (monto_efectivo < total) {

                params_actualizar = [] as Object;
                sql_actualizar_orden = "update t_facturas set " +
                        "f_balance_pendiente = ?," +
                        "f_devuelta = ?," +
                        "f_numero_factura = ?," +
                        "f_facturado_por = ?," +
                        "f_tipo_documento_factura = ?," +
                        "f_razon_social = ?," +
                        "f_rnc = ?" +
                        " where f_idrecord = ? and f_idempresa = ?";

                params_tipo_doc = [4.toLong(), empresa.f_idrecord.toString().toLong()] as Object
                tipoDocumentos = sqlServices.getQueryMap("select * from t_tiposdocumentos where f_idordenador = ? and f_idempresa = ?", params_tipo_doc)

                params_actualizar = [
                        total - (monto_efectivo + monto_tarjeta),
                        0,
                        sqlServices.GetSecuencia(tipoDocumentos.f_tipodoc.toString(), empresa.f_idrecord.toString().toLong()),
                        idusuario,
                        tipoDocumentos.f_tipodoc.toString(),
                        razon_social,
                        rnc,
                        idfactura.toLong(),
                        empresa.f_idrecord.toString().toLong()
                ] as Object;

                sqlServices.ejecutarQuery(sql_actualizar_orden, params_actualizar)


                if (monto_tarjeta > 0) {

                    params_actualizar = [
                            propina,
                            user.f_idrecord.toString().toLong(),
                            orden.f_idrecord.toString().toLong(),
                            monto_tarjeta,
                            numero_autorizacion,
                            tipo_tarjeta
                    ] as Object;
                    sqlServices.ejecutarQuery("insert into t_pagos_tarjeta (f_propina,f_fecha,f_hechopor,f_idfactura,f_monto,f_autorizacion,f_tipotarjeta) " +
                            "values (?,now(),?,?,?,?,?);", params_actualizar);


                }
            } else {
                params_tipo_doc = [6.toLong(), empresa.f_idrecord.toString().toLong()] as Object
                tipoDocumentos = sqlServices.getQueryMap("select * from t_tiposdocumentos where f_idordenador = ? and f_idempresa = ?", params_tipo_doc)
                sql_actualizar_orden = "update t_facturas SET " +
                        " f_numero_factura = ?," +
                        "f_tipo_documento_factura = ?," +
                        " f_balance_pendiente = ?," +
                        " f_facturado_por = ?," +
                        " f_devuelta = ?, " +
                        " f_razon_social = ?, " +
                        " f_rnc = ? " +
                        " where f_idrecord = ? and f_idempresa = ?";

                params_actualizar = [
                        sqlServices.GetSecuencia(tipoDocumentos.f_tipodoc.toString(), empresa.f_idrecord.toString().toLong()).toLong(),
                        tipoDocumentos.f_tipodoc.toString(),
                        0,
                        idusuario,
                        devuelta,
                        razon_social,
                        rnc,
                        idfactura.toLong(),
                        empresa.f_idrecord.toString().toLong()
                ] as Object;
                sqlServices.ejecutarQuery(sql_actualizar_orden, params_actualizar)

                if (monto_tarjeta > 0) {

                    params_actualizar = [
                            propina,
                            user.f_idrecord.toString().toLong(),
                            orden.f_idrecord.toString().toLong(),
                            monto_tarjeta,
                            numero_autorizacion,
                            tipo_tarjeta] as Object

                    sqlServices.ejecutarQuery("insert into t_pagos_tarjeta (f_propina,f_fecha,f_hechopor,f_idfactura,f_monto,f_autorizacion,f_tipotarjeta) " +
                            "values (?,now(),?,?,?,?,?);", params_actualizar);
                }
            }
        }
        if (tipo_pago == 2) {
            /*   orden.setFpagada(true);
                orden.setfTipoNcf(tipo_ncf);
                orden.setfNumeroNcf(numero_ncf);
                orden.setfFechaRegistroFactura(sqlService.GetNow());
                orden.setFfactura_abierta(false);
                orden.setFmontoo_efectivo(monto_efectivo);
                orden.setfIdcliente(idcliente);
                orden.setFbalance_pendiente(total);
                orden.setFdevuelta(0);
                orden.setfFacturadoPor(idusuario);
                orden.setfWholeNumCliente('C'+idcliente);
                tipoDocumentos = TTipoDocumentos.findByFIdOrdenadorAndFidempresa(4.toLong(), empresa.id);
                orden.setfNumeroFactura(sqlService.GetSecuencia(tipoDocumentos.fsigla, empresa.id).toLong());
                orden.setfTipoDocumentoFactura(tipoDocumentos.fsigla);
                orden.save(failOnError: true);*/


            params_tipo_doc = [4.toLong(), empresa.f_idrecord.toString().toLong()] as Object
            tipoDocumentos = sqlServices.getQueryMap("select * from t_tiposdocumentos where f_idordenador = ? and f_idempresa = ?", params_tipo_doc)
            params_actualizar = [
                    true,
                    tipo_ncf,
                    numero_ncf,
                    sqlServices.GetNow(),
                    false,
                    monto_efectivo,
                    idcliente,
                    total,
                    0,
                    idusuario,
                    "C${idcliente}",
                    sqlServices.GetSecuencia(tipoDocumentos.f_tipodoc.toString(), empresa.f_idrecord.toString().toLong()).toLong(),
                    tipoDocumentos.f_tipodoc.toString(),
                    razon_social,
                    rnc,
                    orden.f_idrecord.toString().toLong(),
                    empresa.f_idrecord.toString().toLong()

            ] as Object;
            String sql_update_orden = "update t_facturas set " +
                    "f_pagada = ?," +
                    "f_tipo_ncf = ?," +
                    "f_numero_ncf = ?," +
                    "f_fecha_registro_factura = ?," +
                    "f_factura_abierta = ?," +
                    "f_monto_efectivo = ?," +
                    "f_idcliente = ?," +
                    "f_balance_pendiente = ?," +
                    "f_devuelta = ?," +
                    "f_facturado_por = ?," +
                    "f_wholenum_cliente = ?," +
                    "f_numero_factura = ?," +
                    "f_tipo_documento_factura = ?," +
                    "f_razon_social = ?," +
                    "f_rnc = ?" +
                    "where f_idrecord = ? and f_idempresa = ? ";
            sqlServices.ejecutarQuery(sql_update_orden, params_actualizar)

            /*

            def tipoDoc = TTipoDocumentos.findByFIdOrdenadorAndFidempresa(7.toLong(), empresa.id);
            def cxc = new TcuentaCobrar(
                    fBalance: total,
                    fMonto: total,
                    fNodoc: orden.id,
                    fFechaVencimiento: sqlService.GetNow(),
                    fIdempresa: empresa.id,
                    fAnulado: false,
                    fConcepto: 'FACTURA A CREDITO DESDE EL MODULO DE RESTAURANTE',
                    fFecha: sqlService.GetNow(),
                    fIdcliente: idcliente,
                    fNoexterno: orden.fTipoDocumentoFactura+orden.fNumeroFactura.toString().padLeft(6,'0'),
                    fPagado: false,
                    fRegistradopor: user.id,
                    fTipodoc: tipoDoc.fsigla.toUpperCase()
            );
            cxc.save(failOnError: true);*/

            String sql_insert_cxc = "insert into  cxc.t_cuenta_cobrar " +
                    "(f_balance,f_monto,f_nodoc,f_fecha_vencimiento,f_idempresa,f_anulado,f_concepto,f_fecha,f_idcliente,f_noexterno,f_pagado,f_registradopor,f_tipodoc)" +
                    "values " +
                    "(?,?,?,?,?,?,?,?,?,?,?,?,?)";



            params = [idfactura.toLong(), empresa.f_idrecord.toString().toLong()] as Object
            orden = sqlServices.getQueryMap("select * from t_facturas b where b.f_idrecord = ? and b.f_idempresa = ?;", params);

            params_tipo_doc = [7.toLong(), empresa.f_idrecord.toString().toLong()] as Object
            tipoDocumentos = sqlServices.getQueryMap("select * from t_tiposdocumentos where f_idordenador = ? and f_idempresa = ?", params_tipo_doc)
            params = [
                    total,
                    total,
                    sqlServices.GetSecuencia(tipoDocumentos.f_tipodoc.toString(), empresa.f_idrecord.toString().toLong()).toLong(),
                    sqlServices.GetNow(),
                    empresa.f_idrecord.toString().toLong(),
                    false,
                    'FACTURA A CREDITO DESDE EL MODULO DE RESTAURANTE',
                    sqlServices.GetNow(),
                    idcliente,
                    orden.f_tipo_documento_factura.toString() + orden.f_numero_factura.toString().padLeft(6, '0'),
                    false,
                    user.f_idrecord.toString().toLong(),
                    tipoDocumentos.f_tipodoc.toString()
            ] as Object
            sqlServices.ejecutarQuery(sql_insert_cxc, params)

        }
        return orden.f_idrecord.toString();
    }


    def ListarFacturaReimprimirById(String empresa, String idrecord, Boolean abierta) {

        String campo = "";
        String campo_fecha = "";
        String titulo = "";
        if (abierta) {
            campo = "fac.f_numero_orden";
            campo_fecha = "fac.f_fecha_regstro_orden";
            titulo = "Orden";
        } else {
            campo = "fac.f_numero_factura";
            campo_fecha = "fac.f_fecha_registro_factura";
            titulo = "Factura";
        }


        String sql = "select fac.f_tipo_documento_factura || to_char($campo, 'FM000000') as f_numero,\n" +
                "        COALESCE(to_char(fac.f_numero_factura, 'FM000000'),'') as f_numero1,\n" +
                "       to_char($campo_fecha, 'yyyy/MM/dd hh:mm') as f_fecha_registro_factura,\n" +
                "       cli.f_nombre || ' ' || cli.f_apellido as f_camarero,\n" +
                "       '$titulo' as f_titulo,\n" +
                "       de.f_idrecord as f_iddetalle,\n" +
                "       COALESCE(fac.f_total, 0) as f_total,\n" +
                "       COALESCE(fac.f_subtotal, 0) as f_subtotal,\n" +
                "       COALESCE(fac.f_porciento_ley, 0) as f_porciento_ley,\n" +
                "       COALESCE(fac.f_itebis, 0) as f_tax,\n" +
                "       COALESCE(fac.f_total_extra, 0) as f_extra,\n" +
                "       pr.f_referencia,\n" +
                "       pr.f_descripcion,\n" +
                "       de.f_cantidad,\n" +
                "       COALESCE(de.f_itebis, 0) as f_itebis,\n" +
                "       COALESCE(de.f_precio, 0) as f_precio,\n" +
                "       COALESCE(fac.f_numero_ncf, '') as f_numero_ncf,\n" +
                "       COALESCE(ncf.f_descripcion, '') as f_descripcion_ncf,\n" +
                "       COALESCE(fac.f_descuento, 0) as f_descuento,\n" +
                "       COALESCE(fac.f_envio, 0) as f_envio,\n" +
                "       m.f_descripcion as f_mesa,\n" +
                "       u.f_nombre || ' ' || u.f_apellido as f_cajero,\n" +
                "       COALESCE(fac.f_monto_efectivo, 0) as f_monto_efectivo,\n" +
                "       COALESCE(fac.f_devuelta, 0) as f_devuelta,\n" +
                "       COALESCE(pt.f_monto, 0) as f_monto_tarjeta,\n" +
                "       COALESCE(pt.f_propina, 0) as f_propina,\n" +
                "       COALESCE(de.f_itebis, 0) as f_itebis_producto,\n" +
                "       emp.f_nombre as f_nombre_empresa,\n" +
                "       emp.f_web as f_web,\n" +
                "       coalesce(fac.f_razon_social,'') as f_razon_social,\n" +
                "       coalesce(fac.f_rnc,'') as f_rnc,\n" +
                "       emp.f_header_facturas_pequenas as f_header_factura_pequena,\n" +
                "       COALESCE(emp.f_mensaje_factura,'') as f_mensaje_factura,\n" +
                "       get_componentes_detalles_impresion_json(de.f_idrecord) as f_componentes,\n" +
                "       emp.f_mensaje_orden as f_mensaje_orden,\n" +
                "       COALESCE(cliente.f_nombre,'') as f_cliente,\n" +
                "       COALESCE(fac.f_observacion,'') as f_observacion,\n" +
                "       COALESCE(cli.f_direccion,'') as f_direccion\n" +
                "FROM t_facturas as fac\n" +
                "     INNER join t_detalle_factura as de on fac.f_idrecord = de.f_idfactura\n" +
                "     LEFT join t_camareros as cli on cli.f_idrecord = fac.f_camarero\n" +
                "     INNER join t_productos as pr on pr.f_idrecord = de.f_idproducto\n" +
                "     LEFT JOIN t_mesas as m on m.f_idrecord = fac.f_mesa\n" +
                "     LEFT JOIN t_pagos_tarjeta pt on pt.f_idfactura = fac.f_idrecord\n" +
                "     LEFT join t_usuarios as u on u.f_idrecord = fac.f_hecho_por\n" +
                "     INNER JOIN cfg.t_empresas as emp on emp.f_idrecord = fac.f_idempresa\n" +
                "     LEFT JOIN t_ncf as ncf on fac.f_tipo_ncf = ncf.f_idrecord\n" +
                "     LEFT JOIN v_clientes as cliente on cliente.f_wholenum = fac.f_wholenum_cliente \n" +
                "     WHERE " +
                "     fac.f_idrecord = $idrecord " +
                "     and fac.f_idempresa='$empresa' ";
        println sql;

        List list = sqlServices.getQuery(sql);
        return list;
    }


    def ListarFacturasReimprimir(String empresa, String parametro, Boolean abierta, String fecha1, String fecha2) {

        //String sql=" from Tfacturas as b where b.fIdempresa=? and b.ffactura_abierta=true and b.fanulada=false";

        String campo_numero = "";
        if (!abierta) {
            campo_numero = " f.f_tipo_documento_factura || to_char(f.f_numero_factura, 'FM000000') as f_numero, ";
        } else {
            campo_numero = " f.f_tipo_documento_factura || to_char(f.f_numero_orden, 'FM000000') as f_numero, ";
        }

        String sql = "SELECT \n" +
                "f.f_idrecord as f_idfactura,\n" +
                "$campo_numero\n" +
                "m.f_descripcion as f_mesa,\n" +
                "a.f_nombre_area as f_area,\n" +
                "COALESCE(c.f_nombre,'') ||' '||COALESCE(c.f_apellido,'') as f_camarero,\n" +
                "COALESCE(f.f_cuenta,'') as f_nombre_cuenta,\n" +
                "COALESCE(f.f_total,0) as f_total,\n" +
                "f.f_mesa as f_idmesa,\n" +
                "m.f_id_area as f_idarea,\n" +
                "f.f_camarero as f_idcamarero\n" +
                "\n" +
                "FROM t_facturas as f\n" +
                "INNER JOIN t_mesas as m on m.f_idrecord = f.f_mesa \n" +
                "INNER JOIN t_camareros as c on c.f_idrecord = f.f_camarero\n" +
                "INNER JOIN t_areas as a on a.f_idrecord = m.f_id_area \n" +
                "WHERE f.f_idempresa = $empresa \n" +
                "and f.f_factura_abierta = $abierta and f.f_anulada = false ";

        if (!parametro.equals("")) {

            sql = sql + " and (f.f_cuenta ilike '%$parametro%' ";
            if (!abierta) {
                sql = sql + " or f.f_numero_factura::text = '${parametro}' ";
            } else {
                sql = sql + " or f.f_numero_orden::text = '${parametro}'";
            }

            sql = sql + " or  (c.f_nombre ||' '||c.f_apellido) ilike '%$parametro%' )";
        }

        if (!fecha1.equals("") && !fecha2.equals("")) {
            if (!abierta) {
                sql = sql + " and f.f_fecha_registro_factura::date BETWEEN '$fecha1'::date and '$fecha2'::date \n";
            } else {
                sql = sql + " and f.f_fecha_regstro_orden::date  BETWEEN '$fecha1'::date and '$fecha2'::date \n";
            }
        } else {
            if (!fecha1.equals("")) {
                if (!abierta) {
                    sql = sql + " and f.f_fecha_registro_factura::date >= '$fecha1'::date \n";
                } else {
                    sql = sql + " and f.f_fecha_regstro_orden::date  >= '$fecha1'::date \n";
                }
            } else if (!fecha2.equals("")) {
                if (!abierta) {
                    sql = sql + " and f.f_fecha_registro_factura::date <= '$fecha2'::date \n";
                } else {
                    sql = sql + " and f.f_fecha_regstro_orden::date  <= '$fecha2'::date \n";
                }
            }
        }

        if (!abierta) {
            sql = sql + " order by f.f_fecha_registro_factura desc \n";
        } else {
            sql = sql + " order by  f.f_fecha_regstro_orden::date desc \n";
        }


        List list = sqlServices.getQuery(sql);
        return list;
    }


    def UnirMesas(String empresa, String mesa_principal, String mesa_secundaria) {

        sqlServices.BeginWork();
        String sql = " update t_facturas  set f_mesa = $mesa_principal where f_idempresa = $empresa and f_mesa = $mesa_secundaria  "
        sqlServices.ejecutarQuery(sql);
        sqlServices.CommitWork()


    }

    def GetOrdernsToday(String empresa) {
        String sql = "select  COALESCE (em.f_nombre||' '||em.f_apellido,c.f_nombre||' '||c.f_apellido) as f_empresa,fa.f_tipo_documento_factura||to_char(fa.f_numero_orden,'FM000000') as f_wholenum,fa.*,c.f_nombre||' '||c.f_apellido as f_cliente,coalesce(me.f_descripcion,'') as f_nombre_mesa from t_facturas fa\n" +
                "left join t_clientes c on c.f_idrecord=fa.f_idcliente" +
                " left join t_clientes em on em.f_idrecord=c.f_idcompania" +
                " left join t_mesas as me on me.f_idrecord=fa.f_mesa" +
                " where fa.f_idempresa=$empresa and fa.f_facturada=false and fa.f_cancelada=false and fa.f_fecha_regstro_orden::date = CURRENT_DATE"
        List<Map<String, Object>> lista = sqlServices.getQuery(sql);
        return lista;
    }


    def GetProductsByOrder(Long idorden, Long empresa) {

        String sql = "select df.f_idrecord,df.f_idproducto,p.f_descripcion,df.f_cantidad,df.f_precio,df.f_comanda,coalesce(df.f_idcomanda,-1) as f_idcomanda from t_detalle_factura df\n" +
                "left join t_productos p on p.f_idrecord=df.f_idproducto\n" +
                "where df.f_idfactura=$idorden and df.f_idempresa = $empresa";
        List<Map<String, Object>> lista = sqlServices.getQuery(sql);
        return lista;
    }


    def GetComponentsByOrderDetail(Long idrecord) {
        List<Map<String, Object>> lista = sqlServices.getQuery("select p.f_descripcion,dt.* from t_factura_detalle_componentes dt\n" +
                "left join t_productos p on p.f_idrecord=dt.f_idprodcuto_componente\n" +
                "where dt.f_ingrediente=1 and dt.f_iddetalle=$idrecord and dt.f_cobrable=false\n" +
                "order by dt.f_ingrediente,dt.f_cobrable");
        return lista;
    }

    def List<Map<String, Object>> GetComponentsExtrasByOrderDetail(Long idrecord) {
        List<Map<String, Object>> lista = sqlServices.getQuery("select p.f_descripcion,dt.* from t_factura_detalle_componentes dt\n" +
                "left join t_productos p on p.f_idrecord=dt.f_idprodcuto_componente\n" +
                "where dt.f_ingrediente=1 and dt.f_iddetalle=$idrecord and dt.f_cobrable=true\n" +
                "order by dt.f_ingrediente,dt.f_cobrable");
        return lista;
    }

    def List<Map<String, Object>> GetIngredientsByOrderDetail(Long idrecord) {
        List<Map<String, Object>> lista = sqlServices.getQuery("select p.f_descripcion,dt.* from t_factura_detalle_componentes dt\n" +
                "left join t_ingredientes p on p.f_idrecord=dt.f_idprodcuto_componente\n" +
                "where dt.f_ingrediente=2 and dt.f_iddetalle=$idrecord \n" +
                "order by dt.f_ingrediente,dt.f_cobrable");
        return lista;
    }


    def ListarDireccioneClientes(String telefono, String empresa) {
        String sql = "select \n" +
                "coalesce(cli.f_nombre,'')||' '||coalesce(cli.f_apellido,'') as f_nombre,\n" +
                "e.f_direccion,\n" +
                "e.f_idrecord as f_idrecord_direccion, \n" +
                "e.f_idcliente as f_idrecord," +
                "e.f_direccion_principal \n" +
                "FROM t_clientes_direcciones_envios as  e " +
                "INNER JOIN t_clientes as cli on cli.f_idrecord = e.f_idcliente " +
                "where e.f_idempresa = $empresa and cli.f_telefono = '$telefono' ";

        List list = sqlServices.getQuery(sql);
        return list;
    }

    def crearOrdenDelibery(String IDvalue, Long idcliente, BigDecimal tax, BigDecimal subtotal, BigDecimal total, BigDecimal total_extra, List<Map<String, Object>> tabla_detalles, String nota, Long tipo_ncf, Long idempresa, Long idusuario, String direccion_envio) {

        Long ID;


        Object[] params = [idempresa] as Object;
        Map empresa = sqlServices.getQueryMap("select * from cfg.t_empresas b where b.f_idrecord= ? ;", params);
        params = [idusuario, empresa.f_idrecord.toString().toLong()] as Object;
        Map user = sqlServices.getQueryMap("select * from t_usuarios as b where b.f_idrecord = ? and b.f_idempresa = ? ;", params);
        params = [3.toLong(), empresa.f_idrecord.toString().toLong()] as Object;
        Map tipoDocumentos = sqlServices.getQueryMap("select * from t_tiposdocumentos as b where b.f_idordenador= ? and b.f_idempresa = ? ;", params);


        Funciones funciones = new Funciones();
        Long compania;
        if (!IDvalue.equals('')) {
            ID = Long.valueOf(IDvalue);
            params[ID, idempresa] as Object
            def orden = sqlServices.getQueryMap("select * from t_facturas as b where b.f_idrecord = ? and b.f_idempresa = ?;", params);
            if (!orden.isEmpty()) {


            } else {

                Integer numero = sqlServices.GetSecuencia(tipoDocumentos.f_tipodoc.toString(), idempresa);

                String numero_comprobante = ''
                if (tipo_ncf != null) {
                    //numero_comprobante = sqlService.Get_Secuencia_Ncf(tipo_ncf.toInteger());
                }

                String sql_insert_factura = "insert into t_facturas " +
                        "(" +
                        "f_idempresa," +
                        "f_facturada," +
                        "f_cancelada," +
                        "f_fecha_regstro_orden," +
                        "f_hecho_por," +
                        "f_wholenum_cliente," +
                        "f_idcliente," +
                        "f_itebis," +
                        "f_numero_orden," +
                        "f_subtotal," +
                        "f_tipo_documento_factura," +
                        "f_total," +
                        "f_total_extra," +
                        "f_observacion," +
                        "f_tipo_ncf," +
                        "f_porciento_ley," +
                        "f_modulo," +
                        "f_factura_abierta," +
                        "f_anulada," +
                        "f_pagada," +
                        "f_numero_ncf," +
                        "f_asignada," +
                        "f_direccion_envio," +
                        "f_recibido" +
                        ")values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) returning *";
                params = [
                        idempresa,
                        false,
                        false,
                        sqlServices.GetNow(),
                        user.f_idrecord.toString().toLong(),
                        "C${idcliente}",
                        idcliente,
                        tax,
                        numero,
                        subtotal,
                        tipoDocumentos.f_tipodoc.toString(),
                        total,
                        total_extra,
                        nota,
                        tipo_ncf,
                        0.toString().toLong(),
                        3.toLong(),
                        false,
                        false,
                        false,
                        numero_comprobante,
                        false,
                        direccion_envio,
                        false
                ] as Object;

                Map a = sqlServices.getQueryMap(sql_insert_factura, params);

                tabla_detalles.each { item ->
                    params = [item.f_referencia.toString(), idempresa] as Object
                    Map pr = sqlServices.getQueryMap("select * from t_productos b where b.f_referencia = ? and b.f_idempresa = ?;", params);
                    if (!pr.isEmpty()) {

                        BigDecimal cantidad = item.getAt("f_cantidad").toString().toBigDecimal();
                        BigDecimal precio = item.getAt("f_precio").toString().toBigDecimal();
                        BigDecimal iitebis = item.getAt("f_tax").toString().toBigDecimal();
                        Boolean comanda = item.getAt("f_comanda").toString().toBoolean();
                        Long idcomanda = item.getAt("f_idcomanda").toString().toLong();

                        if (idcomanda == -1 || idcomanda.toString().equals("") || idcomanda.is(null))
                            idcomanda = sqlServices.GetIdComanda()

                        String sql_insert_detalle = "insert into t_detalle_factura (" +
                                "f_itebis," +
                                "f_cantidad," +
                                "f_idfactura," +
                                "f_idproducto," +
                                "f_precio," +
                                "f_referencia," +
                                "f_comanda," +
                                "f_idcomanda," +
                                "f_idempresa" +
                                ") values (?,?,?,?,?,?,?,?,?)";
                        params = [
                                iitebis,
                                cantidad,
                                a.f_idrecord.toString().toLong(),
                                pr.f_idrecord.toString().toLong(),
                                precio,
                                item.f_referencia.toString(),
                                comanda,
                                idcomanda,
                                idempresa
                        ]
                        sqlServices.ejecutarQuery(sql_insert_detalle, params);
                    }
                }
            }

        } else {

            Integer numero = sqlServices.GetSecuencia(tipoDocumentos.f_tipodoc.toString(), idempresa);

            String numero_comprobante = ''
            if (tipo_ncf != null) {
                //numero_comprobante = sqlService.Get_Secuencia_Ncf(tipo_ncf.toInteger());
            }

            String sql_insert_factura = "insert into t_facturas " +
                    "(" +
                    "f_idempresa," +
                    "f_facturada," +
                    "f_cancelada," +
                    "f_fecha_regstro_orden," +
                    "f_hecho_por," +
                    "f_wholenum_cliente," +
                    "f_idcliente," +
                    "f_itebis," +
                    "f_numero_orden," +
                    "f_subtotal," +
                    "f_tipo_documento_factura," +
                    "f_total," +
                    "f_total_extra," +
                    "f_observacion," +
                    "f_tipo_ncf," +
                    "f_porciento_ley," +
                    "f_modulo," +
                    "f_factura_abierta," +
                    "f_anulada," +
                    "f_pagada," +
                    "f_numero_ncf," +
                    "f_asignada," +
                    "f_direccion_envio," +
                    "f_recibido" +
                    ")values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) returning *";
            params = [
                    idempresa,
                    false,
                    false,
                    sqlServices.GetNow(),
                    user.f_idrecord.toString().toLong(),
                    "C${idcliente}",
                    idcliente,
                    tax,
                    numero,
                    subtotal,
                    tipoDocumentos.f_tipodoc.toString(),
                    total,
                    total_extra,
                    nota,
                    tipo_ncf,
                    0.toString().toLong(),
                    3.toLong(),
                    false,
                    false,
                    false,
                    numero_comprobante,
                    false,
                    direccion_envio,
                    false
            ] as Object;

            Map a = sqlServices.getQueryMap(sql_insert_factura, params);

            tabla_detalles.each { item ->
                params = [item.f_referencia.toString(), idempresa] as Object
                Map pr = sqlServices.getQueryMap("select * from t_productos b where b.f_referencia = ? and b.f_idempresa = ?;", params);
                if (!pr.isEmpty()) {

                    BigDecimal cantidad = item.getAt("f_cantidad").toString().toBigDecimal();
                    BigDecimal precio = item.getAt("f_precio").toString().toBigDecimal();
                    BigDecimal iitebis = item.getAt("f_tax").toString().toBigDecimal();
                    Boolean comanda = item.getAt("f_comanda").toString().toBoolean();
                    Long idcomanda = item.getAt("f_idcomanda").toString().toLong();

                    if (idcomanda == -1 || idcomanda.toString().equals("") || idcomanda.is(null))
                        idcomanda = sqlServices.GetIdComanda()

                    String sql_insert_detalle = "insert into t_detalle_factura (" +
                            "f_itebis," +
                            "f_cantidad," +
                            "f_idfactura," +
                            "f_idproducto," +
                            "f_precio," +
                            "f_referencia," +
                            "f_comanda," +
                            "f_idcomanda," +
                            "f_idempresa" +
                            ") values (?,?,?,?,?,?,?,?,?)";
                    params = [
                            iitebis,
                            cantidad,
                            a.f_idrecord.toString().toLong(),
                            pr.f_idrecord.toString().toLong(),
                            precio,
                            item.f_referencia.toString(),
                            comanda,
                            idcomanda,
                            idempresa
                    ]
                    sqlServices.ejecutarQuery(sql_insert_detalle, params);
                }
            }
        }
    }

    def  FacturarOrden(Long idorde,Long empresa,Long usuario,BigDecimal monto_envio)
    {
        Map factura= sqlServices.getQuery("SELECT * from t_facturas as d where d.f_idrecord = $idorde and d.f_idempresa = $empresa ").first();
        Map  tipoDocumentos=sqlServices.getQuery("SELECT  * from  t_tiposdocumentos as d where  d.f_idordenador = 1 and d.f_idempresa = $empresa").first();
        Boolean valor=false;

        if (!factura.isEmpty())
        {
            if (!factura.get("f_facturada").toString().toBoolean()==true)
            {
                Integer numero=sqlServices.GetSecuencia(tipoDocumentos.get("f_tipodoc").toString(),empresa.toLong()).toInteger();
                String  numero_comprobante = sqlServices.Get_Secuencia_Ncf(factura.get("f_tipo_ncf").toString().toInteger());
                String sql = "UPDATE t_facturas set " +
                        "f_facturada = true, " +
                        "f_numero_factura = $numero, " +
                        "f_tipo_documento_factura = '${tipoDocumentos.get("f_tipodoc").toString()}', " +
                        "f_fecha_registro_factura = now(), " +
                        "f_facturado_por =$usuario, " +
                        "f_envio =$monto_envio, " +
                        "f_numero_ncf = '${numero_comprobante}' where f_idrecord = $idorde and f_idempresa = $empresa returning f_idrecord";

                sqlServices.getQuery(sql);
                guardarEstado(idorde,5.toLong());
                valor=true;
            }
            else
            {
                valor=false;
            }
        }
        else
        {
            valor=false;
        }
        return valor;
    }

    def guardarEstado(Long idfactura,Long idestado) {
        String sql = "INSERT INTO t_pedidos_estatus" +
                "(" +
                "f_idestatus," +
                "f_idfactura," +
                "f_intervalo" +
                ") " +
                "values" +
                "(" +
                "${idestado}," +
                "${idfactura}," +
                "get_estatus_intervalo(${idfactura})" +
                ")";

        println(sql);
        sqlServices.ejecutarQuery(sql)
        return true
    }

    def ListarFacturaDeliveryReimprimirById(String empresa, String idrecord,Boolean abierta) {

        String campo = "";
        String campo_fecha = "";
        String titulo = "";
        if (abierta)
        {
            campo = "fac.f_numero_orden";
            campo_fecha = "fac.f_fecha_regstro_orden";
            titulo = "Orden";
        }else{
            campo = "fac.f_numero_factura";
            campo_fecha = "fac.f_fecha_registro_factura";
            titulo = "Factura";
        }
        String sql="select fac.f_tipo_documento_factura || to_char($campo, 'FM000000') as f_numero,\n" +
                "        COALESCE(to_char(fac.f_numero_factura, 'FM000000'),'') as f_numero1,\n" +
                "       to_char($campo_fecha, 'yyyy/MM/dd hh:mm') as f_fecha_registro_factura,\n" +
                "       cli.f_nombre || ' ' || cli.f_apellido as f_camarero,\n" +
                "       '$titulo' as f_titulo,\n" +
                "       de.f_idrecord as f_iddetalle,\n" +
                "       (COALESCE(fac.f_total, 0) + COALESCE(fac.f_envio, 0)) as f_total,\n" +
                "       COALESCE(fac.f_subtotal, 0) as f_subtotal,\n" +
                "       COALESCE(fac.f_porciento_ley, 0) as f_porciento_ley,\n" +
                "       COALESCE(fac.f_itebis, 0) as f_tax,\n" +
                "       COALESCE(fac.f_total_extra, 0) as f_extra,\n" +
                "       pr.f_referencia,\n" +
                "       pr.f_descripcion,\n" +
                "       de.f_cantidad,\n" +
                "       COALESCE(de.f_itebis, 0) as f_itebis,\n" +
                "       COALESCE(de.f_precio, 0) as f_precio,\n" +
                "       COALESCE(fac.f_numero_ncf, '') as f_numero_ncf,\n" +
                "       COALESCE(fac.f_descuento, 0) as f_descuento,\n" +
                "       m.f_descripcion as f_mesa,\n" +
                "       u.f_nombre || ' ' || u.f_apellido as f_cajero,\n" +
                "       COALESCE(fac.f_monto_efectivo, 0) as f_monto_efectivo,\n" +
                "       COALESCE(fac.f_devuelta, 0) as f_devuelta,\n" +
                "       COALESCE(pt.f_monto, 0) as f_monto_tarjeta,\n" +
                "       COALESCE(pt.f_propina, 0) as f_propina,\n" +
                "       COALESCE(de.f_itebis, 0) as f_itebis_producto,\n" +
                "       COALESCE(fac.f_envio, 0) as f_envio,\n" +
                "       emp.f_nombre as f_nombre_empresa,\n" +
                "       emp.f_web as f_web,\n" +
                "       coalesce(fac.f_razon_social,'') as f_razon_social,\n" +
                "       coalesce(fac.f_rnc,'') as f_rnc,\n" +
                "       COALESCE(fac.f_numero_ncf, '') as f_numero_ncf,\n" +
                "       COALESCE(ncf.f_descripcion, '') as f_descripcion_ncf,\n" +
                "       emp.f_header_facturas_pequenas as f_header_factura_pequena,\n" +
                "       COALESCE(emp.f_mensaje_factura,'') as f_mensaje_factura,\n" +
                "       get_componentes_detalles_impresion_json(de.f_idrecord) as f_componentes,\n" +
                "       emp.f_mensaje_orden as f_mensaje_orden,\n" +
                "       COALESCE(cliente.f_nombre,'') as f_cliente,\n" +
                "       COALESCE(fac.f_observacion,'') as f_observacion,\n" +
                "       COALESCE(fac.f_direccion_envio,'') as f_direccion\n" +
                "FROM t_facturas as fac\n" +
                "     INNER join t_detalle_factura as de on fac.f_idrecord = de.f_idfactura\n" +
                "     LEFT join t_camareros as cli on cli.f_idrecord = fac.f_camarero\n" +
                "     INNER join t_productos as pr on pr.f_idrecord = de.f_idproducto\n" +
                "     LEFT JOIN t_mesas as m on m.f_idrecord = fac.f_mesa\n" +
                "     LEFT JOIN t_pagos_tarjeta pt on pt.f_idfactura = fac.f_idrecord\n" +
                "     LEFT join t_usuarios as u on u.f_idrecord = fac.f_hecho_por\n" +
                "     INNER JOIN cfg.t_empresas as emp on emp.f_idrecord = fac.f_idempresa\n" +
                "     LEFT JOIN t_ncf as ncf on fac.f_tipo_ncf = ncf.f_idrecord\n" +
                "     LEFT JOIN v_clientes as cliente on cliente.f_wholenum = fac.f_wholenum_cliente \n" +
                "     WHERE " +
                "     fac.f_idrecord = $idrecord " +
                "     and fac.f_idempresa='$empresa' ";


        List list = sqlServices.getQuery(sql);
        return list;
    }



    def ListaCuentasPorCobrar(String empresa,String idcliente)
    {
        String sql = "\n" +
                "SELECT\n" +
                "cxc.f_idrecord as f_idrecord,\n" +
                "cxc.f_tipodoc||to_char(cxc.f_nodoc,'FM000000') as f_numero,\n" +
                "to_char(cxc.f_fecha::date,'yyyy/MM/dd') as f_fecha,\n" +
                "cxc.f_monto as f_monto,\n" +
                "cxc.f_balance as f_balance\n" +
                "FROM cxc.t_cuenta_cobrar as cxc \n" +
                "INNER JOIN t_clientes as cli on cli.f_idrecord = cxc.f_idcliente\n" +
                "WHERE cxc.f_idcliente = $idcliente  and cxc.f_idempresa = $empresa and cxc.f_pagado = false order by cxc.f_fecha asc ";
        List list = sqlServices.getQuery(sql);
        return list;
    }


    def crearOtrasCuentasPorCobrar(Long idcliente, Long idempresa, String numero_externo, Date fecha_vencimiento, String Concepto, BigDecimal Monto, Long idusuario)
    {

        Object[] params = [idempresa] as Object;
        Map empresa = sqlServices.getQueryMap("select * from cfg.t_empresas b where b.f_idrecord= ? ;", params);
        params = [idusuario, empresa.f_idrecord.toString().toLong()] as Object;
        Map user = sqlServices.getQueryMap("select * from t_usuarios as b where b.f_idrecord = ? and b.f_idempresa = ? ;", params);
        params = [7.toLong(), empresa.f_idrecord.toString().toLong()] as Object;
        Map tipoDocumentos = sqlServices.getQueryMap("select * from t_tiposdocumentos as b where b.f_idordenador= ? and b.f_idempresa = ? ;", params);

        Integer numero=sqlServices.GetSecuencia(tipoDocumentos.f_tipodoc.toString(),idempresa);
        String sql = "insert into cxc.t_cuenta_cobrar" +
                "(" +
                "f_tipodoc," +
                " f_nodoc," +
                " f_noexterno," +
                " f_fecha," +
                " f_monto," +
                " f_balance," +
                " f_idcliente," +
                " f_pagado," +
                " f_concepto," +
                " f_registradopor," +
                " f_anulado," +
                " f_fecha_vencimiento," +
                " f_idempresa" +
                ")values (?,?,?,?,?,?,?,?,?,?,?,?,?) RETURNING *";
        params = [
                tipoDocumentos.f_tipodoc.toString(),
                numero,
                numero_externo,
                sqlServices.GetNow(),
                Monto,
                Monto,
                idcliente,
                false,
                Concepto,
                idusuario,
                false,
                fecha_vencimiento,
                idempresa
        ] as Object;

        Map a = sqlServices.getQueryMap(sql,params);


        return a.f_idrecord.toString();

    }


    def ListarImprimirCuentaCobrar(String id,String empresa)
    {

        String sql ="SELECT \n" +
                "r.f_tipodoc||to_char(r.f_nodoc,'FM000000') as f_numero,\n" +
                "emp.f_header_facturas_pequenas as f_header_factura_pequena,\n" +
                "emp.f_nombre as f_nombre_empresa,\n" +
                "r.f_fecha as f_fecha,\n" +
                "r.f_fecha_vencimiento as f_fecha_vencimiento,\n" +
                "COALESCE(cli.f_nombre,'')||' '||COALESCE(cli.f_apellido,'') as f_cliente,\n" +
                "r.f_monto as f_total,\n" +
                "emp.f_mensaje_orden,\n" +
                "emp.f_web,\n" +
                "r.f_noexterno as f_noexterno\n" +
                "from cxc.t_cuenta_cobrar as r\n" +
                "INNER JOIN t_clientes as cli on cli.f_idrecord = r.f_idcliente\n" +
                "INNER JOIN cfg.t_empresas as emp on emp.f_idrecord = r.f_idempresa\n" +
                "WHERE r.f_idempresa = $empresa and r.f_idrecord = $id";
        return sqlServices.getQuery(sql);
    }


    def crearRecibos(Long idcliente, Long idempresa, String aplicado, Timestamp fecha, String Concepto, Double Monto, List<Map<String,Object>> tabla,Long idusuario)
    {




        Object[] params = [idempresa] as Object;
        Map empresa = sqlServices.getQueryMap("select * from cfg.t_empresas b where b.f_idrecord= ? ;", params);
        params = [idusuario, empresa.f_idrecord.toString().toLong()] as Object;
        Map user = sqlServices.getQueryMap("select * from t_usuarios as b where b.f_idrecord = ? and b.f_idempresa = ? ;", params);
        params = [5.toLong(), empresa.f_idrecord.toString().toLong()] as Object;
        Map tipoDocumentos = sqlServices.getQueryMap("select * from t_tiposdocumentos as b where b.f_idordenador= ? and b.f_idempresa = ? ;", params);
        Integer numerorecibo=sqlServices.GetSecuencia(tipoDocumentos.f_tipodoc.toString(),empresa.f_idrecord.toString().toLong());
        params = [idcliente,idempresa] as Object
        Map cliente=sqlServices.getQueryMap("select * from t_clientes b where b.f_idrecord = ? and b.f_idempresa = ?;",params);

        String sql ="insert into t_recibos (" +
                "f_idempresa," +
                " f_fecha," +
                " f_idcliente," +
                " f_numrecibo," +
                " f_concepto," +
                " f_monto," +
                " f_aplicado," +
                " f_tiporecibo," +
                " f_descargado" +
                ") values (?,?,?,?,?,?,?,?,?) returning *;";
        params = [
                idempresa,
                fecha,
                idcliente,
                numerorecibo,
                Concepto,
                Monto,
                aplicado,
                tipoDocumentos.f_tipodoc.toString(),
                false

        ] as Object
       Map a = sqlServices.getQueryMap(sql,params);

        tabla.each { item ->
            Long fact=item.get("f_idrecord").toString().toLong();
            params = [fact,idempresa] as Object
            println(params)
            Map cobrar = sqlServices.getQueryMap("select * from cxc.t_cuenta_cobrar b where b.f_idrecord =? and b.f_idempresa = ?",params);
            if (!cobrar.isEmpty()){
                BigDecimal a1=item.get("f_monto").toString().toBigDecimal();
                BigDecimal a2=0.00;
                BigDecimal monto=0.00;
                a2=cobrar.f_balance.toString().toBigDecimal();
                monto=a2.toBigDecimal()-a1.toBigDecimal();
                params = [monto.toBigDecimal(),fact,idempresa] as Object

                sqlServices.ejecutarQuery("update cxc.t_cuenta_cobrar set f_balance = ? where f_idrecord = ? and f_idempresa = ? ",params);
                params = [
                        fact,
                        a.f_idrecord.toString().toLong(),
                        item.f_monto.toString().toBigDecimal(),
                        sqlServices.GetNow(),
                        item.f_concepto.toString()
                ] as Object
                sqlServices.ejecutarQuery("insert into cxc.t_aplicaciones" +
                        "(f_iddocumentoaplicado, f_iddocumentoaplico, f_monto, f_fecha, f_concepto) " +
                        "values (?,?,?,?,?)",params);
            }
        }

        return a.f_idrecord.toString();

    }


    def ListarImprimirRecibo(String id,String empresa)
    {
        String sql ="SELECT \n" +
                "r.f_tiporecibo||to_char(r.f_numrecibo,'FM000000') as f_numero,\n" +
                "emp.f_header_facturas_pequenas as f_header_factura_pequena,\n" +
                "emp.f_nombre as f_nombre_empresa,\n" +
                "r.f_fecha as f_fecha,\n" +
                "COALESCE(cli.f_nombre,'')||' '||COALESCE(cli.f_apellido,'') as f_cliente,\n" +
                "r.f_monto as f_total,\n" +
                "emp.f_mensaje_orden,\n" +
                "emp.f_web,\n" +
                "r.f_aplicado\n" +
                "from t_recibos as r\n" +
                "INNER JOIN t_clientes as cli on cli.f_idrecord = r.f_idcliente\n" +
                "INNER JOIN cfg.t_empresas as emp on emp.f_idrecord = r.f_idempresa\n" +
                "WHERE r.f_idempresa = $empresa and r.f_idrecord = $id";

        println(sql);
        return sqlServices.getQuery(sql);
    }

    def ListarReimprimirRecibos(String empresa,String desde,String hasta,String numero)
    {
        String sql ="SELECT \n" +
                "r.f_idrecord as f_idrecord,\n" +
                "r.f_tiporecibo||to_char(r.f_numrecibo,'FM000000') as f_numero,\n" +
                "emp.f_header_facturas_pequenas as f_header_factura_pequena,\n" +
                "emp.f_nombre as f_nombre_empresa,\n" +
                "r.f_fecha::date as f_fecha,\n" +
                "COALESCE(cli.f_nombre,'')||' '||COALESCE(cli.f_apellido,'') as f_cliente,\n" +
                "r.f_monto as f_total,\n" +
                "emp.f_mensaje_orden,\n" +
                "emp.f_web\n" +
                "from t_recibos  as r\n" +
                "INNER JOIN t_clientes as cli on cli.f_idrecord = r.f_idcliente\n" +
                "INNER JOIN cfg.t_empresas as emp on emp.f_idrecord = r.f_idempresa\n" +
                "WHERE r.f_idempresa = $empresa ";

        if (!numero.equals("")){
            sql+= " and r.f_numrecibo = $numero ";
        }
        if (!desde.equals("") && !hasta.equals("")){
            sql+= " and r.f_fecha::date BETWEEN '$desde'::date and '$hasta'::date \n ";
        }else {
            if (!desde.equals("")){
                sql+= " and r.f_fecha::date >= '$desde'::date \n ";
            }else if (!hasta.equals("")){
                sql+= " and r.f_fecha::date <= '$desde'::date \n ";
            }
        }
        return sqlServices.getQuery(sql);
    }

    def crearClienteDelibery(String IDvalue, String nombre, String direccion, String sector, String telefono, Long empresa,Long idcliente,Boolean principal){

        Collection collection = [];
        String sql=""
            collection.clear();
            collection.add(empresa);
            collection.add(idcliente);
            collection.add(direccion);
            collection.add(principal);
            collection.add(sqlServices.GetNow());
            collection.add(sector.toLong());
            sql ="INSERT INTO \n" +
                    "  public.t_clientes_direcciones_envios\n" +
                    "(\n" +
                    "  f_idempresa,\n" +
                    "  f_idcliente,\n" +
                    "  f_direccion,\n" +
                    "  f_direccion_principal,\n" +
                    "  f_fecha,\n" +
                    "  f_sector\n" +
                    ")\n" +
                    "VALUES (?,?,?,?,?,?);"
            sqlServices.ejecutarQuery(sql,collection.toArray());

    }

    def get_clientes_by_telefono(String telefono,Long idempresa){
        Collection collection = [];
        collection.add(idempresa);
        collection.add(telefono);
        String sql = " select * from t_clientes as cli where cli.f_idempresa = ? and cli.f_telefono = ? ";
        Map tClientes = sqlServices.getQueryMap(sql,collection.toArray());
        return tClientes;
        
    }
}
