/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Almacen;

import static Almacen.appRopa.inventarioDeRopa;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago
 */
public class frmConsultar extends javax.swing.JFrame {


    public frmConsultar() {
        initComponents();
        //CARGAR LOS DATOS DE LA REFERENCIA EN EL FORMULARIO
        txtReferencia.setText(inventarioDeRopa.get(appRopa.indiceAConsultar).getReferencia());
        txtArticulo.setText(inventarioDeRopa.get(appRopa.indiceAConsultar).getArticulo());// solo se arrastro
        txtCosto.setText(String.valueOf(inventarioDeRopa.get(appRopa.indiceAConsultar).getValorCompra()));
        txtValorDeVenta.setText(String.valueOf(inventarioDeRopa.get(appRopa.indiceAConsultar).getValorVenta())); // se cambio de double a string
        
        if(inventarioDeRopa.get(appRopa.indiceAConsultar).isDisponible()){// si esta seleccionado true su no falso
            chkDisponible.setSelected(true);
        }else{
            chkDisponible.setSelected(false);
        }
        
        switch(inventarioDeRopa.get(appRopa.indiceAConsultar).getTalla()){
            case "XS":
                rbXs.setSelected(true);
                break;
            case "s":
                rbS.setSelected(true);
                break;
            case "XL":
                rbXl.setSelected(true);
                break;
            case "M":
                rbM.setSelected(true);
                break;
            case "L":
                rbL.setSelected(true);
                break;
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTalla = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtReferencia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtArticulo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        rbXs = new javax.swing.JRadioButton();
        rbM = new javax.swing.JRadioButton();
        rbL = new javax.swing.JRadioButton();
        rbS = new javax.swing.JRadioButton();
        rbXl = new javax.swing.JRadioButton();
        chkDisponible = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        txtValorDeVenta = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        chkManual = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INVENTARIO");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Referencia:");

        txtReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReferenciaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Articulo:");

        txtArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArticuloActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Talla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(102, 102, 255))); // NOI18N

        buttonGroupTalla.add(rbXs);
        rbXs.setText("XS");

        buttonGroupTalla.add(rbM);
        rbM.setText("M");

        buttonGroupTalla.add(rbL);
        rbL.setText("L");

        buttonGroupTalla.add(rbS);
        rbS.setText("S");

        buttonGroupTalla.add(rbXl);
        rbXl.setText("XL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbXs)
                    .addComponent(rbM))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbL)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbXl)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbXs)
                    .addComponent(rbS)
                    .addComponent(rbXl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbM)
                    .addComponent(rbL))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        chkDisponible.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkDisponible.setText("Disponible");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Valor de Venta:");

        txtValorDeVenta.setEnabled(false);
        txtValorDeVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorDeVentaActionPerformed(evt);
            }
        });
        txtValorDeVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorDeVentaKeyTyped(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        chkManual.setText("¿Desea agregar manualmente el valor de venta ?");
        chkManual.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkManualItemStateChanged(evt);
            }
        });
        chkManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkManualActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Costo:");

        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(btnRegresar)
                            .addGap(18, 18, 18)
                            .addComponent(btnEliminar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtValorDeVenta))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(95, 95, 95)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(chkManual, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(chkDisponible))
                    .addComponent(txtReferencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtValorDeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar)
                    .addComponent(chkManual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnEliminar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Consultar por referencias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        frmIniciar fi = new frmIniciar();
        fi.setVisible(true);
        fi.setTitle("iniciar");
        fi.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void chkManualItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkManualItemStateChanged
        // TODO add your handling code here:
        if(!txtValorDeVenta.isEnabled()){//si no esta habilitado
            txtValorDeVenta.setEnabled(true);//habilitamos el txt
            txtValorDeVenta.requestFocus();//ubicar el cursor
        }else{//si esta habilitado
            txtValorDeVenta.setEnabled(false);//desabilisto el txt
            txtValorDeVenta.setText("");
        
        }
        
    }//GEN-LAST:event_chkManualItemStateChanged

    private void txtValorDeVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorDeVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorDeVentaActionPerformed

    private void chkManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkManualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkManualActionPerformed

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();//cada vez que presione la trcla va a guardar en caracter
        if(caracter <'0' || caracter > '9'){// preguntamos si no esta entre el 0 y 9
            evt.consume();//desecha el evento lo que almacena el evento
        }
    }//GEN-LAST:event_txtCostoKeyTyped

    private void txtValorDeVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorDeVentaKeyTyped
        // TODO add your handling code here:
               // TODO add your handling code here:
        char caracter = evt.getKeyChar();//cada vez que presione la trcla va a guardar en caracter
        if(caracter <'0' || caracter > '9'){
            evt.consume();//desecha el evento lo que almacena el evento
        }
    }//GEN-LAST:event_txtValorDeVentaKeyTyped

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        String referencia = "", articulo="", talla= "";
        double costo = 0,valorVenta = 0;
        boolean disponible = false, setearValorVenta=false, guardar = true, refExiste =false;
        
        //Validamos que los txtbox no esten vacios 
        if(txtReferencia.getText().isEmpty() || txtArticulo.getText().isEmpty() || txtCosto.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debes llenar todos los datos", "Agregar prenda", JOptionPane.WARNING_MESSAGE);
            guardar = false;
        }else{
            referencia = txtReferencia.getText();
            articulo = txtArticulo.getText();
            costo = Double.parseDouble(txtCosto.getText());
                    
        }
        //VALIDAR SI SE HABILITO EL VALOR DE VENTA MANUAL Y SI EL TXT VENTA NO ESTA VACIO
        if (chkManual.isSelected() && txtValorDeVenta.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "El valor de venta no puede estar vacio", "porcentaje de venta", JOptionPane.WARNING_MESSAGE);
            guardar = false; //variable bandera que puede verficar que si puede guardar
        }else if (chkManual.isSelected() && !txtValorDeVenta.getText().isEmpty()){
            valorVenta = Double.parseDouble(txtValorDeVenta.getText());
            setearValorVenta = true;
        }else if(!chkManual.isSelected()){
            valorVenta = 0.0;
            setearValorVenta = false;
        }
        //validamos que este seleccionado una talla
        if (rbXs.isSelected()){
            talla = "XS";
        }else if(rbS.isSelected()){
            talla = "S";
        }else if(rbM.isSelected()){
            talla = "M";
        }else if(rbL.isSelected()){
            talla = "L";
        }else if(rbXl.isSelected()){
            talla = "XL";
        }else{
            JOptionPane.showMessageDialog(this, "debes seleccionar una tabla", "selecciona", JOptionPane.WARNING_MESSAGE);
            guardar = false;
        }
        //VALIDAMOS SI ESTA DISPONIBLE LA PRENDA O NO
        if(chkDisponible.isSelected()){
            disponible = true;
        }
        //VALIDAMOS SI GUARDAR ES VERDADERO Y CUAL CONSTRUCTOR UTILIZAR
        if(guardar){
            int indice = -1;//PARA QUE NO ESTE POSICIONADO EN NINGUNA PARTE DEL ARRAY LIST
            for(int i = 0; i<inventarioDeRopa.size(); i++){
                if(inventarioDeRopa.get(i).getReferencia().equalsIgnoreCase(referencia)){// si son iguales sin importar mayus o minus
                //si lo encuentra
                //JOptionPane.showMessageDialog(this, "la referencia" + referencia + "ya existe por favor cambielo" );
                refExiste = true; 
                indice = i;
                //txtReferencia.requestFocus();//ubique el cursor en el txtreferencia
                break;// se sale del ciclo si lo encuentra
                }// CIERRA EL IF
            }//CIERRA EL CICLO
            if(refExiste){
                inventarioDeRopa.get(indice).setArticulo(articulo);
                inventarioDeRopa.get(indice).setValorCompra(costo);
                inventarioDeRopa.get(indice).setTalla(talla);
                inventarioDeRopa.get(indice).setDisponible(disponible);
                //DEFINIR CUAL SETTER VAMOS UTILIZAR PARA MODIFICAR EL VALOR DE VENTA
                if (setearValorVenta){
                    inventarioDeRopa.get(indice).setValorVentaManual(valorVenta);
                }else{
                    inventarioDeRopa.get(indice).SetValorVentaAutomatico(costo);
                }
                JOptionPane.showMessageDialog(this, "Las dos fueron actualizadas");
                frmIniciar fi = new frmIniciar();
                fi.setVisible(true);
                fi.setTitle("iniciar");
                fi.setLocationRelativeTo(null);
                dispose();
            }
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReferenciaActionPerformed
       
        
    }//GEN-LAST:event_txtReferenciaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(this, "Estas seguro de eliminar el articulo","Eliminar articulo",JOptionPane.YES_NO_OPTION);//YES NO OPTIONS ES PARA DECIRME SI O NO
        if (respuesta == 0){
            inventarioDeRopa.remove(appRopa.indiceAConsultar);
            JOptionPane.showMessageDialog(this,"El articulo fue eliminado del inventario");
            appRopa.indiceAConsultar = - 1;
            appRopa.referenciaAConsultar = "";
            frmIniciar fi = new frmIniciar();
            fi.setVisible(true);
            //fi.setTitle("iniciar");
            fi.setLocationRelativeTo(null);
            dispose();
        }else{
            JOptionPane.showMessageDialog(this,"No se realizaron cambios, LCDTM");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArticuloActionPerformed

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
            java.util.logging.Logger.getLogger(frmConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConsultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.ButtonGroup buttonGroupTalla;
    private javax.swing.JCheckBox chkDisponible;
    private javax.swing.JCheckBox chkManual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbL;
    private javax.swing.JRadioButton rbM;
    private javax.swing.JRadioButton rbS;
    private javax.swing.JRadioButton rbXl;
    private javax.swing.JRadioButton rbXs;
    private javax.swing.JTextField txtArticulo;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtReferencia;
    private javax.swing.JTextField txtValorDeVenta;
    // End of variables declaration//GEN-END:variables
}
