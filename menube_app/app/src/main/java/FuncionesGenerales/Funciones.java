/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesGenerales;

import Datos.PrintJobWatcher;
import Datos.PrinterESC;
import Datos.PrinterEpson;
import Datos.PrinterStar;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.HashPrintServiceAttributeSet;
import javax.print.attribute.standard.PrinterName;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Usuario
 */
public class Funciones {

    public void SetPlaceHolderTextfield(JTextField field, String texto, Color color_principal, Color color_place) {

        field.addFocusListener(new FocusListener() {
            Boolean si_no = true;

            @Override
            public void focusGained(FocusEvent e) {
                if (si_no) {
                    field.setText("");
                    field.setForeground(color_principal);
                    si_no = false;
                }
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (field.getText().equals("")) {
                    field.setText(texto);
                    si_no = true;
                    field.setForeground(color_place);

                }
            }
        });

    }

    public void setValorCombo(JComboBox comboBox, String valor) {
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            if (((Combo) comboBox.getItemAt(i)).getId().equals(valor)) {
                comboBox.setSelectedIndex(i);
                return;
            }
        }

    }

    public void mensaje(String menString) {
        JOptionPane.showMessageDialog(null, menString);
    }

    public void mensaje(String mensaje, String titulo, int tipo) {
        if (titulo.equals("")) {
            titulo = "Aviso";
        }
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipo);
    }

    public int mensajeConfirmacion(String mensaje, String titulo, int tipo) {
        if (titulo.equals("")) {
            titulo = "Aviso";
        }
        int opcion = JOptionPane.showConfirmDialog(null, mensaje, titulo, tipo);
        
        return opcion;
    }

    public void borrarTabla(JTable tabla) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        for (int i = tabla.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        tabla.repaint();
        tabla.revalidate();
    }

    public String Round(Object numero, int cantida_ceros) {
        String form = "%1$,." + cantida_ceros + "f";
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

    public Map JsonToMap(String json) {

        try {
            return new ObjectMapper().readValue(json, new TypeReference<Map<String, Object>>() {
            });
        } catch (Exception e) {
            System.err.println("JsonToMap --> " + e.getMessage());
            return null;
        }

    }

    public List<Map<String, Object>> JsonToListMap(Object json) {
        return (List<Map<String, Object>>) json;
    }

    public void addNumberFieldInteger(JTextField textField) {
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char vChar = evt.getKeyChar();

                if (!(Character.isDigit(vChar)
                        || (vChar == KeyEvent.VK_BACK_SPACE)
                        || (vChar == KeyEvent.VK_DELETE))
                        || (vChar == 46)) {
                    evt.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

    }

    public void addNumberFieldFloat(JTextField textField) {
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char vChar = evt.getKeyChar();
                if (!(Character.isDigit(vChar) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE) || (vChar == '.'))) {
                    evt.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                String valor = ((JTextField) e.getComponent()).getText();
                if (valor.length() == 1 && valor.equals(".")) {
                    ((JTextField) e.getComponent()).setText("");
                }
            }
        });

    }

    public String GetDiaSemana(Long tipo_en_string_o_numero) {
        Calendar now = Calendar.getInstance();

        String[] strDays = {"Domingo",
            "Lunes",
            "Martes",
            "Miercoles",
            "Jueves",
            "Viernes",
            "Sabado"};
        if (tipo_en_string_o_numero == 1) {
            return strDays[now.get(Calendar.DAY_OF_WEEK) - 1];

        } else if (tipo_en_string_o_numero == 2) {
            return (now.get(Calendar.DAY_OF_WEEK) - 1) + "";
        }
        return null;

    }

    public Color getRandomColor() {
        Random numRandom = new Random();

//        Color[] colorPool = {
//            new Color(102, 255, 102),
//            new Color(64, 149, 191),
//            new Color(51, 255, 204),
//            new Color(255, 102, 102),
//            new Color(204, 204, 0),
//            new Color(255, 102, 102),
//            new Color(255, 51, 12),
//            new Color(51, 153, 255),
//            new Color(255, 102, 0),
//            new Color(255, 197, 117),
//            new Color(255, 130, 112),
//            new Color(0, 153, 153)
//        };
//return colorPool[numRandom.nextInt(11)];

        Color[] colorPool = {
            new Color(130, 224, 170),
            new Color(220, 118, 51),
            new Color(249, 231, 159),
            new Color(247, 220, 111)
        };

//        

        return colorPool[numRandom.nextInt(4)];

    }

    public void eliminar_tabla(JTable tabla) {
        DefaultTableModel tableModel = (DefaultTableModel) tabla.getModel();
        for (int i = tabla.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        tabla.repaint();
        tabla.revalidate();
    }

    public String CrearJsonComponentes(List<Map<String, Object>> lista) {
        String json = "[";
        String aux = "";

        for (Map<String, Object> tupla : lista) {
            aux = aux
                    + "{"
                    + "\"fIdprodcutoComponente\":\"" + tupla.get("fIdprodcutoComponente") + "\","
                    + "\"fIngrediente\":\"" + tupla.get("fIngrediente") + "\","
                    + "\"fCantidad\":\"" + tupla.get("fCantidad") + "\","
                    + "\"fCobrable\":\"" + tupla.get("fCobrable") + "\","
                    + "\"fMontoCobrar\":\"" + tupla.get("fMontoCobrar") + "\","
                    + "\"fidproducto\":\"" + tupla.get("fidproducto") + "\","
                    + "\"fnumerofila\":\"" + tupla.get("fnumerofila") + "\""
                    + "},";
        }

        aux = aux.replace(",}", "}");
        json = "[" + aux + "]";
        return json.replace(",]", "]");
    }

    public String CrearJsonDetalles(TableModel tabla_datos) {
        String detalle = "";
        String aux_detalle = "";

        for (int i = 0; i < tabla_datos.getRowCount(); i++) {
            TableModel modelo = tabla_datos;
            Double precio_en_tabla = parseDouble(modelo.getValueAt(i, 4).toString());
            Double cantidad_en_tabla = parseDouble(modelo.getValueAt(i, 1).toString());
            Double tax_en_tabla = parseDouble(modelo.getValueAt(i, 6).toString());
            String referencia = modelo.getValueAt(i, 2).toString();
            String idproducto = modelo.getValueAt(i, 7).toString();
            String numero_fila = modelo.getValueAt(i, 0).toString();
            String comanda = modelo.getValueAt(i, 10).toString();
            String idcomanda = modelo.getValueAt(i, 11).toString();

            aux_detalle = "{"
                    + "\"f_idproducto\":\"" + idproducto + "\","
                    + "\"f_cantidad\":\"" + cantidad_en_tabla + "\","
                    + "\"f_precio\":\"" + precio_en_tabla + "\","
                    + "\"f_itbis\":\"" + tax_en_tabla + "\","
                    + "\"f_numero_fila\":\"" + numero_fila + "\","
                    + "\"f_comanda\":\"" + comanda + "\","
                    + "\"f_idcomanda\":\"" + idcomanda + "\","
                    + "\"f_referencia\":\"" + referencia + "\""
                    + "},";

            detalle += aux_detalle;
        }

        detalle = "[" + detalle + "]";
        detalle = detalle.replace(",]", "]");

        return detalle;
    }
    public String CrearJsonDetallesDelivery(TableModel tabla_datos) {
        String detalle = "";
        String aux_detalle = "";

        for (int i = 0; i < tabla_datos.getRowCount(); i++) {
            TableModel modelo = tabla_datos;
            Double precio_en_tabla = parseDouble(modelo.getValueAt(i, 5).toString());
            Double cantidad_en_tabla = parseDouble(modelo.getValueAt(i, 4).toString());
            Double tax_en_tabla = parseDouble(modelo.getValueAt(i, 6).toString());
            String referencia = modelo.getValueAt(i, 2).toString();
            String idproducto = modelo.getValueAt(i, 0).toString();
            
            String comanda = modelo.getValueAt(i, 8).toString();
            String idcomanda = modelo.getValueAt(i, 9).toString();

            aux_detalle = "{"
                    + "\"f_referencia\":\"" + referencia+ "\","
                    + "\"f_cantidad\":\"" + cantidad_en_tabla + "\","
                    + "\"f_precio\":\"" + precio_en_tabla + "\","
                    + "\"f_comanda\":\"" + comanda + "\","
                    + "\"f_idcomanda\":\"" + idcomanda + "\","
                    + "\"f_tax\":\"" + tax_en_tabla + "\""
                    + "},";

            detalle += aux_detalle;
        }

        detalle = "[" + detalle + "]";
        detalle = detalle.replace(",]", "]");

        return detalle;
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

    public void GenerarStringFacturaImprimirTermica(String json, String tipo_printer, String accion) throws IOException {

        PrinterESC p;
        int columna;

//        if (tipo_printer.equals("1")) {
//            p = new PrinterStar();
//            columna = 47;
//        } else {
//            p = new PrinterEpson();
//            columna = 43;
//        }
        if (tipo_printer.equals("1")) {
            p = new PrinterStar();
            columna = 42;
        } else {
            p = new PrinterEpson();
            columna = 43;
        }

        Map map = JsonToMap(json);
        List<Map<String, Object>> map1 = (List<Map<String, Object>>) map.get("f_data");

        String header_factura = "";
        String datosprincipales = "";
        String numero_factura = "";
        String datos_totales = "";

        //LLENAMOS EL HEADER
        for (Map<String, Object> tupla : map1) {

            numero_factura = tupla.get("f_numero").toString();
            header_factura += p.doubleHeight(true) + p.emphasized(true) + titulo(tupla.get("f_nombre_empresa").toString().toUpperCase(), columna) + p.emphasized(false) + p.doubleHeight(false) + "\n";
            header_factura += tupla.get("f_header_factura_pequena").toString() + "\n";
            header_factura += p.emphasized(true) + p.doubleHeight(true) + titulo(accion, columna) + p.doubleHeight(false) + p.emphasized(false) + "\n";

            datosprincipales += p.emphasized(true) + "Mesa : " + p.emphasized(false) + tupla.get("f_mesa")==null?tupla.get("f_mesa"):"" + "\n";
            datosprincipales += p.emphasized(true) + "Numero : " + p.emphasized(false) + tupla.get("f_numero").toString() + "\n";
            datosprincipales += p.emphasized(true) + "Cajero : " + p.emphasized(false) + tupla.get("f_cajero").toString() + "\n";
            datosprincipales += p.emphasized(true) + "Camarero : " + p.emphasized(false) + tupla.get("f_camarero")==null?tupla.get("f_camarero").toString():"" + "\n";
            datosprincipales += p.emphasized(true) + "Fecha : " + p.emphasized(false) + tupla.get("f_fecha_registro_factura").toString() + "\n";
            
            if (!tupla.get("f_cliente").toString().equals("") && tupla.get("f_cliente").toString()!=null && !tupla.get("f_cliente").toString().equals("null")) {
                 datosprincipales += p.emphasized(true) + "Cliente : " + p.emphasized(false) + tupla.get("f_cliente").toString() + "\n";
            }
            
            
            if (!tupla.get("f_rnc").toString().equals("") && tupla.get("f_rnc").toString()!=null && !tupla.get("f_rnc").toString().equals("null")) {
                 datosprincipales += p.emphasized(true) + "RNC : " + p.emphasized(false) + tupla.get("f_rnc").toString() + "\n";
                 datosprincipales += p.emphasized(true) + "Razon Social : " + p.emphasized(false) + tupla.get("f_razon_social").toString() + "\n";
            }
            
            
            if (!tupla.get("f_numero_ncf").toString().equals("") && !tupla.get("f_numero_ncf").toString().isEmpty()) {
                datosprincipales += p.emphasized(true) + "NCF : " + p.emphasized(false) + tupla.get("f_numero_ncf").toString() + "\n";
                datosprincipales += p.emphasized(true) + titulo(tupla.get("f_descripcion_ncf").toString(), columna) + p.emphasized(false)+ "\n";
            }
            
            //LLENAMOS LOS DATOS TOTALES
            datos_totales += p.emphasized(true) + A_La_Derecha("Sub-Total :", 35) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_subtotal").toString(), 2), 7) + "\n";
            datos_totales += p.emphasized(true) + A_La_Derecha("Itbis :", 35) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_tax").toString(), 2), 7) + "\n";
            datos_totales += p.emphasized(true) + A_La_Derecha("10% Ley :", 35) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_porciento_ley").toString(), 2), 7) + "\n";
             datos_totales += p.emphasized(true) + A_La_Derecha("Envio :", 35) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_envio").toString(), 2), 7) + "\n";

            datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", 35) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_total").toString(), 2), 7) + p.doubleHeight(false) + "\n\n";
            datos_totales += p.emphasized(true) + A_La_Derecha("Efectivo :", 35) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_monto_efectivo").toString(), 2), 7) + "\n";
            datos_totales += p.emphasized(true) + A_La_Derecha("Cambio :", 35) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_devuelta").toString(), 2), 7) + "\n";
            if (parseDouble(tupla.get("f_monto_tarjeta").toString()) > 0) {
                datos_totales += p.emphasized(true) + A_La_Derecha("Tarjeta :", 35) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_monto_tarjeta").toString(), 2), 7) + "\n";
            }
            if (parseDouble(tupla.get("f_propina").toString()) > 0) {
                datos_totales += p.emphasized(true) + A_La_Derecha("Propina :", 35) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_propina").toString(), 2), 7) + "\n";
            }

            datos_totales += addLine("_", columna) + "\n";
            datos_totales += p.emphasized(true) + "OBSERVACION :" + p.emphasized(false)+"\n";
            datos_totales += titulo(tupla.get("f_observacion").toString(), columna)+"\n";
            datos_totales += p.emphasized(true) + "DIRECCION :" + p.emphasized(false)+"\n";
            datos_totales += titulo(tupla.get("f_direccion").toString(), columna)+"\n";
            datos_totales += addLine("_", columna) + "\n";
            datos_totales += titulo(tupla.get("f_mensaje_orden").toString(), columna) + "\n";
            datos_totales += A_La_Derecha(tupla.get("f_web").toString(), columna) + "\n";
            break;

        }

        p.setText(header_factura);
        p.setText("\n");
        p.setText(datosprincipales);
        p.setText("\n");

        p.setText(p.emphasized(true));
        p.setText(addLine("=", columna) + "\n");
        p.setText(RellenarString("CANT", 8));
        p.setText(RellenarString("DESCRIPCION", 17));
        p.setText(A_La_Derecha("TAX", 7));
        p.setText(RellenarString("", 3));
        p.setText(A_La_Derecha("PRECIO", 7) + "\n");
        p.setText(addLine("=", columna) + "\n");
        p.setText(p.emphasized(false));

        //VAMOS A AGREGAR EL DETALLE
        for (Map<String, Object> tupla : map1) {

            p.setText(RellenarString(Round(tupla.get("f_cantidad"), 2), 8));
            p.setText(Asignar_tres_puntos(RellenarString(tupla.get("f_descripcion").toString(), 17), 17));
            p.setText(A_La_Derecha(Round(tupla.get("f_itebis_producto"), 2), 7));
            p.setText(RellenarString("", 3));
            p.setText(A_La_Derecha(Round(tupla.get("f_precio"), 2), 7));
            p.setText("\n");

            //EXTRAEMOS LOS COMPONENTES DE CADA PRODUCTO
            String componentes = new String(Base64.decodeBase64(tupla.get("f_componentes").toString()));

            if (!componentes.equals("") && !componentes.equals("[]")) {
                Map map_componentes = JsonToMap(componentes);
                List<Map<String, Object>> list_componentes = (List<Map<String, Object>>) map_componentes.get("f_datos");

                for (Map<String, Object> tupla2 : list_componentes) {

                    p.setText(RellenarString("*" + Round(tupla2.get("f_cantidad"), 2), 8));
                    p.setText(Asignar_tres_puntos(RellenarString(tupla2.get("f_descripcion").toString(), 17), 17));
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
        Imprimir(p.finalCommandSet().getBytes());

    }
    
    
    
    public void GenerarStringFacturaImprimirMatricial(String json, String tipo_printer, String accion) throws IOException {

        PrinterESC p;
        int columna;

//        if (tipo_printer.equals("1")) {
//            p = new PrinterStar();
//            columna = 47;
//        } else {
//            p = new PrinterEpson();
//            columna = 43;
//        }
        if (tipo_printer.equals("1")) {
            p = new PrinterStar();
            columna = 40;
        } else {
            p = new PrinterEpson();
            columna = 40;
        }

        Map map = JsonToMap(json);
        List<Map<String, Object>> map1 = (List<Map<String, Object>>) map.get("f_data");

        String header_factura = "";
        String datosprincipales = "";
        String numero_factura = "";
        String datos_totales = "";

        //LLENAMOS EL HEADER
        for (Map<String, Object> tupla : map1) {

            numero_factura = tupla.get("f_numero").toString();
            header_factura += p.doubleHeight(true) + p.emphasized(true) + titulo(tupla.get("f_nombre_empresa").toString().toUpperCase(), columna) + p.emphasized(false) + p.doubleHeight(false) + "\n";
            header_factura += tupla.get("f_header_factura_pequena").toString() + "\n";
            header_factura += p.emphasized(true) + p.doubleHeight(true) + titulo(accion, columna) + p.doubleHeight(false) + p.emphasized(false) + "\n";

//            datosprincipales += p.emphasized(true) + "Mesa : " + p.emphasized(false) + tupla.get("f_mesa").toString() + "\n";
//            datosprincipales += p.emphasized(true) + "Numero : " + p.emphasized(false) + tupla.get("f_numero").toString() + "\n";
//            datosprincipales += p.emphasized(true) + "Cajero : " + p.emphasized(false) + tupla.get("f_cajero").toString() + "\n";
//            datosprincipales += p.emphasized(true) + "Camarero : " + p.emphasized(false) + tupla.get("f_camarero").toString() + "\n";
//            datosprincipales += p.emphasized(true) + "Fecha : " + p.emphasized(false) + tupla.get("f_fecha_registro_factura").toString() + "\n";
//            
//            
            datosprincipales += p.emphasized(true) + "Mesa : " + p.emphasized(false) + tupla.get("f_mesa")==null?tupla.get("f_mesa"):"" + "\n";
            datosprincipales += p.emphasized(true) + "Numero : " + p.emphasized(false) + tupla.get("f_numero").toString() + "\n";
            datosprincipales += p.emphasized(true) + "Cajero : " + p.emphasized(false) + tupla.get("f_cajero").toString() + "\n";
            datosprincipales += p.emphasized(true) + "Camarero : " + p.emphasized(false) + tupla.get("f_camarero")==null?tupla.get("f_camarero").toString():"" + "\n";
            datosprincipales += p.emphasized(true) + "Fecha : " + p.emphasized(false) + tupla.get("f_fecha_registro_factura").toString() + "\n";
            
            
            if (!tupla.get("f_cliente").equals("") && tupla.get("f_cliente")!=null && !tupla.get("f_cliente").equals("null")) {
                 datosprincipales += p.emphasized(true) + "Cliente : " + p.emphasized(false) + tupla.get("f_cliente").toString() + "\n";
            }
            
             if (!tupla.get("f_rnc").toString().equals("") && tupla.get("f_rnc").toString()!=null && !tupla.get("f_rnc").toString().equals("null")) {
                 datosprincipales += p.emphasized(true) + "RNC : " + p.emphasized(false) + tupla.get("f_rnc").toString() + "\n";
                 datosprincipales += p.emphasized(true) + "Razon Social : " + p.emphasized(false) + tupla.get("f_razon_social").toString() + "\n";
            }

            if (!tupla.get("f_numero_ncf").toString().equals("") && !tupla.get("f_numero_ncf").toString().isEmpty()) {
                datosprincipales += p.emphasized(true) + "NCF : " + p.emphasized(false) + tupla.get("f_numero_ncf").toString() + "\n";
                datosprincipales += p.emphasized(true) + titulo(tupla.get("f_descripcion_ncf").toString(), columna) + p.emphasized(false)+ "\n";

            }

            //LLENAMOS LOS DATOS TOTALES
            datos_totales += p.emphasized(true) + A_La_Derecha("Sub-Total :", columna -10) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_subtotal").toString(), 2), 10) + "\n";

            datos_totales += p.emphasized(true) + A_La_Derecha("Itbis :", columna -10) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_tax").toString(), 2), 10) + "\n";

            datos_totales += p.emphasized(true) + A_La_Derecha("10% Ley :", columna -10) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_porciento_ley").toString(), 2), 10) + "\n";
           
            
            datos_totales += p.emphasized(true) + A_La_Derecha("Envio :", columna -10) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_envio").toString(), 2), 10) + "\n";

            datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", columna -10) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_total").toString(), 2), 10) + p.doubleHeight(false) + "\n\n";

            datos_totales += p.emphasized(true) + A_La_Derecha("Efectivo :", columna -10) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_monto_efectivo").toString(), 2), 10) + "\n";

            datos_totales += p.emphasized(true) + A_La_Derecha("Cambio :", columna -10) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_devuelta").toString(), 2), 10) + "\n";

            if (parseDouble(tupla.get("f_monto_tarjeta").toString()) > 0) {
                datos_totales += p.emphasized(true) + A_La_Derecha("Tarjeta :", columna -10) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_monto_tarjeta").toString(), 2), 10) + "\n";

            }
            if (parseDouble(tupla.get("f_propina").toString()) > 0) {
                datos_totales += p.emphasized(true) + A_La_Derecha("Propina :", columna -10) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_propina").toString(), 2), 10) + "\n";

            }

            datos_totales += addLine("_", columna) + "\n";
            datos_totales += p.emphasized(true) + "OBSERVACION Y/O DERECCION :" + p.emphasized(false)+"\n";
            datos_totales += titulo(tupla.get("f_observacion").toString(), columna)+"\n";
            datos_totales += addLine("_", columna) + "\n";
            datos_totales += titulo(tupla.get("f_mensaje_orden").toString(), columna) + "\n";
            datos_totales += A_La_Derecha(tupla.get("f_web").toString(), columna) + "\n";

            break;

        }

        p.setText(header_factura);
        p.setText("\n");
        p.setText(datosprincipales);
        p.setText("\n");

        p.setText(p.emphasized(true));
        p.setText(addLine("=", columna) + "\n");
        p.setText(RellenarString("CANT", 5));
        p.setText(RellenarString("DESCRIPCION", 20));
        p.setText(A_La_Derecha("TAX", 5));
        p.setText(RellenarString("", 3));
        p.setText(A_La_Derecha("PRECIO", 7) + "\n");
        p.setText(addLine("=", columna) + "\n");
        p.setText(p.emphasized(false));

        //VAMOS A AGREGAR EL DETALLE
        for (Map<String, Object> tupla : map1) {

            p.setText(RellenarString(Round(tupla.get("f_cantidad"), 2), 5));
            p.setText(Asignar_tres_puntos(RellenarString(tupla.get("f_descripcion").toString(), 20), 20));
            p.setText(A_La_Derecha(Round(tupla.get("f_itebis_producto"), 2), 5));
            p.setText(RellenarString("", 3));
            p.setText(A_La_Derecha(Round(tupla.get("f_precio"), 2), 7));
            p.setText("\n");

            //EXTRAEMOS LOS COMPONENTES DE CADA PRODUCTO
            String componentes = new String(Base64.decodeBase64(tupla.get("f_componentes").toString()));

            if (!componentes.equals("") && !componentes.equals("[]")) {
                Map map_componentes = JsonToMap(componentes);
                List<Map<String, Object>> list_componentes = (List<Map<String, Object>>) map_componentes.get("f_datos");

                for (Map<String, Object> tupla2 : list_componentes) {

                    p.setText(RellenarString("*" + Round(tupla2.get("f_cantidad"), 2), 5));
                    p.setText(Asignar_tres_puntos(RellenarString(tupla2.get("f_descripcion").toString(), 20), 20));
                    p.setText(A_La_Derecha(Round(tupla2.get("f_itebis_producto"), 2), 5));
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
        p.setText("\n");
        p.setText("\n");
        p.setText("\n");

        //p.setText(p.getBarcodeEscPosCode(numero_factura));
       // p.cortar();
        Imprimir(p.finalCommandSet().getBytes());

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

            valor = String.format("%1$-" + tamano.toString() + "s", valor);
        }

        return valor;
    }

    public boolean Imprimir(byte[] b) {
        try {

            Dao dao = new Dao();

            AttributeSet attrSet = new HashPrintServiceAttributeSet(new PrinterName(dao.getPrinte(), null));

            //AttributeSet attrSet = new HashPrintServiceAttributeSet(new PrinterName("Generic / Text Only", null));
            DocPrintJob job = PrintServiceLookup.lookupPrintServices(null, attrSet)[0].createPrintJob();
            DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
            Doc doc = new SimpleDoc(b, flavor, null);
            PrintJobWatcher pjDone = new PrintJobWatcher(job);

            job.print(doc, null);
            pjDone.waitForDone();

        } catch (Exception pex) {
            System.out.println("Printer Error::" + pex.getMessage());
            JOptionPane.showMessageDialog(null, "Error imprimiendo, asegurese de que el printer seleccionado es el correcto.\n" + pex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    
    
    public void GenerarStringReciboImprimirTermica(String json, String tipo_printer, String accion) throws IOException {

        PrinterESC p;
        int line;

        if (tipo_printer.equals("1")) {
            p = new PrinterStar();
            line = 47;
        } else {
            p = new PrinterEpson();
            line = 43;
        }

        Map map = JsonToMap(json);
        List<Map<String, Object>> map1 = (List<Map<String, Object>>) map.get("f_data");

        String header_factura = "";
        String datosprincipales = "";
        String numero_factura = "";
        String datos_totales = "";

        //LLENAMOS EL HEADER
        String [] aplicado = new String[]{};
        for (Map<String, Object> tupla : map1) {

            numero_factura = tupla.get("f_numero").toString();
            header_factura += p.doubleHeight(true) + p.emphasized(true) + titulo(tupla.get("f_nombre_empresa").toString().toUpperCase(), line) + p.emphasized(false) + p.doubleHeight(false) + "\n";
            header_factura += tupla.get("f_header_factura_pequena").toString() + "\n";
            header_factura += p.emphasized(true) + p.doubleHeight(true) + titulo(accion, line) + p.doubleHeight(false) + p.emphasized(false) + "\n";

            datosprincipales += p.emphasized(true) + "Numero..: " + p.emphasized(false) + tupla.get("f_numero").toString() + "\n";
            datosprincipales += p.emphasized(true) + "Fecha...: " + p.emphasized(false) + tupla.get("f_fecha").toString() + "\n";
            
            if (!tupla.get("f_cliente").toString().equals("") && tupla.get("f_cliente").toString()!=null && !tupla.get("f_cliente").toString().equals("null")) {
                 datosprincipales += p.emphasized(true) + "Cliente.: " + p.emphasized(false) + tupla.get("f_cliente").toString() + "\n";
            }
            datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", 40) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_total").toString(), 2), 7) + p.doubleHeight(false) + "\n\n";
            datos_totales += addLine("_", line) + "\n";
            datos_totales += titulo(tupla.get("f_mensaje_orden").toString(), line) + "\n";
            datos_totales += A_La_Derecha(tupla.get("f_web").toString(), line) + "\n";
            aplicado = tupla.get("f_aplicado").toString().split(";");
            break;
        }

        p.setText(header_factura);
        p.setText("\n");
        p.setText(datosprincipales);
        p.setText("\n");

        p.setText(p.emphasized(true));
        p.setText(addLine("=", line) + "\n");
        p.setText(titulo("DISTRIBUCION", line)+"\n");
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
            String [] documuento = aplicado[i].split(",");
             p.setText(RellenarString(documuento[0], 30));
             p.setText(A_La_Derecha(Round(documuento[1], 2), 17)+"\n");
        }
        
        
        p.setText(addLine("-", line));
        p.setText("\n");
        p.setText(datos_totales);
        p.setText("\n");

        p.setText(p.getBarcodeEscPosCode(numero_factura));
        p.cortar();
        Imprimir(p.finalCommandSet().getBytes());

    }
    public void GenerarStringCuentaPorCobrarImprimirTermica(String json, String tipo_printer, String accion,Boolean firma) throws IOException {

        PrinterESC p;
        int line;

        if (tipo_printer.equals("1")) {
            p = new PrinterStar();
            line = 47;
        } else {
            p = new PrinterEpson();
            line = 43;
        }

        Map map = JsonToMap(json);
        List<Map<String, Object>> map1 = (List<Map<String, Object>>) map.get("f_data");

        String header_factura = "";
        String datosprincipales = "";
        String numero_factura = "";
        String datos_totales = "";

        //LLENAMOS EL HEADER
        String [] aplicado = new String[]{};
        for (Map<String, Object> tupla : map1) {

            numero_factura = tupla.get("f_numero").toString();
            header_factura += p.doubleHeight(true) + p.emphasized(true) + titulo(tupla.get("f_nombre_empresa").toString().toUpperCase(), line) + p.emphasized(false) + p.doubleHeight(false) + "\n";
            header_factura += tupla.get("f_header_factura_pequena").toString() + "\n";
            header_factura += p.emphasized(true) + p.doubleHeight(true) + titulo(accion, line) + p.doubleHeight(false) + p.emphasized(false) + "\n";

            //datosprincipales += p.emphasized(true) + "Numero..: " + p.emphasized(false) + tupla.get("f_numero").toString() + "\n";
            //datosprincipales += p.emphasized(true) + "Fecha...: " + p.emphasized(false) + tupla.get("f_fecha").toString() + "\n";
            
            if (!tupla.get("f_cliente").toString().equals("") && tupla.get("f_cliente").toString()!=null && !tupla.get("f_cliente").toString().equals("null")) {
                 datosprincipales += p.emphasized(true) + "Cliente.: " + p.emphasized(false) + tupla.get("f_cliente").toString() + "\n";
            }
            datos_totales += p.doubleHeight(true) + p.emphasized(true) + A_La_Derecha("Total :", 40) + p.emphasized(false) + A_La_Derecha(Round(tupla.get("f_total").toString(), 2), 7) + p.doubleHeight(false) + "\n\n";
            datos_totales += addLine("_", line) + "\n";
            if (firma) {
                datos_totales += titulo("Firma Cliente", line) + "\n\n\n";
            }
            datos_totales += titulo(tupla.get("f_mensaje_orden").toString(), line) + "\n";
            datos_totales += A_La_Derecha(tupla.get("f_web").toString(), line) + "\n";
            break;
        }

        p.setText(header_factura);
        p.setText("\n");
        p.setText(datosprincipales);
        p.setText("\n");

        p.setText(p.emphasized(true));
        p.setText(addLine("=", line) + "\n");
        p.setText(titulo("DATOS", line)+"\n");
        p.setText(addLine("=", line) + "\n");
        p.setText(p.emphasized(false));
        p.setText("\n");

        p.setText(p.emphasized(true));
        p.setText(RellenarString("Documento.........:", 20) + RellenarString(map1.get(0).get("f_numero").toString(),27)+"\n");
        p.setText(RellenarString("Fecha.............:", 20) + RellenarString(map1.get(0).get("f_fecha").toString(),27)+"\n");
        p.setText(RellenarString("Fecha Vencimiento.:", 20) + RellenarString(map1.get(0).get("f_fecha_vencimiento").toString(),27)+"\n");
        p.setText(RellenarString("Numero Externo....:", 20) + RellenarString(map1.get(0).get("f_noexterno").toString(),27)+"\n");
        p.setText("\n");
       // p.setText(RellenarString("Monto..............:", 20) + RellenarString(Round(map1.get(0).get("f_total"),2),27)+"\n");
        p.setText(p.emphasized(false));
        p.setText("\n");
        //detalle
        
        
        
        p.setText(addLine("-", line));
        p.setText("\n");
        p.setText(datos_totales);
        p.setText("\n");

        p.setText(p.getBarcodeEscPosCode(numero_factura));
        p.cortar();
        Imprimir(p.finalCommandSet().getBytes());

    }
    
    
    public void GenerarStringCuadreImprimirMatricial(String json, String tipo_printer, String accion) throws IOException {

        PrinterESC p;
        int columna;

//        if (tipo_printer.equals("1")) {
//            p = new PrinterStar();
//            columna = 47;
//        } else {
//            p = new PrinterEpson();
//            columna = 43;
//        }
        if (tipo_printer.equals("1")) {
            p = new PrinterStar();
            columna = 40;
        } else {
            p = new PrinterEpson();
            columna = 40;
        }

        Map map = JsonToMap(json);
        List<Map<String, Object>> map1 = (List<Map<String, Object>>) map.get("f_data");

        String header_factura = "";
        String datosprincipales = "";
        //LLENAMOS EL HEADER
        for (Map<String, Object> tupla : map1) {

            header_factura += p.doubleHeight(true) + p.emphasized(true) + titulo(tupla.get("f_nombre_empresa").toString().toUpperCase(), columna) + p.emphasized(false) + p.doubleHeight(false) + "\n";
            header_factura += tupla.get("f_header_factura_pequena").toString() + "\n";
            header_factura += p.emphasized(true) + p.doubleHeight(true) + titulo(accion, columna) + p.doubleHeight(false) + p.emphasized(false) + "\n";
//            
//            
            datosprincipales += p.emphasized(true) + "Fecha : " + p.emphasized(false)+tupla.get("f_fecha_generado")+"\n";
//            datosprincipales += p.emphasized(true) + "Fecha : " + p.emphasized(false) + tupla.get("f_fecha_generado")==null?tupla.get("f_fecha_generado"):"" + "\n";
            datosprincipales += p.emphasized(true) + "Facturas Contado : " + p.emphasized(false) + tupla.get("f_factcontado")+ "\n";
            datosprincipales += p.emphasized(true) + "Facturas Credito : " + p.emphasized(false) + tupla.get("f_factcredito") + "\n";
            datosprincipales += p.emphasized(true) + "Pedidos : " + p.emphasized(false) + tupla.get("f_pedidos") + "\n";
            datosprincipales += p.emphasized(true) + "Monto Contado : " + p.emphasized(false) + tupla.get("f_montocontado")+ "\n";
            datosprincipales += p.emphasized(true) + "Monto Credito : " + p.emphasized(false) + tupla.get("f_montocredito") + "\n";
            datosprincipales += p.emphasized(true) + "Monto Pedidos : " + p.emphasized(false) + tupla.get("f_monto_pedidos") + "\n";
            datosprincipales += p.emphasized(true) + "Monto Tarjetas : " + p.emphasized(false) + tupla.get("f_montotarjeta")+ "\n";
            datosprincipales += p.emphasized(true) + "Monto Itbis : " + p.emphasized(false) + tupla.get("f_montoitbis") + "\n";
            datosprincipales += p.emphasized(true) + "Monto Cheques : " + p.emphasized(false) + tupla.get("f_montocheque")+ "\n";
            datosprincipales += p.emphasized(true) + "Monto Envios : " + p.emphasized(false) + tupla.get("f_montoenvio") + "\n";
            datosprincipales += p.emphasized(true) + "Monto Caja : " + p.emphasized(false) + tupla.get("f_monto_caja")+ "\n";
            datosprincipales += p.emphasized(true) + "Monto Recibos : " + p.emphasized(false) + tupla.get("f_monto_recibo") + "\n";
            datosprincipales += p.emphasized(true) + "Monto Cancelado : " + p.emphasized(false) + tupla.get("f_monto_cancelado") + "\n";

            break;

        }
        
        
        System.err.println(datosprincipales);

        p.setText(header_factura);
        p.setText("\n");
        p.setText(datosprincipales);
        p.setText("\n");
        p.setText("\n");
        p.setText("\n");
        p.setText("\n");
        p.setText("\n");

        //p.setText(p.getBarcodeEscPosCode(numero_factura));
       // p.cortar();
        Imprimir(p.finalCommandSet().getBytes());

    }
}
