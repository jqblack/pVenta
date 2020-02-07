$(document).ready(function(){

    idproceso = 3;

    $("#fechaInicial, #fechaFinal").jqxDateTimeInput({
        width: '100%',
        theme: 'metro',
        todayString: 'Today'
    });

    config_tabla([])

    $("#btn-toolbar-reimprimir").click( e => {

        let selectedIndex = 0
        let button = e.target

        selectedIndex = $("#tabla").jqxGrid("getselectedrowindex")

        if (selectedIndex > -1) {
            let params = {}
            params.idcuadre = $("#tabla").jqxGrid("getrowdata", selectedIndex).f_idrecord

            $.ajax({
                url: getUrl('reporte_cuadre/reimprimirCuadre'),
                type: 'POST',
                dataType: 'JSON',
                data: params,
                beforeSend: function() {
                    $(button).attr("disabled", true)
                },
                success: function(response) {
                    if (parseInt(response.response_server_print.f_key) != 1) {
                        swal("Error Code: " + response.response_server_print.f_key, response.response_server_print.f_mensaje, "warning")
                        return;
                    }

                    if (response.success) {
                        toastr.success("Imprimiendo")
                    }

                },
                error: function(error) {
                    console.log(error.responseText)
                },
                complete: function() {
                    $(button).attr("disabled", false)
                }
            })
        }
    })

    $("#btn-toolbar-generar").click(function (e) {

        e.preventDefault()
        let button = e.target

        let inputs = {}
        inputs.fechaInicio = $("#fechaInicial").val('date').getTime()
        inputs.fechaFinal = $("#fechaFinal").val('date').getTime()

        //console.log(inputs); return;


        $.ajax({
            url: getUrl('reporte_cuadre/generar'),
            type: 'POST',
            dataType: 'JSON',
            data: inputs,
            beforeSend: function() {
                $(button).attr("disabled", true)
            },
            success: function(response) {
                config_tabla(response.data)

            },
            error: function(error) {
                console.log(error.responseText)
            },
            complete: function() {

                $(button).attr("disabled", false)
            }
        })

    })



    function config_tabla(data) {

        var source =
            {
                localdata: data,
                datafields:
                    [
                        {name:'f_idrecord', type:'string'},
                        {name:'f_fecha', type: 'string'},
                        {name:'f_fecha_generado', type: 'string'},
                        {name:'f_cajero', type: 'string'},
                        {name:'f_factcontado', type: 'number'},
                        {name:'f_factcredito', type: 'number'},
                        {name:'f_pedidos', type: 'number'},
                        {name:'f_montocredito', type: 'number'},
                        {name:'f_montocontado', type: 'number'},
                        {name:'f_monto_pedidos', type: 'number'},
                        {name:'f_montotarjeta', type: 'number'},
                        {name:'f_montoitbis', type: 'number'},
                        {name:'f_montocheque', type: 'number'},
                        {name:'f_montoenvio', type: 'number'},
                        {name:'f_monto_caja', type: 'number'},
                        {name:'f_monto_recibo', type: 'number'},
                        {name:'f_monto_cancelado', type: 'number'},
                        {name:'f_posteado', type: 'number'},
                        {name:'f_hecho_por', type: 'number'}
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#tabla").jqxGrid(
        {
            width: "100%",
            height: '100%',
            theme: "metro",
            source: dataAdapter,
            sortable: true,
            filterable: true,
            autorowheight: true,
            autoheight: false,
            editable: false,
            showtoolbar: false,
            pageable: true,
            rowsheight: 40,
            columns: [
                {
                    text: '<b>Fecha</b>',
                    width: '10%',
                    datafield: 'f_fecha',
                },
                {
                    text: '<b>Cajero</b>',
                    width: '10%',
                    datafield: 'f_cajero',
                    editable: false,
                    cellclassname: 'red'
                },
                {
                    text: '<b>Fact. Cont.</b>',
                    width: '10%',
                    datafield: 'f_factcontado',
                    cellsformat: 'c2',
                },
                {
                    text: '<b>Fact. Cred.</b>',
                    width: '10%',
                    datafield: 'f_factcredito',
                    cellsformat: 'c2',
                },
                {
                    text: '<b>Pedidos</b>',
                    width: '10%',
                    datafield: 'f_pedidos',
                    cellsformat: 'c2',
                },
                {
                    text: '<b>Total Cred</b>',
                    width: '10%',
                    datafield: 'f_montocredito',
                    cellsformat: 'c2',
                },
                {
                    text: '<b>Total Cont</b>',
                    width: '10%',
                    datafield: 'f_montocontado',
                    cellsformat: 'c2',
                },
                {
                    text: '<b>Total Pedidos</b>',
                    width: '10%',
                    datafield: 'f_monto_pedidos',
                    cellsformat: 'c2',
                },
                {
                    text: '<b>Total Tarjetas</b>',
                    width: '10%',
                    datafield: 'f_montotarjeta',
                    cellsformat: 'c2',
                },
                {
                    text: '<b>Total ITBIS</b>',
                    width: '10%',
                    datafield: 'f_montoitbis',
                    cellsformat: 'c2',
                },
                {
                    text: '<b>Total Cks</b>',
                    width: '10%',
                    datafield: 'f_montocheque',
                    cellsformat: 'c2',
                },
                {
                    text: '<b>Total Envio</b>',
                    width: '10%',
                    datafield: 'f_montoenvio',
                    cellsformat: 'c2',
                },
                {
                    text: '<b>Total Caja</b>',
                    width: '10%',
                    datafield: 'f_monto_caja',
                    cellsformat: 'c2',
                },
                {
                    text: '<b>Total Recibo</b>',
                    width: '10%',
                    datafield: 'f_monto_recibo',
                    cellsformat: 'c2',
                },
                {
                    text: '<b>Total Cancelado</b>',
                    width: '10%',
                    datafield: 'f_monto_cancelado',
                    cellsformat: 'c2',
                },
            ],
        })
    }
})