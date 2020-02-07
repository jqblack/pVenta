
<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>
    <div class="row justify-content-center">
        <div class="col-md-11">
            <div class="card">
                <div class="card-header"><b>Productos</b>
                </div>
                <div class="card-body" id="frmProducto">
                    %{--<form class="form-horizontal">--}%
                        <div class="input-group input-group-sm mb-2">
                            <div class="input-group-prepend">
                                <label class="input-group-text">Referencia</label>
                                <input type="text" id="id" name="id" hidden value="0">
                            </div>
                            <input type="text" class="form-control" name="referencia" id="referencia" placeholder="Referencia" aria-label="Recipient's username" aria-describedby="button-addon2">
                            <div class="input-group-append">
                                <button class="btn btn-outline-primary btn-group-sm" type="button" id="btnBuscar">Buscar</button>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-6 col-sm-2 col-form-label">Titulo</label>
                            <div class="col-6 col-sm-5 form-group">
                                <input class="form-control" id="descripcion" name="descripcion" type="text" placeholder="Titulo">
                            </div>
                            <label class="col-6 col-sm-2 col-form-label">Impuesto</label>
                            <div class="col-6 col-sm-3">
                                <input class="form-control" id="impuesto" name="impuesto" type="text" value="0" step="any">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-6 col-md-2 col-form-label">Localizaciones </label>
                            <div class="col-6 col-md-5 form-group">
                                <select class="form-control form-control-sm" id="localizaciones" name="localizaciones">

                                </select>
                            </div>
                            <label class="col-6 col-md-2 col-form-label">Categorias </label>
                            <div class="col-6 col-md-3">
                                <select class="form-control form-control-sm" id="categoria" name="categoria">
                                </select>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-6 col-md-2 col-form-label">Unidad </label>
                            <div class="col-6 col-md-5 form-group">
                                <select class="form-control form-control-sm" id="unidad" name="unidad">
                                </select>
                            </div>
                            <label class="col-6 col-md-2 col-form-label">Vencimiento</label>
                            <div class="col-6 col-md-3">
                                <div  id="datepickerVencimiento"></div>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-6 col-md-2 col-form-label">Descripcion </label>
                            <div class="col-6 col-md-5 form-group">
                                <textarea class="form-control form-control-sm" id="mensaje" name="mensaje"></textarea>
                            </div>
                        </div>
                        <div class="form-group row justify-content-center">
                            <hr class="col-12 col-md-10 ">
                            <div class="col-12 col-xl-10 col-md-10 col-form-label">
                                <div class="form-check form-check-inline mr-3 mb-3">
                                    <input class="form-check-input" id="control_inventario" name="control_inventario" type="checkbox">
                                    <label class="form-check-label" for="control_inventario">Control Inventario</label>
                                </div>
                                <div class="form-check form-check-inline mr-3 mb-3">
                                    <input class="form-check-input" id="descontinuado" name="descontinuado" type="checkbox">
                                    <label class="form-check-label" for="descontinuado">Descontinuado</label>
                                </div>
                                <div class="form-check form-check-inline mr-3 mb-3">
                                    <input class="form-check-input" id="plato" name="plato" type="checkbox">
                                    <label class="form-check-label" for="plato">Plato</label>
                                </div>
                                <div class="form-check form-check-inline mr-3 mb-3">
                                    <input class="form-check-input" id="ventas_decimales" name="ventas_decimales" type="checkbox">
                                    <label class="form-check-label" for="ventas_decimales">Ventas Decimales</label>
                                </div>
                                <div class="form-check form-check-inline mr-3 mb-3">
                                    <input class="form-check-input" id="receta" name="receta" type="checkbox">
                                    <label class="form-check-label" for="receta">Receta</label>
                                </div>
                                <div class="form-check form-check-inline mr-3 mb-3">
                                    <input class="form-check-input" id="combo" name="combo" type="checkbox">
                                    <label class="form-check-label" for="combo">Combo</label>
                                </div>
                                <div class="form-check form-check-inline mr-3 mb-3">
                                    <input class="form-check-input" id="f_comanda" name="f_comanda" type="checkbox">
                                    <label class="form-check-label" for="f_comanda">Comanda</label>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-12 mb-4">
                            <ul class="nav nav-tabs" role="tablist">
                                <li class="nav-item">
                                    <a class="nav-link active" data-toggle="tab" id="btnDatosGeneralesTab" href="#datos_generales" role="tab" aria-controls="home">Datos Generales</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" data-toggle="tab" href="#precioTab" role="tab" aria-controls="profile">Precio</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" style="display: none;" data-toggle="tab" id="btnComponentesTab" href="#componentes" role="tab" aria-controls="messages">Componentes</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link " data-toggle="tab" href="#foto" role="tab" aria-controls="messages">Foto</a>
                                </li>
                            </ul>
                            <div class="tab-content">
                                <div class="tab-pane active" id="datos_generales" role="tabpanel">

                                    <div class="form-group row">
                                        <label class="col-6 col-sm-2 col-form-label">Precio</label>
                                        <div class="col-6 col-sm-2 form-group">
                                            <input class="form-control" id="precio" name="precio" type="text" value="0" step="any">
                                        </div>
                                        <label class="col-6 col-sm-2 col-form-label">Nivel Minimo</label>
                                        <div class="col-6 col-sm-2 form-group" >
                                            <input class="form-control" id="nivel_minimo" name="nivel_minimo" type="text" value="0" step="any">
                                        </div>
                                        <label class="col-6 col-sm-2 col-form-label">Nivel Maximo</label>
                                        <div class="col-6 col-sm-2 form-group">
                                            <input class="form-control" id="nivel_maximo" name="nivel_maximo" type="text" value="0" step="any">
                                        </div>
                                    </div>

                                    <div class="form-group row">
                                        <label class="col-6 col-sm-2 col-form-label">Ultimo Costo</label>
                                        <div class="col-6 col-sm-2 form-group">
                                            <input class="form-control" id="ultimo_costo" name="ultimo_costo" type="text" value="0" step="any">
                                        </div>
                                        <label class="col-6 col-sm-2 col-form-label">Ultimo Costo 1</label>
                                        <div class="col-6 col-sm-2 form-group">
                                            <input class="form-control" id="ultimo_costo1" name="ultimo_costo1" type="text" value="0" step="any">
                                        </div>
                                        <label class="col-6 col-sm-2 col-form-label">Ultimo Costo 2</label>
                                        <div class="col-6 col-sm-2 form-group">
                                            <input class="form-control" id="ultimo_costo2" name="ultimo_costo2" type="text" value="0" step="any">
                                        </div>
                                    </div>

                                    <div class="form-group row">
                                        <label class="col-6 col-sm-2 col-form-label">Reorden</label>
                                        <div class="col-6 col-sm-2 form-group">
                                            <input class="form-control" id="reorden" name="reorden" type="text" value="0" step="any">
                                        </div>
                                        <label class="col-6 col-sm-2 col-form-label">Existencia</label>
                                        <div class="col-6 col-sm-2 form-group">
                                            <input class="form-control" id="existencia" name="existencia" type="text" value="0" step="any">
                                        </div>
                                        <label class="col-6 col-sm-2 col-form-label">% Ganacia</label>
                                        <div class="col-6 col-sm-2 form-group">
                                            <input class="form-control" id="makeup" name="makeup" type="text" value="0" step="any">
                                        </div>
                                    </div>

                                    <div class="form-group row">
                                        <label class="col-6 col-sm-2 col-form-label">Tragos</label>
                                        <div class="col-6 col-sm-2 form-group">
                                            <input class="form-control" id="tragos" name="tragos" type="text" value="0" step="any">
                                        </div>
                                        <label class="col-6 col-sm-2 col-form-label">Maximo Descuento</label>
                                        <div class="col-6 col-sm-2 form-group">
                                            <input class="form-control" id="maximo_descuento" name="maximo_descuento" type="text" value="0" step="any">
                                        </div>
                                        <label class="col-6 col-sm-2 col-form-label">Precio delivery</label>
                                        <div class="col-6 col-sm-2 form-group">
                                            <input class="form-control" id="precio_delivery" name="precio_delivery" type="text" value="0" step="any">
                                        </div>
                                    </div>
                                </div>
                                <div class="tab-pane" id="precioTab" role="tabpanel">
                                   <div class="row">
                                       <div class="col-10 col-md-12">
                                           <div id="precio_grid">

                                           </div>
                                       </div>
                                   </div>
                                </div>
                                <div class="tab-pane"  id="componentes" role="tabpanel">
                                    <div class="row">
                                        <div class="col-12 col-md-3">
                                            <div id="componentes_grid">

                                            </div>
                                        </div>
                                        <div class="col-12 col-md-1 d-flex align-items-center">
                                            <button class="btn btn-sm btn-outline-primary" id="btnAddComponente">
                                                <i class="fa fa-arrow-right"></i>
                                            </button>
                                        </div>
                                        <div class="col-12 col-md-7">
                                            <div class="col-12 col-md-12">
                                                <div id="componentes_lista" class="mb-2">

                                                </div>
                                            </div>
                                            <div class="col-12 col-md-12">
                                                <div id="componentes_productos">

                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                                <div class="tab-pane" id="foto" role="tabpanel">
                                    <div class="row">
                                        <div class="col-12 col-lg-6 col-md-6">
                                            <div id="fotos_grid">

                                            </div>
                                            <div id="test">

                                            </div>
                                        </div>
                                        <div class="col-12 col-lg-6 col-md-6">
                                            <div id="fotoUpload">
                                            </div>
                                        </div>
                                    </div>
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
<asset:javascript src="products.js"/>

    ${perfiles}
</body>
</html>
