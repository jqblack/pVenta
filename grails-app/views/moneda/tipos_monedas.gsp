<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>


<div class="row">
    <div class="col-12 col-md-6 col-sm-6 col-xl-5">
        <div class="card">
            <div class="card-header"><b>Tipos de monedas</b>
            </div>
            <div class="card-body" id="frm">

                <div class="form-group row">
                    <div class="col-12 col-sm-7 col-md-8 col-xl-8">
                        <label class="col-form-label">Descripcion</label>
                        <input type="number" id="id" hidden>
                        <input class="form-control" maxlength="10" id="descripcion" name="descripcion" type="text">
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-12 col-xl-5 col-md-6 col-sm-7">
                        <label class="col-form-label">Siglas</label>
                        <input class="form-control" maxlength="20" id="siglas" name="siglas" type="text">
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 col-md-12">
                        <div id="tabla">

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
<asset:javascript src="tipos_monedas.js"/>
</body>
</html>
