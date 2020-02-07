$(document).ready(function(){

    $("#impuesto").attr("disabled", true)
    $("#makeup").attr("disabled", true)

    init_tabla_entrada()

    $("#btnBuscar").click(function(e) {
        e.preventDefault()
       // $("#btnNuevo").trigger("click")
        $("#producto_modal").modal("show")
    })

    $("#btnBuscarSuplidor").click(function(e) {
        e.preventDefault()
        //$("#btnNuevo").trigger("click")
        $("#suplidores_modal").modal("show")
    })

    $("#btnBuscarConcepto").click(function(e) {
        e.preventDefault()
        //$("#btnNuevo").trigger("click")
        $("#concepto_modal").modal("show")
    })

    $("#calcular_makeup").click( e=> {
        $(e.target).attr("disabled", true)
    })

    $("#costo").change(e=>{

        let costo = e.target.value
        let impuesto = $("#impuesto").val()
        let makeup = $("#makeup").val()
        let precio = 0
        let calcularGanancia = $("#calcular_makeup").prop("checked")
        let totalImpuesto = 0


        if (!isNaN(costo) && parseFloat(costo) > 0) {
            if (!isNaN(impuesto) && parseFloat(impuesto) > 0) {
                precio = costo * ( ( parseFloat( impuesto ) / 100 ) + 1)
            }
            if (!isNaN(makeup) && parseFloat(makeup) > 0 && calcularGanancia) {
                precio = precio * ( ( parseFloat( makeup ) / 100 ) + 1)
            }
        }
        $("#precio").val(precio)
        //$("#precio").val(numericFormat(precio))

    })

    $("#guardar").click(function(e){
        e.preventDefault()

        let inputs = {}
        inputs['id_suplidor'] = $("#id_suplidor").val()
        inputs['id_concepto'] = $("#id_concepto").val()
        inputs['nota'] = $("#nota").val()
        inputs['detalle'] = $('#tabla_entrada').jqxGrid('getrows')
        // consol
        $.ajax({
            url: window.location + '/store_entrada',
            type: 'POST',
            dataType: 'JSON',
            data: {data: JSON.stringify(inputs)},
            success: function(response) {

                if (typeof response.errorsEntrada !== "undefined" && response.errorsEntrada.length > 0)
                {
                    showErrorMessage(response.errorsEntrada)
                }

                if  (response.success)
                {
                    $("#btnNuevo").trigger("click")
                    toastr.success("Datos guardados Correctamente")
                }
            },
            error: function(error) {
                console.log(error.responseText)
            }
        })
    })



    $("#frmBuscarProductos").submit(function(e){
        e.preventDefault()

        if (this.filtro.value.length === 0 ) {
            return
        }

        $.ajax({
            url: window.location.origin + '/menube/products/get_lista_productos',
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

    $("#frmBuscarSuplidores").submit(function(e){
        e.preventDefault()

        if (this.filtro_suplidor.value.length === 0 ) {
            return
        }

        $.ajax({
            url: window.location + '/get_suplidores',
            type: 'POST',
            dataType: 'json',
            data: { filtro: this.filtro_suplidor.value },
            beforeSend: function() {
                $("#suplidores_grid").jqxGrid('clear');
            },
            success: function(response) {
                if(response.length > 0){
                    init_tabla_suplidores_grid(response)
                }
            },
            error: function(error){
                console.log(error.responseText)
            }
        })
    })

    $("#frmBuscarConcepto").submit(function(e){
        e.preventDefault()

        if (this.filtro_concepto.value.length === 0 ) {
            return
        }

        $.ajax({
            url: window.location + '/get_conceptos',
            type: 'POST',
            dataType: 'json',
            data: {filtro: this.filtro_concepto.value},
            beforeSend: function() {
                $("#conceptos_grid").jqxGrid('clear');
            },
            success: function(response) {
                if(response.length > 0){
                    let data = []
                    let conceptos_entrada
                    data = response

                    conceptos_entrada = data.filter( item => item.fEntrada == true )
                    init_tabla_conceptos_grid(conceptos_entrada)
                }
            },
            error: function(error){
                console.log(error.responseText)
            }
        })
    })

    $('#productos_lista').on('rowclick', function (event)
    {
        let controlInventario = $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).fControlinventario
        let calcularPrecio = $('#calcular_makeup').prop("checked")

        $("#costo").val("0.00")
        $("#cantidad").val("0.00")

        console.log($('#productos_lista').jqxGrid('getrowdata', event.args.rowindex))

       if (controlInventario) {
           $("#id").val( $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).id )
           $("#descripcion").val( $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).fDescripcion )
           //$("#precio").val( $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).fPrecio.toFixed(2) )
           $("#categoria").val( $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).categoria )
           $("#referencia").val( $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).fReferencia )
           $("#impuesto").val( $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).fTax.toFixed(2) )
           $("#makeup").val( $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).fMakeup.toFixed(2) )

           if ( !calcularPrecio ) {
               $("#precio").val( $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).fPrecio.toFixed(2) )
           } else {
               $("#precio").val("0.00")
           }

           $("#producto_modal").modal("hide")
       } else {
            toastr.warning("Este producto no se le puede realizar entradas ni salidas", "Producto sin control de inventario")
       }


    });

    $('#suplidores_grid').on('rowclick', function (event)
    {
        $("#id_suplidor").val( $('#suplidores_grid').jqxGrid('getrowdata', event.args.rowindex).id )
        $("#suplidor").val( $('#suplidores_grid').jqxGrid('getrowdata', event.args.rowindex).fNombre )
        $("#suplidores_modal").modal("hide")
    });

    $('#conceptos_grid').on('rowclick', function (event)
    {
        $("#id_concepto").val( $('#conceptos_grid').jqxGrid('getrowdata', event.args.rowindex).id )
        $("#concepto").val( $('#conceptos_grid').jqxGrid('getrowdata', event.args.rowindex).fDescripcion )
        $("#concepto_modal").modal("hide")
    });

    function init_tabla_conceptos_grid(data)
    {

        var source =
            {
                localdata: data,
                datafields:
                    [
                        { name: 'id', type: 'number' },
                        { name: 'fDescripcion', type: 'string' },

                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#conceptos_grid").jqxGrid(
            {
                width: "100%",
                pageable: true,
                autoheight: true,
                theme: "metro",
                source: dataAdapter,
                editable: false,
                columns: [
                    { text: '<b>ID</b>', width: '7%', datafield: 'id', hidden: true},
                    { text: '<b>Nombre</b>', width: '100%', datafield: 'fDescripcion'},

                ]
            });
    }

    function init_tabla_suplidores_grid(data)
    {

        var source =
            {
                localdata: data,
                datafields:
                    [
                        { name: 'id', type: 'number' },
                        { name: 'fNombre', type: 'string' },

                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#suplidores_grid").jqxGrid(
            {
                width: "100%",
                pageable: true,
                autoheight: true,
                theme: "metro",
                source: dataAdapter,
                editable: false,
                columns: [
                    { text: '<b>ID</b>', width: '7%', datafield: 'id', hidden: true},
                    { text: '<b>Nombre</b>', width: '100%', datafield: 'fNombre'},

                ]
            });
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
                        { name: 'fTax', type: 'number' },
                        { name: 'fMakeup', type: 'number' },
                        { name: 'categoria', type: 'string' },
                        { name: 'fControlinventario', type: 'bool' },
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#productos_lista").jqxGrid(
            {
                width: "100%",
                pageable: true,
                autoheight: true,
                theme: "metro",
                source: dataAdapter,
                editable: false,
                columns: [
                    { text: '<b>ID</b>', width: '7%', datafield: 'id', hidden: true},
                    { text: '<b>Referencia</b>', width: '27%', datafield: 'fReferencia'},
                    { text: '<b>Descripcion</b>', width: '58%', datafield: 'fDescripcion'},
                    { text: '<b>Precio</b>', width: '15%', datafield: 'fPrecio', cellsalign: 'right', cellsformat: 'c2'},
                    { text: '<b>categoria</b>', width: '15%', datafield: 'categoria', cellsalign: 'right', hidden: true},
                    { text: '<b>fIdcategoria</b>', width: '15%', datafield: 'fIdcategoria', cellsalign: 'right', hidden: true},
                    { text: '<b>fIdcategoria</b>', width: '15%', datafield: 'fTax', cellsalign: 'right', hidden: true},
                ]
            });
    }

    function init_tabla_entrada()
    {
        var source =
            {
                localdata: {},
                datafields:
                    [
                        { name: 'id', type: 'number' },
                        { name: 'id_suplidor', type: 'number' },
                        { name: 'id_concepto', type: 'number' },
                        { name: 'referencia', type: 'string' },
                        { name: 'descripcion', type: 'string' },
                        { name: 'cantidad', type: 'number' },
                        { name: 'costo', type: 'number' },
                        { name: 'precio', type: 'number' },
                        { name: 'total', type: 'number' },
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#tabla_entrada").jqxGrid(
            {
                width: "100%",
                height: 300,
                theme: "metro",
                source: dataAdapter,
                editable: false,
                showtoolbar: true,
                showaggregates: true,
                showstatusbar: true,
                statusbarheight: 30,
                columns: [
                    { text: '<b>id_producto</b>', width: '10%', datafield: 'id',columngroup: 'productos', hidden: true},
                    { text: '<b>id_suplidor</b>', width: '10%', datafield: 'id_suplidor',columngroup: 'productos', hidden: true},
                    { text: '<b>REFERENCIA</b>', width: '15%', datafield: 'referencia',columngroup: 'productos'},
                    { text: '<b>DESCRIPCION</b>', width: '30%',columntype: 'numberinput', datafield: 'descripcion' ,columngroup: 'productos'},
                    { text: '<b>CANTIDAD</b>',columngroup: 'productos', width: '10%', datafield: 'cantidad',cellsalign: 'right'},
                    { text: '<b>COSTO</b>',columngroup: 'productos', width: '15%', datafield: 'costo',align: 'right',cellsalign: 'right', cellsformat: 'c2',},
                    { text: '<b>PRECIO</b>',columngroup: 'productos', width: '15%', datafield: 'precio',align: 'right',cellsalign: 'right', cellsformat: 'c2',
                        aggregates: [{
                            "<b>SUB-TOTAL: </b>": function (aggregatedValue, currentValue, column, record) {
                                return aggregatedValue + record['precio']
                            }
                        }]
                    },
                    { text: '<b>TOTAL</b>',columngroup: 'productos', width: '15%', datafield: 'total',align: 'right',cellsalign: 'right', cellsformat: 'c2',
                        aggregates: [{
                            '<b>TOTAL: </b>': function (aggregatedValue, currentValue, column, record) {
                                return aggregatedValue + record['total']
                            }
                        }]
                    }

                ],
                rendertoolbar: function (toolbar) {
                    var me = this;
                    var container = $("<div style='margin: 5px;'></div>");
                    toolbar.append(container);
                    container.append('<button style="margin-left: 5px;" id="addrowbutton_componentes_productos" type="button"> <i class="fa fa-plus"></i> Agregar</button>');
                    container.append('<button style="margin-left: 5px;" id="deleterowbutton_componentes_productos" type="button"> <i class="fa fa-trash-o"></i> Eliminar</button>');

                    $("#addrowbutton_componentes_productos").jqxButton();


                    $("#deleterowbutton_componentes_productos").jqxButton();


                    // create new row.
                    $("#addrowbutton_componentes_productos").on('click', function (e) {
                        //var rowscount = $("#componentes_lista").jqxGrid('getdatainformation').rowscount;



                        let row = {}

                        row.id_suplidor = $("#id_suplidor").val()
                        row.id_concepto = $("#id_concepto").val()
                        row.id          = $("#id").val()
                        row.descripcion = $("#descripcion").val()
                        row.descripcion = $("#descripcion").val()
                        row.referencia  = $("#referencia").val()
                        row.costo       = parseFloat($("#costo").val())
                        row.cantidad    = parseFloat($("#cantidad").val())
                        row.precio      = $("#precio").val()

                        //Validaciones
                        if (row.cantidad < 1 && !isNaN(row.cantidad))
                        {
                            toastr.warning("El campo cantidad es requerido")
                            return
                        }


                        if (parseFloat(row.id) <=  0)
                        {
                            toastr.warning("No se ha seleccinado ningun producto")
                            return
                        }

                        if (parseFloat(row.cantidad) <  0.1)
                        {
                            toastr.warning("El campo cantidad es requerido")
                            return
                        }
                        if (parseFloat(row.precio) <= 0)
                        {
                            toastr.warning("El campo precio es requerido")
                            return
                        }

                        if (row.costo <= 0 || isNaN(row.costo))
                        {
                            toastr.warning("El campo costo es requido")
                            return
                        }

                        if (parseFloat( $("#impuesto").val()) <= 0 || isNaN($("#impuesto").val()))
                        {
                            toastr.warning("El campo impuesto es requido")
                            return
                        }

                        row.total = row.precio * row.cantidad
                        console.log(row)

                        if (!isDuplicated($('#tabla_entrada').jqxGrid('getrows'), row))
                        {

                            $("#tabla_entrada").jqxGrid('addRow', null, row);

                            $("#id").val("")
                            $("#referencia").val("")
                            $("#descripcion").val("")
                            $("#cantidad").val("")
                            $("#costo").val("")
                            $("#impuesto").val("")
                            $("#makeup").val("")
                            $("#precio").val("")
                        }


                    });

                    // delete row.
                    $("#deleterowbutton_componentes_productos").on('click', function () {
                        var selectedrowindex = $("#tabla_entrada").jqxGrid('getselectedrowindex');
                        var rowscount = $("#tabla_entrada").jqxGrid('getdatainformation').rowscount;
                        if (selectedrowindex >= 0 && selectedrowindex < rowscount) {
                            var id = $("#tabla_entrada").jqxGrid('getrowid', selectedrowindex);

                            var commit = $("#tabla_entrada").jqxGrid('deleterow', id);

                        }
                    });
                },
            });
    }


    $("#btnNuevo").click(function(e) {
        e.preventDefault()

        let inputs =  $("#frmEntrada").find('input')
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

        $("#nota").val("")

        $("#tabla_entrada").jqxGrid('clear');
        $("#productos_lista").jqxGrid('clear');
        $("#suplidores_grid").jqxGrid('clear');
        $("#conceptos_grid").jqxGrid('clear');


    })

    function isDuplicated(rows, newRow)
    {
        for (var row in rows) {
            if (rows[row].id == newRow.id)
            {
                return true
            }
        }
        return false
    }
})