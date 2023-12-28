
package Almacen;

import static Almacen.appRopa.inventarioDeRopa;
import Menu.frmMenu;
import botones.frmformulario;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistema.empleadosGUI.frmEmpleados;


public class frmIniciar extends javax.swing.JFrame {


    public frmIniciar() { // inicializar componentes de la tabla trayendo lo de constructor e importando appRopa
        initComponents();// AGREGAMOS PRENDAS AL ARRAY LIST DEL INVENTARIO
        if(inventarioDeRopa.isEmpty()){
        inventarioDeRopa.add(new Ropa("001"," camiseta cuello v",25000,true,"XS"));
        inventarioDeRopa.add(new Ropa("002"," camiseta cuello o",23500,true,"M"));
        inventarioDeRopa.add(new Ropa("003"," pantalon corto",32000,false,"XS"));
        inventarioDeRopa.add(new Ropa("004"," camiseta cuello o",25000,true,"S"));
        }
        //ESTO ES PARA CUANDO SEÑALEMOS EL INVENTARIO SE VAYA PARA EL TXTREFERENCIA
        tblInventario.addMouseListener(new MouseAdapter() { // CREANDO UNA SUBCLASE DE ADDMOUSELISTENER
        @Override//AYUDA A DETECTAR ERRORES
        public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        int filaSeleccionada = tblInventario.getSelectedRow(); // Obtener la fila seleccionada
        if (filaSeleccionada != -1) { // Si se selecciona una fila
            String referencia = tblInventario.getValueAt(filaSeleccionada, 0).toString(); // Obtener el ID de la fila seleccionada, asumiendo que está en la columna 0
            txtReferencia.setText(referencia); // Establecer el ID en el campo de texto
        }
    }
});
        //DEFINIR EL MODELO INGRESAR LAS COLUMNAS DE LA TABLA
        DefaultTableModel modelo = new DefaultTableModel();
        //DEFINIR LOS TITULOS DE CADA COLUMNA DE LA TABLA}
        
        modelo.addColumn("REF");
        modelo.addColumn("ARTICULO");
        modelo.addColumn("TALLA");
        modelo.addColumn("DISP");
        modelo.addColumn("COSTO");
        modelo.addColumn("PRECIO");
        //LLENAMOS LA TABLA
        for(Ropa prenda:inventarioDeRopa){
            Object[] fila = new Object[6]; //ARREGLO DE TIPO GENERICO
            //fila[0] = prenda.getPorcentaje();
            fila[0] = prenda.getReferencia();
            fila[1] = prenda.getArticulo();
            fila[2] = prenda.getTalla();
            fila[3] = prenda.isDisponible(); // COMO ES BOLEANO ES IS
            fila[4] = prenda.getValorCompra();
            fila[5] = prenda.getValorVenta();
            
            modelo.addRow(fila); //AGREGAMOS CADA FILA AL MODELO
        }//CIERRA EL FOR
        tblInventario.setModel(modelo);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtReferencia = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mnuiAgregar = new javax.swing.JMenuItem();
        mnuiConsultar = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jMenuItem3.setText("jMenuItem3");

        jMenu1.setText("File");
        jMenuBar5.add(jMenu1);

        jMenu9.setText("Edit");
        jMenuBar5.add(jMenu9);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        jPanel1.setBackground(new java.awt.Color(204, 255, 51));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add_1.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search_1.png"))); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        tblInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblInventario);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("consulta por referencia:");

        txtReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReferenciaActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnConsultar)
                .addGap(0, 150, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAgregar)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jMenu2.setText("opciones");

        mnuiAgregar.setText("Agregar");
        mnuiAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiAgregarActionPerformed(evt);
            }
        });
        jMenu2.add(mnuiAgregar);

        mnuiConsultar.setText("Consultar");
        mnuiConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiConsultarActionPerformed(evt);
            }
        });
        jMenu2.add(mnuiConsultar);

        jMenuBar1.add(jMenu2);

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        frmAgregar fa = new frmAgregar();
        fa.setVisible(true);
        fa.setTitle("Agregar prenda");
        fa.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void mnuiAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiAgregarActionPerformed
        // TODO add your handling code here:
        frmAgregar fa = new frmAgregar();
        fa.setVisible(true);
        fa.setTitle("Agregar prenda");
        //fa.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_mnuiAgregarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        String referencia;
        boolean encontrado = false;
        if (txtReferencia.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"debes escribir una referencia","referencia",JOptionPane.WARNING_MESSAGE);
            txtReferencia.requestFocus();
        }else{
            referencia = txtReferencia.getText();
            for (int i = 0; i < inventarioDeRopa.size(); i++) {
                if(inventarioDeRopa.get(i).getReferencia().equalsIgnoreCase(referencia)){//PARA PREGUNTAR SI LA REFERENCIA DEL ARRAY EN LA POSICION I ES IGUAL A REFERENCIA
                    appRopa.indiceAConsultar = i; // i es el indice
                    appRopa.referenciaAConsultar = referencia;
                    encontrado = true;
                    break;
                }//CIERRA EL IF
                
            }//CIERRA EL FOR
            if (!encontrado){
                JOptionPane.showMessageDialog(this,"la referencia no se encuentra"+referencia+", no se encuentra en la lista.");
                txtReferencia.requestFocus();//PARA QUE EL CURSOR SE UBIQUE AHI
            }else{
                frmConsultar fc = new frmConsultar();
                fc.setVisible(true);
                fc.setTitle("Consultar por referencia");
                fc.setLocationRelativeTo(fc);
                dispose();
            }
        }
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void mnuiConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiConsultarActionPerformed
        // TODO add your handling code here:
        String referencia;
        boolean encontrado = false;
        if (txtReferencia.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"debes escribir una referencia","referencia",JOptionPane.WARNING_MESSAGE);
            txtReferencia.requestFocus();
        }else{
            referencia = txtReferencia.getText();
            for (int i = 0; i < inventarioDeRopa.size(); i++) {
                if(inventarioDeRopa.get(i).getReferencia().equalsIgnoreCase(referencia)){//PARA PREGUNTAR SI LA REFERENCIA DEL ARRAY EN LA POSICION I ES IGUAL A REFERENCIA
                    appRopa.indiceAConsultar = i; // i es el indice
                    appRopa.referenciaAConsultar = referencia;
                    encontrado = true;
                    break;
                }//CIERRA EL IF
                
            }//CIERRA EL FOR
            if (!encontrado){
                JOptionPane.showMessageDialog(this,"la referencia no se encuentra"+referencia+", no se encuentra en la lista.");
                txtReferencia.requestFocus();//PARA QUE EL CURSOR SE UBIQUE AHI
            }else{
                frmConsultar fc = new frmConsultar();
                fc.setVisible(true);
                fc.setTitle("Consultar por referencia");
                fc.setLocationRelativeTo(fc);
                dispose();
            }
        }
    }//GEN-LAST:event_mnuiConsultarActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void txtReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReferenciaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        frmMenu fm = new frmMenu();
        fm.setVisible(true);
        fm.setTitle("iniciar");
        fm.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed


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
            java.util.logging.Logger.getLogger(frmIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmIniciar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mnuSalir;
    private javax.swing.JMenuItem mnuiAgregar;
    private javax.swing.JMenuItem mnuiConsultar;
    private javax.swing.JTable tblInventario;
    private javax.swing.JTextField txtReferencia;
    // End of variables declaration//GEN-END:variables
}
