/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.*;
import Model.*;
import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel Medel Lozada
 */
public class EmpleadoFrame extends javax.swing.JFrame {
     DefaultTableModel modelo;       
    /**
     * Creates new form Empleado
     */
    public EmpleadoFrame() {
        initComponents();
        //Para poner al centro JPanel
        setLocationRelativeTo(null);
        setResizable(false); 
        //Color JFrame
        this.getContentPane().setBackground(new Color(254,255,255));
        
        btn_Actualizar.setEnabled(false);
        btn_Eliminar.setEnabled(false);
        btn_agregar.setEnabled(true);
        cargarDatosTabla();
    }
    Empleado emp= new Empleado();
    Dao model= new Dao();    
    
    public void cargarDatosTabla(){
        jtable_Empleado.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
         jtable_Empleado.getTableHeader().setOpaque(false);         
         jtable_Empleado.getTableHeader().setBackground(new Color(32,136,203));
         jtable_Empleado.getTableHeader().setForeground(new Color(00,00,00));
        String[] titulos = {"ID","Nombre", "Apellido","Telefono"};
        modelo = new DefaultTableModel(null, titulos);
        String[] fila = new String[4];

        for(Empleado a:Dao.listarEmpleado()){                          
            fila[0]=a.getIdEmpleado();
            fila[1]=a.getNomEmpleado();
            fila[2]=a.getApeEmpleado();                 
            fila[3]=a.getTelefono();
             modelo.addRow(fila);
        }
        jtable_Empleado.setModel(modelo);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_Empleado = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Telefono = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        txt_idEmpleado = new javax.swing.JLabel();
        btn_menu1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 400));

        jtable_Empleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtable_Empleado.setFocusable(false);
        jtable_Empleado.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jtable_Empleado.setRowHeight(25);
        jtable_Empleado.setSelectionBackground(new java.awt.Color(0, 255, 0));
        jtable_Empleado.setShowVerticalLines(false);
        jtable_Empleado.getTableHeader().setReorderingAllowed(false);
        jtable_Empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_EmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_Empleado);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Telefono");

        btn_agregar.setBackground(new java.awt.Color(153, 153, 255));
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ic_input_add.png"))); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_Actualizar.setBackground(new java.awt.Color(153, 153, 255));
        btn_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Refresh.png"))); // NOI18N
        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        btn_Eliminar.setBackground(new java.awt.Color(153, 153, 255));
        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ic_delete.png"))); // NOI18N
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_menu1.setBackground(new java.awt.Color(153, 153, 255));
        btn_menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/home-house.png"))); // NOI18N
        btn_menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2)
                                        .addComponent(txt_Apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(txt_nombre)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_idEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(btn_menu1))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_idEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_agregar)
                    .addComponent(btn_menu1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtable_EmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_EmpleadoMouseClicked
        // TODO add your handling code here:       
        String idEmpleado=(String)jtable_Empleado.getValueAt(jtable_Empleado.getSelectedRow(), 0);
        String nombre = (String) jtable_Empleado.getValueAt(jtable_Empleado.getSelectedRow(), 1);
        String apellido = (String) jtable_Empleado.getValueAt(jtable_Empleado.getSelectedRow(), 2);
        String  telefono = (String) jtable_Empleado.getValueAt(jtable_Empleado.getSelectedRow(), 3);
        
        txt_idEmpleado.setText(idEmpleado);
        txt_nombre.setText(nombre);
        txt_Apellido.setText(apellido);
        txt_Telefono.setText(telefono);
        btn_Actualizar.setEnabled(true);
        btn_Eliminar.setEnabled(true);
        btn_agregar.setEnabled(false);
    }//GEN-LAST:event_jtable_EmpleadoMouseClicked

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
        if (txt_nombre.getText().isEmpty() || txt_Apellido.getText().isEmpty() || txt_Telefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Verefique sus datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            //cargarSucursal();
        }
        else{
        try{
        Empleado a= new Empleado();
        a.setNomEmpleado(txt_nombre.getText());
        a.setApeEmpleado(txt_Apellido.getText());
        a.setTelefono(txt_Telefono.getText());        
        
        Dao.registrarEmpleado(a);
        JOptionPane.showMessageDialog(null, "Empleado registrado");
        txt_nombre.setText("");
        txt_Apellido.setText("");
        txt_Telefono.setText("");
        txt_idEmpleado.setText("");
        cargarDatosTabla();
        btn_Actualizar.setEnabled(false);
        btn_Eliminar.setEnabled(false);
        btn_agregar.setEnabled(true);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
         // TODO add your handling code here:
        if (txt_nombre.getText().isEmpty() || txt_Apellido.getText().isEmpty() || txt_Telefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Verefique sus datos", "ERROR", JOptionPane.ERROR_MESSAGE);            
        }
        else{
        try{
        Empleado a= new Empleado();
        a.setNomEmpleado(txt_nombre.getText());
        a.setApeEmpleado(txt_Apellido.getText());        
        a.setTelefono(txt_Telefono.getText());                
        a.setIdEmpleado(txt_idEmpleado.getText());                
        Dao.actEmpleado(a);
        JOptionPane.showMessageDialog(null, "Empleado Actualizado");
        txt_nombre.setText("");
        txt_Apellido.setText("");
        txt_Telefono.setText("");
        txt_idEmpleado.setText("");
        cargarDatosTabla();
        btn_Actualizar.setEnabled(false);
        btn_Eliminar.setEnabled(false);
        btn_agregar.setEnabled(true);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        }
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        // TODO add your handling code here:
        if (txt_nombre.getText().isEmpty() || txt_Apellido.getText().isEmpty() || txt_Telefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Verefique sus datos", "ERROR", JOptionPane.ERROR_MESSAGE);            
        }
        else{
        try{
        Empleado a= new Empleado();                
        a.setIdEmpleado(txt_idEmpleado.getText());                
        Dao.eliminarEmpleado(a);
        JOptionPane.showMessageDialog(null, "Empleado Eliminado");
        txt_nombre.setText("");
        txt_Apellido.setText("");
        txt_Telefono.setText("");
        txt_idEmpleado.setText("");
        cargarDatosTabla();
        btn_Actualizar.setEnabled(false);
        btn_Eliminar.setEnabled(false);
        btn_agregar.setEnabled(true);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu1ActionPerformed
        // TODO add your handling code here:
        dispose();
        dashboardJFrame obj= new dashboardJFrame();
        obj.setVisible(true);
    }//GEN-LAST:event_btn_menu1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_menu1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable_Empleado;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JLabel txt_idEmpleado;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}