<%--
  Created by IntelliJ IDEA.
  User: JQ
  Date: 14/11/2019
  Time: 10:09 a. m.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Menube web</title>
</head>
<body>


<div class="row">
    <div class="col-md-12 col-xl-5 col-12">
        <div class="card">
            <div class="card-header"><b>Desloguear Usuarios</b>
            </div>
            <div class="card-body" id="frm">
                <div class="row">
                    <div class="col-12 mb-2">
                        <div class="btn-group pull-right" role="group" aria-label="Basic example">
                            <button type="button" class="btn btn-primary" id="btn-actualizar" onclick="crearTabla()"><i
                                    class="fa font-2xl d-block mt-2 fa-refresh"></i> Actualizar</button>
                        </div>
                    </div>
                    <div class="col-12 mb-2">
                         <div id="tabla_datos"></div>
                    </div>
                </div>

            </div>
        </div>
    </div>
</div>

</div>
%{--<asset:javascript src="cuadre_caja.js"/>--}%
<asset:javascript src="logoutSession.js"/>
</body>
</html>
