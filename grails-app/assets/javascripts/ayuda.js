$(document).ready(function(){
    initContent()
    function initContent() {
        $.ajax({
            url: getUrl('ayuda/getTutoriales'),
            type: 'POST',
            dataType: 'JSON',
            success: function(response) {
                if (typeof response.data !== "undefined" && response.data.length > 0)
                {
                    generateHTML(response.data)
                }
            },
            error: function (error) {
                console.log(error.responseText)
            }
        })
    }

    function  generateHTML(data) {
        let componente = ""

        for (let index in data)  {
            componente += `
                <div class="col-xl-6 col-12 col-md-4 col-sm-4 col-lg-6">
                    <div class="card text-white">
                        <div class="card-body p-0">
                            <div class="embed-responsive embed-responsive-16by9">
                                <iframe class="embed-responsive-item" src="${data[index].f_url}"
                                        allowfullscreen></iframe>
                            </div>
                        </div>
                        <div class="card-footer">
                            <h4 class="card-title text-info">${data[index].f_titulo}</h4>
                        </div>
                    </div>
                </div>
            `
        }
        $("#vide-container").append(componente)
    }
})