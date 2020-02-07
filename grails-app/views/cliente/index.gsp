<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>
    <div class="row justify-content-center">
        <div class="col-12 col-md-11 col-xl-10">
            <div class="card">
                <div class="card-header"><b>Cliente</b>
                </div>
                <div class="card-body" id="frmCliente">
                    %{--<form class="form-horizontal">--}%
                    <div class="row">
                        <div class="form-group col-12 col-sm-6 col-md-4 col-xl-4">
                            <label class="col-form-label">Nombre</label>
                            <div class="input-group input-group-sm">
                                <input class="form-control " id="nombre" name="nombre" type="text" placeholder="Nombre">
                                <input class="form-control " id="id" name="id" type="number" hidden>
                                <div class="input-group-append">
                                    <button class="btn btn-sm btn-outline-primary" data-toggle="modal" data-target="#cliente_modal" type="button" id="btnBuscar">Buscar</button>
                                </div>
                            </div>

                        </div>
                        <div class="col-12 col-sm-6 col-md-4 col-xl-4 form-group">
                            <label class="col-form-label">Apellido</label>
                            <input class="form-control" id="apellido" name="apellido" type="text" placeholder="Apellido">
                        </div>
                        <div class="col-12 col-sm-6 col-md-4 col-xl-4 form-group">
                            <label class="col-form-label">Fecha Nac.</label>
                            <div  id="datepickerNacimiento"></div>
                        </div>
                    </div>
                        %{--<div class="row">--}%
                            %{--<div class="form-group col-12 col-sm-4 col-md-4">--}%
                                %{--<label class="col-form-label">Codigo</label>--}%
                                %{--<input class="form-control" id="codigo" name="codigo" placeholder="Codigo" type="text">--}%
                            %{--</div>--}%
                            %{--<div class="form-group col-12 col-sm-4 col-md-4">--}%
                                %{--<label class="col-form-label">Compañia </label>--}%
                                %{--<select class="form-control" id="cbcompania" name="cbcompania">--}%

                                %{--</select>--}%
                            %{--</div>--}%
                        %{--</div>--}%

                        <div class="col-md-12 mb-4">
                            <ul class="nav nav-tabs" role="tablist">
                                <li class="nav-item">
                                    <a class="nav-link active" data-toggle="tab" id="btnDatosGeneralesTab" href="#datos_generales" role="tab" aria-controls="home">Datos Generales</a>
                                </li>
                                %{--<li class="nav-item">--}%
                                    %{--<a class="nav-link" data-toggle="tab" href="#datosUsuarioTab" role="tab" aria-controls="profile">Datos usuario</a>--}%
                                %{--</li>--}%
                                <li class="nav-item">
                                    <a class="nav-link" data-toggle="tab" id="contactoTab" href="#contacto" role="tab" aria-controls="messages">Contacto</a>
                                </li>
                            </ul>
                            <div class="tab-content">
                                <div class="tab-pane active" id="datos_generales" role="tabpanel">

                                    <div class="row">
                                        <div class="col-12 col-sm-6 col-md-6 col-xl-4 form-group">
                                            <label class="col-form-label">Cedula</label>
                                            <input class="form-control" id="cedula" name="cedula" type="text">
                                        </div>
                                        <div class="col-12 col-sm-6 col-md-6 col-xl-4 form-group">
                                            <label class="col-form-label">E-mail</label>
                                            <input class="form-control" id="email" name="email" placeholder="ejemplo@mail.com" type="email">
                                        </div>
                                        <div class="col-12 col-sm-3 col-md-3 col-xl-2 form-group">
                                            <label class=col-form-label">Lim. Credito</label>
                                            <input class="form-control" id="limite_credito" name="limite_credito" type="text" placeholder="0.00">
                                        </div>
                                        <div class="col-12 col-sm-3 col-md-3 col-xl-2  form-group">
                                            <label class=col-form-label">Dias de credito</label>
                                            <input class="form-control" id="dias_credito" name="dias_credito" type="text" placeholder="0">
                                        </div>

                                    </div>

                                    <div class="row">
                                        %{--<div class="col-12 col-sm-6 col-md-6 col-xl-4 form-group">--}%
                                            %{--<label class="col-form-label">Lim. Credito Comp</label>--}%
                                            %{--<input class="form-control" id="limite_credito_compania" name="limite_credito_compania" type="text" value="0.00" step="any">--}%
                                        %{--</div>--}%
                                        <div class="col-12 col-sm-6 col-md-6 col-xl-4 form-group">
                                            <label class="col-form-label">Balance</label>
                                            <input class="form-control" id="balance" name="balance" type="text" value="0.00" disabled >
                                        </div>
                                        <div class="col-12 col-sm-6 col-md-6 col-xl-4 form-group">
                                            <label class="col-form-label">Direccion</label>
                                            <textarea class="form-control" id="direccion" name="direccion" rows="3" placeholder="Direccion"></textarea>
                                        </div>
                                        <div class="col-md-5  col-xl-4 col-form-label">
                                            <div class="form-check form-check-inline mr-3 mb-3">
                                                <input class="form-check-input" id="hascr" name="hascr" type="checkbox">
                                                <label class="form-check-label" for="hascr">Tiene credito</label>
                                            </div>
                                            %{--<div class="form-check form-check-inline mr-3 mb-3">--}%
                                                %{--<input class="form-check-input" id="accesoweb" name="accesoweb" type="checkbox">--}%
                                                %{--<label class="form-check-label" for="accesoweb">Acceso web</label>--}%
                                            %{--</div>--}%
                                            %{--<div class="form-check form-check-inline mr-3 mb-3">--}%
                                                %{--<input class="form-check-input" id="isempresa" name="isempresa" type="checkbox">--}%
                                                %{--<label class="form-check-label" for="isempresa">Empresa</label>--}%
                                            %{--</div>--}%
                                        </div>
                                    </div>

                                    %{--<div class="row">--}%
                                        %{--<div class="col-12 col-sm-6 col-md-6 col-xl-4 form-group">--}%
                                            %{--<label class="col-form-label">Direccion</label>--}%
                                            %{--<textarea class="form-control" id="direccion" name="direccion" rows="3" placeholder="Direccion"></textarea>--}%
                                        %{--</div>--}%
                                    %{--</div>--}%
                                </div>
                                %{--<div class="tab-pane" id="datosUsuarioTab" role="tabpanel">--}%
                                    %{--<div class="row">--}%
                                        %{--<div class="col-12 col-sm-6 col-md-6 col-xl-4 form-group">--}%
                                            %{--<label class="col-form-label">Usuario</label>--}%
                                            %{--<input class="form-control" id="usuario" name="usuario" type="text" placeholder="Usuario">--}%
                                        %{--</div>--}%
                                        %{--<div class="col-12 col-sm-6 col-md-6 col-xl-4 form-group">--}%
                                            %{--<label class="col-form-label">Contraseña</label>--}%
                                            %{--<input class="form-control" id="password" name="password" type="password">--}%
                                        %{--</div>--}%
                                    %{--</div>--}%
                                %{--</div>--}%
                                <div class="tab-pane" id="contacto" role="tabpanel">
                                    <div class="row">
                                        <label class="col-12  col-md-2 col-xl-1 col-lg-1 col-form-label">Tipo </label>
                                        <div class="col-12 col-md-4 form-group">
                                            <select class="form-control" id="tipocontacto" name="tipocontacto">

                                            </select>
                                        </div>
                                        <div class="col-12 col-sm-5 col-md-4 form-group">
                                            <input class="form-control" id="txtcontacto" name="txtcontacto" type="text">
                                        </div>
                                    </div>
                                    <div class="row">

                                        <div class="col-12 col-lg-6 col-md-6">
                                            <div id="contacto_grid">

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                </div>
                <div class="card-footer text-right">
                    <button class="btn btn-sm btn-primary" id="guardar" type="submit">Guardar</button>
                    <button class="btn btn-sm btn-secondary" id="btnNuevo" type="submit">Nuevo</button>
                </div>
            </div>
        </div>
    </div>
<div class="modal fade" id="cliente_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-md" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">Buscar Cliente</h4>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-12 col-md-12">
                        <form id="frmBuscarCliente">
                            <div class="input-group mb-3">
                                <input type="text" name="filtro" id="filtro" class="form-control" placeholder="Buscar cliente" aria-label="Buscar Producto" aria-describedby="basic-addon2">
                                <div class="input-group-append">
                                    <button class="btn btn-info btn-sm"><i class="fa fa-search fa-lg"></i></button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 col-md-12">
                        <div id="cliente_grid">

                        </div>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cerrar</button>
            </div>
        </div>
        <!-- /.modal-content-->
    </div>
    <!-- /.modal-dialog-->
</div>
<asset:javascript src="validaciones.js"/>
<asset:javascript src="cliente.js"/>

    ${perfiles}
</body>
</html>
