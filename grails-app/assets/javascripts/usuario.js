$(document).ready(function(){

    // (function() {
    //     $.ajax({
    //         url: window.location + '/get_monedas',
    //         type: 'POST',
    //         dataType: 'JSON',
    //         success: function(response) {
    //
    //             if (typeof response.monedas !== "undefined" && response.monedas.length > 0)
    //             {
    //                 llenarCombox($("#cbmoneda"), response.monedas)
    //             }
    //         },
    //         error: function (error) {
    //             console.log(error.responseText)
    //         }
    //     })
    // })()

    init_tabla()
    init_tabla_usuarios()



    function init_tabla() {
        $.ajax({
            url: window.location + '/lista_permisos',
            type: 'POST',
            dataType: 'JSON',
            success: function(response) {
                if (typeof response.permisos !== "undefined" && response.permisos.length > 0)
                {
                    config_tabla(response.permisos)
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

    function init_tabla_usuarios() {
        $.ajax({
            url: window.location + '/lista',
            type: 'POST',
            dataType: 'JSON',
            success: function(response) {
                if (typeof response.usuarios !== "undefined" && response.usuarios.length > 0)
                {

                    config_tabla_usuarios(response.usuarios)
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
        // $("#tabla").html("");
        // $("#tabla").html("<div id='in_tabla'></div>");
        var source =
            {
                localdata: data,
                datafields:
                    [
                        { name: 'id' },
                        { name: 'fdescripcion', type: 'string' },
                        { name: 'isadd', type: 'boolean' },
                        { name: 'fpadre', type: 'number' },
                    ],
                hierarchy:{
                    keyDataField: {name:'id'},
                    parentDataField: {name: 'fpadre'}
                },
                id: 'id'
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#tabla").jqxTreeGrid(
            {
                source: dataAdapter,
                altRows: true,
                width:  '100%',
                checkboxes: true,
                theme:'metro',
                columns: [
                    {
                        text: '<b>Permiso</b>',
                        width: '100%',
                        datafield: 'fdescripcion',
                        hidden: false,
                        editable:false
                    },
                    { text: '<b>ID</b>', width: '20%', datafield: 'id', hidden: true}

                ],
            });


    }

    function config_tabla_usuarios(data)
    {

        var source =
            {
                localdata: data,
                datafields:
                    [
                        { name: 'id', type: 'string' },
                        { name: 'fusername', type: 'string' },
                        { name: 'fnombre', type: 'string' },
                        { name: 'fapellido', type: 'string' },
                        { name: 'factivo', type: 'boolean' },
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#tabla_usuarios").jqxGrid(
            {
                width: "100%",
                height: 425,
                theme: "metro",
                filterable: true,
                source: dataAdapter,
                showfilterrow: true,
                editable: true,
                showtoolbar: false,
                pageable: true,
                columns: [
                    {
                        text: '<b>Usuario</b>',
                        width: '10%',
                        datafield: 'fusername',
                        hidden: false,
                        editable:false,
                    },
                    {
                        text: '<b>Nombre</b>',
                        width: '40%',
                        datafield: 'fnombre',
                        hidden: false,
                        editable:false,
                    },{
                        text: '<b>Apellido</b>',
                        width: '40%',
                        datafield: 'fapellido',
                        hidden: false,
                        editable:false,
                    },
                    { text: '<b>Activo</b>', width: '10%', datafield: 'factivo', columntype: 'checkbox', filtertype:'bool', editable: false},
                    { text: '<b>ID</b>', width: '20%', datafield: 'id', hidden: true},

                ],
            });
    }

    $("#guardar").click(function(e) {
        e.preventDefault()



        let inputs = $("#frm").find('input, select')
        var new_permisos = []

        inputs = $(inputs).serializeArray()

        inputs = jsonArrayToJsonKey(inputs)


        new_permisos = $("#tabla").jqxTreeGrid('getCheckedRows');

        inputs.fActivo = $("#fActivo").prop("checked")
        //inputs.fCamarero = $("#fCamarero").prop("checked")
        inputs.fCambioPrecio = $("#fCambioPrecio").prop("checked")
        inputs.fAbrirCaja = $("#fAbrirCaja").prop("checked")
        inputs.fAnularLinea = $("#fAnularLinea").prop("checked")
        inputs.fDescuento = $("#fDescuento").prop("checked")
        inputs.fFacturaCredito = $("#fFacturaCredito").prop("checked")
        inputs.fCuadre = $("#fCuadre").prop("checked")
        inputs.fEstadoCaja = $("#fEstadoCaja").prop("checked")
        inputs.fFacturaOficial = $("#fFacturaOficial").prop("checked")
        inputs.fRecibo = $("#fRecibo").prop("checked")
        inputs.fTaxfree = $("#fTaxfree").prop("checked")
        inputs.fAnularFactura = $("#fAnularFactura").prop("checked")
        inputs.fPorcientoLey =  $("#fPorcientoLey").prop("checked")
        inputs.fActivarPedidos =  $("#fActivarPedidos").prop("checked")
        inputs.permisos = []
        for (var i = 0; i < new_permisos.length ; i++) {
            inputs.permisos.push({id:new_permisos[i].id});
        }



        //console.log(inputs); return;

        // if (inputs.descripcion.trim().length < 1)
        // {
        //     toastr.error("El campo descripcion es obligatorio.")
        //     return
        // }
        //console.log(inputs); return;
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

        let inputs =  $("#frm").find('input')
        let selects =  $("#frm").find('select')
        // console.log(typeof(inputs))


        $.each(inputs,function(index, input) {
            if ($(input).attr("type") === "number")
            {
                $(input).val("0")
            }
            else{
                $(input).val("")
            }
        })


        $.each(selects,function(index, select) {
            $(select).val("0")
        })

        $("#frm input[type = 'checkbox']").prop("checked", false)

        $("#id").val("0")

        init_tabla_usuarios()

        let permisos = []

        permisos = $("#tabla").jqxTreeGrid('getCheckedRows');

        permisos.forEach((item) => {
            //console.log(item)
            $("#tabla").jqxTreeGrid('uncheckRow', item.uid);
        });
    })

    $('#tabla').on('rowclick', function (event){

        $('#id').val($('#tabla').jqxGrid('getrowdata', event.args.rowindex).id);
        $('#descripcion').val($('#tabla').jqxGrid('getrowdata', event.args.rowindex).fDescripcion);
    })

    $('#tabla_usuarios').on('rowclick', function (event){

        let id = $('#tabla_usuarios').jqxGrid('getrowdata', event.args.rowindex).id;
        $.ajax({
            url: window.location + '/get_usuario',
            type: 'POST',
            dataType: 'JSON',
            data: {id: id},
            success: function (response) {
                $("#btnNuevo").trigger('click')
                if (typeof response.usuario !== "undefined") {

                    //console.log(response.usuario)
                    $("#id").val(response.usuario.id)
                    $("#nombre").val(response.usuario.fNombre)
                    $("#apellido").val(response.usuario.fApellido)
                    $("#usuario").val(response.usuario.fUsername)
                    $("#email").val(response.usuario.fEmail)
                    $("#telefono").val(response.usuario.fTelefono)
                    $("#idioma").val(response.usuario.fIdidioma)
                    $("#idioma").val(response.usuario.fIdidioma)
                    $("#tipo_usuario").val(response.usuario.fTipoUsuarioPuntoVenta)

                    $("#fActivo").prop("checked", response.usuario.fActivo)
                    $("#fCamarero").prop("checked", response.usuario.fCamarero)
                    $("#fCambioPrecio").prop("checked", response.usuario.fCambioPrecio)
                    $("#fAbrirCaja").prop("checked", response.usuario.fAbrirCaja)
                    $("#fAnularLinea").prop("checked", response.usuario.fAnularLinea)
                    $("#fDescuento").prop("checked", response.usuario.fDescuento)
                    $("#fFacturaCredito").prop("checked", response.usuario.fFacturaCredito)
                    $("#fCuadre").prop("checked", response.usuario.fCuadre)
                    $("#fEstadoCaja").prop("checked", response.usuario.fEstadoCaja)
                    $("#fFacturaOficial").prop("checked", response.usuario.fFacturaOficial)
                    $("#fRecibo").prop("checked", response.usuario.fRecibo)
                    $("#fTaxfree").prop("checked", response.usuario.fTaxfree)
                    $("#fAnularFactura").prop("checked", response.usuario.fAnularFactura)
                    $("#fPorcientoLey").prop("checked", response.usuario.fPorcientoLey)
                    $("#fActivarPedidos").prop("checked", response.usuario.fActivarPedidos)

                    // $('#tabla').jqxGrid('clear');
                    // $('#tabla').jqxGrid('addrow',null,response.permisos );
                  // config_tabla(response.permisos)
                    response.permisos.forEach( (item) => {
                           // console.log(item)
                        if (typeof item.isadd !== "undefined" && item.isadd == true) {
                             console.log(item)
                            $("#tabla").jqxTreeGrid('checkRow', item.id);
                        }else if (typeof item.isadd !== "undefined" && item.isadd == false) {
                            $("#tabla").jqxTreeGrid('uncheckRow', item.id);
                        }
                    });
                    //config_tabla(response.permisos)
                }
            }
        })
    })

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