package Main;


import java.awt.Color;


public class Login extends javax.swing.JFrame {

   
    public Login() {
        initComponents();
        
    }

    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Login = new javax.swing.JLabel();
        Lock = new javax.swing.JLabel();
        passtxt = new javax.swing.JPasswordField();
        Loginbtn = new rojerusan.RSMaterialButtonRectangle();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        inij = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Login.setText("Login");
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 70, -1));

        Lock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagelogin/icons8_lock_20px_1.png"))); // NOI18N
        jPanel1.add(Lock, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 20, 30));

        passtxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        passtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passtxtFocusGained(evt);
            }
        });
        passtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtxtActionPerformed(evt);
            }
        });
        jPanel1.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 157, 33));

        Loginbtn.setBackground(new java.awt.Color(255, 184, 197));
        Loginbtn.setText("Login");
        Loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginbtnMouseExited(evt);
            }
        });
        Loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 148, 51));

        jLabel1.setText("Selamat Datang di WhiskerWare Manager");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagelogin/icons8_close_window_30px_1.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 0, 31, -1));

        inij.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(inij, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 210, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void passtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passtxtFocusGained
      inij.setText(null);
    }//GEN-LAST:event_passtxtFocusGained

    private void passtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtxtActionPerformed

    private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbtnActionPerformed
        String p = "admin";

        String Pass = new String(passtxt.getPassword());
        if ( Pass.equals(p)) {
            new Menu().setVisible(true);
            this.dispose();
        }
        else{
            inij.setText("Password Salah, Silahkan coba lagi");
        }

    }//GEN-LAST:event_LoginbtnActionPerformed

    private void LoginbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginbtnMouseExited
        Color colortxt = new Color(255,184,197);
        Loginbtn.setForeground(Color.white);
        Loginbtn.setBackground(colortxt);
    }//GEN-LAST:event_LoginbtnMouseExited

    private void LoginbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginbtnMouseEntered
        Color colortxt = new Color(255,184,197);
        Loginbtn.setForeground(colortxt);
        Loginbtn.setBackground(Color.white);
    }//GEN-LAST:event_LoginbtnMouseEntered

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lock;
    private javax.swing.JLabel Login;
    private rojerusan.RSMaterialButtonRectangle Loginbtn;
    private javax.swing.JLabel close;
    private javax.swing.JLabel inij;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passtxt;
    // End of variables declaration//GEN-END:variables


}
