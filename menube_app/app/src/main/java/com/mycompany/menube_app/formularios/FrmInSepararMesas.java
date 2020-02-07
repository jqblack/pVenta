package com.mycompany.menube_app.formularios;

import FuncionesGenerales.Funciones;
import FuncionesGenerales.WebServices;
import java.awt.Font;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class FrmInSepararMesas extends javax.swing.JDialog {

    /**
     * @return the contenedor1
     */
    public TableModel getContenedor1() {
        return contenedor1;
    }

    /**
     * @param contenedor1 the contenedor1 to set
     */
    public void setContenedor1(TableModel contenedor1) {
        this.contenedor1 = contenedor1;
    }

    /**
     * @return the contenedor2
     */
    public TableModel getContenedor2() {
        return contenedor2;
    }

    /**
     * @param contenedor2 the contenedor2 to set
     */
    public void setContenedor2(TableModel contenedor2) {
        this.contenedor2 = contenedor2;
    }

    /**
     * Creates new form FrmInSepararMesas
     */
    private List<Map<String, Object>> ArrayListComponentes = new ArrayList();

    List<Map<String, Object>> getArrayListComponentes() {
        return ArrayListComponentes;
    }

    public void setArrayListComponentes(List<Map<String, Object>> ArrayListComponentes) {
        this.ArrayListComponentes = ArrayListComponentes;
    }

    private Boolean si_no;

    Boolean getSi_no() {
        return si_no;
    }

    void setSi_no(Boolean si_no) {
        this.si_no = si_no;
    }

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

    private TableModel contenedor1;
    private TableModel contenedor2;

    Funciones funciones = new Funciones();
    WebServices webServices = new WebServices();

    public FrmInSepararMesas() {
        initComponents();
    }

    public FrmInSepararMesas(java.awt.Frame parent, boolean modal, TableModel modelo, List<Map<String, Object>> list) {
        super(parent, modal);
        initComponents();
        for (Map<String, Object> tupla : list) {
            ArrayListComponentes.add(tupla);

        }

        btnagregar.setIcon(new ImageIcon(getClass().getResource("/doble_flecha_derecha.png")));
        btnquitar.setIcon(new ImageIcon(getClass().getResource("/doble_flecha_izquierda.png")));

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);

        /**
         * ********************TABLA Productos***************************
         */
        tabla_productos.removeColumn(tabla_productos.getColumnModel().getColumn(11));
        tabla_productos.removeColumn(tabla_productos.getColumnModel().getColumn(10));
        tabla_productos.removeColumn(tabla_productos.getColumnModel().getColumn(9));
        tabla_productos.removeColumn(tabla_productos.getColumnModel().getColumn(8));
        tabla_productos.removeColumn(tabla_productos.getColumnModel().getColumn(7));
        tabla_productos.removeColumn(tabla_productos.getColumnModel().getColumn(6));
        tabla_productos.removeColumn(tabla_productos.getColumnModel().getColumn(0));

        // tabla_datos.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        tabla_productos.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tabla_productos.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);

        tabla_productos.getTableHeader().setFont(new Font("Tahoma", 1, 16));
        tabla_productos.setRowHeight(40);

        /**
         * ********************TABLA Productos***************************
         */
        tabla_productos_separados.removeColumn(tabla_productos_separados.getColumnModel().getColumn(11));
        tabla_productos_separados.removeColumn(tabla_productos_separados.getColumnModel().getColumn(10));
        tabla_productos_separados.removeColumn(tabla_productos_separados.getColumnModel().getColumn(9));
        tabla_productos_separados.removeColumn(tabla_productos_separados.getColumnModel().getColumn(8));
        tabla_productos_separados.removeColumn(tabla_productos_separados.getColumnModel().getColumn(7));
        tabla_productos_separados.removeColumn(tabla_productos_separados.getColumnModel().getColumn(6));
        tabla_productos_separados.removeColumn(tabla_productos_separados.getColumnModel().getColumn(0));

        // tabla_datos.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        tabla_productos_separados.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tabla_productos_separados.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);

        tabla_productos_separados.getTableHeader().setFont(new Font("Tahoma", 1, 16));
        tabla_productos_separados.setRowHeight(40);

        llenar_tabla(modelo);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panel_mesas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_productos_separados = new javax.swing.JTable();
        btnquitar = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        entrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(64, 149, 191));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Separar Mesas");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        tabla_productos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
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
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla_productos);
        if (tabla_productos.getColumnModel().getColumnCount() > 0) {
            tabla_productos.getColumnModel().getColumn(0).setResizable(false);
        }

        tabla_productos_separados.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tabla_productos_separados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "CANT", "REF", "DESCRIPCION", "PRECIO", "IMPORTE", "TAX", "ID", "LIBRE_ITBIS", "TAX_PRODUCTO", "COMANDAS", "IDCOMANDAS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_productos_separados);
        if (tabla_productos_separados.getColumnModel().getColumnCount() > 0) {
            tabla_productos_separados.getColumnModel().getColumn(0).setResizable(false);
        }

        btnquitar.setBackground(new java.awt.Color(255, 0, 0));
        btnquitar.setForeground(new java.awt.Color(255, 255, 255));
        btnquitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitarActionPerformed(evt);
            }
        });

        btnagregar.setBackground(new java.awt.Color(64, 149, 191));
        btnagregar.setForeground(new java.awt.Color(255, 255, 255));
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_mesasLayout = new javax.swing.GroupLayout(panel_mesas);
        panel_mesas.setLayout(panel_mesasLayout);
        panel_mesasLayout.setHorizontalGroup(
            panel_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mesasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnquitar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnagregar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_mesasLayout.setVerticalGroup(
            panel_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mesasLayout.createSequentialGroup()
                .addGroup(panel_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_mesasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(panel_mesasLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnquitar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        salir.setBackground(new java.awt.Color(255, 0, 0));
        salir.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        entrar.setBackground(new java.awt.Color(64, 149, 191));
        entrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        entrar.setForeground(new java.awt.Color(255, 255, 255));
        entrar.setText("Separar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(panel_mesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_mesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(entrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        setSi_no(false);
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        // TODO add your handling code here:

        eventoSeparar();
    }//GEN-LAST:event_entrarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:

        eventoAgregar();


    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnquitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitarActionPerformed
        // TODO add your handling code here:
        eventoQuitar();
    }//GEN-LAST:event_btnquitarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInSepararMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInSepararMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInSepararMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInSepararMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInSepararMesas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnquitar;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel_mesas;
    private javax.swing.JButton salir;
    private javax.swing.JTable tabla_productos;
    private javax.swing.JTable tabla_productos_separados;
    // End of variables declaration//GEN-END:variables

    public void llenar_tabla(TableModel model) {

        DefaultTableModel defaultTableModel = (DefaultTableModel) model;
        DefaultTableModel defaultTableModelTablaProductos = (DefaultTableModel) tabla_productos.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {

            Object[] datos = new Object[]{
                defaultTableModel.getValueAt(i, 0),
                defaultTableModel.getValueAt(i, 1),
                defaultTableModel.getValueAt(i, 2),
                defaultTableModel.getValueAt(i, 3),
                defaultTableModel.getValueAt(i, 4),
                defaultTableModel.getValueAt(i, 5),
                defaultTableModel.getValueAt(i, 6),
                defaultTableModel.getValueAt(i, 7),
                defaultTableModel.getValueAt(i, 8),
                defaultTableModel.getValueAt(i, 9),
                defaultTableModel.getValueAt(i, 10),
                defaultTableModel.getValueAt(i, 11)
            };
            defaultTableModelTablaProductos.addRow(datos);

        }

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
                    System.err.println("Separar Mesas ==> calcular arraylist ==>" + e.getMessage());
                }

            }
        }

        setTotal_tax_extra(tx);
        setTotal_extra(t);
        
        
    }

    public void eventoAgregar() {
        if (tabla_productos.getSelectedRow() == -1) {
            funciones.mensaje("Seleccione un articulo", "", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel defaultTableModel = (DefaultTableModel) tabla_productos.getModel();
        DefaultTableModel defaultTableModelTablaProductosSeparados = (DefaultTableModel) tabla_productos_separados.getModel();

        Object[] rowData = new Object[]{
            defaultTableModel.getValueAt(tabla_productos.getSelectedRow(), 0),
            defaultTableModel.getValueAt(tabla_productos.getSelectedRow(), 1),
            defaultTableModel.getValueAt(tabla_productos.getSelectedRow(), 2),
            defaultTableModel.getValueAt(tabla_productos.getSelectedRow(), 3),
            defaultTableModel.getValueAt(tabla_productos.getSelectedRow(), 4),
            defaultTableModel.getValueAt(tabla_productos.getSelectedRow(), 5),
            defaultTableModel.getValueAt(tabla_productos.getSelectedRow(), 6),
            defaultTableModel.getValueAt(tabla_productos.getSelectedRow(), 7),
            defaultTableModel.getValueAt(tabla_productos.getSelectedRow(), 8),
            defaultTableModel.getValueAt(tabla_productos.getSelectedRow(), 9),
            defaultTableModel.getValueAt(tabla_productos.getSelectedRow(), 10),
            defaultTableModel.getValueAt(tabla_productos.getSelectedRow(), 11)
        };
        defaultTableModelTablaProductosSeparados.addRow(rowData);

        defaultTableModel.removeRow(tabla_productos.getSelectedRow());
    }

    public void eventoQuitar() {
        if (tabla_productos_separados.getSelectedRow() == -1) {
            funciones.mensaje("Seleccione un articulo", "", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel defaultTableModelTablaProductosSeparados = (DefaultTableModel) tabla_productos_separados.getModel();
        DefaultTableModel defaultTableModelTablaProductos = (DefaultTableModel) tabla_productos.getModel();

        Object[] rowData = new Object[]{
            defaultTableModelTablaProductosSeparados.getValueAt(tabla_productos_separados.getSelectedRow(), 0),
            defaultTableModelTablaProductosSeparados.getValueAt(tabla_productos_separados.getSelectedRow(), 1),
            defaultTableModelTablaProductosSeparados.getValueAt(tabla_productos_separados.getSelectedRow(), 2),
            defaultTableModelTablaProductosSeparados.getValueAt(tabla_productos_separados.getSelectedRow(), 3),
            defaultTableModelTablaProductosSeparados.getValueAt(tabla_productos_separados.getSelectedRow(), 4),
            defaultTableModelTablaProductosSeparados.getValueAt(tabla_productos_separados.getSelectedRow(), 5),
            defaultTableModelTablaProductosSeparados.getValueAt(tabla_productos_separados.getSelectedRow(), 6),
            defaultTableModelTablaProductosSeparados.getValueAt(tabla_productos_separados.getSelectedRow(), 7),
            defaultTableModelTablaProductosSeparados.getValueAt(tabla_productos_separados.getSelectedRow(), 8),
            defaultTableModelTablaProductosSeparados.getValueAt(tabla_productos_separados.getSelectedRow(), 9),
            defaultTableModelTablaProductosSeparados.getValueAt(tabla_productos_separados.getSelectedRow(), 10),
            defaultTableModelTablaProductosSeparados.getValueAt(tabla_productos_separados.getSelectedRow(), 11)
        };
        defaultTableModelTablaProductos.addRow(rowData);

        defaultTableModelTablaProductosSeparados.removeRow(tabla_productos_separados.getSelectedRow());
    }

    public void eventoSeparar() {

        if (tabla_productos_separados.getRowCount() > 0) {
            if (tabla_productos.getRowCount() <= 0) {

                funciones.mensaje("No puede dejar la factura original sin productos", "", JOptionPane.ERROR_MESSAGE);
                return;
            }

        } else {
            funciones.mensaje("Debe agregar por lo menos un articulo a separar", "", JOptionPane.ERROR_MESSAGE);
            return;
        }

        evento_eliminar_lista();
        setSi_no(true);
        setContenedor1(tabla_productos.getModel());
        setContenedor2(tabla_productos_separados.getModel());

        dispose();
    }

    public void evento_eliminar_lista() {

        List<Map<String, Object>> list_aux = new ArrayList<>();
        for (int b = 0; b < tabla_productos.getRowCount(); b++) {

            for (Map<String, Object> tupla : ArrayListComponentes) {
                String varible_numero_fila = ((DefaultTableModel) tabla_productos.getModel()).getValueAt(b, 0).toString();
                if (varible_numero_fila.equals(tupla.get("fnumerofila").toString())) {
                    list_aux.add(tupla);
                }
            }
        }

        for (Map<String, Object> tupla : list_aux) {
            ArrayListComponentes.remove(tupla);
        }
        calcular_ArrayList();
        
    }

}
