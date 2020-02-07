<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>
<div class="row" id="content">
    <div class="col-12 col-md-8 col-xl-8 col-lg-8">
        <div class="card">
            <div class="card-body">
                %{--${session.idnodo.toString()}--}%
                <div class="row">
                    <div class="col-12 mb-2">
                        <div class="btn-group pull-right" role="group" aria-label="Basic example">
                            <button type="button" class="btn btn-secondary" id="btn-actualizar-ordenes-cerradas"><i class="fa fa-refresh"></i> Cargar Ordenes Cerras</button>
                            <button type="button" class="btn btn-secondary" id="btn-actualizar-ordenes"><i class="fa fa-refresh"></i> Cargar Ordenes</button>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12">
                        <div id="tabla">
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-4">
                        <div class="callout callout-info">
                            <small class="text-muted">Pedidos</small>
                            <br>
                            <strong class="h4 text-success" id="count_pedidos"></strong>
                        </div>
                    </div>

                    <div class="col-sm-4">
                        <div class="callout callout-info">
                            <small class="text-muted">Monto cerrado</small>
                            <br>
                            <strong class="h4 text-success" id="monto_total_cerrado"></strong>
                        </div>
                    </div>
                    <div class="col-sm-4">
                        <div class="callout callout-info">
                            <small class="text-muted">Monto total</small>
                            <br>
                            <strong class="h4 text-success" id="monto_total"></strong>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-12 col-md-4 col-xl-4 col-lg-4" id="detalle-pedido">
    </div>
</div>

<div class="modal fade" id="asignar-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">Mensajeros</h4>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">

                <div class="row">
                    <div class="col-12 col-md-12">
                        <div id="tabla_mensajeros">
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cerrar</button>
            </div>
        </div>
        <!-- /.modal-content-->
    </div>
    <!-- /.modal-dialog-->
</div>

<asset:javascript src="pedidos.js"/>

</body>
</html>
