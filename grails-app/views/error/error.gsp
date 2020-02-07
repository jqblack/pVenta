
<!doctype html>
<html>
<head>
    <title>${errorMsgTitle}</title>
    <asset:stylesheet src="node_modules/@coreui/icons/css/coreui-icons.min.css"/>
    <asset:stylesheet src="node_modules/flag-icon-css/css/flag-icon.min.css"/>
    <asset:stylesheet src="node_modules/font-awesome/css/font-awesome.min.css"/>
    <asset:stylesheet src="node_modules/simple-line-icons/css/simple-line-icons.css"/>
    <asset:stylesheet src="style.css"/>
    <asset:stylesheet src="pace.min.css"/>
</head>
<body class="app flex-row align-items-center">
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="clearfix">
                <h1 class="float-left display-3 mr-4">${errorCode}</h1>
                <h4 class="pt-3">${errorMsgTitle}</h4>
                <p class="text-muted">${errorMsg}</p>
            </div>
        </div>

    </div>
    <div class="row justify-content-center">
        <div class="col-md-4">
            <g:link controller="home" class="btn btn-warning btn-block" >Ir al inicio</g:link>
        </div>
    </div>
</div>
</body>
</html>
