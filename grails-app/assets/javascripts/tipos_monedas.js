$(document).ready(function(){



    init_tabla()

    function init_tabla() {
        $.ajax({
            url: window.location + '/lista',
            type: 'POST',
            dataType: 'JSON',
            success: function(response) {

                if (typeof response.monedas !== "undefined" && response.monedas.length > 0)
                {
                    config_tabla(response.monedas)
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
                        { name: 'fSigla', type: 'string' },
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
                        datafield: 'fDescripcion',
                        hidden: false,
                        editable:false,
                    },
                    { text: '<b>Siglas</b>', width: '50%', datafield: 'fSigla',},
                    { text: '<b>ID</b>', width: '20%', datafield: 'id', hidden: true},

                ],
            });
    }

    $("#guardar").click(function(e) {
        e.preventDefault()

        let inputs = {}

        inputs.descripcion = $("#descripcion").val()
        inputs.sigla = $("#siglas").val()
        inputs.id = $("#id").val() ? $("#id").val(): 0


        if (inputs.descripcion.trim().length < 1)
        {
            toastr.error("El campo descripcion es obligatorio.")
            return
        }

        if (inputs.sigla.trim().length < 1)
        {
            toastr.error("El campo siglas es obligatorio.")
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
        $("#descripcion").val("")
        $("#siglas").val("")
        $("#id").val("0")
        init_tabla()

    })

    $('#tabla').on('rowclick', function (event){

        $('#id').val($('#tabla').jqxGrid('getrowdata', event.args.rowindex).id);
        $('#descripcion').val($('#tabla').jqxGrid('getrowdata', event.args.rowindex).fDescripcion);
        $('#siglas').val($('#tabla').jqxGrid('getrowdata', event.args.rowindex).fSigla);

    })


})