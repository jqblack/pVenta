$(document).ready(function(){

    (function() {
        $.ajax({
            url: window.location + '/data_combos',
            type: 'POST',
            dataType: 'JSON',
            success: function(response) {

                if (typeof response.areas !== "undefined" && response.areas.length > 0)
                {
                    let data = response.areas
                    $("#cbarea").append('<option value="0">--Seleccionar una opcion--</option>')

                    for(let item in data)
                    {
                        $("#cbarea").append('<option value="'+data[item].id+'">'+data[item].fNombreArea+'</option>')
                    }
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    })()
    init_tabla_camareros("%")

    // function llenarCombox(combo,data)
    // {
    //     $(combo).append('<option value="0">--Seleccionar una opcion--</option>')
    //     for(let item in data)
    //     {
    //         let text = data[item].fNombre || data[item].fDescripcion
    //         $(combo).append('<option value="'+data[item].id+'">'+text+'</option>')
    //     }
    // }




    $("#guardar").click(function(e){
        e.preventDefault()

        let inputs = $("#frmCamarero").find('input, select')

        inputs = $(inputs).serializeArray()
        inputs = jsonArrayToJsonKey(inputs)

        inputs.id = parseInt($("#id").val())
        inputs.activo = $("#activo").prop("checked")
        inputs.direccion = $("#direccion").val()
        inputs.camareroactivo = $("#camareroactivo").prop("checked")

        console.log(inputs)

        var reg = /^\d*$/

        if (isNaN(inputs.cedula))
        {
            toastr.warning("Cedula solo puede conformarse por numeros")
            return
        }

        $.ajax({
            url: window.location + '/store',
            type: 'POST',
            dataType: 'JSON',
            data: {data: JSON.stringify(inputs)},
            success: function(response) {

                if (typeof response.errorsCamarero !== "undefined" && response.errorsCamarero.length > 0)
                {
                    showErrorMessage(response.errorsCamarero)
                }

                if  (response.success)
                {
                    $("#btnNuevo").trigger("click")
                    toastr.success("Datos guardados Correctamente")
                }
            },
            error: function(error) {
                console.log(error.responseText)
            }
        })
    })

    $("#btnNuevo").click(function(e) {
        e.preventDefault()

        let inputs =  $("#frmCamarero").find('input')
        let selects =  $("#frmCamarero").find('select')
        $("#direccion").val("")


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

        $("#camarero_grid").jqxGrid('clear');
        init_tabla_camareros("%")
        $("input[type='checkbox']").prop("checked", false)
        $("#id").val("0")


    })

    $("#frmBuscarCamareros").submit(function(e){
        e.preventDefault()

        if (this.filtro.value.length === 0 ) {
            return
        }
        init_tabla_camareros(this.filtro.value)

    })

    $('#camarero_grid').on('rowclick', function (event)
    {

        let cliente = {}
        cliente.id = $('#camarero_grid').jqxGrid('getrowdata', event.args.rowindex).id;

        $.ajax({
            url: window.location + '/get_camarero',
            type: 'POST',
            dataType: 'JSON',
            data: cliente,
            success: function(response)
            {
                console.log(response)
                $("#btnNuevo").trigger('click')

                if (typeof response.camarero !== "undefined") {

                    $("#nombre").val(response.camarero.fNombre)
                    $("#apellido").val(response.camarero.fApellido)
                    $("#sueldo").val(response.camarero.fSueldo.toFixed(2))
                    $("#cbarea").val(response.camarero.fIdArea)
                    $("#cedula").val(response.camarero.fCedula)
                    $("#direccion").val(response.camarero.fDireccion)
                    $("#id").val(response.camarero.id)


                    $("#activo").prop("checked",response.camarero.fActivo)
                    $("#camareroactivo").prop("checked",response.camarero.fCamareroActivo)
                }

            },
            error: function(error) {
                console.log(error)
            }
        })

    });

    function init_tabla_camareros(filtro) {
        $.ajax({
            url: window.location + '/lista',
            type: 'POST',
            dataType: 'json',
            data: {filtro: filtro},
            beforeSend: function() {
                $("#camarero_grid").jqxGrid('clear');
            },
            success: function(response) {
                if(typeof response.camareros !== "undefined" && response.camareros.length > 0){
                    config_tabla_camareros(response.camareros)
                }
            },
            error: function(error){
                console.log(error.responseText)
            }
        })
    }

    function config_tabla_camareros(data)
    {
        var source =
            {
                localdata: data,
                datafields:
                    [
                        { name: 'id', type: 'number' },
                        { name: 'fNombre', type: 'string' },
                        { name: 'fApellido', type: 'string' },

                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#camarero_grid").jqxGrid(
            {
                width: "100%",
                pageable: true,
                height: 290,
                theme: "metro",
                source: dataAdapter,
                editable: false,
                columns: [
                    { text: '<b>ID</b>', width: '7%', datafield: 'id', hidden: true},
                    { text: '<b>Nombre</b>', width: '50%', datafield: 'fNombre'},
                    { text: '<b>Apellido</b>', width: '50%', datafield: 'fApellido'},
                ]
            });
    }

    function jsonArrayToJsonKey(jsonArray)
    {
        // console.log(jsonArray)

        let newJson = {}

        for(let key in jsonArray)
        {
            if  (jsonArray[key] !== undefined)
            {
                newJson[jsonArray[key].name] = jsonArray[key].value
            }
        }

        return newJson
    }
})
