$(document).ready(function(){


    init_tabla()
    config_tabla_sectores()


    $("#guardar").click(function(e){
        e.preventDefault()

        let params = formToJson($("#frm"))
        params.sectores = $("#tabla_sectores").jqxGrid('getrows')

        // console.log(params); return;

        $.ajax({
            url: getUrl('zona/store'),
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

    $("#btnadd").click(function(e) {
        e.preventDefault()
        let row = {}
        row.f_idsector = 0
        row.f_sector = $("#f_sector").val()
        row.f_idzona = $("#id").val()

        if (row.f_sector.trim().length > 0) {
            $("#tabla_sectores").jqxGrid("addrow", null, row)
            $("#f_sector").val("")
        }
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

        $("#tabla").jqxGrid('clear');
        init_tabla()
        config_tabla_sectores()

        $("input[type='checkbox']").prop("checked", false)
        $("#id").val("0")
    })


    $('#tabla').on('rowclick', function (event)
    {

        let params = {}
        params.id = $('#tabla').jqxGrid('getrowdata', event.args.rowindex).id;

        $.ajax({
            url: getUrl('zona/getSectores'),
            type: 'POST',
            dataType: 'JSON',
            data: params,
            success: function(response)
            {
                if (typeof response.data !== "undefined") {
                    $("#id").val(response.data[0].f_idzona)
                    $("#f_nombre_zona").val(response.data[0].f_nombre_zona)

                    $("#tabla_sectores").jqxGrid("clear")

                    for (let prop in response.data) {

                        if (response.data[prop].f_idsector > 0) {
                            $("#tabla_sectores").jqxGrid("addrow", null, response.data[prop])
                        }
                    }
                }

            },
            error: function(error) {
                console.log(error)
            }
        })
    });

    function init_tabla() {
        $.ajax({
            url: getUrl('zona/lista'),
            type: 'POST',
            dataType: 'json',
            beforeSend: function() {
                //$("#camarero_grid").jqxGrid('clear');
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
                        { name: 'id', type: 'number' },
                        { name: 'fNombreZona', type: 'string' },

                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#tabla").jqxGrid(
            {
                width: "100%",
                pageable: true,
                height: 290,
                theme: "metro",
                source: dataAdapter,
                editable: false,
                columns: [
                    { text: '<b>ID</b>', width: '7%', datafield: 'id', hidden: true},
                    { text: '<b>Zona</b>', width: '100%', datafield: 'fNombreZona'}
                ]
            });
    }

    function config_tabla_sectores()
    {
        var source =
            {
                localdata: {},
                datafields:
                    [
                        { name: 'f_idsector', type: 'number' },
                        { name: 'f_idzona', type: 'number' },
                        { name: 'f_sector', type: 'string' },
                        { name: 'delete', type: 'boolean' },

                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#tabla_sectores").jqxGrid(
            {
                width: "100%",
                pageable: true,
                height: 290,
                theme: "metro",
                source: dataAdapter,
                editable: false,
                columns: [
                    { text: '<b>ID</b>', width: '7%', datafield: 'f_idsector', hidden: true},
                    { text: '<b>Sector</b>', width: '80%', datafield: 'f_sector'},
                    {
                        text: '<b>Accion</b>',
                        width: '20%',
                        datafield: null,
                        hidden: false,
                        editable: true,
                        align:'center',
                        cellalign:'center',
                        columntype: 'button',
                        cellsrenderer: function (row, columnfield, value, defaulthtml, columnproperties) {
                            return "x";

                        }, buttonclick: function (row) {
                            editrow = row;
                            var dataRecord = $("#tabla").jqxGrid('getrowdata', editrow);

                            $("#tabla_sectores").jqxGrid("deleterow", row)
                        },
                        cellclassname: function (row, column, value, data) {
                            return "cell-button"
                        }
                    } ]
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