package manube_v2

import grails.converters.JSON
import grails.gorm.transactions.Transactional
import groovyx.net.http.ContentType
import groovyx.net.http.HTTPBuilder
import groovyx.net.http.HttpResponseDecorator

import static groovyx.net.http.ContentType.URLENC

import java.text.SimpleDateFormat

@Transactional
class HelperService {

    FuncionesSQLService funcionesSQLService

    def permisosUsuarios() {
        Map<String, Object> permiso
        List<Object> permisos = new ArrayList<Object>()

        permiso = new HashMap<String, Object>()
        permiso.put("nombre", "fActivo")
        permiso.put("valor", false)
        permiso.put("label", "Activo")
        permisos.add(permiso)

//        permiso = new HashMap<String, Object>()
//        permiso.put("nombre", "fCamarero")
//        permiso.put("valor", false)
//        permiso.put("label", "Camarero")
//        permisos.add(permiso)

        permiso = new HashMap<String, Object>()
        permiso.put("nombre", "fCambioPrecio")
        permiso.put("valor", false)
        permiso.put("label", "Cambio de precio")
        permisos.add(permiso)

        permiso = new HashMap<String, Object>()
        permiso.put("nombre", "fActivarPedidos")
        permiso.put("valor", false)
        permiso.put("label", "Activar los pedidos del APP")
        permisos.add(permiso)

        permiso = new HashMap<String, Object>()
        permiso.put("nombre", "fAbrirCaja")
        permiso.put("valor", false)
        permiso.put("label", "Abrir caja")
        permisos.add(permiso)

        permiso = new HashMap<String, Object>()
        permiso.put("nombre", "fAnularLinea")
        permiso.put("valor", false)
        permiso.put("label", "Anular Linea")
        permisos.add(permiso)

        permiso = new HashMap<String, Object>()
        permiso.put("nombre", "fDescuento")
        permiso.put("valor", false)
        permiso.put("label", "Descuento")
        permisos.add(permiso)

        permiso = new HashMap<String, Object>()
        permiso.put("nombre", "fFacturaCredito")
        permiso.put("valor", false)
        permiso.put("label", "Factura a credito")
        permisos.add(permiso)

        permiso = new HashMap<String, Object>()
        permiso.put("nombre", "fCuadre")
        permiso.put("valor", false)
        permiso.put("label", "Cuadre")
        permisos.add(permiso)

        permiso = new HashMap<String, Object>()
        permiso.put("nombre", "fEstadoCaja")
        permiso.put("valor", false)
        permiso.put("label", "Estado de caja")
        permisos.add(permiso)

        permiso = new HashMap<String, Object>()
        permiso.put("nombre", "fFacturaOficial")
        permiso.put("valor", false)
        permiso.put("label", "Factura Oficial")
        permisos.add(permiso)

        permiso = new HashMap<String, Object>()
        permiso.put("nombre", "fRecibo")
        permiso.put("valor", false)
        permiso.put("label", "Recibo")
        permisos.add(permiso)

        permiso = new HashMap<String, Object>()
        permiso.put("nombre", "fTaxfree")
        permiso.put("valor", false)
        permiso.put("label", "Tax Free")
        permisos.add(permiso)

        permiso = new HashMap<String, Object>()
        permiso.put("nombre", "fAnularFactura")
        permiso.put("valor", false)
        permiso.put("label", "Anular Factura")
        permisos.add(permiso)

        permiso = new HashMap<String, Object>()
        permiso.put("nombre", "fPorcientoLey")
        permiso.put("valor", false)
        permiso.put("label", "Porcierto de Ley")
        permisos.add(permiso)

        permisos

    }

    def tiposUsuarios() {

        Map<String, Object> tipo
        List<Object> tipos = new ArrayList<Object>()

        tipo = new HashMap<String, Object>()
        tipo.put("valor", 1)
        tipo.put("label", "Cajero")
        tipos.add(tipo)

        tipo = new HashMap<String, Object>()
        tipo.put("valor", 2)
        tipo.put("label", "Camarero")
        tipos.add(tipo)

        tipo = new HashMap<String, Object>()
        tipo.put("valor", 3)
        tipo.put("label", "Delivery")
        tipos.add(tipo)

        tipo = new HashMap<String, Object>()
        tipo.put("valor", 4)
        tipo.put("label", "Administracion")
        tipos.add(tipo)

        tipo = new HashMap<String, Object>()
        tipo.put("valor", 5)
        tipo.put("label", "Cocinero")
        tipos.add(tipo)

        tipos

    }

    def stringToDate(String fecha) {
        //Formato a recibir 2018-10-04T04:00:00.000Z
        return new SimpleDateFormat("yyyy-MM-dd").parse(fecha.toString().substring(0, 10))
    }

    Map sendMessageToPrint(Map request) {
        Map respuesta = [f_key: 0, f_mensaje: ""]
        String paramsEncodedB64 = (request as JSON).encodeAsBase64()
        final MSJ_ENVIADO_EXITOSAMENTE = "Mensaje enviado exitosamente"
        final MSJ_TOKEN_ERRONEO = "Token (Key) erróneo"
        final MSJ_ERROR_SESSION_CLIENTE_NO_EXISTE = "La sesión del cliente no existe."
        final MSJ_ERROR_ENVIANDO_MENSAJE = "Error enviando mensaje"
        final MSJ_ERROR_PARAMETROS_INVALIDOS = "Parámetros Inválidos"
        final MSJ_ERROR_DEFAULT = "SIN RESPUESTA"

        try {

            def http = new HTTPBuilder("https://printserverjq.com/")
            http.post(path: "jqsocket/app/send_message", body: [json: paramsEncodedB64], requestContentType: ContentType.URLENC) { HttpResponseDecorator response, InputStreamReader reader ->
                println("POST  ${response.statusLine}")
                Map rs = [f_data: "", f_key: 0, mensaje: ""]
                rs = JSON.parse(new String(reader.getText().decodeBase64())) as Map

                switch (rs.f_key as Integer) {
                    case 1:
                        respuesta.f_key = rs.f_key
                        respuesta.f_mensaje = MSJ_ENVIADO_EXITOSAMENTE
                        break
                    case -1:
                        respuesta.f_key = rs.f_key
                        respuesta.f_mensaje = MSJ_TOKEN_ERRONEO
                        break
                    case -2:
                        respuesta.f_key = rs.f_key
                        respuesta.f_mensaje = MSJ_ERROR_SESSION_CLIENTE_NO_EXISTE
                        break
                    case -3:
                        respuesta.f_key = rs.f_key
                        respuesta.f_mensaje = MSJ_ERROR_ENVIANDO_MENSAJE
                        break
                    case -4:
                        respuesta.f_key = rs.rs.f_key
                        respuesta.f_mensaje = MSJ_ERROR_PARAMETROS_INVALIDOS
                        break
                    default:
                        respuesta.f_key = rs.rs.f_key
                        respuesta.f_mensaje = MSJ_ERROR_DEFAULT
                        break
                }
            }
            return respuesta

        } catch (Exception e) {
            e.printStackTrace()
        }
        return respuesta
    }

    Map getCurrentConfigToPrint(List listaConfiguracion, Long idproceso) {

        Map configChanged

        listaConfiguracion.each { row ->

            if (row.idproceso as Integer == idproceso) {
                configChanged = funcionesSQLService.getPrintconfig(row.idconfiguracion as Long)
            }
        }



        println("HelperService");


        configChanged

    }
}
