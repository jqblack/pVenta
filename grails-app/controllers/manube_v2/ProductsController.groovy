package manube_v2

import grails.converters.JSON
import org.apache.commons.collections.map.HashedMap
import org.springframework.web.multipart.MultipartFile



class ProductsController {

    static allowedMethods = [
            store: 'POST',
            get_componentes: 'POST',
            get_lista_productos:'POST',
            get_producto: 'POST',
            uploadImage: 'POST',
            get_data_combo: 'POST',
            update_precio: 'POST'
    ]

    FuncionesSQLService funcionesSQLService
    ValidacionesService validacionesService

    def index() {

    }

    def cambiar_precio() {

    }

    def horario_precio() {

    }

    def get_componentes() {
        def componentes = Tcomponentes.list()

        Map<String, Object> data = new HashedMap<>()
        data.put('data', componentes)
        render data as JSON
    }

    def get_lista_productos()
    {

        List<Object> list = new ArrayList<Object>()

//       def productosList = Tproductos.findAllByFIdempresaAndFDescripcionIlike(session.user.fIdempresa, "%" + params.filtro.toString() + "%")
       def sql =" from Tproductos as p inner join TproductosCategorias as c on p.fIdcategoria = c.id " +
               "where p.fIdempresa = :id and (lower(p.fDescripcion) like :desc or p.fReferencia = :ref) order by p.fDescripcion ASC"
       def productosList = Tproductos.findAll(sql, [id: session.user.fIdempresa, desc: "%" + params.filtro.toString().toLowerCase() + "%", ref: params.filtro.toString()])

        productosList.each { row ->
            Map<String, Object> producto = new HashMap<String, Object>()
            producto.put("id", row[0].id)
            producto.put("fReferencia", row[0].fReferencia)
            producto.put("fPrecio", row[0].fPrecio)
            producto.put("fUltimocosto", row[0].fUltimocosto)
            producto.put("fDescripcion", row[0].fDescripcion)
            producto.put("fIdcategoria", row[0].fIdcategoria)
            producto.put("categoria", row[1].fDescripcion)
            producto.put("fTax", row[0].fTax)
            producto.put("fMakeup", row[0].fMakeup)
            producto.put("fControlinventario", row[0].fControlinventario)
            producto.put("hasHorarioPrecio", (TproductosPrecios.findAllByFIdproducto(row.id)) ? true: false)
            list.add(producto)
        }
        render list as JSON
    }


    def get_producto()
    {
       Map<Object> data = new HashMap<Object>()
        List<Object> componentes_detalle = new ArrayList<Object>()

        List<Object> fotos_list = new ArrayList<Object>()
       def producto = Tproductos.findById(params.id.toString().toLong())
       def fotos = TproductosFotos.findAllByFIdproducto(params.id.toString().toLong())

        fotos.each { row ->
            Map<String, Object> fotos_base64 = new HashMap<String, Object>()
            fotos_base64.put("fFoto", row.fFoto.encodeBase64().toString())
            fotos_base64.put("fMenu", row.fMenu)
            fotos_list.add(fotos_base64)
        }

       def sql_componentes = " from Tcomponentes as c inner join TproductosComponentes as pc on c.id = pc.fIdcomponente " +
               "where pc.fIdproducto = :id"

        def sql_componente_detalle = " from TproductosComOpciones as c " +
                " inner join Tproductos as p on p.id = c.fIdproducto" +
               " where c.fIdproductoComponente = :id"

       def sql_precios = " from TproductosPrecios as p inner join Tareas as a on p.fIdarea = a.id where p.fIdproducto = :id"


       def componentes = TproductosComponentes.findAll(
               sql_componentes, [id: params.id.toString().toLong()]
       )

        componentes.each { row ->

            componentes_detalle.add(TproductosComOpciones
                    .findAll(sql_componente_detalle, [id: row.id[1]]
            ))

        }

       def precios = TproductosPrecios
               .findAll(sql_precios, [id: params.id.toString().toLong()])

       data.put("producto", producto)
       data.put("componentes", componentes)
       data.put("fotos", fotos_list)
       data.put("componentes_detalle", componentes_detalle)
       data.put("precios", precios)
       render data as JSON
    }

    def uploadImage(){
        MultipartFile file = params.foto as MultipartFile
        render file.getBytes().encodeAsBase64()
    }

    def get_data_combo()
    {
        Map<String, Object> data = new HashMap<String, Object>()


        data.put('categorias', funcionesSQLService.listaCategorias(session.user.fIdempresa))
        data.put('localizaciones', funcionesSQLService.listaLocalizaciones(session.user.fIdempresa))
        data.put('unidades', funcionesSQLService.listaUnidades(session.user.fIdempresa))
        data.put('areas', funcionesSQLService.listaAreas(session.user.fIdempresa))
        data.put('secciones', funcionesSQLService.listaSecciones(session.user.fIdempresa))

        render data as JSON
    }

    def store()
    {


        def data = JSON.parse(params.data)
        //println(data)
        def errorsTablaPrecios
        def errorsProducto
        def uploadImageerrorsTablaComponentesProductos

        Map<String, Object> response_data = new HashMap<String, Object>()
        Map<String, Object> errors = new HashMap<String, Object>()

        if (data.precios) {
            errorsTablaPrecios = validacionesService.validarListaPrecios(data.precios)
            if (errorsTablaPrecios.size() > 0)
            {
                errors.put("errorsTablaPrecios", errorsTablaPrecios)
            }

        }
        if (data.productos_componentes)
        {
            errorsTablaComponentesProductos = validacionesService.validarListaComponentesProductos(data.productos_componentes)
            if (errorsTablaComponentesProductos.size() > 0)
            {
                errors.put("errorsTablaComponentesProductos", errorsTablaComponentesProductos)
            }
        }
        errorsProducto =  validacionesService.validarProducto(data,session.user.fIdempresa as Long)
        if (errorsProducto.size() > 0)
        {
            errors.put("errorsProducto", errorsProducto)
        }
        if (errors.size() > 0)
        {
            render errors as JSON
            return ;
        }


        def NProducto = funcionesSQLService.guardarProducto(data, session.user.fIdempresa as Long)

        if (NProducto)
        {
            response_data.put("success", true)
            render response_data as JSON
        }
        else{
            response_data.put("success", false)
            render response_data as JSON
        }
    }

    def update_precio()
    {
        Map<String, Object> response_data = new HashMap<String, Object>()
        Map<String, Object> errors = new HashMap<String, Object>()
        List<Object> list = new ArrayList<Object>()

        def data
        data = JSON.parse(params.data)
//
//        if (data)
//        {
        if (data.precio.toString().toBigDecimal() < 0)
        {
            list.add("El precio no puede ser menor a 0.")
        }

        if (data.precio.toString().equals(""))
        {
            list.add("El campo precio es obligatorio")
        }

        if (list.size() > 0)
        {
            render response_data.put("errors", list)
            return
        }

        if (funcionesSQLService.actualizar_precio(data, session.user.fIdempresa as Long))
        {
            response_data.put("success", true)

            render response_data as JSON

        }
        else
        {
            response_data.put("success", false)
            render response_data as JSON
        }

//            if(data.id.toString().toLong() > 0) {
//                def producto = Tproductos.findById(data.id.toString().toLong())
//                producto.fPrecio = data.precio.toString().toBigDecimal()
//                if (producto.save(flush:true))
//                {
//                    response_data.put("success", true)
//                    render response_data as JSON
//                    return
//                }
//            }
//        }
//        else{
//            response_data.put("success", false)
//            render response_data as JSON
//            return
//        }
    }

    def add_horario_precio()
    {
        def data = JSON.parse(params.data)

        //println(data)

        def errorsTablaPrecios

        Map<String, Object> response_data = new HashMap<String, Object>()
        Map<String, Object> errors = new HashMap<String, Object>()

        if (data.precios) {
            errorsTablaPrecios = validacionesService.validarListaPrecios(data.precios)
            if (errorsTablaPrecios.size() > 0)
            {
                errors.put("errorsTablaPrecios", errorsTablaPrecios)
            }

        }

        if (errors.size() > 0)
        {
            render errors as JSON
        }

        else{

            if (funcionesSQLService.guardarHorarioPrecio(data, session.user.fIdempresa))
            {
                response_data.put("success", true)
                render response_data as JSON
            }
            else{
                response_data.put("success", false)
                render response_data as JSON
            }
        }

    }

}
