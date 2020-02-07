$(document).ready(function () {
    $('[data-toggle="tooltip"]').tooltip();
    initTablaHorario($("#f_idrecord").val());
    initTablaFormatosImpresion();
    var validarUploadImg = false;

    $("#btn").click((e) => {
        let params = formToJson($("#frm"))
        //let dias = $("#tabla-horario").jqxGrid('getrows')
        let i = 1;
        // for (let prop in dias) {
        //     if (dias[prop].libre) {
        //         params['f_horario_' + i] = "-1";
        //     } else {
        //
        //         params['f_horario_' + i] = dias[prop].apertura.getHours() + ':' + dias[prop].apertura.getMinutes() +
        //             ';' + dias[prop].cierre.getHours() + ':' + dias[prop].cierre.getMinutes()
        //     }
        //     i++
        // }
        // console.log(validarUploadImg)
        if (!validarUploadImg) {
            params.f_logo = "0"
        }

        params.f_impuesto_incluido = (params.f_impuesto_incluido === 'on') ? true : false;
        params.f_impresion_detalle_factura = (params.f_impresion_detalle_factura === 'on') ? true : false
        params.f_cobrar_porciento_ley = (params.f_cobrar_porciento_ley === 'on') ? true : false
        params.f_configuraciones_impresion = $("#tabla").jqxGrid("getrows");
        params.f_longitud = 0;
        params.f_latitud = 0;

        $.ajax({
            url: getUrl('preferencia/store'),
            type: 'POST',
            dataType: 'JSON',
            data: {data: JSON.stringify(params)},
            success: function (response) {
                if (typeof response.errors !== "undefined" && response.errors.length > 0) {
                    showErrorMessage(response.errors)
                    return
                }
                if (response.success) {
                    toastr.success("Datos guardados Correctamente")
                    setTimeout(() => {
                        window.location.reload()
                    }, 400)
                    $("#btnNuevo").trigger("click")
                    validarUploadImg = false
                }
                else {
                    toastr.error("Ocurrio un error con la comunicacion")
                    return
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    })

    $('#fotoUpload').jqxFileUpload({
        accept: '.jpg,.png,',
        rtl: true,
        browseTemplate: 'success',
        uploadTemplate: 'primary',
        cancelTemplate: 'danger',
        multipleFilesUpload: false,
        width: '100%',
        uploadUrl: getUrl('products/uploadImage'),
        fileInputName: 'foto'
    });

    $('#fotoUpload').on('uploadEnd', function (event) {
        var args = event.args;
        var fileName = args.file;
        var serverResponce = args.response;

        $("#logo").attr("src", "data:imagen/*;base64, " + serverResponce);
        $("#f_logo").val(serverResponce)
        validarUploadImg = true;
    });
    //
    // $(".horario-input").jqxDateTimeInput({
    //     width: '45%',
    //     theme: 'metro',
    //     formatString: 'T',
    //     showCalendarButton: false,
    //     showTimeButton: true,
    //     rtl: true,
    //     culture: 'he-IL'
    // });

    function initTablaHorario(idempresa) {
        let params = {}

        params.idempresa = idempresa


        $.ajax({
            url: getUrl('preferencia/horario'),
            type: 'POST',
            dataType: 'JSON',
            data: {data: JSON.stringify(params)},
            success: function (response) {

                if (typeof response.errors !== "undefined" && response.errors.length > 0) {
                    showErrorMessage(response.errors)
                    return
                }
                if (typeof response.data !== "undefined") {
                    //console.log(formatearHorario(response.data[0]))
                    // config_tabla_horario(formatearHorario(response.data[0]))
                }
                else {
                    toastr.error("Ocurrio un error con la comunicacion")
                    return
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })

    }

    function initTablaFormatosImpresion() {

        $.ajax({
            url: getUrl("preferencia/configuracion_procesos"),
            type: 'POST',
            dataType: 'JSON',
            beforeSend: () => {
                $("#tabla").jqxGrid('showloadelement')
            },
            success: function (response) {

                if (typeof response.errors !== "undefined" && response.errors.length > 0) {
                    showErrorMessage(response.errors);
                    return "";
                }
                if (typeof response.data !== "undefined") {
                    config_tabla(response.data, response.opciones)
                }
                else {
                    toastr.error("Ocurrio un error con la comunicacion");
                    return "";
                }
            },
            error: function (error) {
                console.log(error.responseText)
            },
            complete: () => {
                $("#tabla").jqxGrid('hideloadelement')
            }
        })
    }

    function formatearHorario(data) {

        let response = [
            {dia: 'Domingos', 'apertura': new Date(), 'cierre': new Date(), libre: false},
            {dia: 'Lunes', 'apertura': new Date(), 'cierre': new Date(), libre: false},
            {dia: 'Martes', 'apertura': new Date(), 'cierre': new Date(), libre: false},
            {dia: 'Miercoles', 'apertura': new Date(), 'cierre': new Date(), libre: false},
            {dia: 'Jueves', 'apertura': new Date(), 'cierre': new Date(), libre: false},
            {dia: 'Viernes', 'apertura': new Date(), 'cierre': new Date(), libre: false},
            {dia: 'Sabados', 'apertura': new Date(), 'cierre': new Date(), libre: false},
        ]


        for (let i = 0; i < 7; i++) {
            if (data[i] != "null") {
                if (data[i] == "-1") {
                    response[i].apertura = new Date();
                    response[i].cierre = new Date();
                    response[i].libre = true;
                } else {
                    let horas = data[i].split(";")
                    let horaApertura = horas[0].split(":")

                    let horaCierre = horas[1].split(":")

                    let apertura = new Date().setHours(horaApertura[0], horaApertura[1]);
                    let cierre = new Date().setHours(horaCierre[0], horaCierre[1]);

                    response[i].apertura = new Date(apertura);
                    response[i].cierre = new Date(cierre);
                    response[i].libre = false;
                }
            }
        }
        return response
    }

    function config_tabla_horario(data) {
        let semana = [
            {dia: 'Domingos', 'apertura': new Date(), 'cierre': new Date(), libre: false},
            {dia: 'Lunes', 'apertura': new Date(), 'cierre': new Date(), libre: false},
            {dia: 'Martes', 'apertura': new Date(), 'cierre': new Date(), libre: false},
            {dia: 'Miercoles', 'apertura': new Date(), 'cierre': new Date(), libre: false},
            {dia: 'Jueves', 'apertura': new Date(), 'cierre': new Date(), libre: false},
            {dia: 'Viernes', 'apertura': new Date(), 'cierre': new Date(), libre: false},
            {dia: 'Sabados', 'apertura': new Date(), 'cierre': new Date(), libre: false},
        ]

        //data = (data.length === 0) ? data: semana

        var source =
            {
                localdata: data,
                datafields:
                    [
                        {name: 'dia', type: 'string'},
                        {name: 'apertura', type: 'date'},
                        {name: 'cierre', type: 'date'},
                        {name: 'libre', type: 'bool'},
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#tabla-horario").jqxGrid(
            {
                width: "100%",
                height: 200,
                theme: "metro",
                source: dataAdapter,
                autoheight: true,
                editable: true,
                showtoolbar: false,
                columns: [
                    {
                        text: '<b>Dia</b>',
                        width: '20%',
                        datafield: 'dia',
                        editable: false,
                    },
                    {
                        text: '<b>Apertura</b>',
                        width: '35%',
                        datafield: 'apertura',
                        cellsformat: 'h:mm tt',
                        editable: true,
                        columntype: 'datetimeinput',
                        createeditor: function (row, column, editor) {

                            editor.jqxDateTimeInput({
                                formatString: 'h:mm tt',
                                showTimeButton: true,
                                showCalendarButton: false
                            });
                        },
                        cellvaluechanging: (row, datafield, columntype, oldvalue, newvalue) => {

                            if (row === 0) {
                                for (let i = 0; i < 5; i++) {
                                    $("#tabla-horario").jqxGrid('getrowdata', i).apertura = newvalue
                                }
                            }
                        }
                    },
                    {
                        text: '<b>Cierre</b>',
                        width: '35%',
                        datafield: 'cierre',
                        cellsformat: 'h:mm tt',
                        editable: true,
                        columntype: 'datetimeinput',
                        createeditor: function (row, column, editor) {
                            editor.jqxDateTimeInput({
                                formatString: 'h:mm tt',
                                showTimeButton: true,
                                showCalendarButton: false
                            });
                        },
                        cellvaluechanging: (row, datafield, columntype, oldvalue, newvalue) => {

                            if (row === 0) {
                                for (let i = 0; i < 5; i++) {
                                    $("#tabla-horario").jqxGrid('getrowdata', i).cierre = newvalue
                                }
                            }
                        }
                    },
                    {
                        text: '<b>Libre</b>',
                        width: '10%',
                        datafield: 'libre',
                        editable: true,
                        columntype: 'checkbox',
                        cellsrenderer: (row, column, value, defaultHtml, columnSettings, rowData) => {


                        }
                    },
                ],
            });
    }

    function config_tabla(data, opciones) {

        var estatusesSource =
            {
                datatype: "array",
                datafields: [
                    {name: 'label', type: 'string'},
                    {name: 'value', type: 'string'}
                ],
                localdata: opciones
            };
        var estatusesAdapter = new $.jqx.dataAdapter(estatusesSource, {
            autoBind: true
        });

        var source = {
            localdata: data,
            datafields: [
                { name: 'idproceso', type: 'string' },
                { name: 'descripcion_proceso', type: 'string' },
                {
                    name: 'opcion_configuracion',
                    value: 'idconfiguracion',
                    values: {source: estatusesAdapter.records, value: 'value', name: 'label' }
                },
                { name: 'idconfiguracion', type: 'string' }
            ]
        };

        var dataAdapter = new $.jqx.dataAdapter(source);
        // initialize jqxGrid
        $("#tabla").jqxGrid({
            width: "100%",
            theme: "metro",
            source: dataAdapter,
            sortable: true,
            filterable: true,
            autorowheight: true,
            autoheight: true,
            editable: true,
            showtoolbar: false,
            pageable: false,
            //rowsheight: 40,
            columns: [
                {
                    text: '<b>id</b>',
                    width: '20%',
                    datafield: 'idproceso',
                    editable: false,
                    hidden: true,
                },
                {
                    text: '<b>Proceso</b>',
                    width: '65%',
                    datafield: 'descripcion_proceso',
                    editable: false,
                    cellclassname: 'red'
                },
                {
                    text: '<b>Config.</b>',
                    width: '35%',
                    datafield: 'idconfiguracion',
                    displayfield: 'opcion_configuracion',
                    editable: true,
                    columntype: 'dropdownlist',
                    createeditor: function (row, value, editor) {
                        editor.jqxDropDownList({
                            template: "",
                            source: estatusesAdapter,
                            displayMember: 'label',
                            valueMember: 'value'
                        });
                    },
                    cellclassname: function (row, column, value, data) {
                        //return "resaltar-texto-tabla-pedidos"; r
                        return ""
                    },
                },
            ],
        })
    }
});
