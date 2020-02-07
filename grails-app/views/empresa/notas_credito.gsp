<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>
<div class="row">
    <div class="col-6">
        <div class="card">
            <div class="card-header"><b>Notas de credito</b>
            </div>
            <div class="card-body" id="frmCliente">
                %{--<form class="form-horizontal">--}%
                <div class="row">
                    <div class="col-12 col-md-8 col-xl-8">
                        <div class="card">
                            <div class="card-body">
                                <div class="form-group col-12">
                                    <label class="col-form-label">Cliente</label>
                                    <div class="input-group">
                                        <input class="form-control " id="nombre" name="nombre" type="text" placeholder="Nombre" onkeyup="is_enter(event)">
                                        <input class="form-control " id="id" name="id" type="number" hidden>
                                        <div class="input-group-append">
                                            <button class="btn btn-sm btn-outline-primary" data-toggle="modal" data-target="#cliente_modal" type="button" id="btnBuscar">Buscar</button>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group col-12">
                                    <label class="col-form-label">Direccion</label>
                                    <input type="text" class="form-control" id="direccion" name="direccion">
                                </div>
                                <div class="col-12">
                                    <div class="input-group mb-3">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text">Monto</span>
                                        </div>
                                        <input type="text" class="form-control font-weight-bold text-right" placeholders="0.00" name="monto" id="monto" disabled>
                                    </div>
                                </div>
                                <div class="col-12">
                                    <div class="input-group mb-3">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text">Monto de nota</span>
                                        </div>
                                        <input type="text" class="form-control font-weight-bold text-right" placeholder="0.00" name="monto_pagar" id="monto_pagar">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12">
                        <div id="tabla">
                        </div>
                    </div>
                </div>
            </div>
            <div class="card-footer text-right">
                <div class="row">
                    <div class="col-12 mb-2">
                        <div class="btn-group pull-right" role="group" aria-label="Basic example">
                            <button type="button" class="btn btn-primary" id="btn-toolbar-abonar"><i class="icons font-2xl d-block mt-2 fa fa-dollar"></i> Nota de Factura</button>
                            <button type="button" class="btn btn-primary" id="btn-toolbar-saldar"><i class="icons font-2xl d-block mt-2 fa fa-dollar"></i>Nota de cuentas</button>
                            <button type="button" class="btn btn-secondary" id="btnNuevo"><i class="icons font-2xl d-block mt-2 fa fa-repeat"></i>Nuevo</button>
                        </div>
                    </div>
                </div>
                %{--<button class="btn btn-sm btn-primary" id="guardar" type="submit">Guardar</button>--}%
                %{--<button class="btn btn-sm btn-secondary" id="btnNuevo" type="submit">Nuevo</button>--}%
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="cliente_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-md" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">Buscar Cliente</h4>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-12 col-md-12">
                        <form id="frmBuscarCliente">
                            <div class="input-group mb-3">
                                <input type="text" name="filtro" id="filtro" class="form-control" placeholder="Buscar cliente" aria-label="Buscar Producto" aria-describedby="basic-addon2">
                                <div class="input-group-append">
                                    <button class="btn btn-info btn-sm"><i class="fa fa-search fa-lg"></i></button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>

                <div class="row">
                    <div class="col-12 col-md-12">
                        <div id="cliente_grid">

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

<div class="modal fade" id="abono-cuenta-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-md" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">Pago a Factura</h4>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-12 col-md-12">
                        <form id="frmAbono">
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fa fa-hashtag total-input"></i></span>
                                </div>
                                <input type="text" class="form-control font-weight-bold text-right total-input" placeholder="0.00" disabled name="abono-factura" id="abono-factura">
                                <input type="hidden" class="form-control font-weight-bold text-right total-input" name="f_idrecord" id="f_idrecord">
                            </div>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fa fa-dollar total-input"></i></span>
                                </div>
                                <input type="text" class="form-control font-weight-bold text-right total-input" placeholder="0.00" disabled name="abono-balance" id="abono-balance">
                            </div>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fa fa-dollar total-input"></i></span>
                                </div>
                                <input type="text" class="form-control font-weight-bold text-right total-input" placeholder="0.00" name="abono-pago" id="abono-pago" oninput="validar_numero(event,this.id)">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button class="btn btn-primary" type="button" id="btn-abono-pagar">Guardar</button>
            </div>
        </div>
        <!-- /.modal-content-->
    </div>
    <!-- /.modal-dialog-->
</div>
<asset:javascript src="notas_credito.js"/>

${perfiles}
</body>
</html>
