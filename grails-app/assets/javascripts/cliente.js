$(document).ready(function(){

    $("#datepickerNacimiento").jqxDateTimeInput({
        width: '100%',
        theme: 'metro',
        todayString: 'Today'
    });

    (function() {
        $.ajax({
            url: window.location + '/data_combos',
            type: 'POST',
            dataType: 'JSON',
            success: function(response) {
                llenarCombox($('#cbcompania'),response.companias)
                let data = response.tipoContactos
                $("#tipocontacto").append('<option value="0">--Seleccionar una opcion--</option>')

                for(let item in data)
                {
                    $("#tipocontacto").append('<option value="'+data[item].id+'">'+data[item].fContacto+'</option>')
                }
                // if (response.companias.length > 0)
                // {
                //
                // }
                // if (response.tipoContactos.length > 0)
                // {
                //
                // }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    })()

    function llenarCombox(combo,data)
    {
        $(combo).append('<option selected value="0">--Seleccionar una opcion--</option>')
        //console.log(combo)
        for(let item in data)
        {
            let text = data[item].fNombre || data[item].fDescripcion
            $(combo).append('<option value="'+data[item].id+'">'+text+'</option>')
        }
    }


    init_tabla_fotos()
    function init_tabla_fotos()
    {
        var source =
            {
                localdata: {},
                datafields:
                    [
                        { name: 'id_tipo', type: 'string' },
                        { name: 'tipo', type: 'string' },
                        { name: 'contacto', type: 'string' },
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#contacto_grid").jqxGrid(
            {
                width: "100%",
                height: 200,
                theme: "metro",
                source: dataAdapter,
                editable: true,
                showtoolbar: true,
                columns: [
                    {
                        text: '<b>Tipo</b>',
                        width: '50%',
                        datafield: 'tipo',
                        hidden: false,
                        editable:false,
                    },
                    { text: '<b>Contacto</b>', width: '50%', datafield: 'contacto',},
                    { text: '<b>id_contacto</b>', width: '50%', datafield: 'id_tipo', hidden:true},

                ],
                rendertoolbar: function (toolbar) {
                    var me = this;
                    var container = $("<div style='margin: 5px;'></div>");
                    toolbar.append(container);
                    container.append('<button id="addrowbutton_contacto_grid" type="button"> <i class="fa fa-plus"></i> Agregar</button>');

                    container.append('<button style="margin-left: 5px;" id="deleterowbutton_contacto_grid" type="button"> <i class="fa fa-trash-o"></i> Eliminar</button>');



                    $("#deleterowbutton_contacto_grid").jqxButton();
                    $("#addrowbutton_contacto_grid").jqxButton();

                    $("#addrowbutton_contacto_grid").on('click', function (e) {


                        let row = {}

                        row.contacto = $("#txtcontacto").val()
                        row.id_tipo = $("#tipocontacto :selected").val()
                        row.tipo = $("#tipocontacto :selected").text()

                        if (row.contacto.trim().length < 1) {

                            return
                        }
                        var commit = $("#contacto_grid").jqxGrid('addrow', null, row);
                    });


                    // delete row.
                    $("#deleterowbutton_fotos_grid").on('click', function () {
                        var selectedrowindex = $("#contacto_grid").jqxGrid('getselectedrowindex');
                        var rowscount = $("#contacto_grid").jqxGrid('getdatainformation').rowscount;
                        if (selectedrowindex >= 0 && selectedrowindex < rowscount) {
                            var id = $("#contacto_grid").jqxGrid('getrowid', selectedrowindex);
                            var commit = $("#contacto_grid").jqxGrid('deleterow', id);
                        }
                    });
                },
            });
    }

    $("#guardar").click(function(e){
        e.preventDefault()

        let inputs = $("#frmCliente").find('input, select')

        inputs = $(inputs).serializeArray()
        inputs = jsonArrayToJsonKey(inputs)

        inputs.id = $("#id").val() ? $("#id").val() : 0
        inputs['contacto'] = $('#contacto_grid').jqxGrid('getrows')
        inputs['fecha_nacimiento'] = formatDate($('#datepickerNacimiento').val())

        inputs.hasCredito = $("#hascr").prop("checked")
        // inputs.acceso_web = $("#accesoweb").prop("checked")
        // inputs.empresa = $("#isempresa").prop("checked")
        //console.log(inputs)



        if (!validar(inputs)) {
            return
        }



        $.ajax({
            url: window.location + '/guardar',
            type: 'POST',
            dataType: 'JSON',
            data: {data: JSON.stringify(inputs)},
            beforeSend: () => {
                $("#guardar").attr("disabled", true)
            },
            success: function(response) {

                if (typeof response.errorsCliente !== "undefined" && response.errorsCliente.length > 0)
                {
                    showErrorMessage(response.errorsCliente)
                }

                if  (response.success)
                {
                    $("#btnNuevo").trigger("click")
                    toastr.success("Datos guardados Correctamente")
                }
            },
            error: function(error) {
                console.log(error.responseText)
            },
            complete: () => {
                $("#guardar").attr("disabled", false)
            },
        })
    })

    $("#btnNuevo").click(function(e) {
        e.preventDefault()

        let inputs =  $("#frmCliente").find('input')
        let selects =  $("#frmCliente").find('select')


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

        $("#contacto_grid").jqxGrid('clear');

        $("input[type='checkbox']").prop("checked", false)
        $("#id").val("0")
        $('#datepickerNacimiento').val(new Date())


    })

    $("#frmBuscarCliente").submit(function(e){
        e.preventDefault()

        if (this.filtro.value.length === 0 ) {
            return
        }

        $.ajax({
            url: window.location + '/lista',
            type: 'POST',
            dataType: 'json',
            data: {filtro: this.filtro.value},
            beforeSend: function() {
                $("#cliente_grid").jqxGrid('clear');
            },
            success: function(response) {
                if(response.clientes.length > 0){
                    init_tabla_cliente_filtrados(response.clientes)
                }
            },
            error: function(error){
                console.log(error.responseText)
            }
        })
    })

    $('#cliente_grid').on('rowclick', function (event)
    {

            let cliente = {}
            cliente.id = $('#cliente_grid').jqxGrid('getrowdata', event.args.rowindex).id;

            $.ajax({
                url: window.location + '/get_cliente',
                type: 'POST',
                dataType: 'JSON',
                data: cliente,
                success: function(response)
                {
                    //console.log(response)
                    $("#btnNuevo").trigger('click')

                    if (typeof response.cliente !== "undefined") {

                        $("#nombre").val(response.cliente.fNombre)
                        $("#apellido").val(response.cliente.fApellido)
                        $("#apellido").val(response.cliente.fApellido)
                        $("#datepickerNacimiento").val(new Date(response.cliente.fFechaNacimiento))
                        $("#codigo").val(response.cliente.fCodigoCliente)
                        $("#dias_credito").val(response.cliente.fDiasCredito)
                        $("#cbcompania").val(response.cliente.fIdcompania)
                        $("#cedula").val(response.cliente.fCedula)
                        $("#email").val(response.cliente.fEmailPrincipal)
                        $("#limite_credito").val(response.cliente.fLimiteCredito.toFixed(2))
                        $("#limite_credito_compania").val(response.cliente.fLimiteCreditoCompania.toFixed(2))

                        $("#balance").val(formatter.format(response.cliente.fBalance, 0, 2))

                        $("#direccion").val(response.cliente.fDireccion)
                        $("#usuario").val(response.cliente.fUsuario)
                        $("#id").val(response.cliente.id)


                        $("#hascr").prop("checked",response.cliente.fTieneCredito)
                        $("#accesoweb").prop("checked",response.cliente.fAccesoweb)
                        $("#isempresa").prop("checked",response.cliente.fEmpresa)

                        $("#balance").attr("disabled", true)

                        if (typeof response.contactos !== "undefined" && response.contactos.length > 0)
                        {
                            response.contactos.forEach(function(item, index) {
                                $("#contacto_grid").jqxGrid('addRow', null, {
                                    id_tipo: item[0].fIdtipo,
                                    tipo: item[1].fContacto,
                                    contacto: item[0].fContacto
                                });
                            })
                        }
                    }

                    $("#cliente_modal").modal("hide")
                },
                error: function(error) {
                    console.log(error)
                }
            })

    });

    function validar(inputs) {

        var reg = /^\d*$/

        if (inputs.nombre.trim().length == 0)
        {
            //toastr.warning("Cedula solo puede conformarse por numeros")
            isInValidStyle($("#nombre"), "Este campo es obligatorio")
            return false
        } else {
            isValidStyle($("#nombre"))
        }

        if (inputs.apellido.trim().length == 0)
        {
            //toastr.warning("Cedula solo puede conformarse por numeros")
            isInValidStyle($("#apellido"), "Este campo es obligatorio")
            return false
        } else {
            isValidStyle($("#apellido"))
        }

        if (isNaN(inputs.cedula))
        {
            //toastr.warning("Cedula solo puede conformarse por numeros")
            isInValidStyle($("#cedula"), "Este campo solo puede conformarse por numeros")
            return false
        } else {
            isValidStyle($("#cedula"))
        }

        if (isNaN(inputs.dias_credito))
        {
            //toastr.warning("Dias de credito solo acepta numeros")
            isInValidStyle($("#dias_credito"), "Este campo solo puede conformarse por numeros")
            return false
        } else {
            isValidStyle($("#dias_credito"))
        }

        if (isNaN(inputs.limite_credito))
        {
           // toastr.warning("Limite de credito solo acepta numeros")
            isInValidStyle($("#limite_credito"), "Este campo solo puede conformarse por numeros")
            return false
        } else {
            isValidStyle($("#limite_credito"))
        }

        return true
    }

    function init_tabla_cliente_filtrados(data)
    {
        var source =
            {
                localdata: data,
                datafields:
                    [
                        { name: 'id', type: 'number' },
                        { name: 'fNombre', type: 'string' },
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#cliente_grid").jqxGrid(
            {
                width: "100%",
                pageable: true,
                autoheight: true,
                theme: "metro",
                source: dataAdapter,
                editable: false,
                columns: [
                    { text: '<b>ID</b>', width: '7%', datafield: 'id', hidden: true},
                    { text: '<b>Nombre</b>', width: '100%', datafield: 'fNombre'},
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