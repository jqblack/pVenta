<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
       Login
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    %{--<asset:link rel="icon" href="favicon.ico" type="image/x-ico" />--}%

    %{--<asset:stylesheet src="application.css"/>--}%
    <asset:stylesheet src="node_modules/@coreui/icons/css/coreui-icons.min.css"/>
    <asset:stylesheet src="node_modules/flag-icon-css/css/flag-icon.min.css"/>
    <asset:stylesheet src="node_modules/font-awesome/css/font-awesome.min.css"/>
    <asset:stylesheet src="node_modules/simple-line-icons/css/simple-line-icons.css"/>
    <asset:stylesheet src="node_modules/toastr/build/toastr.css"/>
    <asset:stylesheet src="jquery.numpad.css"/>
    <asset:stylesheet src="node_modules/toastr/build/toastr.css"/>
    <asset:stylesheet src="style.css"/>
    <asset:stylesheet src="pace.min.css"/>


</head>

<body class="app flex-row">
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-8">
            <div class="card-group mt-4">
                <div class="card p-4">
                    <div class="card-body">
                        <form id="FormLogin" method="POST">
                            <h1>Login</h1>
                            <p class="text-muted">Sign In to your account</p>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">
                                        <i class="fa fa-building"></i>
                                    </span>
                                </div>
                                <input class="form-control" autofocus type="text" id="bussines" name="bussines" placeholder="Bussines">
                            </div>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">
                                        <i class="icon-user"></i>
                                    </span>
                                </div>
                                <input class="form-control" type="text" id="username" name="username" placeholder="Username">
                            </div>
                            <div class="input-group mb-4">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">
                                        <i class="icon-lock"></i>
                                    </span>
                                </div>
                                <input class="form-control" type="password" id="password" name="password" placeholder="Password">
                            </div>
                            <div class="row">
                                <div class="col-4 col-md-4">
                                    <button class="btn btn-primary px-4" id="btnLogin" type="submit">Login</button>
                                </div>
                                <div class="col-4 col-md-4">
                                    <button class="btn btn-secondary px-4" id="showKeyboard"><i class="fa fa-keyboard-o"></i></i></button>
                                </div>
                                <div class="col-4 col-md-4 text-right">
                                    %{--<button class="btn btn-link px-0" type="button">Forgot password?</button>--}%
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="card text-white py-5 d-md-down-none" style="width:44%; background-position: center; background-size: 95% auto; background-repeat: no-repeat; background-origin: content-box;  background-image: url('/menube/assets/menube.png');">
                    <div class="card-body justify-content-center d-flex align-items-end">
                        <div class="">
                            <span class="text-dark"><b>Powered by</b></span>
                            <a href="http://www.jqmicro.com/jqmicrosistemas.com/">JQmicrosistemas</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row justify-content-center">
        <div class="col-md-8">
            <div class="card fade" id="numpad" >
                <div class="card-body bg-gray-100" >
                    <div class="row justify-content-center">
                        <div class="col-2 col-md-1">
                            <button class="btn btn-primary btn-lg mb-1">1</button>
                        </div>
                        <div class="col-2 col-md-1">
                            <button class="btn btn-primary btn-lg">2</button>
                        </div>
                        <div class="col-2 col-md-1">
                            <button class="btn btn-primary btn-lg">3</button>
                        </div>
                    </div>
                    <div class="row justify-content-center">
                        <div class="col-2 col-md-1">
                            <button class="btn btn-primary btn-lg mb-1">4</button>
                        </div>
                        <div class=" col-2 col-md-1">
                            <button class="btn btn-primary btn-lg">5</button>
                        </div>
                        <div class="col-2 col-md-1">
                            <button class="btn btn-primary btn-lg">6</button>
                        </div>
                    </div>
                    <div class="row justify-content-center">
                        <div class="col-2 col-md-1">
                            <button class="btn btn-primary btn-lg mb-1">7</button>
                        </div>
                        <div class="col-2 col-md-1">
                            <button class="btn btn-primary btn-lg">8</button>
                        </div>
                        <div class="col-2 col-md-1">
                            <button class="btn btn-primary btn-lg">9</button>
                        </div>
                    </div>
                    <div class="row justify-content-center">
                        <div class="col-4 col-md-2">
                            <button id="btnDelete" class="btn btn-secondary mb-1 btn-lg btn-block"><b><i class="fa fa-chevron-left"></i></b></button>
                        </div>
                        <div class="col-2 col-md-1">
                            <button class="btn btn-primary btn-lg">0</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>



<!-- CoreUI and necessary plugins-->
<asset:javascript src="node_modules/jquery/dist/jquery.min.js"/>
<asset:javascript src="node_modules/popper.js/dist/umd/popper.min.js"/>
<asset:javascript src="node_modules/bootstrap/dist/js/bootstrap.min.js"/>
<asset:javascript src="node_modules/pace-progress/pace.min.js"/>
<asset:javascript src="node_modules/perfect-scrollbar/dist/perfect-scrollbar.min.js"/>
<asset:javascript src="node_modules/@coreui/coreui/dist/js/coreui.min.js"/>
<asset:javascript src="node_modules/toastr/toastr.js"/>
<asset:javascript src="jquery.numpad.js"/>


<!-- Plugins and scripts required by this view-->
%{--<asset:javascript src="node_modules/chart.js/dist/Chart.min.js"/>--}%
%{--<asset:javascript src="node_modules/@coreui/coreui-plugin-chartjs-custom-tooltips/dist/js/custom-tooltips.min.js"/>--}%
<asset:javascript src="main.js"/>
<asset:javascript src="FrmLogin.js"/>

</body>
</html>
