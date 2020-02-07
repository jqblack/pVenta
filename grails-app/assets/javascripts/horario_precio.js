$(document).ready(function(){

    $("#descripcion").prop("disabled", true)
    $("#categoria").prop("disabled", true)
    $("#referencia").prop("disabled", true)

    $("#btnBuscar").click(function(e) {
        e.preventDefault()
        $("#btnNuevo").trigger("click")

    })

    $("#btn-toolbar-agregar").click( e => {
        var datarow = [
            {
                dia:"Selecione un dia",
                dia_list: -1,
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
    })

    $("#btn-toolbar-eliminar").click( e => {
        var selectedrowindex = $("#precio_grid").jqxGrid('getselectedrowindex');
        var rowscount = $("#precio_grid").jqxGrid('getdatainformation').rowscount;
        if (selectedrowindex >= 0 && selectedrowindex < rowscount) {
            var id = $("#precio_grid").jqxGrid('getrowid', selectedrowindex);
            var commit = $("#precio_grid").jqxGrid('deleterow', id);
        }
    })

    $("#btnNuevo").click(function(e) {
        e.preventDefault()

        let inputs =  $("#frmProducto").find('input')
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
        $("#precio_grid").jqxGrid('clear');


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
        $("#id").val( $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).id )


        let producto = {}

        producto.id = $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).id

        $.ajax({
            url: window.location + '/get_producto',
            type: 'POST',
            dataType: 'JSON',
            data: producto,
            success: function(response)
            {
                //$("#nuevo").trigger('click')

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
                            fNombreArea: item[0].fIdarea,
                            hora_inicial: item[0].fHoraInicio,
                            hora_final: item[0].fHoraFin,
                            precio: item[0].fPrecio,
                            activo: item[0].fPrecioActivo,
                            doble: item[0].fDoble,
                            comentario: item[0].fComentario,
                        });
                    })
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
        inputs['precios'] = []

        inputs.id = $("#id").val() ? $("#id").val(): 0

        inputs.precios = $('#precio_grid').jqxGrid('getrows')

        if (parseInt(inputs.id) === 0)
        {
            toastr.warning("Debes seleccionar un producto")
            return false
        }

        if (inputs.precios.length < 1)
        {
            toastr.warning("No se ha agregado ningun precio.")
            return false
        }


        $.ajax({
            url: window.location + '/add_horario_precio',
            type: 'POST',
            dataType: 'JSON',
            data: {data: JSON.stringify(inputs)},
            success: function(response) {

                if (typeof response.errors !== "undefined" && response.errors.length > 0)
                {
                    showErrorMessage(response.errors)
                    return
                }
                if (typeof response.errorsTablaPrecios !== "undefined" && response.errorsTablaPrecios.length > 0)
                {
                    showErrorMessage(response.errorsTablaPrecios);
                    return;
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
            height: 400,
            theme: "metro",
            source: dataAdapter,
            editable: false,
            columns: [
                { text: '<b>ID</b>', width: '7%', datafield: 'id', hidden: true},
                { text: '<b>Referencia</b>', width: '27%', datafield: 'fReferencia'},
                { text: '<b>Descripcion</b>', width: '38%', datafield: 'fDescripcion'},
                { text: '<b>Precio</b>', width: '15%', datafield: 'fPrecio', cellsalign: 'right', cellsformat: 'c2'},
                { text: '<b>categoria</b>', width: '15%', datafield: 'categoria', cellsalign: 'right', hidden: true},
                { text: '<b>fIdcategoria</b>', width: '15%', datafield: 'fIdcategoria', cellsalign: 'right', hidden: true},
                { text: '<b>Horario de precios</b>', width: '20%',columntype: 'checkbox', datafield: 'hasHorarioPrecio',},
            ]
        });
    }



    (function() {
        $.ajax({
            url: window.location  + '/get_data_combo',
            type: 'POST',
            dataType: 'JSON',
            success: function(response) {

                // if (response.areas.length > 0)
                // {
                    let areas = []
                    areas = response.areas
                    areas.push({'id': 0, fNombreArea:'--Seleccionar opcion--'})
                    init_tabla_precios(areas)
                //}
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    })()


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
                        { name: 'fNombreArea', value: 'fNombreArea', values: { source: areaAdapter.records, value: 'id', name: 'fNombreArea' } },
                        // { name: 'fNombreArea', type: 'string' },
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
                height: 300,
                theme: "metro",
                source: dataAdapter,
                showtoolbar: false,
                editable:true,
                rendertoolbar: function (toolbar) {
                    var me = this;
                    var container = $("<div style='margin: 5px;'></div>");
                    toolbar.append(container);
                    // container.append('<input class="btn btn-primary" id="addrowbutton" type="button" value="+" />');
                    // container.append('<input class="btn btn-danger" id="deleterowbutton" type="button" value="-" />');
                    // container.append('<button id="addrowbutton" style="margin-left: 5px;" type="button"><i class="fa fa-plus"></i>  Agregar</button>');
                    // container.append('<button id="deleterowbutton" type="button"> <i class="fa fa-trash-o"></i> Eliminar</button>');
                    //
                    // $("#addrowbutton").jqxButton();
                    //
                    //
                    // $("#deleterowbutton").jqxButton();


                    // create new row.
                    $("#addrowbutton").on('click', function (e) {
                        var datarow = [
                            {
                                dia:"Selecione un dia",
                                dia_list: -1,
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
                        // console.log(datarow)
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
                    { text: 'Hora Inicial', width: '15%', datafield: 'hora_inicial', columntype: 'numberinput' },
                    { text: 'Hora Final', width: '15%', datafield: 'hora_final', cellsalign: 'right', columntype: 'numberinput' },
                    { text: 'Precio', width: '10%', datafield: 'precio', cellsalign: 'right',columntype: 'numberinput'},
                    { text: 'Activo',width: '10%', datafield: 'activo',  cellsalign: 'right', cellsformat: 'c2', columntype:'checkbox' },
                    { text: 'doble', width: '10%',datafield: 'doble',  cellsalign: 'right', cellsformat: 'c2', columntype:'checkbox' },
                    { text: 'comentario', width: '30%', datafield: 'comentario', }
                ]
            });

    }
})
