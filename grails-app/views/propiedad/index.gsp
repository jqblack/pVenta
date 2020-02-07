<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>


<div class="row">
    <div class="col-12 col-xl-6 col-md-6">
        <div class="card">
            <div class="card-header"><b>Propiedades</b>
            </div>
            <div class="card-body" id="frmProducto">
                <div class="form-group row">
                    <label class="col-12 col-md-6 col-xl-3 col-sm-2 col-form-label col-form-label-sm">Categoria</label>
                    <div class="col-6 col-md-4 col-xl-6 col-sm-2 form-group">
                        <select class="form-control form-control-sm" id="categoria" name="categoria">
                        </select>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-12 col-md-6 col-xl-3 col-sm-2 col-form-label col-form-label-sm">Descripcion</label>
                    <div class="col-6 col-md-4 col-xl-6 col-sm-2 form-group">
                        <input type="number" id="id" hidden>
                        <input class="form-control form-control-sm" id="descripcion" name="descripcion" type="text" placeholder="Descripcion">
                    </div>

                </div>
                <div class="row">
                    <div class="col-12 col-md-12">
                        <div id="propiedades_list">

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
<asset:javascript src="propiedad.js"/>
</body>
</html>
