$(document).ready(function () {
    $('[data-toggle="tooltip"]').tooltip();
    initTabla()
    getDataMenu(0, '/categoria/lista')

    var idfactura = 0;
    var categorias = []
    var productos = []
    var fatura = {}
    var noFacturar = false;
    var idstatus = 0
    var porcientoLey = 0.10
    var f_total = 0
    var f_subTotal = 0
    var f_cambio = 0
    var f_total_porcientoley = 0
    var f_efectivo = 0
    var f_tax = 0


    $("#btn-toolbar-refresh-categorias").click(e => {
        getDataMenu(0, '/categoria/lista')
    })

    $("#btn-conectar-printer").click(e => {
        $("#conectar-printer-modal").modal("show")
    })

    $("#btn-configurar-guardar").click(e => {
        $("#btn-toolbar-facturar").trigger("click")
        $("#configurar-facturar-modal").modal("hide")
    })

    $("#btn-toolbar-configurar-factura").click(e => {
        //TODO
        $("#total_cobro").val($("#total").val())
        $("#configurar-facturar-modal").modal("show")
    })

    $('#configurar-facturar-modal').on('shown.bs.modal', function () {
        $('#efectivo').trigger('focus')
    })

    $("#frmBuscarCliente").submit(function (e) {
        e.preventDefault()

        if (this.filtro.value.length === 0) {
            return
        }

        $.ajax({
            url: getUrl('cliente/lista'),
            type: 'POST',
            dataType: 'json',
            data: {filtro: this.filtro.value},
            beforeSend: function () {
                $("#cliente_grid").jqxGrid('clear');
            },
            success: function (response) {
                if (response.clientes.length > 0) {
                    init_tabla_cliente_filtrados(response.clientes)
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    })


    $("#btn-toolbar-remover-producto").click(e => {
        // let row = 0;

        var selectedrowindex = $("#tabla").jqxGrid('getselectedrowindex');
        var rowscount = $("#tabla").jqxGrid('getdatainformation').rowscount;


        if (selectedrowindex >= 0 && selectedrowindex < rowscount) {
            var id = $("#tabla").jqxGrid('getrowid', selectedrowindex);
            var commit = $("#tabla").jqxGrid('deleterow', id);
        }

        var count = $("#tabla").jqxGrid('getdatainformation').rowscount;

        if (count == 0) {
            limpiar()
        }
    })

    // $("#btn-toolbar-facturar").click( e => {
    //     factura()
    // })

    $("#btn-conectar-pedidos").click(e => {
        let params = {}
        let button = e.target

        params.idnodo = $("#idnodo").val()

        if (typeof params.idnodo !== "undefined" && params.idnodo.trim().length == 0) {
            return
        }

        $.ajax({
            url: getUrl('pedidos/setIdPrintNodo'),
            type: 'POST',
            dataType: 'JSON',
            data: params,
            success: function (response) {
                if (response.isvalid) {
                    $("#conectar-printer-modal").modal("hide")
                    $("#btn-conectar-printer").removeClass('btn-danger')
                    $("#btn-conectar-printer").addClass('btn-success')
                    $("#btn-conectar-printer").html('<i class="fa font-2xl d-block mt-2 fa-print"></i> Conectado')
                    toastr.success("Printer conectado")
                } else if (response.isconected) {
                    $("#conectar-printer-modal").modal("hide")
                    toastr.warning("Printer ya esta conectado.")
                } else {
                    toastr.warning("Printer no se pudo conectar")
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    })

    $("#ck_porciento_ley").click(e => {

        $("#autorizacion-modal").modal("show")

        $("#ck_porciento_ley").prop("checked", !$("#ck_porciento_ley").prop("checked"))
    })

    $("#ncf").change((e) => {
        let idncf = 0

        idncf = $("#ncf").val()
        $("#rnc").attr("disabled", false)

        $.ajax({
            url: getUrl('facturas/validarVigenciaNcf'),
            type: 'POST',
            dataType: 'JSON',
            data: { idncf: idncf },
            success: function (response) {

                if (typeof response.isvalid !== "undefined") {
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
                else {
                    toastr.error("Fallo al cargar los datos")
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })

    })

    $("#btn-validar-rnc").click(e => {
        e.preventDefault()

        let rnc = 0

        rnc = $("#rnc").val()

        $.ajax({
            url: getUrl('facturas/validar_rnc'),
            type: 'POST',
            dataType: 'JSON',
            data: {rnc: rnc},
            beforeSend: () => {
                $("#btn-validar-rnc").html(`
                    <i class="fa fa-circle-o-notch fa-spin fa-fw"></i>
                    <span class="sr-only">Loading...</span> Buscando...`)
                $("#btn-validar-rnc").attr("disabled", true)
            },
            success: function (response) {

                if (typeof response.data !== "undefined") {

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
                else {
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

    $("#efectivo").keyup(e => {
        var key = window.event ? e.which : e.keyCode;
        console.log(key)

        if ((key <= 105 && key >= 96) || key == 8) {
            f_efectivo = e.target.value
            f_cambio = f_efectivo >= f_total ? f_efectivo - f_total : 0

            $("#cambio").val(formatter.format(f_cambio, 0, 2))
        }

        if (key < 48 || key > 57) {
            //Usando la definición del DOM level 2, "return" NO funciona.
            e.preventDefault();
        } else {

            f_efectivo = e.target.value
            f_cambio = f_efectivo >= f_total ? f_efectivo - f_total : 0

            $("#cambio").val(formatter.format(f_cambio, 0, 2))
        }
    })

    $("#frm-autorizacion").submit(e => {
        e.preventDefault()

        let params = {}
        params = formToJson($("#frm-autorizacion"))

        $.ajax({
            url: getUrl('registrar_factura/autorizacion_porciento_ley'),
            type: 'POST',
            dataType: 'JSON',
            data: params,
            beforeSend: () => {
                $("#btn").attr("disabled", true);
                $("button[type='submit']").attr("disabled", true)
            },
            success: function (response) {
                if (response.has_permission) {
                    $("#ck_porciento_ley").prop("checked", !$("#ck_porciento_ley").prop("checked"))
                    recalcularTabla()
                    $("#usuario").val("")
                    $("#password").val("")
                }
                else if (!response.has_permission) {
                    swal("Acceso negado", "No tienes permiso para esta accion", "error")
                }
                else {
                    toastr.error(response.msj)
                }
            },
            error: function (error) {
                console.log(error.responseText)
            },
            complete: function () {

                $("#autorizacion-modal").modal("hide")
                $("button[type='submit']").attr("disabled", false)
            }
        })

    })

    $('#tabla').on('cellclick', function (event) {
        // // if (noFacturar) { return }
        //
        // if (args.columnindex > 5) { return }
        //
        // let url = ""
        //
        // let orden = {}
        // orden.idorden = $('#tabla').jqxGrid('getrowdata', event.args.rowindex).id;
        // orden.idstatus = $('#tabla').jqxGrid('getrowdata', event.args.rowindex).fidestatus;
        //
        // idfactura = orden.idorden
        // idstatus = orden.idstatus
        //
        //
        // if (orden.idstatus >= 5) {
        //     url = "pedidos/get_factura_cerrada"
        // } else {
        //     url = "pedidos/get_pedido"
        // }
        //
        // //console.log(url)
        // //console.log($('#tabla').jqxGrid('getrowdata', event.args.rowindex))
        //
        // $.ajax({
        //     url: getUrl(url),
        //     type: 'POST',
        //     dataType: 'JSON',
        //     data: orden,
        //     success: function(response)
        //     {
        //         //idfactura = response.data.factura_id
        //         //idstatus = response.data.fidestatus
        //         generateHTML(response.data)
        //         //scrollTo(0, 634)
        //     },
        //     error: function(error) {
        //         console.log(error)
        //     }
        // })
    });

    $("#btn-toolbar-facturar").click((e) => {
        e.preventDefault()
        let params = {}

        params = formToJson($("#content"))

        params.rnc = $("#rnc").val()
        params.razon_social = $("#razon_social").val()
        params.total = f_total
        params.subtotal = f_subTotal
        params.tax = f_tax
        params.porciento_ley = f_total_porcientoley
        params.cambio = f_cambio
        params.efectivo = f_efectivo
        params.ck_porciento_ley = $("#ck_porciento_ley").prop("checked")

        params.cliente_id = $("#cliente_id").val()

        params.detalle = $("#tabla").jqxGrid('getrows')

        if (!validate(params)) {
            return
        }


        $.ajax({
            url: getUrl('registrar_factura/facturar'),
            type: 'POST',
            dataType: 'JSON',
            data: {data: JSON.stringify(params)},
            beforeSend: () => {
                $("#btn").attr("disabled", true);
            },
            success: function (response) {

                if (response.success) {
                    toastr.success("Registro exitoso")
                    limpiar()
                }
                else if (response.errors.length > 0) {
                    showErrorMessage(response.errors)
                } else  if (typeof response.response_server_print.f_key !== "undefined" && parseInt(response.response_server_print.f_key) != 1) {
                    swal("Error Code: " + response.response_server_print.f_key, response.response_server_print.f_mensaje, "warning")
                    return;
                }
                else {
                    toastr.error("Fallo al cargar los datos")
                }
            },
            error: function (error) {
                console.log(error.responseText)
            },
            complete: function () {

                $("#btn").attr("disabled", false);
            }
        })
    })

    $('#cliente_grid').on('rowclick', function (event) {

        let cliente = {};
        cliente.id = $('#cliente_grid').jqxGrid('getrowdata', event.args.rowindex).id;

        $.ajax({
            url: getUrl('cliente/get_cliente'),
            type: 'POST',
            dataType: 'JSON',
            data: cliente,
            success: function (response) {
                //console.log(response)
                //$("#btnNuevo").trigger('click')

                if (typeof response.cliente !== "undefined") {
                    let creditoDesipoble = response.cliente.fLimiteCredito - response.cliente.fBalance
                    $("#nombre").val(response.cliente.fNombre + " " + response.cliente.fApellido)

                    $("#credito_disponible").val(formatter.format(creditoDesipoble, 0, 2))
                    $("#direccion_cliente").val(response.cliente.fDireccion)
                    $("#cliente_id").val(response.cliente.id)

                    $("#credito_disponible").attr("disabled", true)
                    $("#direccion_cliente").attr("disabled", true)
                    $("#cliente_id").attr("disabled", true)
                    $("#nombre").attr("disabled", true)
                }

                $("#cliente_modal").modal("hide")
            },
            error: function (error) {
                console.log(error)
            }
        })

    });

    $("#producto-container").on('click', 'a.btn', e => {
        e.preventDefault()
        let id = e.target.id
        let url = ""

        if (categorias.length > 0) {
            url = getUrl('facturas/get_productos_by_categoria')

            $.ajax({
                url: url,
                type: 'POST',
                dataType: 'JSON',
                data: {idcategoria: id},
                beforeSend: () => {
                    //showLoader()
                    categorias = []
                },
                success: function (response) {
                    generarHTLMMenu(response.data, 'success')
                    productos = response.data
                    $("#menu-title").html("Productos")


                },
                error: function (error) {
                    console.log(error.responseText)
                },
                complete: () => {
                    //hideLoader()
                }
            })
        } else if (productos.length > 0) {
            let producto = productos.filter(item => item.id == id)
            //console.log(producto[0])
            addProductoDetalle(producto[0])
        } else {

        }
    })

    function recalcularTabla() {
        let productosInTable = $("#tabla").jqxGrid("getrows")
        $("#tabla").jqxGrid("clear")
        productosInTable.map(item => {

            productos.map(i => {
                let select = {}

                if (item.idproducto == i.id) {
                    addProductoDetalle(i)
                }
            })
        })
    }

    function init_tabla_cliente_filtrados(data) {
        var source =
            {
                localdata: data,
                datafields:
                    [
                        {name: 'id', type: 'number'},
                        {name: 'fNombre', type: 'string'},
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#cliente_grid").jqxGrid(
            {
                width: "100%",
                pageable: true,
                autoheight: true,
                theme: "metro",
                source: dataAdapter,
                editable: false,
                columns: [
                    {text: '<b>ID</b>', width: '7%', datafield: 'id', hidden: true},
                    {text: '<b>Nombre</b>', width: '100%', datafield: 'fNombre'},
                ]
            });
    }

    function validate(params) {
        if (params.detalle.length === 0) {
            toastr.error("Selecciona al menos 1 producto")
            return false
        }
        return true
    }

    function limpiar() {

        // $('#rnc').hide();
        // $('#razon_social').hide();

        $("#razon_social").parent().parent().hide()
        $("#rnc").parent().parent().hide()

        $('#f_idcliente').val("0");
        $('#tipo_tarjeta').val("0");
        $('#credito_disponible').val("");
        $('#direccion_cliente').val("");
        $('#rnc').val("");
        $('#razon_social').val("");
        $('#nombre').val("");
        $('#filtro').val("");
        $('#sector').val("0");
        $("#telefono").val("")
        $("#tabla").jqxGrid('clear')
        $("#btnadd").hide()

        $("#subtotal").val("0.00")
        $("#monto_tarjeta").val("0.00")
        $("#autorizacion_tarjeta").val("0.00")
        $("#propina").val("0")
        $("#cambio").val("0")
        $("#efectivo").val("0")
        $("#total").val("0.00")
        $("#total_cobro").val("0.00")
        $("#total").val("0.00")
        $("#tax").val("0.00")
        $("#porciento_ley").val("0.00")

        console.log($("#ncd :selected").val())

    }

    function calcularTotales() {
        let total = 0
        let subtotal = 0
        let porciento = 0
        let itbis = 0

        total = parseFloat($("#total").val()) || 0
        subtotal = parseFloat($("#subtotal").val()) || 0
        porciento = parseFloat($("#porciento").val()) || 0
        itbis = parseFloat($("#itbis").val()) || 0


    }

    function addProductoDetalle(producto) {

        let impuestoIncluido = $("#f_impuesto_incluido").prop("checked")
        let cobrarPorciento = $("#ck_porciento_ley").prop("checked")

        // impuestoIncluido = true

        let tax = 0
        let cantidad = 1;
        let row = {}
        //let impuesto_producto = producto.fTax


        if (impuestoIncluido) {

            if (producto.fTax > 0) {
                tax = producto.f_precio - (producto.f_precio / ((producto.fTax / 100) + 1))
            }

            row.precio = producto.f_precio - tax
            row.total = producto.f_precio * cantidad
            row.importe = row.total
        } else {

            if (producto.fTax > 0) {
                tax = (producto.fTax / 100) * producto.f_precio
            }


            row.precio = producto.f_precio
            row.total = (row.precio + tax) * cantidad
            row.importe = row.total
        }

        row.porciento_ley = row.precio * porcientoLey


        row.idproducto = producto.id
        row.referencia = producto.fReferencia
        row.cantidad = cantidad
        row.tax = tax


        row.descripcion = producto.fDescripcion

        var datainformations = $('#tabla').jqxGrid('getdatainformation');
        var rowscounts = datainformations.rowscount;

        $("#tabla").jqxGrid('addrow', null, row);
    }


    function getDataMenu(id, url) {

        $.ajax({
            url: getUrl(url),
            type: 'POST',
            dataType: 'JSON',
            data: {id: id},
            success: function (response) {
                generarHTLMMenu(response.categorias, 'primary')
                categorias = response.categorias
                $("#menu-title").html("Categorias")

            },
            error: function (error) {
                console.log(error)
            }
        })
    }

    function generarHTLMMenu(data, color) {
        let html = '<div class="row">'

        for (let prop in data) {
            html += `
                <div class="col-6 col-sm-6 col-md-3 col-xl-4 col-lg-4">
                    <a href="#" id="${data[prop].id}" 
                    class="btn btn-${color} btn-block py-3 my-1 btn-wrap-text btn-menu mh-100">
                    ${data[prop].fDescripcion} ${ data[prop].fDescripcion.length <= 23 ? '<br>&nbsp;': ''}
                    </a>
                </div>
            `
        }
        html += '</div>'
        $("#producto-container").html(html)
        $("#producto-container").fadeIn('slow')
    }

    function factura() {
        let url = "/pedidos/facturar"

        //if (idfactura !== 0) {
        //  url = parseInt(idstatus) < 5 ? "pedidos/facturar":"pedidos/reimprimir"
        //console.log(idstatus)

        $.ajax({
            url: getUrl(url),
            type: 'POST',
            dataType: 'JSON',
            data: {idfactura: idfactura},
            success: function (response) {

                if (!response.is_printer_conected) {
                    //toastr.warning();
                    swal("Printer desconectado", "Por favor conecte el printer para imprimir", "warning")
                }

                if (response.success) {
                    // idfactura = 0
                    // initTabla(getUrl('pedidos/get_pedidos'))
                    // $("#detalle-pedido").html('')

                    toastr.success("Registro Exitoso", "Facturacion")
                }

            },
            error: function (error) {
                console.log(error)
            }
        })
        // } else {
        //     toastr.error("Esta factura esta cerrada.")
        // }
    }

    function initTabla() {
        var source =
            {
                localdata: {},
                datafields:
                    [
                        {name: 'idproducto', type: 'number'},
                        {name: 'descripcion', type: 'string'},
                        {name: 'precio', type: 'number'},
                        {name: 'referencia', type: 'string'},
                        {name: 'cantidad', type: 'number'},
                        {name: 'tax', type: 'number'},
                        {name: 'total', type: 'number'},
                        {name: 'importe', type: 'number'},
                        {name: 'porciento_ley', type: 'number'},
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);

        $("#tabla").jqxGrid({
            width: "100%",
            height: '100%',
            theme: "metro",
            source: dataAdapter,
            editable: false,
            pageable: false,
            showaggregates: true,
            showstatusbar: false,
            statusbarheight: 60,
            rowsheight: 40,
            columns: [
                {
                    text: '#', sortable: false, filterable: false, editable: false,
                    groupable: false, draggable: false, resizable: false, cellsalign: 'center', align: 'center',
                    datafield: '', columntype: 'number', width: '5%',
                    cellsrenderer: function (row, column, value) {
                        return "<div style='margin:4px; text-align: center'>" + (value + 1) + "</div>";
                    }
                },
                {
                    text: '<b>Accion</b>',
                    width: '10%',
                    datafield: null,
                    hidden: true,
                    editable: true,
                    align: 'center',
                    cellalign: 'center',
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
                {text: '<b>id_producto</b>', width: '10%', datafield: 'idproducto', hidden: true},
                {text: '<b>DESCRIPCION</b>', width: '34.8%', datafield: 'descripcion',},
                {text: '<b>CANT.</b>', width: '10%', datafield: 'cantidad', cellsalign: 'right', align: 'right'},
                {
                    text: '<b>TAX</b>',
                    width: '15%',
                    datafield: 'tax',
                    cellsalign: 'right',
                    align: 'right',
                    cellsformat: 'c2'
                },
                {
                    text: '<b>PRECIO</b>',
                    width: '17.3%',
                    datafield: 'precio',
                    cellsalign: 'right',
                    align: 'right',
                    cellsformat: 'c2'
                },
                {
                    text: '<b>IMPORTE</b>',
                    width: '17.7%',
                    datafield: 'importe',
                    cellsalign: 'right',
                    align: 'right',
                    cellsformat: 'c2',
                    aggregates: [{
                        "<b>SUB-TOTAL </b>": function (aggregatedValue, currentValue, column, record) {
                            let precio = aggregatedValue + record['precio']
                            precio = parseFloat(precio)
                            //$("#subtotal").val(precio.toFixed(2))
                            $("#subtotal").val(formatter.format(precio))
                            f_subTotal = precio
                            return precio
                        },
                        "<b>TAX </b>": function (aggregatedValue, currentValue, column, record) {
                            let tax = aggregatedValue + record['tax']
                            tax = parseFloat(tax)
                            //$("#tax").val(tax.toFixed(2))
                            $("#tax").val(formatter.format(tax))
                            //  console.log(tax)
                            f_tax = tax
                            return tax
                        },
                        "<b>PORCIERTO LEY </b>": function (aggregatedValue, currentValue, column, record) {
                            let porciento = 0
                            porciento = aggregatedValue + record['porciento_ley']
                            porciento = parseFloat(porciento)

                            // console.log(precio)
                            let cobrarPorciento = $("#ck_porciento_ley").prop("checked")
                            // $("#porciento_ley").val(precio.toFixed(2))

                            if (cobrarPorciento) {
                                //sconsole.log(total)
                                $("#porciento_ley").val(formatter.format(porciento))
                                // $("#total").val(formatter.format(total + porciento))
                            } else {
                                $("#porciento_ley").val("$ 0.00")

                            }
                            // console.log(porciento)
                            f_total_porcientoley = porciento
                            return porciento
                        },
                        "<b>TOTAL </b>": function (aggregatedValue, currentValue, column, record) {

                            let porcietoley = record['porciento_ley']


                            let total = 0
                            let cobrarPorciento = $("#ck_porciento_ley").prop("checked")

                            if (cobrarPorciento) {
                                total = aggregatedValue + record['importe'] + porcietoley
                                $("#total").val(formatter.format(total))
                            } else {

                                total = aggregatedValue + record['importe']
                                $("#total").val(formatter.format(total))
                            }

                            //total = parseFloat(total)
                            // $("#total").val(formatter.format(total))
                            //   console.log(total)
                            f_total = total
                            return total
                        },
                    }]
                },
            ],
        });
    }

    $("#btn-cambiar-printer-config").click(e => {
        let params = {}
        let button = e.target

        params.idconfiguracion = $("#idprinterconfig").val()
        params.idproceso = 1

        $.ajax({
            url: getUrl('preferencia/cambiar_configuracion_procesos'),
            type: 'POST',
            dataType: 'JSON',
            data: params,
            success: function (response) {
                if (response.success && typeof response.configChanged !== "undefined") {
                    toastr.success("Configuracion ha cambiado")
                } else {
                    toastr.warning("Error al cambiar la configuracion")
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    })
})
