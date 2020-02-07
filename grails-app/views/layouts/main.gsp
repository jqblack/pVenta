<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    %{--<asset:link rel="icon" href="favicon.ico" type="image/x-ico" />--}%

    %{--<asset:stylesheet src="application.css"/>--}%
    <asset:stylesheet src="node_modules/@coreui/icons/css/coreui-icons.min.css"/>
    <asset:stylesheet src="node_modules/flag-icon-css/css/flag-icon.min.css"/>
    <asset:stylesheet src="node_modules/font-awesome/css/font-awesome.min.css"/>
    <asset:stylesheet src="node_modules/simple-line-icons/css/simple-line-icons.css"/>
    <asset:stylesheet src="style.css"/>
    <asset:stylesheet src="pace.min.css"/>
    <asset:stylesheet src="node_modules/toastr/build/toastr.css"/>
    <asset:stylesheet src="node_modules/gijgo/css/gijgo.css"/>
    <asset:stylesheet src="node_modules/jqwidgets-framework/jqwidgets/styles/jqx.base.css"/>
    <asset:stylesheet src="node_modules/jqwidgets-framework/jqwidgets/styles/jqx.bootstrap.css"/>
    <asset:stylesheet src="node_modules/jqwidgets-framework/jqwidgets/styles/jqx.metro.css"/>

    <g:layoutHead/>
</head>

<body class="app header-fixed sidebar-fixed aside-menu-fixed sidebar-lg-show">
<asset:javascript src="node_modules/jquery/dist/jquery.min.js"/>
<asset:javascript src="node_modules/popper.js/dist/umd/popper.min.js"/>
<asset:javascript src="node_modules/bootstrap/dist/js/bootstrap.min.js"/>
<asset:javascript src="node_modules/pace-progress/pace.min.js"/>
<asset:javascript src="node_modules/perfect-scrollbar/dist/perfect-scrollbar.min.js"/>
<asset:javascript src="node_modules/@coreui/coreui/dist/js/coreui.min.js"/>
<asset:javascript src="node_modules/toastr/toastr.js"/>


<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxcore.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxdata.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxdraw.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxchart.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxbuttons.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxscrollbar.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxlistbox.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxdropdownlist.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxmenu.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxgrid.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxdatatable.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxtreegrid.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxgrid.filter.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxgrid.sort.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxgrid.edit.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxgrid.selection.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxgrid.aggregatest.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxgrid.export.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxcalendar.js"/>

<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxdatetimeinput.js"/>


<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxgrid.pager.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxgrid.grouping.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxnumberinput.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/scripts/demos.js"/>

<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/globalization/globalize.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxscrollbar.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxgrid.columnsresize.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxlistbox.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxdropdownlist.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxdropdownbutton.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxcolorpicker.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxwindow.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxtooltip.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxinput.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxcheckbox.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxcombobox.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxnotification.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxeditor.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxfileupload.js"/>
<asset:javascript src="node_modules/jqwidgets-framework/jqwidgets/jqxgrid.aggregates.js"/>

%{--<asset:javascript src="node_modules/gijgo/js/gijgo.js"/>--}%
%{--<asset:javascript src="node_modules/gijgo/js/messages/messages.es-es.js"/>--}%

<!-- Plugins and scripts required by this view-->
%{--<asset:javascript src="node_modules/chart.js/dist/Chart.min.js"/>--}%
%{--<asset:javascript src="node_modules/@coreui/coreui-plugin-chartjs-custom-tooltips/dist/js/custom-tooltips.min.js"/>--}%

<asset:javascript src="node_modules/chart.js/dist/Chart.min.js"/>
<asset:javascript src="node_modules/@coreui/coreui-plugin-chartjs-custom-tooltips/dist/js/custom-tooltips.min.js"/>
<asset:javascript src="main.js"/>
<asset:javascript src="menu.js"/>


<asset:stylesheet src="sweetalert2.min.css"/>
<asset:javascript src="sweetalert/sweetalert2.all.min.js"/>
%{--<asset:javascript src="products.js"/>--}%
<header class="app-header navbar">
    <button class="navbar-toggler sidebar-toggler d-lg-none mr-auto" type="button" data-toggle="sidebar-show">
        <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="#">
        %{--<img class="navbar-brand-full" src="img/brand/logo.svg" width="89" height="25" alt="CoreUI Logo">--}%
        %{--<img class="navbar-brand-minimized" src="img/brand/sygnet.svg" width="30" height="30" alt="CoreUI Logo">--}%
%{--        <g:img class="navbar-brand-full" width="89" height="25" dir="images" alt="admin@bootstrapmaster.com"--}%
%{--               file="menube.png"/>--}%
        <asset:image src="menube.png"  class="navbar-brand-full" width="89" height="25" dir="images" alt="admin@bootstrapmaster.com"/>
    </a>
    <button class="navbar-toggler sidebar-toggler d-md-down-none" type="button" data-toggle="sidebar-lg-show">
        <span class="navbar-toggler-icon"></span>
    </button>
    <ul class="nav navbar-nav d-md-down-none mr-auto">
        <li class="nav-item px-3">
            <a class="nav-link" href="<g:createLink controller="home" action="index"/>">Home</a>
        </li>
    </ul>

    <ul class="nav navbar-nav mr-4">
        <li class="nav-item">
            <button type="button" data-toggle="tooltip" title="Activar los pedidos que llegan desde la APP"
                    class="btn btn-${session.empresa.fRecibirPedidosApp ? 'success' : 'danger'}" id="btn-conectar-app">
                ${session.empresa.fRecibirPedidosApp ? 'Conectado' : 'Desconectado'}  <i class="fa fa-mobile-phone"></i>
            </button>
            <button type="button" data-toggle="tooltip" title="Conectar la impresora"
                    class="btn btn-${session.last_status_printer.f_key != 1 ? 'danger' : 'success'}"
                    id="btn-conectar-printer">
                ${session.last_status_printer.f_key != 1 ? 'Desconectado' : 'Conectado'}  <i class="fa fa-print"></i>
            </button>
        </li>
    </ul>
    <ul class="nav navbar-nav mr-4">
        <li class="nav-item">
            <a class="nav-link" href="#" id="btnLogout">
                Logout <i class="fa fa-power-off"></i>
            </a>
        </li>
    </ul>
</header>

<div class="app-body">
    <div class="sidebar">
        <nav class="sidebar-nav">
            <ul class="nav" id="menu">
                %{--<li class="nav-item">--}%
                %{--<a class="nav-link" href="colors.html">--}%
                %{--<i class="nav-icon icon-home"></i> Home</a>--}%
                %{--</li>--}%
                ${raw(session.menu)}

            </ul>
        </nav>
        <button class="sidebar-minimizer brand-minimizer" type="button"></button>
    </div>
    <main class="main">
        <!-- Breadcrumb-->
        %{--<ol class="breadcrumb">--}%
        %{--<li class="breadcrumb-item">--}%
        %{--TODO--}%
        %{--<a href="./${controllerName}">${controllerName.capitalize()}</a>--}%
        %{--</li>--}%
        %{--<li class="breadcrumb-item active">--}%
        %{--TODO--}%
        %{--${actionName == "index" ? "" : actionName.capitalize().replace("-", " ")}--}%
        %{--</li>--}%
        %{--<!-- Breadcrumb Menu-->--}%
        %{--</ol>--}%
        <div class="container-fluid pt-2">
            <div class="animated fadeIn">
                <g:layoutBody/>
            </div>
        </div>
    </main>

</div>

<div class="modal fade" id="conectar-printer-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <div class="row">
                    <div class="col-12 col-md-12">
                        <label class="control-label">Codigo</label>

                        <div class="input-group mb-2">
                            <input type="text" class="form-control" name="idnodo" id="idnodo" placeholder="Codigo"
                                   aria-label="Codigo" aria-describedby="basic-addon2">

                            <div class="input-group-append">
                                <button class="btn btn-outline-success" type="button"
                                        id="btn-conectar">Conectar</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-md-12">
                        <label class="control-label">Configuracion</label>
                        <div class="input-group">
                            <select id="idprinterconfig" class="form-control">

                            </select>
                            <div class="input-group-append">
                                <button
                                        class="btn btn-outline-success"
                                        type="button"
                                        id="btn-cambiar-printer-config">Guardar</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button class="btn btn-secondary" data-dismiss="modal" aria-label="Close">Cerrar</button>
            </div>
        </div>
        <!-- /.modal-content-->
    </div>
    <!-- /.modal-dialog-->
</div>


%{--// <asset:javascript src="application.js"/>--}%
<footer class="app-footer">
    <div>
        <span>&copy; 2018 <a href="http://www.jqmicro.com/jqmicrosistemas.com/">JQmicrosistemas</a></span>
    </div>

    <div class="ml-auto">
        <span>Powered by</span>
        <a href="http://www.jqmicro.com/jqmicrosistemas.com/">JQmicrosistemas</a>
    </div>
</footer>
<!-- CoreUI and necessary plugins-->
</body>
</html>
