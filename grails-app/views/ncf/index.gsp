<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>
<div class="row">
    <div class="col-12 col-sm-6 col-xl-4 col-md-5">
        <div class="card">
            <div class="card-header"><b>NCF</b>
            </div>
            <div class="card-body" id="frm">
                <div class="form-group row">
                    <div class="col-12">
                        <label class="col-form-label">Descripcion</label>
                        <input type="text" id="id" hidden>
                        <input class="form-control form-control-sm" id="descripcion" name="descripcion" type="text">
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-12">
                        <label class="col-form-label">Tipo</label>
                        <input class="form-control form-control-sm" id="tipo" name="tipo" type="text">
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-12">
                        <label class="col-form-label">Reorden</label>
                        <input class="form-control form-control-sm" id="reorden" name="reorden" type="text">
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-12">
                        <label class="col-form-label">Orden</label>
                        <input class="form-control form-control-sm" id="orden" name="orden" type="text">
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-12 col-sm-10 col-md-10 col-xl-10" >
                        <div class="form-check form-check-inline mr-3 mb-3">
                            <input class="form-check-input" id="visible" name="visible" type="checkbox">
                            <label class="form-check-label" for="visible">Visible</label>
                        </div>

                        <div class="form-check form-check-inline mr-3 mb-3">
                            <input class="form-check-input" id="validavigencia" name="validavigencia" type="checkbox">
                            <label class="form-check-label" for="validavigencia">Validar Vigencia</label>
                        </div>
                        <div class="form-check form-check-inline mr-3 mb-3">
                            <input class="form-check-input" id="validarnc" name="validarnc" type="checkbox">
                            <label class="form-check-label" for="validarnc">Validar RNC</label>
                        </div>
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
                <button class="btn btn-sm btn-warning" id="showLog" type="submit"><i class="fa fa-clock-o"></i> Logs</button>
                <button class="btn btn-sm btn-primary" id="guardar" type="submit">Guardar</button>
                <button class="btn btn-sm btn-secondary" id="btnNuevo" type="submit">Nuevo</button>
            </div>
        </div>
    </div>
    <div class="col-12 col-sm-6 col-md-7 col-xl-8" id="log-panel" style="display: none;">
        <div class="card">
            <div class="card-header"><b>Logs</b>
            </div>
            <div class="card-body" id="log-frm">
                <div class="form-group row">
                    <label class="col-6 col-sm-4 col-md-2 col-xl-2 col-form-labe-sm col-form-label">Descripcion</label>
                    <div class="col-6 col-sm-5 col-md-4 col-xl-4">
                        <input type="text" id="idlog" hidden>
                        <input class="form-control form-control-sm" id="logdescripcion" name="logdescripcion" type="text">
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-12 col-md-12 col-xl-12">
                        <h6>Rango de Fecha: </h6>
                    </div>
                    <label class="col-6 col-sm-2 col-md-2 col-xl-2 col-form-label">Inicio </label>
                    <div class="col-12 col-md-3 col-xl-4">
                        <div  id="fechaInicio"></div>
                    </div>
                    <label class="col-6 col-sm-4 col-md-2 col-xl-2 col-form-label">Fin </label>
                    <div class="col-12 col-md-3 col-xl-4">
                        <div  id="fechaFin"></div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-12 col-md-12 col-xl-12">
                        <h6>Secuencia: </h6>
                    </div>
                    <label class="col-6 col-sm-4 col-md-2 col-xl-3 col-form-label">Inicio</label>
                    <div class="col-6 col-sm-5 col-md-4 col-xl-3">
                        <input class="form-control form-control-sm" id="iniciosecuencia" name="iniciosecuencia" type="text">
                    </div>
                    <label class="col-6 col-sm-4 col-md-2 col-xl-3 col-form-label">Fin</label>
                    <div class="col-6 col-sm-5 col-md-4 col-xl-3">
                        <input class="form-control form-control-sm" id="finsecuencia" name="finsecuencia" type="text">
                    </div>
                    <div class="col-12 ">
                        <button class="btn btn-sm btn-success pull-right" id="btnAddlog" type="button"><i class="fa fa-plus"></i>   Agregar</button>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 col-md-12">
                        <div id="logs-tabla">

                        </div>
                    </div>
                </div>
                %{--</form>--}%
            </div>
            <div class="card-footer text-right">
                <button class="btn btn-sm btn-primary" id="logguardar" type="submit">Guardar</button>
            </div>
        </div>
    </div>
</div>

</div>
<asset:javascript src="ncf.js"/>
</body>
</html>
