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
            <div class="card-header"><b>Categorias</b>
            </div>
            <div class="card-body" id="frmProducto">
                <div class="form-group row">
                    <label class="col-6 col-sm-2 col-form-label">Descripcion</label>
                    <div class="col-6 col-sm-5 form-group">
                        <input type="number" id="id" hidden>
                        <input class="form-control" id="descripcion" name="descripcion" type="text" placeholder="Descripcion">
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 col-md-12">
                        <div id="categorias_lista">

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

</div>
<asset:javascript src="categoria.js"/>
</body>
</html>
