$(document).ready(function(){

    $("#fechaFin").jqxDateTimeInput({
        width: '100%',
        theme: 'metro',
        todayString: 'Today'
    });
    $("#fechaInicio").jqxDateTimeInput({
        width: '100%',
        theme: 'metro',
        todayString: 'Today'
    });

    init_tabla()

    function init_tabla() {
        $.ajax({
            url: window.location + '/lista',
            type: 'POST',
            dataType: 'JSON',
            success: function(response) {
                if (typeof response.ncf !== "undefined" && response.ncf.length > 0)
                {
                    config_tabla(response.ncf)
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
                        { name: 'fOrden', type: 'string' },
                        { name: 'fReorden', type: 'string' },
                        { name: 'fTipo', type: 'string' },
                        { name: 'fValidaFechaVigencia', type: 'string' },
                        { name: 'fVisible', type: 'bool' },
                        { name: 'fValidaRnc', type: 'bool' },
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
                        width: '100%',
                        datafield: 'fDescripcion',
                        hidden: false,
                        editable:false,
                    },
                    { text: '<b>ID</b>', width: '20%', datafield: 'id', hidden: true},
                    { text: '<b>orden</b>', width: '20%', datafield: 'fOrden', hidden: true},
                    { text: '<b>reorden</b>', width: '20%', datafield: 'fReorden', hidden: true},
                    { text: '<b>tipo</b>', width: '20%', datafield: 'fTipo', hidden: true},
                    { text: '<b>validafecha</b>', width: '20%', datafield: 'fValidaFechaVigencia', hidden: true},
                    { text: '<b>visible</b>', width: '20%', datafield: 'fVisible', hidden: true},

                ],
            });
    }

    function config_tabla_logs(data)
    {

        var source =
            {
                localdata: data,
                datafields:
                    [
                        { name: 'id', type: 'string' },
                        { name: 'fdescripcion', type: 'string' },
                        { name: 'ffecha', type: 'date' },
                        { name: 'fusuario', type: 'string' },
                        { name: 'ffechafinalfacade', type: 'date' },
                        { name: 'ffechainiciofacade', type: 'date' },
                        { name: 'ffechafinal', type: 'date' },
                        { name: 'ffechainicio', type: 'date' },
                        { name: 'fsecuenciafinal', type: 'string' },
                        { name: 'fsecuenciainicial', type: 'string' },
                        { name: 'tiponcf', type: 'string' },
                        { name: 'factivo', type: 'bool' },
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#logs-tabla").jqxGrid(
            {
                width: "100%",
                height: 200,
                theme: "metro",
                source: dataAdapter,
                editable: true,
                showtoolbar: false,
                columns: [
                    { text: '<b>Fecha</b>', width: '10%', datafield: 'ffecha', cellsformat: 'dd/MM/yyyy', editable: false, hidden: true },
                    { text: '<b>ID</b>', width: '20%', datafield: 'id', hidden: true, editable: false },
                    { text: '<b>Usuario</b>', width: '28%', datafield: 'fusuario', editable: false, hidden: true },
                    { text: '<b>Fecha Inicial</b>', width: '25%', datafield: 'ffechainiciofacade', cellsformat: 'dd/MM/yyyy', editable: false,  hidden: true },
                    { text: '<b>Fecha Final</b>', width: '25%', datafield: 'ffechafinalfacade', cellsformat: 'dd/MM/yyyy', editable: false,  hidden: true },
                    { text: '<b>Fecha Inicial</b>', width: '25%', datafield: 'ffechainicio',cellsformat: 'dd/MM/yyyy',editable: false,  hidden: false },
                    { text: '<b>Fecha Final</b>', width: '25%', datafield: 'ffechafinal',cellsformat: 'dd/MM/yyyy',editable: false, hidden: false },
                    { text: '<b>Inicio Secuencia</b>', width: '20%', datafield: 'fsecuenciainicial', cellsalign: 'right', align: 'right', editable: false },
                    { text: '<b>Fin Secuencia</b>', width: '20%', datafield: 'fsecuenciafinal', cellsalign: 'right', align: 'right', editable: false },
                    { text: '<b>Activo</b>', width: '10%', datafield: 'factivo',align:'center', columntype: 'checkbox', editable: true },

                ],
            });
    }



    $("#showLog").click(function(e) {
        e.preventDefault()
        let selectedIndex = $('#tabla').jqxGrid('getselectedrowindex');

       if (selectedIndex >= 0)  {
           let id = $('#tabla').jqxGrid('getrowdata', selectedIndex).id;
           let descripcion = $('#tabla').jqxGrid('getrowdata', selectedIndex).fDescripcion;
            $("#logdescripcion").val(descripcion)
            $("#logdescripcion").attr('disabled', true)
           $.ajax({
               url: window.location + '/lista_logs',
               type: 'POST',
               dataType: 'JSON',
               data: {id: id},
               success: function(response) {
                   if (typeof response.logs !== "undefined" && response.logs.length > 0)
                   {
                       config_tabla_logs(response.logs)


                       $("#log-panel").show()
                   }else{
                       config_tabla_logs([])
                       $("#log-panel").show()
                   }
               },
               error: function (error) {
                   console.log(error.responseText)
               }
           })
       }
    })

    $("#btnAddlog").click(function(e) {
        e.preventDefault()

        let row = {}

        row.id = 0;

        row.tiponcf = $("#id").val()
        row.fsecuenciainicial = $("#iniciosecuencia").val()
        row.fsecuenciafinal = $("#finsecuencia").val()

        row.ffechainicio = $("#fechaInicio").val('date')
        row.ffechafinal = $("#fechaFin").val('date')

        row.ffechainiciofacade = $("#fechaInicio").val('date')
        row.ffechafinalfacade = $("#fechaFin").val('date')

        $("#logs-tabla").jqxGrid('addrow', null, row);


    })

    $("#guardar").click(function(e) {
        e.preventDefault()

        let inputs = {}

        inputs.descripcion = $("#descripcion").val()
        inputs.tipo = $("#tipo").val()
        inputs.id = $("#id").val() ? $("#id").val(): 0
        inputs.reorden = $("#reorden").val() ? $("#reorden").val(): 0
        inputs.orden = $("#orden").val() ? $("#orden").val(): 0
        inputs.visible = $("#orden").prop('checked')
        inputs.validavigencia = $("#validavigencia").prop('checked')
        inputs.validarnc = $("#validarnc").prop('checked')


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

    $("#logguardar").click(function(e) {
        e.preventDefault()
        var data = [];

        data = $("#logs-tabla").jqxGrid('getrows');

        console.log(data)

        //Change date to milisconds

        for (let prop in data)
        {
            data[prop].ffechafinal = data[prop].ffechafinal.getTime()
            data[prop].ffechainicio = data[prop].ffechainicio.getTime()
        }

        $.ajax({
            url: window.location + '/store_secuencia',
            type: 'POST',
            dataType: 'JSON',
            data: {data: JSON.stringify(data)},
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
                    limpiarSecuencia()
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
        $("#tipo").val("")
        $("#reorden").val("")
        $("#orden").val("")
        $("#id").val("0")
        $("input[type='checkbox']").prop('checked', false)
        $("#log-panel").hide()
        init_tabla()
    })

    function limpiarSecuencia() {
        $("#iniciosecuencia").val("")
        $("#finsecuencia").val("")
        $("#fechaFin").val(new Date())
        $("#fechaInicio").val(new Date())
        config_tabla_logs()
    }

    $('#tabla').on('rowclick', function (event){

        $('#id').val($('#tabla').jqxGrid('getrowdata', event.args.rowindex).id);
        $('#descripcion').val($('#tabla').jqxGrid('getrowdata', event.args.rowindex).fDescripcion);
        $('#tipo').val($('#tabla').jqxGrid('getrowdata', event.args.rowindex).fTipo);
        $('#reorden').val($('#tabla').jqxGrid('getrowdata', event.args.rowindex).fReorden);
        $('#orden').val($('#tabla').jqxGrid('getrowdata', event.args.rowindex).fOrden);
        $('#visible').prop('checked', $('#tabla').jqxGrid('getrowdata', event.args.rowindex).fVisible);
        $('#validavigencia').prop('checked', $('#tabla').jqxGrid('getrowdata', event.args.rowindex).fValidaFechaVigencia);
        $('#validarnc').prop('checked', $('#tabla').jqxGrid('getrowdata', event.args.rowindex).fValidaRnc);
    })

})