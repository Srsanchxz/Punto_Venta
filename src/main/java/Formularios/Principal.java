/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.awt.BorderLayout;

/**
 *
 * @author Dani PC
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
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
        btnVentasEfectuadas = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnAgregarProductos = new javax.swing.JButton();
        btnListadoProductos = new javax.swing.JButton();
        btnEfectuarVenta = new javax.swing.JButton();
        btnModificarProductos = new javax.swing.JButton();
        pnlPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        btnVentasEfectuadas.setText("Ventas Efectuadas");
        btnVentasEfectuadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasEfectuadasActionPerformed(evt);
            }
        });

        jButton5.setText("jButton1");

        btnAgregarProductos.setText("Agregar Productos");
        btnAgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductosActionPerformed(evt);
            }
        });

        btnListadoProductos.setText("Listado de Productos");
        btnListadoProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoProductosActionPerformed(evt);
            }
        });

        btnEfectuarVenta.setText("Efectuar Venta ");
        btnEfectuarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfectuarVentaActionPerformed(evt);
            }
        });

        btnModificarProductos.setText("Modificar Productos");
        btnModificarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVentasEfectuadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAgregarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnListadoProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(btnModificarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEfectuarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(jButton5)
                    .addContainerGap(81, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(btnVentasEfectuadas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListadoProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEfectuarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(365, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(99, 99, 99)))
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEfectuarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfectuarVentaActionPerformed
        pnlEfectuarVenta p5= new pnlEfectuarVenta();
        p5.setSize(616, 464);
        p5.setLocation(5,5);
        
        pnlPrincipal.removeAll();
        pnlPrincipal.add(p5, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();  
    }//GEN-LAST:event_btnEfectuarVentaActionPerformed

    private void btnVentasEfectuadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasEfectuadasActionPerformed
        
        pnlVentasEfectuadas p1= new pnlVentasEfectuadas();
        p1.setSize(616, 464);
        p1.setLocation(5,5);
        
        pnlPrincipal.removeAll();
        pnlPrincipal.add(p1, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
        
        
       
    }//GEN-LAST:event_btnVentasEfectuadasActionPerformed

    private void btnListadoProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoProductosActionPerformed
    pnlListadoProductos p2= new pnlListadoProductos();
        p2.setSize(616, 464);
        p2.setLocation(5,5);
        
        pnlPrincipal.removeAll();
        pnlPrincipal.add(p2, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_btnListadoProductosActionPerformed

    private void btnAgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductosActionPerformed
    pnlAgregarProductos p3= new pnlAgregarProductos();
        p3.setSize(616, 464);
        p3.setLocation(5,5);
        
        pnlPrincipal.removeAll();
        pnlPrincipal.add(p3, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();            // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProductosActionPerformed

    private void btnModificarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductosActionPerformed
        pnlModificarProductos p4= new pnlModificarProductos();
        p4.setSize(616, 464);
        p4.setLocation(5,5);
        
        pnlPrincipal.removeAll();
        pnlPrincipal.add(p4, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();  
    }//GEN-LAST:event_btnModificarProductosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProductos;
    private javax.swing.JButton btnEfectuarVenta;
    private javax.swing.JButton btnListadoProductos;
    private javax.swing.JButton btnModificarProductos;
    private javax.swing.JButton btnVentasEfectuadas;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}