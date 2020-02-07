<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>


<div class="row justify-content-center">
    <div class="col-md-6 col-xl-9">
        <div class="card">
            <div class="card-header"><b>Reporte</b>
            </div>
            <div class="card-body" id="frmSeccion">
                <div class="form-group row">
                    <label class="col-6 col-sm-4 col-xl-3 col-md-3 col-form-label">Fecha Inicio</label>
                    <div class="col-6 col-sm-5 col-xl-3 col-md-3 form-group pt-2">
                        <input type="number" id="id" hidden>
                        <div  id="datepickerFechaInicio"></div>
                    </div>

                    <label class="col-6 col-sm-4 col-xl-3 col-md-3 col-form-label">Fecha Final</label>
                    <div class="col-6 col-sm-5  col-xl-3 col-md-3 form-group pt-2">
                        <div  id="datepickerFechaFin"></div>
                    </div>
                </div>

                <div class="form-group row justify-content-end">
                    <div class="col-md-2 col-12 col-xl-2 col-sm-2">
                        <button class="btn btn-sm btn-primary pr-1" id="generar" type="submit">Generar</button>
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
        </div>
    </div>
</div>

</div>
<asset:javascript src="reporte_ventas_contado.js"/>
</body>
</html>
