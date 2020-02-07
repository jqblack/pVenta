/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.menube_app.formularios;

import FuncionesGenerales.Dao;
import FuncionesGenerales.Funciones;
import FuncionesGenerales.WebServices;
import FuncionesGenerales.datos_preferencias;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.SelectionMode;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.commons.codec.binary.Base64;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author Usuario
 */
public class FrmPuntoVenta extends javax.swing.JFrame {

    /**
     * @return the _razon_social
     */
    public String getRazon_social() {
        return _razon_social;
    }

    /**
     * @param _razon_social the _razon_social to set
     */
    public void setRazon_social(String _razon_social) {
        this._razon_social = _razon_social;
    }

    /**
     * @return the _rnc
     */
    public String getRnc() {
        return _rnc;
    }

    /**
     * @param _rnc the _rnc to set
     */
    public void setRnc(String _rnc) {
        this._rnc = _rnc;
    }
    
    
     private String _razon_social= "";
    private  String _rnc= "";

    Boolean getAgregar_cuenta_booleano() {
        return agregar_cuenta_booleano;
    }

    void setAgregar_cuenta_booleano(Boolean agregar_cuenta_booleano) {
        this.agregar_cuenta_booleano = agregar_cuenta_booleano;
    }

    private Boolean agregar_cuenta_booleano = false;

    String getNombre_cuenta() {
        return nombre_cuenta;
    }

    void setNombre_cuenta(String nombre_cuenta) {
        this.nombre_cuenta = nombre_cuenta;
    }

    private String nombre_cuenta = "";

    Double getTotal_extra() {
        return total_extra;
    }

    void setTotal_extra(Double total_extra) {
        this.total_extra = total_extra;
    }
    private Double total_extra;

    Double getTotal_tax_extra() {
        return total_tax_extra;
    }

    void setTotal_tax_extra(Double total_tax_extra) {
        this.total_tax_extra = total_tax_extra;
    }
    private Double total_tax_extra;

    private List<Map<String, Object>> ArrayListComponentes = new ArrayList();

    List<Map<String, Object>> getArrayListComponentes() {
        return ArrayListComponentes;
    }

    /**
     * Creates new form FrmPuntoVenta
     */
    Funciones funciones = new Funciones();
    WebServices webServices = new WebServices();
    String idusuario = "0";
    String id_area = "0";
    String id_camarero = "0";
    String id_mesa = "0";
    String idfactura = "0";

    public String getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(String idfactura) {
        this.idfactura = idfactura;
    }

    private Boolean libre = false;

    Boolean getLibre() {
        return libre;
    }

    void setLibre(Boolean libre) {
        this.libre = libre;
    }

    public FrmPuntoVenta() {
        initComponents();
        addBotonesCategorias();
        tabla_datos.removeColumn(tabla_datos.getColumnModel().getColumn(0));

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        tabla_datos.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        tabla_datos.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);

        DefaultTableModel model = (DefaultTableModel) tabla_datos.getModel();

        // model.addRow(new Object[]{"1", "Column 2", 50.00, 10.00});
    }

    public FrmPuntoVenta(String nombre_ususario, String idusuario) {
        initComponents();
        addBotonesCategorias();

        btnSeleccionar_producto_arriba.setIcon(new ImageIcon(getClass().getResource("/flecha_arriba.png")));
        btnSeleccionar_producto_abajo.setIcon(new ImageIcon(getClass().getResource("/flecha_abajo.png")));
        
//        if (datos_preferencias.solo_mesa) {
//            id_area = datos_preferencias.area +"";
//            id_mesa = datos_preferencias.mesa +"";
//        }
//        System.err.println(id_area);
//        System.err.println(id_mesa);
                

        reorganizar_tabla();

        this.idusuario = idusuario;
        label_usuario.setText(nombre_ususario);

        Date fecha = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        label_fecha.setText(dateFormat.format(fecha));

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                DateFormat formatter = DateFormat.getTimeInstance();
                Date fecha1 = new Date();
                label_hora.setText(formatter.format(fecha1));

            }
        };
        timer.schedule(timerTask, 0, 1000);

        if (id_area.equals("0") || id_area.equals("") || id_area.equals(null)) {
            btnBuscar_mesas.doClick();
        }
        calcular_porciento_ley.setSelected(true);

        if (datos_preferencias.tipo_usuario_punto_venta == 2) {
            btnActivar_camarero.setEnabled(false);
            btnHacer_cuadre.setEnabled(false);
            btnCerrar_factura.setEnabled(false);
            btnComandas.setEnabled(false);
            btnImprimir_cuadre.setEnabled(false);
            btncalcular_porciento_ley.setEnabled(false);
            btnLibre_impuesto.setEnabled(false);
            btnAnular_linea.setEnabled(false);
            btnAnular_factura.setEnabled(false);
            btnFactura_oficial.setEnabled(false);
            btnDescuento_factura.setEnabled(false);
            btnCambiar_precio.setEnabled(false);
        }

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_usuario = new javax.swing.JLabel();
        label_area = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        label_hora = new javax.swing.JLabel();
        label_fecha = new javax.swing.JLabel();
        panel_menu_principal = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panel_botones_productos = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnActivar_camarero = new javax.swing.JButton();
        btnHacer_cuadre = new javax.swing.JButton();
        btnCerrar_factura = new javax.swing.JButton();
        btnNueva_factura = new javax.swing.JButton();
        btnComandas = new javax.swing.JButton();
        BtnFacturas_abiertas = new javax.swing.JButton();
        btnUnir_mesas = new javax.swing.JButton();
        btnImprimir_factura = new javax.swing.JButton();
        btnBuscar_productos = new javax.swing.JButton();
        btncalcular_porciento_ley = new javax.swing.JButton();
        btnSalvar_factura = new javax.swing.JButton();
        btnLibre_impuesto = new javax.swing.JButton();
        btncambiar_cantidad = new javax.swing.JButton();
        btnUnir_mesa = new javax.swing.JButton();
        btnImprimir_cuadre = new javax.swing.JButton();
        btnAnular_linea = new javax.swing.JButton();
        btnAnular_factura = new javax.swing.JButton();
        btnFactura_oficial = new javax.swing.JButton();
        btnDescuento_factura = new javax.swing.JButton();
        btnCambiar_precio = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        txtdescuento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtley = new javax.swing.JTextField();
        txtitbis = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        calcular_porciento_ley = new javax.swing.JCheckBox();
        factura_oficial = new javax.swing.JCheckBox();
        btnAgrgarCuenta = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtcamarero = new javax.swing.JTextField();
        txtmesa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBuscar_mesas = new javax.swing.JButton();
        btnBuscar_camareros = new javax.swing.JButton();
        btnSeleccionar_producto_arriba = new javax.swing.JButton();
        btnSeleccionar_producto_abajo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        recargar_categorias = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("PUNTO VENTA");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(64, 149, 191));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Usuario :");

        label_usuario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        label_usuario.setForeground(new java.awt.Color(255, 255, 255));
        label_usuario.setText("PABEL DIONICIO LOPEZ MENA");

        label_area.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        label_area.setText("RESTAURANTE");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Fecha :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Hora :");

        label_hora.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        label_hora.setForeground(new java.awt.Color(255, 255, 255));
        label_hora.setText("11:23:01 a.m.");

        label_fecha.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        label_fecha.setForeground(new java.awt.Color(255, 255, 255));
        label_fecha.setText("12/03/2018");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_usuario)
                .addGap(93, 93, 93)
                .addComponent(label_area)
                .addGap(211, 211, 211)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_fecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(label_hora)
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(label_usuario)
                    .addComponent(label_area)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(label_hora)
                    .addComponent(label_fecha))
                .addContainerGap())
        );

        panel_menu_principal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel_menu_principal.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                panel_menu_principalComponentResized(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jScrollPane2ComponentResized(evt);
            }
        });

        panel_botones_productos.setBackground(new java.awt.Color(255, 255, 255));
        panel_botones_productos.setAutoscrolls(true);
        panel_botones_productos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                panel_botones_productosComponentResized(evt);
            }
        });
        panel_botones_productos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane2.setViewportView(panel_botones_productos);

        javax.swing.GroupLayout panel_menu_principalLayout = new javax.swing.GroupLayout(panel_menu_principal);
        panel_menu_principal.setLayout(panel_menu_principalLayout);
        panel_menu_principalLayout.setHorizontalGroup(
            panel_menu_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panel_menu_principalLayout.setVerticalGroup(
            panel_menu_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.GridLayout(3, 7, 3, 3));

        btnActivar_camarero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnActivar_camarero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/camarero.png"))); // NOI18N
        btnActivar_camarero.setText("Activar Camarero");
        btnActivar_camarero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivar_camareroActionPerformed(evt);
            }
        });
        jPanel5.add(btnActivar_camarero);

        btnHacer_cuadre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHacer_cuadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cajero.png"))); // NOI18N
        btnHacer_cuadre.setText("Hacer Cuadre");
        btnHacer_cuadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHacer_cuadreActionPerformed(evt);
            }
        });
        jPanel5.add(btnHacer_cuadre);

        btnCerrar_factura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCerrar_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder.png"))); // NOI18N
        btnCerrar_factura.setText("Cerrar Factura");
        btnCerrar_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar_facturaActionPerformed(evt);
            }
        });
        jPanel5.add(btnCerrar_factura);

        btnNueva_factura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNueva_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo.png"))); // NOI18N
        btnNueva_factura.setText("Nueva Factura");
        btnNueva_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueva_facturaActionPerformed(evt);
            }
        });
        jPanel5.add(btnNueva_factura);

        btnComandas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnComandas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/report.png"))); // NOI18N
        btnComandas.setText("Comandas");
        btnComandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComandasActionPerformed(evt);
            }
        });
        jPanel5.add(btnComandas);

        BtnFacturas_abiertas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnFacturas_abiertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder_abierto.png"))); // NOI18N
        BtnFacturas_abiertas.setText("Facturas Abiertas");
        BtnFacturas_abiertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFacturas_abiertasActionPerformed(evt);
            }
        });
        jPanel5.add(BtnFacturas_abiertas);

        btnUnir_mesas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUnir_mesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/link.png"))); // NOI18N
        btnUnir_mesas.setText("Unir Mesas");
        btnUnir_mesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnir_mesasActionPerformed(evt);
            }
        });
        jPanel5.add(btnUnir_mesas);

        btnImprimir_factura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnImprimir_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/impresora.png"))); // NOI18N
        btnImprimir_factura.setText("Imprimir Factura");
        btnImprimir_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir_facturaActionPerformed(evt);
            }
        });
        jPanel5.add(btnImprimir_factura);

        btnBuscar_productos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscar_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupa.png"))); // NOI18N
        btnBuscar_productos.setText("Buscar Productos");
        btnBuscar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar_productosActionPerformed(evt);
            }
        });
        jPanel5.add(btnBuscar_productos);

        btncalcular_porciento_ley.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btncalcular_porciento_ley.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora.png"))); // NOI18N
        btncalcular_porciento_ley.setText("Calcular Ley");
        btncalcular_porciento_ley.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcular_porciento_leyActionPerformed(evt);
            }
        });
        jPanel5.add(btncalcular_porciento_ley);

        btnSalvar_factura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalvar_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salvar.png"))); // NOI18N
        btnSalvar_factura.setText("Salvar Factura");
        btnSalvar_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar_facturaActionPerformed(evt);
            }
        });
        jPanel5.add(btnSalvar_factura);

        btnLibre_impuesto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLibre_impuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tax.png"))); // NOI18N
        btnLibre_impuesto.setText("Libre Impuesto");
        btnLibre_impuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibre_impuestoActionPerformed(evt);
            }
        });
        jPanel5.add(btnLibre_impuesto);

        btncambiar_cantidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btncambiar_cantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recargar.png"))); // NOI18N
        btncambiar_cantidad.setText("Cambiar Cantidad");
        btncambiar_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncambiar_cantidadActionPerformed(evt);
            }
        });
        jPanel5.add(btncambiar_cantidad);

        btnUnir_mesa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUnir_mesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separar.png"))); // NOI18N
        btnUnir_mesa.setText("Separar Mesas");
        btnUnir_mesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnir_mesaActionPerformed(evt);
            }
        });
        jPanel5.add(btnUnir_mesa);

        btnImprimir_cuadre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnImprimir_cuadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/impresora.png"))); // NOI18N
        btnImprimir_cuadre.setText("Imprimir Cuadre");
        btnImprimir_cuadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir_cuadreActionPerformed(evt);
            }
        });
        jPanel5.add(btnImprimir_cuadre);

        btnAnular_linea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAnular_linea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eliminar.png"))); // NOI18N
        btnAnular_linea.setText("Anular Linea Factura");
        btnAnular_linea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnular_lineaActionPerformed(evt);
            }
        });
        jPanel5.add(btnAnular_linea);

        btnAnular_factura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAnular_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancelar.png"))); // NOI18N
        btnAnular_factura.setText("Anular Factura");
        btnAnular_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnular_facturaActionPerformed(evt);
            }
        });
        jPanel5.add(btnAnular_factura);

        btnFactura_oficial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnFactura_oficial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actura.png"))); // NOI18N
        btnFactura_oficial.setText("Factura Oficial");
        btnFactura_oficial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactura_oficialActionPerformed(evt);
            }
        });
        jPanel5.add(btnFactura_oficial);

        btnDescuento_factura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDescuento_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descuento.png"))); // NOI18N
        btnDescuento_factura.setText("Descuento Factura");
        btnDescuento_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescuento_facturaActionPerformed(evt);
            }
        });
        jPanel5.add(btnDescuento_factura);

        btnCambiar_precio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCambiar_precio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cash.png"))); // NOI18N
        btnCambiar_precio.setText("Cambio Precio");
        btnCambiar_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiar_precioActionPerformed(evt);
            }
        });
        jPanel5.add(btnCambiar_precio);

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel5.add(btnSalir);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tabla_datos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "CANT", "REF", "DESCRIPCION", "PRECIO", "IMPORTE", "TAX", "ID", "LIBRE_ITBIS", "TAX_PRODUCTO", "COMANDAS", "IDCOMANDA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tabla_datosMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_datos);
        if (tabla_datos.getColumnModel().getColumnCount() > 0) {
            tabla_datos.getColumnModel().getColumn(0).setResizable(false);
            tabla_datos.getColumnModel().getColumn(1).setPreferredWidth(40);
        }

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Sub-Total :");

        txtsubtotal.setEditable(false);
        txtsubtotal.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        txtsubtotal.setForeground(new java.awt.Color(0, 153, 51));
        txtsubtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtdescuento.setEditable(false);
        txtdescuento.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        txtdescuento.setForeground(new java.awt.Color(255, 0, 0));
        txtdescuento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Itbis :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Desc :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Ley :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Total :");

        txtley.setEditable(false);
        txtley.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        txtley.setForeground(new java.awt.Color(255, 0, 0));
        txtley.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtitbis.setEditable(false);
        txtitbis.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        txtitbis.setForeground(new java.awt.Color(255, 0, 0));
        txtitbis.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txttotal.setEditable(false);
        txttotal.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        txttotal.setForeground(new java.awt.Color(0, 153, 51));
        txttotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        calcular_porciento_ley.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calcular_porciento_ley.setText("Calcular Ley");
        calcular_porciento_ley.setEnabled(false);

        factura_oficial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        factura_oficial.setText("Factura Oficial");
        factura_oficial.setEnabled(false);

        btnAgrgarCuenta.setBackground(new java.awt.Color(0, 204, 204));
        btnAgrgarCuenta.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnAgrgarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnAgrgarCuenta.setText("Nombre Cuenta");
        btnAgrgarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrgarCuentaActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtcamarero.setEditable(false);
        txtcamarero.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        txtmesa.setEditable(false);
        txtmesa.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Mesa :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Camarero :");

        btnBuscar_mesas.setBackground(new java.awt.Color(64, 149, 191));
        btnBuscar_mesas.setText("...");
        btnBuscar_mesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar_mesasActionPerformed(evt);
            }
        });

        btnBuscar_camareros.setBackground(new java.awt.Color(64, 149, 191));
        btnBuscar_camareros.setText("...");
        btnBuscar_camareros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar_camarerosActionPerformed(evt);
            }
        });

        btnSeleccionar_producto_arriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionar_producto_arribaActionPerformed(evt);
            }
        });

        btnSeleccionar_producto_abajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionar_producto_abajoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtmesa, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(txtcamarero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar_mesas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar_camareros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeleccionar_producto_arriba, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeleccionar_producto_abajo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSeleccionar_producto_abajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeleccionar_producto_arriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtmesa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar_mesas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtcamarero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar_camareros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabel11))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel10))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(factura_oficial))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtitbis, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtley, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgrgarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcular_porciento_ley))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(factura_oficial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcular_porciento_ley))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtitbis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtley, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgrgarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(64, 149, 191));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menu Principal");

        recargar_categorias.setBackground(new java.awt.Color(0, 153, 51));
        recargar_categorias.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        recargar_categorias.setForeground(new java.awt.Color(255, 255, 255));
        recargar_categorias.setText("Recargar Categorias");
        recargar_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recargar_categoriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(recargar_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(recargar_categorias))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_menu_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_menu_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void reorganizar_tabla() {
        /**
         * ********************TABLA DATOS***************************
         */
        tabla_datos.removeColumn(tabla_datos.getColumnModel().getColumn(11));
        tabla_datos.removeColumn(tabla_datos.getColumnModel().getColumn(10));
        tabla_datos.removeColumn(tabla_datos.getColumnModel().getColumn(9));
        tabla_datos.removeColumn(tabla_datos.getColumnModel().getColumn(8));
        tabla_datos.removeColumn(tabla_datos.getColumnModel().getColumn(7));
        tabla_datos.removeColumn(tabla_datos.getColumnModel().getColumn(6));
        tabla_datos.removeColumn(tabla_datos.getColumnModel().getColumn(0));

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        // tabla_datos.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        tabla_datos.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tabla_datos.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);

        tabla_datos.getTableHeader().setFont(new Font("Tahoma", 1, 16));
        tabla_datos.setRowHeight(40);
    }
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        eventoSalir();
    }//GEN-LAST:event_btnSalirActionPerformed


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:


    }//GEN-LAST:event_formWindowOpened

    private void btnBuscar_mesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar_mesasActionPerformed
        // TODO add your handling code here:

        FrmOutAreas frm = new FrmOutAreas(this, true);
        frm.setVisible(true);
        frm.setTitle("Areas");
        frm.getContentPane().setBackground(new Color(255, 255, 255));
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

                if (!frm.getIdfactura().equals("") && !frm.getIdfactura().equals("0")) {

                    btnNueva_factura.doClick();
                    id_area = frm.getIdarea();
                    id_mesa = frm.getIdmesa();
                    label_area.setText(frm.getNombre_area());
                    txtmesa.setEditable(true);

                    txtmesa.setText(frm.getNombre_mesa());
                    txtmesa.setEditable(false);
                    setIdfactura(frm.getIdfactura());
                    cargar_factura();

                    calcular_totales();
                } else {
                    id_area = frm.getIdarea();
                    id_mesa = frm.getIdmesa();
                    label_area.setText(frm.getNombre_area());
                    txtmesa.setEditable(true);
                    txtmesa.setText(frm.getNombre_mesa());
                    txtmesa.setEditable(false);
                }
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });


    }//GEN-LAST:event_btnBuscar_mesasActionPerformed

    private void btnBuscar_camarerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar_camarerosActionPerformed
        // TODO add your handling code here:
        FrmOutCamareros frm = new FrmOutCamareros(this, true);
        frm.setVisible(true);
        frm.getContentPane().setBackground(Color.WHITE);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {

                txtcamarero.setText(frm.getNombre_camarero());
                id_camarero = frm.getIdcamarero();
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }//GEN-LAST:event_btnBuscar_camarerosActionPerformed

    private void recargar_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recargar_categoriasActionPerformed
        // TODO add your handling code here:
        addBotonesCategorias();
    }//GEN-LAST:event_recargar_categoriasActionPerformed

    private void btncambiar_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncambiar_cantidadActionPerformed
        // TODO add your handling code here:

        if (tabla_datos.getSelectedRow() == -1) {
            funciones.mensaje("Seleccione el producto a cambiar la cantidad", "", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        FrmOutValor frm = new FrmOutValor(this, true);
        frm.setVisible(true);
        frm.getContentPane().setBackground(Color.white);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
                if (frm.getValor().equals("") || frm.getValor().equals("0")) {
                    return;
                }
                eventoCambiarCantidad(funciones.parseDouble(frm.getValor()));
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });


    }//GEN-LAST:event_btncambiar_cantidadActionPerformed

    private void btncalcular_porciento_leyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcular_porciento_leyActionPerformed

        eventoCalcularLey();
    }//GEN-LAST:event_btncalcular_porciento_leyActionPerformed

    private void btnFactura_oficialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactura_oficialActionPerformed
        // TODO add your handling code here:
        eventoFacturaOficial();
    }//GEN-LAST:event_btnFactura_oficialActionPerformed

    private void btnLibre_impuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibre_impuestoActionPerformed
        // TODO add your handling code here:
        eventoLibreImpuesto();
    }//GEN-LAST:event_btnLibre_impuestoActionPerformed

    private void btnAnular_lineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnular_lineaActionPerformed
        // TODO add your handling code here:

        if (tabla_datos.getSelectedRow() == -1) {
            funciones.mensaje("Seleccione le producto a eliminar", "", JOptionPane.WARNING_MESSAGE);
            return;

        }
        eventoBorrarLinea();
    }//GEN-LAST:event_btnAnular_lineaActionPerformed

    private void btnAnular_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnular_facturaActionPerformed
        // TODO add your handling code here:
        if (!getIdfactura().equals("") && !getIdfactura().equals("0")) {
            eventoAnularFactura();
        } else {
            funciones.mensaje("Debe Seleccionar una orden ya generada para porder anular. Si decea limpiar todo usa la opcion de (Nueva Factura)", "", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnAnular_facturaActionPerformed

    private void btnBuscar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar_productosActionPerformed
        // TODO add your handling code here:
        FrmOutBuscarProductos frm = new FrmOutBuscarProductos(this, true);
        frm.setVisible(true);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
                String idproducto = frm.getIdproducto();
                if (!idproducto.equals("") || !idproducto.equals("0")) {
                    agregarProductosGrid(idproducto);
                }
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });
    }//GEN-LAST:event_btnBuscar_productosActionPerformed

    private void tabla_datosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_datosMouseExited
        // TODO add your handling code here:


    }//GEN-LAST:event_tabla_datosMouseExited

    private void btnDescuento_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescuento_facturaActionPerformed
        // TODO add your handling code here:
        eventoDescuentoFactura();


    }//GEN-LAST:event_btnDescuento_facturaActionPerformed

    private void btnSeleccionar_producto_arribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionar_producto_arribaActionPerformed
        // TODO add your handling code here:
        eventoArribaAbajoTabla("1");


    }//GEN-LAST:event_btnSeleccionar_producto_arribaActionPerformed

    private void btnSeleccionar_producto_abajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionar_producto_abajoActionPerformed
        // TODO add your handling code here:
        eventoArribaAbajoTabla("2");
    }//GEN-LAST:event_btnSeleccionar_producto_abajoActionPerformed

    private void btnCambiar_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiar_precioActionPerformed
        // TODO add your handling code here:
        if (tabla_datos.getSelectedRow() == -1) {
            funciones.mensaje("Seleccione un producto para cambiaer el precio", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        eventoCambiarPrecio();


    }//GEN-LAST:event_btnCambiar_precioActionPerformed

    private void btnSalvar_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar_facturaActionPerformed
        // TODO add your handling code here:
        eventoSalvar();
        // btnNueva_factura.doClick();
    }//GEN-LAST:event_btnSalvar_facturaActionPerformed

    private void btnNueva_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueva_facturaActionPerformed
        // TODO add your handling code here:
        eventoNuevo();
    }//GEN-LAST:event_btnNueva_facturaActionPerformed

    private void btnUnir_mesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnir_mesaActionPerformed
        // TODO add your handling code here:

        if (getIdfactura().equals("") || getIdfactura().equals("0")) {
            funciones.mensaje("Seleccione una factura guardada", "", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        FrmInSepararMesas frm = new FrmInSepararMesas(this, true, tabla_datos.getModel(), ArrayListComponentes);
        frm.setVisible(true);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
                if (frm.getSi_no()) {
                    eventoSepararMesas(
                            frm.getContenedor1(),
                            frm.getContenedor2(),
                            frm.getTotal_extra(),
                            frm.getTotal_tax_extra(),
                            frm.getArrayListComponentes()
                    );
                }

            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

    }//GEN-LAST:event_btnUnir_mesaActionPerformed

    private void btnAgrgarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrgarCuentaActionPerformed
        // TODO add your handling code here:
        FrmOutGetNombreCuenta frm = new FrmOutGetNombreCuenta(this, true);
        frm.setVisible(true);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
                if (!frm.getValor().equals("") && !frm.getValor().equals("0")) {
//                    System.err.println("Hola mundo");
                    setNombre_cuenta(frm.getValor());
                    setAgregar_cuenta_booleano(true);
                }
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });
    }//GEN-LAST:event_btnAgrgarCuentaActionPerformed

    private void BtnFacturas_abiertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFacturas_abiertasActionPerformed
        // TODO add your handling code here:
        FrmOutFacturasAbiertas frm = new FrmOutFacturasAbiertas(this, true);
        frm.setVisible(true);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {

                if (frm.getIdfactura().equals("") || frm.getIdfactura().equals("0")) {
                    return;
                }

                btnNueva_factura.doClick();
                id_area = frm.getIdarea();
                id_mesa = frm.getIdmesa();
                label_area.setText(frm.getArea());
                txtmesa.setEditable(true);
                txtmesa.setText(frm.getMesa());
                txtmesa.setEditable(false);

                setIdfactura(frm.getIdfactura());
                cargar_factura();
                calcular_totales();

            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });
    }//GEN-LAST:event_BtnFacturas_abiertasActionPerformed

    private void btnCerrar_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar_facturaActionPerformed
        // TODO add your handling code here:

        if (tabla_datos.getRowCount() <= 0) {
            funciones.mensaje("No se a agregado ningun producto", "", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //btnSalvar_factura.doClick();
        FrmInCerrarFactura frm = new FrmInCerrarFactura(this, true, txttotal.getText());
        frm.setVisible(true);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {

                if (frm.getSi_no()) {

                    eventoCerrarFactura(
                            frm.getTipo_pago(),
                            frm.getIdcliente(),
                            frm.getDevuelta(),
                            frm.getTipo_ncf(),
                            frm.getTipo_tarjeta(),
                            frm.getPropina_dada(),
                            frm.getNumero_autorizacion(),
                            frm.getMonto_por_tarjeta(),
                            frm.getMonto_efetivo(),
                            frm.getRazon_social(),
                            frm.getRnc()
                    );
                }

            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

    }//GEN-LAST:event_btnCerrar_facturaActionPerformed

    private void btnImprimir_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir_facturaActionPerformed
        // TODO add your handling code here:

        FrmOutReimprimirFacturas frm = new FrmOutReimprimirFacturas(this, true);
        frm.setVisible(true);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
        // eventoImprimir("251", 2);
    }//GEN-LAST:event_btnImprimir_facturaActionPerformed

    private void btnActivar_camareroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivar_camareroActionPerformed
        // TODO add your handling code here:
        FrmOutActivarCamarero frm = new FrmOutActivarCamarero(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_btnActivar_camareroActionPerformed

    private void btnUnir_mesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnir_mesasActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (!getIdfactura().equals("") && !getIdfactura().equals("0")) {
            eventoUnirMesas();
        } else {
            funciones.mensaje("Debe Seleccionar una orden ya generada para porder Unir", "", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnUnir_mesasActionPerformed

    private void btnHacer_cuadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHacer_cuadreActionPerformed
        // TODO add your handling code here:
//        FrmInCuadre frm = new FrmInCuadre(this, true, idusuario, label_usuario.getText());
//        frm.setVisible(true);


             eventoImprimirCuadre();
    }//GEN-LAST:event_btnHacer_cuadreActionPerformed

    private void jScrollPane2ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jScrollPane2ComponentResized
        // TODO add your handling code here:

        //        panel_botones_productos.getBounds().setBounds(
        //                (int)panel_botones_productos.getBounds().getX(),
        //                (int)panel_botones_productos.getBounds().getY(),
        //                (int)jScrollPane2.getBounds().getWidth(),
        //                (int)jScrollPane2.getBounds().getHeight());
        panel_botones_productos.setBounds(jScrollPane2.getBounds());
        addReorganizarBotones();
    }//GEN-LAST:event_jScrollPane2ComponentResized

    private void panel_botones_productosComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panel_botones_productosComponentResized
        // TODO add your handling code here:

        //System.err.println(evt.getComponent().getBounds());
    }//GEN-LAST:event_panel_botones_productosComponentResized

    private void panel_menu_principalComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panel_menu_principalComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_menu_principalComponentResized

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:

    }//GEN-LAST:event_formComponentResized

    private void btnImprimir_cuadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir_cuadreActionPerformed
        // TODO add your handling code here:
        
        eventoImprimirCuadre();
    }//GEN-LAST:event_btnImprimir_cuadreActionPerformed

    private void btnComandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComandasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComandasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPuntoVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPuntoVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPuntoVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPuntoVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPuntoVenta().setVisible(true);
            }
        });
    }

    public void addBotonesCategorias() {

        int contador = 1;
        int acumulador_heiht = 0;
        int top = 0;
        int i = 0;
        //int width = 210;
        int columnas = 3;
        int width = panel_botones_productos.getWidth() / columnas;
        int heiht = 110;
        eliminar_botones();
        Map map;
        List<Map<String, Object>> map1;
        String respuesta = "";
        try {
            respuesta = webServices.buscar("", "ws/get_categorias_productos");
            if (!respuesta.equals("")) {

                map = funciones.JsonToMap(respuesta);
                map1 = funciones.JsonToListMap(map.get("f_data"));

                for (Map tupla : map1) {

                    JButton button1 = new JButton();
                    button1.setText(tupla.get("f_descripcion").toString());
                    //button1.setBackground(new Color(255, 255, 0));
                    button1.setBackground(funciones.getRandomColor());
                    button1.setFont(new Font("Tahoma", 1, 14));
                    button1.setName(tupla.get("f_idrecord").toString());
                    button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            addBotonesProductosPorCategorias(button1.getName());
                        }
                    });

                    if (contador == 1 && i == 0) {
                        panel_botones_productos.add(button1, new AbsoluteConstraints(0, 0, width, heiht));
                        acumulador_heiht += width;
                    } else {
                        panel_botones_productos.add(button1, new AbsoluteConstraints(acumulador_heiht, top, width, heiht));
                        acumulador_heiht += width;
                    }

                    if (contador == columnas) {
                        contador = 1;
                        acumulador_heiht = 0;
                        top += heiht;
                    } else {
                        contador++;
                    }
                    i++;

                    panel_botones_productos.repaint();
                    panel_botones_productos.revalidate();

                    // panel_botones_productos.add(button1); 
                }

            }

        } catch (Exception ex) {
            System.err.println("Punto venta ==>  addBotonesCategorias =>" + ex.getMessage());
        }

    }


    public void addBotonesProductosPorCategorias(String idcategoria) {

        int contador = 1;
        int acumulador_heiht = 0;
        int top = 0;
        int i = 0;
        int columnas = 4;
        //int width = 210;
        int width = panel_botones_productos.getWidth() / columnas;
        int heiht = 110;

        eliminar_botones();
        Map map;
        List<Map<String, Object>> map1;
        String respuesta = "";
        try {
            respuesta = webServices.buscar("\"f_idcategoria\":\"" + idcategoria + "\"", "ws/get_productos_por_categorias");
            if (!respuesta.equals("")) {

                map = funciones.JsonToMap(respuesta);
                map1 = funciones.JsonToListMap(map.get("f_data"));

                for (Map tupla : map1) {
                    JButton button1 = new JButton();
                    button1.setText(tupla.get("f_descripcion").toString());
                    //button1.setBackground(new Color(255, 255, 0));
                    button1.setBackground(funciones.getRandomColor());
                    button1.setFont(new Font("Tahoma", 1, 14));
                    button1.setName(tupla.get("f_idrecord").toString());
                    button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            agregarProductosGrid(button1.getName());
                        }
                    });
                    if (contador == 1 && i == 0) {
                        panel_botones_productos.add(button1, new AbsoluteConstraints(0, 0, width, heiht));
                        acumulador_heiht += width;
                    } else {
                        panel_botones_productos.add(button1, new AbsoluteConstraints(acumulador_heiht, top, width, heiht));
                        acumulador_heiht += width;
                    }

                    if (contador == columnas) {
                        contador = 1;
                        acumulador_heiht = 0;
                        top += heiht;
                    } else {
                        contador++;
                    }
                    i++;

                    panel_botones_productos.repaint();
                    panel_botones_productos.revalidate();
                }

            }

        } catch (Exception ex) {
            System.err.println("Punto Venta => addBotonesProductosPorCategorias => " + ex.getMessage());
        }

    }

    public void addReorganizarBotones() {

        int contador = 1;
        int acumulador_heiht = 0;
        int top = 0;
        int i = 0;
        int columnas = 4;
        int separacion = 3;
        int width = panel_botones_productos.getWidth() / columnas;
        width = width - separacion;
        int heiht = 110;

        Component[] lista_componentes = panel_botones_productos.getComponents();
        eliminar_botones();
        try {
            for (Component componente : lista_componentes) {
                if (contador == 1 && i == 0) {
                    panel_botones_productos.add(componente, new AbsoluteConstraints(0, 0, width, heiht));
                    acumulador_heiht += width + separacion;
                } else {
                    panel_botones_productos.add(componente, new AbsoluteConstraints(acumulador_heiht, top, width, heiht));
                    acumulador_heiht += width + separacion;
                }

                if (contador == columnas) {
                    contador = 1;
                    acumulador_heiht = 0;
                    top += heiht;
                } else {
                    contador++;
                }
                i++;

                panel_botones_productos.repaint();
                panel_botones_productos.revalidate();
            }

        } catch (Exception ex) {
            System.err.println("Punto Venta => addBotonesProductosPorCategorias => " + ex.getMessage());
        }

    }

    public void eliminar_botones() {
        panel_botones_productos.removeAll();
        panel_botones_productos.repaint();
    }

    public void agregarProductosGrid(String idrecord) {

        if (id_area.equals("0") || id_area.equals("") || id_area.equals(null)) {
            funciones.mensaje("Debe Seleccionar una area y/o Mesa.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            btnBuscar_mesas.doClick();
            return;
        }
        
        
        Map map;
        List<Map<String, Object>> map1;
        String respuesta = "";
        try {
            respuesta = webServices.buscar("\"f_idproducto\":\"" + idrecord + "\",\"f_idarea\":\"" + id_area + "\"", "ws/get_productos_by_id");
            if (!respuesta.equals("")) {
                map = funciones.JsonToMap(respuesta);
                map1 = funciones.JsonToListMap(map.get("f_data"));
                if (map1.size() > 0) {

                    String idproduto = map1.get(0).get("f_idrecord").toString();
                    String descirpcion = map1.get(0).get("f_descripcion").toString();
                    String referencia = map1.get(0).get("f_referencia").toString();
                    Double precio_producto = Double.valueOf(map1.get(0).get("f_precio").toString());
                    Double tax_producto = Double.valueOf(map1.get(0).get("f_tax").toString());
                    Double tax_total = precio_producto * (tax_producto / 100);
                    Double importe = 0.00;
                    String comanda = (!Boolean.valueOf(map1.get(0).get("f_comanda").toString()))+"";
                    String idcomanda = "-1";
                    
                    if (datos_preferencias.impuesto_incluido) {
                        precio_producto = precio_producto / (1 + (tax_producto / 100));
                        tax_total = precio_producto * (tax_producto / 100);
                    } else {
                        tax_total = precio_producto * (tax_producto / 100);
                    }
                    
                    importe = precio_producto + tax_total;

                    DefaultTableModel model = (DefaultTableModel) tabla_datos.getModel();
                    model.addRow(new Object[]{
                        model.getRowCount() + 1,//numero de fila
                        1,//cantidad
                        referencia,//referencia del prodcuto
                        descirpcion,//descripcion del producto
                        funciones.Round(precio_producto, 2),//precio producto
                        funciones.Round(importe, 2),//importe del producto
                        funciones.Round(tax_total, 2),//tax que se le aplica al producto
                        idproduto,//id del producto
                        "false",//impuesto incluido
                        tax_producto.toString(),//inpuesto del producto
                        comanda,//si esta producto poso por la comandas, es decir que la cocina ya lo culmino
                        idcomanda//el ida de relacion de la comanda al para el detalle 
                    });
                    calcular_totales();

                    if (Integer.valueOf(map1.get(0).get("f_componentes").toString()) > 0) {
                        eventoGetComponentes(idproduto);
                    }

                }

            }
        } catch (Exception e) {
            System.err.println("Punto Venta => agregarProductosGrid ==> " + e.getMessage());
        }

    }

    public void eventoGetComponentes(String idproducto) {

        FrmInComponentesProductos frm = new FrmInComponentesProductos(this, true, idproducto, tabla_datos.getRowCount());
        frm.setVisible(true);
        frm.getContentPane().setBackground(Color.WHITE);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
                List<Map<String, Object>> componentes = frm.getArrayListComponentes();
                if (componentes.size() > 0) {
                    for (Map<String, Object> map : componentes) {
                        ArrayListComponentes.add(map);
                    }
                }
                calcular_totales();
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });
    }

    public void calcular_totales() {

        calcular_ArrayList();
        Double sub = Double.valueOf(0);
        Double tx = Double.valueOf(0);
        Double iv = Double.valueOf(0);
        Double ttal = Double.valueOf(0);
        Double ley = Double.valueOf(0);

        for (int i = 0; i < tabla_datos.getModel().getRowCount(); i++) {

            TableModel modelo = tabla_datos.getModel();
            Double precio_en_tabla = funciones.parseDouble(modelo.getValueAt(i, 4).toString());
            Double cantidad_en_tabla = funciones.parseDouble(modelo.getValueAt(i, 1).toString());
            Double tax_en_tabla = funciones.parseDouble(modelo.getValueAt(i, 6).toString());

            sub += precio_en_tabla * cantidad_en_tabla;
            if (!getLibre()) {
                // tx+= precio_en_tabla * (tax_en_tabla/100) *cantidad_en_tabla;
                tx += tax_en_tabla * cantidad_en_tabla;
            }
        }

        sub = sub + getTotal_extra();
        tx = tx + getTotal_tax_extra();
        txtsubtotal.setText(funciones.Round(sub, 2));
        txtitbis.setText(funciones.Round(tx, 2));
        agregarporcientoley();

        Double descuento = funciones.parseDouble(txtdescuento.getText());
        ley = funciones.parseDouble(txtley.getText());

        Double importe = (sub + tx + ley) - descuento;
        txttotal.setText(funciones.Round(importe, 2));

    }

    public void calcular_ArrayList() {

        setTotal_extra(0.0);
        setTotal_tax_extra(0.0);
        Double t = 0.0;
        Double tx = 0.0;
        for (Map<String, Object> tupla : getArrayListComponentes()) {

            //  System.err.println(tupla);
            if (Boolean.valueOf(tupla.get("fCobrable").toString()) == true) {
                Double monto = funciones.parseDouble(tupla.get("fCantidad").toString()) * funciones.parseDouble(tupla.get("fMontoCobrar").toString());
                Double txt = funciones.parseDouble(tupla.get("fCantidad").toString()) * funciones.parseDouble(tupla.get("fMontoCobrar").toString());

                t = t + monto;
                Map map;
                List<Map<String, Object>> map1;
                String respuesta = "";
                try {
                    respuesta = webServices.buscar("\"f_idproducto\":\"" + tupla.get("fIdprodcutoComponente").toString() + "\",\"f_idarea\":\"0\"", "ws/get_productos_by_id");
                    if (!respuesta.equals("")) {
                        map = funciones.JsonToMap(respuesta);
                        map1 = funciones.JsonToListMap(map.get("f_data"));

                        if (map1.size() > 0) {

                            //  String idproduto = map1.get(0).get("f_idrecord").toString();
                            Double tax_producto = Double.valueOf(map1.get(0).get("f_tax").toString());

                            tx = tx + (txt * (tax_producto / 100));

                        }

                    }
                } catch (Exception e) {
                    System.err.println("Punto venta ==> calcular arraylist ==>" + e.getMessage());
                }

            }
        }

        setTotal_tax_extra(tx);
        setTotal_extra(t);
    }

    public void agregarporcientoley() {

        if (calcular_porciento_ley.isSelected()) {
            Double sub_total = funciones.parseDouble(txtsubtotal.getText());
            Double porciento_ley = (datos_preferencias.porciento_ley / 100) * sub_total;
            txtley.setText(funciones.Round(porciento_ley, 2));
        } else {
            txtley.setText(funciones.Round(0.0, 2));
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFacturas_abiertas;
    private javax.swing.JButton btnActivar_camarero;
    private javax.swing.JButton btnAgrgarCuenta;
    private javax.swing.JButton btnAnular_factura;
    private javax.swing.JButton btnAnular_linea;
    private javax.swing.JButton btnBuscar_camareros;
    private javax.swing.JButton btnBuscar_mesas;
    private javax.swing.JButton btnBuscar_productos;
    private javax.swing.JButton btnCambiar_precio;
    private javax.swing.JButton btnCerrar_factura;
    private javax.swing.JButton btnComandas;
    private javax.swing.JButton btnDescuento_factura;
    private javax.swing.JButton btnFactura_oficial;
    private javax.swing.JButton btnHacer_cuadre;
    private javax.swing.JButton btnImprimir_cuadre;
    private javax.swing.JButton btnImprimir_factura;
    private javax.swing.JButton btnLibre_impuesto;
    private javax.swing.JButton btnNueva_factura;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalvar_factura;
    private javax.swing.JButton btnSeleccionar_producto_abajo;
    private javax.swing.JButton btnSeleccionar_producto_arriba;
    private javax.swing.JButton btnUnir_mesa;
    private javax.swing.JButton btnUnir_mesas;
    private javax.swing.JButton btncalcular_porciento_ley;
    private javax.swing.JButton btncambiar_cantidad;
    private javax.swing.JCheckBox calcular_porciento_ley;
    private javax.swing.JCheckBox factura_oficial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_area;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_hora;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JPanel panel_botones_productos;
    private javax.swing.JPanel panel_menu_principal;
    private javax.swing.JButton recargar_categorias;
    private javax.swing.JTable tabla_datos;
    private javax.swing.JTextField txtcamarero;
    private javax.swing.JTextField txtdescuento;
    private javax.swing.JTextField txtitbis;
    private javax.swing.JTextField txtley;
    private javax.swing.JTextField txtmesa;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

    public void eventoCambiarCantidad(Double cantidad) {
        TableModel tableModel = tabla_datos.getModel();

        int row = tabla_datos.getSelectedRow();

        Double precio_producto = Double.valueOf(tableModel.getValueAt(row, 4).toString());
        Double tax_producto = Double.valueOf(tableModel.getValueAt(row, 9).toString());

        Double tax_total = precio_producto * (tax_producto / 100);
        Double importe = (precio_producto + tax_total) * cantidad;

        tableModel.setValueAt(funciones.parseDouble(cantidad + ""), row, 1);
        tableModel.setValueAt(funciones.Round(importe, 2), row, 5);
        tableModel.setValueAt(funciones.Round(tax_total, 2), row, 6);

        /*     DefaultTableModel model = (DefaultTableModel) tabla_datos.getModel();
                    model.addRow(new Object[]{
                        model.getRowCount()+1,//numero de fila
                        1,//cantidad
                        referencia,//referencia del prodcuto
                        descirpcion,//descripcion del producto
                        funciones.Round(precio_producto,2),//precio producto
                        funciones.Round(importe,2),//importe del producto
                        funciones.Round(tax_producto,2),//tax que se le aplica al producto
                        idproducto,//id del producto
                        "false",
                        "18"
                    });*/
        calcular_totales();
    }

    public void eventoSalir() {

        if (funciones.mensajeConfirmacion("Desea Salir del sistema", "", JOptionPane.YES_NO_OPTION) == 1) {
            return;
        }

        String respuesta = "";
        try {
            respuesta = webServices.buscar("", "ws/logout");
            if (!respuesta.equals("")) {

            }
        } catch (Exception e) {

        }

        dispose();
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
        login.setTitle("Login de Usuario");
        login.getContentPane().setBackground(new Color(64, 149, 191));
    }

    public void eventoCalcularLey() {
        // TODO add your handling code here:

        FrmOutValidarusuario frm = new FrmOutValidarusuario(this, true, "10");
        frm.setVisible(true);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
                String valor = frm.getValor();
                if (valor.equals("-1")) {
                    return;
                } else if (valor.equals("1")) {
                    calcular_porciento_ley.setSelected(!calcular_porciento_ley.isSelected());
                } else {
                    funciones.mensaje("No tienes permiso para realizar esta acción", "", JOptionPane.WARNING_MESSAGE);
                    calcular_porciento_ley.setSelected(false);
                }
                calcular_totales();
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        }
        );
    }
    
    
     public void eventoImprimirCuadre() {
        // TODO add your handling code here:
        FrmOutValidarusuario frm = new FrmOutValidarusuario(this, true, "5");
        frm.setVisible(true);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
                
                
//                String json = "{\"f_key\":\"1\",\"f_data\":[{\"f_nombre_empresa\":\"Fernandez Mini Market\",\"f_web\":\"MeNube.net\",\"f_header_factura_pequena\":\"Independecia Esq. Sabana Larga, Edf. Peralta #35,Santiago.\\r\\n809-471-3172\",\"f_mensaje_factura\":\"mensaje factura\",\"f_usuario_cajero\":\"Pabel Dionicio\",\"f_idrecord\":49,\"f_idempresa\":1000,\"f_fecha\":\"2018-11-15T04:00:00+0000\",\"f_fecha_generado\":\"2019-11-13T19:54:28+0000\",\"f_cajero\":1,\"f_factcontado\":1,\"f_factcredito\":0,\"f_pedidos\":0,\"f_montocredito\":0.00,\"f_montocontado\":134.79,\"f_monto_pedidos\":0.00,\"f_montotarjeta\":0.00,\"f_montoitbis\":18.96,\"f_montocheque\":0.00,\"f_montoenvio\":0.00,\"f_monto_caja\":134.79,\"f_monto_recibo\":0.00,\"f_monto_cancelado\":0.00,\"f_posteado\":false,\"f_hecho_por\":1}]}";
//               
//                  
//                try {  
//                    String tipo_impresion = "CUADRE";
//                  Dao dao;
//                    dao = new Dao();
//                    funciones.GenerarStringCuadreImprimirMatricial(json, dao.getTipo_printer(), tipo_impresion);; 
//                } catch (ClassNotFoundException ex) {
//                    Logger.getLogger(FrmPuntoVenta.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (SQLException ex) {
//                    Logger.getLogger(FrmPuntoVenta.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (IOException ex) {
//                    Logger.getLogger(FrmPuntoVenta.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                             
//               
//                
//                return;
                String valor = frm.getValor();
                 
                if (valor.equals("-1")) {
                    return;
                } else if (valor.equals("1")) {
                    //set_crear_cuadre_cajero
                     Map map;
                    String respuesta = "";
                    try {
                        String tipo_impresion = "CUADRE";
                        respuesta = webServices.buscar("\"f_idusuario\":\"" + idusuario + "\"", "ws/set_crear_cuadre_cajero");
                        if (!respuesta.equals("")) {
                            map = funciones.JsonToMap(respuesta);
                            Dao dao= new Dao();
                            funciones.GenerarStringCuadreImprimirMatricial(respuesta, dao.getTipo_printer(), tipo_impresion);;
                            /*if (map.get("f_data").toString().equals("true")) {
                                funciones.mensaje("Cuadre Generado Correctamente", "", JOptionPane.INFORMATION_MESSAGE);
                              
                            }*/
                        }

                    } catch (Exception ex) {
                        System.err.println(ex.getMessage());
                    }
                } else {
                    funciones.mensaje("No tienes permiso para realizar esta acción", "", JOptionPane.WARNING_MESSAGE);
                    calcular_porciento_ley.setSelected(false);
                }
                calcular_totales();
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        }
        );
    }

    public void eventoAnularFactura() {
        // TODO add your handling code here:

        FrmOutValidarusuario frm = new FrmOutValidarusuario(this, true, "12");
        frm.setVisible(true);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
                String valor = frm.getValor();
                if (valor.equals("-1")) {
                    return;
                } else if (valor.equals("1")) {

                    Map map;
                    String respuesta = "";
                    try {
                        respuesta = webServices.buscar("\"f_idrecord\":\"" + getIdfactura() + "\"", "ws/set_anular_factura");
                        if (!respuesta.equals("")) {

                            map = funciones.JsonToMap(respuesta);
                            if (map.get("f_data").toString().equals("true")) {
                                funciones.mensaje("Orden Cancelada Correctamente", "", JOptionPane.INFORMATION_MESSAGE);
                                btnNueva_factura.doClick();
                            }
                            // map1 = funciones.JsonToListMap(map.get("f_data"));
                        }

                    } catch (Exception ex) {
                        System.err.println(ex.getMessage());
                    }

                } else {
                    funciones.mensaje("No tienes permiso para realizar esta acción", "", JOptionPane.WARNING_MESSAGE);

                }
                calcular_totales();
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        }
        );
    }

    public void eventoUnirMesas() {
        // TODO add your handling code here:

        FrmOutUnirMesas frm = new FrmOutUnirMesas(this, true, getIdfactura(), txtcamarero.getText(), txttotal.getText(), label_area.getText(), txtmesa.getText(), id_mesa);
        frm.setVisible(true);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        }
        );
    }

    public void eventoFacturaOficial() {
        // TODO add your handling code here:
        FrmOutValidarusuario frm = new FrmOutValidarusuario(this, true, "7");
        frm.setVisible(true);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
                String valor = frm.getValor();
                if (valor.equals("-1")) {
                    return;
                } else if (valor.equals("1")) {
                    factura_oficial.setSelected(true);
                } else {
                    funciones.mensaje("No tienes permiso para realizar esta acción", "", JOptionPane.WARNING_MESSAGE);
                    factura_oficial.setSelected(false);
                }
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        }
        );
    }

    public void eventoLibreImpuesto() {
        // TODO add your handling code here:
        FrmOutValidarusuario frm = new FrmOutValidarusuario(this, true, "11");
        frm.setVisible(true);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
                String valor = frm.getValor();
                if (valor.equals("-1")) {
                    return;
                } else if (valor.equals("1")) {
                    if (getLibre()) {
                        setLibre(false);
                    } else {
                        setLibre(true);
                    }

                } else {
                    funciones.mensaje("No tienes permiso para realizar esta acción", "", JOptionPane.WARNING_MESSAGE);
                    setLibre(false);
                }
                calcular_totales();
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        }
        );
    }

    public void eventoBorrarLinea() {
        // TODO add your handling code here:
        FrmOutValidarusuario frm = new FrmOutValidarusuario(this, true, "8");
        frm.setVisible(true);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
                String valor = frm.getValor();
                if (valor.equals("-1")) {
                    return;
                } else if (valor.equals("1")) {
                    DefaultTableModel defaultTableModel = (DefaultTableModel) tabla_datos.getModel();
                    eliminarDeAarayListComponente(tabla_datos.getSelectedRow() + "");
                    defaultTableModel.removeRow(tabla_datos.getSelectedRow());

                } else {
                    funciones.mensaje("No tienes permiso para realizar esta acción", "", JOptionPane.WARNING_MESSAGE);

                }
                calcular_totales();
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        }
        );
    }

    public void eventoDescuentoFactura() {
        // TODO add your handling code here:
        FrmOutValidarusuario frm = new FrmOutValidarusuario(this, true, "3");
        frm.setVisible(true);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
                String valor = frm.getValor();
                if (valor.equals("-1")) {
                    return;
                } else if (valor.equals("1")) {
                    agregarDescuento();
                } else {
                    funciones.mensaje("No tienes permiso para realizar esta acción", "", JOptionPane.WARNING_MESSAGE);

                }
                calcular_totales();
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }

    public void agregarDescuento() {
        FrmOutValor frm = new FrmOutValor(this, true);
        frm.setVisible(true);
        frm.getContentPane().setBackground(Color.white);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                if (frm.getValor().equals("")) {
                    return;
                }

                Double sub_total = funciones.parseDouble(txtsubtotal.getText());
                Double porciento = funciones.parseDouble(frm.getValor());

                porciento = porciento / 100;

                Double descuento = sub_total * porciento;
                txtdescuento.setText(funciones.Round(descuento, 2));
                calcular_totales();
            }
        });
    }

    public void eventoCambiarPrecio() {
        // TODO add your handling code here:
        FrmOutValidarusuario frm = new FrmOutValidarusuario(this, true, "1");
        frm.setVisible(true);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
                String valor = frm.getValor();
                if (valor.equals("-1")) {
                    return;
                } else if (valor.equals("1")) {
                    cambiarPrecio();
                } else {
                    funciones.mensaje("No tienes permiso para realizar esta acción", "", JOptionPane.WARNING_MESSAGE);

                }
                calcular_totales();
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        }
        );
    }

    public void cambiarPrecio() {
        FrmOutValor frm = new FrmOutValor(this, true);
        frm.setVisible(true);
        frm.getContentPane().setBackground(Color.white);
        frm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
                if (frm.getValor().equals("") || frm.getValor().equals("0")) {
                    return;
                }

                TableModel tableModel = tabla_datos.getModel();

                int row = tabla_datos.getSelectedRow();

                Double precio_producto = Double.valueOf(frm.getValor());
                Double tax_producto = Double.valueOf(tableModel.getValueAt(row, 9).toString());
                Double cantidad = Double.valueOf(tableModel.getValueAt(row, 1).toString());

                Double tax_total = precio_producto * (tax_producto / 100);
                Double importe = (precio_producto + tax_total) * cantidad;

                tableModel.setValueAt(funciones.parseDouble(cantidad + ""), row, 1);
                tableModel.setValueAt(funciones.Round(importe, 2), row, 5);
                tableModel.setValueAt(funciones.Round(tax_total, 2), row, 6);
                tableModel.setValueAt(funciones.Round(precio_producto, 2), row, 4);
                calcular_totales();
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }

    public void eventoArribaAbajoTabla(String tipo) {
        //tipo =1 arriba
        //tipo =2 abajo

        if (tipo.equals("1")) {

            if (tabla_datos.getSelectedRow() == -1) {
                tabla_datos.setRowSelectionInterval(0, 0);
            } else {
                if (tabla_datos.getSelectedRow() == 0) {
                    return;
                } else {

                    tabla_datos.setRowSelectionInterval(tabla_datos.getSelectedRow() - 1, tabla_datos.getSelectedRow() - 1);
                }
            }
        } else if (tipo.equals("2")) {

            if (tabla_datos.getSelectedRow() == -1) {
                tabla_datos.setRowSelectionInterval(0, 0);
            } else {
                if (tabla_datos.getSelectedRow() == tabla_datos.getRowCount() - 1) {
                    return;
                } else {

                    tabla_datos.setRowSelectionInterval(tabla_datos.getSelectedRow() + 1, tabla_datos.getSelectedRow() + 1);
                }
            }

        }

    }

    public void eliminarDeAarayListComponente(String fila) {
        for (int i = 0; i < getArrayListComponentes().size(); i++) {
            Map<String, Object> tupla = getArrayListComponentes().get(i);
            if (tupla.get("fnumerofila").toString().equals(fila)) {
                getArrayListComponentes().remove(i);
            }
        }
        // System.err.println(getArrayListComponentes());

    }

    public void cargar_factura() {

        Map map;
        Map map_data;
        List<Map<String, Object>> map1;
        String respuesta = "";
        try {
            respuesta = webServices.buscar("\"f_idfactura\":\"" + getIdfactura() + "\"", "ws/get_factura_abierta_cargar");
            if (!respuesta.equals("")) {
                map = funciones.JsonToMap(respuesta);
                map_data = (Map) map.get("f_data");
                //llanamos la lista del detalle
                map1 = funciones.JsonToListMap(map_data.get("f_detalles"));

                id_camarero = map_data.get("f_idcamarero").toString();
                txtcamarero.setEditable(true);
                txtcamarero.setText(map_data.get("f_nombre_camarero").toString());
                txtcamarero.setEditable(false);
                id_camarero = map_data.get("f_idcamarero").toString();

                txtdescuento.setEditable(true);
                txtdescuento.setText(funciones.Round(map_data.get("f_descuento"), 2));
                txtdescuento.setEditable(false);
                setNombre_cuenta(map_data.get("f_cuenta").toString());
                setAgregar_cuenta_booleano(true);
                for (Map tupla : map1) {
                    eventoAgregar_Productos_Factura_cargada(tupla.get("f_idproducto").toString(), funciones.parseDouble(tupla.get("f_precio").toString()), funciones.parseDouble(tupla.get("f_cantidad").toString()),tupla.get("f_comanda").toString(),tupla.get("f_idcomanda").toString());
                    String componentes = new String(Base64.decodeBase64(tupla.get("f_componentes").toString()));
                    if (!componentes.equals("") && !componentes.equals("[]") && componentes != null) {
                        get_componentes(componentes);
                    }

                }

            }

        } catch (Exception ex) {

            System.err.println("Punto venta ==>  Cargar Factura Punto Venta " + ex.getMessage());
        }

    }

    public void eventoAgregar_Productos_Factura_cargada(String idproduto, Double precio, Double cant,String comandas,String idcomanda) {

        Map map;
        List<Map<String, Object>> map1;
        String respuesta = "";
        try {
            respuesta = webServices.buscar("\"f_idproducto\":\"" + idproduto + "\",\"f_idarea\":\"" + id_area + "\"", "ws/get_productos_by_id");
            if (!respuesta.equals("")) {
                map = funciones.JsonToMap(respuesta);
                map1 = funciones.JsonToListMap(map.get("f_data"));

                if (map1.size() > 0) {

                    String descirpcion = map1.get(0).get("f_descripcion").toString();
                    String referencia = map1.get(0).get("f_referencia").toString();
                    Double precio_producto = precio;
                    Double tax_producto = Double.valueOf(map1.get(0).get("f_tax").toString());
                    Double tax_total = precio_producto * (tax_producto / 100);
                    Double importe = precio_producto + tax_total;
                    importe = importe * cant;

                    DefaultTableModel model = (DefaultTableModel) tabla_datos.getModel();
                    model.addRow(new Object[]{
                        model.getRowCount() + 1,//numero de fila
                        cant,//cantidad
                        referencia,//referencia del prodcuto
                        descirpcion,//descripcion del producto
                        funciones.Round(precio_producto, 2),//precio producto
                        funciones.Round(importe, 2),//importe del producto
                        funciones.Round(tax_total, 2),//tax que se le aplica al producto
                        idproduto,
                        "false",
                        tax_producto.toString(),
                        comandas,
                        idcomanda
                        
                    });
                    calcular_totales();
                }

            }
        } catch (Exception e) {
            System.err.println("Punto venta ==> eventoAgregar_Productos_Factura_cargada =>" + e.getMessage());

        }

    }

    public void get_componentes(String json_components) {

        Map map1 = funciones.JsonToMap(json_components);
        List<Map<String, Object>> lista;
        List<Map<String, Object>> lista_componentes = new ArrayList<>();

        lista = funciones.JsonToListMap(map1.get("f_datos"));
        if (lista.size() > 0) {

            for (Map<String, Object> tupla : lista) {
                Map<String, Object> map = new HashMap<>();
                map.put("fIdprodcutoComponente", tupla.get("f_idprodcuto_componente").toString());
                map.put("fIngrediente", tupla.get("f_ingrediente").toString());
                map.put("fCantidad", tupla.get("f_cantidad").toString());
                map.put("fCobrable", tupla.get("f_cobrable").toString());
                map.put("fMontoCobrar", tupla.get("f_monto_cobrar").toString());
                map.put("fidproducto", 0);
                map.put("fnumerofila", tabla_datos.getRowCount());
                lista_componentes.add(map);
            }

            for (Map<String, Object> tupla : lista_componentes) {
                ArrayListComponentes.add(tupla);
            }

        } else {
            return;
        }
    }

    public void eventoSalvar() {

        if (tabla_datos.getRowCount() <= 0) {
            funciones.mensaje("No hay Productos a para la factura", "", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (id_camarero.equals("0") || id_camarero.equals("")) {
            funciones.mensaje("Seleccione el Camarero", "", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (id_mesa.equals("0") || id_mesa.equals("")) {
            funciones.mensaje("Seleccione la Mesa", "", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Double variable_itbis = funciones.parseDouble(txtitbis.getText());
        Double variable_sub_total = funciones.parseDouble(txtsubtotal.getText());
        Double variable_descuento = funciones.parseDouble(txtdescuento.getText());
        Double variable_ley = funciones.parseDouble(txtley.getText());
        Double variable_total = funciones.parseDouble(txttotal.getText());
        //PREGUNTAMOS SI LA FACTURA ESTA EN EDICION 
        String idrecord_factura = "";
        if (!getIdfactura().equals("") || !getIdfactura().equals("0")) {
            idrecord_factura = getIdfactura();
        }
        //LLENAMOS EL LISTADO DE COMPONENTES DESDE LA FUNCION CREAR JSON COMPONENTES
        String componentes = funciones.CrearJsonComponentes(ArrayListComponentes);
        //LLENAMOS EL DETALLE DE LA FACTURA DESDE LA FUNCION CREAR JSON DETALLES
        String detalle = funciones.CrearJsonDetalles(tabla_datos.getModel());
        
//        System.err.println(detalle);

        String json = "{"
                + "\"f_idfactura\":\"" + idrecord_factura + "\","
                + "\"f_itbis\":\"" + variable_itbis + "\","
                + "\"f_descuento\":\"" + variable_descuento + "\","
                + "\"f_ley\":\"" + variable_ley + "\","
                + "\"f_sub_total\":\"" + variable_sub_total + "\","
                + "\"f_total\":\"" + variable_total + "\","
                + "\"f_detalle\":" + detalle + ","
                + "\"f_componentes\":" + componentes + ","
                + "\"f_idmesa\":\"" + id_mesa + "\","
                + "\"f_idcamarero\":\"" + id_camarero + "\","
                + "\"f_total_extras\":\"" + getTotal_extra() + "\","
                + "\"f_nombre_cuenta\":\"" + getNombre_cuenta() + "\","
                + "\"f_agregar_cuenta\":\"" + getAgregar_cuenta_booleano() + "\"}";

        Map map;
        String respuesta = "";
        try {
            respuesta = webServices.buscar("\"f_factura\":" + json, "ws/set_salvar_factura");
            if (!respuesta.equals("")) {
                map = funciones.JsonToMap(respuesta);
                String[] data = map.get("f_data").toString().split("#");
                if (data[0].equals("true")) {
                    funciones.mensaje("Orden Generada correctamente", "", JOptionPane.INFORMATION_MESSAGE);
                    btnNueva_factura.doClick();

                }
            }
        } catch (Exception e) {
            System.err.println("Punto venta ==>eventoSalvar ==> " + e.getMessage());

        }

    }

    public void eventoNuevo() {
        id_camarero = "0";
        id_mesa = "0";
        idfactura = "0";
        txtmesa.setEditable(false);
        txtmesa.setText("");
        txtmesa.setEditable(true);
        txtcamarero.setEditable(false);
        txtcamarero.setText("");
        txtcamarero.setEditable(true);
        funciones.borrarTabla(tabla_datos);
        addBotonesCategorias();
        ArrayListComponentes.clear();
        setTotal_extra(0.00);
        setTotal_tax_extra(0.00);
        setNombre_cuenta("");
        setAgregar_cuenta_booleano(false);
        calcular_totales();
        txtdescuento.setText(funciones.Round("0", 2));
    }

    public void eventoSepararMesas(TableModel con1, TableModel con2, Double sub_total, Double tax, List<Map<String, Object>> list) {

        tabla_datos.setModel(con1);
        reorganizar_tabla();
        crear_factura_separada(con2, sub_total, tax, list, sub_total);
        evento_eliminar_lista(con2);
        btnSalvar_factura.doClick();

    }

    public void crear_factura_separada(TableModel tableModel, Double subTotal, Double tax, List<Map<String, Object>> array, Double extras) {

        Double sub = 0.00;
        Double tx = 0.00;

        DefaultTableModel modelo = (DefaultTableModel) tableModel;
        for (int i = 0; i < tableModel.getRowCount(); i++) {

            Double precio = funciones.parseDouble(modelo.getValueAt(i, 4).toString());
            Double cantidad = funciones.parseDouble(modelo.getValueAt(i, 1).toString());
            Double tax_producto = funciones.parseDouble(modelo.getValueAt(i, 9).toString());
            sub += precio * cantidad;
            if (!getLibre()) {
                tx += (precio * (tax_producto / 100)) * cantidad;
            }

        }
        sub += subTotal;
        tx += tax;

        Double porciento_ley = 0.00;
        if (calcular_porciento_ley.isSelected()) {
            porciento_ley = (sub * (datos_preferencias.porciento_ley / 100));
        }

        Double total_general = (sub + tx + porciento_ley);

        Double variable_itbis = tx;
        Double variable_sub_total = sub;
        Double variable_descuento = 0.00;
        Double variable_ley = porciento_ley;
        Double variable_total = total_general;
        //PREGUNTAMOS SI LA FACTURA ESTA EN EDICION 
        String idrecord_factura = "";

        //LLENAMOS EL LISTADO DE COMPONENTES DESDE LA FUNCION CREAR JSON COMPONENTES
        String componentes = funciones.CrearJsonComponentes(array);
        //LLENAMOS EL DETALLE DE LA FACTURA DESDE LA FUNCION CREAR JSON DETALLES
        String detalle = funciones.CrearJsonDetalles(tableModel);

        String json = "{"
                + "\"f_idfactura\":\"" + idrecord_factura + "\","
                + "\"f_itbis\":\"" + variable_itbis + "\","
                + "\"f_descuento\":\"" + variable_descuento + "\","
                + "\"f_ley\":\"" + variable_ley + "\","
                + "\"f_sub_total\":\"" + variable_sub_total + "\","
                + "\"f_total\":\"" + variable_total + "\","
                + "\"f_detalle\":" + detalle + ","
                + "\"f_componentes\":" + componentes + ","
                + "\"f_idmesa\":\"" + id_mesa + "\","
                + "\"f_idcamarero\":\"" + id_camarero + "\","
                + "\"f_total_extras\":\"" + extras + "\","
                + "\"f_nombre_cuenta\":\"" + txtmesa.getText() + "\","
                + "\"f_agregar_cuenta\":\"" + true + "\"}";

        Map map;
        String respuesta = "";
        try {
            respuesta = webServices.buscar("\"f_factura\":" + json, "ws/set_salvar_factura");

            System.err.println(respuesta);
            if (!respuesta.equals("")) {
                map = funciones.JsonToMap(respuesta);
                if (map.get("f_data").toString().equals("true")) {
                    funciones.mensaje("Orden se separo correctamente", "", JOptionPane.INFORMATION_MESSAGE);
                    //setIdFacturaImprimir(data[1]);
                }

            }
        } catch (Exception e) {
            System.err.println("Punto venta ==>eventoSalvar ==> " + e.getMessage());
        }

    }

    public void evento_eliminar_lista(TableModel tableModel) {

        List<Map<String, Object>> list_aux = new ArrayList<>();
        for (int b = 0; b < tableModel.getRowCount(); b++) {
            for (Map<String, Object> tupla : ArrayListComponentes) {
                String varible_numero_fila = ((DefaultTableModel) tableModel).getValueAt(b, 0).toString();
                if (varible_numero_fila.equals(tupla.get("fnumerofila").toString())) {
                    list_aux.add(tupla);
                }
            }
        }
        for (Map<String, Object> tupla : list_aux) {
            ArrayListComponentes.remove(tupla);
        }

        calcular_totales();
    }

    public void eventoCerrarFactura(int tipo, int idcliente, Double devuelta, int tipo_ncf, int tipo_tarjeta, Double propina, String numero_autorizacion, Double monto_tarjeta, Double monto_efectivo,String razon_social,String rnc) {

        
        int idcli = 0;
        if (idcliente > 0) {
            idcli = idcliente;

        }

        if (tabla_datos.getRowCount() <= 0) {
            funciones.mensaje("No hay Productos agregados para la factura", "", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (id_camarero.equals("0") || id_camarero.equals("")) {
            funciones.mensaje("Seleccione el Camarero", "", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (id_mesa.equals("0") || id_mesa.equals("")) {
            funciones.mensaje("Seleccione la Mesa", "", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Double variable_itbis = funciones.parseDouble(txtitbis.getText());
        Double variable_sub_total = funciones.parseDouble(txtsubtotal.getText());
        Double variable_descuento = funciones.parseDouble(txtdescuento.getText());
        Double variable_ley = funciones.parseDouble(txtley.getText());
        Double variable_total = funciones.parseDouble(txttotal.getText());
        //PREGUNTAMOS SI LA FACTURA ESTA EN EDICION 
        String idrecord_factura = "";
        if (!getIdfactura().equals("") || !getIdfactura().equals("0")) {
            idrecord_factura = getIdfactura();
        }
        //LLENAMOS EL LISTADO DE COMPONENTES DESDE LA FUNCION CREAR JSON COMPONENTES
        String componentes = funciones.CrearJsonComponentes(ArrayListComponentes);
        //LLENAMOS EL DETALLE DE LA FACTURA DESDE LA FUNCION CREAR JSON DETALLES
        String detalle = funciones.CrearJsonDetalles(tabla_datos.getModel());

        String json = "{"
                + "\"f_idfactura\":\"" + idrecord_factura + "\","
                + "\"f_itbis\":\"" + variable_itbis + "\","
                + "\"f_descuento\":\"" + variable_descuento + "\","
                + "\"f_ley\":\"" + variable_ley + "\","
                + "\"f_sub_total\":\"" + variable_sub_total + "\","
                + "\"f_total\":\"" + variable_total + "\","
                + "\"f_detalle\":" + detalle + ","
                + "\"f_componentes\":" + componentes + ","
                + "\"f_idmesa\":\"" + id_mesa + "\","
                + "\"f_idcamarero\":\"" + id_camarero + "\","
                + "\"f_total_extras\":\"" + getTotal_extra() + "\","
                + "\"f_nombre_cuenta\":\"" + getNombre_cuenta() + "\","
                + "\"f_razon_social\":\"" + razon_social + "\","
                + "\"f_rnc\":\"" + rnc + "\","
                + "\"f_tipo_pago\":\"" + tipo + "\","
                + "\"f_idcliente\":\"" + idcli + "\","
                + "\"f_devuelta\":\"" + devuelta + "\","
                + "\"f_tipo_ncf\":\"" + tipo_ncf + "\","
                + "\"f_tipo_tarjeta\":\"" + tipo_tarjeta + "\","
                + "\"f_propina\":\"" + propina + "\","
                + "\"f_numero_autorizacion\":\"" + numero_autorizacion + "\","
                + "\"f_monto_tarjeta\":\"" + monto_tarjeta + "\","
                + "\"f_monto_efectivo\":\"" + monto_efectivo + "\","
                + "\"f_agregar_cuenta\":\"" + getAgregar_cuenta_booleano() + "\"}";
        
        System.err.println(json);

        Map map;
        String respuesta = "";
        try {
            respuesta = webServices.buscar("\"f_factura\":" + json, "ws/set_cerrar_factura");
            if (!respuesta.equals("")) {
                map = funciones.JsonToMap(respuesta);

                String[] data = map.get("f_data").toString().split(";");
                if (data[0].equals("true")) {
                    funciones.mensaje("Factura Generada correctamente", "", JOptionPane.INFORMATION_MESSAGE);
                    eventoImprimir(data[1], 1);
                    btnNueva_factura.doClick();
                }
//                map1 = funciones.JsonToListMap(map.get("f_data"));
//
//                if (map1.size() > 0) {
//                }

            }
        } catch (Exception e) {
            System.err.println("Punto venta ==> eventoSalvar ==> " + e.getMessage());

        }

    }

    /**
     * @param id este representa el numero de la factura
     * @param tipo este representa el tipo de impresion sea una reimpresion o
     * una impresion de facturacion 1=Impresion normal 2= Reimpresión
     */
    public void eventoImprimir(String id, int tipo) {
        String json = "";
        try {
            String tipo_impresion = "FACTURA";
            if (tipo == 2) {
                tipo_impresion = "REIMPRESION FACTURA";
            }
            Dao dao = new Dao();
            String respuesta = "";
            respuesta = webServices.buscar("\"f_idrecord\":" + id, "ws/get_imprimir_factura_by_id");
            if (!respuesta.equals("")) {
                //papel Matricial
                if (dao.getTipo_papel().equals("1")) {
                    funciones.GenerarStringFacturaImprimirMatricial(respuesta, dao.getTipo_printer(), tipo_impresion);
                }//papel termico
                else if (dao.getTipo_papel().equals("2")) {
                    funciones.GenerarStringFacturaImprimirTermica(respuesta, dao.getTipo_printer(), tipo_impresion);
                }
            }
        } catch (Exception ex) {
            System.err.println("Reimprimir factura=> imprimir factura => " + ex.getMessage());
        }

    }

}
