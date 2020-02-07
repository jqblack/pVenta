
<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>
    <div class="row ">
        <div class="col-md-6 col-xl-6 col-12">
            <div class="card">
                <div class="card-header"><b>Camarero</b>
                </div>
                <div class="card-body">
                    <div class="row">
                        <div class="col-12 col-md-12">
                            <form id="frmBuscarCamareros">
                                <div class="input-group mb-3">
                                    <input type="text" name="filtro" id="filtro" class="form-control" placeholder="Buscar camarero" aria-label="Buscar Producto" aria-describedby="basic-addon2">
                                    <div class="input-group-append">
                                        <button class="btn btn-info btn-sm"><i class="fa fa-search fa-lg"></i></button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-12 col-md-12">
                            <div id="camarero_grid">

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-md-6">
            <div class="card">
                <div class="card-header"><b>Datos camarero</b>
                </div>
                <div class="card-body" id="frmCamarero">
                    %{--<form class="form-horizontal">--}%
                    <div class="form-group row">
                        <label class="col-12 col-sm-4 col-md-2 col-form-label">Nombre</label>
                        <div class="col-12 col-sm-5 col-md-4 col-xl-4">
                            <div class="form-group form-group-sm">
                                <input class="form-control " id="nombre" name="nombre" type="text" placeholder="Nombre">
                                <input class="form-control " id="id" name="id" type="number" value="0" hidden>
                            </div>

                        </div>
                        <label class="col-12 col-sm-4 col-md-2 col-form-label">Apellido</label>
                        <div class="col-12 col-sm-5 col-md-4 col-xl-4 form-group form-group-sm">
                            <input class="form-control" id="apellido" name="apellido" type="text" placeholder="Apellido">
                        </div>

                    </div>
                    <div class="form-group row">
                        <label class="col-12 col-sm-2 col-md-2 col-form-label">Cedula</label>
                        <div class="col-12 col-sm-5 col-md-4 col-xl-4 form-group form-group-sm">
                            <input class="form-control" id="cedula" name="cedula" type="text">
                        </div>
                        <label class="col-12 col-sm-2 col-md-2 col-form-label">
                            Sueldo
                        </label>
                        <div class="col-12 col-sm-5 col-md-4 col-xl-4 form-group form-group-sm">
                            <input class="form-control" id="sueldo" name="sueldo" type="number" step="any" value="0.00">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-12 col-sm-6 col-md-2 col-form-label">
                            Area
                        </label>
                        <div class="col-12 col-sm-6 col-md-4 col-xl-4 form-group form-group-sm">
                            <select class="form-control" id="cbarea" name="cbarea">

                            </select>
                        </div>
                        <div class="col-12 col-sm-6 col-md-6 col-xl-6" >
                            <div class="form-check form-check-inline mr-3 mb-3">
                                <input class="form-check-input" id="activo" name="activo" type="checkbox">
                                <label class="form-check-label" for="activo">Activo</label>
                            </div>

                            <div class="form-check form-check-inline mr-3 mb-3">
                                <input class="form-check-input" id="camareroactivo" name="camareroactivo" type="checkbox">
                                <label class="form-check-label" for="camareroactivo">Camarero Activo</label>
                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-12 col-sm-4 col-md-4 col-xl-3 col-form-label">Direccion</label>
                        <div class="col-12 col-sm-8 col-md-8 col-xl-9 form-group form-group-sm">
                            <textarea class="form-control" id="direccion" name="direccion" row="3"></textarea>
                        </div>
                    </div>

                    %{--</form>--}%
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

            </div>
            <div class="modal-footer">
                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cerrar</button>
            </div>
        </div>
        <!-- /.modal-content-->
    </div>
    <!-- /.modal-dialog-->
</div>
<asset:javascript src="camarero.js"/>

    ${perfiles}
</body>
</html>
