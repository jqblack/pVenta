$(document).ready(() => {
    idproceso = 3;

    $("#btn-generar-cuadre").click(function (e) {
        e.preventDefault()

        $("#autorizacion-modal").modal("show")
    })

    $("#frm-autorizacion").submit((e) => {
        e.preventDefault()

        let params = {}
        params = formToJson($("#frm-autorizacion"))

        $.ajax({
            url: getUrl('/cuadre_general/generar'),
            type: 'POST',
            dataType: 'JSON',
            data: params,
            beforeSend: () => {
                $("#btn").attr("disabled", true);
                $("button[type='submit']").attr("disabled", true)
            },
            success: function(response) {
                if (response.success)
                {
                    let cuadre = response.data
                    toastr.success("Registro exitoso")

                    $("#f_fecha").html("Fecha: " + cuadre.f_fecha_generado)

                    $("#f_pedidos").html(new Intl.NumberFormat().format(cuadre.f_pedidos))
                    $("#f_factcredito").html(new Intl.NumberFormat().format(cuadre.f_factcredito))
                    $("#f_factcontado").html(new Intl.NumberFormat().format(cuadre.f_factcontado))
                    $("#f_montocredito").html(new Intl.NumberFormat().format(cuadre.f_montocredito))
                    $("#f_montocontado").html(new Intl.NumberFormat().format(cuadre.f_montocontado))
                    $("#f_montoitbis").html(new Intl.NumberFormat().format(cuadre.f_montoitbis))
                    $("#f_montocheque").html(new Intl.NumberFormat().format(cuadre.f_montocheque))
                    $("#f_montotarjeta").html(new Intl.NumberFormat().format(cuadre.f_montotarjeta))
                    $("#f_montoenvio").html(new Intl.NumberFormat().format(cuadre.f_montoenvio))
                    $("#f_monto_caja").html(new Intl.NumberFormat().format(cuadre.f_monto_caja))
                    $("#f_monto_recibo").html(new Intl.NumberFormat().format(cuadre.f_monto_recibo))
                    $("#f_monto_cancelado").html(new Intl.NumberFormat().format(cuadre.f_monto_cancelado))

                    $("#usuario").val("")
                    $("#password").val("")

                    $("#panel-total").show()
                } else if (parseInt(response.response_server_print.f_key) != 1) {
                    swal("Error Code: " + response.response_server_print.f_key, response.response_server_print.f_mensaje, "warning")
                    return;
                }
                else if(!response.is_printer_conected) {
                    swal("Printer desconectado", "Por favor conecte el printer antes de imprimir", "error")
                }
                else if(!response.has_permission) {
                    swal("Acceso negado", "No tienes permiso para esta accion", "error")
                }
                else if (response.errors.length > 0) {
                    showErrorMessage(response.errors)
                }
                else{
                    toastr.error(response.msj)
                }
            },
            error: function (error) {
                console.log(error.responseText)
            },
            complete: function() {

                $("#autorizacion-modal").modal("hide")
                $("button[type='submit']").attr("disabled", false)
            }
        })
    })

})