$(document).ready(function(){

    $("#descripcion").prop("disabled", true)
    $("#categoria").prop("disabled", true)
    $("#referencia").prop("disabled", true)

    load_productos()

    $("#btnBuscar").click(function(e) {
        e.preventDefault()
        $("#btnNuevo").trigger("click")

    })

    $("#btnNuevo").click(function(e) {
        e.preventDefault()

        let inputs =  $("#frmProducto").find('input')
        $("#filtro").val("")
        // console.log(typeof(inputs))


        $.each(inputs,function(index, input) {
            if ($(input).attr("type") === "number")
            {
                $(input).val("0")
            }
            else{
                $(input).val("")
            }
        })

        $("#productos_lista").jqxGrid('clear');
        $("#propiedades_grid").jqxGrid('clear');


    })

    $("#frmBuscarProductos").submit(function(e){
        e.preventDefault()

        if (this.filtro.value.length === 0 ) {
            return
        }



        $.ajax({
            url: window.location + '/get_lista_productos',
            type: 'POST',
            dataType: 'json',
            data: {filtro: this.filtro.value},
            beforeSend: function() {
                $("#productos_lista").jqxGrid('clear');
            },
            success: function(response) {
                if(response.length > 0){
                    init_tabla_productos_filtrados(response)
                }
            },
            error: function(error){
                console.log(error.responseText)
            }
        })
    })

    $('#productos_lista').on('rowclick', function (event)
    {
        $("#descripcion").val( $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).fDescripcion )
        $("#referencia").val( $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).fReferencia )
        $("#categoria").val( $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).categoria )
        $("#id").val( $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).id )
        $("#idcategoria").val( $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).fIdcategoria )


        let producto = {}

        producto.categoria =  $("#idcategoria").val()
        producto.idproducto =  $("#id").val()

        $.ajax({
            url: window.location + '/get_producto_propiedades',
            type: 'POST',
            dataType: 'JSON',
            data: producto,
            success: function(response)
            {
                //$("#nuevo").trigger('click')

                if (typeof response.propiedades !== "undefined") {
                    $("#propiedades_grid").jqxGrid('clear');

                    init_tabla_propiedades(response.propiedades)
                }
            },
            error: function(error) {
                console.log(error)
            }
        })

        $("#lista_precios_container").show()

    });


    $("#guardar").click(function(e) {
        e.preventDefault()

        let inputs = {}

        inputs.idproducto = $("#id").val() ? $("#id").val(): 0

        inputs['propiedades'] = $('#propiedades_grid').jqxGrid('getrows')

        if (parseInt(inputs.id) === 0)
        {
            toastr.warning("Debes seleccionar un producto")
            return false
        }

        // if (inputs.propiedades.length < 1)
        // {
        //     toastr.warning("No se ha agregado ningun precio")
        //     return false
        // }


        $.ajax({
            url: window.location + '/add_propiedades',
            type: 'POST',
            dataType: 'JSON',
            data: {data: JSON.stringify(inputs)},
            success: function(response) {

                if (typeof response.errors !== "undefined" && response.errors.length > 0)
                {
                    showErrorMessage(response.errors)
                    return
                }
                if  (response.success)
                {

                    toastr.success("Datos guardados Correctamente")
                    $("#btnNuevo").trigger("click")
                }
                else{
                    toastr.error("Ocurrio un error con la comunicacion")
                    return
                }
            },
            error: function(error) {
                console.log(error.responseText)
            }
        })


    })

    function load_productos()
    {
        $.ajax({
            url: window.location + '/get_lista_productos',
            type: 'POST',
            dataType: 'json',
            data: {filtro: "%"},
            beforeSend: function() {
                $("#productos_lista").jqxGrid('clear');
            },
            success: function(response) {
                if(response.length > 0){
                    init_tabla_productos_filtrados(response)
                }
            },
            error: function(error){
                console.log(error.responseText)
            }
        })
    }


    function init_tabla_productos_filtrados(data)
    {

        var source =
            {
                localdata: data,
                datafields:
                    [
                        { name: 'id', type: 'number' },
                        { name: 'fReferencia', type: 'string' },
                        { name: 'fDescripcion', type: 'string' },
                        { name: 'fPrecio', type: 'number' },
                        { name: 'fIdcategoria', type: 'number' },
                        { name: 'categoria', type: 'string' },
                        { name: 'hasHorarioPrecio', type: 'boolean' },
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#productos_lista").jqxGrid(
            {
                width: "100%",
                pageable: true,
                height: 380,
                theme: "metro",
                source: dataAdapter,
                editable: false,
                columns: [
                    { text: '<b>ID</b>', width: '7%', datafield: 'id', hidden: true},
                    { text: '<b>Referencia</b>', width: '27%', datafield: 'fReferencia'},
                    { text: '<b>Descripcion</b>', width: '38%', datafield: 'fDescripcion'},
                    { text: '<b>Precio</b>', width: '15%', datafield: 'fPrecio', cellsalign: 'right', cellsformat: 'c2', hidden: true},
                    { text: '<b>Categoria</b>', width: '35%', datafield: 'categoria', cellsalign: 'left',},
                    { text: '<b>fIdcategoria</b>', width: '15%', datafield: 'fIdcategoria', cellsalign: 'right', hidden: true},
                    { text: '<b>Horario de precios</b>', width: '20%',columntype: 'checkbox', datafield: 'hasHorarioPrecio', hidden: true},
                ]
            });
    }



    // (function() {
    //     $.ajax({
    //         url: window.location.origin + proyectPath + '/products/get_data_combo',
    //         type: 'POST',
    //         dataType: 'JSON',
    //         success: function(response) {
    //
    //             if (response.areas.length > 0)
    //             {
    //                 let areas = []
    //                 areas = response.areas
    //                 areas.push({'id': 0, fNombreArea:'--Seleccionar opcion--'})
    //                 init_tabla_precios(areas)
    //             }
    //         },
    //         error: function (error) {
    //             console.log(error.responseText)
    //         }
    //     })
    // })()


    function init_tabla_propiedades(data)
    {
        var source =
            {
                localdata: data,
                datafields:
                    [
                        { name: 'idpropiedad', type: 'number' },
                        { name: 'descripcion', type: 'string' },
                        { name: 'idcategoria', type: 'number' },
                        { name: 'hasproducto', type: 'boolean' },
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#propiedades_grid").jqxGrid(
            {
                width: "100%",
                pageable: true,
                height: 200,
                theme: "metro",
                source: dataAdapter,
                editable: true,
                columns: [
                    { text: '<b>ID</b>', width: '7%', datafield: 'idpropiedad', hidden: true},
                    { text: '<b>Propiedades</b>', width: '85%', datafield: 'descripcion', editable: false},
                    { text: '<b>Agregado</b>', width: '15%', datafield: 'hasproducto', columntype: "checkbox", editable: true},
                ]
            });
    }
})