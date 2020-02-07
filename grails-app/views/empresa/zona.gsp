
<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>
<div class="row ">
    %{--<div class="col-md-6 col-xl-4 col-12">--}%
        %{--<div class="card">--}%
            %{--<div class="card-body">--}%
                %{--<div class="row">--}%
                    %{--<div class="col-12 col-md-12">--}%
                        %{--<div id="tabla">--}%

                        %{--</div>--}%
                    %{--</div>--}%
                %{--</div>--}%
            %{--</div>--}%
        %{--</div>--}%
    %{--</div>--}%
    <div class="col-md-6">
        <div class="card">
            <div class="card-body" id="frm">
                <div class="row">
                    <div class="col-12 col-md-6 col-xl-6">
                        <div class="form-group">
                            <label class="control-label">Zona</label>
                            <input type="text" class="form-control" name="f_nombre_zona" id="f_nombre_zona">
                            <input type="text" class="form-control" name="id" id="id" value="0" hidden>
                        </div>
                    </div>
                    <div class="col-12 col-md-4 col-xl-6">
                        <div class="form-group">
                            <label class="control-label">Sector</label>
                            <div class="input-group mb-3">
                                <input type="email" class="form-control" name="f_sector" id="f_sector">
                                <div class="input-group-append">
                                    <button class="btn btn-primary" id="btnadd"> <i class="fa fa-plus"></i></button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 col-md-4 col-xl-4">
                        <div id="tabla">

                        </div>
                    </div>
                    <div class="col-12 col-md-8 col-xl-8">
                       <div id="tabla_sectores">

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

            </div>
            <div class="modal-footer">
                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cerrar</button>
            </div>
        </div>
        <!-- /.modal-content-->
    </div>
    <!-- /.modal-dialog-->
</div>
<asset:javascript src="zona.js"/>

${perfiles}
</body>
</html>
