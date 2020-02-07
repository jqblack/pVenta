package FuncionesGenerales

import grails.core.GrailsApplication
import grails.util.Holders
import org.springframework.beans.BeansException
import org.springframework.context.ApplicationContext

class Funciones {


    public static <T> T getClass(final Class<T> clazz) throws BeansException {
        ApplicationContext context = getApplicationContext()
        T res = context.getBean(clazz)
        return res
    }

    public static ApplicationContext getApplicationContext() {
        GrailsApplication application = Holders.getGrailsApplication()
        ApplicationContext res = application.getMainContext()
        return res
    }

    def String crearJSON(String[] campos, String[] datos) {
        String json;
        json = "{";

        for (int i = 0; i < campos.size(); i++) {
            json = json + "'${campos[i]}'";
            json = json + ":";
            json = json + "'${datos[i]}'";
            if (i < campos.size() - 1) {
                json = json + ",";
            }
        }
        json = json + "}";
        return json.toString();
    }

    public String Asignar_tres_puntos(String valor, Integer tamano) {
        Integer valortamano = valor.trim().length();

        if (valortamano >= tamano) {
            valor = valor.substring(0, valortamano - 3) + "...";
        }

        return valor;
    }

    public String RellenarString(String valor, Integer tamano) {
        Integer valortamano = valor.length();

        if (valortamano > tamano) {
            valor = valor.substring(0, tamano);
        }

        if (valortamano < tamano) {

            valor = String.format("%1\$-" + tamano.toString() + "s", valor);
        }

        return valor;
    }


    public String titulo(String parametro, int limite) {
        String espacio = " ", total = "";
        double cal;
        if (limite == 0) {
            limite = 40;
        }

        if (parametro.length() < limite) {
            cal = limite - parametro.length();
            cal = cal / 2;

            for (int i = 0; i < Math.round(cal); i++) {
                total = espacio + total;
            }
            parametro = total + parametro;
            return parametro;
        } else {
            return parametro;
        }
    }

    public String addLine(String parametro, int limite) {
        String linea = "";
        if (limite == 0) {
            limite = 40;
        }
        for (int i = 0; i < limite; i++) {
            linea = linea + parametro;
        }
        return linea;
    }

    public String A_La_Derecha(String parametro, int limite) {
        String espacio = " ", a = "";
        if (limite == 0) {
            limite = 40;
        }
        for (int i = 0; i < (limite - parametro.length()); i++) {
            a = a + espacio;
        }
        parametro = a + parametro;
        return parametro;
    }

    String GenerarStringFacturaImprimirTermica(List json, String tipo_printer, String accion) throws IOException {

        PrinterESC p;
        int columna;

        if (tipo_printer.equals("1")) {
            p = new PrinterStar();
            columna = 47;
        } else {
            p = new PrinterEpson();
            columna = 43;
        }
//        if (tipo_printer.equals("1")) {
//            p = new PrinterStar();
//            columna = 47;
//        } else {
//            p = new PrinterEpson();
//            columna = 43;
        //   }

        List data = json

        String header_factura = "";
        String datosprincipales = "";
        String numero_factura = "";
        String datos_totales = "";

        Integer linieasAlDerecha = 10
        Integer lineaTotalesAlaDerecha = 37

        //LLENAMOS EL HEADER

        numero_factura = data.first().f_numero.toString();
        header_factura += p.doubleHeight(true) + p.emphasized(true) + titulo(data.first().f_nombre_empresa.toString().toUpperCase(), columna) + p.emphasized(false) + p.doubleHeight(false) + "\n";
        header_factura += data.first().f_header_factura_pequena.toString() + "\n\n";

        if (!accion.equals("")) {
            accion += !data.first().titulo_impresion.toString().equals("") ? " - " + data.first().titulo_impresion.toString() : ''
        } else {
            accion = !data.first().titulo_impresion.toString().equals("") ? data.first().titulo_impresion.toString() : ''
        }

        if (!data.first().f_rnc.equals("")) {
            accion = "Factura de credito fiscal"
        }

        header_factura += p.emphasized(true) + p.doubleHeight(true) + titulo(accion, columna) + p.doubleHeight(false) + p.emphasized(false) + "\n";

        //}

        if (data.first().f_mesa != null) {
            datosprincipales += p.emphasized(true) + "Mesa : " + p.emphasized(false) + data.first().f_mesa + "\n";
        }

        if (!data.first().f_rnc.equals("")) {
            datosprincipales += p.emphasized(true) + "RNC : " + p.emphasized(false) + data.first().f_rnc + "\n";
        }
        if (!data.first().f_razon_social.equals("")) {
            datosprincipales += p.emphasized(true) + "Razon Social : " + p.emphasized(false) + data.first().f_razon_social + "\n";
        }

        datosprincipales += p.emphasized(true) + "Numero : " + p.emphasized(false) + data.first().f_numero.toString() + "\n";
        datosprincipales += p.emphasized(true) + "Cajero : " + p.emphasized(false) + data.first().f_cajero.toString() + "\n";

        if (!data.first().f_mensajero.toString().equals("")) {
            datosprincipales += p.emphasized(true) + "Mensajero : " + p.emphasized(false) + data.first().f_mensajero.toString() + "\n";
        }

        if (data.first().f_camarero != null) {
            datosprincipales += p.emphasized(true) + "Camarero : " + p.emphasized(false) + data.first().f_camarero.toString() + "\n";

        }

        datosprincipales += p.emphasized(true) + "Fecha : " + p.emphasized(false) + data.first().f_fecha_registro_factura.toString() + "\n";

        if (!data.first().f_cliente.toString().equals("") && data.first().f_cliente.toString() != null && !data.first().f_cliente.toString().equals("null")) {
            datosprincipales += p.emphasized(true) + "Cliente : " + p.emphasized(false) + data.first().f_cliente.toString() + "\n";
        }

        if (!data.f_numero_ncf.first().toString().equals("") && !data.f_numero_ncf.first().toString().isEmpty()) {
            datosprincipales += p.emphasized(true) + "NCF : " + p.emphasized(false) + data.first().f_numero_ncf.toString() + "\n";
        }

        if (!data.first().f_rnc.equals("")) {
            datosprincipales += p.emphasized(true) + "Vencimiento Secuencia : " + p.emphasized(false) + data.first().f_fecha_vigencia_ncf.toString();
        }

        //LLENAMOS LOS DATOS TOTALES
        if (data.first().f_impresion_detalle_factura && data.first().f_modulo == 3) {
            //datos_totales += p.emphasized(true) + A_La_Derecha("Sub-Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_subtotal.toString(), 2), linieasAlDerecha) + "\n";

            // datos_totales += p.emphasized(true) + A_La_Derecha("ITBIS :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), linieasAlDerecha) + "\n";
            datos_totales += p.emphasized(true) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), lineaTotalesAlaDerecha) + p.emphasized(true) + A_La_Derecha(Round(data.first().f_total.toString(), 2), linieasAlDerecha) + "\n\n"

            datos_totales += p.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.emphasized(true) + A_La_Derecha("Delivery :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_precio_envio.first().toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_envio.toString(), 2), linieasAlDerecha) + p.doubleHeight(false) + "\n";

        } else if (data.first().f_modulo == 2) {
            datos_totales += p.emphasized(true) + A_La_Derecha("Sub-Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_subtotal.toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.emphasized(true) + A_La_Derecha("ITBIS :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), linieasAlDerecha) + "\n";

            //datos_totales += p.emphasized(true) + A_La_Derecha("Delivery :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_precio_envio.first().toString(), 2), linieasAlDerecha) + "\n";

            if (data.first().f_porciento_ley.toString().toBigDecimal() > 0) {
                datos_totales += p.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n";
                datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_porciento_ley.toString(), 2), linieasAlDerecha) + p.doubleHeight(false) + "\n";

            } else {
                datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_total.toString(), 2), linieasAlDerecha) + p.doubleHeight(false) + "\n";

            }

        } else {
            datos_totales += p.emphasized(true) + A_La_Derecha("Sub-Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_subtotal.toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.emphasized(true) + A_La_Derecha("ITBIS :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.emphasized(true) + A_La_Derecha("Delivery :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_precio_envio.first().toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_envio.toString(), 2), linieasAlDerecha) + p.doubleHeight(false) + "\n";

        }
        if (data.first().f_monto_efectivo.toString().toBigDecimal() > 0) {
            datos_totales += p.emphasized(true) + A_La_Derecha("Efectivo :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_monto_efectivo.toString(), 2), linieasAlDerecha) + "\n";

        }

        if (data.first().f_devuelta.toString().toBigDecimal() > 0) {
            datos_totales += p.emphasized(true) + A_La_Derecha("Cambio :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_devuelta.toString(), 2), linieasAlDerecha) + "\n";

        }

        if (parseDouble(data.first().f_monto_tarjeta.toString()) > 0) {
            datos_totales += p.emphasized(true) + A_La_Derecha("Tarjeta :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_monto_tarjeta.toString(), 2), linieasAlDerecha) + "\n";

        }
        if (parseDouble(data.first().f_propina.toString()) > 0) {
            datos_totales += p.emphasized(true) + A_La_Derecha("Propina :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_propina.toString(), 2), linieasAlDerecha) + "\n";

        }

        datos_totales += addLine("_", columna) + "\n";
        datos_totales += p.emphasized(true) + "OBSERVACION :" + p.emphasized(false) + "\n";
        datos_totales += titulo(data.first().f_observacion.toString(), columna) + "\n";
        datos_totales += p.emphasized(true) + "DIRECCION :" + p.emphasized(false) + "\n";
        datos_totales += p.emphasized(false) + titulo(data.first().f_direccion.toString(), columna) + "\n";
        datos_totales += addLine("_", columna) + "\n";
        datos_totales += titulo(data.first().f_mensaje_orden.toString(), columna) + "\n";
        datos_totales += A_La_Derecha(data.first().f_web.toString(), columna) + "\n";

        p.setText(header_factura);
        //p.setText("\n");
        p.setText(datosprincipales);
        p.setText("\n");


        p.setText(p.emphasized(true));
        p.setText(addLine("=", columna) + "\n");
        p.setText(RellenarString("CANT", 8));
        p.setText(RellenarString("DESCRIPCION", 22));
        p.setText(A_La_Derecha("TAX", 7));
        p.setText(RellenarString("", 3));
        p.setText(A_La_Derecha("PRECIO", 7) + "\n");
        p.setText(addLine("=", columna) + "\n");
        p.setText(p.emphasized(false));

        //VAMOS A AGREGAR EL DETALLE
        for (Map<String, Object> tupla : data) {

            p.setText(RellenarString(Round(tupla.get("f_cantidad"), 2), 8));
            p.setText(Asignar_tres_puntos(RellenarString(tupla.get("f_descripcion").toString(), 22), 22));
            p.setText(A_La_Derecha(Round(tupla.get("f_itebis_producto"), 2), 7));
            p.setText(RellenarString("", 3));
            p.setText(A_La_Derecha(Round(tupla.get("f_precio"), 2), 7));
            p.setText("\n");

            //EXTRAEMOS LOS COMPONENTES DE CADA PRODUCTO
            //String componentes = new String(Base64.decodeBase64(tupla.get("f_componentes").toString()));


            if (!tupla.get("f_componentes").toString().equals("") && !tupla.get("f_componentes").toString().equals("[]")) {
                Map map_componentes = JsonToMap(componentes);
                List<Map<String, Object>> list_componentes = (List<Map<String, Object>>) map_componentes.get("f_datos");

                for (Map<String, Object> tupla2 : list_componentes) {

                    p.setText(RellenarString("*" + Round(tupla2.get("f_cantidad"), 2), 8));
                    p.setText(Asignar_tres_puntos(RellenarString(tupla2.get("f_descripcion").toString(), 22), 22));
                    p.setText(A_La_Derecha(Round(tupla2.get("f_itebis_producto"), 2), 7));
                    p.setText(RellenarString("", 3));
                    p.setText(A_La_Derecha(Round(tupla2.get("f_monto_cobrar"), 2), 7));
                    p.setText("\n");

                }
            }

        }
        p.setText(addLine("-", columna));
        p.setText("\n");
        p.setText(datos_totales);
        p.setText("\n");

        p.setText(p.getBarcodeEscPosCode(numero_factura));
        p.cortar();

        //Imprimir(p.finalCommandSet().getBytes());

        return p.finalCommandSet()

    }

    String GenerarStringFacturaImprimirTermica(List json, String tipo_printer, String accion, Integer columna) throws IOException {

        PrinterESC p;

        if (tipo_printer.equals("1")) {
            p = new PrinterStar();
        } else {
            p = new PrinterEpson();
        }



        List data = json



        String header_factura = "";
        String datosprincipales = "";
        String numero_factura = "";
        String datos_totales = "";

        Integer linieasAlDerecha = 10
        Integer lineaTotalesAlaDerecha = 21

        //LLENAMOS EL HEADER

        numero_factura = data.first().f_numero.toString();
        header_factura += p.doubleHeight(true) + p.emphasized(true) + titulo(data.first().f_nombre_empresa.toString().toUpperCase(), columna) + p.emphasized(false) + p.doubleHeight(false) + "\n";
        header_factura += data.first().f_header_factura_pequena.toString() + "\n\n";

        if (!accion.equals("")) {
            accion += !data.first().titulo_impresion.toString().equals("") ? " - " + data.first().titulo_impresion.toString() : ''
        } else {
            accion = !data.first().titulo_impresion.toString().equals("") ? data.first().titulo_impresion.toString() : ''
        }

        if (!data.first().f_rnc.equals("")) {
            accion = "Factura de credito fiscal"
        }

        header_factura += p.emphasized(true) + p.doubleHeight(true) + titulo(accion, columna) + p.doubleHeight(false) + p.emphasized(false) + "\n";

        //}

        if (data.first().f_mesa != null) {
            datosprincipales += p.emphasized(true) + "Mesa : " + p.emphasized(false) + data.first().f_mesa + "\n";
        }

        if (!data.first().f_rnc.equals("")) {
            datosprincipales += p.emphasized(true) + "RNC : " + p.emphasized(false) + data.first().f_rnc + "\n";
        }
        if (!data.first().f_razon_social.equals("")) {
            datosprincipales += p.emphasized(true) + "Razon Social : " + p.emphasized(false) + data.first().f_razon_social + "\n";
        }

        datosprincipales += p.emphasized(true) + "Numero : " + p.emphasized(false) + data.first().f_numero.toString() + "\n";
        datosprincipales += p.emphasized(true) + "Cajero : " + p.emphasized(false) + data.first().f_cajero.toString() + "\n";

        if (!data.first().f_mensajero.toString().equals("")) {
            datosprincipales += p.emphasized(true) + "Mensajero : " + p.emphasized(false) + data.first().f_mensajero.toString() + "\n";
        }

        if (data.first().f_camarero != null) {
            datosprincipales += p.emphasized(true) + "Camarero : " + p.emphasized(false) + data.first().f_camarero.toString() + "\n";

        }

        datosprincipales += p.emphasized(true) + "Fecha : " + p.emphasized(false) + data.first().f_fecha_registro_factura.toString() + "\n";

        if (!data.first().f_cliente.toString().equals("") && data.first().f_cliente.toString() != null && !data.first().f_cliente.toString().equals("null")) {
            datosprincipales += p.emphasized(true) + "Cliente : " + p.emphasized(false) + data.first().f_cliente.toString() + "\n";
        }

        if (!data.f_numero_ncf.first().toString().equals("") && !data.f_numero_ncf.first().toString().isEmpty()) {
            datosprincipales += p.emphasized(true) + "NCF : " + p.emphasized(false) + data.first().f_numero_ncf.toString() + "\n";
        }

        if (!data.first().f_rnc.equals("")) {
            datosprincipales += p.emphasized(true) + "Vencimiento Secuencia : " + p.emphasized(false) + data.first().f_fecha_vigencia_ncf.toString();
        }

        //LLENAMOS LOS DATOS TOTALES
        if (data.first().f_impresion_detalle_factura && data.first().f_modulo == 3) {
            //datos_totales += p.emphasized(true) + A_La_Derecha("Sub-Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_subtotal.toString(), 2), linieasAlDerecha) + "\n";

            // datos_totales += p.emphasized(true) + A_La_Derecha("ITBIS :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), linieasAlDerecha) + "\n";
            datos_totales += p.emphasized(true) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), lineaTotalesAlaDerecha) + p.emphasized(true) + A_La_Derecha(Round(data.first().f_total.toString(), 2), linieasAlDerecha) + "\n\n"

            datos_totales += p.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.emphasized(true) + A_La_Derecha("Delivery :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_precio_envio.first().toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_envio.toString(), 2), linieasAlDerecha) + p.doubleHeight(false) + "\n";

        } else if (data.first().f_modulo == 2) {
            datos_totales += p.emphasized(true) + A_La_Derecha("Sub-Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_subtotal.toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.emphasized(true) + A_La_Derecha("ITBIS :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), linieasAlDerecha) + "\n";

            //datos_totales += p.emphasized(true) + A_La_Derecha("Delivery :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_precio_envio.first().toString(), 2), linieasAlDerecha) + "\n";

            if (data.first().f_porciento_ley.toString().toBigDecimal() > 0) {
                datos_totales += p.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n";
                datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_porciento_ley.toString(), 2), linieasAlDerecha) + p.doubleHeight(false) + "\n";

            } else {
                datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_total.toString(), 2), linieasAlDerecha) + p.doubleHeight(false) + "\n";

            }

        } else {
            datos_totales += p.emphasized(true) + A_La_Derecha("Sub-Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_subtotal.toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.emphasized(true) + A_La_Derecha("ITBIS :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.emphasized(true) + A_La_Derecha("Delivery :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_precio_envio.first().toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_envio.toString(), 2), linieasAlDerecha) + p.doubleHeight(false) + "\n";

        }
        if (data.first().f_monto_efectivo.toString().toBigDecimal() > 0) {
            datos_totales += p.emphasized(true) + A_La_Derecha("Efectivo :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_monto_efectivo.toString(), 2), linieasAlDerecha) + "\n";

        }

        if (data.first().f_devuelta.toString().toBigDecimal() > 0) {
            datos_totales += p.emphasized(true) + A_La_Derecha("Cambio :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_devuelta.toString(), 2), linieasAlDerecha) + "\n";

        }

        if (parseDouble(data.first().f_monto_tarjeta.toString()) > 0) {
            datos_totales += p.emphasized(true) + A_La_Derecha("Tarjeta :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_monto_tarjeta.toString(), 2), linieasAlDerecha) + "\n";

        }
        if (parseDouble(data.first().f_propina.toString()) > 0) {
            datos_totales += p.emphasized(true) + A_La_Derecha("Propina :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_propina.toString(), 2), linieasAlDerecha) + "\n";

        }

        datos_totales += addLine("_", columna) + "\n";
        datos_totales += p.emphasized(true) + "OBSERVACION :" + p.emphasized(false) + "\n";
        datos_totales += titulo(data.first().f_observacion.toString(), columna) + "\n";
        datos_totales += p.emphasized(true) + "DIRECCION :" + p.emphasized(false) + "\n";
        datos_totales += p.emphasized(false) + titulo(data.first().f_direccion.toString(), columna) + "\n";
        datos_totales += addLine("_", columna) + "\n";
        datos_totales += titulo(data.first().f_mensaje_orden.toString(), columna) + "\n";
        datos_totales += A_La_Derecha(data.first().f_web.toString(), columna) + "\n";

        p.setText(header_factura);
        //p.setText("\n");
        p.setText(datosprincipales);
        p.setText("\n");


        p.setText(p.emphasized(true));
        p.setText(addLine("=", columna) + "\n");
        p.setText(RellenarString("CANT", 8));
        p.setText(RellenarString("DESCRIPCION", 22));
        p.setText(A_La_Derecha("TAX", 7));
        p.setText(RellenarString("", 3));
        p.setText(A_La_Derecha("PRECIO", 7) + "\n");
        p.setText(addLine("=", columna) + "\n");
        p.setText(p.emphasized(false));

        //VAMOS A AGREGAR EL DETALLE
        for (Map<String, Object> tupla : data) {

            p.setText(RellenarString(Round(tupla.get("f_cantidad"), 2), 8));
            p.setText(Asignar_tres_puntos(RellenarString(tupla.get("f_descripcion").toString(), 22), 22));
            p.setText(A_La_Derecha(Round(tupla.get("f_itebis_producto"), 2), 7));
            p.setText(RellenarString("", 3));
            p.setText(A_La_Derecha(Round(tupla.get("f_precio"), 2), 7));
            p.setText("\n");

            //EXTRAEMOS LOS COMPONENTES DE CADA PRODUCTO
            //String componentes = new String(Base64.decodeBase64(tupla.get("f_componentes").toString()));


            if (!tupla.get("f_componentes").toString().equals("") && !tupla.get("f_componentes").toString().equals("[]")) {
                Map map_componentes = JsonToMap(componentes);
                List<Map<String, Object>> list_componentes = (List<Map<String, Object>>) map_componentes.get("f_datos");

                for (Map<String, Object> tupla2 : list_componentes) {

                    p.setText(RellenarString("*" + Round(tupla2.get("f_cantidad"), 2), 8));
                    p.setText(Asignar_tres_puntos(RellenarString(tupla2.get("f_descripcion").toString(), 22), 22));
                    p.setText(A_La_Derecha(Round(tupla2.get("f_itebis_producto"), 2), 7));
                    p.setText(RellenarString("", 3));
                    p.setText(A_La_Derecha(Round(tupla2.get("f_monto_cobrar"), 2), 7));
                    p.setText("\n");

                }
            }

        }
        p.setText(addLine("-", columna));
        p.setText("\n");
        p.setText(datos_totales);
        p.setText("\n");

        p.setText(p.getBarcodeEscPosCode(numero_factura));
        p.cortar();

        //Imprimir(p.finalCommandSet().getBytes());

        return p.finalCommandSet()

    }

    String generarStringFacturaImprimirTermica(List json, String tipo_printer, String accion, Integer columna) throws IOException {

        PrinterESC p;
        //int columna;

        if (tipo_printer.equals("1")) {
            p = new PrinterStar();
            //columna = 47;
        } else {
            p = new PrinterEpson();
            //columna = 43;
        }
//        if (tipo_printer.equals("1")) {
//            p = new PrinterStar();
//            columna = 47;
//        } else {
//            p = new PrinterEpson();
//            columna = 43;
        //   }

        List data = json

        String header_factura = "";
        String datosprincipales = "";
        String numero_factura = "";
        String datos_totales = "";

        Integer linieasAlDerecha = 10
        Integer lineaTotalesAlaDerecha = 37

        //LLENAMOS EL HEADER

        numero_factura = data.first().f_numero.toString();
        header_factura += p.doubleHeight(true) + p.emphasized(true) + titulo(data.first().f_nombre_empresa.toString().toUpperCase(), columna) + p.emphasized(false) + p.doubleHeight(false) + "\n";
        header_factura += data.first().f_header_factura_pequena.toString() + "\n\n";

        if (!accion.equals("")) {
            accion += !data.first().titulo_impresion.toString().equals("") ? " - " + data.first().titulo_impresion.toString() : ''
        } else {
            accion = !data.first().titulo_impresion.toString().equals("") ? data.first().titulo_impresion.toString() : ''
        }

        if (!data.first().f_rnc.equals("")) {
            accion = "Factura de credito fiscal"
        }

        header_factura += p.emphasized(true) + p.doubleHeight(true) + titulo(accion, columna) + p.doubleHeight(false) + p.emphasized(false) + "\n";

        //}

        if (data.first().f_mesa != null) {
            datosprincipales += p.emphasized(true) + "Mesa : " + p.emphasized(false) + data.first().f_mesa + "\n";
        }

        if (!data.first().f_rnc.equals("")) {
            datosprincipales += p.emphasized(true) + "RNC : " + p.emphasized(false) + data.first().f_rnc + "\n";
        }
        if (!data.first().f_razon_social.equals("")) {
            datosprincipales += p.emphasized(true) + "Razon Social : " + p.emphasized(false) + data.first().f_razon_social + "\n";
        }

        datosprincipales += p.emphasized(true) + "Numero : " + p.emphasized(false) + data.first().f_numero.toString() + "\n";
        datosprincipales += p.emphasized(true) + "Cajero : " + p.emphasized(false) + data.first().f_cajero.toString() + "\n";

        if (!data.first().f_mensajero.toString().equals("")) {
            datosprincipales += p.emphasized(true) + "Mensajero : " + p.emphasized(false) + data.first().f_mensajero.toString() + "\n";
        }

        if (data.first().f_camarero != null) {
            datosprincipales += p.emphasized(true) + "Camarero : " + p.emphasized(false) + data.first().f_camarero.toString() + "\n";

        }

        datosprincipales += p.emphasized(true) + "Fecha : " + p.emphasized(false) + data.first().f_fecha_registro_factura.toString() + "\n";

        if (!data.first().f_cliente.toString().equals("") && data.first().f_cliente.toString() != null && !data.first().f_cliente.toString().equals("null")) {
            datosprincipales += p.emphasized(true) + "Cliente : " + p.emphasized(false) + data.first().f_cliente.toString() + "\n";
        }

        if (!data.f_numero_ncf.first().toString().equals("") && !data.f_numero_ncf.first().toString().isEmpty()) {
            datosprincipales += p.emphasized(true) + "NCF : " + p.emphasized(false) + data.first().f_numero_ncf.toString() + "\n";
        }

        if (!data.first().f_rnc.equals("")) {
            datosprincipales += p.emphasized(true) + "Vencimiento Secuencia : " + p.emphasized(false) + data.first().f_fecha_vigencia_ncf.toString();
        }

        //LLENAMOS LOS DATOS TOTALES
        if (data.first().f_impresion_detalle_factura && data.first().f_modulo == 3) {
            //datos_totales += p.emphasized(true) + A_La_Derecha("Sub-Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_subtotal.toString(), 2), linieasAlDerecha) + "\n";

            // datos_totales += p.emphasized(true) + A_La_Derecha("ITBIS :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), linieasAlDerecha) + "\n";
            datos_totales += p.emphasized(true) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), lineaTotalesAlaDerecha) + p.emphasized(true) + A_La_Derecha(Round(data.first().f_total.toString(), 2), linieasAlDerecha) + "\n\n"

            datos_totales += p.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.emphasized(true) + A_La_Derecha("Delivery :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_precio_envio.first().toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_envio.toString(), 2), linieasAlDerecha) + p.doubleHeight(false) + "\n";

        } else if (data.first().f_modulo == 2) {
            datos_totales += p.emphasized(true) + A_La_Derecha("Sub-Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_subtotal.toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.emphasized(true) + A_La_Derecha("ITBIS :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), linieasAlDerecha) + "\n";

            //datos_totales += p.emphasized(true) + A_La_Derecha("Delivery :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_precio_envio.first().toString(), 2), linieasAlDerecha) + "\n";

            if (data.first().f_porciento_ley.toString().toBigDecimal() > 0) {
                datos_totales += p.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n";
                datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_porciento_ley.toString(), 2), linieasAlDerecha) + p.doubleHeight(false) + "\n";

            } else {
                datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_total.toString(), 2), linieasAlDerecha) + p.doubleHeight(false) + "\n";

            }

        } else {
            datos_totales += p.emphasized(true) + A_La_Derecha("Sub-Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_subtotal.toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.emphasized(true) + A_La_Derecha("ITBIS :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.emphasized(true) + A_La_Derecha("Delivery :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_precio_envio.first().toString(), 2), linieasAlDerecha) + "\n";

            datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_envio.toString(), 2), linieasAlDerecha) + p.doubleHeight(false) + "\n";

        }
        if (data.first().f_monto_efectivo.toString().toBigDecimal() > 0) {
            datos_totales += p.emphasized(true) + A_La_Derecha("Efectivo :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_monto_efectivo.toString(), 2), linieasAlDerecha) + "\n";

        }

        if (data.first().f_devuelta.toString().toBigDecimal() > 0) {
            datos_totales += p.emphasized(true) + A_La_Derecha("Cambio :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_devuelta.toString(), 2), linieasAlDerecha) + "\n";

        }

        if (parseDouble(data.first().f_monto_tarjeta.toString()) > 0) {
            datos_totales += p.emphasized(true) + A_La_Derecha("Tarjeta :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_monto_tarjeta.toString(), 2), linieasAlDerecha) + "\n";

        }
        if (parseDouble(data.first().f_propina.toString()) > 0) {
            datos_totales += p.emphasized(true) + A_La_Derecha("Propina :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_propina.toString(), 2), linieasAlDerecha) + "\n";

        }

        datos_totales += addLine("_", columna) + "\n";
        datos_totales += p.emphasized(true) + "OBSERVACION :" + p.emphasized(false) + "\n";
        datos_totales += titulo(data.first().f_observacion.toString(), columna) + "\n";
        datos_totales += p.emphasized(true) + "DIRECCION :" + p.emphasized(false) + "\n";
        datos_totales += p.emphasized(false) + titulo(data.first().f_direccion.toString(), columna) + "\n";
        datos_totales += addLine("_", columna) + "\n";
        datos_totales += titulo(data.first().f_mensaje_orden.toString(), columna) + "\n";
        datos_totales += A_La_Derecha(data.first().f_web.toString(), columna) + "\n";

        p.setText(header_factura);
        //p.setText("\n");
        p.setText(datosprincipales);
        p.setText("\n");


        p.setText(p.emphasized(true));
        p.setText(addLine("=", columna) + "\n");
        p.setText(RellenarString("CANT", 8));
        p.setText(RellenarString("DESCRIPCION", 22));
        p.setText(A_La_Derecha("TAX", 7));
        p.setText(RellenarString("", 3));
        p.setText(A_La_Derecha("PRECIO", 7) + "\n");
        p.setText(addLine("=", columna) + "\n");
        p.setText(p.emphasized(false));

        //VAMOS A AGREGAR EL DETALLE
        for (Map<String, Object> tupla : data) {

            p.setText(RellenarString(Round(tupla.get("f_cantidad"), 2), 8));
            p.setText(Asignar_tres_puntos(RellenarString(tupla.get("f_descripcion").toString(), 22), 22));
            p.setText(A_La_Derecha(Round(tupla.get("f_itebis_producto"), 2), 7));
            p.setText(RellenarString("", 3));
            p.setText(A_La_Derecha(Round(tupla.get("f_precio"), 2), 7));
            p.setText("\n");

            //EXTRAEMOS LOS COMPONENTES DE CADA PRODUCTO
            //String componentes = new String(Base64.decodeBase64(tupla.get("f_componentes").toString()));


            if (!tupla.get("f_componentes").toString().equals("") && !tupla.get("f_componentes").toString().equals("[]")) {
                Map map_componentes = JsonToMap(componentes);
                List<Map<String, Object>> list_componentes = (List<Map<String, Object>>) map_componentes.get("f_datos");

                for (Map<String, Object> tupla2 : list_componentes) {

                    p.setText(RellenarString("*" + Round(tupla2.get("f_cantidad"), 2), 8));
                    p.setText(Asignar_tres_puntos(RellenarString(tupla2.get("f_descripcion").toString(), 22), 22));
                    p.setText(A_La_Derecha(Round(tupla2.get("f_itebis_producto"), 2), 7));
                    p.setText(RellenarString("", 3));
                    p.setText(A_La_Derecha(Round(tupla2.get("f_monto_cobrar"), 2), 7));
                    p.setText("\n");

                }
            }

        }
        p.setText(addLine("-", columna));
        p.setText("\n");
        p.setText(datos_totales);
        p.setText("\n");

        p.setText(p.getBarcodeEscPosCode(numero_factura));
        p.cortar();

        //Imprimir(p.finalCommandSet().getBytes());

        return p.finalCommandSet()

    }


    String generarStringOrdenImprimirTermica(List json, List componentes, String tipo_printer, String accion) throws IOException {

        PrinterESC p;
        int columna;

        if (tipo_printer.equals("1")) {
            p = new PrinterStar();
            columna = 47;
        } else {
            p = new PrinterEpson();
            columna = 43;
        }

        List data = json

        String header_factura = "";
        String datosprincipales = "";
        String numero_factura = "";
        String datos_totales = "";

        Integer linieasAlDerecha = 10
        Integer lineaTotalesAlaDerecha = 37

        //LLENAMOS EL HEADER

        numero_factura = data.first().f_numero.toString();
        header_factura += p.doubleHeight(true) + p.emphasized(true) + titulo(data.first().f_nombre_empresa.toString().toUpperCase(), columna) + p.emphasized(false) + p.doubleHeight(false) + "\n";
        header_factura += data.first().f_header_factura_pequena.toString() + "\n\n";

        if (!accion.equals("")) {
            accion += !data.first().titulo_impresion.toString().equals("") ? " - " + data.first().titulo_impresion.toString() : ''
        } else {
            accion = !data.first().titulo_impresion.toString().equals("") ? data.first().titulo_impresion.toString() : ''
        }

        if (!data.first().f_rnc.equals("")) {
            accion = "Factura de credito fiscal"
        }

        header_factura += p.emphasized(true) + p.doubleHeight(true) + titulo(accion, columna) + p.doubleHeight(false) + p.emphasized(false) + "\n";

        //}

        if (data.first().f_mesa != null) {
            datosprincipales += p.emphasized(true) + "Mesa : " + p.emphasized(false) + data.first().f_mesa + "\n";
        }

        if (!data.first().f_rnc.equals("")) {
            datosprincipales += p.emphasized(true) + "RNC : " + p.emphasized(false) + data.first().f_rnc + "\n";
        }
        if (!data.first().f_razon_social.equals("")) {
            datosprincipales += p.emphasized(true) + "Razon Social : " + p.emphasized(false) + data.first().f_razon_social + "\n";
        }

        datosprincipales += p.emphasized(true) + "Numero : " + p.emphasized(false) + data.first().f_numero.toString() + "\n";

//        if (!data.first().f_cajero.toString().equals("")) {
//            datosprincipales += p.emphasized(true) + "Cajero : " + p.emphasized(false) + data.first().f_cajero.toString() + "\n";
//
//        }

        if (data.first().f_camarero != null) {
            datosprincipales += p.emphasized(true) + "Camarero : " + p.emphasized(false) + data.first().f_camarero.toString() + "\n";

        }

        datosprincipales += p.emphasized(true) + "Fecha : " + p.emphasized(false) + data.first().f_fecha_registro_factura.toString() + "\n";

        if (!data.first().f_cliente.toString().equals("") && data.first().f_cliente.toString() != null && !data.first().f_cliente.toString().equals("null")) {
            datosprincipales += p.emphasized(true) + "Cliente : " + p.emphasized(false) + data.first().f_cliente.toString() + "\n";
        }

        if (!data.f_numero_ncf.first().toString().equals("") && !data.f_numero_ncf.first().toString().isEmpty()) {
            datosprincipales += p.emphasized(true) + "NCF : " + p.emphasized(false) + data.first().f_numero_ncf.toString() + "\n";
        }

        if (!data.first().f_rnc.equals("")) {
            datosprincipales += p.emphasized(true) + "Vencimiento Secuencia : " + p.emphasized(false) + data.first().f_fecha_vigencia_ncf.toString();
        }

        //LLENAMOS LOS DATOS TOTALES
        if (data.first().f_impresion_detalle_factura && data.first().f_modulo == 3) {
            //datos_totales += p.emphasized(true) + A_La_Derecha("Sub-Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_subtotal.toString(), 2), linieasAlDerecha) + "\n";

            // datos_totales += p.emphasized(true) + A_La_Derecha("ITBIS :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), linieasAlDerecha) + "\n";
//            datos_totales += p.emphasized(true) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), lineaTotalesAlaDerecha) + p.emphasized(true) + A_La_Derecha(Round(data.first().f_total.toString(), 2), linieasAlDerecha) + "\n\n"
//
//            datos_totales += p.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n";
//
//            datos_totales += p.emphasized(true) + A_La_Derecha("Delivery :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_precio_envio.first().toString(), 2), linieasAlDerecha) + "\n";
//
//            datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_envio.toString(), 2), linieasAlDerecha) + p.doubleHeight(false) + "\n";

        } else if (data.first().f_modulo == 2) {
//            datos_totales += p.emphasized(true) + A_La_Derecha("Sub-Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_subtotal.toString(), 2), linieasAlDerecha) + "\n";
//
//            datos_totales += p.emphasized(true) + A_La_Derecha("ITBIS :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), linieasAlDerecha) + "\n";
//
//
//            //datos_totales += p.emphasized(true) + A_La_Derecha("Delivery :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_precio_envio.first().toString(), 2), linieasAlDerecha) + "\n";
//
//            if (data.first().f_porciento_ley.toString().toBigDecimal() > 0) {
//                datos_totales += p.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n";
//                datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_porciento_ley.toString(), 2), linieasAlDerecha) + p.doubleHeight(false) + "\n";
//
//            } else {
//                datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_total.toString(), 2), linieasAlDerecha) + p.doubleHeight(false) + "\n";
//
//            }

        } else {
//            datos_totales += p.emphasized(true) + A_La_Derecha("Sub-Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_subtotal.toString(), 2), linieasAlDerecha) + "\n";
//
//            datos_totales += p.emphasized(true) + A_La_Derecha("ITBIS :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), linieasAlDerecha) + "\n";
//
//            datos_totales += p.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n";
//
//            datos_totales += p.emphasized(true) + A_La_Derecha("Delivery :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.f_precio_envio.first().toString(), 2), linieasAlDerecha) + "\n";
//
//            datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_envio.toString(), 2), linieasAlDerecha) + p.doubleHeight(false) + "\n";

        }
//
//        if (data.first().f_monto_efectivo.toString().toBigDecimal() > 0) {
//            datos_totales += p.emphasized(true) + A_La_Derecha("Efectivo :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_monto_efectivo.toString(), 2), linieasAlDerecha) + "\n";
//
//        }
//
//        if (data.first().f_devuelta.toString().toBigDecimal() > 0) {
//            datos_totales += p.emphasized(true) + A_La_Derecha("Cambio :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_devuelta.toString(), 2), linieasAlDerecha) + "\n";
//
//        }
//
//        if (parseDouble(data.first().f_monto_tarjeta.toString()) > 0) {
//            datos_totales += p.emphasized(true) + A_La_Derecha("Tarjeta :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_monto_tarjeta.toString(), 2), linieasAlDerecha) + "\n";
//
//        }
//        if (parseDouble(data.first().f_propina.toString()) > 0) {
//            datos_totales += p.emphasized(true) + A_La_Derecha("Propina :", lineaTotalesAlaDerecha) + p.emphasized(false) + A_La_Derecha(Round(data.first().f_propina.toString(), 2), linieasAlDerecha) + "\n";
//
//        }

        datos_totales += addLine("_", columna) + "\n";

        if (!data.first().f_observacion.toString().equals("")) {
            datos_totales += p.emphasized(true) + "OBSERVACION :" + p.emphasized(false) + "\n";
            datos_totales += titulo(data.first().f_observacion.toString(), columna) + "\n";
        }

//        datos_totales += p.emphasized(true) + "DIRECCION :" + p.emphasized(false)+"\n";
//        datos_totales += p.emphasized(false) + titulo(data.first().f_direccion.toString(), columna)+"\n";

        datos_totales += addLine("_", columna) + "\n";
        //datos_totales += titulo(data.first().f_mensaje_orden.toString(), columna) + "\n";
        datos_totales += A_La_Derecha(data.first().f_web.toString(), columna) + "\n";

        p.setText(header_factura);
        //p.setText("\n");
        p.setText(datosprincipales);
        p.setText("\n");


        p.setText(p.emphasized(true));
        p.setText(addLine("=", columna) + "\n");
        p.setText(RellenarString("CANT", 8));
        p.setText(RellenarString("DESCRIPCION", 37));
//        p.setText(A_La_Derecha("TAX", 7));
        p.setText(RellenarString("", 3));
//        p.setText(A_La_Derecha("PRECIO", 7) + "\n");
        p.setText(addLine("=", columna) + "\n");
        p.setText(p.emphasized(false));

        //VAMOS A AGREGAR EL DETALLE
        for (Map<String, Object> tupla : data) {


            p.setText(RellenarString(Round(tupla.get("f_cantidad"), 2), 8));
            p.setText(Asignar_tres_puntos(RellenarString(tupla.get("f_descripcion").toString(), 37), 22));
//            p.setText(A_La_Derecha(Round(tupla.get("f_itebis_producto"), 2), 7));
//            p.setText(RellenarString("", 3));
//            p.setText(A_La_Derecha(Round(tupla.get("f_precio"), 2), 7));
            p.setText("\n");
            if (!tupla.f_comentario.toString().equals("")) {
                p.setText(RellenarString("", 8) + RellenarString("-" + tupla.f_comentario.toString() + "-", 22));
                p.setText("\n");
            }

            componentes.each { item ->
                if (item.detalle_id == tupla.detalle_id) {
                    p.setText(RellenarString("", 8) + RellenarString("*" + item.f_descripcion.toString() + "*", 22));
                    p.setText("\n");
                }
            }

            //EXTRAEMOS LOS COMPONENTES DE CADA PRODUCTO
            //String componentes = new String(Base64.decodeBase64(tupla.get("f_componentes").toString()));


            if (!tupla.get("f_componentes").toString().equals("") && !tupla.get("f_componentes").toString().equals("[]")) {
                Map map_componentes = JsonToMap(componentes);
                List<Map<String, Object>> list_componentes = (List<Map<String, Object>>) map_componentes.get("f_datos");

                for (Map<String, Object> tupla2 : list_componentes) {

                    p.setText(RellenarString("*" + Round(tupla2.get("f_cantidad"), 2), 8));
                    p.setText(Asignar_tres_puntos(RellenarString(tupla2.get("f_descripcion").toString(), 22), 22));
                    p.setText(A_La_Derecha(Round(tupla2.get("f_itebis_producto"), 2), 7));
                    p.setText(RellenarString("", 3));
                    p.setText(A_La_Derecha(Round(tupla2.get("f_monto_cobrar"), 2), 7));
                    p.setText("\n");

                }
            }

        }
        //p.setText(addLine("-", columna));
        p.setText("\n");
        p.setText(datos_totales);
        p.setText("\n");

        p.setText(p.getBarcodeEscPosCode(numero_factura));
        p.cortar();

        //Imprimir(p.finalCommandSet().getBytes());

        return p.finalCommandSet()

    }

    String generarStringOrdenImprimirTermica(List json, List componentes, String tipo_printer, String accion, Integer columna) throws IOException {
        PrinterESC p;

        if (tipo_printer.equals("1")) {
            p = new PrinterStar();
            //colunmna = 47;
        } else {
            p = new PrinterEpson();
            //columna = 43;
        }

        List data = json

        String header_factura = "";
        String datosprincipales = "";
        String numero_factura = "";
        String datos_totales = "";

        Integer linieasAlDerecha = 10
        Integer lineaTotalesAlaDerecha = columna

        //LLENAMOS EL HEADER

        numero_factura = data.first().f_numero.toString();
        header_factura += p.doubleHeight(true) + p.emphasized(true) + titulo(data.first().f_nombre_empresa.toString().toUpperCase(), columna) + p.emphasized(false) + p.doubleHeight(false) + "\n";
        header_factura += data.first().f_header_factura_pequena.toString() + "\n\n";

        if (!accion.equals("")) {
            accion += !data.first().titulo_impresion.toString().equals("") ? " - " + data.first().titulo_impresion.toString() : ''
        } else {
            accion = !data.first().titulo_impresion.toString().equals("") ? data.first().titulo_impresion.toString() : ''
        }

        if (!data.first().f_rnc.equals("")) {
            accion = "Factura de credito fiscal"
        }

        header_factura += p.emphasized(true) + p.doubleHeight(true) + titulo(accion, columna) + p.doubleHeight(false) + p.emphasized(false) + "\n\n";

        if (data.first().f_mesa != null) {
            datosprincipales += p.emphasized(true) + "Mesa : " + p.emphasized(false) + data.first().f_mesa + "\n";
        }

        if (!data.first().f_rnc.equals("")) {
            datosprincipales += p.emphasized(true) + "RNC : " + p.emphasized(false) + data.first().f_rnc + "\n";
        }
        if (!data.first().f_razon_social.equals("")) {
            datosprincipales += p.emphasized(true) + "Razon Social : " + p.emphasized(false) + data.first().f_razon_social + "\n";
        }

        datosprincipales += p.emphasized(true) + "Numero : " + p.emphasized(false) + data.first().f_numero.toString() + "\n";

        if (data.first().f_camarero != null) {
            datosprincipales += p.emphasized(true) + "Camarero : " + p.emphasized(false) + data.first().f_camarero.toString() + "\n";

        }

        datosprincipales += p.emphasized(true) + "Fecha : " + p.emphasized(false) + data.first().f_fecha_registro_factura.toString() + "\n";

        if (!data.first().f_cliente.toString().equals("") && data.first().f_cliente.toString() != null && !data.first().f_cliente.toString().equals("null")) {
            datosprincipales += p.emphasized(true) + "Cliente : " + p.emphasized(false) + data.first().f_cliente.toString() + "\n";
        }

        if (!data.f_numero_ncf.first().toString().equals("") && !data.f_numero_ncf.first().toString().isEmpty()) {
            datosprincipales += p.emphasized(true) + "NCF : " + p.emphasized(false) + data.first().f_numero_ncf.toString() + "\n";
        }

        if (!data.first().f_rnc.equals("")) {
            datosprincipales += p.emphasized(true) + "Vencimiento Secuencia : " + p.emphasized(false) + data.first().f_fecha_vigencia_ncf.toString();
        }

        datos_totales += addLine("_", columna) + "\n";

        if (!data.first().f_observacion.toString().equals("")) {
            datos_totales += p.emphasized(true) + "OBSERVACION :" + p.emphasized(false) + "\n";
            datos_totales += titulo(data.first().f_observacion.toString(), columna) + "\n";
        }


        datos_totales += addLine("_", columna) + "\n";
        datos_totales += A_La_Derecha(data.first().f_web.toString(), columna) + "\n";

        p.setText(header_factura);
        //p.setText("\n");
        p.setText(datosprincipales);
        p.setText("\n");


        p.setText(p.emphasized(true));
        p.setText(addLine("=", columna) + "\n");
        p.setText(RellenarString("CANT", 8));
        p.setText(RellenarString("DESCRIPCION", 21));
        p.setText(RellenarString("", 3));
        p.setText(addLine("=", columna) + "\n");
        p.setText(p.emphasized(false));

        //VAMOS A AGREGAR EL DETALLE
        for (Map<String, Object> tupla : data) {


            p.setText(RellenarString(Round(tupla.get("f_cantidad"), 2), 8));
            p.setText(Asignar_tres_puntos(RellenarString(tupla.get("f_descripcion").toString(), 37), 22));
            p.setText("\n");
            if (!tupla.f_comentario.toString().equals("")) {
                p.setText(RellenarString("", 8) + RellenarString("-" + tupla.f_comentario.toString() + "-", 22));
                p.setText("\n");
            }

            componentes.each { item ->
                if (item.detalle_id == tupla.detalle_id) {
                    p.setText(RellenarString("", 8) + RellenarString("*" + item.f_descripcion.toString() + "*", 22));
                    p.setText("\n");
                }
            }

            //EXTRAEMOS LOS COMPONENTES DE CADA PRODUCTO
            //String componentes = new String(Base64.decodeBase64(tupla.get("f_componentes").toString()));


            if (!tupla.get("f_componentes").toString().equals("") && !tupla.get("f_componentes").toString().equals("[]")) {
                Map map_componentes = JsonToMap(componentes);
                List<Map<String, Object>> list_componentes = (List<Map<String, Object>>) map_componentes.get("f_datos");

                for (Map<String, Object> tupla2 : list_componentes) {

                    p.setText(RellenarString("*" + Round(tupla2.get("f_cantidad"), 2), 8));
                    p.setText(Asignar_tres_puntos(RellenarString(tupla2.get("f_descripcion").toString(), 22), 22));
                    p.setText(A_La_Derecha(Round(tupla2.get("f_itebis_producto"), 2), 7));
                    p.setText(RellenarString("", 3));
                    p.setText(A_La_Derecha(Round(tupla2.get("f_monto_cobrar"), 2), 7));
                    p.setText("\n");

                }
            }

        }
        p.setText("\n");
        p.setText(datos_totales);
        p.setText("\n");
        p.setText(p.getBarcodeEscPosCode(numero_factura));
        p.cortar();

        return p.finalCommandSet()

    }

    public String GenerarStringCuadreImprimirTermica(Map data, String tipo_printer, String accion) throws IOException {

        PrinterESC p;
        int columna;

        if (tipo_printer.equals("1")) {
            p = new PrinterStar();
            columna = 47;
        } else {
            p = new PrinterEpson();
            columna = 43;
        }

        String header_factura = "";
        String datosprincipales = "";
        String numero_factura = "";
        String datos_totales = "";
        Integer linieasAlDerecha = 10

        //LLENAMOS EL HEADER

        //numero_factura = data.f_numero.toString();
        header_factura += p.doubleHeight(true) + p.emphasized(true) + titulo(data.f_nombre_empresa.toString().toUpperCase(), columna) + p.emphasized(false) + p.doubleHeight(false) + "\n";
        header_factura += data.f_header_facturas_pequenas.toString() + "\n\n";

        if (!accion.equals("")) {
            header_factura += p.emphasized(true) + p.doubleHeight(true) + titulo(accion, columna) + p.doubleHeight(false) + p.emphasized(false) + "\n";

        }

        accion = (accion.equals("Cuadre General")) ? "Usuario : " : "Cajero : ";

        datosprincipales += p.emphasized(true) + accion.toString() + p.emphasized(false) + data.cajero.toString() + "\n";

        datosprincipales += p.emphasized(true) + "Fecha : " + p.emphasized(false) + data.f_fecha_generado.toString() + "\n";

        //LLENAMOS LOS DATOS TOTALES

        datos_totales += RellenarString(p.emphasized(true) + "Pedidos :", 21) + p.emphasized(false) + A_La_Derecha(Round(data.f_pedidos.toString(), 2), linieasAlDerecha) + "\n";
        datos_totales += RellenarString(p.emphasized(true) + "Factura credito :", 21) + p.emphasized(false) + A_La_Derecha(Round(data.f_factcredito.toString(), 2), linieasAlDerecha) + "\n";
        datos_totales += RellenarString(p.emphasized(true) + "Factura contado :", 21) + p.emphasized(false) + A_La_Derecha(Round(data.f_factcontado.toString(), 2), linieasAlDerecha) + "\n";
        datos_totales += RellenarString(p.emphasized(true) + "Total credito :", 21) + p.emphasized(false) + A_La_Derecha(Round(data.f_montocredito.toString(), 2), linieasAlDerecha) + "\n";
        datos_totales += RellenarString(p.emphasized(true) + "Total contado :", 21) + p.emphasized(false) + A_La_Derecha(Round(data.f_montocontado.toString(), 2), linieasAlDerecha) + "\n";
        datos_totales += RellenarString(p.emphasized(true) + "Total ITBIS :", 21) + p.emphasized(false) + A_La_Derecha(Round(data.f_montoitbis.toString(), 2), linieasAlDerecha) + "\n";
        datos_totales += RellenarString(p.emphasized(true) + "Total cheques :", 21) + p.emphasized(false) + A_La_Derecha(Round(data.f_montocheque.toString(), 2), linieasAlDerecha) + "\n";
        datos_totales += RellenarString(p.emphasized(true) + "Total tarjetas :", 21) + p.emphasized(false) + A_La_Derecha(Round(data.f_montotarjeta.toString(), 2), linieasAlDerecha) + "\n";
        datos_totales += RellenarString(p.emphasized(true) + "Total envio :", 21) + p.emphasized(false) + A_La_Derecha(Round(data.f_montoenvio.toString(), 2), linieasAlDerecha) + "\n";
        datos_totales += RellenarString(p.emphasized(true) + "Total caja :", 21) + p.emphasized(false) + A_La_Derecha(Round(data.f_monto_caja.toString(), 2), linieasAlDerecha) + "\n";
        datos_totales += RellenarString(p.emphasized(true) + "Total recibido :", 21) + p.emphasized(false) + A_La_Derecha(Round(data.f_monto_recibo.toString(), 2), linieasAlDerecha) + "\n";
        datos_totales += RellenarString(p.emphasized(true) + "Total cancelado :", 21) + p.emphasized(false) + A_La_Derecha(Round(data.f_monto_cancelado.toString(), 2), linieasAlDerecha) + "\n";

        p.setText(header_factura);
        //p.setText("\n");

        p.setText(p.emphasized(true));
        p.setText(addLine("=", columna) + "\n");

        p.setText(datosprincipales);
        p.setText("\n");
        p.setText(p.emphasized(false));


        p.setText(addLine("-", columna));
        p.setText("\n");
        p.setText(datos_totales);
        p.setText("\n");
        p.setText(addLine("-", columna))
        p.setText("\n");
        p.setText("\n");
        p.setText("\n");
        p.setText(addLine("_", columna));
        p.setText(p.emphasized(true) + titulo("Firma", columna));
        p.setText("\n");

        p.setText(A_La_Derecha(data.f_web.toString(), columna) + "\n");
        //p.doubleHeight(true) + p.emphasized(true) + titulo(data.f_nombre_empresa.toString().toUpperCase(), columna) + p.emphasized(false) + p.doubleHeight(false) + "\n";

        // p.setText(p.getBarcodeEscPosCode(numero_factura));
        p.cortar();

        //Imprimir(p.finalCommandSet().getBytes());

        return p.finalCommandSet()

    }

//    public  String getHeader(Map data) {
//
//    }


    public String Round(Object numero, int cantida_ceros) {
        String form = "%1\$,." + cantida_ceros + "f";
        return String.format(form, parseDouble("" + numero));
    }

    public double parseDouble(String s) {
        if (s.isEmpty()) {
            return 0.0;
        }
        s = s.replace(",", "");
        return Double.parseDouble(s);
    }


    public boolean isNumber(String text) {
        try {
            parseDouble(text);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public generarStringReciboImprimirTermica(List recibo, String tipo_printer, String accion) {

        PrinterESC p;
        int line;

        if (tipo_printer.equals("1")) {
            p = new PrinterStar();
            line = 47;
        } else {
            p = new PrinterEpson();
            line = 43;
        }

//        Map map = JsonToMap(json);
//        List<Map<String, Object>> map1 = (List<Map<String, Object>>) map.get("f_data");

        String header_factura = "";
        String datosprincipales = "";
        String numero_factura = "";
        String datos_totales = "";

        //LLENAMOS EL HEADER
        String[] aplicado

        //for (Map<String, Object> tupla : map1) {
        accion = recibo.first().titulo_impresion.toString()
        numero_factura = recibo.first().f_numero.toString();
        header_factura += p.doubleHeight(true) + p.emphasized(true) + titulo(recibo.first().f_nombre_empresa.toString().toUpperCase(), line) + p.emphasized(false) + p.doubleHeight(false) + "\n";
        header_factura += recibo.first().f_header_factura_pequena.toString() + "\n";
        header_factura += p.emphasized(true) + p.doubleHeight(true) + titulo(accion, line) + p.doubleHeight(false) + p.emphasized(false) + "\n";

        datosprincipales += p.emphasized(true) + "Numero..: " + p.emphasized(false) + recibo.first().f_numero.toString() + "\n";
        datosprincipales += p.emphasized(true) + "Fecha...: " + p.emphasized(false) + recibo.first().f_fecha.toString() + "\n";

        if (!recibo.first().f_cliente.toString().equals("") && recibo.first().f_cliente.toString() != null && !recibo.first().f_cliente.toString().equals("null")) {
            datosprincipales += p.emphasized(true) + "Cliente.: " + p.emphasized(false) + recibo.first().f_cliente.toString() + "\n";
        }
        datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", 40) + p.emphasized(false) + A_La_Derecha(Round(recibo.first().f_total.toString(), 2), 7) + p.doubleHeight(false) + "\n\n";
        datos_totales += addLine("_", line) + "\n";
        datos_totales += titulo(recibo.first().f_mensaje_orden.toString(), line) + "\n";
        datos_totales += A_La_Derecha(recibo.first().f_web.toString(), line) + "\n";

        aplicado = recibo.first().f_aplicado.toString().split(";");
        //break;
        //}

        p.setText(header_factura);
        p.setText("\n");
        p.setText(datosprincipales);
        p.setText("\n");

        p.setText(p.emphasized(true));
        p.setText(addLine("=", line) + "\n");
        p.setText(titulo("DISTRIBUCION", line) + "\n");
        p.setText(addLine("=", line) + "\n");
        p.setText(p.emphasized(false));
        p.setText("\n");

        p.setText(p.emphasized(true));
        p.setText(RellenarString("DOCUMENTO", 30));
        p.setText(A_La_Derecha("APLICADO", 17));
        p.setText(p.emphasized(false));
        p.setText("\n");
        //detalle

        for (int i = 0; i < aplicado.length; i++) {
            String[] documuento = aplicado[i].split(",");
            p.setText(RellenarString(documuento[0], 12));
            p.setText(RellenarString(documuento[1], 18));
            p.setText(A_La_Derecha(Round(documuento[2], 2), 17) + "\n");
        }


        p.setText(addLine("-", line));
        p.setText("\n");
        p.setText(datos_totales);
        p.setText("\n");

        p.setText(p.getBarcodeEscPosCode(numero_factura));
        p.cortar();
        //Imprimir(p.finalCommandSet().getBytes());
        p.cortar();

        //Imprimir(p.finalCommandSet().getBytes());

        return p.finalCommandSet()

    }

    public generarStringCuentaPorCobrarImprimirTermica(List recibo, String tipo_printer, String accion) {

        PrinterESC p;
        int line;

        if (tipo_printer.equals("1")) {
            p = new PrinterStar();
            line = 47;
        } else {
            p = new PrinterEpson();
            line = 43;
        }

//        Map map = JsonToMap(json);
//        List<Map<String, Object>> map1 = (List<Map<String, Object>>) map.get("f_data");

        String header_factura = "";
        String datosprincipales = "";
        String numero_factura = "";
        String datos_totales = "";

        //LLENAMOS EL HEADER
        String[] aplicado

        //for (Map<String, Object> tupla : map1) {
        accion = recibo.first().titulo_impresion.toString()
        numero_factura = recibo.first().f_numero.toString();
        header_factura += p.doubleHeight(true) + p.emphasized(true) + titulo(recibo.first().f_nombre_empresa.toString().toUpperCase(), line) + p.emphasized(false) + p.doubleHeight(false) + "\n";
        header_factura += recibo.first().f_header_factura_pequena.toString() + "\n";
        header_factura += p.emphasized(true) + p.doubleHeight(true) + titulo(accion, line) + p.doubleHeight(false) + p.emphasized(false) + "\n";

        datosprincipales += p.emphasized(true) + "Numero..: " + p.emphasized(false) + recibo.first().f_numero.toString() + "\n";
        datosprincipales += p.emphasized(true) + "Fecha...: " + p.emphasized(false) + recibo.first().f_fecha.toString() + "\n";

        if (!recibo.first().f_cliente.toString().equals("") && recibo.first().f_cliente.toString() != null && !recibo.first().f_cliente.toString().equals("null")) {
            datosprincipales += p.emphasized(true) + "Cliente.: " + p.emphasized(false) + recibo.first().f_cliente.toString() + "\n";
        }
        datosprincipales += p.emphasized(true) + "Fecha Vencimiento: " + p.emphasized(false) + recibo.first().f_fecha_vencimiento.toString() + "\n";

        datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", 40) + p.emphasized(false) + A_La_Derecha(Round(recibo.first().f_total.toString(), 2), 7) + p.doubleHeight(false) + "\n\n";
        datos_totales += addLine("_", line) + "\n";
        datos_totales += titulo(recibo.first().f_mensaje_orden.toString(), line) + "\n";
        datos_totales += A_La_Derecha(recibo.first().f_web.toString(), line) + "\n";

        aplicado = recibo.first().f_aplicado.toString().split(";");
        //break;
        //}

        p.setText(header_factura);
        p.setText("\n");
        p.setText(datosprincipales);
        p.setText("\n");

        p.setText(p.emphasized(true));
        p.setText(addLine("=", line) + "\n");
        p.setText(titulo("CONCEPTO", line) + "\n");
        p.setText(addLine("=", line) + "\n");
        p.setText(p.emphasized(false));
        p.setText("\n");

//        p.setText(p.emphasized(true));
//        p.setText(RellenarString("DOCUMENTO", 30));
//        p.setText(A_La_Derecha("APLICADO", 17));
//        p.setText(p.emphasized(false));
//        p.setText("\n");
        //detalle

        p.setText(recibo.first().f_concepto.toString());
        p.setText("\n");

        p.setText(addLine("-", line));
        p.setText("\n");
        p.setText(datos_totales);
        p.setText("\n");

        p.setText(p.getBarcodeEscPosCode(numero_factura));
        p.cortar();
        //Imprimir(p.finalCommandSet().getBytes());
        p.cortar();

        //Imprimir(p.finalCommandSet().getBytes());

        return p.finalCommandSet()

    }

    String generarImpresion(List data, Integer marcaPrinter, Integer columna) throws IOException {
        PrinterESC printer

        if (marcaPrinter == 1) {
            printer = new PrinterStar()
        } else {
            printer = new PrinterEpson()
        }

        printer.setText(generarHeader(data, printer, columna))

    //printer.setText((columna == 32) ? generarDetalle32Columnas(data, printer, columna) : generarDetalleColumnas(data, printer, columna))
    //printer.setText((columna == 32) ? generarTotales32Columnas(data, printer, columna) : generarTotales(data, printer, columna))

        //        printer.setText((columna == 32) ? generarDetalle32Columnas(data, printer, columna) : generarDetalleColumnas(data, printer, columna))
        if(columna == 32){
            printer.setText( generarDetalle32Columnas(data, printer, columna) );
            printer.setText( generarTotales32Columnas(data, printer, columna) );

        }else if(columna == 47){
            printer.setText(generarDetalleColumnas(data, printer, columna));
            printer.setText(generarTotales(data, printer, columna));
        }else {
            println("Impresion De 42 Columnas Detalle Y Totales")
            printer.setText(generarDetalle42Columnas(data, printer, columna));
            printer.setText(generarTotales42Columnas(data, printer, columna));
        }
//        printer.setText((columna == 32) ? generarTotales32Columnas(data, printer, columna) : generarTotales(data, printer, columna))

        printer.setText(addLine("-", columna))
        printer.setText("\n")
        printer.setText("\n")
        printer.cortar()
        return printer.finalCommandSet()

    }

    String generarImpresion(List data, List componentes, Integer marcaPrinter, Integer columna) throws IOException {
        PrinterESC printer
        if (marcaPrinter == 1) {
            printer = new PrinterStar()
        } else {
            printer = new PrinterEpson()
        }

        printer.setText(generarHeader(data, printer, columna))
        printer.setText(generarDetalleColumnas(data,componentes, printer, columna))
        printer.setText(generarTotales(data,componentes, printer, columna))
        printer.setText(addLine("-", columna))
        printer.setText("\n")
        printer.setText("\n")
        printer.cortar()
        return printer.finalCommandSet()

    }

    String generarImpresion(Map data, Integer marcaPrinter, Integer columna) throws IOException {
        PrinterESC printer
        if (marcaPrinter == 1) {
            printer = new PrinterStar()
        } else {
            printer = new PrinterEpson()
        }

        printer.setText(generarHeader(data, printer, columna))
        printer.setText(generarTotales(data, printer, columna))
        printer.setText("\n")
        printer.setText("\n")
        printer.setText("\n")
        printer.setText("\n")
        printer.setText("\n")
        printer.setText(addLine("_", columna));
        printer.setText(printer.emphasized(true) + titulo("Firma", columna))
        printer.setText("\n")

        printer.setText(A_La_Derecha(data.f_web.toString(), columna) + "\n")
        printer.cortar()
        return printer.finalCommandSet()

    }

    String generarImpresionRecibo(List data, Integer marcaPrinter, Integer columna) throws IOException {
        PrinterESC printer
        if (marcaPrinter == 1) {
            printer = new PrinterStar()
        } else {
            printer = new PrinterEpson()
        }

        printer.setText(generarHeaderRecibo(data, printer, columna))
        printer.setText(generarContenidoRecibo(data, printer, columna))
//        printer.setText(A_La_Derecha(data.first().f_web.toString(), columna) + "\n")
        printer.cortar()
        return printer.finalCommandSet()

    }

    String generarHeaderRecibo(List recibo, PrinterESC printer, Integer columna) {
        String header = ""

        header += printer.doubleHeight(true) + printer.emphasized(true) + titulo(recibo.first().f_nombre_empresa.toString().toUpperCase(), columna) + printer.emphasized(false) + printer.doubleHeight(false) + "\n\n"
        header += recibo.first().f_header_factura_pequena.toString() + "\n\n";
        header += printer.emphasized(true) + printer.doubleHeight(true) + titulo(recibo.first().titulo_impresion, columna) + printer.doubleHeight(false) + printer.emphasized(false) + "\n\n";
        header += printer.emphasized(true) + "Numero..: " + printer.emphasized(false) + recibo.first().f_numero.toString() + "\n";
        header += printer.emphasized(true) + "Fecha...: " + printer.emphasized(false) + recibo.first().f_fecha.toString() + "\n";

        if (!recibo.first().f_cliente.toString().equals("") && recibo.first().f_cliente.toString() != null && !recibo.first().f_cliente.toString().equals("null")) {
            header += printer.emphasized(true) + "Cliente.: " + printer.emphasized(false) + recibo.first().f_cliente.toString() + "\n";
        }

        return header
    }



    String generarHeader(Map data, PrinterESC printer, Integer columna) {
        String header = ""
        header += printer.doubleHeight(true) + printer.emphasized(true) + titulo(data.f_nombre_empresa.toString().toUpperCase(), columna) + printer.emphasized(false) + printer.doubleHeight(false) + "\n"
        header += data.f_header_facturas_pequenas.toString() + "\n\n"
        header += printer.emphasized(true) + printer.doubleHeight(true) + titulo(data.titulo_impresion.toString(), columna) + printer.doubleHeight(false) + printer.emphasized(false) + "\n\n"
        header += printer.emphasized(true) + "Usuario : " + printer.emphasized(false) + data.cajero.toString() + "\n"
        header += printer.emphasized(true) + "Fecha : " + printer.emphasized(false) + data.f_fecha_generado.toString() + "\n"

        return header
    }

    String generarHeader(List data, PrinterESC printer, Integer columna) {
        String header = ""
        header += printer.doubleHeight(true) + printer.emphasized(true) + titulo(data.first().f_nombre_empresa.toString().toUpperCase(), columna) + printer.emphasized(false) + printer.doubleHeight(false) + "\n\n"

        header += data.first().f_header_factura_pequena.toString() + "\n\n"
        header += printer.emphasized(true) + printer.doubleHeight(true) + titulo(data.first().titulo_impresion, columna) + printer.doubleHeight(false) + printer.emphasized(false) + "\n\n"

        header += (data.first().f_mesa) ? printer.emphasized(true) + "Mesa : " + printer.emphasized(false) + data.first().f_mesa + "\n" : ""
        header += (data.first().f_rnc) ? printer.emphasized(true) + "RNC : " + printer.emphasized(false) + data.first().f_rnc + "\n" : ""
        header += (data.first().f_razon_social) ? printer.emphasized(true) + "Razon Social : " + printer.emphasized(false) + data.first().f_razon_social + "\n" : ""

        header += printer.emphasized(true) + "Numero : " + printer.emphasized(false) + data.first().f_numero.toString() + "\n"
        header += (data.first().f_cajero) ? printer.emphasized(true) + "Cajero : " + printer.emphasized(false) + data.first().f_cajero.toString() + "\n" : ""
        header += (data.first().f_usuario) ? printer.emphasized(true) + "Usuario : " + printer.emphasized(false) + data.first().f_usuario.toString() + "\n" : ""
        header += (data.first().f_mensajero) ? printer.emphasized(true) + "Mensajero : " + printer.emphasized(false) + data.first().f_mensajero.toString() + "\n" : ""
        header += (data.first().f_camerero) ? printer.emphasized(true) + "Camarero : " + printer.emphasized(false) + data.first().f_camarero.toString() + "\n" : ""
        header += printer.emphasized(true) + "Fecha : " + printer.emphasized(false) + data.first().f_fecha_registro_factura.toString() + "\n";

        header += (data.first().f_cliente) ? printer.emphasized(true) + "Cliente : " + printer.emphasized(false) + data.first().f_cliente.toString() + "\n" : ""
        header += (data.first().f_numero_ncf) ? printer.emphasized(true) + "NCF : " + printer.emphasized(false) + data.first().f_numero_ncf.toString() + "\n" : ""
        header += (data.first().f_rnc) ? printer.emphasized(true) + "Venc. Secuencia : " + printer.emphasized(false) + data.first().f_fecha_vigencia_ncf.toString() : ""

//        println(header);

        return header
    }

    String generarTotales32Columnas(List data, PrinterESC printer, Integer columna) {
        Integer linieasAlDerecha = 10
        Integer lineaTotalesAlaDerecha = 21
        String totales = ""

        //LLENAMOS LOS DATOS TOTALES
        if (data.first().f_impresion_detalle_factura && data.first().f_modulo == 3) {
            totales += printer.emphasized(true) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), lineaTotalesAlaDerecha) + printer.emphasized(true) + A_La_Derecha(Round(data.first().f_total.toString(), 2), linieasAlDerecha) +"\n\n"

            totales += printer.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n"

            totales += printer.emphasized(true) + A_La_Derecha("Delivery :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.f_precio_envio.first().toString(), 2), linieasAlDerecha) + "\n"

            totales += printer.doubleHeight(true) + printer.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_envio.toString(), 2), linieasAlDerecha) + printer.doubleHeight(false) + "\n"

        } else if (data.first().f_modulo == 2) {
            totales += printer.emphasized(true) + A_La_Derecha("Sub-Total :", lineaTotalesAlaDerecha)  + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_subtotal.toString(), 2), linieasAlDerecha) + "\n";

            totales += printer.emphasized(true) + A_La_Derecha("ITBIS :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), linieasAlDerecha) + "\n"



            if (data.first().f_porciento_ley.toString().toBigDecimal() > 0) {
                totales += printer.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n"
                totales += printer.doubleHeight(true) + printer.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_porciento_ley.toString(), 2), linieasAlDerecha) + printer.doubleHeight(false) + "\n"

            } else {
                totales += printer.doubleHeight(true) + printer.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha)  + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_total.toString(), 2), linieasAlDerecha) + printer.doubleHeight(false) + "\n"

            }

        } else {
            totales += printer.emphasized(true) + A_La_Derecha("Sub-Total :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_subtotal.toString(), 2), linieasAlDerecha) + "\n"

            totales += printer.emphasized(true) + A_La_Derecha("ITBIS :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), linieasAlDerecha) + "\n"

            totales += printer.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n"

            totales += printer.emphasized(true) + A_La_Derecha("Delivery :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.f_precio_envio.first().toString(), 2), linieasAlDerecha) + "\n"

            totales += printer.doubleHeight(true) + printer.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_envio.toString(), 2), linieasAlDerecha) + printer.doubleHeight(false) + "\n"

        }
        if (data.first().f_monto_efectivo.toString().toBigDecimal() > 0) {
            totales += printer.emphasized(true) + A_La_Derecha("Efectivo :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_monto_efectivo.toString(), 2), linieasAlDerecha) + "\n"

        }

        if (data.first().f_devuelta.toString().toBigDecimal() > 0) {
            totales += printer.emphasized(true) + A_La_Derecha("Cambio :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_devuelta.toString(), 2), linieasAlDerecha) + "\n"

        }

        if (parseDouble(data.first().f_monto_tarjeta.toString()) > 0) {
            totales += printer.emphasized(true) + A_La_Derecha("Tarjeta :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_monto_tarjeta.toString(), 2), linieasAlDerecha) + "\n"

        }
        if (parseDouble(data.first().f_propina.toString()) > 0) {
            totales += printer.emphasized(true) + A_La_Derecha("Propina :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_propina.toString(), 2), linieasAlDerecha) + "\n"

        }

        totales += addLine("_", columna) + "\n"
        totales += printer.emphasized(true) + "OBSERVACION :" + printer.emphasized(false) + "\n"
        totales += titulo(data.first().f_observacion.toString(), columna) + "\n"
        totales += printer.emphasized(true) + "DIRECCION :" + printer.emphasized(false) + "\n"
        totales += printer.emphasized(false) + titulo(data.first().f_direccion.toString(), columna) + "\n"
        totales += addLine("_", columna) + "\n"
        totales += titulo(data.first().f_mensaje_orden.toString(), columna) + "\n"
        totales += A_La_Derecha(data.first().f_web.toString(), columna) + "\n"

        return totales
    }

    String generarTotales(List data,List componentes, PrinterESC printer, Integer columna) {
        String totales = ""


        if (!data.first().f_observacion.toString().equals("")) {
            totales += printer.emphasized(true) + "OBSERVACION :" + printer.emphasized(false) + "\n"
            totales += titulo(data.first().f_observacion.toString(), columna) + "\n"
        }

        totales += addLine("_", columna) + "\n"
        totales += A_La_Derecha(data.first().f_web.toString(), columna) + "\n"
        return totales
    }
    
    String generarContenidoRecibo(List recibo, PrinterESC printer, Integer columna) {
        String totales = ""
        String[] aplicado

        totales += printer.doubleHeight(true) + printer.emphasized(true) + A_La_Derecha("Total :", 38) + printer.emphasized(false) + A_La_Derecha(Round(recibo.first().f_total.toString(), 2), 9) + printer.doubleHeight(false) + "\n\n";
        totales += addLine("_", columna) + "\n";
        totales += titulo(recibo.first().f_mensaje_orden.toString(), columna) + "\n";
        totales += A_La_Derecha(recibo.first().f_web.toString(), columna) + "\n";

        aplicado = recibo.first().f_aplicado.toString().split(";");

        //detalle

        if (recibo.first().f_aplicado)
        {
            // Detalle cuando es un recibo de pago
            printer.setText(printer.emphasized(true));
            printer.setText(addLine("=", columna) + "\n");
            printer.setText(titulo("DISTRIBUCION", columna) + "\n");
            printer.setText(addLine("=", columna) + "\n");
            printer.setText(printer.emphasized(false));
            printer.setText("\n");
            printer.setText(printer.emphasized(true));
            printer.setText(RellenarString("DOCUMENTO", (columna == 32) ? 20 : 30));
            printer.setText(A_La_Derecha("APLICADO", (columna == 32) ? 12 : 17));
            printer.setText(printer.emphasized(false));
            printer.setText("\n");

            for (int i = 0; i < aplicado.length; i++) {
                String[] documuento = aplicado[i].split(",");
                printer.setText(RellenarString(documuento[0], (columna == 32) ? 12 : 12));
                printer.setText(RellenarString(documuento[1],(columna == 32) ? 12 : 18));
                printer.setText(A_La_Derecha(Round(documuento[2], 2), (columna == 32) ? 5 : 17) + "\n");
            }
        } else {

            // Detalle cuando es la creacion de una CXC
            printer.setText(printer.emphasized(true));
            printer.setText(addLine("=", columna) + "\n");
            printer.setText(titulo("CONCEPTO", columna) + "\n");
            printer.setText(addLine("=", columna) + "\n");
            printer.setText(printer.emphasized(false));
            printer.setText("\n");
            printer.setText(recibo.first().f_concepto.toString());
            printer.setText("\n");
        }


        printer.setText(addLine("-", columna));
        return totales
    }

    String generarTotales(Map data, PrinterESC printer, Integer columna) {
        String totales = ""
        Integer linieasAlDerecha = 10
        totales += RellenarString(printer.emphasized(true) + "Pedidos :", 21) + printer.emphasized(false) + A_La_Derecha(Round(data.f_pedidos.toString(), 2), linieasAlDerecha) + "\n";
        totales += RellenarString(printer.emphasized(true) + "Factura credito :", 21) + printer.emphasized(false) + A_La_Derecha(Round(data.f_factcredito.toString(), 2), linieasAlDerecha) + "\n";
        totales += RellenarString(printer.emphasized(true) + "Factura contado :", 21) + printer.emphasized(false) + A_La_Derecha(Round(data.f_factcontado.toString(), 2), linieasAlDerecha) + "\n";
        totales += RellenarString(printer.emphasized(true) + "Total credito :", 21) + printer.emphasized(false) + A_La_Derecha(Round(data.f_montocredito.toString(), 2), linieasAlDerecha) + "\n";
        totales += RellenarString(printer.emphasized(true) + "Total contado :", 21) + printer.emphasized(false) + A_La_Derecha(Round(data.f_montocontado.toString(), 2), linieasAlDerecha) + "\n";
        totales += RellenarString(printer.emphasized(true) + "Total ITBIS :", 21) + printer.emphasized(false) + A_La_Derecha(Round(data.f_montoitbis.toString(), 2), linieasAlDerecha) + "\n";
        totales += RellenarString(printer.emphasized(true) + "Total cheques :", 21) + printer.emphasized(false) + A_La_Derecha(Round(data.f_montocheque.toString(), 2), linieasAlDerecha) + "\n";
        totales += RellenarString(printer.emphasized(true) + "Total tarjetas :", 21) + printer.emphasized(false) + A_La_Derecha(Round(data.f_montotarjeta.toString(), 2), linieasAlDerecha) + "\n";
        totales += RellenarString(printer.emphasized(true) + "Total envio :", 21) + printer.emphasized(false) + A_La_Derecha(Round(data.f_montoenvio.toString(), 2), linieasAlDerecha) + "\n";
        totales += RellenarString(printer.emphasized(true) + "Total recibido :", 21) + printer.emphasized(false) + A_La_Derecha(Round(data.f_monto_recibo.toString(), 2), linieasAlDerecha) + "\n";
        totales += RellenarString(printer.emphasized(true) + "Total cancelado :", 21) + printer.emphasized(false) + A_La_Derecha(Round(data.f_monto_cancelado.toString(), 2), linieasAlDerecha) + "\n";
        totales += RellenarString(printer.emphasized(true) + "Total caja :", 21) + A_La_Derecha(Round(data.f_monto_caja.toString(), 2), linieasAlDerecha) + printer.emphasized(false) + "\n";

        return totales
    }


    String generarTotales(List data, PrinterESC printer, Integer columna) {
        Integer linieasAlDerecha = 10
        Integer lineaTotalesAlaDerecha = 36
        String totales = ""

        //LLENAMOS LOS DATOS TOTALES
        if (data.first().f_impresion_detalle_factura && data.first().f_modulo == 3) {
            totales += printer.emphasized(true) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), lineaTotalesAlaDerecha) +printer.emphasized(true) + A_La_Derecha(Round(data.first().f_total.toString(), 2), linieasAlDerecha) +"\n\n"

            totales += printer.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n";

            totales += printer.emphasized(true) + A_La_Derecha("Delivery :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.f_precio_envio.first().toString(), 2), linieasAlDerecha) + "\n";

            totales += printer.doubleHeight(true) + printer.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_envio.toString(), 2), linieasAlDerecha) + printer.doubleHeight(false) + "\n";

        } else if (data.first().f_modulo == 2) {
            totales += printer.emphasized(true) + A_La_Derecha("Sub-Total :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_subtotal.toString(), 2), linieasAlDerecha) + "\n";

            totales += printer.emphasized(true) + A_La_Derecha("ITBIS :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), linieasAlDerecha) + "\n";



            if (data.first().f_porciento_ley.toString().toBigDecimal() > 0) {
                totales += printer.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n"

                totales += printer.doubleHeight(true) + printer.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_porciento_ley.toString(), 2), linieasAlDerecha) + printer.doubleHeight(false) + "\n"

            } else {
                totales += printer.doubleHeight(true) + printer.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_total.toString(), 2), linieasAlDerecha) + printer.doubleHeight(false) + "\n"

            }

        } else {
            totales += printer.emphasized(true) + A_La_Derecha("Sub-Total :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_subtotal.toString(), 2), linieasAlDerecha) + "\n"

            totales += printer.emphasized(true) + A_La_Derecha("ITBIS :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), linieasAlDerecha) + "\n"

            totales += printer.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n"

            totales += printer.emphasized(true) + A_La_Derecha("Delivery :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.f_precio_envio.first().toString(), 2), linieasAlDerecha) + "\n"

            totales += printer.doubleHeight(true) + printer.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_envio.toString(), 2), linieasAlDerecha) + printer.doubleHeight(false) + "\n"

        }
        if (data.first().f_monto_efectivo.toString().toBigDecimal() > 0) {
            totales += printer.emphasized(true) + A_La_Derecha("Efectivo :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_monto_efectivo.toString(), 2), linieasAlDerecha) + "\n"

        }

        if (data.first().f_devuelta.toString().toBigDecimal() > 0) {
            totales += printer.emphasized(true) + A_La_Derecha("Cambio :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_devuelta.toString(), 2), linieasAlDerecha) + "\n"
        }

        if (parseDouble(data.first().f_monto_tarjeta.toString()) > 0) {
            totales += printer.emphasized(true) + A_La_Derecha("Tarjeta :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_monto_tarjeta.toString(), 2), linieasAlDerecha) + "\n"

        }
        if (parseDouble(data.first().f_propina.toString()) > 0) {
            totales += printer.emphasized(true) + A_La_Derecha("Propina :", lineaTotalesAlaDerecha) + printer.emphasized(false)  + A_La_Derecha(Round(data.first().f_propina.toString(), 2), linieasAlDerecha) + "\n"

        }

        totales += addLine("_", columna) + "\n"
        totales += printer.emphasized(true) + "OBSERVACION :" + printer.emphasized(false) + "\n"
        totales += titulo(data.first().f_observacion.toString(), columna) + "\n";
        totales += printer.emphasized(true) + "DIRECCION :" + printer.emphasized(false) + "\n"
        totales += printer.emphasized(false) + titulo(data.first().f_direccion.toString(), columna) + "\n"
        totales += addLine("_", columna) + "\n"
        totales += titulo(data.first().f_mensaje_orden.toString(), columna) + "\n"
        totales += A_La_Derecha(data.first().f_web.toString(), columna) + "\n"

        return totales
    }

    String generarContenido(List data, PrinterESC printer, Integer columna){

    }


    String generarDetalle32Columnas(List data, PrinterESC printer, Integer columna) {
        String detalle = ""
        detalle += printer.emphasized(true)
        detalle += addLine("=", columna) + "\n"
        detalle += RellenarString("DESCRIPCION", 21) + "\n"
        detalle += RellenarString("CANT", 8)
        detalle += A_La_Derecha("TAX", 8)
        detalle += RellenarString("", 6)
        detalle += A_La_Derecha("PRECIO", 8) + "\n"
        detalle += addLine("=", columna) + "\n"
        detalle += printer.emphasized(false)

        for (Map<String, Object> tupla : data) {

            detalle += Asignar_tres_puntos(tupla.get("f_descripcion").toString(), 22) + "\n"
            detalle += RellenarString(Round(tupla.get("f_cantidad"), 2), 8)
            detalle += A_La_Derecha(Round(tupla.get("f_itebis_producto"), 2), 8)
            detalle += RellenarString("", 6)
            detalle += A_La_Derecha(Round(tupla.get("f_precio"), 2), 8) + "\n"

            if (!tupla.get("f_componentes").toString().equals("") && !tupla.get("f_componentes").toString().equals("[]")) {
                Map map_componentes = JsonToMap(componentes)
                List<Map<String, Object>> list_componentes = (List<Map<String, Object>>) map_componentes.get("f_datos")

                for (Map<String, Object> tupla2 : list_componentes) {

                    detalle += RellenarString("*" + Round(tupla2.get("f_cantidad"), 2), 8)
                    detalle += Asignar_tres_puntos(RellenarString(tupla2.get("f_descripcion").toString(), 22), 22)
                    detalle += A_La_Derecha(Round(tupla2.get("f_itebis_producto"), 2), 7)
                    datelle += RellenarString("", 4)
                    detalle += A_La_Derecha(Round(tupla2.get("f_monto_cobrar"), 2), 7) + "\n"

                }
            }

        }
        detalle += addLine("-", columna)
        return detalle
    }

    String generarDetalle32Columnas(List data, List componente, PrinterESC printer, Integer columna) {
        String detalle = ""
        detalle += printer.emphasized(true)
        detalle += addLine("=", columna) + "\n"
        detalle += RellenarString("DESCRIPCION", 21) + "\n"
        detalle += RellenarString("CANT", 8)
        detalle += A_La_Derecha("TAX", 8)
        detalle += RellenarString("", 6)
        detalle += A_La_Derecha("PRECIO", 8) + "\n"
        detalle += addLine("=", columna) + "\n"
        detalle += printer.emphasized(false)

        for (Map<String, Object> tupla : data) {

            detalle += Asignar_tres_puntos(tupla.get("f_descripcion").toString(), 22) + "\n"
            detalle += RellenarString(Round(tupla.get("f_cantidad"), 2), 8)
            detalle += A_La_Derecha(Round(tupla.get("f_itebis_producto"), 2), 8)
            detalle += RellenarString("", 6)
            detalle += A_La_Derecha(Round(tupla.get("f_precio"), 2), 8) + "\n"

            if (!tupla.get("f_componentes").toString().equals("") && !tupla.get("f_componentes").toString().equals("[]")) {
                Map map_componentes = JsonToMap(componentes)
                List<Map<String, Object>> list_componentes = (List<Map<String, Object>>) map_componentes.get("f_datos")

                for (Map<String, Object> tupla2 : list_componentes) {

                    detalle += RellenarString("*" + Round(tupla2.get("f_cantidad"), 2), 8)
                    detalle += Asignar_tres_puntos(RellenarString(tupla2.get("f_descripcion").toString(), 22), 22)
                    detalle += A_La_Derecha(Round(tupla2.get("f_itebis_producto"), 2), 7)
                    datelle += RellenarString("", 4)
                    detalle += A_La_Derecha(Round(tupla2.get("f_monto_cobrar"), 2), 7) + "\n"

                }
            }

        }
        detalle += addLine("-", columna)
        return detalle
    }

    String generarDetalleColumnas(List data, PrinterESC printer, Integer columna) {
        String detalle = ""
        detalle += printer.emphasized(true)
        detalle += addLine("=", columna) + "\n"
        detalle += RellenarString("CANT", 8)
        detalle += RellenarString("DESCRIPCION", 22)
        detalle += A_La_Derecha("TAX", 7)
        detalle += RellenarString("", 3)
        detalle += A_La_Derecha("PRECIO", 7) + "\n"
        detalle += addLine("=", columna) + "\n"
        detalle += printer.emphasized(false)

        //VAMOS A AGREGAR EL DETALLE
        for (Map<String, Object> tupla : data) {
            detalle += RellenarString(Round(tupla.get("f_cantidad"), 2), 8)
            detalle += Asignar_tres_puntos(RellenarString(tupla.get("f_descripcion").toString(), 22), 22)
            detalle += A_La_Derecha(Round(tupla.get("f_itebis_producto"), 2), 7)
            detalle += RellenarString("", 3)
            detalle += A_La_Derecha(Round(tupla.get("f_precio"), 2), 7) + "\n"

            //EXTRAEMOS LOS COMPONENTES DE CADA PRODUCTO

            if (!tupla.get("f_componentes").toString().equals("") && !tupla.get("f_componentes").toString().equals("[]")) {
                Map map_componentes = JsonToMap(componentes)
                List<Map<String, Object>> list_componentes = (List<Map<String, Object>>) map_componentes.get("f_datos")

                for (Map<String, Object> tupla2 : list_componentes) {
                    detalle += RellenarString("*" + Round(tupla2.get("f_cantidad"), 2), 8)
                    detalle += Asignar_tres_puntos(RellenarString(tupla2.get("f_descripcion").toString(), 22), 22)
                    detalle += A_La_Derecha(Round(tupla2.get("f_itebis_producto"), 2), 7)
                    detalle += RellenarString("", 3)
                    detalle += A_La_Derecha(Round(tupla2.get("f_monto_cobrar"), 2), 7) + "\n"
                }
            }

        }
        detalle += addLine("-", columna)
        return detalle
    }

    String generarDetalleColumnas(List data,List componente,PrinterESC printer, Integer columna) {
        String detalle = ""
        detalle += printer.emphasized(true)
        detalle += addLine("=", columna) + "\n"
        detalle += RellenarString("CANT", 8)
        detalle += RellenarString("DESCRIPCION", 22) + "\n"

        detalle += addLine("=", columna) + "\n"
        detalle += printer.emphasized(false)

        //VAMOS A AGREGAR EL DETALLE
        for (Map<String, Object> tupla : data) {
            detalle += RellenarString(Round(tupla.get("f_cantidad"), 2), 8)
            detalle += Asignar_tres_puntos(RellenarString(tupla.get("f_descripcion").toString(), 22), 22) + "\n"


            //EXTRAEMOS LOS COMPONENTES DE CADA PRODUCTO

            if (!tupla.get("f_componentes").toString().equals("") && !tupla.get("f_componentes").toString().equals("[]")) {
                Map map_componentes = JsonToMap(componentes)

                if (!tupla.f_comentario.toString().equals("")) {
                    printer.setText(RellenarString("", 8) + RellenarString("-" + tupla.f_comentario.toString() + "-", 22));
                    printer.setText("\n");
                }

                componentes.each { item ->
                    if (item.detalle_id == tupla.detalle_id) {
                        printer.setText(RellenarString("", 8) + RellenarString("*" + item.f_descripcion.toString() + "*", 22));
                        printer.setText("\n")
                    }
                }
            }

        }
        detalle += addLine("-", columna)
        return detalle

    }


    String generarDetalle42Columnas(List data, PrinterESC printer, Integer columna) {
        String detalle = ""
        detalle += printer.emphasized(true)
        detalle += addLine("=", columna) + "\n"
        detalle += RellenarString("CANT", 8)
        detalle += RellenarString("DESCRIPCION", 18)
        detalle += A_La_Derecha("TAX", 6)
        detalle += RellenarString("", 4)
        detalle += A_La_Derecha("PRECIO", 6) + "\n"
        detalle += addLine("=", columna) + "\n"
        detalle += printer.emphasized(false)

        //VAMOS A AGREGAR EL DETALLE
        for (Map<String, Object> tupla : data) {
            detalle += RellenarString(Round(tupla.get("f_cantidad"), 2), 8)
            detalle += Asignar_tres_puntos(RellenarString(tupla.get("f_descripcion").toString(), 18), 18)
            detalle += A_La_Derecha(Round(tupla.get("f_itebis_producto"), 2), 6)
            detalle += RellenarString("", 2)
            detalle += A_La_Derecha(Round(tupla.get("f_precio"), 2), 8) + "\n"

            //EXTRAEMOS LOS COMPONENTES DE CADA PRODUCTO

            if (!tupla.get("f_componentes").toString().equals("") && !tupla.get("f_componentes").toString().equals("[]")) {
                Map map_componentes = JsonToMap(componentes)
                List<Map<String, Object>> list_componentes = (List<Map<String, Object>>) map_componentes.get("f_datos")

                for (Map<String, Object> tupla2 : list_componentes) {
                    detalle += RellenarString("*" + Round(tupla2.get("f_cantidad"), 2), 8)
                    detalle += Asignar_tres_puntos(RellenarString(tupla2.get("f_descripcion").toString(), 18), 18)
                    detalle += A_La_Derecha(Round(tupla2.get("f_itebis_producto"), 2), 6)
                    detalle += RellenarString("", 4)
                    detalle += A_La_Derecha(Round(tupla2.get("f_monto_cobrar"), 2), 6) + "\n"
                }
            }

        }
        detalle += addLine("-", columna)
        return detalle
    }
    String generarTotales42Columnas(List data, PrinterESC printer, Integer columna) {
        Integer linieasAlDerecha = 10
        Integer lineaTotalesAlaDerecha = 30
        String totales = ""

        //LLENAMOS LOS DATOS TOTALES
        if (data.first().f_impresion_detalle_factura && data.first().f_modulo == 3) {
            totales += printer.emphasized(true) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), lineaTotalesAlaDerecha) +printer.emphasized(true) + A_La_Derecha(Round(data.first().f_total.toString(), 2), linieasAlDerecha) +"\n\n"

            totales += printer.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n";

            totales += printer.emphasized(true) + A_La_Derecha("Delivery :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.f_precio_envio.first().toString(), 2), linieasAlDerecha) + "\n";

            totales += printer.doubleHeight(true) + printer.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_envio.toString(), 2), linieasAlDerecha) + printer.doubleHeight(false) + "\n";

        } else if (data.first().f_modulo == 2) {
            totales += printer.emphasized(true) + A_La_Derecha("Sub-Total :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_subtotal.toString(), 2), linieasAlDerecha) + "\n";

            totales += printer.emphasized(true) + A_La_Derecha("ITBIS :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), linieasAlDerecha) + "\n";



            if (data.first().f_porciento_ley.toString().toBigDecimal() > 0) {
                totales += printer.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n"

                totales += printer.doubleHeight(true) + printer.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_porciento_ley.toString(), 2), linieasAlDerecha) + printer.doubleHeight(false) + "\n"

            } else {
                totales += printer.doubleHeight(true) + printer.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_total.toString(), 2), linieasAlDerecha) + printer.doubleHeight(false) + "\n"

            }

        } else {
            totales += printer.emphasized(true) + A_La_Derecha("Sub-Total :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_subtotal.toString(), 2), linieasAlDerecha) + "\n"

            totales += printer.emphasized(true) + A_La_Derecha("ITBIS :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.f_tax.first().toString(), 2), linieasAlDerecha) + "\n"

            totales += printer.emphasized(true) + A_La_Derecha("10% Ley :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_porciento_ley.toString(), 2), linieasAlDerecha) + "\n"

            totales += printer.emphasized(true) + A_La_Derecha("Delivery :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.f_precio_envio.first().toString(), 2), linieasAlDerecha) + "\n"

            totales += printer.doubleHeight(true) + printer.emphasized(true) + A_La_Derecha("Total :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_total_con_envio.toString(), 2), linieasAlDerecha) + printer.doubleHeight(false) + "\n"

        }
        if (data.first().f_monto_efectivo.toString().toBigDecimal() > 0) {
            totales += printer.emphasized(true) + A_La_Derecha("Efectivo :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_monto_efectivo.toString(), 2), linieasAlDerecha) + "\n"

        }

        if (data.first().f_devuelta.toString().toBigDecimal() > 0) {
            totales += printer.emphasized(true) + A_La_Derecha("Cambio :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_devuelta.toString(), 2), linieasAlDerecha) + "\n"
        }

        if (parseDouble(data.first().f_monto_tarjeta.toString()) > 0) {
            totales += printer.emphasized(true) + A_La_Derecha("Tarjeta :", lineaTotalesAlaDerecha) + printer.emphasized(false) + A_La_Derecha(Round(data.first().f_monto_tarjeta.toString(), 2), linieasAlDerecha) + "\n"

        }
        if (parseDouble(data.first().f_propina.toString()) > 0) {
            totales += printer.emphasized(true) + A_La_Derecha("Propina :", lineaTotalesAlaDerecha) + printer.emphasized(false)  + A_La_Derecha(Round(data.first().f_propina.toString(), 2), linieasAlDerecha) + "\n"

        }

        totales += addLine("_", columna) + "\n"
        totales += printer.emphasized(true) + "OBSERVACION :" + printer.emphasized(false) + "\n"
        totales += titulo(data.first().f_observacion.toString(), columna) + "\n";
        totales += printer.emphasized(true) + "DIRECCION :" + printer.emphasized(false) + "\n"
        totales += printer.emphasized(false) + titulo(data.first().f_direccion.toString(), columna) + "\n"
        totales += addLine("_", columna) + "\n"
        totales += titulo(data.first().f_mensaje_orden.toString(), columna) + "\n"
        totales += A_La_Derecha(data.first().f_web.toString(), columna) + "\n"

        return totales
    }

}
