<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>

<div class="row justify-content-center">
    <div class="col-md-10">
        <div class="card">
            <div class="card-header"><b>Salida de productos</b>
            </div>
            <div class="card-body" id="frmSalida">
                %{--<form class="form-horizontal">--}%

                <div class="row" >
                    <div class="col-12 ">
                        <div class="card">
                            <div class="card-body">
                                <div class="row">
                                    <div class="col-12">
                                        <div class="input-group input-group-sm mb-2">
                                            <div class="input-group-prepend">
                                                <label class="input-group-text">Concepto</label>
                                                <input type="number" id="id_concepto" name="id" hidden value="0">
                                            </div>
                                            <input type="text" class="form-control" disabled name="referencia" id="concepto" placeholder="Concepto" aria-label="Recipient's username" aria-describedby="button-addon2">
                                            <div class="input-group-append">
                                                <button class="btn btn-outline-primary btn-group-sm" type="button" id="btnBuscarConcepto">Buscar</button>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-12">
                                        <label class="col-form-label">Nota</label>
                                        <textarea class="form-control mt-2" id="nota" name="nota" placeholder="Nota" rows="5"></textarea>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="row">
                                    <div class="col-md-8 col-12">
                                        <div class="input-group input-group-sm mb-2">
                                            <div class="input-group-prepend">
                                                <label class="input-group-text">Referencia</label>
                                                <input type="number" id="id" name="id" hidden value="0">
                                            </div>
                                            <input type="text" class="form-control" disabled name="referencia" id="referencia" aria-label="Recipient's username" aria-describedby="button-addon2">
                                            <div class="input-group-append">
                                                <button class="btn btn-outline-primary btn-group-sm" type="button" id="btnBuscar">Buscar</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <div class="col-12 col-md-6 col-xl-4">
                                        <label class="col-form-label">Descripcion</label>
                                        <input class="form-control" id="descripcion" disabled name="descripcion" type="text" placeholder="Descripcion">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <div class="col-12 col-md-6 col-xl-4 col-lg-4">
                                        <label class="col-form-label">Cantidad </label>
                                        <input type="text" class="form-control" id="cantidad" name="cantidad">
                                    </div>
                                    <div class="col-12 col-md-6 col-xl-4 col-lg-4">
                                        <label class="col-form-label">Costo </label>
                                        <input type="text" class="form-control" disabled  id="costo" name="costo">
                                        <input type="text" class="form-control" hidden disabled  id="precio" name="precio">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
                <div class="row">
                    <div class="col-12 col-md-12">
                        <div id="tabla_salida">

                        </div>
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


<div class="modal fade" id="suplidores_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-sm" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">Buscar Supldiores</h4>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-12 col-md-12">
                        <form id="frmBuscarSuplidores">
                            <div class="input-group mb-3">
                                <input type="text" name="filtro_suplidor" id="filtro_suplidor" class="form-control" placeholder="Buscar Suplidor" aria-label="Buscar Producto" aria-describedby="basic-addon2">
                                <div class="input-group-append">
                                    <button class="btn btn-info btn-sm"><i class="fa fa-search fa-lg"></i></button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 col-md-12">
                        <div id="suplidores_grid">

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
<div class="modal fade" id="concepto_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">Buscar Concepto</h4>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-12 col-md-12">
                        <form id="frmBuscarConcepto">
                            <div class="input-group mb-3">
                                <input type="text" name="filtro_concepto" id="filtro_concepto" class="form-control" placeholder="Buscar Concepto" aria-label="Buscar Producto" aria-describedby="basic-addon2">
                                <div class="input-group-append">
                                    <button class="btn btn-info btn-sm"><i class="fa fa-search fa-lg"></i></button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 col-md-12">
                        <div id="conceptos_grid">

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
</div>
<asset:javascript src="salida.js"/>
</body>
</html>
