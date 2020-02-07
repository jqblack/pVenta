$(document).ready(function(){



    (function() {
        $.ajax({
            url: window.location + '/data_combos',
            type: 'POST',
            dataType: 'JSON',
            success: function(response) {

                if (typeof response.areas !== "undefined" && response.areas.length > 0)
                {
                    llenarCombox($("#cbarea"), response.areas)
                }
                
                if (typeof response.secciones !== "undefined" && response.secciones.length > 0)
                {
                    llenarCombox($("#cbseccion"), response.secciones)
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    })()

    init_tabla_mesas()

    function llenarCombox(combo,data)
    {
        $(combo).append('<option value="0">--Seleccionar una opcion--</option>')
        for(let item in data)
        {
            let titulo = data[item].fNombreArea || data[item].fDescripcion
            $(combo).append('<option value="'+data[item].id+'">'+ titulo +'</option>')
        }
    }

    function init_tabla_mesas() {
        $.ajax({
            url: window.location + '/lista',
            type: 'POST',
            dataType: 'JSON',
            success: function(response) {

                if (typeof response.mesas !== "undefined" && response.mesas.length > 0)
                {
                    config_tabla_mesas(response.mesas)
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

    function config_tabla_mesas(data)
    {

        var source =
            {
                localdata: data,
                datafields:
                    [
                        { name: 'id', type: 'string' },
                        { name: 'mesa', type: 'string' },
                        { name: 'cubiertos', type: 'string' },
                        { name: 'idseccion', type: 'string' },
                        { name: 'idarea', type: 'string' },
                        { name: 'seccion', type: 'string' },
                        { name: 'area', type: 'string' },
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#mesa_lista").jqxGrid(
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
                        text: '<b>Mesa</b>',
                        width: '20%',
                        datafield: 'mesa',
                        hidden: false,
                        editable:false,
                    },
                    { text: '<b>Cubiertos</b>', width: '20%', datafield: 'cubiertos',},
                    { text: '<b>Area</b>', width: '30%', datafield: 'area',},
                    { text: '<b>Seccion</b>', width: '30%', datafield: 'seccion',},
                    { text: '<b>ID</b>', width: '20%', datafield: 'id', hidden: true},

                ],
            });
    }

    $("#guardar").click(function(e) {
        e.preventDefault()
        //alert("Asd")

        let inputs = {}

        inputs.mesa = parseInt($("#descripcion").val())
        inputs.cubiertos = parseInt($("#cubiertos").val())
        inputs.idseccion = $("#cbseccion").val()
        inputs.idarea = $("#cbarea").val()
        inputs.id = $("#id").val() ? $("#id").val(): 0
        console.log(isNaN(inputs.mesa))

        if (isNaN(inputs.mesa) || inputs.mesa  <= 0 )
        {
            toastr.error("El campo numero de mesa es obligatorio.")
            return
        }

        if (isNaN(inputs.cubiertos)  || inputs.cubiertos <= 0)
        {
            toastr.error("El campo numero de cubiertos es obligatorio.")
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
        $("#cubiertos").val("")
        $("#cbarea").val("0")
        $("#cbseccion").val("0")
        $("#id").val("0")
        init_tabla_mesas()

    })

    $('#mesa_lista').on('rowclick', function (event){

        $('#id').val($('#mesa_lista').jqxGrid('getrowdata', event.args.rowindex).id);
        $('#descripcion').val($('#mesa_lista').jqxGrid('getrowdata', event.args.rowindex).mesa);
        $('#cubiertos').val($('#mesa_lista').jqxGrid('getrowdata', event.args.rowindex).cubiertos);
        $('#cbarea').val($('#mesa_lista').jqxGrid('getrowdata', event.args.rowindex).idarea);
        $('#cbseccion').val($('#mesa_lista').jqxGrid('getrowdata', event.args.rowindex).idseccion);

    })


})