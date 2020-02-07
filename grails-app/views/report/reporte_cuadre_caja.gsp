<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>


<div class="row">
    <div class="col-12">
        <div class="card">
            <div class="card-header"><b>Reporte de cuadre de cajero</b>
            </div>
            <div class="card-body" id="frm">
                <div class="row justify-content-center">
                    <div class="col-12 col-md-4 col-xl-4">
                        <div class="form-group">
                            <label class=" col-form-label">Fecha de incio</label>
                            <div class="">
                                <div id="fechaInicial"></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-md-4 col-xl-4">
                        <div class="form-group">
                            <label class="col-form-label">Fecha final</label>
                            <div class="">
                                <div id="fechaFinal"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 mb-2">
                        <div class="btn-group pull-right" role="group" aria-label="Basic example">
                            <button type="button" class="btn btn-primary" id="btn-toolbar-reimprimir"><i class="fa font-2xl d-block mt-2 fa-file-text"></i> Reimprimir</button>
                            <button type="button" class="btn btn-primary" id="btn-toolbar-generar"><i class="fa font-2xl d-block mt-2 fa-refresh"></i> Generar</button>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12" style="height: 50vh;">
                        <div id="tabla"></div>
                    </div>
                </div>

                %{--</form>--}%
            </div>
            %{--<div class="card-footer text-right">--}%
                %{--<button class="btn btn-sm btn-primary" id="generar" type="submit">Generar</button>--}%
                %{--<button class="btn btn-sm btn-secondary" id="btnNuevo" type="submit">Nuevo</button>--}%
            %{--</div>--}%
        </div>
    </div>
</div>

</div>
<asset:javascript src="reporte_cuadre_caja.js"/>
</body>
</html>
