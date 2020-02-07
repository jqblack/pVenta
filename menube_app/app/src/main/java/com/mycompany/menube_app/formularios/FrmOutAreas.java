/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.menube_app.formularios;

import FuncionesGenerales.Funciones;
import FuncionesGenerales.WebServices;
import FuncionesGenerales.datos_preferencias;
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
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author Usuario
 */
public class FrmOutAreas extends javax.swing.JDialog {

    private String nombre_area = "";
    private String nombre_mesa = "";

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

    public FrmOutAreas() {
        initComponents();
        llenar_areas();
        llenar_mesas_por_areas("0");
    }

    public FrmOutAreas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        llenar_areas();
        llenar_mesas_por_areas("0");
        if (datos_preferencias.solo_mesa) {
            System.err.println("Hola mundos es solo mesa");
        }
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
        int columnas = 10;
        int separacion = 3;
        int width = panel_mesas.getWidth() / columnas;
        width = width - separacion;
        int heiht = 100;
       

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
                    boton.setText("<html>" + tupla.get("f_descripcion").toString() + "</html>");
//                    boton.setText("<html>" + tupla.get("f_descripcion").toString() + "<br />Cuentas :" + tupla.get("f_cuentas").toString() + "</html>");
                    if ((int) tupla.get("f_cuentas") > 0) {
                        boton.setBackground(Color.green);
                        boton.setForeground(Color.WHITE);
                    } else {

                        boton.setBackground(new Color(64, 149, 191));
                        boton.setForeground(Color.BLACK);
                    }
                    boton.setFont(new Font("Tahoma", 1, 25));
                    //boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dinner-table.png")));
                    boton.setName(tupla.get("f_idrecord").toString() + ";" + tupla.get("f_cuentas").toString() + ";" + tupla.get("f_descripcion").toString()+";"+tupla.get("f_id_area").toString()+";"+tupla.get("f_nombre_area").toString());
                    boton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (Integer.valueOf(boton.getName().split(";")[1]) > 0) {
                                setIdarea(boton.getName().split(";")[3]);
                                setNombre_area(boton.getName().split(";")[4]);
                                cargar_centas_mesas(boton.getName().split(";")[0]);
                            } else {
                                setIdmesa(boton.getName().split(";")[0]);
                                setNombre_mesa(boton.getName().split(";")[2]);
                                setIdarea(boton.getName().split(";")[3]);
                                setNombre_area(boton.getName().split(";")[4]);
                                dispose();
                            }
                        }
                    });
                    if (contador == 1 && i == 0) {
                        panel_mesas.add(boton, new AbsoluteConstraints(0, 0, width, heiht));
                        acumulador_heiht += width + separacion;
                    } else {
                        panel_mesas.add(boton, new AbsoluteConstraints(acumulador_heiht, top, width, heiht));
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

        panel_areas = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel_mesas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Mesas y Areas");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        panel_areas.setBackground(new java.awt.Color(255, 255, 255));
        panel_areas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel_areas.setLayout(new java.awt.GridLayout(1, 1, 3, 3));

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
                .addContainerGap(79, Short.MAX_VALUE))
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
                .addGap(438, 438, 438)
                .addComponent(jLabel4)
                .addContainerGap(384, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_mesas.setBackground(new java.awt.Color(255, 255, 255));
        panel_mesas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel_mesas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(panel_mesas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panel_areas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_areas, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(FrmOutAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOutAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOutAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOutAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOutAreas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_areas;
    private javax.swing.JPanel panel_mesas;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
