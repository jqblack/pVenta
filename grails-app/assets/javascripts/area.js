$(document).ready(function(){

    init_tabla_areas()

    function init_tabla_areas() {
        $.ajax({
            url: window.location + '/get_areas',
            type: 'POST',
            dataType: 'JSON',
            success: function(response) {

                if (typeof response.areas !== "undefined" && response.areas.length > 0)
                {
                    config_tabla_areas(response.areas)
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

    function config_tabla_areas(data)
    {

        var source =
            {
                localdata: data,
                datafields:
                    [
                        { name: 'id', type: 'string' },
                        { name: 'fNombreArea', type: 'string' },
                        { name: 'fTiempoCamarero', type: 'string' },
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#area_lista").jqxGrid(
            {
                width: "100%",
                height: 200,
                theme: "metro",
                source: dataAdapter,
                editable: false,
                showtoolbar: false,
                columns: [
                    {
                        text: '<b>Area</b>',
                        width: '50%',
                        datafield: 'fNombreArea',
                        hidden: false,
                        editable:false,
                    },
                    {
                        text: '<b>Tiempo Camarero</b>',
                        width: '50%',
                        datafield: 'fTiempoCamarero',
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
        inputs.tiempo_camarero = $("#tiempo_camarero").val() ? $("#tiempo_camarero").val(): 0

        if (inputs.descripcion.trim().length < 1)
        {
            toastr.error("El campo descripcion es obligatorio.")
            return
        }

        if (parseFloat(inputs.tiempo_camarero) <= 0) {
            toastr.error("El campo Tiempo Camarero es obligatorio.")
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
        $("#tiempo_camarero").val("0")
        $("#id").val("")
        init_tabla_areas()

    })

    $('#area_lista').on('rowclick', function (event){

        $('#id').val($('#area_lista').jqxGrid('getrowdata', event.args.rowindex).id);
        $('#descripcion').val($('#area_lista').jqxGrid('getrowdata', event.args.rowindex).fNombreArea);
        $('#tiempo_camarero').val($('#area_lista').jqxGrid('getrowdata', event.args.rowindex).fTiempoCamarero);

    })


})