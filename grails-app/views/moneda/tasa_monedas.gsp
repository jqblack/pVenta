<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>


<div class="row ">
    <div class="col-12 col-xl-6 col-sm-8 col-md-6">
        <div class="card">
            <div class="card-header"><b>Tasas de monedas</b>
            </div>
            <div class="card-body" id="frm">
                <div class="form-group row">
                    <div class="col-12 col-xl-10">
                        <label class="col-form-label">Moneda </label>
                        <select class="form-control form-control-sm" id="cbmoneda" name="cbmoneda">
                        </select>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-12 col-xl-10">
                        <label class=" col-form-label">Tasa</label>
                        <input type="number" id="id" hidden>
                        <input class="form-control" step="any" id="tasa" name="tasa" value="0.00" type="text">
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-12 col-md-5 col-xl-4 col-sm-6">
                        <label class="col-form-label">Fecha</label>
                        <div  id="datepickerFecha"></div>
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
<asset:javascript src="tasas_monedas.js"/>
</body>
</html>
