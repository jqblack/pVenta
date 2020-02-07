$(document).ready(function(){

    init_tabla_unidad()

    function init_tabla_unidad() {
        $.ajax({
            url: window.location + '/get_unidades',
            type: 'POST',
            dataType: 'JSON',
            success: function(response) {

                if (typeof response.unidades !== "undefined" && response.unidades.length > 0)
                {
                    config_tabla_unidad(response.unidades)
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

    function config_tabla_unidad(data)
    {

        var source =
            {
                localdata: data,
                datafields:
                    [
                        { name: 'id', type: 'string' },
                        { name: 'fDescripcion', type: 'string' },
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#unidad_lista").jqxGrid(
            {
                width: "100%",
                height: 200,
                theme: "metro",
                source: dataAdapter,
                editable: false,
                showtoolbar: false,
                columns: [
                    {
                        text: '<b>Unidad</b>',
                        width: '100%',
                        datafield: 'fDescripcion',
                        columngroup: 'categorias',
                        hidden: false,
                        editable:false,
                    },
                    { text: '<b>ID</b>', width: '20%', datafield: 'id', hidden: true},

                ],
            });
    }

    $("#guardar").click(function(e) {
        e.preventDefault()
        //alert("Asd")

        let inputs = {}

        inputs.descripcion = $("#descripcion").val()
        inputs.id = $("#id").val() ? $("#id").val(): 0

        if (inputs.descripcion.trim().length < 1)
        {
            toastr.error("El campo descripcion es obligatorio.")
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
        $("#id").val("")
        init_tabla_unidad()

    })

    $('#unidad_lista').on('rowclick', function (event){

        $('#id').val($('#unidad_lista').jqxGrid('getrowdata', event.args.rowindex).id);
        $('#descripcion').val($('#unidad_lista').jqxGrid('getrowdata', event.args.rowindex).fDescripcion);

    })
})