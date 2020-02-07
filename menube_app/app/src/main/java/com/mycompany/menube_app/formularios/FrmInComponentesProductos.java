/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.menube_app.formularios;

import FuncionesGenerales.Funciones;
import FuncionesGenerales.WebServices;
import java.awt.Button;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

/**
 *
 * @author Usuario
 */
public class FrmInComponentesProductos extends javax.swing.JDialog {

    
    
    
    private List<Map<String,Object>> ArrayListComponentes =new ArrayList<Map<String,Object>>();

    List<Map<String,Object>> getArrayListComponentes() {
        return ArrayListComponentes;
    }

  
    
    /**
     * Creates new form FrmInComponentesProductos
     */
    Funciones funciones = new Funciones();
    WebServices webServices = new WebServices();
    private String idproducto = "";
    private int fila=0;

    public FrmInComponentesProductos() {
        initComponents();
    }

    public FrmInComponentesProductos(java.awt.Frame parent, boolean modal, String idpro,Integer numero) {
        super(parent, modal);
        initComponents();
        setIdproducto(idpro);
        setFila(numero);
        llenar_datos();
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
        jLabel3 = new javax.swing.JLabel();
        panel_componentes = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_componentes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_agregados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_ingredientes = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnAgragarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(64, 149, 191));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Busqueda de Productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_componentes.setBackground(new java.awt.Color(255, 255, 255));
        panel_componentes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel_componentes.setLayout(new java.awt.GridLayout(1, 5, 3, 3));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Componentes");

        tabla_componentes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tabla_componentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "DESCRIPCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_componentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_componentesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_componentes);

        tabla_agregados.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tabla_agregados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "idproducto", "DESCRIPCION", "CANTIDAD", "COBRABLE", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla_agregados);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setText("Agregados");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("Ingredientes");

        tabla_ingredientes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tabla_ingredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "DESCRIPCION", "+/-"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabla_ingredientes);

        btnAceptar.setBackground(new java.awt.Color(64, 149, 191));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(255, 0, 0));
        btnsalir.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnAgragarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgragarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgragarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 177, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(btnAgragarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnsalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0))
                    .addComponent(panel_componentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_componentes, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        eventoAceptar();

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        dispose();

    }//GEN-LAST:event_btnsalirActionPerformed

    private void tabla_componentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_componentesMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            eventoAgregarAgragado(tabla_componentes.getModel().getValueAt(tabla_componentes.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_tabla_componentesMouseClicked

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        // TODO add your handling code here:

        if (tabla_agregados.getSelectedRow() == -1) {
            funciones.mensaje("Seleccione el producto a eliminar", "", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel tableModel = (DefaultTableModel) tabla_agregados.getModel();
        tableModel.removeRow(tabla_agregados.getSelectedRow());
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnAgragarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgragarProductoActionPerformed
        // TODO add your handling code here:
        eventoBuscarProducto();
    }//GEN-LAST:event_btnAgragarProductoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInComponentesProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInComponentesProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInComponentesProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInComponentesProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInComponentesProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgragarProducto;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panel_componentes;
    private javax.swing.JTable tabla_agregados;
    private javax.swing.JTable tabla_componentes;
    private javax.swing.JTable tabla_ingredientes;
    // End of variables declaration//GEN-END:variables

    public void llenar_datos() {

        btnAgragarProducto.setIcon(new ImageIcon(this.getClass().getResource("/mas.png")));
        btnEliminarProducto.setIcon(new ImageIcon(this.getClass().getResource("/menos.png")));
        //eliminamos datos de la tabla_componentes
        tabla_componentes.removeColumn(tabla_componentes.getColumnModel().getColumn(0));

        //creamos el modelo para la tabla componentes
        DefaultTableModel tableModel = new DefaultTableModel(null, new String[]{"id", "idproducto", "DESCRIPCION", "CANTIDAD", "COBRABLE", "PRECIOS"}) {
            public Class getColumnClass(int c) {
                switch (c) {
                    case 4:
                        return Boolean.class;
                    default:
                        return Object.class;
                }
            }

            boolean[] canEdit = new boolean[]{
                false, false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }

        };
        tabla_agregados.setModel(tableModel);

        //eliminamos datos de la tabla_agregados
        tabla_agregados.removeColumn(tabla_agregados.getColumnModel().getColumn(0));
        tabla_agregados.removeColumn(tabla_agregados.getColumnModel().getColumn(0));

        //creamos el modelo para la tabla componentes
        DefaultTableModel tableModel1 = new DefaultTableModel(null, new String[]{"id", "DESCRIPCION", "+/-"}) {
            public Class getColumnClass(int c) {
                switch (c) {
                    case 2:
                        return Boolean.class;
                    default:
                        return Object.class;
                }
            }

            boolean[] canEdit = new boolean[]{
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }

        };
        tabla_ingredientes.setModel(tableModel1);

        //eliminamos datos de la tabla_ingredientes
        tabla_ingredientes.removeColumn(tabla_ingredientes.getColumnModel().getColumn(0));

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        tabla_agregados.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);

        tabla_ingredientes.getTableHeader().setFont(new Font("Tahoma", 1, 14));
        tabla_componentes.getTableHeader().setFont(new Font("Tahoma", 1, 14));
        tabla_agregados.getTableHeader().setFont(new Font("Tahoma", 1, 14));

        tabla_ingredientes.setRowHeight(30);
        tabla_agregados.setRowHeight(30);
        tabla_componentes.setRowHeight(30);

        //llenamos los componetes
        buscar_componentes();
        buscar_ingredientes();

    }

    public void buscar_componentes() {

        Map map;
        List<Map<String, Object>> map1;
        String respuesta = "";
        try {

            // ((GridBagLayout) panel_camareros.getLayout()).
            respuesta = webServices.buscar("\"f_idrecord\":\"" + getIdproducto() + "\"", "ws/get_componentes_producto_by_producto");
            if (!respuesta.equals("")) {

                map = funciones.JsonToMap(respuesta);
                map1 = funciones.JsonToListMap(map.get("f_data"));

                ((GridLayout) panel_componentes.getLayout()).setColumns(map1.size());

                for (Map tupla : map1) {
                    JButton btnComponente = new JButton();
                    btnComponente.setName(tupla.get("f_idrecord").toString());
                    btnComponente.setText(tupla.get("f_name").toString());
                    btnComponente.setBackground(funciones.getRandomColor());
                    btnComponente.setFont(new Font("Tahoma", 1, 16));
                    btnComponente.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            buscar_componentes_opciones(btnComponente.getName());
                        }
                    });

                    panel_componentes.add(btnComponente);
                    panel_componentes.revalidate();
                    panel_componentes.repaint();

                }

            }

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }

    public void buscar_ingredientes() {

        Map map;
        List<Map<String, Object>> map1;
        String respuesta = "";
        try {

            // ((GridBagLayout) panel_camareros.getLayout()).
            respuesta = webServices.buscar("", "ws/get_ingredientes");
            if (!respuesta.equals("")) {

                map = funciones.JsonToMap(respuesta);
                map1 = funciones.JsonToListMap(map.get("f_data"));

                ((GridLayout) panel_componentes.getLayout()).setColumns(map1.size());

                for (Map tupla : map1) {

                    DefaultTableModel model = (DefaultTableModel) tabla_ingredientes.getModel();
                    model.addRow(new Object[]{
                        tupla.get("f_idrecord").toString(),
                        tupla.get("f_descripcion").toString(),
                        false
                    });
                }

            }

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void buscar_componentes_opciones(String idcomponente) {

        funciones.eliminar_tabla(tabla_componentes);
        Map map;
        List<Map<String, Object>> map1;
        String respuesta = "";
        try {

            // ((GridBagLayout) panel_camareros.getLayout()).
            respuesta = webServices.buscar("\"f_idrecord\":\"" + getIdproducto() + "\",\"f_idcomponente\":\"" + idcomponente + "\"", "ws/get_componentes_opciones");
            if (!respuesta.equals("")) {

                map = funciones.JsonToMap(respuesta);
                map1 = funciones.JsonToListMap(map.get("f_data"));

                for (Map tupla : map1) {

                    DefaultTableModel model = (DefaultTableModel) tabla_componentes.getModel();
                    model.addRow(new Object[]{
                        tupla.get("f_idrecord").toString(),
                        tupla.get("f_opcion").toString()
                    });

                }

            }

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }

    public Boolean verificarSiExisteEnAgragados(String id) {
        for (int i = 0; i < tabla_agregados.getRowCount(); i++) {
          
            if (tabla_agregados.getModel().getValueAt(i, 1).toString().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void eventoAgregarAgragado(String idrecord) {
        //  funciones.eliminar_tabla(tabla_componentes);
        Map map;
        List<Map<String, Object>> map1;
        String respuesta = "";
        try {

            // ((GridBagLayout) panel_camareros.getLayout()).
            respuesta = webServices.buscar("\"f_idrecord\":\"" + idrecord + "\"", "ws/get_opcion_componente_by_id");
            if (!respuesta.equals("")) {

                map = funciones.JsonToMap(respuesta);
                map1 = funciones.JsonToListMap(map.get("f_data"));

                for (Map tupla : map1) {

                    if (verificarSiExisteEnAgragados(tupla.get("f_idproducto_componente").toString())) {
                        funciones.mensaje("Este producto ya esta agregado", "", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    DefaultTableModel model = (DefaultTableModel) tabla_agregados.getModel();
                    model.addRow(new Object[]{
                        tupla.get("f_idrecord").toString(),
                        tupla.get("f_idproducto_componente").toString(),
                        tupla.get("f_opcion").toString(),
                        tupla.get("f_cantidad").toString(),
                        false,
                       // funciones.Round(tupla.get("f_precio").toString(), 2)
                        funciones.Round("0", 2)
                    });

                }

            }

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void eventoBuscarProducto() {
        FrmOutBuscarProductos frm = new FrmOutBuscarProductos((Frame) this.getParent(), true);
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
                String idproducto = frm.getIdproducto();
                if (!idproducto.equals("") || !idproducto.equals("0")) {

                    if (verificarSiExisteEnAgragados(idproducto)) {
                        funciones.mensaje("Este producto ya esta agregado", "", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    agregarProductosGrid(idproducto);
                }

            }
        });
    }

    public void agregarProductosGrid(String idrecord) {
        Map map;
        List<Map<String, Object>> map1;
        String respuesta = "";
        try {
            respuesta = webServices.buscar("\"f_idproducto\":\"" + idrecord + "\",\"f_idarea\":\"" + 0 + "\"", "ws/get_productos_by_id");
            if (!respuesta.equals("")) {
                map = funciones.JsonToMap(respuesta);
                map1 = funciones.JsonToListMap(map.get("f_data"));

                if (map1.size() > 0) {

                    String idpro = map1.get(0).get("f_idrecord").toString();
                    String descirpcion = map1.get(0).get("f_descripcion").toString();
                    String referencia = map1.get(0).get("f_referencia").toString();
                    Double precio_producto = Double.valueOf(map1.get(0).get("f_precio").toString());
                    Double tax_producto = Double.valueOf(map1.get(0).get("f_tax").toString());

                    DefaultTableModel model = (DefaultTableModel) tabla_agregados.getModel();

                    model.addRow(new Object[]{
                        -1,
                        idpro,
                        descirpcion,
                        1 + "",
                        true,
                        funciones.Round(precio_producto, 2)
                    });

                }

            }
        } catch (Exception e) {
            System.err.println("Punto venta ==> " + e.getMessage());
        }

    }
    public void   eventoAceptar(){
        if(tabla_agregados.getRowCount() <=0)
        {
            funciones.mensaje("Debe agregar algun producto como agregado","",JOptionPane.WARNING_MESSAGE);
            return;
        }
        //recorremos la tabla de agregados
        for (int i = 0; i < tabla_agregados.getRowCount(); i++) {
            TableModel model = tabla_agregados.getModel();
            Map<String,Object> map=new HashMap<String, Object>();
            map.put("fIdprodcutoComponente",model.getValueAt(i,1).toString().toLowerCase());
            map.put("fIngrediente",1);
            map.put("fCantidad",funciones.parseDouble(model.getValueAt(i,3).toString()));
            map.put("fCobrable",model.getValueAt(i,4));
            map.put("fMontoCobrar",funciones.parseDouble(model.getValueAt(i,5).toString()));
            map.put("fidproducto",getIdproducto());
            map.put("fnumerofila",getFila());
            ArrayListComponentes.add(map);
        }
        for (int i=0;i<tabla_ingredientes.getRowCount();i++) {
            TableModel model = tabla_ingredientes.getModel();
            Boolean valor = Boolean.valueOf(model.getValueAt(i,2).toString());
            if (valor)
            {
                Map<String,Object> map=new HashMap<String, Object>();
                map.put("fIdprodcutoComponente",model.getValueAt(i,0).toString().toLowerCase());
                map.put("fIngrediente",2);
                map.put("fCantidad",funciones.parseDouble(1+""));
                map.put("fCobrable",false);
                map.put("fMontoCobrar",funciones.parseDouble(0+""));
                map.put("fidproducto",getIdproducto());
                map.put("fnumerofila",getFila());
                ArrayListComponentes.add(map);
            }

       }
       dispose();
    }

    /**
     * @return the idproducto
     */
    public String getIdproducto() {
        return idproducto;
    }

    /**
     * @param idproducto the idproducto to set
     */
    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    /**
     * @return the fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

}
