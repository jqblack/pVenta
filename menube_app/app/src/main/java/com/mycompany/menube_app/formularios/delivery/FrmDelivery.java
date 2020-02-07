/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.menube_app.formularios.delivery;

import FuncionesGenerales.Combo;
import FuncionesGenerales.Funciones;
import FuncionesGenerales.WebServices;
import FuncionesGenerales.datos_preferencias;
import com.mycompany.menube_app.formularios.FrmLogin;
import com.mycompany.menube_app.formularios.FrmOutBuscarProductos;
import com.mycompany.menube_app.formularios.FrmOutOrdenesAbiertas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author Usuario
 */
public class FrmDelivery extends javax.swing.JFrame {

    /**
     * Creates new form FrmDelivery
     */
    Funciones funciones = new Funciones();
    WebServices webServices = new WebServices();
    String idusuario = "0";
    Boolean empresa_contado;
    long idcliente = 0;

    public FrmDelivery(String nombre_ususario, String idusuario) {
        initComponents();
        addBotonesCategorias();
        llenar_ncf();
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
        reorganizarTabla();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public FrmDelivery() {
        initComponents();

    }

    public void eliminar_botones() {
        panel_botones_productos.removeAll();
        panel_botones_productos.repaint();
    }

    public void addBotonesCategorias() {

        int contador = 1;
        int acumulador_heiht = 0;
        int top = 0;
        int i = 0;
        //int width = 210;
        int columnas = 3;
        int separacion = 3;
        int width = panel_botones_productos.getWidth() / columnas;
        width = width - separacion;
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
                        acumulador_heiht += width + separacion;
                    } else {
                        panel_botones_productos.add(button1, new AbsoluteConstraints(acumulador_heiht, top, width, heiht));
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

                    // panel_botones_productos.add(button1); 
                }

            }

        } catch (Exception ex) {
            System.err.println("Punto venta ==>  addBotonesCategorias =>" + ex.getMessage());
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

    public void addBotonesProductosPorCategorias(String idcategoria) {

        int contador = 1;
        int acumulador_heiht = 0;
        int top = 0;
        int i = 0;
        int columnas = 4;
        int separacion = 3;
        int width = panel_botones_productos.getWidth() / columnas;
        width = width - separacion;
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
                        acumulador_heiht += width + separacion;
                    } else {
                        panel_botones_productos.add(button1, new AbsoluteConstraints(acumulador_heiht, top, width, heiht));
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

            }

        } catch (Exception ex) {
            System.err.println("Punto Venta => addBotonesProductosPorCategorias => " + ex.getMessage());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_usuario = new javax.swing.JLabel();
        label_area = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        label_hora = new javax.swing.JLabel();
        label_fecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbNcf = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtItbis = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtNota = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        panel_menu_principal = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        recargar_categorias = new javax.swing.JButton();
        btnBuscar_productos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        panel_botones_productos = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JLabel();
        lblNombreCliente1 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        salvar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
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

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("NCF :");

        cbNcf.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        cbNcf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbNcfItemStateChanged(evt);
            }
        });

        tabla_datos.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "#", "REF", "DESC", "CANT", "PRECIO", "TAX", "TAX_PRODUCTO", "COMANDA", "IDCOMANDA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_datosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_datos);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Totales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Sub-Total :");

        txtSubTotal.setEditable(false);
        txtSubTotal.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        txtSubTotal.setForeground(new java.awt.Color(0, 153, 51));
        txtSubTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSubTotal.setText("0.00");
        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });
        txtSubTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSubTotalKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Itbis :");

        txtItbis.setEditable(false);
        txtItbis.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        txtItbis.setForeground(new java.awt.Color(0, 153, 51));
        txtItbis.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtItbis.setText("0.00");
        txtItbis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItbisActionPerformed(evt);
            }
        });
        txtItbis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtItbisKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Total :");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(0, 153, 51));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setText("0.00");
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        txtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTotalKeyPressed(evt);
            }
        });

        txtNota.setColumns(20);
        txtNota.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNota.setLineWrap(true);
        txtNota.setRows(5);
        txtNota.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txtNota);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Nota");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtItbis)
                            .addComponent(txtSubTotal)
                            .addComponent(txtTotal))
                        .addGap(6, 6, 6))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtItbis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel11)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_menu_principal.setBackground(new java.awt.Color(204, 204, 204));

        jPanel5.setBackground(new java.awt.Color(64, 149, 191));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Menu Principal");

        recargar_categorias.setBackground(new java.awt.Color(0, 153, 51));
        recargar_categorias.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        recargar_categorias.setForeground(new java.awt.Color(255, 255, 255));
        recargar_categorias.setText("Recargar Categorias");
        recargar_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recargar_categoriasActionPerformed(evt);
            }
        });

        btnBuscar_productos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscar_productos.setText("Buscar Productos");
        btnBuscar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar_productosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar_productos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recargar_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 8, Short.MAX_VALUE))
            .addComponent(btnBuscar_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(recargar_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jScrollPane3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jScrollPane3ComponentResized(evt);
            }
        });

        panel_botones_productos.setBackground(new java.awt.Color(255, 255, 255));
        panel_botones_productos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane3.setViewportView(panel_botones_productos);

        javax.swing.GroupLayout panel_menu_principalLayout = new javax.swing.GroupLayout(panel_menu_principal);
        panel_menu_principal.setLayout(panel_menu_principalLayout);
        panel_menu_principalLayout.setHorizontalGroup(
            panel_menu_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
        );
        panel_menu_principalLayout.setVerticalGroup(
            panel_menu_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu_principalLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3))
        );

        salir.setBackground(new java.awt.Color(255, 0, 0));
        salir.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salir.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("TELEFONO");

        txtTelefono.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
        });

        txtDireccion.setColumns(10);
        txtDireccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDireccion.setLineWrap(true);
        txtDireccion.setRows(5);
        txtDireccion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtDireccion);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("CLIENTE");

        lblNombreCliente.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblNombreCliente.setText("Nombre : No Seleccionado");

        lblNombreCliente1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombreCliente1.setText("DIRECCION");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(lblNombreCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lblNombreCliente))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        btnNuevo.setBackground(new java.awt.Color(102, 204, 255));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        salvar.setBackground(new java.awt.Color(0, 204, 102));
        salvar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        salvar.setForeground(new java.awt.Color(255, 255, 255));
        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salvar.png"))); // NOI18N
        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        salvar1.setBackground(new java.awt.Color(0, 153, 51));
        salvar1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        salvar1.setForeground(new java.awt.Color(255, 255, 255));
        salvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder.png"))); // NOI18N
        salvar1.setText("Cerrar Fac");
        salvar1.setToolTipText("");
        salvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbNcf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_menu_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbNcf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_menu_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == 10) {
            FrmOutDireccioneClientes frm = new FrmOutDireccioneClientes(this, true, txtTelefono.getText());
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
                    if (!frm.getSi_no() == true) {
                        return;
                    }
                    lblNombreCliente.setText(frm.getNombre_cliente());
                    txtDireccion.setText(frm.getDirecicion());
                    idcliente = frm.getIdcliente();
                    FrmEmpresaContado frm1 = new FrmEmpresaContado((JFrame) frm.getParent(), true);
                    frm1.setVisible(true);
                    frm1.addWindowListener(new WindowListener() {
                        @Override
                        public void windowOpened(WindowEvent e) {
                        }

                        @Override
                        public void windowClosing(WindowEvent e) {
                        }

                        @Override
                        public void windowClosed(WindowEvent e) {
                            empresa_contado = frm1.getEmpresa_contado();
                            if (rootPaneCheckingEnabled) {

                            }
                            if (empresa_contado) {
                                cbNcf.setVisible(false);
                                jLabel2.setVisible(false);
                            } else {
                                jLabel2.setVisible(true);
                                cbNcf.setVisible(true);
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
    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void recargar_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recargar_categoriasActionPerformed
        // TODO add your handling code here:
        addBotonesCategorias();
    }//GEN-LAST:event_recargar_categoriasActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        eventoSalir();
    }//GEN-LAST:event_salirActionPerformed

    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotalActionPerformed

    private void txtSubTotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSubTotalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotalKeyPressed

    private void txtItbisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItbisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItbisActionPerformed

    private void txtItbisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItbisKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItbisKeyPressed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtTotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalKeyPressed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        eventoNuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        // TODO add your handling code here:

        eventoSalvar();
    }//GEN-LAST:event_salvarActionPerformed

    private void tabla_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_datosMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            FrmOpciones frm = new FrmOpciones();
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
                    int opcion = frm.getOpcion();
                    eventoOpciones(opcion);

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
    }//GEN-LAST:event_tabla_datosMouseClicked

    private void cbNcfItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbNcfItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 1) {
            eventoValidarNcf();
        }
    }//GEN-LAST:event_cbNcfItemStateChanged

    private void jScrollPane3ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jScrollPane3ComponentResized
        // TODO add your handling code here:
        panel_botones_productos.setBounds(jScrollPane3.getBounds());
        addReorganizarBotones();
    }//GEN-LAST:event_jScrollPane3ComponentResized

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

    private void salvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar1ActionPerformed
        // TODO add your handling code here:
        FrmOutOrdenesAbiertas frmcComandas = new FrmOutOrdenesAbiertas(true);
        frmcComandas.setExtendedState(JFrame.MAXIMIZED_BOTH);
//                         frmcComandas.setUndecorated(true);
        frmcComandas.setVisible(true);
        frmcComandas.getContentPane().setBackground(Color.WHITE);
    }//GEN-LAST:event_salvar1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDelivery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar_productos;
    private javax.swing.JButton btnCerrar_factura;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<Combo> cbNcf;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel label_area;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_hora;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblNombreCliente1;
    private javax.swing.JPanel panel_botones_productos;
    private javax.swing.JPanel panel_menu_principal;
    private javax.swing.JButton recargar_categorias;
    private javax.swing.JButton salir;
    private javax.swing.JButton salvar;
    private javax.swing.JButton salvar1;
    private javax.swing.JTable tabla_datos;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtItbis;
    private javax.swing.JTextArea txtNota;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

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
            System.err.println("Error en salir punto venta en el metodo logout" + e.getMessage());
        }

        dispose();
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
        login.setTitle("Login de Usuario");
        login.getContentPane().setBackground(new Color(64, 149, 191));
    }

    public void llenar_ncf() {
        Map map;
        List<Map<String, Object>> map1;
        String respuesta = "";
        try {
            respuesta = webServices.buscar("", "ws/get_comprobante_fiscales");
            if (!respuesta.equals("")) {
                map = funciones.JsonToMap(respuesta);
                map1 = funciones.JsonToListMap(map.get("f_data"));
                for (Map tupla : map1) {
                    Combo combo = new Combo(tupla.get("f_idrecord").toString(), tupla.get("f_descripcion").toString());
                    cbNcf.addItem(combo);
                }
            }

        } catch (Exception ex) {
            System.err.println("FrmCerrarFactura => llenar ncf => " + ex.getMessage());
        }

    }

    public void eventoValidarNcf() {
        Map map;
        String respuesta = "";
        try {
            respuesta = webServices.buscar("\"f_idrecord\":\"" + ((Combo) cbNcf.getSelectedItem()).getId() + "\"", "ws/get_validar_ncf");
            if (!respuesta.equals("")) {
                map = funciones.JsonToMap(respuesta);
                if (map.get("f_data").toString().equals("-1")) {
                    funciones.mensaje("El comprobante seleccionado a caducado su vigencia, por favor llame a la administracion", "", JOptionPane.ERROR_MESSAGE);
                    salvar.setEnabled(false);
                } else {
                    salvar.setEnabled(true);
                }
            }

        } catch (Exception ex) {
            System.err.println("FrmCerrarFactura => cargar datos cliente => " + ex.getMessage());
        }
    }

    public void reorganizarTabla() {
        tabla_datos.removeColumn(tabla_datos.getColumnModel().getColumn(9));
        tabla_datos.removeColumn(tabla_datos.getColumnModel().getColumn(8));
        tabla_datos.removeColumn(tabla_datos.getColumnModel().getColumn(7));
        tabla_datos.removeColumn(tabla_datos.getColumnModel().getColumn(6));
        tabla_datos.removeColumn(tabla_datos.getColumnModel().getColumn(0));
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        tabla_datos.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        tabla_datos.getTableHeader().setFont(new Font("Tahoma", 1, 16));
        tabla_datos.setRowHeight(40);
    }

    public void agregarProductosGrid(String idrecord) {
        Map map;
        List<Map<String, Object>> map1;
        String respuesta = "";
        try {
            respuesta = webServices.buscar("\"f_idproducto\":\"" + idrecord + "\",\"f_idarea\":\"" + 0 + "\"", "delivery/get_productos_by_id");
            if (!respuesta.equals("")) {
                map = funciones.JsonToMap(respuesta);
                map1 = funciones.JsonToListMap(map.get("f_data"));
                if (map1.size() > 0) {
                    String idproduto = map1.get(0).get("f_idrecord").toString();
                    String descirpcion = map1.get(0).get("f_descripcion").toString();
                    String referencia = map1.get(0).get("f_referencia").toString();
                    Double precio_producto = Double.valueOf(map1.get(0).get("f_precio").toString());
                    Double tax_producto = Double.valueOf(map1.get(0).get("f_tax").toString());
                    Double tax_total = 0.00;
                    String comanda = (!Boolean.valueOf(map1.get(0).get("f_comanda").toString())) + "";
                    String idcomanda = "-1";

                    if (datos_preferencias.impuesto_incluido) {
                        precio_producto = precio_producto / (1 + (tax_producto / 100));
                        tax_total = precio_producto * (tax_producto / 100);
                    } else {
                        tax_total = precio_producto * (tax_producto / 100);
                    }

                    DefaultTableModel model = (DefaultTableModel) tabla_datos.getModel();
                    model.addRow(new Object[]{
                        idproduto,//id del producto
                        model.getRowCount() + 1,//numero de fila
                        referencia,//referencia
                        descirpcion,//descripcion del producto
                        1,//cantidad
                        funciones.Round(precio_producto, 2),//precio producto
                        funciones.Round(tax_total, 2),//TAX calculado
                        funciones.Round(tax_producto, 2),//TAX del producto,
                        comanda,
                        idcomanda

                    });
                    calcular_totales();
                }

            }
        } catch (Exception e) {
            System.err.println("Punto Venta => agregarProductosGrid ==> " + e.getMessage());
        }

    }

    public void calcular_totales() {

        Double sub_total = Double.valueOf(0);
        Double tax = Double.valueOf(0);
        Double total = Double.valueOf(0);

        for (int i = 0; i < tabla_datos.getModel().getRowCount(); i++) {

            DefaultTableModel modelo = (DefaultTableModel) tabla_datos.getModel();
            Double precio_en_tabla = funciones.parseDouble(modelo.getValueAt(i, 5).toString());
            Double cantidad_en_tabla = funciones.parseDouble(modelo.getValueAt(i, 4).toString());
            Double tax_en_tabla = funciones.parseDouble(modelo.getValueAt(i, 6).toString());

            tax += tax_en_tabla * cantidad_en_tabla;
            sub_total += precio_en_tabla * cantidad_en_tabla;

        }

        txtSubTotal.setEditable(false);
        txtSubTotal.setText(funciones.Round(sub_total, 2));
        txtSubTotal.setEditable(true);

        txtItbis.setEditable(false);
        txtItbis.setText(funciones.Round(tax, 2));
        txtItbis.setEditable(true);

        total = sub_total + tax;
        txtTotal.setEditable(false);
        txtTotal.setText(funciones.Round(total, 2));
        txtTotal.setEditable(true);

    }

    public void eventoSalvar() {
        if (txtDireccion.getText().equals("")) {
            funciones.mensaje("Seleccione el Cliente", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (tabla_datos.getRowCount() <= 0) {
            funciones.mensaje("Agrege los productos", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (funciones.mensajeConfirmacion("Desea Generar la Orden", "Aviso", JOptionPane.YES_NO_OPTION) == 0) {

            if (cbNcf.isVisible()) {

                Double variable_itbis = funciones.parseDouble(txtItbis.getText());
                Double variable_sub_total = funciones.parseDouble(txtSubTotal.getText());
                Double variable_total = funciones.parseDouble(txtTotal.getText());

                long idnfc = Long.valueOf(((Combo) cbNcf.getSelectedItem()).getId());

                //PREGUNTAMOS SI LA FACTURA ESTA EN EDICION 
                String idrecord_factura = "";

//                //LLENAMOS EL LISTADO DE COMPONENTES DESDE LA FUNCION CREAR JSON COMPONENTES
//                String componentes = funciones.CrearJsonComponentes(ArrayListComponentes);
//                
                //LLENAMOS EL DETALLE DE LA FACTURA DESDE LA FUNCION CREAR JSON DETALLES
                String detalle = funciones.CrearJsonDetallesDelivery(tabla_datos.getModel());
                String json = "{"
                        + "\"f_idfactura\":\"" + idrecord_factura + "\","
                        + "\"f_itbis\":\"" + variable_itbis + "\","
                        + "\"f_ley\":\"" + 0.00 + "\","
                        + "\"f_sub_total\":\"" + variable_sub_total + "\","
                        + "\"f_total\":\"" + variable_total + "\","
                        + "\"f_detalle\":" + detalle + ","
                        + "\"f_tipo_ncf\":\"" + idnfc + "\","
                        + "\"f_idcliente\":\"" + idcliente + "\","
                        + "\"f_total_extras\":\"" + 0.00 + "\","
                        + "\"f_direccion\":\"" + txtDireccion.getText() + "\","
                        + "\"f_nota\":\"" + txtNota.getText() + "\"}";

                Map map;
                String respuesta = "";
                try {
                    respuesta = webServices.buscar("\"f_factura\":" + json, "delivery/set_salvar_orden_delivery");
                    if (!respuesta.equals("")) {
                        map = funciones.JsonToMap(respuesta);
                        String data = map.get("f_data").toString();
                        if (data.equals("true")) {
                            funciones.mensaje("Orden Generada correctamente", "", JOptionPane.INFORMATION_MESSAGE);
                            btnNuevo.doClick();
                        }
                    }
                } catch (Exception e) {
                    System.err.println("Punto venta delivery  ==>eventoSalvar ==> " + e.getMessage());

                }

            }
        }

    }

    public void eventoNuevo() {
        jLabel2.setVisible(true);
        cbNcf.setVisible(true);
        cbNcf.setSelectedIndex(0);
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtSubTotal.setEditable(true);
        txtItbis.setEditable(true);
        txtTotal.setEditable(true);

        txtSubTotal.setText("0.00");
        txtItbis.setText("0.00");
        txtTotal.setText("0.00");

        txtSubTotal.setEditable(false);
        txtItbis.setEditable(false);
        txtTotal.setEditable(false);
        recargar_categorias.doClick();
        lblNombreCliente.setText("Nombre : No Seleccionado");

        empresa_contado = false;
        txtNota.setText("");
        funciones.borrarTabla(tabla_datos);

    }

    public void eventoOpciones(int opcion) {
        switch (opcion) {
            //Borrar datos
            case 1:
                if (tabla_datos.getSelectedRow() != -1) {
                    DefaultTableModel model = (DefaultTableModel) tabla_datos.getModel();
                    model.removeRow(tabla_datos.getSelectedRow());
                    tabla_datos.revalidate();
                    tabla_datos.repaint();
                    calcular_totales();
                    reorganizarNumeroDeLineaTabla();
                }
                break;
            case 2:
                break;
            case 3:
                break;

        }
    }

    public void reorganizarNumeroDeLineaTabla() {

        for (int i = 0; i < tabla_datos.getRowCount(); i++) {
            DefaultTableModel model = (DefaultTableModel) tabla_datos.getModel();
            int numero = i + 1;
            model.setValueAt(numero, i, 1);
        }

    }
}
