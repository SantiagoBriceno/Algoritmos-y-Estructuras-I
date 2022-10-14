/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvaluacionNro1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class Controlador extends javax.swing.JFrame implements ActionListener{

   
    
    // Declaracion de Variables 
    Ventana1 v1 = new Ventana1();
    Ventana2 v2 = new Ventana2();
    
    public Controlador() {
        initComponents();
        this.setSize(new Dimension(1000, 750));
        this.setLocationRelativeTo(this);
        jButton1.setVisible(false);
        contenedor.add(v1);
        
        siguiente.addActionListener(this);
        jButton1.addActionListener(this);
                                                              
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        ubicacionSiguiente = new javax.swing.JPanel();
        siguiente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        contenedor.setForeground(new java.awt.Color(240, 240, 240));
        contenedor.setLayout(new java.awt.BorderLayout());

        ubicacionSiguiente.setOpaque(false);
        ubicacionSiguiente.setPreferredSize(new java.awt.Dimension(577, 50));

        siguiente.setText("Click Aqui para seguir");
        siguiente.setOpaque(false);
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        jButton1.setText("Reiniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ubicacionSiguienteLayout = new javax.swing.GroupLayout(ubicacionSiguiente);
        ubicacionSiguiente.setLayout(ubicacionSiguienteLayout);
        ubicacionSiguienteLayout.setHorizontalGroup(
            ubicacionSiguienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ubicacionSiguienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ubicacionSiguienteLayout.setVerticalGroup(
            ubicacionSiguienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ubicacionSiguienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ubicacionSiguienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siguiente)
                    .addComponent(jButton1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        contenedor.add(ubicacionSiguiente, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(contenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siguienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Controlador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Controlador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Controlador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controlador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Controlador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton siguiente;
    private javax.swing.JPanel ubicacionSiguiente;
    // End of variables declaration//GEN-END:variables

    
    //ActionPerformance propio de boton Siguiente
    @Override
    
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();
        if(evt.equals(siguiente)){
            v1.setVisible(false);
            contenedor.add(v2);
            v2.setVisible(true);
            siguiente.setEnabled(false);
            contenedor.validate();
            jButton1.setVisible(true);
            
         }else if(evt.equals(jButton1)){
             
             contenedor.add(new Ventana2());
             v2.setVisible(false);
        }
        
    }

    
}