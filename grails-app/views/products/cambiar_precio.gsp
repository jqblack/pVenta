
<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>
<div class="row">
    <div class="col-md-6 col-12 col-xl-6 col-sm-6">
        <div class="card">
            <div class="card-header"><b>Cambiar precio</b>
            </div>
            <div class="card-body" id="frmProducto">
                <div class="input-group input-group-sm mb-2">
                    <div class="input-group-prepend">
                        <label class="input-group-text">Referencia</label>
                        <input type="number" id="id" name="id" hidden value="0">
                    </div>
                    <input type="text" class="form-control" name="referencia" id="referencia" placeholder="Referencia" aria-label="Recipient's username" aria-describedby="button-addon2">
                    <div class="input-group-append">
                        <button class="btn btn-outline-primary btn-group-sm" type="button" id="btnBuscar">Buscar</button>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-12">
                        <label class="col-form-label">Descripcion</label>
                        <input class="form-control" id="descripcion" name="descripcion" type="text" placeholder="Descripcion">
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-12">
                        <label class="col-form-label">Categoria</label>
                        <input class="form-control" id="categoria" name="descripcion" type="text" placeholder="Categoria">
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-12">
                        <label class="col-form-label">Precio</label>
                        <input class="form-control" id="precio" name="descripcion" type="number" value="0" step="any">
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
<div class="modal fade" id="producto_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">Buscar Producto</h4>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-12 col-md-12">
                        <form id="frmBuscarProductos">
                            <div class="input-group mb-3">
                                <input type="text" name="filtro" id="filtro" class="form-control" placeholder="Buscar producto" aria-label="Buscar Producto" aria-describedby="basic-addon2">
                                <div class="input-group-append">
                                    <button class="btn btn-info btn-sm"><i class="fa fa-search fa-lg"></i></button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 col-md-12">
                        <div id="productos_lista">

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
<asset:javascript src="cambiar_precio.js"/>

${perfiles}
</body>
</html>
