$(document).ready(function(){



    (function() {
        $.ajax({
            url: getUrl('tasas_monedas/get_monedas'),
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

    $("#cbmoneda").change((e) => {

        let idmoneda = $(e.target).val()

        init_tabla(idmoneda)
    })

    function llenarCombox(combo,data)
    {
        $(combo).append('<option value="0">--Seleccionar una opcion--</option>')
        for(let item in data)
        {
            let titulo = data[item].fDescripcion + " - " + data[item].fSigla
            $(combo).append('<option value="'+data[item].id+'">'+ titulo +'</option>')
        }
    }


    function init_tabla(idmoneda) {
        let params = {}

        params.idmoneda = idmoneda
        $.ajax({
            url: window.location + '/lista',
            type: 'POST',
            data: {data: JSON.stringify(params)},
            dataType: 'JSON',
            success: function(response) {
                if (typeof response.billetes !== "undefined")
                {
                    config_tabla(response.billetes)
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
                        { name: 'fDescripcion', type: 'string' },
                        { name: 'idmoneda', type: 'string' },
                        { name: 'fValor', type: 'string' },
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
                editable: false,
                showtoolbar: false,
                columns: [
                    {
                        text: '<b>Descripcion</b>',
                        width: '75%',
                        datafield: 'fDescripcion',
                        hidden: false,
                        editable:false,
                    },
                    { text: '<b>Valor</b>', width: '25%', datafield: 'fValor',align:'right',cellsalign:'right'},
                    { text: '<b>Fecha</b>', width: '25%', datafield: 'fecha',  cellsformat: 'dd/MM/yyyy', hidden: true},
                    { text: '<b>ID</b>', width: '20%', datafield: 'id', hidden: true},

                ],
            });
    }

    $("#guardar").click(function(e) {
        e.preventDefault()

        let inputs = {}

        inputs.descripcion = $("#descripcion").val()
        inputs.valor = parseFloat($("#valor").val())
        inputs.idmoneda = $("#cbmoneda").val()
        inputs.id = $("#id").val() || 0


        if (inputs.valor < 0)
        {
            toastr.error("El campo valor es obligatorio.")
            return
        }

        $.ajax({
            url: getUrl('billetes/store'),
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

        $("#descripcion").val("")
        $("#valor").val("")
        $("#cbmoneda").val("0")
        $("#id").val("0")
        init_tabla(0)
    })

    $('#tabla').on('rowclick', function (event){

        $('#id').val($('#tabla').jqxGrid('getrowdata', event.args.rowindex).id);
        $('#descripcion').val($('#tabla').jqxGrid('getrowdata', event.args.rowindex).fDescripcion);
        $('#valor').val($('#tabla').jqxGrid('getrowdata', event.args.rowindex).fValor);
        $('#cbmoneda').val($('#tabla').jqxGrid('getrowdata', event.args.rowindex).idmoneda);
    })
})