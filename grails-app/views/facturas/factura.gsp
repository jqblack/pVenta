    <!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>
    <div class="row" id="content">
        <div class="col-12 col-md-12 col-xl-12">
            <div class="card">
                <div class="card-body">
                    <div class="row">
                        <div class="col-12">

                            <h4><i class="fa fa-user-o"></i> Info. Envio</h4>
                            <div class="row">

                                <div class="col-12 col-xl-3 col-md-4">
                                    <label class="control-label">Telefono: </label>
                                    <div class="form-group">
                                        <div class="controls">
                                            <div class="input-group">
                                                <input type="text" name="telefono" id="telefono" placeholder="Telefono" class="form-control">
                                                <input type="text" name="f_idcliente" id="f_idcliente" hidden value="0">
                                                <span class="input-group-append">
                                                    <button
                                                            class="btn btn-secondary"
                                                            id="btnbuscar"
                                                    >Buscar</button>
                                                </span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-12 col-md-4 col-xl-3">
                                    <label class="control-label">Nombre: </label>
                                    <div class="form-group">
                                        <input type="text" id="nombre" name="nombre" placeholder="Nombre" class="form-control">
                                    </div>
                                </div>
                                <div class="col-12 col-md-4 col-xl-3">
                                    <div class="form-group">
                                        <label class="control-label">Sector: </label>
                                        <select class="form-control" name="sector" id="sector">
                                            <option value="0">-Select-</option>
                                            <g:each in="${sectores}">
                                                <option  value="${it.id[1]}">${it[1].fSector}</option>

                                            </g:each>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-12 col-md-4 col-xl-3">
                                    <div class="form-group">
                                        <label class="control-label">Tipo NCF: </label>
                                        <select class="form-control" name="ncf" id="ncf">
                                            <option value="0">-Select-</option>
                                            <g:each in="${ncf}">
                                                <option  value="${it.id}">${it.fDescripcion}</option>
                                            </g:each>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-12">
                                    <label class="control-label">Direccion: </label>
                                    <div class="form-group">
                                        <textarea class="form-control" id="direccion" name="direccion"></textarea>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-12 mt-2">
                            <label class="control-label">Notas: </label>
                            <div class="form-group">
                                <textarea class="form-control" name="notas"></textarea>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
        <div class="col-12 col-md-6 col-xl-6" >
            <div class="card">
                <div class="card-body">
                    <div class="row">

                        <div class="col-6 col-md-6 col-xl-6" >
                            <h4><i class="icon-layers icons"></i> Categorias</h4>
                            <div
                                    class="list-group scroll-div"
                                    role="tablist"
                                    id="list-categoria"
                                    style="height: 50vh">

                            </div>
                        </div>
                        <div class="col-6 col-md-6 col-xl-6">
                            <h4><i class="icons cui-task"></i> Productos</h4>

                            <div class="tab-content" id="nav-tabContent">
                                <div
                                        class="tab-pane fade scroll-div"
                                        id="list-home"
                                        role="tabpanel"
                                        aria-labelledby="list-home-list"
                                        style="height:50vh">

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-12 col-md-6 col-xl-6">
            <div class="card">
                <div class="card-body">
                <div class="row">
                    <div class="col-12 mb-2">
                        <div class="btn-group pull-right" role="group" aria-label="Basic example">

                            <button type="button" class="btn btn-primary" id="btn"><i class=" font-2xl d-block mt-2 fa fa-file-text-o"></i> Generar orden</button>
                            <button type="button" class="btn btn-primary" id="btn-actualizar-ordenes-cerradas"><i class="fa font-2xl d-block mt-2 fa-refresh"></i> Cargar Ordenes Cerras</button>
                            <button type="button" class="btn btn-primary" id="btn-actualizar-ordenes"><i class="fa font-2xl d-block mt-2 fa-refresh"></i> Cargar Ordenes</button>
                        </div>
                    </div>
                </div>
                    <div class="row">
                        <div class="col-12" >
                            <h4><i class="icons cui-note"></i> Detalle</h4>
                        </div>
                        <div class="col-12">
                           <div class="row">
                               <div class="col-12 my-2" style="height: 48vh;">
                                   <div id="tabla"></div>
                               </div>
                           </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-12 col-xl-12 mb-3">
            %{--<button id="btn" class="btn btn-block btn-success btn-lg">Generar</button>--}%
        </div>

    </div>

<div class="modal fade" id="buscar_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">Buscar Direccion</h4>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-12 col-md-12">
                        <form id="frmBuscar">
                            <div class="input-group mb-3">
                                <input type="text" name="filtro" id="filtro" class="form-control" placeholder="Telefono" aria-label="Buscar direccion" aria-describedby="basic-addon2">
                                <div class="input-group-append">
                                    <button class="btn btn-info btn-sm" type="submit"><i class="fa fa-search fa-lg"></i></button>
                                </div>
                            </div>
                        </form>
                    </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 col-md-12">
                        <div id="tabla_resultado">

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
<asset:javascript src="validaciones.js"/>
<asset:javascript src="factura.js"/>
</body>
</html>
