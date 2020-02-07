$(document).ready(function(){

    $('[data-toggle="tooltip"]').tooltip();
    init_chart()

    function init_chart() {
        $.ajax({
            url: window.location + '/getDataToChart',
            type: 'POST',
            dataType: 'JSON',
            success: function(response) {

                if (typeof response.ventas !== "undefined" && response.ventas.length > 0)
                {
                    config_chart('line',"canvas-2",response.ventas, "rgb(178, 238, 209)","rgb(25, 204, 118)")
                    total_chart('totalVentas','ventasTotales', response.montoVentasAnoEnCurso)
                    config_chart("bar","ventas-delivery",response.ventasDelivery, "rgb(4, 125, 255)", "rgb(4, 125, 255)")
                    total_chart('ventasDelivery','totalVentasDelivery', response.ventasDelivery)
                    config_chart("line","montoVentasAnoEnCurso",response.montoVentasAnoEnCurso, "rgb(229, 249, 225)", "rgb(4, 125, 255)")
                }
                else{
                    //toastr.error("Fallo al cargar la tabla")
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    }


function config_chart(type,chart,data,background, border)
{
    let meses = []
    let datos = []
    let dataset= []




    data.forEach(function(item, i){
        //let value = item
        //meses.push(item.mes)
       if (isNaN(item.mes)) {
           meses.push(item.mes)
       } else {
           meses.push("Semana " + (i + 1))
       }
    })

   // meses.push('Septiembre')

    data.forEach(function (item) {
        datos.push(parseFloat(item.sum_ventas))
        //datos.push(numericFormat(item.sum_ventas))
       //  datos.push(new Intl.NumberFormat().format(item.sum_ventas))
       // // new Intl.NumberFormat().format(total)
    })

    //datos.push(7)

 //   pointBackgroundColor: 'rgba(220, 220, 220, 1)',
//             pointBorderColor: '#fff',

    //console.log(datos)

    var barChart = new Chart($("#"+ chart), {
        type: type,
        data: {
            labels: meses,
            datasets: [{
                label: 'Ventas',
                backgroundColor: background,
                borderColor: border,
                highlightFill: border,
                highlightStroke: 'rgba(151, 187, 205, 1)',
                pointBackgroundColor: 'rgba(220, 220, 220, 1)',
                pointBorderColor: '#fff',
                data: datos
            }]
        },
        options: {
            responsive: true
        }
    }); // eslint-disable-next-line no-unused-vars



}

    function total_chart(chart,totalid, data) {

        let meses = []
        let datos = []
        let dataset= []
        let total = 0


        data.forEach(function(item){
            meses.push(item.mes)
        })

        //meses.push('Septiembre')

        data.forEach(function (item) {
            datos.push(parseFloat(item.count_ventas))
            total += parseFloat(item.sum_ventas)
        })

        //datos.push(7)

        //new Intl.NumberFormat().format(number)
        $("#"+totalid).text(new Intl.NumberFormat().format(total));


        var totalVentas = new Chart($('#' + chart), {
            type: 'line',
            data: {
                labels: meses,
                datasets: [{
                    label: 'My First dataset',
                    backgroundColor: getStyle('--primary'),
                    borderColor: 'rgba(255,255,255,.55)',
                    data: datos
                }]
            },
            options: {
                maintainAspectRatio: false,
                legend: {
                    display: false
                },
                scales: {
                    xAxes: [{
                        gridLines: {
                            color: 'transparent',
                            zeroLineColor: 'transparent'
                        },
                        ticks: {
                            fontSize: 2,
                            fontColor: 'transparent'
                        }
                    }],
                    yAxes: [{
                        display: false,
                        ticks: {
                            display: false,
                            min: 35,
                            max: 89
                        }
                    }]
                },
                elements: {
                    line: {
                        borderWidth: 1
                    },
                    point: {
                        radius: 4,
                        hitRadius: 10,
                        hoverRadius: 4
                    }
                }
            }
        });
    }
})