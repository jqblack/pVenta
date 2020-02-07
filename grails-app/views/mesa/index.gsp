<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>
<div class="row">
    <div class="col-12 col-md-8 col-sm-8 col-xl-6">
        <div class="card">
            <div class="card-header"><b>Mesas</b>
            </div>
            <div class="card-body" id="frmMesa">
                <div class="form-group row">
                    <div class="col-12 col-md-8 col-xl-8">
                        <label class="col-form-label">Area </label>
                        <select class="form-control form-control-sm" id="cbarea" name="cbarea">
                        </select>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-12 col-md-8 col-xl-8">
                        <label class="col-form-label">Seccion </label>
                        <select class="form-control form-control-sm" id="cbseccion" name="cbseccion">
                        </select>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-12 col-md-8 col-xl-8">
                        <label class="col-form-label">Num. Mesa</label>
                        <input type="number" id="id" hidden>
                        <input class="form-control" id="descripcion" name="descripcion" type="text">
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-12 col-md-8 col-xl-8">
                        <label class="col-form-label">Num. Cubiertos</label>
                        <input class="form-control" id="cubiertos" name="cubiertos" type="text">
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 col-md-12">
                        <div id="mesa_lista">

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
<asset:javascript src="mesa.js"/>
</body>
</html>
