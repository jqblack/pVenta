<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>


<div class="row justify-content-center">
    <div class="col-md-4 col-xl-4 col-12">
        <div class="card">
            <div class="card-header"><b>Reporte de ventas por categoria</b>
            </div>
            <div class="card-body" id="frm">
                <div class="row">
                    <div class="col-6 col-md-4 col-xl-12">
                        <div class="form-group">
                            <label class=" col-form-label">Fecha de incio</label>
                            <div class="">
                                <div id="fechaInicial"></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-6 col-md-4 col-xl-12">
                        <div class="form-group">
                            <label class="col-form-label">Fecha final</label>
                            <div class="">
                                <div id="fechaFinal"></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-6 col-md-4 col-xl-12">
                        <div class="form-group">
                            <label class="col-form-label">Categoria</label>
                            <select class="form-control" name="categoria" id="categoria">
                                <option value="0">Todas</option>
                                <g:each in="${categorias}">
                                    <option value="${it.id}">${it.fDescripcion}</option>
                                </g:each>
                            </select>
                        </div>
                    </div>
                </div>

                %{--</form>--}%
            </div>
            <div class="card-footer text-right">
                <button class="btn btn-sm btn-primary" id="generar" type="submit">Generar</button>
                %{--<button class="btn btn-sm btn-secondary" id="btnNuevo" type="submit">Nuevo</button>--}%
            </div>
        </div>
    </div>
</div>

<div id="pdfmodal" class="modal fade" tabindex="-1" role="dialog" style="display: none;">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" id="pdfmodal-title">Modal Heading</h4>
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            </div>
            <div class="modal-body" style="text-align: center" id="pdfmodal-content">

            </div> <!-- / .modal-body -->
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div> <!-- / .modal-content -->
    </div> <!-- / .modal-dialog -->
</div> <!-- /.modal -->
</div>
<asset:javascript src="reporte_vendidos_por_categoria.js"/>
</body>
</html>
