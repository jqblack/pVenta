$(document).ready(function(){

    $("#existencia").attr("disabled", true)
    $("#reorden").attr("disabled",  true)
    $("#nivel_maximo").attr("disabled", true)
    $("#nivel_minimo").attr("disabled", true)

    var productos = []
    var listaComponentes = []
    var componente = []

    $("#datepickerVencimiento").jqxDateTimeInput({
        width: '100%',
        theme: 'metro',
        todayString: 'Today'
    });


    (function() {
        $.ajax({
            url: window.location + '/get_data_combo',
            type: 'POST',
            dataType: 'JSON',
            success: function(response) {

                // if (response.categorias.length > 0)
                // {
                    llenarCombox($('#categoria'),response.categorias)
                //}
                // if (response.localizaciones.length > 0)
                // {
                    llenarCombox($('#localizaciones'),response.localizaciones)
                // }
                // if (response.unidades.length > 0)
                // {
                    llenarCombox($('#unidad'),response.unidades)
               // }
                // if (response.areas.length > 0)
                // {
                    let areas = []
                    areas = response.areas
                    areas.push({'id': 0, fNombreArea:'--Seleccionar opcion--'})
                    init_tabla_precios(areas)
               // }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    })()

    init_tabla_fotos()

    $("#control_inventario").click(e => {

       //console.log(e.target.checked)
        $("#ultimo_costo").attr("disabled", e.target.checked)
        $("#ultimo_costo1").attr("disabled", e.target.checked)
        $("#ultimo_costo2").attr("disabled", e.target.checked)
        $("#reorden").attr("disabled", !e.target.checked)
        $("#nivel_maximo").attr("disabled", !e.target.checked)
        $("#nivel_minimo").attr("disabled", !e.target.checked)


    })

    function init_tabla_precios(areas)
    {
        let data = {}


        var areaSource =
            {
                datatype: "array",
                datafields: [
                    { name: 'fNombreArea', type: 'string' },
                    { name: 'id', type: 'string' }
                ],
                localdata: areas
            };
        var areaAdapter = new $.jqx.dataAdapter(areaSource, {
            autoBind: true
        });

        //console.log(areaSource)

        let dias = [
            {value: -1, label: 'Selecione un dia'},
            {value: 0, label: 'Domingo'},
            {value: 1, label: 'Lunes'},
            {value: 2, label: 'Martes'},
            {value: 3, label: 'Miercoles'},
            {value: 4, label: 'Jueves'},
            {value: 5, label: 'Viernes'},
            {value: 6, label: 'Sabado'},

        ]

        var diasSource =
            {
                datatype: "array",
                datafields: [
                    { name: 'label', type: 'string' },
                    { name: 'value', type: 'string' }
                ],
                localdata: dias
            };
        var diasAdapter = new $.jqx.dataAdapter(diasSource, {
            autoBind: true
        });


        var source =
            {
                localdata: [

                ],
                datatype: "array",
                datafields:
                    [
                        { name: 'dia_list', value: 'dia', values: { source: diasAdapter.records, value: 'value', name: 'label' } },
                        { name: 'dia', type: 'string' },
                        { name: 'area_list', value: 'fNombreArea', values: { source: areaAdapter.records, value: 'id', name: 'fNombreArea' } },
                        { name: 'fNombreArea', type: 'string' },
                        { name: 'hora_inicial', type: 'number' },
                        { name: 'hora_final', type: 'number' },
                        { name: 'price', type: 'number' },
                        { name: 'activo', type: 'boolean' },
                        { name: 'doble', type: 'boolean' },
                        { name: 'comentario', type: 'string' }
                    ],
                addrow: function (rowid, rowdata, position, commit) {
                    // synchronize with the server - send insert command
                    // call commit with parameter true if the synchronization with the server is successful
                    //and with parameter false if the synchronization failed.
                    // you can pass additional argument to the commit callback which represents the new ID if it is generated from a DB.
                    commit(true);
                },
                deleterow: function (rowid, commit) {
                    // synchronize with the server - send delete command
                    // call commit with parameter true if the synchronization with the server is successful
                    //and with parameter false if the synchronization failed.
                    commit(true);
                },
            };
        var dataAdapter = new $.jqx.dataAdapter(source);
        // initialize jqxGrid
        $("#precio_grid").jqxGrid(
            {
                width: "100%",
                height: 400,
                theme: "metro",
                source: dataAdapter,
                showtoolbar: true,
                editable:true,
                rendertoolbar: function (toolbar) {
                    var me = this;
                    var container = $("<div style='margin: 5px;'></div>");
                    toolbar.append(container);
                    // container.append('<input class="btn btn-primary" id="addrowbutton" type="button" value="+" />');
                    // container.append('<input class="btn btn-danger" id="deleterowbutton" type="button" value="-" />');
                    container.append('<button id="addrowbutton" type="button"> <i class="fa fa-plus"></i> Agregar</button>');
                    container.append('<button id="deleterowbutton" type="button"> <i class="fa fa-trash-o"></i> Eliminar</button>');

                    $("#addrowbutton").jqxButton();


                    $("#deleterowbutton").jqxButton();


                    // create new row.
                    $("#addrowbutton").on('click', function (e) {
                        var datarow = [
                            {
                                dia:"Selecione un dia",
                                area:"Selecione un area",
                                fNombreArea: 0,
                                precio: 0,
                                hora_inicial: 0,
                                hora_final: 0,
                                comentario: '',
                                activo: false,
                                doble: false,


                            }
                        ]
                        var commit = $("#precio_grid").jqxGrid('addrow', null, datarow);
                    });

                    // delete row.
                    $("#deleterowbutton").on('click', function () {
                        var selectedrowindex = $("#precio_grid").jqxGrid('getselectedrowindex');
                        var rowscount = $("#precio_grid").jqxGrid('getdatainformation').rowscount;
                        if (selectedrowindex >= 0 && selectedrowindex < rowscount) {
                            var id = $("#precio_grid").jqxGrid('getrowid', selectedrowindex);
                            var commit = $("#precio_grid").jqxGrid('deleterow', id);
                        }
                    });
                },
                columns: [
                    { text: 'Dia', datafield: 'dia_list', width: '15%', displayfield: 'dia',  columntype: 'dropdownlist',
                        createeditor: function (row, value, editor) {
                            editor.jqxDropDownList({ source: diasAdapter, displayMember: 'label', valueMember: 'value' });
                        }
                    },
                    { text: 'Area', datafield: 'fNombreArea', width: '15%', displayfield: 'area',  columntype: 'dropdownlist',
                        createeditor: function (row, value, editor) {
                            editor.jqxDropDownList({ source: areaAdapter, displayMember: 'fNombreArea', valueMember: 'id' });
                        }
                    },
                    { text: 'Hora Inicial', width: '7%', datafield: 'hora_inicial', columntype: 'numberinput' },
                    { text: 'Hora Final', width: '7%', datafield: 'hora_final', cellsalign: 'right', columntype: 'numberinput' },
                    { text: 'Precio', width: '10%', datafield: 'precio', cellsalign: 'right',columntype: 'numberinput'},
                    { text: 'Activo',width: '10%', datafield: 'activo',  cellsalign: 'right', cellsformat: 'c2', columntype:'checkbox' },
                    { text: 'doble', width: '10%',datafield: 'doble',  cellsalign: 'right', cellsformat: 'c2', columntype:'checkbox' },
                    { text: 'comentario', width: '30%', datafield: 'comentario',  cellsalign: 'center' }
                ]
            });

    }

    $("#btnComponentesTab").click(function(e) {
        e.preventDefault()

        $.ajax({
            url: window.location + '/get_componentes',
            type: 'POST',
            dataType: 'json',
            success: function(response) {
                init_tabla_componentes(response.data)

            },
            error: function(error){
                console.log(error.responseText)
            }
        })
    })

    function init_tabla_componentes(data)
    {
        var source =
            {
                localdata: data,
                datafields:
                    [
                        { name: 'id', type: 'string' },
                        { name: 'fName', type: 'string' },
                        { name: 'fIdempresa', type: 'number' },
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#componentes_grid").jqxGrid(
            {
                width: "100%",
                pageable: true,
                autoheight: true,
                theme: "metro",
                source: dataAdapter,
                editable: false,
                columns: [
                    { text: '<b>ID</b>',columngroup: 'componentes', width: '20%', datafield: 'id', hidden:true},
                    { text: '<b>Componentes</b>',columngroup: 'componentes', width: '100%', datafield: 'fName'},
                ],
                columngroups: [
                    { text: '<b>Componentes</b>', align: 'center', name: 'componentes' }
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
                ]
            });
    }

    function init_tabla_componentes_list()
    {
        var source =
            {
                localdata: {},
                datafields:
                    [
                        { name: 'id', type: 'string' },
                        { name: 'fName', type: 'string' },
                        { name: 'standard', type: 'string' },
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#componentes_lista").jqxGrid(
        {
            width: "100%",
            height: 200,
            theme: "metro",
            source: dataAdapter,
            showtoolbar: true,
            editable: true,
            columns: [
                { text: '<b>ID</b>',columngroup: 'componentes', width: '10%', datafield: 'id', hidden: true, editable: false},
                { text: '<b>Componente</b>',columngroup: 'componentes', width: '80%', datafield: 'fName', editable: false},
                { text: '<b>Estandard</b>',columngroup: 'componentes', width: '20%',  columntype: 'checkbox', datafield: 'standard', editable: true }
            ],
            columngroups: [
                { text: '<b>Lista de componentes</b>', align: 'center', name: 'componentes' }
            ],
            rendertoolbar: function (toolbar) {
                var me = this;
                var container = $("<div style='margin: 5px;'></div>");
                toolbar.append(container);
                //container.append('<button style="margin-left: 5px;" id="addrowbutton_componentes_productos" type="button"> <i class="fa fa-plus"></i> Agregar</button>');
                container.append('<button style="margin-left: 5px;" id="deleterowbutton_componentes_lista" type="button"> <i class="fa fa-trash-o"></i> Eliminar</button>');




                $("#deleterowbutton_componentes_lista").jqxButton();


                // delete row.
                $("#deleterowbutton_componentes_lista").on('click', function () {
                    var selectedrowindex = $("#componentes_lista").jqxGrid('getselectedrowindex');
                    var rowscount = $("#componentes_lista").jqxGrid('getdatainformation').rowscount;
                    if (selectedrowindex >= 0 && selectedrowindex < rowscount) {
                        var id = $("#componentes_lista").jqxGrid('getrowid', selectedrowindex);

                        var id_componente = $("#componentes_lista").jqxGrid('getrowdata', selectedrowindex).id;

                        var commit = $("#componentes_lista").jqxGrid('deleterow', id);

                        for (var item in componente)
                        {
                            if (componente[item].id === id_componente){
                                componente.splice(item, 1)
                            }
                        }
                    }
                    //console.log(componente)

                });
            },
        });
    }
    function init_tabla_componentes_products()
    {
        var source =
            {
                localdata: {},
                datafields:
                    [
                        { name: 'id', type: 'string' },
                        { name: 'fDescripcion', type: 'string' },
                        { name: 'cantidad', type: 'number' },
                        { name: 'standard', type: 'string' },
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#componentes_productos").jqxGrid(
        {
            width: "100%",
            height: 200,
            theme: "metro",
            source: dataAdapter,
            editable: true,
            showtoolbar: true,
            columns: [
                { text: '<b>ID</b>', width: '10%', datafield: 'id',columngroup: 'productos', hidden: true, editable:false},
                { text: '<b>Producto</b>', width: '50%', datafield: 'fDescripcion',columngroup: 'productos',editable:false},
                { text: '<b>Cantidad</b>', width: '27%',columntype: 'numberinput', datafield: 'cantidad',cellsalign: 'right' ,columngroup: 'productos', editable:true},
                { text: '<b>Estandard</b>',columngroup: 'productos', width: '20%',  columntype: 'checkbox', datafield: 'standard', editable: false }

            ],
            columngroups: [
                { text: '<b>Productos</b>', align: 'center', name: 'productos' }
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
                    var rowscount = $("#componentes_lista").jqxGrid('getdatainformation').rowscount;
                    console.log(rowscount)
                    if (rowscount > 0 )
                    {
                        $("#producto_modal").modal('show')
                        $("#filtro").focus()
                    }
                    else
                    {
                        toastr.warning("No hay componentes en la <b>lista de componentes.</b>")
                    }
                });

                // delete row.
                $("#deleterowbutton_componentes_productos").on('click', function () {
                    var selectedrowindex = $("#componentes_productos").jqxGrid('getselectedrowindex');
                    var rowscount = $("#componentes_productos").jqxGrid('getdatainformation').rowscount;
                    if (selectedrowindex >= 0 && selectedrowindex < rowscount) {
                        var id = $("#componentes_productos").jqxGrid('getrowid', selectedrowindex);

                        var componente_id = $("#componentes_productos").jqxGrid('getrowdata', selectedrowindex).componente_id;
                        for(var item in componente)
                        {
                            if (componente[item].id === componente_id){

                                var commit = $("#componentes_productos").jqxGrid('deleterow', id);
                                componente[item].productos = []
                                componente[item].productos = $("#componentes_productos").jqxGrid('getrows')
                                console.log(componente)

                            }
                        }
                    }
                });
            },
        });
    }

    $('#componentes_grid').on('rowdoubleclick', function (event)
    {
        let item = {}

        item.id =  $('#componentes_grid').jqxGrid('getrowdata', event.args.rowindex).id;
        item.fName =  $('#componentes_grid').jqxGrid('getrowdata', event.args.rowindex).fName;
        item.standard = false
        item.productos = []

        if (!isDuplicated($('#componentes_lista').jqxGrid('getrows'), item))
        {
            componente.push(item)
            $("#componentes_lista").jqxGrid('addRow', null, item);
        }
    });


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
        let componentes
        componentes = $("#componentes_lista").jqxGrid('getdatainformation');

        let btn = event.target
        //console.log(btn.id)

        if(typeof componentes !== "undefined" && componentes.rowscount > 0) {
            let item = {}
            let selectedrowindex = $('#componentes_lista').jqxGrid('getselectedrowindex');


            if (selectedrowindex < 0) {
                toastr.warning("No hay ningun componente seleccionado")
                return
            }

            item.id =               $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).id;
            item.fDescripcion =     $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).fDescripcion;
            item.fReferencia =      $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).fReferencia;
            item.cantidad =  1;


            if (!isDuplicated($('#componentes_productos').jqxGrid('getrows'), item))
            {
                item.componente_id =       $('#componentes_lista').jqxGrid('getrowdata', selectedrowindex).id;
                item.standard =            $('#componentes_lista').jqxGrid('getrowdata', selectedrowindex).standard;

                for (var i in componente)
                {
                    if (componente[i].id === item.componente_id)
                    {
                        componente[i].productos.push(item)
                    }
                }
                $("#componentes_productos").jqxGrid('addRow', null, item);

                toastr.success("Seleccionado.")
            }
        }
        else {
            let producto = {}
            producto.id = $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).id;

            $.ajax({
                url: window.location + '/get_producto',
                type: 'POST',
                dataType: 'JSON',
                data: producto,
                success: function(response)
                {
                    $("#nuevo").trigger('click')
                    if (typeof response.producto !== "undefined") {
                        $("#descripcion").val(response.producto.fDescripcion)
                        $("#mensaje").val(response.producto.fMensaje)
                        $("#id").val(response.producto.id)
                        $("#referencia").val(response.producto.fReferencia)
                        $("#impuesto").val(response.producto.fTax)
                        $("#localizaciones").val(response.producto.fIdlocalizacion)
                        $("#categoria").val(response.producto.fIdcategoria)
                        $("#unidad").val(response.producto.fIdunidad)
                        $("#datepickerVencimiento").val(new Date(response.producto.fFechaVencimiento))

                        $("#control_inventario").prop("checked",response.producto.fControlinventario)
                        $("#control_inventario").prop("checked",response.producto.fControlinventario)
                        $("#ventas_decimales").prop("checked", response.producto.fVentasDecimales)
                        $("#descontinuado").prop("checked", response.producto.fDescontinuado)
                        $("#receta").prop("checked", response.producto.fReceta)
                        $("#combo").prop("checked", response.producto.fKit)
                        $("#plato").prop("checked", response.producto.fPlato)
                        $("#f_comanda").prop("checked", response.producto.fComanda)


                        // $("#control_inventario").val(response.producto.fControlinventario)
                        // $("#control_inventario").val(response.producto.fControlinventario)
                        // $("#ventas_decimales").val(response.producto.fVentasDecimales)
                        // $("#descontinuado").val( response.producto.fDescontinuado)
                        // $("#plato").val(response.producto.fPlato)
                        // $("#receta").val(response.producto.fReceta)
                        // $("#combo").val(response.producto.fKit)

                        $("#precio").val(response.producto.fPrecio)
                        $("#precio_delivery").val(response.producto.fPrecioDelivery)
                        $("#nivel_minimo").val(response.producto.fLimiteminimo)
                        $("#ultimo_costo").val(response.producto.fUltimocosto)
                        $("#ultimo_costo1").val(response.producto.fUltimocosto1)
                        $("#ultimo_costo2").val(response.producto.fUltimocosto2)
                        $("#reorden").val(response.producto.fReorden)
                        $("#existencia").val(response.producto.fExistencia)
                        $("#makeup").val(response.producto.fMakeup)
                        $("#tragos").val(response.producto.fTragos)
                        $("#maximo_descuento").val(response.producto.fMaxdescuento)

                        $("#ultimo_costo").attr("disabled", true)
                        $("#ultimo_costo1").attr("disabled", true)
                        $("#ultimo_costo2").attr("disabled", true)
                        $("#existencia").attr("disabled", true)

                    }
                    if (typeof response.precios !== "undefined") {
                        $("#precio_grid").jqxGrid('clear');
                        let dias = [
                            'Domingo',
                            'Lunes',
                            'Martes',
                            'Miercoles',
                            'Jueves',
                            'Viernes',
                            'Sabado'
                        ]

                        response.precios.forEach(function(item, index) {
                            $("#precio_grid").jqxGrid('addRow', null, {
                                dia_list: item[0].fDia,
                                dia: dias[item[0].fDia],
                                area: item[1].fNombreArea,
                                fNombreArea: item[1].id,
                                area_list: item[0].fIdarea,
                                hora_inicial: item[0].fHoraInicio,
                                hora_final: item[0].fHoraFin,
                                precio: item[0].fPrecio,
                                activo: item[0].fPrecioActivo,
                                doble: item[0].fDoble,
                                comentario: item[0].fComentario,
                            });
                        })
                    }

                    if (typeof response.componentes !== "undefined" && response.fPlato) {
                        $("#plato").val(false)
                        $("#plato").trigger("click")
                        $("#componentes_lista").jqxGrid('clear');
                        componente = []
                        response.componentes.forEach(function(item, index) {
                            let row = {}

                            row.id = item[0].id
                            row.fName = item[0].fName
                            row.standard = item[1].fStandard
                            row.productos = []

                            componente.push(row)
                        })

                        $("#componentes_lista").jqxGrid('addRow', null, componente);
                        $("#componentes_lista").jqxGrid({'selectedrowindex': 0});
                    }

                    if (typeof response.componentes_detalle !== "undefined") {
                        $("#componentes_productos").jqxGrid('clear');
                        componente.forEach(function(item, index) {
                            response.componentes_detalle.forEach(function(detalle, index) {
                                detalle.forEach(function (producto, i) {
                                    if (item.id == producto[0].fIdcomponente)
                                    {
                                        item.productos.push({
                                            id: producto[1].id,
                                            componente_id: producto[0].fIdcomponente,
                                            cantidad: producto[0].fQty,
                                            standard: producto[0].fStandard,
                                            fDescripcion: producto[1].fDescripcion
                                        })
                                    }
                                })
                            })
                        })

                        //console.log(componente)
                    }
                  
                    if (typeof response.fotos !== "undefined")
                    {
                        $("#componentes_productos").jqxGrid('clear');
                        let fotos = []

                        response.fotos.forEach(function(item, index) {
                            fotos.push({
                                imagen: item.fFoto,
                                imagen_base64: item.fFoto,
                                menu: item.fMenu
                            })
                        })

                        $("#fotos_grid").jqxGrid('addRow', null, fotos);
                    }

                    $("#producto_modal").modal("hide")
                },
                error: function(error) {
                    console.log(error)
                }
            })
        }
    });

    $('#componentes_lista').on('rowclick', function (event)
    {

        $("#componentes_productos").jqxGrid('clear');

        for (var item in componente)
        {
            if (componente[item].id === $('#componentes_lista').jqxGrid('getrowdata', event.args.rowindex).id)
            {
                for (var i in componente[item].productos){
                    $("#componentes_productos").jqxGrid('addRow', null, componente[item].productos[i]);
                }
            }
        }

    });

    $("#btnAddComponente").click(function(e){
        e.preventDefault()

        let selectedrowindex = $("#componentes_grid").jqxGrid('getselectedrowindex');
        //
        // console.log(selectedrowindex)
        let item = {}


        if (selectedrowindex >= 0) {
            item.id =  $('#componentes_grid').jqxGrid('getrowdata', selectedrowindex).id;
            item.fName =  $('#componentes_grid').jqxGrid('getrowdata', selectedrowindex).fName;
            item.productos = []
        }
        if (!isDuplicated($('#componentes_lista').jqxGrid('getrows'), item))
        {
            componente.push(item)
            $("#componentes_lista").jqxGrid('addRow', null, item);
        }

    })


    $('#componentes_productos').on('rowdoubleclick', function (event)
    {

    });

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

    $("#plato").click(function(e){
        if (e.target.checked){
            $("#btnComponentesTab").show();
            $("#btnComponentesTab").trigger('click');
            init_tabla_componentes_list()
            init_tabla_componentes_products()
        }
        else{
            $("#btnComponentesTab").hide();
            $("#btnDatosGeneralesTab").trigger('click');
        }
    })

    function init_tabla_fotos()
    {
        var source =
            {
                localdata: {},
                datafields:
                    [
                        { name: 'imagen', type: 'string' },
                        { name: 'menu', type: 'boolean' },
                        { name: 'imagen_base64', type: 'string' },
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#fotos_grid").jqxGrid(
            {
                width: "100%",
                height: 200,
                theme: "metro",
                source: dataAdapter,
                editable: true,
                showtoolbar: true,
                columns: [
                    {
                        text: '<b>Imagen</b>',
                        width: '50%',
                        datafield: 'imagen',
                        columngroup: 'fotos',
                        hidden: false,
                        editable:false,
                        cellsrenderer: function (row, datafield, value) {
                            return '<img style="margin-left: 5px;" height="60" width="50" src="data:image/*;base64,' + value + '"/>';
                        }
                    },
                    { text: '<b>Menu</b>', width: '50%', datafield: 'menu',columngroup: 'fotos', columntype: 'checkbox', editable:true},
                    { text: '<b>img_bytes</b>', width: '50%', datafield: 'imagen_base64',columngroup: 'fotos', hidden:true},

                ],
                columngroups: [
                    { text: '<b>Fotos</b>', align: 'center', name: 'fotos' }
                ],
                rendertoolbar: function (toolbar) {
                    var me = this;
                    var container = $("<div style='margin: 5px;'></div>");
                    toolbar.append(container);
                    container.append('<button style="margin-left: 5px;" id="deleterowbutton_fotos_grid" type="button"> <i class="fa fa-trash-o"></i> Eliminar</button>');



                    $("#deleterowbutton_fotos_grid").jqxButton();


                    // delete row.
                    $("#deleterowbutton_fotos_grid").on('click', function () {
                        var selectedrowindex = $("#fotos_grid").jqxGrid('getselectedrowindex');
                        var rowscount = $("#fotos_grid").jqxGrid('getdatainformation').rowscount;
                        if (selectedrowindex >= 0 && selectedrowindex < rowscount) {
                            var id = $("#fotos_grid").jqxGrid('getrowid', selectedrowindex);
                            var commit = $("#fotos_grid").jqxGrid('deleterow', id);
                        }
                    });
                },
            });
    }

    $('#fotoUpload').jqxFileUpload({
        accept: '.jpg,.png,',
        rtl : true,
        browseTemplate: 'success',
        uploadTemplate: 'primary',
        cancelTemplate: 'danger',
        multipleFilesUpload: true,
        width: '100%',
        uploadUrl: window.location + '/uploadImage',
        fileInputName: 'foto'
    });

    function llenarCombox(combo,data)
    {
        $(combo).append('<option value="0">--Seleccionar una opcion--</option>')
        for(let item in data)
        {
            $(combo).append('<option value="'+data[item].id+'">'+data[item].fDescripcion+'</option>')
        }
    }




    $('#fotoUpload').on('uploadEnd', function (event) {
        var args = event.args;
        var fileName = args.file;
        var serverResponce = args.response;

        let item = {}

        item.imagen = serverResponce
        item.imagen_base64 = serverResponce
        item.menu = false
        $("#fotos_grid").jqxGrid('addRow', null, item);
    });


    $("#guardar").click(function(e){
        e.preventDefault()

        let inputs = $("#frmProducto").find('input, select, textarea')

        inputs = $(inputs).serializeArray()

        inputs = jsonArrayToJsonKey(inputs)
        inputs['precios'] = $('#precio_grid').jqxGrid('getrows') || []
        // inputs['precios'] = []
        inputs['fotos'] = $('#fotos_grid').jqxGrid('getrows')
        inputs['vencimiento'] = formatDate($('#datepickerVencimiento').val())

        inputs.control_inventario = $("#control_inventario").prop("checked")
        inputs.descontinuado = $("#descontinuado").prop("checked")
        inputs.plato = $("#plato").prop("checked")
        inputs.receta = $("#receta").prop("checked")
        inputs.combo = $("#combo").prop("checked")
        inputs.ventas_decimales = $("#ventas_decimales").prop("checked")
        inputs.comandas = $("#f_comanda").prop("checked")


        inputs['productos_componentes'] = inputs.plato ? componente : []

       //console.log(inputs)
       // consol
        $.ajax({
            url: window.location + '/store',
            type: 'POST',
            dataType: 'JSON',
            data: {data: JSON.stringify(inputs)},
            success: function(response) {
                
                if (typeof response.errorsProducto !== "undefined" && response.errorsProducto.length > 0)
                {
                    showErrorMessage(response.errorsProducto)
                }

                if (typeof response.errorsTablaComponentesProductos !== "undefined" && response.errorsTablaComponentesProductos.length > 0)
                {
                    showErrorMessage(response.errorsTablaComponentesProductos)
                }
                if (typeof response.errorsTablaPrecios !== "undefined" && response.errorsTablaPrecios.length > 0)
                {
                    showErrorMessage(response.errorsTablaPrecios)
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

    function jsonArrayToJsonKey(jsonArray)
    {
        // console.log(jsonArray)

        let newJson = {}

        for(let key in jsonArray)
        {
            if  (jsonArray[key] !== undefined)
            {
                newJson[jsonArray[key].name] = jsonArray[key].value
            }
        }

        return newJson
    }

    $("#btnBuscar").click(function(e) {
        e.preventDefault()
        $("#btnNuevo").trigger("click")
        $("#producto_modal").modal("show")

    })

    $("#btnNuevo").click(function(e) {
        e.preventDefault()

        let inputs =  $("#frmProducto").find('input')
        let selects =  $("#frmProducto").find('select')
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

        $("#mensaje").val("")

        $.each(selects,function(index, select) {
            $(select).val("0")
        })

        $("#componentes_productos").jqxGrid('clear');
        $("#componentes_lista").jqxGrid('clear');
        $("#fotos_grid").jqxGrid('clear');
        $("#precio_grid").jqxGrid('clear');

        $("#control_inventario").prop("checked", false)
        $("#ventas_decimales").prop("checked", false)
        $("#descontinuado").prop("checked", false)
        $("#plato").prop("checked", false)
        $("#receta").prop("checked", false)
        $("#combo").prop("checked", false)
        $("#f_comanda").prop("checked", false)
        $('#datepickerVencimiento').val(new Date())
        componente = []
        productos = []

        $("#ultimo_costo").attr("disabled", false)
        $("#ultimo_costo1").attr("disabled", false)
        $("#ultimo_costo2").attr("disabled", false)
        $("#reorden").attr("disabled", true)
        $("#nivel_maximo").attr("disabled", true)
        $("#nivel_minimo").attr("disabled", true)

    })


})