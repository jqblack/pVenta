function isInValidStyle(element, mensaje) {

    removeStyle(element)

    let span = $("<span></span>")

    $(span).addClass('invalid-feedback');
    $(span).html(mensaje);

    $(element).addClass("is-invalid");
    $(element).parent().find("label.control-label").prepend('<i class="fa fa-times"></i> ');
    $(element).parent().find("label.control-label").addClass('text-danger');

    $(element).parent().append(span)

    $(element).focus();


}



function isValidStyle(element, mensaje) {

    removeStyle(element)


    let span = $("<span></span>")

    $(span).addClass('help-block');
    $(span).html(mensaje);

    //$(element).parent().addClass("has-success");

    $(element).addClass("is-valid");
    $(element).parent().find("label.control-label").prepend('<i class="fa fa-check"></i> ');
    $(element).parent().find("label.control-label").addClass('text-success');

    $(element).parent().append(span)

}

function removeAllStyle(elementContainer) {

    $(elementContainer).find('.is-invalid').removeClass("is-invalid");
    $(elementContainer).find('.is-valid').removeClass("is-valid");

    $(elementContainer).find("label.control-label").find("i.fa").remove();
    $(elementContainer).find("label.control-label").removeClass('text-success');
    $(elementContainer).find("label.control-label").removeClass('text-danger');
    $(elementContainer).find("span.invalid-feedback").remove();

}

function removeStyle(element) {

    $(element).removeClass("is-invalid");
    $(element).removeClass("is-valid");
    $(element).parent().find("label.control-label").find("i.fa").remove();
    $(element).parent().find("label.control-label").removeClass('text-success');
    $(element).parent().find("label.control-label").removeClass('text-danger');

    $(element).parent().find("span.invalid-feedback").remove();

}