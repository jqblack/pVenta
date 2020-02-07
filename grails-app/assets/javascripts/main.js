/* eslint-disable object-shorthand */

/* global Chart, CustomTooltips, getStyle, hexToRgba */

const proyectPath = "/menube"
var idproceso = 1


toastr.options.positionClass = "toast-top-right"
function getUrl(uri) {
    let url = window.location.href;

    url = url.split('/')
    url = url.slice(0,5);

    url[url.length] = uri;

    return url.join('/')
}
function showErrorMessage(errors){
    toastr.options.positionClass = "toast-top-right"

    errors.forEach(function(item, index){
        toastr.error(item)
    })

}
function getUrl(uri) {
    let url = window.location.href;

    url = url.split('/')
    //console.log(url)
    url[url.length - 1] = uri;

    return url.join('/')
}

function numericFormat(total) {
    return new Intl.NumberFormat().format(total)
}

// Create our number formatter.
var formatter = new Intl.NumberFormat('en-US', {
    style: 'currency',
    currency: 'USD',
    minimumFractionDigits: 2,
    // the default value for minimumFractionDigits depends on the currency
    // and is usually already 2
});

function showLoader() {
    $("div.my-loader").eq(0).css("display", "flex")
}
function hideLoader() {
    $("div.my-loader").eq(0).css("display", "none")
}

function showLoading() {

    let modal = $('<div></div>')
    let modal_document = $('<div></div>')
    let modal_content = $('<div></div>')
    let modal_body = $('<div></div>')
    let message = '<h4>Cargando...</h4>'+
        ' <i class="fa fa-circle-o-notch fa-3x fa-spin"></i>' +
        '<span class="sr-only">Loading...</span>' +
        '<div style="margin-bottom: 1em;"></div>';

    modal.attr({
        'id': 'loading',
        'tabindex': '-1',
        'role': 'dialog',
        'aria-labelledby': 'exampleModalCenterTitle',
        'aria-hidden': 'true',
    })
    modal.addClass('modal fade')

    modal_document.attr('role', 'document')
    modal_document.addClass('modal-dialog modal-sm modal-dialog-centered')
    modal_content.addClass('modal-content')
    modal_body.addClass('modal-body')

    modal_body.css("text-align", 'center')
    modal_body.css("color", '#1B8EB7')
    modal_body.html(message)

    $("#loading").remove()
    $("body").append(modal.html(modal_document.html(modal_content.html(modal_body))))

    $("#loading").modal({
        backdrop: 'static',
        keyboard: false,
        show: true
    });

}

function llenarCombox(combo,data)
{
    $(combo).html("")
    $(combo).append('<option value="0">--Seleccionar una opcion--</option>')
    for(let item in data)
    {
        $(combo).append('<option value="'+data[item].id+'">'+data[item].fDescripcion+'</option>')
    }
}

function formToJson(form) {
    let inputs = $(form).find('input, select, textarea')


    inputs = $(inputs).serializeArray()


    let newJson = {}
    let simples = new RegExp("\'", "g");
    let dobles = new RegExp("\"", "g");
    let val = "";

    for (let key in inputs) {
        if (inputs[key] !== undefined) {
            // newJson[inputs[key].name] = inputs[key].value

            val = inputs[key].value.replace(simples, "");
            newJson[inputs[key].name] = val.replace(dobles, "");
        }
    }

    return newJson
}

function closeLoading() {

    setTimeout(()=> {
            $(".modal").modal("hide");
    }, 1000)
    //$("#loading").modal('hide');
}

function showSuccessMessage(errors){
    toastr.options.positionClass = "toast-top-right"
    toastr.success(errors.join("<br/>") )
}

$(document).ready(() => {

    $('[data-toggle="tooltip"]').tooltip();
    $("#btn-conectar-printer").click(e=> {
        $("#conectar-printer-modal").modal("show")
    })

    cargarConfigToprint()

    function cargarConfigToprint() {
        $.ajax({
            url: getUrl('home/getConfiguracionesToPrint'),
            type: 'POST',
            dataType: 'JSON',
            success: function(response) {
                llenarCombox($('#idprinterconfig'),response.data)

            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    }

    $("#btn-conectar-app").click(e=> {
        let params = {}
        let button = e.target

        $.ajax({
            url:  getUrl('home/activar_pedidos'),
            type: 'POST',
            dataType: 'JSON',
            data: params,
            success: function(response) {
                if  (response.has_permission)
                {
                    if (response.isconected) {
                        $("#btn-conectar-app").removeClass('btn-danger')
                        $("#btn-conectar-app").addClass('btn-success')
                        $("#btn-conectar-app").html('Conectado <i class="fa fa-mobile-phone"></i>')
                        //toastr.success("Pedidos App activados")
                        swal("Notificacion", "Pedidos App activado", "success");
                    } else {
                        $("#btn-conectar-app").removeClass('btn-success')
                        $("#btn-conectar-app").addClass('btn-danger')
                        $("#btn-conectar-app").html('Desconectado <i class="fa fa-mobile-phone"></i>')
                       // toastr.success("Pedidos App desactivados")
                        swal("Notificacion", "Pedidos App desactivados", "warning");
                    }
                } else {
                    //toastr.warning("Pedidos App no pudo ser activados")
                    swal("Notificacion", "No tienes permiso para realizar esta accion", "warning");

                }
            },
            error: function(error) {
                console.log(error.responseText)
            }
        })
    })

    $("#btn-conectar").click( e=> {
        let params = {}
        let button = e.target

        params.idnodo = $("#idnodo").val();

        if (typeof params.idnodo !== "undefined" && params.idnodo.trim().length == 0) { return }

        $.ajax({
            url:  getUrl('pedidos/setIdPrintNodo'),
            type: 'POST',
            dataType: 'JSON',
            data: params,
            success: function(response) {
                if  (response.isvalid)
                {
                    $("#conectar-printer-modal").modal("hide")
                    $("#btn-conectar-printer").removeClass('btn-danger')
                    $("#btn-conectar-printer").addClass('btn-success')
                    $("#btn-conectar-printer").html('Conectado <i class="fa fa-print"></i>')
                    toastr.success("Printer conectado")
                } else if (parseInt(response.response_server_print.f_key) != 1) {
                    toastr.success(response.response_server_print.f_mensaje,"Error code: " + response.response_server_print.f_key)
                }else {
                    toastr.success("hubo un error con la comunicacion","Error")
                }
            },
            error: function(error) {
                console.log(error.responseText)
            }
        })
    })

    $("#btn-cambiar-printer-config").click(e => {
        let params = {}
        let button = e.target

        params.idconfiguracion = $("#idprinterconfig").val()
        params.idproceso = idproceso

        $.ajax({
            url: getUrl('preferencia/cambiar_configuracion_procesos'),
            type: 'POST',
            dataType: 'JSON',
            data: params,
            success: function (response) {
                if (response.success && typeof response.configChanged !== "undefined") {
                    toastr.success("Configuracion ha cambiado")
                } else {
                    toastr.warning("Error al cambiar la configuracion")
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    })

})

/**
 * Metodo para formatear las fechas a ISO YYYY/MM/DD
 * @params fecha string
 * @return fecha string
 */
function formatDate(fecha) {
    let arrayFecha = fecha.trim().split("/");
    return arrayFecha[2] + "/" + arrayFecha[1] + "/" + arrayFecha[0];
}

function notificaciones() {
    document.addEventListener('DOMContentLoaded', function () {
        if (!Notification) {
            alert('Desktop notifications not available in your browser. Try Chromium.');
            return;
        }
        if (Notification.permission !== "granted")
            Notification.requestPermission();
    });
    window.setInterval(notifyMe, 60000*1);
}

function notifyMe() {
    $.ajax({
        type: "POST",
        url:window.location.protocol+"//"+ window.location.host + '/jq/get_notificaciones',
        //data: {idrecord:$('#tag_documento').attr('name')},
        success: function (data) {
            if (data!='[]')
            {
                var tupla = eval(data);
                for (var i =0 ;i< tupla.length;i++)
                {
                    mostrar('Nuevo Ticket',tupla[i].f_titulo,tupla[i].f_idticket,tupla[i].f_idrecord);
                }
            }
        }
    });
}


function mostrar_notify(titulo,descripcion) {
    if (Notification.permission !== "granted")
        Notification.requestPermission();
    else {
        var notification = new Notification(titulo, {
            icon: window.location.protocol+"//"+ window.location.host + '/jq/images/Logo_pequeno.png',
            body: descripcion,
        });
        // notification.onclick = function () {
        //     $.ajax({
        //         type: "POST",
        //         url:window.location.protocol+"//"+ window.location.host + '/jq/set_visualizado',
        //         data: {idrecord:idrecord},
        //         success: function (data) {
        //             window.open(window.location.protocol+"//"+ window.location.host + "/jq/asignar_tickets?idt="+id);
        //             notification.close();
        //         }
        //     });
        // };

    }
}

function mostrar_notificacion(titulo,descripcion) {
    if (Notification.permission !== "granted")
        Notification.requestPermission();
    else {
        var notification = new Notification(titulo, {
            icon: '/menube/assets/menube.png',
            body: descripcion,
        });
        notification.onclick = function () {
            //TODO
        };

    }
}

// $('#datepicker').datepicker({
//     uiLibrary: 'bootstrap4',
//     locale: 'es-es'
// });

/**
 * --------------------------------------------------------------------------
 * CoreUI Free Boostrap Admin Template (v2.0.0): main.js
 * Licensed under MIT (https://coreui.io/license)
 * --------------------------------------------------------------------------
 */

/* eslint-disable no-magic-numbers */
// Disable the on-canvas tooltip
// Chart.defaults.global.pointHitDetectionRadius = 1;
// Chart.defaults.global.tooltips.enabled = false;
// Chart.defaults.global.tooltips.mode = 'index';
// Chart.defaults.global.tooltips.position = 'nearest';
// Chart.defaults.global.tooltips.custom = CustomTooltips; // eslint-disable-next-line no-unused-vars



// var cardChart2 = new Chart($('#card-chart2'), {
//   type: 'line',
//   data: {
//     labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
//     datasets: [{
//       label: 'My First dataset',
//       backgroundColor: getStyle('--info'),
//       borderColor: 'rgba(255,255,255,.55)',
//       data: [1, 18, 9, 17, 34, 22, 11]
//     }]
//   },
//   options: {
//     maintainAspectRatio: false,
//     legend: {
//       display: false
//     },
//     scales: {
//       xAxes: [{
//         gridLines: {
//           color: 'transparent',
//           zeroLineColor: 'transparent'
//         },
//         ticks: {
//           fontSize: 2,
//           fontColor: 'transparent'
//         }
//       }],
//       yAxes: [{
//         display: false,
//         ticks: {
//           display: false,
//           min: -4,
//           max: 39
//         }
//       }]
//     },
//     elements: {
//       line: {
//         tension: 0.00001,
//         borderWidth: 1
//       },
//       point: {
//         radius: 4,
//         hitRadius: 10,
//         hoverRadius: 4
//       }
//     }
//   }
// }); // eslint-disable-next-line no-unused-vars
//
// var cardChart3 = new Chart($('#card-chart3'), {
//   type: 'line',
//   data: {
//     labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
//     datasets: [{
//       label: 'My First dataset',
//       backgroundColor: 'rgba(255,255,255,.2)',
//       borderColor: 'rgba(255,255,255,.55)',
//       data: [78, 81, 80, 45, 34, 12, 40]
//     }]
//   },
//   options: {
//     maintainAspectRatio: false,
//     legend: {
//       display: false
//     },
//     scales: {
//       xAxes: [{
//         display: false
//       }],
//       yAxes: [{
//         display: false
//       }]
//     },
//     elements: {
//       line: {
//         borderWidth: 2
//       },
//       point: {
//         radius: 0,
//         hitRadius: 10,
//         hoverRadius: 4
//       }
//     }
//   }
// }); // eslint-disable-next-line no-unused-vars
//
// var cardChart4 = new Chart($('#card-chart4'), {
//   type: 'bar',
//   data: {
//     labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December', 'January', 'February', 'March', 'April'],
//     datasets: [{
//       label: 'My First dataset',
//       backgroundColor: 'rgba(255,255,255,.2)',
//       borderColor: 'rgba(255,255,255,.55)',
//       data: [78, 81, 80, 45, 34, 12, 40, 85, 65, 23, 12, 98, 34, 84, 67, 82]
//     }]
//   },
//   options: {
//     maintainAspectRatio: false,
//     legend: {
//       display: false
//     },
//     scales: {
//       xAxes: [{
//         display: false,
//         barPercentage: 0.6
//       }],
//       yAxes: [{
//         display: false
//       }]
//     }
//   }
// }); // eslint-disable-next-line no-unused-vars
//
// var mainChart = new Chart($('#main-chart'), {
//   type: 'line',
//   data: {
//     labels: ['M', 'T', 'W', 'T', 'F', 'S', 'S', 'M', 'T', 'W', 'T', 'F', 'S', 'S', 'M', 'T', 'W', 'T', 'F', 'S', 'S', 'M', 'T', 'W', 'T', 'F', 'S', 'S'],
//     datasets: [{
//       label: 'My First dataset',
//       backgroundColor: hexToRgba(getStyle('--info'), 10),
//       borderColor: getStyle('--info'),
//       pointHoverBackgroundColor: '#fff',
//       borderWidth: 2,
//       data: [165, 180, 70, 69, 77, 57, 125, 165, 172, 91, 173, 138, 155, 89, 50, 161, 65, 163, 160, 103, 114, 185, 125, 196, 183, 64, 137, 95, 112, 175]
//     }, {
//       label: 'My Second dataset',
//       backgroundColor: 'transparent',
//       borderColor: getStyle('--success'),
//       pointHoverBackgroundColor: '#fff',
//       borderWidth: 2,
//       data: [92, 97, 80, 100, 86, 97, 83, 98, 87, 98, 93, 83, 87, 98, 96, 84, 91, 97, 88, 86, 94, 86, 95, 91, 98, 91, 92, 80, 83, 82]
//     }, {
//       label: 'My Third dataset',
//       backgroundColor: 'transparent',
//       borderColor: getStyle('--danger'),
//       pointHoverBackgroundColor: '#fff',
//       borderWidth: 1,
//       borderDash: [8, 5],
//       data: [65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65]
//     }]
//   },
//   options: {
//     maintainAspectRatio: false,
//     legend: {
//       display: false
//     },
//     scales: {
//       xAxes: [{
//         gridLines: {
//           drawOnChartArea: false
//         }
//       }],
//       yAxes: [{
//         ticks: {
//           beginAtZero: true,
//           maxTicksLimit: 5,
//           stepSize: Math.ceil(250 / 5),
//           max: 250
//         }
//       }]
//     },
//     elements: {
//       point: {
//         radius: 0,
//         hitRadius: 10,
//         hoverRadius: 4,
//         hoverBorderWidth: 3
//       }
//     }
//   }
// });
// var brandBoxChartLabels = ['January', 'February', 'March', 'April', 'May', 'June', 'July'];
// var brandBoxChartOptions = {
//   responsive: true,
//   maintainAspectRatio: false,
//   legend: {
//     display: false
//   },
//   scales: {
//     xAxes: [{
//       display: false
//     }],
//     yAxes: [{
//       display: false
//     }]
//   },
//   elements: {
//     point: {
//       radius: 0,
//       hitRadius: 10,
//       hoverRadius: 4,
//       hoverBorderWidth: 3
//     }
//   } // eslint-disable-next-line no-unused-vars
//
// };
// var brandBoxChart1 = new Chart($('#social-box-chart-1'), {
//   type: 'line',
//   data: {
//     labels: brandBoxChartLabels,
//     datasets: [{
//       label: 'My First dataset',
//       backgroundColor: 'rgba(255,255,255,.1)',
//       borderColor: 'rgba(255,255,255,.55)',
//       pointHoverBackgroundColor: '#fff',
//       borderWidth: 2,
//       data: [65, 59, 84, 84, 51, 55, 40]
//     }]
//   },
//   options: brandBoxChartOptions
// }); // eslint-disable-next-line no-unused-vars
//
// var brandBoxChart2 = new Chart($('#social-box-chart-2'), {
//   type: 'line',
//   data: {
//     labels: brandBoxChartLabels,
//     datasets: [{
//       label: 'My First dataset',
//       backgroundColor: 'rgba(255,255,255,.1)',
//       borderColor: 'rgba(255,255,255,.55)',
//       pointHoverBackgroundColor: '#fff',
//       borderWidth: 2,
//       data: [1, 13, 9, 17, 34, 41, 38]
//     }]
//   },
//   options: brandBoxChartOptions
// }); // eslint-disable-next-line no-unused-vars
//
// var brandBoxChart3 = new Chart($('#social-box-chart-3'), {
//   type: 'line',
//   data: {
//     labels: brandBoxChartLabels,
//     datasets: [{
//       label: 'My First dataset',
//       backgroundColor: 'rgba(255,255,255,.1)',
//       borderColor: 'rgba(255,255,255,.55)',
//       pointHoverBackgroundColor: '#fff',
//       borderWidth: 2,
//       data: [78, 81, 80, 45, 34, 12, 40]
//     }]
//   },
//   options: brandBoxChartOptions
// }); // eslint-disable-next-line no-unused-vars
//
// var brandBoxChart4 = new Chart($('#social-box-chart-4'), {
//   type: 'line',
//   data: {
//     labels: brandBoxChartLabels,
//     datasets: [{
//       label: 'My First dataset',
//       backgroundColor: 'rgba(255,255,255,.1)',
//       borderColor: 'rgba(255,255,255,.55)',
//       pointHoverBackgroundColor: '#fff',
//       borderWidth: 2,
//       data: [35, 23, 56, 22, 97, 23, 64]
//     }]
//   },
//   options: brandBoxChartOptions
// });
// //# sourceMappingURL=main.js.map