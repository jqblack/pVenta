<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>


<div class="row">
    <div class="col-md-6">
        <div class="card">
            <div class="card-header"><b>Billetes</b>
            </div>
            <div class="card-body" id="frm">
                <div class="form-group row">
                    <label class="col-6 col-sm-4 col-md-4 col-xl-4 col-form-label">Moneda </label>
                    <div class="col-6 col-md-4 col-xl-6 ">
                        <select class="form-control form-control-sm" id="cbmoneda" name="cbmoneda">
                        </select>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-6 col-sm-4 col-md-4 col-xl-4 col-form-label">Descripcion</label>
                    <div class="col-6 col-sm-5 col-md-4 col-xl-6">
                        <input type="number" id="id" hidden>
                        <input class="form-control" id="descripcion" name="descripcion"  type="text">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-6 col-sm-4 col-md-4 col-xl-4 col-form-label">Valor</label>
                    <div class="col-6 col-sm-5 col-md-4 col-xl-6">
                        <input class="form-control" step="any" id="valor" name="valor" value="0.00" type="number">
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
<asset:javascript src="billetes.js"/>
</body>
</html>
