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
public class Puntarenas extends javax.swing.JFrame {

    /**
     * Creates new form Puntarenas
     */
    public Puntarenas() {
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
        cantonPuntarenas = new javax.swing.JButton();
        cantonMontesDeOro = new javax.swing.JButton();
        cantonEsparza = new javax.swing.JButton();
        cantonGarabito = new javax.swing.JButton();
        cantonParrita = new javax.swing.JButton();
        cantonAguirre = new javax.swing.JButton();
        cantonOsa = new javax.swing.JButton();
        cantonBuenosAires = new javax.swing.JButton();
        cantonCotoBrus = new javax.swing.JButton();
        cantonGolfito = new javax.swing.JButton();
        cantonCorredores = new javax.swing.JButton();
        fondoPuntarenas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cantonPuntarenas.setText("601");
        cantonPuntarenas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonPuntarenasActionPerformed(evt);
            }
        });
        jPanel1.add(cantonPuntarenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        cantonMontesDeOro.setText("604");
        cantonMontesDeOro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonMontesDeOroActionPerformed(evt);
            }
        });
        jPanel1.add(cantonMontesDeOro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        cantonEsparza.setText("602");
        cantonEsparza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonEsparzaActionPerformed(evt);
            }
        });
        jPanel1.add(cantonEsparza, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        cantonGarabito.setText("611");
        cantonGarabito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonGarabitoActionPerformed(evt);
            }
        });
        jPanel1.add(cantonGarabito, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        cantonParrita.setText("609");
        cantonParrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonParritaActionPerformed(evt);
            }
        });
        jPanel1.add(cantonParrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        cantonAguirre.setText("606");
        cantonAguirre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonAguirreActionPerformed(evt);
            }
        });
        jPanel1.add(cantonAguirre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        cantonOsa.setText("605");
        cantonOsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonOsaActionPerformed(evt);
            }
        });
        jPanel1.add(cantonOsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, -1, -1));

        cantonBuenosAires.setText("603");
        cantonBuenosAires.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonBuenosAiresActionPerformed(evt);
            }
        });
        jPanel1.add(cantonBuenosAires, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, -1, -1));

        cantonCotoBrus.setText("608");
        cantonCotoBrus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonCotoBrusActionPerformed(evt);
            }
        });
        jPanel1.add(cantonCotoBrus, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, -1, -1));

        cantonGolfito.setText("607");
        cantonGolfito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonGolfitoActionPerformed(evt);
            }
        });
        jPanel1.add(cantonGolfito, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, -1, -1));

        cantonCorredores.setText("610");
        cantonCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonCorredoresActionPerformed(evt);
            }
        });
        jPanel1.add(cantonCorredores, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, -1, -1));

        fondoPuntarenas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/mapa-CR-puntarenas.png"))); // NOI18N
        jPanel1.add(fondoPuntarenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void cantonMontesDeOroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonMontesDeOroActionPerformed
        CantonUI ui = new CantonUI();
        ui.getlblNombre().setText("Montes de Oro");
        ui.getLblCodigo().setText("604");
        ui.getLblPoblacion().setText("13.421" + " personas");
        ui.getLblAlfabetizacion().setText("96.5" + "%");
        ui.getLblConsumoElectrico().setText("724.7" + " kWh");
        ui.getLblMatriculaPrimaria().setText("100.0" + "%");
        ui.getLblMatriculaSecundaria().setText("94.1" + "%");
        ui.getLblMatriculaSuperior().setText("95.6" + "%");
        ui.getLblTerritorio().setText("244.8" + " km cuadrados");
        ui.setVisible(true);
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/Cantones/604.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ui.getlblFoto().getWidth(), ui.getlblFoto().getHeight(), Image.SCALE_DEFAULT));
        ui.getlblFoto().setIcon(icono);
    }//GEN-LAST:event_cantonMontesDeOroActionPerformed

    private void cantonPuntarenasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonPuntarenasActionPerformed
        CantonUI ui = new CantonUI();
        ui.getlblNombre().setText("Puntarenas");
        ui.getLblCodigo().setText("601");
        ui.getLblPoblacion().setText("128.501" + " personas");
        ui.getLblAlfabetizacion().setText("97.2" + "%");
        ui.getLblConsumoElectrico().setText("700.6" + " kWh");
        ui.getLblMatriculaPrimaria().setText("100.0" + "%");
        ui.getLblMatriculaSecundaria().setText("83.3" + "%");
        ui.getLblMatriculaSuperior().setText("87.4" + "%");
        ui.getLblTerritorio().setText("1842.3" + " km cuadrados");
        ui.setVisible(true);
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/Cantones/601.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ui.getlblFoto().getWidth(), ui.getlblFoto().getHeight(), Image.SCALE_DEFAULT));
        ui.getlblFoto().setIcon(icono);
    }//GEN-LAST:event_cantonPuntarenasActionPerformed

    private void cantonEsparzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonEsparzaActionPerformed
        CantonUI ui = new CantonUI();
        ui.getlblNombre().setText("Esparza");
        ui.getLblCodigo().setText("602");
        ui.getLblPoblacion().setText("34.862" + " personas");
        ui.getLblAlfabetizacion().setText("97.6" + "%");
        ui.getLblConsumoElectrico().setText("696.6" + " kWh");
        ui.getLblMatriculaPrimaria().setText("81.7" + "%");
        ui.getLblMatriculaSecundaria().setText("100.0" + "%");
        ui.getLblMatriculaSuperior().setText("95.4" + "%");
        ui.getLblTerritorio().setText("216.8" + " km cuadrados");
        ui.setVisible(true);
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/Cantones/602.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ui.getlblFoto().getWidth(), ui.getlblFoto().getHeight(), Image.SCALE_DEFAULT));
        ui.getlblFoto().setIcon(icono);
    }//GEN-LAST:event_cantonEsparzaActionPerformed

    private void cantonGarabitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonGarabitoActionPerformed
        CantonUI ui = new CantonUI();
        ui.getlblNombre().setText("Garabito");
        ui.getLblCodigo().setText("611");
        ui.getLblPoblacion().setText("22.118" + " personas");
        ui.getLblAlfabetizacion().setText("98.9" + "%");
        ui.getLblConsumoElectrico().setText("714.0" + " kWh");
        ui.getLblMatriculaPrimaria().setText("91.3" + "%");
        ui.getLblMatriculaSecundaria().setText("85.0" + "%");
        ui.getLblMatriculaSuperior().setText("86.6" + "%");
        ui.getLblTerritorio().setText("316.3" + " km cuadrados");
        ui.setVisible(true);
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/Cantones/611.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ui.getlblFoto().getWidth(), ui.getlblFoto().getHeight(), Image.SCALE_DEFAULT));
        ui.getlblFoto().setIcon(icono);
    }//GEN-LAST:event_cantonGarabitoActionPerformed

    private void cantonParritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonParritaActionPerformed
        CantonUI ui = new CantonUI();
        ui.getlblNombre().setText("Parrita");
        ui.getLblCodigo().setText("609");
        ui.getLblPoblacion().setText("17.949" + " personas");
        ui.getLblAlfabetizacion().setText("95.2" + "%");
        ui.getLblConsumoElectrico().setText("632.2" + " kWh");
        ui.getLblMatriculaPrimaria().setText("100.0" + "%");
        ui.getLblMatriculaSecundaria().setText("100.0" + "%");
        ui.getLblMatriculaSuperior().setText("100.0" + "%");
        ui.getLblTerritorio().setText("478.8" + " km cuadrados");
        ui.setVisible(true);
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/Cantones/609.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ui.getlblFoto().getWidth(), ui.getlblFoto().getHeight(), Image.SCALE_DEFAULT));
        ui.getlblFoto().setIcon(icono);
    }//GEN-LAST:event_cantonParritaActionPerformed

    private void cantonAguirreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonAguirreActionPerformed
        CantonUI ui = new CantonUI();
        ui.getlblNombre().setText("Aguirre");
        ui.getLblCodigo().setText("606");
        ui.getLblPoblacion().setText("30.098" + " personas");
        ui.getLblAlfabetizacion().setText("96,9" + "%");
        ui.getLblConsumoElectrico().setText("689,8" + " kWh");
        ui.getLblMatriculaPrimaria().setText("100.0" + "%");
        ui.getLblMatriculaSecundaria().setText("100.0" + "%");
        ui.getLblMatriculaSuperior().setText("100.0" + "%");
        ui.getLblTerritorio().setText("543,8" + " km cuadrados");
        ui.setVisible(true);
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/Cantones/606.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ui.getlblFoto().getWidth(), ui.getlblFoto().getHeight(), Image.SCALE_DEFAULT));
        ui.getlblFoto().setIcon(icono);
    }//GEN-LAST:event_cantonAguirreActionPerformed

    private void cantonBuenosAiresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonBuenosAiresActionPerformed
        CantonUI ui = new CantonUI();
        ui.getlblNombre().setText("Buenos Aries");
        ui.getLblCodigo().setText("603");
        ui.getLblPoblacion().setText("49.397" + " personas");
        ui.getLblAlfabetizacion().setText("94,9" + "%");
        ui.getLblConsumoElectrico().setText("370,5" + " kWh");
        ui.getLblMatriculaPrimaria().setText("100.0" + "%");
        ui.getLblMatriculaSecundaria().setText("100.0" + "%");
        ui.getLblMatriculaSuperior().setText("100.0" + "%");
        ui.getLblTerritorio().setText("2384.2" + " km cuadrados");
        ui.setVisible(true);
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/Cantones/603.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ui.getlblFoto().getWidth(), ui.getlblFoto().getHeight(), Image.SCALE_DEFAULT));
        ui.getlblFoto().setIcon(icono);
    }//GEN-LAST:event_cantonBuenosAiresActionPerformed

    private void cantonOsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonOsaActionPerformed
        CantonUI ui = new CantonUI();
        ui.getlblNombre().setText("Osa");
        ui.getLblCodigo().setText("605");
        ui.getLblPoblacion().setText("30.089" + " personas");
        ui.getLblAlfabetizacion().setText("94,4" + "%");
        ui.getLblConsumoElectrico().setText("849,4" + " kWh");
        ui.getLblMatriculaPrimaria().setText("100.0" + "%");
        ui.getLblMatriculaSecundaria().setText("100.0" + "%");
        ui.getLblMatriculaSuperior().setText("100.0" + "%");
        ui.getLblTerritorio().setText("1930.2" + " km cuadrados");
        ui.setVisible(true);
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/Cantones/605.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ui.getlblFoto().getWidth(), ui.getlblFoto().getHeight(), Image.SCALE_DEFAULT));
        ui.getlblFoto().setIcon(icono);
    }//GEN-LAST:event_cantonOsaActionPerformed

    private void cantonCotoBrusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonCotoBrusActionPerformed
        CantonUI ui = new CantonUI();
        ui.getlblNombre().setText("CotoBrus");
        ui.getLblCodigo().setText("608");
        ui.getLblPoblacion().setText("43.811" + " personas");
        ui.getLblAlfabetizacion().setText("94" + "%");
        ui.getLblConsumoElectrico().setText("414.2" + " kWh");
        ui.getLblMatriculaPrimaria().setText("94.3" + "%");
        ui.getLblMatriculaSecundaria().setText("78.6" + "%");
        ui.getLblMatriculaSuperior().setText("82.6" + "%");
        ui.getLblTerritorio().setText("933.9" + " km cuadrados");
        ui.setVisible(true);
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/Cantones/608.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ui.getlblFoto().getWidth(), ui.getlblFoto().getHeight(), Image.SCALE_DEFAULT));
        ui.getlblFoto().setIcon(icono);
    }//GEN-LAST:event_cantonCotoBrusActionPerformed

    private void cantonGolfitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonGolfitoActionPerformed
        CantonUI ui = new CantonUI();
        ui.getlblNombre().setText("Golfito");
        ui.getLblCodigo().setText("607");
        ui.getLblPoblacion().setText("43.811" + " personas");
        ui.getLblAlfabetizacion().setText("94.0" + "%");
        ui.getLblConsumoElectrico().setText("414.2" + " kWh");
        ui.getLblMatriculaPrimaria().setText("94.3" + "%");
        ui.getLblMatriculaSecundaria().setText("78.6" + "%");
        ui.getLblMatriculaSuperior().setText("82.6" + "%");
        ui.getLblTerritorio().setText("933.9" + " km cuadrados");
        ui.setVisible(true);
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/Cantones/607.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ui.getlblFoto().getWidth(), ui.getlblFoto().getHeight(), Image.SCALE_DEFAULT));
        ui.getlblFoto().setIcon(icono);
    }//GEN-LAST:event_cantonGolfitoActionPerformed

    private void cantonCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonCorredoresActionPerformed
        CantonUI ui = new CantonUI();
        ui.getlblNombre().setText("Corredores");
        ui.getLblCodigo().setText("610");
        ui.getLblPoblacion().setText("48.909r" + " personas");
        ui.getLblAlfabetizacion().setText("95.8" + "%");
        ui.getLblConsumoElectrico().setText("547.3" + " kWh");
        ui.getLblMatriculaPrimaria().setText("98.2" + "%");
        ui.getLblMatriculaSecundaria().setText("92.0" + "%");
        ui.getLblMatriculaSuperior().setText("93.6" + "%");
        ui.getLblTerritorio().setText("620.6" + " km cuadrados");
        ui.setVisible(true);
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/Cantones/610.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ui.getlblFoto().getWidth(), ui.getlblFoto().getHeight(), Image.SCALE_DEFAULT));
        ui.getlblFoto().setIcon(icono);
    }//GEN-LAST:event_cantonCorredoresActionPerformed

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
            java.util.logging.Logger.getLogger(Puntarenas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Puntarenas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Puntarenas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Puntarenas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Puntarenas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cantonAguirre;
    private javax.swing.JButton cantonBuenosAires;
    private javax.swing.JButton cantonCorredores;
    private javax.swing.JButton cantonCotoBrus;
    private javax.swing.JButton cantonEsparza;
    private javax.swing.JButton cantonGarabito;
    private javax.swing.JButton cantonGolfito;
    private javax.swing.JButton cantonMontesDeOro;
    private javax.swing.JButton cantonOsa;
    private javax.swing.JButton cantonParrita;
    private javax.swing.JButton cantonPuntarenas;
    private javax.swing.JLabel fondoPuntarenas;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
