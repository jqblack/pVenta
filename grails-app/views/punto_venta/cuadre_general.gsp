<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>


<div class="row">
    <div class="col-md-4 col-xl-5 col-12">
        <div class="card">
            <div class="card-header"><b>Cuadre General</b>
            </div>
            <div class="card-body" id="frm">
                <div class="row">
                    <div class="col-12 mb-2">
                        <div class="btn-group pull-right" role="group" aria-label="Basic example">
                            <button type="button" class="btn btn-primary" id="btn-generar-cuadre"><i class="fa font-2xl d-block mt-2 fa-refresh"></i> Generar Cuadre</button>
                        </div>
                    </div>
                </div>
                <div class="row" id="panel-total" style="display: none;">
                    <div class="col-12 col-xl-12 col-md-12">
                        <div class="form-group">
                            <h3 id="f_fecha" >Fecha: 10/01/2018</h3>
                        </div>
                    </div>
                    <div class="col-12 col-xl-6 col-md-6">
                        <div class="col-12 col-xl-12">
                            <div class="form-group">
                                <label> Pedidos: </label>
                                <h4 id="f_pedidos">10</h4>
                            </div>
                        </div>
                        <div class="col-12 col-xl-12">
                            <div class="form-group">
                                <label> Facturas a credito: </label>
                                <h4 id="f_factcredito">20</h4>
                            </div>
                        </div>
                        <div class="col-12 col-xl-12">
                            <div class="form-group">
                                <label> Factura Contado: </label>
                                <h4 id="f_factcontado">2018</h4>
                            </div>
                        </div>
                        <div class="col-12 col-xl-12">
                            <div class="form-group">
                                <label> Total de credito: </label>
                                <h4 id="f_montocredito">2018</h4>
                            </div>
                        </div>
                        <div class="col-12 col-xl-12">
                            <div class="form-group">
                                <label> Total en contado: </label>
                                <h4 id="f_montocontado">2018</h4>
                            </div>
                        </div>
                        <div class="col-12 col-xl-12">
                            <div class="form-group">
                                <label> Total de ITBIS: </label>
                                <h4 id="f_montoitbis">2018</h4>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-xl-6 col-md-6">
                        <div class="col-12 col-xl-12">
                            <div class="form-group">
                                <label> Total de cheques: </label>
                                <h4 id="f_montocheque">2018</h4>
                            </div>
                        </div>
                        <div class="col-12 col-xl-12">
                            <div class="form-group">
                                <label> Total de tarjeta: </label>
                                <h4 id="f_montotarjeta">2018</h4>
                            </div>
                        </div>
                        <div class="col-12 col-xl-12">
                            <div class="form-group">
                                <label> Total de envio: </label>
                                <h4 id="f_montoenvio">2018</h4>
                            </div>
                        </div>
                        <div class="col-12 col-xl-12">
                            <div class="form-group">
                                <label> Total en caja: </label>
                                <h4 id="f_monto_caja">2018</h4>
                            </div>
                        </div>
                        <div class="col-12 col-xl-12">
                            <div class="form-group">
                                <label> Total de recibido: </label>
                                <h4 id="f_monto_recibo">2018</h4>
                            </div>
                        </div>
                        <div class="col-12 col-xl-12">
                            <div class="form-group">
                                <label> Total de cancelado: </label>
                                <h4 id="f_monto_cancelado">2018</h4>
                            </div>
                        </div>
                    </div>

                </div>

                %{--</form>--}%
            </div>
        </div>
    </div>
</div>

<div id="autorizacion-modal" class="modal fade" tabindex="-1" role="dialog" style="display: none;">
    <div class="modal-dialog modal-sm">
        <form id="frm-autorizacion">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="pdfmodal-title">Autorizacion</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                </div>
                <div class="modal-body" id="pdfmodal-content">
                    <div class="row">
                        <div class="col-12 col-xl-12">
                            <div class="form-group">
                                <label class="">Usuario</label>
                                <input type="text" class="form-control" name="usuario" id="usuario" placeholder="Usuario">
                            </div>
                        </div>
                        <div class="col-12 col-xl-12">
                            <div class="form-group">
                                <label class="">Contraseña</label>
                                <input type="password" class="form-control" name="password" id="password" placeholder="Contraseña">
                            </div>
                        </div>
                    </div>
                </div> <!-- / .modal-body -->
                <div class="modal-footer">
                    <button type="submit" class="btn btn-success">Enviar</button>
                </div>
            </div> <!-- / .modal-content -->
        </form>
    </div> <!-- / .modal-dialog -->
</div> <!-- /.modal -->
</div>
<asset:javascript src="cuadre_general.js"/>
</body>
</html>
