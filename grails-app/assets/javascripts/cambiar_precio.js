$(document).ready(function(){

    $("#descripcion").prop("disabled", true)
    $("#categoria").prop("disabled", true)
    $("#referencia").prop("disabled", true)

    $("#btnBuscar").click(function(e) {
        e.preventDefault()
        $("#btnNuevo").trigger("click")
        $("#producto_modal").modal("show")
    })

    $("#btnNuevo").click(function(e) {
        e.preventDefault()

        let inputs =  $("#frmProducto").find('input')
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

        $("#productos_lista").jqxGrid('clear');


    })

    $("#frmBuscarProductos").submit(function(e){
        e.preventDefault()

        if (this.filtro.value.length === 0 ) {
            return
        }

        $.ajax({
            url: window.location + '/get_lista_productos',
            type: 'POST',
            dataType: 'json',
            data: {filtro: this.filtro.value},
            beforeSend: function() {
                $("#productos_lista").jqxGrid('clear');
            },
            success: function(response) {
                if(response.length > 0){
                    init_tabla_productos_filtrados(response)
                }
            },
            error: function(error){
                console.log(error.responseText)
            }
        })
    })

    $('#productos_lista').on('rowclick', function (event)
    {
        $("#id").val( $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).id )
        $("#descripcion").val( $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).fDescripcion )
        $("#precio").val( $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).fPrecio.toFixed(2) )
        $("#categoria").val( $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).categoria )
        $("#referencia").val( $('#productos_lista').jqxGrid('getrowdata', event.args.rowindex).fReferencia )

        // $("#descripcion").prop("disabled", true)
        // $("#categoria").prop("disabled", true)

        $("#producto_modal").modal("hide")
    });


    $("#guardar").click(function(e) {
        e.preventDefault()

        let inputs = {}

        inputs.precio = $("#precio").val()
        inputs.id = $("#id").val() ? $("#id").val(): 0
        if (inputs.precio.trim().length < 1)
        {
            toastr.error("El campo precio es obligatorio.")
            return
        }

        $.ajax({
            url: window.location + '/update',
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



    function init_tabla_productos_filtrados(data)
    {

        var source =
            {
                localdata: data,
                datafields:
                    [
                        { name: 'id', type: 'number' },
                        { name: 'fReferencia', type: 'string' },
                        { name: 'fDescripcion', type: 'string' },
                        { name: 'fPrecio', type: 'number' },
                        { name: 'fIdcategoria', type: 'number' },
                        { name: 'categoria', type: 'string' },
                    ]
            };
        var dataAdapter = new $.jqx.dataAdapter(source);


        // initialize jqxGrid
        $("#productos_lista").jqxGrid(
            {
                width: "100%",
                pageable: true,
                autoheight: true,
                theme: "metro",
                source: dataAdapter,
                editable: false,
                columns: [
                    { text: '<b>ID</b>', width: '7%', datafield: 'id', hidden: true},
                    { text: '<b>Referencia</b>', width: '27%', datafield: 'fReferencia'},
                    { text: '<b>Descripcion</b>', width: '58%', datafield: 'fDescripcion'},
                    { text: '<b>Precio</b>', width: '15%', datafield: 'fPrecio', cellsalign: 'right', cellsformat: 'c2'},
                    { text: '<b>categoria</b>', width: '15%', datafield: 'categoria', cellsalign: 'right', hidden: true},
                    { text: '<b>fIdcategoria</b>', width: '15%', datafield: 'fIdcategoria', cellsalign: 'right', hidden: true},
                ]
            });
    }
})