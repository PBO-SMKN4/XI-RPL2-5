/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management_Sekolah;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author ASUS
 */
public class Index extends javax.swing.JFrame {
    private Object jFileChooser1;

    /**
     * Creates new form Index
     */
    public Index() {
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

        jLabel1 = new javax.swing.JLabel();
        ButtonGuru = new javax.swing.JButton();
        ButtonSiswa = new javax.swing.JButton();
        foto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("4 Smart Management");

        ButtonGuru.setText("LOGIN GURU");
        ButtonGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGuruActionPerformed(evt);
            }
        });

        ButtonSiswa.setText("LOGIN SISWA");
        ButtonSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSiswaActionPerformed(evt);
            }
        });

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/guru.png"))); // NOI18N
        foto.setMaximumSize(new java.awt.Dimension(200, 200));
        foto.setMinimumSize(new java.awt.Dimension(200, 200));
        foto.setPreferredSize(new java.awt.Dimension(200, 200));
        foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fotoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(ButtonGuru)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addComponent(ButtonSiswa)
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonGuru)
                    .addComponent(ButtonSiswa))
                .addGap(116, 116, 116))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGuruActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new loginGuru().setVisible(true);
    }//GEN-LAST:event_ButtonGuruActionPerformed

    private void ButtonSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSiswaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginSiswa().setVisible(true);
    }//GEN-LAST:event_ButtonSiswaActionPerformed

    private void fotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotoMouseClicked
         int gambar = jFileChooser1.showOpenDialog(null);
        if (gambar == JFileChooser.APPROVE_OPTION) {
            File f = jFileChooser1.getSelectedFile();

            BufferedImage loadImg = loadImage(f.toString());

             //proses resize gambar
             BufferedImage gambar_c = resize(loadImg, 300, 300);
            ImageIcon imageicon = new ImageIcon(gambar_c);

            //System.out.println("panjang : "+h);
            //System.out.println("tinggi : "+w);
            jLabel1.setIcon(imageicon);

        }
    }//GEN-LAST:event_fotoMouseClicked

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }
    public static BufferedImage loadImage(String alamat) {
        BufferedImage bi = null;
        try {
            bi = ImageIO.read(new File(alamat));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bi;
    }
    
    public static BufferedImage resize(BufferedImage img, int newW, int newH) {

        int w = img.getWidth();
        int h = img.getHeight();
        BufferedImage dimg = dimg = new BufferedImage(newW, newH, img.getType());
        Graphics2D g = dimg.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(img, 0, 0, newW, newH, 0, 0, w, h, null);

        g.dispose();
        System.out.println("Ukuran awal gambar panjang : " + w);
        System.out.println("Ukuran awal gambar tinggi : " + h);

        return dimg;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonGuru;
    private javax.swing.JButton ButtonSiswa;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
