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
public class FrmOutCuentasMesas extends javax.swing.JDialog {

    /**
     * Creates new form FrmOutAreas
     */
    private String idfactura;
    private String idmesa;

    private String nombre_mesa = "";

    public String getNombre_mesa() {
        return nombre_mesa;
    }

    public void setNombre_mesa(String nombre_mesa) {
        this.nombre_mesa = nombre_mesa;
    }

    public String getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(String idfactura) {
        this.idfactura = idfactura;
    }

    public String getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(String idmesa) {
        this.idmesa = idmesa;
    }
    WebServices webServices = new WebServices();
    Funciones funciones = new Funciones();

    public FrmOutCuentasMesas() {
        initComponents();
    }

    public FrmOutCuentasMesas(java.awt.Frame parent, boolean modal, String idmesa) {
        super(parent, modal);
        initComponents();
        llenar_mesas_por_areas(idmesa);
    }

    public void llenar_mesas_por_areas(String idmesa) {

        int contador = 1;
        int acumulador_heiht = 0;
        int top = 0;
        int i = 0;
        int columnas = 3;
        int width = panel_ceuntas.getWidth() / columnas;
        int heiht = 150;

        eliminar_botones(panel_ceuntas);
        Map map;
        List<Map<String, Object>> map1;
        String respuesta = "";
        try {
            respuesta = webServices.buscar("\"f_idmesa\":\"" + idmesa + "\"", "ws/get_cuentas_mesas");
            if (!respuesta.equals("")) {

                map = funciones.JsonToMap(respuesta);
                map1 = funciones.JsonToListMap(map.get("f_data"));

                for (Map tupla : map1) {

                    JButton boton = new JButton();
                    String dato = "<html>Mesa #:" + tupla.get("f_descripcion").toString().toUpperCase()
                            + "<br/>Area :" + tupla.get("f_nombre_area").toString().toUpperCase();
                    dato = dato + "<br/>Camarero : " + tupla.get("f_camarero").toString().toUpperCase()
                            + "<br/>Monto : " + '$' + tupla.get("f_total");
                    dato = dato + "<br/>Cuenta : " + tupla.get("f_cuenta").toString().toUpperCase();
                    dato = dato + "</html>";
                    boton.setText(dato);
                    boton.setBackground(funciones.getRandomColor());
                    boton.setFont(new Font("Tahoma", 1, 18));
                    boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/report.png")));
                    boton.setName(tupla.get("f_idmensa").toString() + ';' + tupla.get("f_idfactura").toString() + ";" + tupla.get("f_descripcion").toString().toUpperCase());
                    boton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String[] vector = boton.getName().split(";");
                            setIdmesa(vector[0]);
                            setIdfactura(vector[1]);
                            setNombre_mesa(vector[2]);
                            dispose();
                        }
                    });
                    if (contador == 1 && i == 0) {
                        panel_ceuntas.add(boton, new AbsoluteConstraints(0, 0, width, heiht));
                        acumulador_heiht += width;
                    } else {
                        panel_ceuntas.add(boton, new AbsoluteConstraints(acumulador_heiht, top, width, heiht));
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
                    panel_ceuntas.repaint();
                    panel_ceuntas.revalidate();
                  
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel_ceuntas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Mesas y Areas");
        setBackground(new java.awt.Color(255, 255, 255));

        salir.setBackground(new java.awt.Color(255, 0, 0));
        salir.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(64, 149, 191));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cuentas");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(512, 512, 512)
                .addComponent(jLabel4)
                .addContainerGap(530, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        panel_ceuntas.setBackground(new java.awt.Color(255, 255, 255));
        panel_ceuntas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel_ceuntas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(panel_ceuntas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed

        // TODO add your handling code here:
        setIdmesa("0");
        setIdfactura("0");
        setNombre_mesa("0");
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
            java.util.logging.Logger.getLogger(FrmOutCuentasMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOutCuentasMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOutCuentasMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOutCuentasMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOutCuentasMesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_ceuntas;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
