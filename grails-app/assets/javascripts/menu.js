$(document).ready(function(){

    $("#btnLogout").click(function(e){
        e.preventDefault()

        //alert("Click")

        $.ajax({
            url: window.location.origin + proyectPath + '/logout',
            type: 'POST',
            success: function(response) {
                if (response.errors != undefined)
                {
                    showErrorMessage(response.errors)
                }
                else if(response.success){
                    window.location.reload()
                }
            },
            error: function(error) {
                console.log(error.responseText)

            }
        })
    })

})