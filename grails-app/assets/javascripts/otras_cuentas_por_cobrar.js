$(document).ready(function(){
    idproceso = 5;

    $("#btn-toolbar-generar-cuenta").click( e => {
        //let row = $("#tabla").jqxGrid("getrowdata", selectedIndex)
        let params ={}
        let monto = $("#monto_pagar").val()

        monto = parseFloat(monto)
        params.concepto = $("#concepto").val()
        params.monto = monto
        params.cliente_id = $("#id").val()

        if (!validar(params)) {
            return;
        }

        $.ajax({
            url: getUrl('otras_cuentas_por_cobrar/generar_cuenta'),
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
    })


    $("#btnNuevo").click(function(e) {
        e.preventDefault()

        let inputs =  $("#frmCliente").find('input, textarea')
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
        cliente.id = $('#cliente_grid').jqxGrid('getrowdata', event.args.rowindex).id;

        $.ajax({
            url: getUrl('cliente/get_cliente'),
            type: 'POST',
            dataType: 'JSON',
            data: cliente,
            success: function(response)
            {

                if (typeof response.cliente !== "undefined") {

                    $("#nombre").val(response.cliente.fNombre + " " + response.cliente.fApellido)
                    $("#id").val(response.cliente.id)
                }

                $("#cliente_modal").modal("hide")
            },
            error: function(error) {
                console.log(error)
            }
        })

    });

    function validar(inputs) {

        var reg = /^\d*$/

        if (inputs.cliente_id.trim().length == 0)
        {
            isInValidStyle($("#nombre"), "Seleccione un cliente")
            return false
        } else {
            isValidStyle($("#nombre"))
        }

        if (inputs.monto.length == 0 || isNaN(inputs.monto)  || inputs.monto == 0 || inputs.monto == "0" )
        {
            // toastr.warning("Limite de credito solo acepta numeros")
            isInValidStyle($("#monto_pagar"), "Este campo no puede estar vacio y solo puede conformarse por numeros")
            return false
        } else {
            isValidStyle($("#monto_pagar"))
        }

        if (inputs.concepto.trim().length == 0)
        {
            //toastr.warning("Cedula solo puede conformarse por numeros")
            isInValidStyle($("#concepto"), "Este campo es obligatorio")
            return false
        } else {
            isValidStyle($("#concepto"))
        }

        return true
    }

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
})