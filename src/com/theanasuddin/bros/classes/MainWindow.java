package com.theanasuddin.bros.classes;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author Anas
 */
public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(GetBrosNumber.class.getResource("/com/theanasuddin/bros/images/icon.png")));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblStart = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblGithub = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bros Meal Calculator");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/com/theanasuddin/bros/images/icon.png")).getImage());
        setResizable(false);

        pnlMain.setPreferredSize(new java.awt.Dimension(960, 528));
        pnlMain.setLayout(null);

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/theanasuddin/bros/images/logo.png"))); // NOI18N
        pnlMain.add(lblLogo);
        lblLogo.setBounds(370, 204, 218, 80);

        lblStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/theanasuddin/bros/images/start_button_hover.png"))); // NOI18N
        lblStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStartMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStartMouseExited(evt);
            }
        });
        pnlMain.add(lblStart);
        lblStart.setBounds(370, 296, 218, 28);

        lblVersion.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblVersion.setForeground(new java.awt.Color(254,246,251));
        lblVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVersion.setText("Version: 1.0.0");
        lblVersion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlMain.add(lblVersion);
        lblVersion.setBounds(10, 500, 80, 18);

        lblAuthor.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblAuthor.setForeground(new java.awt.Color(254,246,251));
        lblAuthor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAuthor.setText("Anas Uddin");
        lblAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlMain.add(lblAuthor);
        lblAuthor.setBounds(870, 500, 80, 18);

        lblGithub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/theanasuddin/bros/images/github.png"))); // NOI18N
        lblGithub.setText("jLabel1");
        lblGithub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGithub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGithubMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGithubMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGithubMouseExited(evt);
            }
        });
        pnlMain.add(lblGithub);
        lblGithub.setBounds(855, 500, 18, 18);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/theanasuddin/bros/images/strawberry.png"))); // NOI18N
        pnlMain.add(lblBackground);
        lblBackground.setBounds(0, 0, 960, 528);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblStartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStartMouseEntered
        lblStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/theanasuddin/bros/images/start_button.png")));
    }//GEN-LAST:event_lblStartMouseEntered

    private void lblStartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStartMouseExited
        lblStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/theanasuddin/bros/images/start_button_hover.png")));
    }//GEN-LAST:event_lblStartMouseExited

    private void lblStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStartMouseClicked
        GetBrosNumber frame = new GetBrosNumber();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblStartMouseClicked

    private void lblGithubMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGithubMouseEntered
        lblGithub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/theanasuddin/bros/images/github_hover.png")));
    }//GEN-LAST:event_lblGithubMouseEntered

    private void lblGithubMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGithubMouseExited
        lblGithub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/theanasuddin/bros/images/github.png")));
    }//GEN-LAST:event_lblGithubMouseExited

    private void lblGithubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGithubMouseClicked
        try {
            URI uri = new URI("https://github.com/theanasuddin");
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(uri);
            } else {
                System.out.println("Desktop not supported. Cannot open the URL.");
            }
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_lblGithubMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainWindow frame = new MainWindow();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblGithub;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblStart;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables
}
