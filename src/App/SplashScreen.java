/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;

/**
 *
 * @author beta7x
 */
public class SplashScreen extends javax.swing.JFrame implements Runnable {
    
    /**
     * Creates new form SplashScreen
     */
    
    public SplashScreen() {
        setUndecorated(true);
        setIcon();
        initComponents();
        
        setTitle("Load module requirements");
        
        // Rounded corners
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 25, 25));

        // Set to center screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        
//        T.stop();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPl = new javax.swing.JPanel();
        SplashLoading = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPl.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        mainPl.setPreferredSize(new java.awt.Dimension(895, 496));
        mainPl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SplashLoading.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        SplashLoading.setForeground(new java.awt.Color(255, 255, 255));
        SplashLoading.setText("Loading...");
        mainPl.add(SplashLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 120, -1));
        mainPl.add(ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 484, 910, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Kota_tegal.png"))); // NOI18N
        mainPl.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA UMKM TEGAL");
        mainPl.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 240, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Logo Kabupaten Tegal.png"))); // NOI18N
        mainPl.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/logo-plugin (1).png"))); // NOI18N
        mainPl.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jback.setBackground(new java.awt.Color(51, 51, 51));
        jback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/—Pngtree—colorful lines abstract_5896436.png"))); // NOI18N
        jback.setOpaque(true);
        jPanel2.add(jback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 895, 496));

        mainPl.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 895, 496));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            new SplashScreen().setVisible(true);
//        });
        SplashScreen sp = new SplashScreen();
        sp.setVisible(true);
        
        try {
            for(int i = 0; i < 101; i++) {
                Thread.sleep(70);
                sp.SplashLoading.setText(i + "%");
                
                if(i == 10) {
                    sp.SplashLoading.setText("Turning On Modules....");
                } else if (i == 20) {
                    sp.SplashLoading.setText("Loading Modules....");
                } else if (i == 50) {
                    sp.SplashLoading.setText("Preparing Environtment....");
                } else if (i == 70) {
                    sp.SplashLoading.setText("Connecting Database....");
                } else if (i == 80) {
                    sp.SplashLoading.setText("Database Connected!");
                } else if (i == 100) {
                    sp.dispose();
                    new Login().setVisible(true);
                }
                sp.ProgressBar.setValue(i);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel SplashLoading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jback;
    private javax.swing.JPanel mainPl;
    // End of variables declaration//GEN-END:variables
    
    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resource/Icon-frame.png")));
    }    
    
    @Override
    public void run() {
        
    }
    
    
}
