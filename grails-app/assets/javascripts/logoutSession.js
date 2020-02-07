$(document).ready(function () {
  crearTabla();
})();

function crearTabla() {
    $.ajax({
        url: window.location + '/getSessionesActivas',
        type: 'POST',
        dataType: 'json',
        success: function(response) {
            var json  = eval(response);
            var source =
                {
                    datatype: "json",
                    localdata: json,
                    datafields: [
                        { name: 'f_token', type: 'string' },
                        { name: 'f_usuario', type: 'string' },
                        { name: 'f_fecha', type: 'string' },
                        { name: 'f_ip', type: 'string' },
                        { name: 'f_cerrar' },
                    ]
                };
            var cellsrenderer = function (row, columnfield, value, defaulthtml, columnproperties, rowdata) {
                return `
            <button class="btn btn-danger btn-block p-2 "  onclick="logount('${rowdata.f_token}')">Cerrar</button>
            `;
            }
            var dataAdapter = new $.jqx.dataAdapter(source);
            // initialize jqxGrid
            $("#tabla_datos").jqxGrid(
                {
                    width: "100%",
                    theme: "metro",
                    source: dataAdapter,
                    pageable: true,
                    autoheight: false,
                    sortable: true,
                    altrows: true,
                    enabletooltips: true,
                    editable: false,
                    selectionmode: 'singlerow',
                    rowsheight: 40,
                    columns: [
                        { text: 'Token', datafield: 'f_token', width: "35%" },
                        { text: 'Usuario',  datafield: 'f_usuario',  width: "10%" },
                        { text: 'Fecha',  datafield: 'f_fecha',  width: "15%" },
                        { text: 'IP/IMEI', datafield: 'f_ip',
                            // cellsrenderer: cellsrenderer,
                            width: "20%"
                        },
                        { text: 'CERRAR', datafield: 'f_cerrar',
                            cellsrenderer: cellsrenderer,
                            width: "20%"
                        }
                    ]
                });

        }
    })

}

function logount(token) {
    $.ajax({
        url: window.location + '/logoutSessionByToken',
        type: 'POST',
        dataType: 'json',
        data:{f_token:token},
        success: function(response) {
            if (response){
                toastr.success("Datos guardados Correctamente");
                crearTabla();
            }else{
                toastr.error("Ocurrio un Error al Intentar Eliminar la Sesión")
            }

        }
    })
}
