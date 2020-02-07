
$(document).ready(function(){




    $("input[type='text'], input[type='password']").focus(function(e) {
        //console.log(e.target)
        $(".selected").removeClass("selected")
        $(e.target).addClass("selected")
    })

    $("#numpad").on('click', 'button', function(e){

        if (this.id == "btnDelete"){
            var value = $(".selected").eq(0).val()
            $(".selected").eq(0).val(value.substring(0, value.length - 1))
        }
        else{
            var value = $(".selected").eq(0).val() + $(this).text()
            $(".selected").eq(0).val(value)
        }
    })


    $("#showKeyboard").click(function (e) {
        e.preventDefault()

        $("#numpad").addClass("show")

    })

    $("#FormLogin").submit(function(e){
        e.preventDefault()

        var form = e.target;
        var data =  $(form).serialize()

        $.ajax({
            url: window.location + '/authenticate',
            type: 'POST',
            data: data,
            beforeSend: function() {
                let message = ' <i class="fa fa-circle-o-notch fa-spin"></i>' ;
                $("#btnLogin").html(message);
                $("#btnLogin").attr("disabled", true);

                showLoading();
            },
            complete: function() {
                $("#btnLogin").html("Login");
                $("#btnLogin").attr("disabled", false);
                closeLoading();
            },
            success: function(response) {
                if (response.errors != undefined)
                {

                    showErrorMessage(response.errors)

                }
                else if(response.success){
                   window.location.href = window.location + '/home'
                }
            },
            error: function(error) {
                console.log(error.responseText)

            }
        })

    })



})