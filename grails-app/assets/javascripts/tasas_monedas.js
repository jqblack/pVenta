$(document).ready(function(){

    (function() {
        $.ajax({
            url: window.location + '/get_monedas',
            type: 'POST',
            dataType: 'JSON',
            success: function(response) {

                if (typeof response.monedas !== "undefined" && response.monedas.length > 0)
                {
                    llenarCombox($("#cbmoneda"), response.monedas)
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    })()

    init_tabla()

    function llenarCombox(combo,data)
    {
        $(combo).append('<option value="0">--Seleccionar una opcion--</option>')
        for(let item in data)
        {
            let titulo = data[item].fDescripcion + " - " + data[item].fSigla
            $(combo).append('<option value="'+data[item].id+'">'+ titulo +'</option>')
        }
    }


    function init_tabla() {
        $.ajax({
            url: window.location + '/lista',
            type: 'POST',
            dataType: 'JSON',
            success: function(response) {
                if (typeof response.tasas !== "undefined" && response.tasas.length > 0)
                {
                    config_tabla(response.tasas)
                }
                else{
                    toastr.error("Fallo al cargar la tabla")
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    }

    function config_tabla(data)
    {

        var source =
            {
                localdata: data,
                datafields:
                    [
                        { name: 'id', type: 'string' },
                        { name: 'moneda', type: 'string' },
                        { name: 'idmoneda', type: 'string' },
                        { name: 'tasa', type: 'string' },
                        { name: 'fecha', type: 'date' },
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
                autoheight: true,
                editable: false,
                showtoolbar: false,
                columns: [
                    {
                        text: '<b>Moneda</b>',
                        width: '50%',
                        datafield: 'moneda',
                        hidden: false,
                        editable:false,
                    },
                    { text: '<b>Tasa</b>', width: '25%', datafield: 'tasa',},
                    { text: '<b>Fecha</b>', width: '25%', datafield: 'fecha',  cellsformat: 'dd/MM/yyyy'},
                    { text: '<b>ID</b>', width: '20%', datafield: 'id', hidden: true},
                    { text: '<b>ID</b>', width: '20%', datafield: 'idmoneda', hidden: true},

                ],
            });
    }

    $("#guardar").click(function(e) {
        e.preventDefault()

        let inputs = {}

        inputs.tasa = parseFloat($("#tasa").val()) || 0
        inputs.idmoneda = $("#cbmoneda").val()
        inputs.fecha = formatDate($("#datepickerFecha").val())
        inputs.id = $("#id").val() ? $("#id").val(): 0


        if (inputs.tasa < 0)
        {
            toastr.error("El campo tasa es obligatorio.")
            return
        }

        $.ajax({
            url: window.location + '/store',
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

    $("#btnNuevo").click(function (e) {
        e.preventDefault()
        $("#tasa").val("0.00")
        $("#cbmoneda").val("0")
        $("#id").val("0")
        init_tabla()

    })

    $('#tabla').on('rowclick', function (event){

        $('#id').val($('#tabla').jqxGrid('getrowdata', event.args.rowindex).id);
        $('#tasa').val($('#tabla').jqxGrid('getrowdata', event.args.rowindex).tasa);
        $('#datepickerFecha').val($('#tabla').jqxGrid('getrowdata', event.args.rowindex).fecha);
        $('#cbmoneda').val($('#tabla').jqxGrid('getrowdata', event.args.rowindex).idmoneda);
    })
    $("#datepickerFecha").jqxDateTimeInput({
        width: '100%',
        theme: 'metro',
        todayString: 'Today'
    });

})