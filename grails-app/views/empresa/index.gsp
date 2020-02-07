<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>

<body>
<div class="row">
    <div class="col-12 col-xl-8 col-md-8">
        <div class="card" id="frm">
            <div class="card-body">
                %{--<form id="frm">--}%
                <div class="row">
                    <div class="col-12">
                        <div class="form-group">
                            <label class="">
                                Fecha de operaciones
                                <i data-toggle="tooltip" title="Fecha contable del sistema"
                                   class="fa fa-question-circle" aria-hidden="true"></i>
                            </label>

                            <p class="form-control">${preferencias.fFechaInicioOperaciones.format('dd/MM/yyyy')}</p>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-12 mb-4">
                        <ul class="nav nav-tabs" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" data-toggle="tab" href="#general-tab" role="tab"
                                   aria-controls="home">
                                    <i class="icon-menu"></i> General</a>
                            </li>
                            %{--<li class="nav-item">--}%
                            %{--<a class="nav-link" data-toggle="tab" href="#horario-tab" role="tab" aria-controls="home">--}%
                            %{--<i class="icon-clock"></i> Horario</a>--}%
                            %{--</li>--}%
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="tab" href="#impresion-tab" role="tab"
                                   aria-controls="profile">
                                    <i class="icon-printer"></i> Impresion</a>
                            </li>
                            %{--<li class="nav-item">--}%
                            %{--<a class="nav-link" data-toggle="tab" href="#app-tab" role="tab" aria-controls="messages">--}%
                            %{--<i class="icon-screen-smartphone"></i> APP</a>--}%
                            %{--</li>--}%
                        </ul>

                        <div class="tab-content">
                            <div class="tab-pane active" id="general-tab" role="tabpanel">
                                <div class="row">
                                    <div class="col-12 col-xl-8 col-md-8">
                                        <div class="row">
                                            <div class="col-12 col-xl-6 col-md-6">
                                                <div class="form-group">
                                                    <label for="f_nombre" class="">Nombre</label>
                                                    <input id="f_idrecord" name="f_idrecord" hidden
                                                           value="${preferencias.id}" class="form-control" type="text">
                                                    <input id="f_logo" name="f_logo" hidden
                                                           value="${preferencias.fFoto != null ? preferencias.fFoto.toString().encodeAsBase64() : 0}"
                                                           class="form-control" type="text">

                                                    <input id="f_nombre" name="f_nombre" class="form-control"
                                                           type="text"
                                                           value="${preferencias.fNombre}">
                                                </div>
                                            </div>

                                            <div class="col-12 col-xl-6 col-md-6">
                                                <div class="form-group">
                                                    <label for="f_telefono" class="">Telefono</label>
                                                    <input id="f_telefono" name="f_telefono" class="form-control"
                                                           type="text"
                                                           value="${preferencias.fTelefono}">
                                                </div>
                                            </div>

                                            <div class="col-12 col-xl-6 col-md-6">
                                                <div class="form-group">
                                                    <label for="f_email" class="">E-mail</label>
                                                    <input id="f_email" name="f_email" class="form-control" type="email"
                                                           value="${preferencias.fEmail}">
                                                </div>
                                            </div>

                                            <div class="col-12 col-xl-6 col-md-6">
                                                <div class="form-group">
                                                    <label for="f_web" class="">Web</label>
                                                    <input id="f_web" name="f_web" class="form-control" type="text"
                                                           value="${preferencias.fWeb}">
                                                </div>
                                            </div>

                                            <div class="col-12 col-xl-4 col-md-6">
                                                <div class="form-group">
                                                    <label for="f_porciento_ley" class="">Porciento de ley</label>
                                                    <input id="f_porciento_ley" name="f_porciento_ley"
                                                           class="form-control" type="text"
                                                           value="${preferencias.fPorcientoLey}">
                                                </div>
                                            </div>

                                            <div class="col-12 col-xl-4 col-md-6">
                                                <div class="form-group">
                                                    <label for="f_pedidos_minimos" class="">Pedidos min. <i
                                                            data-toggle="tooltip"
                                                            title="Pedidos minimos que podran realizar los clientes."
                                                            class="fa fa-question-circle" aria-hidden="true"></i>
                                                    </label>
                                                    <input type="text" class="form-control" name="f_pedidos_minimos"
                                                           id="f_pedidos_minimos"
                                                           value="${preferencias.fPedidosMinimos}">
                                                </div>
                                            </div>


                                            <div class="col-12 col-xl-4 col-md-6">
                                                <div class="form-group">
                                                    <label for="f_precio_envio" class="">
                                                        Precio de envio
                                                        <i data-toggle="tooltip" title="Monto a cobrar por cada envio."
                                                           class="fa fa-question-circle" aria-hidden="true"></i>
                                                    </label>
                                                    <input type="text" id="f_precio_envio" name="f_precio_envio"
                                                           class="form-control"
                                                           value="${preferencias.fPrecioEnvio}">
                                                </div>
                                            </div>

                                            <div class="col-12 col-xl-5 col-md-6">
                                                <div class="form-group">
                                                    <label class="">
                                                        NCF por defecto
                                                    </label>
                                                    <select name="f_ncf_defecto_delivery" id="f_ncf_defecto_delivery"
                                                            class="form-control">
                                                        <g:each in="${comprobantes}">
                                                            <g:if test="${it.id == preferencias.fNcfDefectoDelivery}">
                                                                <option selected
                                                                        value="${it.id}">${it.fDescripcion}</option>
                                                            </g:if>
                                                            <g:else>
                                                                <option value="${it.id}">${it.fDescripcion}</option>
                                                            </g:else>
                                                        </g:each>
                                                    </select>
                                                </div>
                                            </div>

                                            <div class="col-12 col-xl-5 col-md-6">
                                                <div class="form-group">
                                                    <label class="">
                                                        Marca de Impresora
                                                    </label>
                                                    <select name="fTipoPapelImpresion" id="fTipoPapelImpresion"
                                                            class="form-control">
                                                        <g:each in="${tipos_impresora}">
                                                            <g:if test="${it.id == preferencias.fTipoPapelImpresion}">
                                                                <option selected
                                                                        value="${it.id}">${it.fDescripcion}</option>
                                                            </g:if>
                                                            <g:else>
                                                                <option value="${it.id}">${it.fDescripcion}</option>
                                                            </g:else>
                                                        </g:each>
                                                    </select>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-12 col-xl-4 col-md-4">

                                        <g:if test="${preferencias.fFoto != null && preferencias.fFoto.size() > 0}">
                                            <img src="${"data:imagen/*;base64, " + preferencias.fFoto.encodeAsBase64()}"
                                                 id="logo" alt="logo" style="width: 100%; height: auto;">

                                        </g:if>
                                        <g:else>
                                            <g:img dir="imagenes" id="logo" title="logo" alt="logo"
                                                   file="no-image-icon.png" style="width: 100%; height: auto;"/>

                                        </g:else>
                                        <div id="fotoUpload">
                                        </div>
                                    </div>
                                </div>

                                <div class="row">

                                    <div class="col-12 col-xl-3 col-md-6">
                                        <div class="form-group">
                                            <label for="f_impuesto_incluido" class="">Impuesto incluido</label>
                                            %{--<input  class="form-control" type="text">--}%
                                            <div class="form-check checkbox">

                                                <g:if test="${preferencias.fImpuestoIncluido}">
                                                    <input class="form-check-input" id="f_impuesto_incluido"
                                                           name="f_impuesto_incluido" type="checkbox"
                                                           checked>
                                                </g:if>
                                                <g:else>
                                                    <input class="form-check-input" id="f_impuesto_incluido"
                                                           name="f_impuesto_incluido" type="checkbox">
                                                </g:else>
                                                <label class="form-check-label" for="f_impuesto_incluido"></label>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-12 col-xl-3 col-md-6">
                                        <div class="form-group">
                                            <label for="f_impresion_detalle_factura" class="">Impresion detallada <i
                                                    data-toggle="tooltip"
                                                    title="Tipo de impresion a utilizar cuando se imprimen las facturas de delivery"
                                                    class="fa fa-question-circle" aria-hidden="true"></i></label>
                                            %{--<input  class="form-control" type="text">--}%
                                            <div class="form-check checkbox">

                                                <g:if test="${preferencias.fImpresionDetalleFactura}">
                                                    <input class="form-check-input" id="f_impresion_detalle_factura"
                                                           name="f_impresion_detalle_factura" type="checkbox"
                                                           checked>
                                                </g:if>
                                                <g:else>
                                                    <input class="form-check-input" id="f_impresion_detalle_factura"
                                                           name="f_impresion_detalle_factura" type="checkbox">
                                                </g:else>
                                                <label class="form-check-label"
                                                       for="f_impresion_detalle_factura"></label>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-12 col-xl-3 col-md-6">
                                        <div class="form-group">
                                            <label for="f_cobrar_porciento_ley" class="">Perciento de ley <i
                                                    data-toggle="tooltip"
                                                    title="Control para autorizar el cobro por defecto del porciento de ley"
                                                    class="fa fa-question-circle" aria-hidden="true"></i></label>
                                            %{--<input  class="form-control" type="text">--}%
                                            <div class="form-check checkbox">

                                                <g:if test="${preferencias.fCobrarPorcientoLey}">
                                                    <input class="form-check-input" id="f_cobrar_porciento_ley"
                                                           name="f_cobrar_porciento_ley" type="checkbox"
                                                           checked>
                                                </g:if>
                                                <g:else>
                                                    <input class="form-check-input" id="f_cobrar_porciento_ley"
                                                           name="f_cobrar_porciento_ley" type="checkbox">
                                                </g:else>
                                                <label class="form-check-label" for="f_cobrar_porciento_ley"></label>
                                            </div>
                                        </div>
                                    </div>

                                    %{--<div class="col-4">--}%
                                    %{--<div class="form-group">--}%
                                    %{--<label for="f_tipo_negocio" class="">Tipo</label>--}%
                                    %{--<select class="form-control" name="f_tipo_negocio" id="f_tipo_negocio">--}%
                                    %{--</select>--}%
                                    %{--</div>--}%
                                    %{--</div>--}%
                                </div>

                                <div class="row">
                                    <div class="col-12"><hr></div>
                                </div>

                                <div class="row">
                                    <div class="col-12">
                                        <div class="form-group">
                                            <label for="f_lema" class="">Slogan</label>
                                            <textarea class="form-control" name="f_lema"
                                                      id="f_lema">${preferencias.fLema}</textarea>
                                        </div>
                                    </div>

                                    <div class="col-12">
                                        <div class="form-group">
                                            <label for="f_direccion" class="">Direccion</label>
                                            <textarea class="form-control" name="f_direccion"
                                                      id="f_direccion">${preferencias.fDireccion}</textarea>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            %{--<div class="tab-pane" id="horario-tab" role="tabpanel">--}%
                            %{--<div class="row">--}%
                            %{--<div class="col-12">--}%
                            %{--<div id="tabla-horario"></div>--}%
                            %{--</div>--}%
                            %{--</div>--}%
                            %{--</div>--}%
                            <div class="tab-pane" id="impresion-tab" role="tabpanel">
                                <div class="row">
                                    <div class="col-12 mb-4">
                                        <h4 class="card-title">Configuracion de impresion</h4>
                                        <div id="tabla"></div>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="col-12 col-xl-6 col-md-6">
                                        <div class="form-group">
                                            <label for="f_header" class="">Encabezado de facturas</label>
                                            <textarea class="form-control" name="f_header"
                                                      id="f_header">${preferencias.fHeader}</textarea>
                                        </div>
                                    </div>

                                    <div class="col-12 col-xl-6 col-md-6">
                                        <div class="form-group">
                                            <label for="f_header_facturas_pequenas"
                                                   class="">Encabezado de facturas peq.</label>
                                            <textarea class="form-control" name="f_header_facturas_pequenas"
                                                      id="f_header_facturas_pequenas">${preferencias.fHeaderFacturasPequenas}</textarea>
                                        </div>
                                    </div>

                                    <div class="col-12 col-xl-6 col-md-6">
                                        <div class="form-group">
                                            <label for="f_mensaje_orden" class="">Mensaje de orden</label>
                                            <textarea class="form-control" name="f_mensaje_orden"
                                                      id="f_mensaje_orden">${preferencias.fMensajeOrden}</textarea>
                                        </div>
                                    </div>

                                    <div class="col-12 col-xl-6 col-md-6">
                                        <div class="form-group">
                                            <label for="f_mensaje_factura" class="">Mensaje de facturas</label>
                                            <textarea class="form-control" name="f_mensaje_factura"
                                                      id="f_mensaje_factura">${preferencias.fMensajeFactura}</textarea>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            %{--<div class="tab-pane" id="app-tab" role="tabpanel">--}%
                            %{--<div class="row">--}%
                            %{--<div class="col-12 col-xl-6 col-md-6">--}%
                            %{--<div class="form-group">--}%
                            %{--<label for="f_pedidos_minimos" class="">Pedidos minimos por cliente</label>--}%
                            %{--<input type="text" class="form-control" name="f_pedidos_minimos" id="f_pedidos_minimos"--}%
                            %{--value="${preferencias.fPedidosMinimos}"--}%
                            %{-->--}%
                            %{--</div>--}%
                            %{--</div>--}%
                            %{--</div>--}%

                            %{--<div class="row">--}%
                            %{--<div class="col-12">--}%
                            %{--<div id="map" style="width: 100%; height: 300px;" >--}%

                            %{--</div>--}%
                            %{--</div>--}%

                            %{--</div>--}%
                            %{--</div>--}%
                        </div>
                    </div>

                    <div class="col-12">
                        <button class="btn btn-primary btn-lg pull-right" id="btn" type="submit">Guardar</button>
                    </div>
                </div>
                %{--</form>--}%
            </div>
        </div>
    </div>

</div>
%{--<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCkkdDV3gtSvjHIZM_S1n2dFJ4NZ5RdAuw&callback=initMap"></script>--}%

<script async defer
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCkkdDV3gtSvjHIZM_S1n2dFJ4NZ5RdAuw&libraries=places">
</script>

<asset:javascript src="preferencias.js"/>

</body>
</html>
