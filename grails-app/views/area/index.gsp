<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>


<div class="row">
    <div class="col-md-6 col-12 col-xl-6">
        <div class="card">
            <div class="card-header"><b>Areas</b>
            </div>
            <div class="card-body" id="frmArea">
                <div class="form-group row">
                    <div class="col-12">
                        <label class="col-form-label">Descripcion</label>
                        <input type="number" id="id" hidden>
                        <input class="form-control" id="descripcion" name="descripcion" type="text" placeholder="Descripcion">
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-12">
                        <label class="col-form-label">Tiempo Camarero</label>
                        <input class="form-control" id="tiempo_camarero" name="tiempo_camarero" type="text">

                    </div>
                </div>
                <div class="row">
                    <div class="col-12 col-md-12">
                        <div id="area_lista">

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
<asset:javascript src="area.js"/>
</body>
</html>
