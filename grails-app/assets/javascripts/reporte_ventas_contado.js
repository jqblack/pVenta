$(document).ready(function(){

    $("#fechaInicial, #fechaFinal").jqxDateTimeInput({
        width: '100%',
        theme: 'metro',
        todayString: 'Today'
    });

    $("#generar").click(function (e) {

        e.preventDefault()
        //alert("Asd")

        let inputs = {}

        inputs.report = 1;
        inputs.fechaInicio = $("#fechaInicial").val('date').toISOString()
        inputs.fechaFinal = $("#fechaFinal").val('date').toISOString()


        $.ajax({
            url: getUrl('generar'),
            type: 'POST',
            dataType: 'JSON',
            data: {data: JSON.stringify(inputs)},
            beforeSend: function() {
                let loading = '<h4>Updating please wait...</h4>' +
                    ' <i class="fa fa-rotate-right fa-3x fa-spin"></i>' +
                    '<span class="sr-only">Loading...</span>' +
                    '<div style="margin-bottom: 1em;"></div>';
                $("#pdfmodal-title").html("Loading...")
                $("#pdfmodal-content").html(loading);
                $("#pdfmodal").modal("show");

            },
            success: function(response) {

                // if (typeof response.errors !== "undefined" && response.errors.length > 0)
                // {
                //     showErrorMessage(response.errors)
                //     return
                // }
                if  (response.reportAsBase64.length > 0)
                {
                    $("#pdfmodal-title").html("Ventas al contado")
                    $("#pdfmodal-content")
                        .html("<iframe width='100%' height='600px' src='data:application/pdf;base64," + response.reportAsBase64 + "'></iframe>")
;                }
                // else{
                //     toastr.error("Ocurrio un error con la comunicacion")
                //     return
                // }
            },
            error: function(error) {
                console.log(error.responseText)
            }
        })

    })
})