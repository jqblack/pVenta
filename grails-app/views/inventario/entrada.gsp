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
            <div class="card-header"><b>Entrada de productos</b>
            </div>

            <div class="card-body" id="frmEntrada">
                %{--<form class="form-horizontal">--}%
                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="row">
                                    %{--<div class="col-md-6 col-12">--}%
                                        %{--<div class="input-group input-group-sm mb-2">--}%
                                            %{--<div class="input-group-prepend">--}%
                                                %{--<label class="input-group-text">Suplidor</label>--}%
                                                %{--<input type="number" id="id_suplidor" name="id" hidden value="0">--}%
                                            %{--</div>--}%
                                            %{--<input type="text" class="form-control" disabled name="referencia"--}%
                                                   %{--id="suplidor" placeholder="Suplidor"--}%
                                                   %{--aria-label="Recipient's username" aria-describedby="button-addon2">--}%

                                            %{--<div class="input-group-append">--}%
                                                %{--<button class="btn btn-outline-primary btn-group-sm" type="button"--}%
                                                        %{--id="btnBuscarSuplidor">Buscar</button>--}%
                                            %{--</div>--}%
                                        %{--</div>--}%
                                    %{--</div>--}%
                                    <div class="col-12 col-xl-2 col-lg-2 col-md-3">
                                        <label class="form-label mr-3 font-weight-bold" for="calcular_makeup">
                                            Calcular Precio
                                        </label>
                                        <div class="form-check-inline form-check">
                                            <input class="form-check-input" type="checkbox" value="" id="calcular_makeup">
                                        </div>
                                    </div>

                                    <div class="col-md-6 col-12">
                                        <div class="input-group input-group-sm mb-2">
                                            <div class="input-group-prepend">
                                                <label class="input-group-text">Concepto</label>
                                                <input type="number" id="id_concepto" name="id" hidden value="0">
                                            </div>
                                            <input type="text" class="form-control" disabled name="referencia"
                                                   id="concepto" placeholder="Concepto"
                                                   aria-label="Recipient's username" aria-describedby="button-addon2">

                                            <div class="input-group-append">
                                                <button class="btn btn-outline-primary btn-group-sm" type="button"
                                                        id="btnBuscarConcepto">Buscar</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <div class="col-12 col-sm-8 col-md-8">
                                        <label class="col-form-label">Nota</label>
                                        <textarea class="form-control mt-2" id="nota" name="nota" placeholder="Nota"
                                                  ></textarea>
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
                                    <div class="col-md-6 col-12">
                                        <div class="input-group input-group-sm mb-2">
                                            <div class="input-group-prepend">
                                                <label class="input-group-text">Referencia</label>
                                                <input type="number" id="id" name="id" hidden value="0">
                                            </div>
                                            <input type="text" class="form-control" disabled name="referencia" id="referencia"
                                                   aria-label="Recipient's username" aria-describedby="button-addon2">

                                            <div class="input-group-append">
                                                <button class="btn btn-outline-primary btn-group-sm" type="button"
                                                        id="btnBuscar">Buscar</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <div class="col-12 col-sm-5 col-md-6">
                                        <label class="col-form-label">Descripcion</label>
                                        <input class="form-control" id="descripcion" disabled name="descripcion" type="text"
                                               placeholder="Descripcion">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <div class="col-12 col-xl-3 col-lg-3 col-md-3">
                                        <label class="col-form-label">Cantidad</label>
                                        <input type="text"  class="form-control" value="0.00" id="cantidad" name="cantidad">
                                    </div>
                                    <div class="col-12 col-xl-3 col-lg-3 col-md-3">
                                        <label class="col-form-label">Costo</label>
                                        <input type="text" class="form-control" value="0.00" id="costo" name="costo">
                                    </div>
                                    <div class="col-12 col-xl-3 col-lg-3 col-md-3">
                                        <label class="col-form-label">Impuesto</label>
                                        <input type="text" class="form-control" value="0.00" id="impuesto" name="impuesto">

                                    </div>
                                    <div class="col-12 col-xl-3 col-lg-3 col-md-3">
                                        <label class="col-form-label">% Ganancias</label>
                                        <input type="text" class="form-control" value="0.00" id="makeup" name="makeup">

                                    </div>

                                </div>
                                <div class="form-group row">
                                    <div class="col-12 col-xl-3 col-lg-3 col-md-3">
                                        <label class="col-form-label">Precio</label>
                                        <input type="text" class="form-control" value="0.00" id="precio" name="precio">
                                    </div>


                                </div>
                            </div>
                        </div>

                    </div>

                </div>

                <div class="row">
                    <div class="col-12 col-md-12">
                        <div id="tabla_entrada">

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

<div class="modal fade" id="producto_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
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
                                <input type="text" name="filtro" id="filtro" class="form-control"
                                       placeholder="Buscar producto" aria-label="Buscar Producto"
                                       aria-describedby="basic-addon2">

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


<div class="modal fade" id="suplidores_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
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
                                <input type="text" name="filtro_suplidor" id="filtro_suplidor" class="form-control"
                                       placeholder="Buscar Suplidor" aria-label="Buscar Producto"
                                       aria-describedby="basic-addon2">

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

<div class="modal fade" id="concepto_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
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
                                <input type="text" name="filtro_concepto" id="filtro_concepto" class="form-control"
                                       placeholder="Buscar Concepto" aria-label="Buscar Producto"
                                       aria-describedby="basic-addon2">

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
<asset:javascript src="entrada.js"/>
</body>
</html>
