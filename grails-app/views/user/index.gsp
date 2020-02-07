<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>
    <div class="row">
        <div class="col-md-5">
            <div class="card">
                <div class="card-header"><b>Lista de Usuarios</b>
                </div>
                <div class="card-body">
                    %{--<div class="row">--}%
                        %{--<div class="col-12 col-md-12">--}%
                            %{--<form id="frmBuscar">--}%
                                %{--<div class="input-group mb-3">--}%
                                    %{--<input --}%
                                            %{--type="text" --}%
                                            %{--name="filtro" --}%
                                            %{--id="filtro" --}%
                                            %{--class="form-control" --}%
                                            %{--placeholder="Buscar usuario" --}%
                                            %{--aria-label="Buscar Producto" --}%
                                            %{--aria-describedby="basic-addon2">--}%
                                    %{--<div class="input-group-append">--}%
                                        %{--<button class="btn btn-info btn-sm"><i class="fa fa-search fa-lg"></i></button>--}%
                                    %{--</div>--}%
                                %{--</div>--}%
                            %{--</form>--}%
                        %{--</div>--}%
                    %{--</div>--}%
                    <div class="row">
                        <div class="col-12 col-md-12">
                            <div id="tabla_usuarios">

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-md-6">
            <div class="card">
                <div class="card-header"><b>Usuario</b>
                </div>
                <div class="card-body">
                    <form id="frm" class="form-horizontal">
                        <div class="form-group row">
                            <label class="col-6 col-sm-2 col-form-label" for="nombre">Nombre</label>
                            <div class="col-6 col-sm-4">
                                <input class="form-control" id="nombre" name="nombre" type="text" placeholder="Nombre">
                                <input class="form-control" id="id" name="id" type="number" value="0" hidden placeholder="Nombre">
                            </div>
                            <label class="col-2 col-form-label" for="usuario">Usuario</label>
                            <div class="col-4">
                                <input class="form-control" id="usuario" name="usuario" type="text" placeholder="Usuario">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-2 col-form-label" for="apellido">Apellido</label>
                            <div class="col-4">
                                <input class="form-control" type="text" id="apellido" name="apellido" placeholder="Apellido">
                            </div>
                            <label class="col-3 col-form-label" for="contrasena">Contraseña</label>
                            <div class="col-3">
                                <input class="form-control" type="password" id="contrasena" name="contrasena" placeholder="Contraseña">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-2 col-form-label" for="email">E-mail</label>
                            <div class="col-4">
                                <input class="form-control" id="email" name="email" type="email" placeholder="E-mail">
                            </div>
                            <label class="col-2 col-form-label" for="telefono">Telefono</label>
                            <div class="col-4">
                                <input class="form-control" id="telefono" name="telefono" type="text" placeholder="Telefono">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-6 col-md-2 col-form-label" for="idioma">Idioma</label>
                            <div class="col-6 col-md-4">
                                <select class="form-control form-control-sm" id="idioma" name="idioma">
                                    <option value="0">--Seleccionar--</option>
                                    <g:each in="${lang}">
                                        <option value="${it.id}">${it.fDescripcion}</option>
                                    </g:each>
                                </select>
                            </div>
                            <label class="col-6 col-md-2 col-form-label" for="tipo_usuario">Tipo</label>
                            <div class="col-6 col-md-4">
                                <select class="form-control form-control-sm" id="tipo_usuario" name="tipo_usuario">
                                    <option value="0">--Seleccionar--</option>
                                    <g:each in="${tipos_usuarios}">
                                        <option value="${it.valor}">${it.label}</option>
                                    </g:each>
                                </select>
                            </div>
                        </div>
                        <div class="form-group row">
                            <hr class="col-12 col-md-10">
                        </div>
                        <div class="form-group row">
                            <g:each in="${permisos}">
                               <div class="col-12 col-md-4 col-xl-4">
                                   <div class="form-check form-check-inline mr-1">
                                       <g:if test="${it.valor}">
                                           <input id="${it.nombre}" checked  name="${it.nombre}" class="form-check-input" type="checkbox">
                                       </g:if>
                                       <g:else>
                                           <input id="${it.nombre}" name="${it.nombre}" class="form-check-input" type="checkbox">
                                       </g:else>
                                       <label for="${it.nombre}" class="form-check-label">${it.label}</label>
                                   </div>
                               </div>
                            </g:each>
                        </div>
                    </form>
                </div>
                <div class="card-footer text-right">
                    <button class="btn btn-sm btn-success" data-toggle="modal" data-target="#modal"  type="button">Permisos</button>
                    <button class="btn btn-sm btn-primary" id ="guardar" type="submit">Guardar</button>
                    <button class="btn btn-sm btn-secondary" id="btnNuevo" type="button">Nuevo</button>
                </div>
            </div>
        </div>
    </div>

<div class="modal fade" id="modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-md" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">Permisos del Menu</h4>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">

                <div class="row">
                    <div class="col-12 col-md-12">
                        <div id="tabla">

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
    ${perfiles}
    <asset:javascript src="usuario.js"/>
</body>
</html>
