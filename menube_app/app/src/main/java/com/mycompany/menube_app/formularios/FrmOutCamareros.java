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
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author Usuario
 */
public class FrmOutCamareros extends javax.swing.JDialog {

    public String getNombre_camarero() {
        return nombre_camarero;
    }

    public void setNombre_camarero(String nombre_camarero) {
        this.nombre_camarero = nombre_camarero;
    }

    public String getIdcamarero() {
        return idcamarero;
    }

    /**
     * Creates new form FrmOutCamareros
     */
    public void setIdcamarero(String idcamarero) {
        this.idcamarero = idcamarero;
    }

    private String nombre_camarero = "";
    private String idcamarero = "";

    WebServices webServices = new WebServices();
    Funciones funciones = new Funciones();

    public FrmOutCamareros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        parametro.requestFocus();
    }

    public FrmOutCamareros() {
        initComponents();
    }

    public void llenar_camareros() {

        int contador = 1;
        int acumulador_heiht = 0;
        int top = 0;
        int i = 0;
        //int width = 210;
        int columnas = 3;
        int width = panel_camareros.getWidth() / columnas;
        int heiht = 110;

        panel_camareros.removeAll();
        Map map;
        List<Map<String, Object>> map1;
        String respuesta = "";
        try {

            // ((GridBagLayout) panel_camareros.getLayout()).
            respuesta = webServices.buscar("\"f_parametro\":\"" + parametro.getText() + "\"", "ws/get_camareros_by_parametros");
            if (!respuesta.equals("")) {

                map = funciones.JsonToMap(respuesta);
                map1 = funciones.JsonToListMap(map.get("f_data"));

                for (Map tupla : map1) {

                    JButton button1 = new JButton();
                    button1.setText(tupla.get("f_nombre").toString() + " " + tupla.get("f_apellido").toString());
                    button1.setBackground(funciones.getRandomColor());
                    button1.setFont(new Font("Tahoma", 1, 18));
                    button1.setName(tupla.get("f_idrecord").toString());
                    button1.setIcon(new ImageIcon(getClass().getResource("/camarero.png")));
                    button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            //llenar_mesas_por_areas(button1.getName());
                            setIdcamarero(button1.getName());
                            setNombre_camarero(button1.getText());
                            dispose();
                        }
                    });

                    if (contador == 1 && i == 0) {
                        panel_camareros.add(button1, new AbsoluteConstraints(0, 0, width, heiht));
                        acumulador_heiht += width;
                    } else {
                        panel_camareros.add(button1, new AbsoluteConstraints(acumulador_heiht, top, width, heiht));
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

                }

                panel_camareros.repaint();
                panel_camareros.revalidate();

            }

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        parametro = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel_camareros = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Camareros");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(64, 149, 191));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Camareros");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(577, 577, 577))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Parametro :");

        parametro.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        parametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parametroActionPerformed(evt);
            }
        });
        parametro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                parametroKeyPressed(evt);
            }
        });

        buscar.setBackground(new java.awt.Color(64, 149, 191));
        buscar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(255, 0, 0));
        salir.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        panel_camareros.setBackground(new java.awt.Color(255, 255, 255));
        panel_camareros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel_camareros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_camareros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(panel_camareros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(798, 798, 798)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parametro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(parametro, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void parametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parametroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parametroActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        if (parametro.getText().equals("")) {
            funciones.mensaje("Digite el parametro a buscar ..", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        llenar_camareros();
    }//GEN-LAST:event_buscarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:

        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void parametroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_parametroKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == 10) {
            buscar.doClick();
        }
    }//GEN-LAST:event_parametroKeyPressed

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
            java.util.logging.Logger.getLogger(FrmOutCamareros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOutCamareros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOutCamareros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOutCamareros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOutCamareros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_camareros;
    private javax.swing.JTextField parametro;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
