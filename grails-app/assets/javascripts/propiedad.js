$(document).ready(function(){


    init_combo()

    function init_tabla_propiedades(id) {

        if (parseInt(id) < 1) {
            return
        }

        $.ajax({
            url: window.location + '/get_propiedades',
            type: 'POST',
            data: {id: id},
            dataType: 'JSON',
            success: function(response) {

                if (typeof response.propiedades !== "undefined" && response.propiedades.length > 0)
                {
                    //llenarCombox($('#categoria'),response.categorias)
                    config_tabla_propiedades(response.propiedades)
                }
                else{
                    toastr.info("La categoria no tienes propiedades")
                }


            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    }

    function init_combo() {
        $.ajax({
            url: window.location + '/get_categorias',
            type: 'POST',
            dataType: 'JSON',
            success: function(response) {

                if (typeof response.categorias !== "undefined" && response.categorias.length > 0)
                {
                    llenarCombox($('#categoria'),response.categorias)
                    //config_tabla_categorias(response.categorias)
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

    function llenarCombox(combo,data)
    {
        $(combo).append('<option value="0">--Seleccionar una opcion--</option>')
        for(let item in data)
        {
            let text = data[item].fNombre || data[item].fDescripcion
            $(combo).append('<option value="'+data[item].id+'">'+text+'</option>')
        }
    }

    function config_tabla_propiedades(data)
    {

        var source =
            {
                localdata: data,
                datafields:
                    [
                        { name: 'id', type: 'string' },
                        { name: 'fDescripcion', type: 'string' },
                        { name: 'fIdcategoria', type: 'string' },
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#propiedades_list").jqxGrid(
            {
                width: "100%",
                height: 200,
                theme: "metro",
                source: dataAdapter,
                editable: false,
                showtoolbar: false,
                columns: [
                    {
                        text: '<b>Propiedades</b>',
                        width: '100%',
                        datafield: 'fDescripcion',
                        columngroup: 'categorias',
                        hidden: false,
                        editable:false,
                    },
                    { text: '<b>ID</b>', width: '20%', datafield: 'id', hidden: true},
                    { text: '<b>IDcategoria</b>', width: '20%', datafield: 'fIdcategoria', hidden: true},

                ],
            });
    }

    $("#guardar").click(function(e) {
        e.preventDefault()
        //alert("Asd")

        let inputs = {}

        inputs.descripcion = $("#descripcion").val()
        inputs.id = $("#id").val() ? $("#id").val(): 0
        inputs.categoria = $("#categoria").val()

        if (inputs.descripcion.trim().length < 1)
        {
            toastr.error("El campo descripcion es obligatorio.")
            return
        }

        if (parseInt(inputs.categoria) < 1 )
        {
            toastr.error("Seleccione una categoria")
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
                    init_tabla_propiedades($("#categoria").val())
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

    $("#categoria").change(function(e) {

        $("#propiedades_list").jqxGrid('clear');
        init_tabla_propiedades($("#categoria").val())
    })

    $("#btnNuevo").click(function (e) {
        e.preventDefault()
        $("#descripcion").val("")
        $("#id").val("0")
        $("#categoria").val("0")
        $("#propiedades_list").jqxGrid('clear');

    })

    $('#propiedades_list').on('rowclick', function (event){

        $('#id').val($('#propiedades_list').jqxGrid('getrowdata', event.args.rowindex).id);
        $('#descripcion').val($('#propiedades_list').jqxGrid('getrowdata', event.args.rowindex).fDescripcion);

    })


})