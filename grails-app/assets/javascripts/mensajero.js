$(document).ready(function(){

    // (function() {
    //     $.ajax({
    //         url: getUrl('mensajero/lista'),
    //         type: 'POST',
    //         dataType: 'JSON',
    //         success: function(response) {
    //
    //             if (typeof response.areas !== "undefined" && response.areas.length > 0)
    //             {
    //                 let data = response.areas
    //                 $("#cbarea").append('<option value="0">--Seleccionar una opcion--</option>')
    //
    //                 for(let item in data)
    //                 {
    //                     $("#cbarea").append('<option value="'+data[item].id+'">'+data[item].fNombreArea+'</option>')
    //                 }
    //             }
    //         },
    //         error: function (error) {
    //             console.log(error.responseText)
    //         }
    //     })
    // })()
    init_tabla("")

    $("#frmBuscarCamareros").submit(function(e){
        e.preventDefault()

        if (this.filtro.value.length === 0 ) {
            return
        }
        init_tabla(this.filtro.value)

    })

    $("#guardar").click(function(e){
        e.preventDefault()

        let params = formToJson($("#frm"))

        $.ajax({
            url: getUrl('mensajero/store'),
            type: 'POST',
            dataType: 'JSON',
            data: {data: JSON.stringify(params)},
            success: function(response) {

                if (typeof response.errors !== "undefined" && response.errors.length > 0)
                {
                    showErrorMessage(response.errors)
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

        let inputs =  $("#frm").find('input')
        let selects =  $("#frm").find('select')
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
        init_tabla("")
        $("input[type='checkbox']").prop("checked", false)
        $("#id").val("0")


    })

    $("#frmBuscarCamareros").submit(function(e){
        e.preventDefault()

        // if (this.filtro.value.length === 0 ) {
        //     return
        // }
        init_tabla(this.filtro.value)

    })

    $('#camarero_grid').on('rowclick', function (event)
    {

        let cliente = {}
        cliente.idmensajero = $('#camarero_grid').jqxGrid('getrowdata', event.args.rowindex).f_idrecord;

        $.ajax({
            url: getUrl('mensajero/getMensajero'),
            type: 'POST',
            dataType: 'JSON',
            data: cliente,
            success: function(response)
            {
                // console.log(response.data)
                // $("#btnNuevo").trigger('click')

                if (typeof response.data !== "undefined") {

                    $("#f_nombre").val(response.data.f_nombre)
                    $("#f_email").val(response.data.f_email)
                    $("#f_telefono").val(response.data.f_telefono)
                    $("#f_zona").val(response.data.f_idzona)
                    $("#f_device").val(response.data.f_deviceid)

                    $("#id").val(response.data.f_idrecord)


                }

            },
            error: function(error) {
                console.log(error)
            }
        })
    });

    function init_tabla(filtro) {
        $.ajax({
            url: getUrl('mensajero/lista'),
            type: 'POST',
            dataType: 'json',
            data: {filtro: filtro},
            beforeSend: function() {
                $("#camarero_grid").jqxGrid('clear');
            },
            success: function(response) {
                if(typeof response.data !== "undefined" && response.data.length > 0){
                    config_tabla(response.data)
                }
            },
            error: function(error){
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
                        { name: 'f_idrecord', type: 'number' },
                        { name: 'f_nombre', type: 'string' },
                        { name: 'f_email', type: 'string' },
                        { name: 'f_telefono', type: 'string' },
                        { name: 'f_zona', type: 'string' },
                        { name: 'f_idzona', type: 'string' },
                        { name: 'f_deviceid', type: 'string' },

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
                    { text: '<b>ID</b>', width: '7%', datafield: 'f_idrecord', hidden: true},
                    { text: '<b>Nombre</b>', width: '20%', datafield: 'f_nombre'},
                    { text: '<b>E-mail</b>', width: '40%', datafield: 'f_email'},
                    { text: '<b>Telefono</b>', width: '20%', datafield: 'f_telefono'},
                    { text: '<b>Zona</b>', width: '10%', datafield: 'f_zona'},
                    { text: '<b>Device</b>', width: '10%', datafield: 'f_deviceid'},
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