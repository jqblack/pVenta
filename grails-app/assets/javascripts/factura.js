$(document).ready( () => {

    $('[data-toggle="tooltip"]').tooltip();
    initCategoriaList()
    initTabla()

    // swal({
    //     title: 'TRABAJANDO CON FACTURA - GUARDANDO',
    //     text: 'Do you want to continue',
    //     type: 'error',
    //     confirmButtonText: 'Cool'
    // })

    $("#btn").click((e) => {
        e.preventDefault()
        let params = {}

        params = formToJson($("#content"))

        params.rnc = $("#rnc").val()
        params.razon_social = $("#razon_social").val()

        params.detalle = $("#tabla").jqxGrid('getrows')

        if (!validate(params)) {
            return
        }


        $.ajax({
            url: getUrl('facturas/store'),
            type: 'POST',
            dataType: 'JSON',
            data: {data: JSON.stringify(params)},
            beforeSend: () => {
                $("#btn").attr("disabled", true);
            },
            success: function(response) {
                if (response.success)
                {
                    toastr.success("Registro exitoso")
                    limpiar()
                }
                else if (response.errors.length > 0) {
                    showErrorMessage(response.errors)
                }
                // else if(!response.is_printer_conected) {
                //     swal("Printer desconectado", "Por favor conecte el printer antes de facturar", "error")
                // }
                else{
                    toastr.error("Fallo al cargar los datos")
                }
            },
            error: function (error) {
                console.log(error.responseText)
            },
            complete: function() {

                $("#btn").attr("disabled", false);
            }
        })
    })

    $("#frmBuscarProducto").submit( e => {
        e.preventDefault()


        // console.log($(e.target).parent())`

        let filtro = $("#filtro_producto").val()

        if ( filtro.trim().length === 0 ) { return }

        // console.log(idcategoria)

        $.ajax({
            url: getUrl('facturas/get_productos_by_reference_or_descripcion'),
            type: 'POST',
            dataType: 'JSON',
            data: { filtro: filtro },
            success: function(response) {

                if (typeof response.data !== "undefined")
                {
                    generarHTMLlistaProductos(response.data)
                }
                else{
                    toastr.error("Fallo al cargar los datos")
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })

    })

    $("#btn-validar-rnc").click( e => {
        e.preventDefault()

        let rnc = 0

        rnc = $("#rnc").val()

        // if () { return }

        $.ajax({
            url: getUrl('facturas/validar_rnc'),
            type: 'POST',
            dataType: 'JSON',
            data: { rnc: rnc },
            beforeSend: () => {
                $("#btn-validar-rnc").html(`
                    <i class="fa fa-circle-o-notch fa-spin fa-fw"></i>
                    <span class="sr-only">Loading...</span> Buscando...
                    
                `)
                $("#btn-validar-rnc").attr("disabled", true)
            },
            success: function(response) {

                if (typeof response.data !== "undefined")
                {

                    if (response.isvalid) {
                        let rs = JSON.parse(response.data)
                        console.log(rs)
                        $("#rnc").val(rs["0"])
                        $("#razon_social").val(rs["1"])

                        $("#razon_social").attr("disabled", true)
                        $("#rnc").attr("disabled", true)

                        // if (response.isvalid) {
                        //     removeStyle($("#rnc"))
                        // } else {
                        //     isInValidStyle($("#rnc"), "Comprobante vencido.")
                        // }
                    }
                    else {
                        toastr.warning("RNC invalido")
                    }
                }
                else{
                    toastr.error("Fallo al cargar los datos")
                }
            },
            error: function (error) {
                console.log(error.responseText)
            },
            complete: () => {
                $("#btn-validar-rnc").html('Buscar')

                $("#btn-validar-rnc").attr("disabled", false)
            }
        })

    })

    $("#btn-guardar-direccion").click((e) => {
        e.preventDefault()
        let params = {}

        params = formToJson($("#frm-agregar-direccion"))
        params.f_idcliente = $("#f_idcliente").val()

        if (!validateDireccion(params)) {
            return
        }

        $.ajax({
            url: getUrl('facturas/store_direccion'),
            type: 'POST',
            dataType: 'JSON',
            data: {data: JSON.stringify(params)},
            beforeSend: () => {
                $("#btn-guardar-direccion").attr("disabled", true);
            },
            success: function(response) {
                if (response.success)
                {
                    let cliente = response.data

                    $('#f_idcliente').val(cliente.fIdcliente);
                    $('#direccion').val(cliente.fDireccion);
                    $('#sector').val(cliente.fSector);

                    $("#add-modal").modal('hide')
                    toastr.success("Registro exitoso")
                }
                else{
                    toastr.error("Fallo al cargar los datos")
                }
            },
            error: function (error) {
                console.log(error.responseText)
            },
            complete: function() {

                $("#btn-guardar-direccion").attr("disabled", false);
            }
        })
    })


    $("#btnbuscar").click((e) => {
        e.preventDefault()

        $("#buscar_modal").modal('show')
    })
    $("#btnadd").click((e) => {
        e.preventDefault()

        $("#add-modal").modal('show')
    })

    $('#tabla_resultado').on('rowclick', function (event){

        $('#f_idcliente').val($('#tabla_resultado').jqxGrid('getrowdata', event.args.rowindex).f_idrecord);
        $('#direccion').val($('#tabla_resultado').jqxGrid('getrowdata', event.args.rowindex).f_direccion);
        $('#nombre').val($('#tabla_resultado').jqxGrid('getrowdata', event.args.rowindex).f_nombre);
        $('#sector').val($('#tabla_resultado').jqxGrid('getrowdata', event.args.rowindex).f_sector);
        $("#telefono").val($("#filtro").val())

        $("#btnadd").show()

        $("#buscar_modal").modal('hide')
    })

    $("#frmBuscar").submit((e) => {
        e.preventDefault()

        let params = {}

        params.filtro = $("#filtro").val()

        $.ajax({
            url: getUrl('facturas/get_cliente_by_telefono'),
            type: 'POST',
            dataType: 'JSON',
            data: params,
            success: function(response) {

                if (typeof response.data !== "undefined" )
                {
                    initTablaDireccion(response.data)
                }
                else{
                    toastr.error("Fallo al cargar los datos")
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    })

    function limpiar() {
        $('#f_idcliente').val("0");
        $('#direccion').val("");
        $('#nombre').val("");
        $('#sector').val("0");
        $("#telefono").val("")
        $("#tabla").jqxGrid('clear')
        $("#btnadd").hide()
    }

    function validate(params) {
        if (params.telefono.trim().length == "0") {
            isInValidStyle($("#telefono"), "Este campo es obligatorio.")
            return false
        } else {
            removeStyle($("#telefono"))
        }
        if (params.nombre.trim().length == "0") {
            isInValidStyle($("#nombre"), "Este campo es obligatorio.")
            return false
        } else {
            removeStyle($("#nombre"))
        }
        if (params.direccion.trim().length == "0") {
            isInValidStyle($("#direccion"), "Este campo es obligatorio.")
            return false
        } else {
            removeStyle($("#direccion"))
        }

        if (params.ncf == "0") {
            isInValidStyle($("#ncf"), "Selecciona un comprobante.")
            return false
        } else {
            removeStyle($("#ncf"))
        }

        if (params.sector == "0") {
            isInValidStyle($("#sector"), "Selecciona un comprobante.")
            return false
        } else {
            removeStyle($("#sector"))
        }

        if (params.detalle.length === 0) {
            toastr.error("Selecciona al menos 1 producto")
            return false
        }

        return true
    }
    function validateDireccion(params) {

        if (params.f_idcliente.trim().length == "0") {
            toastr.warning('No se ha seleccinado ningun cliente.')
            return false
        }
        if (params.new_direccion.trim().length == "0") {
            isInValidStyle($("#new_direccion"), "Este campo es obligatorio.")
            return false
        } else {
            removeStyle($("#new_direccion"))
        }

        if (params.new_sector == "0") {
            isInValidStyle($("#new_sector"), "Selecciona un sector.")
            return false
        } else {
            removeStyle($("#new_sector"))
        }

        return true
    }

    function initCategoriaList() {

        $.ajax({
            url: getUrl('categoria/lista'),
            type: 'POST',
            dataType: 'JSON',
            success: function(response) {

                if (typeof response.categorias !== "undefined" && response.categorias.length > 0)
                {
                    generarHTMLlistaCategoria(response.categorias)
                }
                else{
                    toastr.error("Fallo al cargar los datos")
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    }

    $("#list-categoria").on("click", "a.list-group-item", (e) => {

       //console.log($(e.target))

        let idcategoria = e.target.id

        if ( idcategoria.trim().length === 0 ) { return }

       // console.log(idcategoria)

        $.ajax({
            url: getUrl('facturas/get_productos_by_categoria'),
            type: 'POST',
            dataType: 'JSON',
            data: { idcategoria: idcategoria },
            success: function(response) {

                if (typeof response.data !== "undefined")
                {
                    generarHTMLlistaProductos(response.data)
                }
                else{
                    toastr.error("Fallo al cargar los datos")
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    })

    $("#ncf").change((e) =>{

        let idncf = 0

        idncf = $("#ncf").val()

        $.ajax({
            url: getUrl('facturas/validarVigenciaNcf'),
            type: 'POST',
            dataType: 'JSON',
            data: {idncf: idncf},
            success: function(response) {

                if (typeof response.isvalid !== "undefined")
                {
                    if (response.isvalid) {
                        removeStyle($("#ncf"))
                    } else {
                        isInValidStyle($("#ncf"), "Comprobante vencido.")
                    }

                    if (response.validar_rnc) {
                        $("#razon_social").parent().parent().show()
                        $("#rnc").parent().parent().show()
                    } else {
                        $("#razon_social").parent().parent().hide()
                        $("#rnc").parent().parent().hide()
                    }
                }
                else{
                    toastr.error("Fallo al cargar los datos")
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })

    })

    $("#list-home").on("click", "a.list-group-item", (e) => {

        let idproducto = e.target.id

        if ( idproducto.trim().length === 0 ) { return }

       // console.log(idcategoria)

        $.ajax({
            url: getUrl('facturas/get_producto'),
            type: 'POST',
            dataType: 'JSON',
            data: {id: idproducto},
            success: function(response) {
                if (typeof response.producto !== "undefined")
                {
                    addProductoDetalle(response.producto)
                }
                else{
                    toastr.error("Fallo al cargar los datos")
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    })



    function addProductoDetalle(producto) {

        let impuestoIncluido = $("#f_impuesto_incluido").prop("checked")

       // impuestoIncluido = true

        let tax = 0
        let cantidad = 1;
        let row = {}




        if ( impuestoIncluido ) {
            tax = producto.fPrecio - ( producto.fPrecio / ( ( producto.fTax / 100 ) + 1)  )
            row.precio = producto.fPrecio - tax
            row.total = producto.fPrecio * cantidad
            row.importe = row.total
        } else {
            tax = (producto.fTax / 100) * producto.fPrecio
            row.precio = producto.fPrecio
            row.total = (row.precio + tax) * cantidad
            row.importe = row.total
        }


        row.idproducto = producto.id
        row.referencia = producto.fReferencia
        row.cantidad = cantidad
        row.tax = tax


        row.descripcion = producto.fDescripcion

        var datainformations = $('#tabla').jqxGrid('getdatainformation');
        var rowscounts = datainformations.rowscount;

        $("#tabla").jqxGrid('addrow', null, row);
    }

    function initTabla() {
        var source =
            {
                localdata: {},
                datafields:
                    [
                        { name: 'idproducto', type: 'number' },
                        { name: 'descripcion', type: 'string' },
                        { name: 'precio', type: 'number' },
                        { name: 'referencia', type: 'string' },
                        { name: 'cantidad', type: 'number' },
                        { name: 'tax', type: 'number' },
                        { name: 'total', type: 'number' },
                        { name: 'importe', type: 'number' },
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);

        $("#tabla").jqxGrid({
            width: "100%",
            height: '100%',
            theme: "metro",
            source: dataAdapter,
            editable: false,
            pageable:true,
            autorowheight:true,
            showaggregates: true,
            showstatusbar: true,
            statusbarheight: 60,
            rowsheight: 40,
            columns: [
                {
                    text: '#', sortable: false, filterable: false, editable: false,
                    groupable: false, draggable: false, resizable: false, cellsalign: 'center',align: 'center',
                    datafield: '', columntype: 'number', width: '5%',
                    cellsrenderer: function (row, column, value) {
                        return "<div style='margin:4px; text-align: center'>" + (value + 1) + "</div>";
                    }
                },
                {
                    text: '<b>Accion</b>',
                    width: '10%',
                    datafield: null,
                    hidden: false,
                    editable: true,
                    align:'center',
                    cellalign:'center',
                    columntype: 'button',
                    cellsrenderer: function (row, columnfield, value, defaulthtml, columnproperties) {
                       return "x";

                    }, buttonclick: function (row) {
                        editrow = row;
                        var dataRecord = $("#tabla").jqxGrid('getrowdata', editrow);
                        //console.log(row)
                        $("#tabla").jqxGrid("deleterow", row)
                    },
                    cellclassname: function (row, column, value, data) {
                        return "cell-button"
                    }
                },
                { text: '<b>id_producto</b>', width: '10%', datafield: 'idproducto', hidden: true},
                { text: '<b>DESCRIPCION</b>', width: '25%', datafield: 'descripcion',},
                { text: '<b>CANTIDAD</b>', width: '10%', datafield: 'cantidad',cellsalign: 'right',align: 'right'},
                { text: '<b>TAX</b>', width: '15%', datafield: 'tax',cellsalign: 'right',align: 'right', cellsformat: 'c2'},
                { text: '<b>PRECIO</b>', width: '15%', datafield: 'precio',cellsalign: 'right',align: 'right', cellsformat: 'c2'},
                { text: '<b>IMPORTE</b>', width: '20%', datafield: 'importe',cellsalign: 'right',align: 'right', cellsformat: 'c2',
                    aggregates: [{
                        "<b>SUB-TOTAL </b>": function (aggregatedValue, currentValue, column, record) {
                            return aggregatedValue + (record['precio'] - record['tax'])
                        },
                        "<b>TAX </b>": function (aggregatedValue, currentValue, column, record) {
                            return aggregatedValue + record['tax']
                        },
                        "<b>TOTAL </b>": function (aggregatedValue, currentValue, column, record) {
                            return aggregatedValue + record['total']
                        }
                    }]
                },
            ],
        });
    }

    function initTablaDireccion(data) {
        var source =
            {
                localdata: data,
                datafields:
                    [
                        { name: 'f_idrecord', type: 'number' },
                        { name: 'f_direccion', type: 'string' },
                        { name: 'f_idrecord_direccion', type: 'string' },
                        { name: 'f_nombre', type: 'string' },
                        { name: 'f_sector', type: 'string' },
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);

        $("#tabla_resultado").jqxGrid({
            width: "100%",
            height: 300,
            theme: "metro",
            source: dataAdapter,
            editable: false,
            showtoolbar: false,
            pageable: true,
            autorowheight: true,
            showaggregates: true,
            showstatusbar: false,
            statusbarheight: 60,
            columns: [
                {
                    text: '#', sortable: false, filterable: false, editable: false,
                    groupable: false, draggable: false, resizable: false, cellsalign: 'center',align: 'center',
                    datafield: '', columntype: 'number', width: 30,
                    cellsrenderer: function (row, column, value) {
                        return "<div style='margin:4px; text-align: center'>" + (value + 1) + "</div>";
                    }
                },
                { text: '<b>NOMBRE</b>', width: '50%', datafield: 'f_nombre',},
                { text: '<b>DIRECCION</b>', width: '75%', datafield: 'f_direccion',},
            ],
        });
    }

    function generarHTMLlistaCategoria(data) {

        let list_categoria = null
        let htmlItemList = ''
        for(let prop in data) {

            htmlItemList += `<a 
                                id="${data[prop].id}"
                                class="list-group-item list-group-item-action " 
                                data-toggle="tab" 
                                href="#list-home" 
                                role="tab" 
                                aria-controls="list-home" 
                                aria-selected="false">
                                <div id="${data[prop].id}"  class="d-flex w-100 justify-content-between align-items-center">
                                    ${data[prop].fDescripcion}
                                <i class="icon-arrow-right"></i> 
                                </div>
                                </a>
                                `
        }
        $("#list-categoria").html(htmlItemList)
    }

    function generarHTMLlistaProductos(data) {
        //console.log(data)
        let list_categoria = null
        let htmlItemList = '<div class="row" style="cursor: pointer;"><div class="col-12"><div class="list-group">'
        for(let prop in data) {

            // htmlItemList += `
            //                      <a
            //                         class="list-group-item list-group-item-action list-group-item-info"
            //                         href="#" id="${data[prop].id}"> ${data[prop].fDescripcion}
            //                     </a>
            //                 `
            htmlItemList += `<a id="${data[prop].id}"
                                class="list-group-item list-group-item-action ">
                                <div id="${data[prop].id}" class="d-flex w-100 justify-content-between align-items-center">
                                    ${data[prop].fDescripcion}
                                <i class="icon-check text-success"></i> 
                                </div>
                                </a>
                                `
        }
        htmlItemList += '</di></di></di>'
       // console.log(htmlItemList)
        $("#list-home").html(htmlItemList)
    }
})