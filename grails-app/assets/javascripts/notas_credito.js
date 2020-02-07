$(document).ready(function(){
    idproceso = 5;
    init_tabla([])
    function init_tabla(data)
    {
        var source =
            {
                localdata: data,
                datafields:
                    [
                        { name: 'f_idrecord', type: 'string' },
                        { name: 'f_idcliente', type: 'string' },
                        { name: 'f_documento', type: 'string' },
                        { name: 'f_monto', type: 'number' },
                        { name: 'f_noexterno', type: 'string' },
                        { name: 'f_balance', type: 'number' },
                        { name: 'f_fecha_vencimiento', type: 'string' },
                        { name: 'f_fecha', type: 'string' },
                    ]
            };

        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#tabla").jqxGrid(
            {
                width: "100%",
                height: 200,
                theme: "metro",
                source: dataAdapter,
                editable: false,
                showtoolbar: false,
                columns: [
                    { text: '<b>#</b>', width: '15%', datafield: 'f_documento',},
                    {
                        text: '<b>Fecha</b>',
                        width: '20%',
                        datafield: 'f_fecha',
                        hidden: false,
                        editable: false,
                    },
                    {
                        text: '<b>Fecha Venc.</b>',
                        width: '15%',
                        datafield: 'f_fecha_vencimiento',
                        hidden: false,
                        editable: false,
                    },
                    { text: '<b>Factura</b>', width: '15%', datafield: 'f_noexterno',},
                    { text: '<b>Monto</b>', width: '20%', datafield: 'f_monto', cellsalign:'right', align:'right', hidden: false, cellsformat : 'c2'},
                    { text: '<b>Balance</b>', width: '15%', datafield: 'f_balance',cellsalign:'right', align:'right', hidden: false, cellsformat : 'c2'},

                ],

            });
    }

    function calcularTotal(data) {
        let total = 0

        for (let prop in data) {
            total += data[prop].f_balance
        }
        return total

    }

    $("#btn-toolbar-abonar").click( e=>{
        e.preventDefault()
        let selectedIndex = $("#tabla").jqxGrid("getselectedrowindex")


        if ( selectedIndex > -1) {
            let row = $("#tabla").jqxGrid("getrowdata", selectedIndex)

            $("#abono-factura").val(row.f_noexterno)
            $("#abono-balance").val(row.f_balance)
            $("#f_idrecord").val(row.f_idrecord)
            $("#abono-cuenta-modal").modal("show")


        } else {
            toastr.warning("Seleccione una factura", "Notificacion")
        }
    })

    $("#btn-abono-pagar").click( e => {
        let selectedIndex = $("#tabla").jqxGrid("getselectedrowindex")


        if ( selectedIndex > -1) {
            let row = $("#tabla").jqxGrid("getrowdata", selectedIndex)
            let monto = $("#abono-pago").val()


            if (isNaN(monto) || parseFloat(monto) < 0) {  toastr.warning("Error en el monto"); return; }
            //console.log(monto)
            monto = parseFloat(monto)
            row.concepto = row.f_balance == monto ? "Saldo" : "Abono"
            row.monto = monto
            row.cliente_id = $("#id").val()
            row.rows = []

            $.ajax({
                url: getUrl('notas_credito/nota_credito_factura'),
                type: 'POST',
                dataType: 'JSON',
                data: {data: JSON.stringify(row)},
                success: function (response) {

                    if (typeof response.errors !== "undefined" && response.errors.length > 0) {
                        showErrorMessage(response.errors);
                        return;
                    }

                    if (parseInt(response.response_server_print.f_key) != 1) {
                        swal("Error Code: " + response.response_server_print.f_key, response.response_server_print.f_mensaje, "warning");
                        return;
                    }


                    if (response.success) {
                        $("#btnNuevo").trigger("click");
                        $("#abono-cuenta-modal").modal("hide");
                        $("#abono-balance").val("");
                        toastr.success("Datos guardados Correctamente");

                        if(!response.document_impreso){
                            toastr.warning("Documento No Impreso","Notificacion");
                        }

                    }
                },
                error: function (error) {
                    console.log(error.responseText)
                }
            })
        }
    })

    $("#btn-toolbar-saldar").click( e => {
        //let params = {}


        let rows = $("#tabla").jqxGrid("getrows")
        //console.log(rows)

        // selectedIndex = parseInt(selectedIndex)

        if ( rows.length > 0) {
            //let row = $("#tabla").jqxGrid("getrowdata", selectedIndex)
            let params ={}
            let monto = $("#monto_pagar").val()
            let pagoTotal = calcularTotal(rows)
            //console.log(pagoTotal)

            if (isNaN(monto) || parseFloat(monto) < 0) {  toastr.warning("Error en el monto"); return; }
            //console.log(monto)
            monto = parseFloat(monto)
            if (monto !== pagoTotal) {  toastr.warning("Pago incompleto"); return; }
            params.concepto = "Saldo"
            params.monto = monto
            params.cliente_id = $("#id").val()
            params.pagoTotal = pagoTotal
            params.rows = rows

            $.ajax({
                url: getUrl('notas_credito/nota_credito_factura'),
                type: 'POST',
                dataType: 'JSON',
                data: {data: JSON.stringify(params)},
                success: function (response) {

                    if (typeof response.errors !== "undefined" && response.errors.length > 0) {
                        showErrorMessage(response.errors)
                    }

                    if (response.success) {
                        $("#btnNuevo").trigger("click")
                        $("#abono-cuenta-modal").modal("hide")
                        $("#abono-balance").val("")
                        toastr.success("Datos guardados Correctamente")
                    }
                },
                error: function (error) {
                    console.log(error.responseText)
                }
            })
        }
    })


    $("#btnNuevo").click(function(e) {
        e.preventDefault()

        let inputs =  $("#frmCliente").find('input')
        let selects =  $("#frmCliente").find('select')


        $.each(inputs,function(index, input) {
            if ($(input).attr("type") === "number")
            {
                $(input).val("0.00")
            }
            else{
                $(input).val("")
            }
        })


        $.each(selects,function(index, select) {
            $(select).val("0")
        })

        $("#id").val("0")
        init_tabla([])

    })

    $("#frmBuscarCliente").submit(function(e){
        e.preventDefault()

        if (this.filtro.value.length === 0 ) {
            return
        }

        $.ajax({
            url: getUrl('cliente/lista'),
            type: 'POST',
            dataType: 'json',
            data: {filtro: this.filtro.value},
            beforeSend: function() {
                $("#cliente_grid").jqxGrid('clear');
            },
            success: function(response) {
                if(response.clientes.length > 0){
                    init_tabla_cliente_filtrados(response.clientes)
                }
            },
            error: function(error){
                console.log(error.responseText)
            }
        })
    })

    $('#cliente_grid').on('rowclick', function (event)
    {

        let cliente = {}
        cliente.cliente_id = $('#cliente_grid').jqxGrid('getrowdata', event.args.rowindex).id;

        $.ajax({
            url: getUrl('cuentas_por_cobrar/get_cuentas_por_cobrar'),
            type: 'POST',
            dataType: 'JSON',
            data: cliente,
            success: function(response)
            {

                if (typeof response.data !== "undefined" && response.data.length > 0) {

                    $("#nombre").val(response.data[0].f_nombre_cliente)



                    $("#direccion").val(response.data[0].f_direccion)
                    $("#id").val(response.data[0].f_idrecord)

                    $("#monto").val(formatter.format(calcularTotal(response.data), 0, 2))

                    init_tabla(response.data)

                    $("#balance").attr("disabled", true)

                } else {
                    toastr.warning("Este cliente no tiene cuentas pendientes","Notificacion")
                    $("#btnNuevo").trigger("click")
                }

                $("#cliente_modal").modal("hide")
            },
            error: function(error) {
                console.log(error)
            }
        })

    });

    function init_tabla_cliente_filtrados(data)
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
        $("#cliente_grid").jqxGrid(
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
});

function is_enter(event) {

    if (event.keyCode === 13) {
        $("#btnBuscar").click();
        $("#filtro").val($("#nombre").val());
        $("#filtro").submit();

    }

}



function validar_numero(event,id){

    console.log(event.data);

    try{

        if(isNaN(event.data)){

            toastr.warning("Campo Solo Numerico","Notificacion");

            var value = $("#"+id).val();


            var newValue = value.substring(0,value.length - 1);

            // console.log(newValue);

            $("#"+id).val( newValue);

            return;
        }else{
            // para poner comas para seperar lo introducido
            // var num =$("#"+id).val().replace(/\./g,'');
            //
            // num = num.toString().split('').reverse().join('').replace(/(?=\d*\.?)(\d{3})/g,'$1.');
            // num = num.split('').reverse().join('').replace(/^[\.]/,'');
            //
            // // console.log(num);
            //
            // $("#"+id).val( num);

        }


    }catch (e) {
        console.log("Error Validando Si Es Numero En Input: "+event.target+"\n"+e.message);

    }

    var abono_balance =  $("#abono-balance").val();
    var abono_a_pagar =  $("#"+id).val();

    abono_a_pagar = parseFloat(abono_a_pagar);
    abono_balance = parseFloat(abono_balance);

    if(abono_balance < abono_a_pagar )
    {
        toastr.warning("El Monto Excede Al Balance","Notificacion");

        // console.log((abono_balance+1) +" < "+abono_a_pagar);

        var value = $("#"+id).val();
        var newValue = value.substring(0,value.length - 1);

        // console.log(newValue);

        $("#"+id).val( newValue);
    }

}