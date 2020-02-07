
<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>
<div class="row ">
    <div class="col-md-6 col-xl-6 col-12">
        <div class="card">
            <div class="card-header"><b>Mensajeros</b>
            </div>
            <div class="card-body">
                <div class="row">
                    <div class="col-12 col-md-12">
                        <form id="frmBuscarCamareros">
                            <div class="input-group mb-3">
                                <input type="text" name="filtro" id="filtro" class="form-control" placeholder="Buscar" aria-label="Buscar Producto" aria-describedby="basic-addon2">
                                <div class="input-group-append">
                                    <button class="btn btn-info btn-sm"><i class="fa fa-search fa-lg"></i></button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 col-md-12">
                        <div id="camarero_grid">

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-md-6">
        <div class="card">
            <div class="card-header"><b>Datos Mensajero</b>
            </div>
            <div class="card-body" id="frm">
               <div class="row">
                    <div class="col-12 col-md-6 col-xl-6">
                       <div class="form-group">
                           <label class="control-label">Nombre</label>
                           <input type="text" class="form-control" name="f_nombre" id="f_nombre">
                           <input type="text" class="form-control" name="id" id="id" value="0" hidden>
                       </div>
                    </div>
                   <div class="col-12 col-md-4 col-xl-6">
                       <div class="form-group">
                           <label class="control-label">Email</label>
                           <input type="email" class="form-control" name="f_email" id="f_email">
                       </div>
                   </div>
               </div>
                <div class="row">
                    <div class="col-12 col-md-6 col-xl-4">
                       <div class="form-group">
                           <label class="control-label">Telefono</label>
                           <input type="text" class="form-control" name="f_telefono" id="f_telefono">
                       </div>
                    </div>
                    <div class="col-12 col-md-4 col-xl-4">
                       <div class="form-group">
                           <label class="control-label">Zona </label>
                           <select type="email" class="form-control" name="f_zona" id="f_zona">
                               <option value="0">-Select-</option>
                               <g:each in="${zonas}" >
                                   <option value="${it.id}">${it.fNombreZona}</option>
                               </g:each>
                           </select>
                       </div>
                    </div>
                    <div class="col-12 col-md-4 col-xl-4">
                        <div class="form-group">
                            <label class="control-label">Device</label>
                            <input type="email" class="form-control" name="f_device" id="f_device">
                        </div>
                    </div>
                </div>
            </div>
            <div class="card-footer text-right">
                <button class="btn btn-sm btn-primary" id="guardar" type="submit">Guardar</button>
                <button class="btn btn-sm btn-secondary" id="btnNuevo" type="submit">Nuevo</button>
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

            </div>
            <div class="modal-footer">
                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cerrar</button>
            </div>
        </div>
        <!-- /.modal-content-->
    </div>
    <!-- /.modal-dialog-->
</div>
<asset:javascript src="mensajero.js"/>

${perfiles}
</body>
</html>
