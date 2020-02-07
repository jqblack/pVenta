$(document).ready(function () {
    $('[data-toggle="tooltip"]').tooltip();
    var idfactura = 0;
    var fatura = {}
    var noFacturar = false;
    var idstatus = 0
    var totalFacturasAsignadas = 0

    //pedidos/setIdPrintNodo

    initTabla(getUrl('pedidos/get_pedidos'))

    setInterval(() => {
        initTabla(getUrl('pedidos/get_pedidos'))
    }, 300000)


    $("#btn-actualizar-ordenes").on('click', e => {
        initTabla(getUrl('pedidos/get_pedidos'))
        $("#detalle-pedido").html("")
        noFacturar = false
    })

    $("#btn-actualizar-ordenes-cerradas").on('click', e => {
        initTablaOrdenesCerradas(getUrl('pedidos/get_pedidos_cerrado'))
        $("#detalle-pedido").html("")
        noFacturar = true;
    })

    $("#btn-toolbar-asignar-ordenes").click(e => {
        $("#asignar-pedidos-modal").modal("show")
        initTablaMsj()

    })

    $("#btn-registrar-orden").on('click', e => {
        let ventana = {}

        ventana.url = getUrl('facturas')
        ventana.name = "_blank"
        ventana.specs = "width=1280,height=1024,location=0,menubar=0,status=0,titlebar=0,fullscreen=1"

        // window.open(
        //     ventana.url,
        //     ventana.name,
        //     ventana.specs
        // );
        $("#crear-pedidos-modal-content").html("<iframe allowfullscreen='' style='width: 100%; height: 95vh;' src='" + ventana.url + "'></iframe>")
        $("#crear-pedidos-modal").modal("show")
    })


    $("#btn-conectar-printer").click(e => {
        $("#conectar-printer-modal").modal("show")
    })

    $("#btn-modal-asignar").click(e => {
        $("#list-mensajeros").val("0")
        $("#total-pedidos").val("0")
        $("#idfactura").val("")
        removeStyle($("#list-mensajeros"))
        totalFacturasAsignadas = 0
        $("#conectar-printer-modal").modal("hide")
    })

    $("#list-mensajeros").change(e => {

        $("#total-pedidos").val("")
        $("#idfactura").val("")
        totalFacturasAsignadas = 0
        removeStyle($("#total-pedidos"))
    })

    $("#btn-toolbar-facturar").click(e => {
        factura("", idfactura, idstatus, 0)
    })

    $('#conectar-printer-moda').on('shown.bs.modal', function () {
        $('#conectar-printer-moda').trigger('focus')
    })

    $("#asignar-pedidos-modal").on("hide.bs.modal", e => {
        $("#list-mensajeros").val("0")
        $("#total-pedidos").val("")
        $("#idfactura").val("")
        totalFacturasAsignadas = 0
        removeStyle($("#total-pedidos"))
    })
    $("#asignar-pedidos-modal").on("hidden.bs.modal", e => {
        $("#list-mensajeros").val("0")
        totalFacturasAsignadas = 0
        $("#total-pedidos").val("")
        $("#idfactura").val("")
        removeStyle($("#total-pedidos"))
    })

    $("#idfactura").keypress(e => {
        //console.log(e.keyCode)
        if (e.keyCode == 13) {
            $("#btn-asignar-orden").trigger("click")
        }
    })

    $("#btn-toolbar-imprimir-orden").click(e => {
        let params = {}
        let selectIndex = $("#tabla").jqxGrid("getselectedrowindex")

        if (selectIndex == -1) {
            return
        }

        params.idfactura = $("#tabla").jqxGrid("getrowdata", selectIndex).id

        $.ajax({
            url: getUrl('pedidos/imprimir_pedido'),
            type: 'POST',
            dataType: 'JSON',
            data: params,
            success: function (response) {
                if (response.success) {
                    toastr.success("Imprimiendo...")
                } else if (response.isconected) {
                    $("#conectar-printer-modal").modal("hide")
                    toastr.warning("Printer ya esta conectado.")
                } else {
                    toastr.warning("Printer no esta conectado")
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    })

    $("#btn-asignar-orden").click(e => {
        let id = $("#idfactura").val()
        let idmensajero = $("#list-mensajeros").val()

        if (idmensajero == 0 || idmensajero == '0') {
            isInValidStyle($("#list-mensajeros"), "Seleccione un mensajero")
            return;
        }
        else {
            isValidStyle($("#list-mensajeros"))
        }

        if (id.trim().length > 0) {
            factura(id, -1, idstatus, idmensajero)
        }
    })



    $("#detalle-pedido").on('click', 'button.btn-facturar', e => {
        factura("", idfactura, idstatus, 0)
    })


    $('#tabla').on('cellclick   ', function (event) {
        // if (noFacturar) { return }

        if (args.columnindex > 5) {
            return
        }

        let url = ""

        let orden = {}
        orden.idorden = $('#tabla').jqxGrid('getrowdata', event.args.rowindex).id;
        orden.idstatus = $('#tabla').jqxGrid('getrowdata', event.args.rowindex).fidestatus;

        idfactura = orden.idorden
        idstatus = orden.idstatus

        //document.getElementById('detalle-pedido').scrollIntoView()
        //document.getElementById('crear-pedidos-modal').scrollIntoView()


        if (orden.idstatus >= 5) {
            url = "pedidos/get_factura_cerrada"
        } else {
            url = "pedidos/get_pedido"
        }

        //console.log(url)
        //console.log($('#tabla').jqxGrid('getrowdata', event.args.rowindex))

        $.ajax({
            url: getUrl(url),
            type: 'POST',
            dataType: 'JSON',
            data: orden,
            success: function (response) {
                //idfactura = response.data.factura_id
                //idstatus = response.data.fidestatus
                generateHTML(response.data)
                //scrollTo(0, 634)
            },
            error: function (error) {
                console.log(error)
            }
        })
    });

    $('#tabla_mensajeros').on('rowclick', function (event) {
        let orden = {}
        orden.idmensajero = $('#tabla_mensajeros').jqxGrid('getrowdata', event.args.rowindex).id;
        orden.idfactura = idfactura
        idfactura = 0

        $.ajax({
            url: getUrl('pedidos/asignar_mensajero'),
            type: 'POST',
            dataType: 'JSON',
            data: orden,
            success: function (response) {
                if (response.success) {
                    $("#asignar-modal").modal('hide')
                    initTabla(getUrl('pedidos/get_pedidos'))
                    toastr.success('Mensajero Asignado con exito')
                }
            },
            error: function (error) {
                console.log(error)
            }
        })
    });

    $("#tabla").on('cellendedit', function (event) {
        // event arguments.
        var args = event.args;
        var rowData = args.row;

        if (args.oldvalue.value === args.value.value) {
            return;
        }
        let params = {}

        params.idfactura = rowData.id
        params.idestado = args.value.value
        $.ajax({
            url: getUrl('pedidos/store_estado'),
            type: 'POST',
            dataType: 'JSON',
            data: {data: JSON.stringify(params)},
            success: function (response) {
                if (typeof response.errors !== "undefined" && response.errors.length > 0) {
                    showErrorMessage(response.errors)
                    return
                }
                if (response.success) {
                    toastr.success("Orden Actualizada")
                    $("#btn-actualizar-ordenes").trigger("click")
                }
                else {
                    toastr.error("Ocurrio un error con la comunicacion")
                    return
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    });

    $("#btn").click((e) => {
        let params = formToJson($("#frm"))
        let dias = $("#tabla-horario").jqxGrid('getrows')
        let i = 1;
        for (let prop in dias) {
            if (dias[prop].libre) {
                params['f_horario_' + i] = "-1";
            } else {

                params['f_horario_' + i] = dias[prop].apertura.getHours() + ':' + dias[prop].apertura.getMinutes() +
                    ';' + dias[prop].cierre.getHours() + ':' + dias[prop].cierre.getMinutes()
            }
            i++
        }
        params.f_impuesto_incluido = (params.f_impuesto_incluido === 'on') ? true : false
        params.f_longitud = 0
        params.f_latitud = 0

        $.ajax({
            url: getUrl('preferencia/store'),
            type: 'POST',
            dataType: 'JSON',
            data: {data: JSON.stringify(params)},
            success: function (response) {

                if (typeof response.errors !== "undefined" && response.errors.length > 0) {
                    showErrorMessage(response.errors)
                    return
                }
                if (response.success) {
                    toastr.success("Datos guardados Correctamente")
                    setTimeout(() => {
                        window.location.reload()
                    }, 400)
                    $("#btnNuevo").trigger("click")
                }
                else {
                    toastr.error("Ocurrio un error con la comunicacion")
                    return
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    })

    function factura(idorden = "", id = 0, status, idmensajero) {
        let url = "/pedidos/facturar"
        let params = {}

        if (id !== 0) {
            url = parseInt(status) < 5 ? "pedidos/facturar" : "pedidos/reimprimir"
            params.idfactura = id
            params.idorden = idorden
            params.idmensajero = idmensajero

            $.ajax({
                url: getUrl(url),
                type: 'POST',
                dataType: 'JSON',
                data: params,
                beforeSend: () => {
                    $("#btn-asignar-orden").attr("disabled", true)
                },
                success: function (response) {
                    if (!response.is_printer_conected) {
                        swal("Printer desconectado", "Por favor conecte el printer para imprimir", "warning")
                        return;
                    }

                    if (parseInt(response.response_server_print.f_key) != 1) {
                        swal("Error Code: " + response.response_server_print.f_key, response.response_server_print.f_mensaje, "warning")
                        return;
                    }

                    if (response.success) {
                        idfactura = 0
                        initTabla(getUrl('pedidos/get_pedidos'))
                        $("#detalle-pedido").html('')

                        if (response.hasOwnProperty('factura')) {
                            totalFacturasAsignadas += response.factura[0].f_total_con_envio
                            $("#total-pedidos").val(formatter.format(totalFacturasAsignadas, 0, 2))
                        }
                    }

                    if (response.errors.length > 0) {
                        showErrorMessage(response.errors)
                    }

                },
                error: function (error) {
                    console.log(error)
                },
                complete: function () {
                    $("#btn-asignar-orden").attr("disabled", false)
                }
            })
        } else {
            toastr.error("No se haz seleccionado ninguna factura")
        }
    }


    function generateHTML(data) {
        let componente = ""
        componente += `
                <div class="card-pedido">
                    <div class="card">
                        <div class="card-body">
                            <div class="h3 text-muted text-left mb-2">
                              <i class="icon-clock"></i> ${data.edad != undefined ? data.edad.hours : 0 }Hrs ${data.edad != undefined ? data.edad.minutes : 0}min
                              
                               - <small class="text-warning">${data.estatus || 'Estatus'}</small>
                            </div>
                            <small class="text-muted">${data.cliente || 'Cliente'}</small> <br>
                            <small class="text-muted">${data.direccion || 'Direccion'}</small><br>
                            <div class="text-value"># ${data.orden}</div>
                            <div class="progress progress-xs my-2">
                                <div class="progress-bar bg-primary" role="progressbar" style="width: 100%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
                            </div>
                            <ul class="list-group list-group-flush scroll-div" style="height: 49vh">
                                ${getProductoHTLM(data.productos, data.componentes)}
                            </ul>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="callout callout-danger">
                                        <small class="text-muted">Total</small>
                                        <br>
                                        <strong class="h4 text-danger">${data.f_total}</strong>
                                    </div>
                                </div>
                                <div class="col-sm-12">
                                    <button class="btn btn-outline-success btn-lg btn-block btn-facturar"> ${ data.fidestatus >= 5 ? 'Reimprimir' : 'Facturar'}</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>`

        $("#detalle-pedido").html(componente)
    }

    function getProductoHTLM(productos, componentes) {
        let lista = ""

        for (let index in productos) {
            lista += ` 
            <li class="list-group-item " >
                
                <div class="d-flex justify-content-between align-items-center w-100">
                ${productos[index].f_descripcion}
                <span class="badge badge-primary badge-pill">${productos[index].f_cantidad}</span> </div>`

            //if (hasComponentes(productos[index].detalle_id, componentes)) {
            lista += `
                    <ul class="list-group list-group-flush "> 
                            ${getComponenteHTLM(productos[index].componentes)}
                    </ul> `
            //}
            lista += `</li>`
        }
        return lista
    }

    function hasComponentes(idDetalle, componentes) {

        for (let index in componentes) {
            return parseInt(componentes[index].detalle_id) === parseInt(idDetalle)
        }
    }

    function getComponenteHTLM(componentes) {
        let lista = ""

        for (let index in componentes) {
            lista += ` 
            <li class="list-group-item d-flex justify-content-between align-items-center" style="font-size: 0.675rem;">${componentes[index].f_descripcion}
                <span class="badge badge-primary badge-pill">${componentes[index].f_cantidad || ''}</span>
            </li>
             `
        }
        return lista
    }

    function initTabla(url) {

        $.ajax({
            url: url,
            type: 'POST',
            dataType: 'JSON',
            beforeSend: () => {
                $("#tabla").jqxGrid('showloadelement')
            },
            success: function (response) {

                if (typeof response.errors !== "undefined" && response.errors.length > 0) {
                    showErrorMessage(response.errors)
                    return
                }
                if (typeof response.data !== "undefined") {
                    config_tabla(response.data.rows, response.data.estatus)

                    mostrar_notificacion("Pedidos", "Tienes " + response.data.rows.length + " pedidos recibidos. ")

                    $("#count_pedidos").html(response.data.count_pedidos)
                    $("#monto_total").html(response.data.monto_total)
                    $("#monto_total_cerrado").html(response.data.monto_total_cerrado)
                }
                else {
                    toastr.error("Ocurrio un error con la comunicacion")
                    return
                }
            },
            error: function (error) {
                console.log(error.responseText)
            },
            complete: () => {
                $("#tabla").jqxGrid('hideloadelement')
            }
        })
    }

    function initTablaOrdenesCerradas(url) {

        $.ajax({
            url: url,
            type: 'POST',
            dataType: 'JSON',
            beforeSend: () => {
                $("#tabla").jqxGrid('showloadelement')
            },
            success: function (response) {

                if (typeof response.errors !== "undefined" && response.errors.length > 0) {
                    showErrorMessage(response.errors)
                    return
                }
                if (typeof response.data !== "undefined") {


                    config_tabla_ordenes_cerradas(response.data.rows, response.data.estatus)


                    $("#count_pedidos").html(response.data.count_pedidos)
                    $("#monto_total").html(response.data.monto_total)
                    $("#monto_total_cerrado").html(response.data.monto_total_cerrado)
                }
                else {
                    toastr.error("Ocurrio un error con la comunicacion")
                    return
                }
            },
            error: function (error) {
                console.log(error.responseText)
            },
            complete: () => {
                $("#tabla").jqxGrid('hideloadelement')
            }
        })
    }

    function initTablaMsj() {
        $.ajax({
            url: getUrl('pedidos/get_mensajeros'),
            type: 'POST',
            dataType: 'JSON',
            success: function (response) {
                if (typeof response.errors !== "undefined" && response.errors.length > 0) {
                    showErrorMessage(response.errors)
                    return
                }
                if (typeof response.data !== "undefined") {
                    //console.log(formatearHorario(response.data[0]))
                    config_tabla_msj(response.data)

                    let mensajeros = response.data.map(item => {
                        item.fDescripcion = item.fNombre
                        return item
                    })

                    console.log(mensajeros)

                    llenarCombox($("#list-mensajeros"), mensajeros)
                }
                else {
                    toastr.error("Ocurrio un error con la comunicacion")
                    return
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    }


    function config_tabla(data, estatuses) {

        var estatusesSource =
            {
                datatype: "array",
                datafields: [
                    {name: 'label', type: 'string'},
                    {name: 'value', type: 'string'}
                ],
                localdata: estatuses
            };
        var estatusesAdapter = new $.jqx.dataAdapter(estatusesSource, {
            autoBind: true
        });


        //data = (data.length === 0) ? data: semana

        var source =
            {
                localdata: data,
                datafields:
                    [
                        {name: 'id', type: 'string'},
                        {name: 'ffecha', type: 'string'},
                        {name: 'fmensajero', type: 'string'},
                        {name: 'fdireccion', type: 'string'},
                        {name: 'fnombre', type: 'string'},
                        {name: 'forden', type: 'string'},
                        {name: 'f_total', type: 'string'},
                        {
                            name: 'estatus',
                            value: 'fidestatus',
                            values: {source: estatusesAdapter.records, value: 'value', name: 'label'}
                        },
                        {name: 'fidestatus', type: 'string'}
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#tabla").jqxGrid(
            {
                width: "100%",
                height: 550,
                theme: "metro",
                source: dataAdapter,
                sortable: true,
                filterable: true,
                autorowheight: true,
                autoheight: false,
                editable: true,
                showtoolbar: false,
                pageable: true,
                rowsheight: 40,
                columns: [
                    {
                        text: '<b>id</b>',
                        width: '20%',
                        datafield: 'id',
                        editable: false,
                        hidden: true,
                    },
                    {
                        text: '<b>Pedido</b>',
                        width: '10%',
                        datafield: 'forden',
                        editable: false,
                        cellclassname: 'red'
                    },
                    {
                        text: '<b>Fecha</b>',
                        width: '10%',
                        datafield: 'ffecha',
                        cellsformat: 'dd/MM/yyyy',
                        editable: false
                    },
                    {
                        text: '<b>Cliente</b>',
                        width: '20%',
                        datafield: 'fnombre',
                        editable: false
                    },
                    {
                        text: '<b>Mensajero</b>',
                        width: '12%',
                        datafield: 'fmensajero',
                        editable: false
                    },
                    {
                        text: '<b>Direccion</b>',
                        width: '20%',
                        datafield: 'fdireccion',
                        editable: false
                    },
                    {
                        text: '<b>Asignar Msj</b>',
                        width: '8%',
                        datafield: null,
                        hidden: false,
                        editable: true,
                        align: 'center',
                        cellalign: 'center',
                        columntype: 'button',
                        cellclassname: function (row, column, value, data) {
                            return "resaltar-texto-tabla-pedidos"
                        },
                        cellsrenderer: function () {
                            return "Asignar";
                        }, buttonclick: function (row) {
                            editrow = row;
                            var dataRecord = $("#tabla").jqxGrid('getrowdata', editrow);
                            idfactura = dataRecord.id
                            initTablaMsj()
                            $("#asignar-modal").modal('show')
                        }
                    },
                    {
                        text: '<b>Estado</b>',
                        width: '10%',
                        datafield: 'fidestatus',
                        displayfield: 'estatus',
                        editable: true,
                        columntype: 'dropdownlist',
                        createeditor: function (row, value, editor) {
                            editor.jqxDropDownList({
                                template: "success",
                                source: estatusesAdapter,
                                displayMember: 'label',
                                valueMember: 'value'
                            });
                        },
                        cellclassname: function (row, column, value, data) {
                            return "resaltar-texto-tabla-pedidos"
                        },
                    },
                    {
                        text: '<b>Total</b>',
                        width: '10%',
                        datafield: 'f_total',
                        editable: true,
                        cellsalign: 'right',
                        align: 'right',
                    },
                ],
            })
    }

    function config_tabla_ordenes_cerradas(data, estatuses) {

        // var estatusesSource =
        //     {
        //         datatype: "array",
        //         datafields: [
        //             { name: 'label', type: 'string' },
        //             { name: 'value', type: 'string' }
        //         ],
        //         localdata: estatuses
        //     };
        // var estatusesAdapter = new $.jqx.dataAdapter(estatusesSource, {
        //     autoBind: true
        // });


        //data = (data.length === 0) ? data: semana

        var source =
            {
                localdata: data,
                datafields:
                    [
                        {name: 'id', type: 'string'},
                        {name: 'ffecha', type: 'string'},
                        {name: 'fmensajero', type: 'string'},
                        {name: 'fdireccion', type: 'string'},
                        {name: 'fnombre', type: 'string'},
                        {name: 'forden', type: 'string'},
                        // { name: 'estatus', value: 'fidestatus', values: { source: estatusesAdapter.records, value: 'value', name: 'label' } },
                        {name: 'fidestatus', type: 'string'},
                        {name: 'estatus', type: 'string'}
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#tabla").jqxGrid(
            {
                width: "100%",
                height: 550,
                theme: "metro",
                source: dataAdapter,
                sortable: true,
                filterable: true,
                autorowheight: true,
                autoheight: false,
                editable: true,
                showtoolbar: false,
                pageable: true,
                rowsheight: 40,
                columns: [
                    {
                        text: '<b>id</b>',
                        width: '20%',
                        datafield: 'id',
                        editable: false,
                        hidden: true,
                    },
                    {
                        text: '<b>Pedido</b>',
                        width: '10%',
                        datafield: 'forden',
                        editable: false,
                        cellclassname: 'red'
                    },
                    {
                        text: '<b>Fecha</b>',
                        width: '10%',
                        datafield: 'ffecha',
                        cellsformat: 'dd/MM/yyyy',
                        editable: false
                    },
                    {
                        text: '<b>Cliente</b>',
                        width: '20%',
                        datafield: 'fnombre',
                        editable: false
                    },
                    {
                        text: '<b>Mensajero</b>',
                        width: '12%',
                        datafield: 'fmensajero',
                        editable: false
                    },
                    {
                        text: '<b>Direccion</b>',
                        width: '38%',
                        datafield: 'fdireccion',
                        editable: false
                    },
                    // {
                    //     text: '<b>Asignar Msj</b>',
                    //     width: '13%',
                    //     datafield: null,
                    //     hidden: false,
                    //     editable: true,
                    //     align:'center',
                    //     cellalign:'center',
                    //     columntype: 'button',
                    //     cellclassname: function (row, column, value, data) {
                    //         return "resaltar-texto-tabla-pedidos"
                    //     },
                    //     cellsrenderer: function () {
                    //         return "Asignar";
                    //     }, buttonclick: function (row) {
                    //         editrow = row;
                    //         var dataRecord = $("#tabla").jqxGrid('getrowdata', editrow);
                    //         idfactura = dataRecord.id
                    //         initTablaMsj()
                    //         $("#asignar-modal").modal('show')
                    //     }
                    // },
                    {
                        text: '<b>Estado</b>',
                        width: '10%',
                        datafield: 'estatus',
                        displayfield: 'estatus',
                        editable: false,
                        // createeditor: function (row, value, editor) {
                        //     editor.jqxDropDownList({ template: "success",source: estatusesAdapter, displayMember: 'label', valueMember: 'value' });
                        // },
                        cellclassname: function (row, column, value, data) {
                            return "resaltar-texto-tabla-pedidos"
                        },
                    },
                ],
            })
    }

    function config_tabla_msj(data) {

        //data = (data.length === 0) ? data: semana

        var source =
            {
                localdata: data,
                datafields:
                    [
                        {name: 'id', type: 'string'},
                        {name: 'fNombre', type: 'string'},
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#tabla_mensajeros").jqxGrid(
            {
                width: "100%",
                height: 200,
                theme: "metro",
                source: dataAdapter,
                sortable: true,
                filterable: true,
                autoheight: false,
                editable: true,
                showtoolbar: false,
                rowsheight: 35,
                columns: [
                    {
                        text: '<b>id</b>',
                        width: '20%',
                        datafield: 'id',
                        editable: false,
                        hidden: true
                    },
                    {
                        text: '<b>Nombre</b>',
                        width: '99%',
                        datafield: 'fNombre',
                        editable: false
                    },

                ],
            })
    }

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
                    toastr.warning("Printer no esta conectado")

                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    })

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
