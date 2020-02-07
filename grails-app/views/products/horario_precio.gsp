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
            <div class="card-header"><b>Buscar productos</b>
            </div>
            <div class="card-body">
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
        </div>
    </div>

    <div class="col-md-7">
        <div class="card" id="lista_precios_container" style="display:none">
            <div class="card-header"><b>Horario de precios en productos</b>
            </div>
            <div class="card-body" id="frmProducto">
                <div class="input-group input-group-sm mb-2">
                    <div class="input-group-prepend">
                        <label class="input-group-text">Referencia</label>
                        <input type="number" id="id" name="id" hidden value="0">
                    </div>
                    <input type="text" class="form-control" name="referencia" id="referencia" placeholder="Referencia" aria-label="Recipient's username" aria-describedby="button-addon2">
                </div>
                <div class="form-group row">
                    <label class="col-6 col-sm-6 col-md-4 col-form-label">Descripcion</label>
                    <div class="col-6 col-sm-5 col-md-8 form-group">
                        <input class="form-control" id="descripcion" name="descripcion" type="text" placeholder="Descripcion">
                    </div>
                </div>
                <div class="row">
                    <div class="col-12">
                        <div class="btn-group pull-right mb-2" role="group" aria-label="Basic example">
                            <button type="button" class="btn btn-primary" id="btn-toolbar-agregar"><i class=" font-2xl d-block mt-2 fa fa-plus"></i> Agregar</button>
                            <button type="button" class="btn btn-primary" id="btn-toolbar-eliminar"><i class=" font-2xl d-block mt-2 fa fa-minus"></i> Eliminar</button>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-10 col-md-12">
                        <div id="precio_grid">

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
<asset:javascript src="horario_precio.js"/>

${perfiles}
</body>
</html>