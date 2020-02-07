/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.menube_app.formularios;

import FuncionesGenerales.Funciones;
import FuncionesGenerales.WebServices;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author Usuario
 */
public class FrmOutUnirMesas extends javax.swing.JDialog {

    private String nombre_area = "";
    private String nombre_mesa = "";

    
    private String idmesa_unir ="";
    public String getNombre_mesa() {
        return nombre_mesa;
    }

    public void setNombre_mesa(String nombre_mesa) {
        this.nombre_mesa = nombre_mesa;
    }

    public String getNombre_area() {
        return nombre_area;
    }

    public void setNombre_area(String nombre_area) {
        this.nombre_area = nombre_area;
    }

    public Funciones getFunciones() {
        return funciones;
    }

    public void setFunciones(Funciones funciones) {
        this.funciones = funciones;
    }

    /**
     * @return the idmesa
     */
    public String getIdmesa() {
        return idmesa;
    }

    /**
     * @param idmesa the idmesa to set
     */
    public void setIdmesa(String idmesa) {
        this.idmesa = idmesa;
    }

    /**
     * @return the idarea
     */
    public String getIdarea() {
        return idarea;
    }

    /**
     * @param idarea the idarea to set
     */
    public void setIdarea(String idarea) {
        this.idarea = idarea;
    }

    private String idfactura = "";

    public String getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(String idfactura) {
        this.idfactura = idfactura;
    }

    /**
     * Creates new form FrmOutAreas
     */
    WebServices webServices = new WebServices();
    Funciones funciones = new Funciones();

    private String idmesa = "";
    private String idarea = "";

    public FrmOutUnirMesas() {
        initComponents();
        llenar_areas();
    }

    public FrmOutUnirMesas(java.awt.Frame parent, boolean modal, String idfactura, String camarero, String monto, String area, String mesa, String id_mesa) {
        super(parent, modal);
        initComponents();
        llenar_areas();
        lblAreal.setText(area);
        lblCamarero.setText(camarero);
        lblMesa.setText(mesa);
        txttotal.setText(monto);
        setIdfactura(idfactura);
        setIdmesa(id_mesa);

    }

    public void llenar_areas() {
        Map map;
        List<Map<String, Object>> map1;
        String respuesta = "";
        try {
            respuesta = webServices.buscar("", "ws/get_areas");
            if (!respuesta.equals("")) {

                map = funciones.JsonToMap(respuesta);
                map1 = funciones.JsonToListMap(map.get("f_data"));

                float columnas = ((GridLayout) panel_areas.getLayout()).getColumns();
                float total_mapa = map1.size();

                float filas = total_mapa / columnas;

                if (filas % 2 == 0) {
                    ((GridLayout) panel_areas.getLayout()).setRows((int) filas);
                } else {
                    ((GridLayout) panel_areas.getLayout()).setRows((int) filas + 1);
                }

                for (Map tupla : map1) {

                    JButton button1 = new JButton();
                    button1.setText(tupla.get("f_nombre_area").toString());
                    button1.setBackground(new Color(255, 255, 0));
                    button1.setFont(new Font("Tahoma", 1, 18));
                    button1.setName(tupla.get("f_idrecord").toString());
                    button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            llenar_mesas_por_areas(button1.getName());
                            setIdarea(button1.getName());
                            setNombre_area(button1.getText());
                        }
                    });

                    panel_areas.add(button1);

                }

            }

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }

    public void llenar_mesas_por_areas(String idarea) {

        int contador = 1;
        int acumulador_heiht = 0;
        int top = 0;
        int i = 0;
        int columnas = 3;
        int width = panel_mesas.getWidth() / columnas;
        int heiht = 110;

        eliminar_botones(panel_mesas);
        Map map;
        List<Map<String, Object>> map1;
        String respuesta = "";
        try {
            respuesta = webServices.buscar("\"f_idarea\":\"" + idarea + "\"", "ws/get_mesas_by_areas");
            if (!respuesta.equals("")) {

                map = funciones.JsonToMap(respuesta);
                map1 = funciones.JsonToListMap(map.get("f_data"));

                for (Map tupla : map1) {

                    JButton boton = new JButton();
                    boton.setText("<html>" + tupla.get("f_descripcion").toString() + "<br />Cuentas :" + tupla.get("f_cuentas").toString() + "</html>");
                    if ((int) tupla.get("f_cuentas") > 0) {

                        boton.setBackground(Color.green);
                        boton.setForeground(Color.WHITE);
                    } else {

                        boton.setBackground(new Color(64, 149, 191));
                        boton.setForeground(Color.BLACK);
                    }
                    boton.setFont(new Font("Tahoma", 1, 18));
                    boton.setName(tupla.get("f_idrecord").toString() + ";" + tupla.get("f_cuentas").toString() + ";" + tupla.get("f_descripcion").toString());
                    boton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            if (boton.getName().split(";")[0].equals(getIdmesa())) {
                                funciones.mensaje("No puede Unir a la misma mesa", "", JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }

                            setIdmesa_unir(boton.getName().split(";")[0]);
                            lblMesaUnir.setText(boton.getName().split(";")[2]);
                            btnUnir.setEnabled(true);
                           // eventoUnirMesa(boton.getName().split(";")[0]);

//                            if (Integer.valueOf(boton.getName().split(";")[1]) > 0) {
//                                cargar_centas_mesas(boton.getName().split(";")[0]);
//                            } else {
//                                setIdmesa(boton.getName().split(";")[0]);
//                                setNombre_mesa(boton.getName().split(";")[2]);
//                                dispose();
//                            }
                        }
                    });
                    if (contador == 1 && i == 0) {
                        panel_mesas.add(boton, new AbsoluteConstraints(0, 0, width, heiht));
                        acumulador_heiht += width;
                    } else {
                        panel_mesas.add(boton, new AbsoluteConstraints(acumulador_heiht, top, width, heiht));
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

                    panel_mesas.repaint();
                    panel_mesas.revalidate();
                }

            }

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }

    public void eliminar_botones(JPanel panel) {
        panel.removeAll();
        panel.repaint();
    }

    public void cargar_centas_mesas(String idmesa) {

        FrmOutCuentasMesas frm = new FrmOutCuentasMesas((JFrame) this.getParent(), true, idmesa);
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
                setIdmesa(frm.getIdmesa());
                setNombre_mesa(frm.getNombre_mesa());
                setIdfactura(frm.getIdfactura());
                dispose();
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_areas = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel_mesas = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblAreal = new javax.swing.JLabel();
        lblMesa = new javax.swing.JLabel();
        lblCamarero = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblMesaUnir = new javax.swing.JLabel();
        btnUnir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Mesas y Areas");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panel_areas.setBackground(new java.awt.Color(255, 255, 255));
        panel_areas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel_areas.setLayout(new java.awt.GridLayout(1, 1, 3, 3));

        jPanel4.setBackground(new java.awt.Color(64, 149, 191));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Areas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(64, 149, 191));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mesas");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel4)
                .addContainerGap(357, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        panel_mesas.setBackground(new java.awt.Color(255, 255, 255));
        panel_mesas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel_mesas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(panel_mesas);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Orden", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Area :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mesa :");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Camarero :");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Total :");

        lblAreal.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblAreal.setForeground(new java.awt.Color(0, 0, 0));
        lblAreal.setText("Area :");

        lblMesa.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblMesa.setForeground(new java.awt.Color(0, 0, 0));
        lblMesa.setText("Mesa :");

        lblCamarero.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblCamarero.setForeground(new java.awt.Color(0, 0, 0));
        lblCamarero.setText("Camarero :");

        txttotal.setEditable(false);
        txttotal.setBackground(new java.awt.Color(0, 0, 0));
        txttotal.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        txttotal.setForeground(new java.awt.Color(0, 153, 51));
        txttotal.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Unir Con :");

        lblMesaUnir.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblMesaUnir.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAreal)
                    .addComponent(lblMesa))
                .addGap(109, 109, 109)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCamarero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblMesaUnir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblAreal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblMesa))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(txttotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(lblCamarero))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(lblMesaUnir))))
                        .addGap(24, 24, 24))))
        );

        btnUnir.setBackground(new java.awt.Color(0, 153, 51));
        btnUnir.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnUnir.setForeground(new java.awt.Color(255, 255, 255));
        btnUnir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/link.png"))); // NOI18N
        btnUnir.setText("Unir");
        btnUnir.setEnabled(false);
        btnUnir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUnir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                        .addContainerGap(9, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panel_areas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_areas, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUnir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(6, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed

        // TODO add your handling code here:
        setIdarea("0");
        setIdmesa("0");
        setIdfactura("0");
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void btnUnirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirActionPerformed
        // TODO add your handling code here:
        if (getIdmesa_unir().equals("") || getIdmesa_unir().equals("0")) {
            funciones.mensaje("Seleccione una mesa para unir","",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (funciones.mensajeConfirmacion("Desea Unir estas ", "", JOptionPane.YES_NO_OPTION) == 0) {
            eventoUnirMesa();
        }
       
    }//GEN-LAST:event_btnUnirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmOutUnirMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOutUnirMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOutUnirMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOutUnirMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOutUnirMesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUnir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAreal;
    private javax.swing.JLabel lblCamarero;
    private javax.swing.JLabel lblMesa;
    private javax.swing.JLabel lblMesaUnir;
    private javax.swing.JPanel panel_areas;
    private javax.swing.JPanel panel_mesas;
    private javax.swing.JButton salir;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

    public void eventoUnirMesa() {
        Map map;
        List<Map<String, Object>> map1;
        String respuesta = "";
        try {
            respuesta = webServices.buscar("\"f_mesa_principal\":\"" + getIdmesa() + "\",\"f_mesa_secundaria\":\"" + getIdmesa_unir() + "\"", "ws/set_unir_mesas");
            if (!respuesta.equals("")) {
                map = funciones.JsonToMap(respuesta);
                if (map.get("f_data").toString().equals("true")) {
                    funciones.mensaje("Mesas Unidas correctamente","",JOptionPane.WARNING_MESSAGE);
                    dispose();
                }
                
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }

    /**
     * @return the idmesa_unir
     */
    public String getIdmesa_unir() {
        return idmesa_unir;
    }

    /**
     * @param idmesa_unir the idmesa_unir to set
     */
    public void setIdmesa_unir(String idmesa_unir) {
        this.idmesa_unir = idmesa_unir;
    }
}
