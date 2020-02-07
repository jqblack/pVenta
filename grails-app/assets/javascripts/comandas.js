$(document).ready(function(){
    var comandas =[]
    var comandaEnPantalla = []
    // pabel.filter(function(e) { return e !== 3 })

    initContent()
    //setInterval(initContent, (1000 * 60) * 5)
    setInterval(initContent, 10000)

    function initContent() {
       $.ajax({
            url: getUrl('comandas/lista'),
            type: 'POST',
            data: {data: JSON.stringify(comandaEnPantalla)},
            dataType: 'JSON',
            success: function(response) {

                if (typeof response.data !== "undefined" && response.data.length > 0)
                {

                    //$("#content").html("")
                    comandas = response.data
                    comandas.map( item => {
                        comandaEnPantalla.push(item.factura_id)
                    });

                    generateHTML(response.data)
                } else if (typeof response.data !== "undefined" && response.data.length == 0 &&  String($("#content").html())==='') {

                    $("#content").html(`
                        <div class="col-12">
                           <div class="alert alert-warning alert-dismissible fade show text-center" role="alert">
                              <h2>No existe ninguna comanda en estos momentos.</h2>
                              <button class="close" type="button" data-dismiss="alert" aria-label="Close">
                                <span aria-hidden="true">×</span>
                              </button>
                            </div>                     
                        </div>
                    `)
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    }

    $(document).on("click","#btnEntregar", (e) => {
        let inputs = []

        let title = parseInt(e.target.title);
        inputs = getProductsParaEntregar(parseInt(e.target.title))

        // let padre = ""
        // padre = $(e.target).parent().parent().parent().parent()
        // $( padre ).fadeOut( "slow", function() {
        //     removeHTLMComanda(padre)
        // });
        //
        // return;
        // $("#"+e.target.name).remove();

        $.ajax({
            url: getUrl('comandas/entregar'),
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
                    let padre = "";
                    padre = $(e.target).parent().parent().parent().parent();
                    padre = e.target.name;
                    removeHTLMComanda(padre);
                    comandaEnPantalla = comandaEnPantalla.filter(function(e) { return e !== title});
                    // $( padre ).fadeOut( "fast", function() {
                    //     removeHTLMComanda(padre)
                    // });
                    $("#btnNuevo").trigger("click");

                }
            },
            error: function(error) {
                console.log(error.responseText)
            }
        })
    });

    $(document).on("click","#btnEntregarProducto", (e) => {
        let detalle_id = 0

        detalle_id = parseInt(e.target.title)
        padre = $(e.target).parent().parent()
        $( padre ).addClass( "line-trought-text");
    })

    function removeHTLMComanda(padre) {
        $("#"+padre).remove();
        // $(padre).remove()
    }

    function getProductsParaEntregar(factura_id) {
        let productos = []
        for (let index in comandas) {
            if (parseInt(comandas[index].factura_id) === factura_id) {
                return comandas[index].productos
            }
        }
        return productos
    }

    function  generateHTML(data) {
        let componente = "";

        for (let index in data)  {
             let identificador = btoa(new Date()+data[index].factura_id).replace("==","");
            componente += `
                <div id="${identificador}" class="col-sm-6 col-lg-3 col-12 col-xl-3">
                    <div class="card">
                        <div class="card-body">
                            <div class="h3 text-muted text-left mb-2">
                               
                               # ${data[index].orden}
                            </div>
                            <div class="text-value"></div>
                            <div>Mesa: ${data[index].f_mesa || 'Delivery'}</div>
                            <div class="progress progress-xs my-2">
                                <div class="progress-bar bg-primary" role="progressbar" style="width: 100%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
                            </div>
                            <ul class="list-group list-group-flush">
                                ${getProductoHTLM(data[index].productos, data[index].componentes)}
                             </ul>
                            <button name="${identificador}"  class="btn btn-block btn-link text-success btn-lg d-flex justify-content-between align-items-center" id="btnEntregar" title="${data[index].factura_id}">Entregar <i class="fa fa-check"></i></button>
                        </div>
                    </div>
                </div>
            `
        }
        $("#content").append(componente)
        // $("#content").html(componente)
    }

    function getProductoHTLM(productos, componentes) {
        let lista = ""

        for (let index in productos)
        {
            //console.log(productos[index])
            lista += ` 
            <li class="list-group-item " >
                
                <div class="d-flex justify-content-between align-items-center w-100">
                <span class="badge badge-primary badge-pill">${productos[index].f_cantidad}</span> 
                    ${productos[index].f_descripcion}
                    <button class="btn btn-link text-info" id="btnEntregarProducto" title="${productos[index].detalle_id}"> <i title="${productos[index].detalle_id}" class="fa fa-chevron-circle-right fa-2x"></i></button>

                </div>`

            if (hasComponentes(productos[index].detalle_id, componentes)) {
                lista += `
                    <ul class="list-group list-group-flush "> Componentes
                            ${getComponenteHTLM(componentes)}
                    </ul> `
            }
            lista += `</li>`




            

        }
        return lista
    }

    function getComponenteHTLM(componentes) {
        let lista = ""

        for (let index in componentes)
        {
            lista += ` 
            <li class="list-group-item d-flex justify-content-between align-items-center" style="font-size: 0.675rem;">${componentes[index].f_descripcion}
                <span class="badge badge-primary badge-pill">${componentes[index].f_cantidad}</span>
            </li>
             `
        }
        return lista
    }

    function hasComponentes(idDetalle, componentes) {

        for (let index in componentes)
        {
            return parseInt(componentes[index].detalle_id) === parseInt(idDetalle)
        }
    }
})
