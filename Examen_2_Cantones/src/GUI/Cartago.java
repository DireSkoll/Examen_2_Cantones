/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Manuel Arias & Justin Bogantes
 */
public class Cartago extends javax.swing.JFrame {

    /**
     * Creates new form Cartago
     */
    public Cartago() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        cantonTurrialba = new javax.swing.JButton();
        cantonJimenez = new javax.swing.JButton();
        cantonParaiso = new javax.swing.JButton();
        cantonCartago = new javax.swing.JButton();
        cantonElGuarco = new javax.swing.JButton();
        cantonLaUnion = new javax.swing.JButton();
        cantonOreamuno = new javax.swing.JButton();
        cantonAlvarado = new javax.swing.JButton();
        fondoCartago = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cantonTurrialba.setText("305");
        cantonTurrialba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonTurrialbaActionPerformed(evt);
            }
        });
        jPanel1.add(cantonTurrialba, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, -1));

        cantonJimenez.setText("304");
        cantonJimenez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonJimenezActionPerformed(evt);
            }
        });
        jPanel1.add(cantonJimenez, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        cantonParaiso.setText("302");
        cantonParaiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonParaisoActionPerformed(evt);
            }
        });
        jPanel1.add(cantonParaiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, -1));

        cantonCartago.setText("301");
        cantonCartago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonCartagoActionPerformed(evt);
            }
        });
        jPanel1.add(cantonCartago, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        cantonElGuarco.setText("308");
        cantonElGuarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonElGuarcoActionPerformed(evt);
            }
        });
        jPanel1.add(cantonElGuarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        cantonLaUnion.setText("303");
        cantonLaUnion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonLaUnionActionPerformed(evt);
            }
        });
        jPanel1.add(cantonLaUnion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        cantonOreamuno.setText("307");
        cantonOreamuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonOreamunoActionPerformed(evt);
            }
        });
        jPanel1.add(cantonOreamuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        cantonAlvarado.setText("306");
        cantonAlvarado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonAlvaradoActionPerformed(evt);
            }
        });
        jPanel1.add(cantonAlvarado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        fondoCartago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/mapa-CR-cartago.png"))); // NOI18N
        jPanel1.add(fondoCartago, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantonOreamunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonOreamunoActionPerformed
        CantonUI ui = new CantonUI();
        ui.getlblNombre().setText("Oreamuno");
        ui.getLblCodigo().setText("307");
        ui.getLblPoblacion().setText("47.550" + " personas");
        ui.getLblAlfabetizacion().setText("97,9" + "%");
        ui.getLblConsumoElectrico().setText("886,3" + " kWh");
        ui.getLblMatriculaPrimaria().setText("100,0" + "%");
        ui.getLblMatriculaSecundaria().setText("96,7" + "%");
        ui.getLblMatriculaSuperior().setText("" + "%");
        ui.getLblTerritorio().setText("202,3" + " km cuadrados");
        ui.setVisible(true);
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/Cantones/307.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ui.getlblFoto().getWidth(), ui.getlblFoto().getHeight(), Image.SCALE_DEFAULT));
        ui.getlblFoto().setIcon(icono);
    }//GEN-LAST:event_cantonOreamunoActionPerformed

    private void cantonLaUnionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonLaUnionActionPerformed
        CantonUI ui = new CantonUI();
        ui.getlblNombre().setText("La Union");
        ui.getLblCodigo().setText("303");
        ui.getLblPoblacion().setText("105.194" + " personas");
        ui.getLblAlfabetizacion().setText("99,1" + "%");
        ui.getLblConsumoElectrico().setText("847,4" + " kWh");
        ui.getLblMatriculaPrimaria().setText("100.0" + "%");
        ui.getLblMatriculaSecundaria().setText("100.0" + "%");
        ui.getLblMatriculaSuperior().setText("" + "%");
        ui.getLblTerritorio().setText("44,8" + " km cuadrados");
        ui.setVisible(true);
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/Cantones/303.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ui.getlblFoto().getWidth(), ui.getlblFoto().getHeight(), Image.SCALE_DEFAULT));
        ui.getlblFoto().setIcon(icono);
    }//GEN-LAST:event_cantonLaUnionActionPerformed

    private void cantonAlvaradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonAlvaradoActionPerformed
        CantonUI ui = new CantonUI();
        ui.getlblNombre().setText("Alvarado");
        ui.getLblCodigo().setText("306");
        ui.getLblPoblacion().setText("14.715" + " personas");
        ui.getLblAlfabetizacion().setText("97,3" + "%");
        ui.getLblConsumoElectrico().setText("717,8" + " kWh");
        ui.getLblMatriculaPrimaria().setText("100.0" + "%");
        ui.getLblMatriculaSecundaria().setText("100.0" + "%");
        ui.getLblMatriculaSuperior().setText("" + "%");
        ui.getLblTerritorio().setText("81,1" + " km cuadrados");
        ui.setVisible(true);
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/Cantones/306.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ui.getlblFoto().getWidth(), ui.getlblFoto().getHeight(), Image.SCALE_DEFAULT));
        ui.getlblFoto().setIcon(icono);
    }//GEN-LAST:event_cantonAlvaradoActionPerformed

    private void cantonTurrialbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonTurrialbaActionPerformed
        CantonUI ui = new CantonUI();
        ui.getlblNombre().setText("Turrialba");
        ui.getLblCodigo().setText("305");
        ui.getLblPoblacion().setText("73.276" + " personas");
        ui.getLblAlfabetizacion().setText("95,7" + "%");
        ui.getLblConsumoElectrico().setText("649,9" + " kWh");
        ui.getLblMatriculaPrimaria().setText("100.0" + "%");
        ui.getLblMatriculaSecundaria().setText("93,7" + "%");
        ui.getLblMatriculaSuperior().setText("" + "%");
        ui.getLblTerritorio().setText("1642,7" + " km cuadrados");
        ui.setVisible(true);
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/Cantones/305.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ui.getlblFoto().getWidth(), ui.getlblFoto().getHeight(), Image.SCALE_DEFAULT));
        ui.getlblFoto().setIcon(icono);
    }//GEN-LAST:event_cantonTurrialbaActionPerformed

    private void cantonElGuarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonElGuarcoActionPerformed
        CantonUI ui = new CantonUI();
        ui.getlblNombre().setText("El Guarco");
        ui.getLblCodigo().setText("308");
        ui.getLblPoblacion().setText("43.882" + " personas");
        ui.getLblAlfabetizacion().setText("99,0" + "%");
        ui.getLblConsumoElectrico().setText("853,8" + " kWh");
        ui.getLblMatriculaPrimaria().setText("100.0" + "%");
        ui.getLblMatriculaSecundaria().setText("100.0" + "%");
        ui.getLblMatriculaSuperior().setText("" + "%");
        ui.getLblTerritorio().setText("167,7" + " km cuadrados");
        ui.setVisible(true);
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/Cantones/308.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ui.getlblFoto().getWidth(), ui.getlblFoto().getHeight(), Image.SCALE_DEFAULT));
        ui.getlblFoto().setIcon(icono);
    }//GEN-LAST:event_cantonElGuarcoActionPerformed

    private void cantonCartagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonCartagoActionPerformed
        CantonUI ui = new CantonUI();
        ui.getlblNombre().setText("Cartago");
        ui.getLblCodigo().setText("301");
        ui.getLblPoblacion().setText("812,3" + " personas");
        ui.getLblAlfabetizacion().setText("98,5" + "%");
        ui.getLblConsumoElectrico().setText("812,3" + " kWh");
        ui.getLblMatriculaPrimaria().setText("100.0" + "%");
        ui.getLblMatriculaSecundaria().setText("100.0" + "%");
        ui.getLblMatriculaSuperior().setText("" + "%");
        ui.getLblTerritorio().setText("287,8" + " km cuadrados");
        ui.setVisible(true);
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/Cantones/301.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ui.getlblFoto().getWidth(), ui.getlblFoto().getHeight(), Image.SCALE_DEFAULT));
        ui.getlblFoto().setIcon(icono);
    }//GEN-LAST:event_cantonCartagoActionPerformed

    private void cantonJimenezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonJimenezActionPerformed
        CantonUI ui = new CantonUI();
        ui.getlblNombre().setText("Jimenez");
        ui.getLblCodigo().setText("304");
        ui.getLblPoblacion().setText("16.028" + " personas");
        ui.getLblAlfabetizacion().setText("96,6" + "%");
        ui.getLblConsumoElectrico().setText("561,7" + " kWh");
        ui.getLblMatriculaPrimaria().setText("100,0" + "%");
        ui.getLblMatriculaSecundaria().setText("87,3" + "%");
        ui.getLblMatriculaSuperior().setText("" + "%");
        ui.getLblTerritorio().setText("286,4" + " km cuadrados");
        ui.setVisible(true);
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/Cantones/304.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ui.getlblFoto().getWidth(), ui.getlblFoto().getHeight(), Image.SCALE_DEFAULT));
        ui.getlblFoto().setIcon(icono);
    }//GEN-LAST:event_cantonJimenezActionPerformed

    private void cantonParaisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonParaisoActionPerformed
        CantonUI ui = new CantonUI();
        ui.getlblNombre().setText("Paraiso");
        ui.getLblCodigo().setText("302");
        ui.getLblPoblacion().setText("59.861" + " personas");
        ui.getLblAlfabetizacion().setText("98,0" + "%");
        ui.getLblConsumoElectrico().setText("765,1" + " kWh");
        ui.getLblMatriculaPrimaria().setText("100,0" + "%");
        ui.getLblMatriculaSecundaria().setText("95,2" + "%");
        ui.getLblMatriculaSuperior().setText("" + "%");
        ui.getLblTerritorio().setText("411,9" + " km cuadrados");
        ui.setVisible(true);
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/Cantones/302.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ui.getlblFoto().getWidth(), ui.getlblFoto().getHeight(), Image.SCALE_DEFAULT));
        ui.getlblFoto().setIcon(icono);
    }//GEN-LAST:event_cantonParaisoActionPerformed

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
            java.util.logging.Logger.getLogger(Cartago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cartago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cartago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cartago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cartago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cantonAlvarado;
    private javax.swing.JButton cantonCartago;
    private javax.swing.JButton cantonElGuarco;
    private javax.swing.JButton cantonJimenez;
    private javax.swing.JButton cantonLaUnion;
    private javax.swing.JButton cantonOreamuno;
    private javax.swing.JButton cantonParaiso;
    private javax.swing.JButton cantonTurrialba;
    private javax.swing.JLabel fondoCartago;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
