package Login;

import Main.Menu_Utama;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level; 
import java.util.logging.Logger;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import javax.swing.JOptionPane;
import koneksi.Koneksi;

public class Form_SignIn extends javax.swing.JFrame {
    private Connection conn;
    public Form_SignIn() {
        initComponents();  
        conn = koneksi.Koneksi.ambilKoneksi();
//        setActionButton();
    }
    
    void bersih(){
        t_username.setText("Username");       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_sign = new javax.swing.JPanel();
        t_username = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        pn_bg = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t_username1 = new javax.swing.JTextField();
        t_username2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/barber_.png")).getImage()
        );

        pn_sign.setBackground(new java.awt.Color(255, 255, 255));
        pn_sign.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        pn_sign.setForeground(new java.awt.Color(0, 0, 153));
        pn_sign.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        pn_sign.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_username.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        t_username.setForeground(new java.awt.Color(83, 17, 42));
        t_username.setText("Re-Password");
        t_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(83, 17, 42)));
        t_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_usernameFocusLost(evt);
            }
        });
        t_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_usernameActionPerformed(evt);
            }
        });
        pn_sign.add(t_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 240, 35));

        btn_login.setBackground(new java.awt.Color(83, 17, 42));
        btn_login.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("DAFTAR");
        btn_login.setBorder(null);
        pn_sign.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 245, 35));

        pn_bg.setBackground(new java.awt.Color(83, 17, 42));

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WELCOME");

        jLabel4.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TO THE PAGE");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_logout.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_bgLayout = new javax.swing.GroupLayout(pn_bg);
        pn_bg.setLayout(pn_bgLayout);
        pn_bgLayout.setHorizontalGroup(
            pn_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_bgLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(pn_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_bgLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_bgLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_bgLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10))))
        );
        pn_bgLayout.setVerticalGroup(
            pn_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_bgLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(128, 128, 128)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_sign.add(pn_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, -1, -1, 400));

        jLabel3.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(83, 17, 42));
        jLabel3.setText("MASUKKAN PASSWORD BARU");
        pn_sign.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 320, -1));

        t_username1.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        t_username1.setForeground(new java.awt.Color(83, 17, 42));
        t_username1.setText("Username");
        t_username1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(83, 17, 42)));
        t_username1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_username1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_username1FocusLost(evt);
            }
        });
        pn_sign.add(t_username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 125, 245, 35));

        t_username2.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        t_username2.setForeground(new java.awt.Color(83, 17, 42));
        t_username2.setText("Password");
        t_username2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(83, 17, 42)));
        t_username2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_username2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_username2FocusLost(evt);
            }
        });
        t_username2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_username2ActionPerformed(evt);
            }
        });
        pn_sign.add(t_username2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 180, 250, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_sign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_sign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusGained
        String username=t_username.getText();
        if(username.equals("Username")){
            t_username.setText("");
        }
    }//GEN-LAST:event_t_usernameFocusGained

    private void t_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusLost
        String username=t_username.getText();
        if(username.equals("")||username.equals("Username")){
            t_username.setText("Username");
        }
    }//GEN-LAST:event_t_usernameFocusLost

    private void t_username1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_username1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_t_username1FocusGained

    private void t_username1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_username1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_t_username1FocusLost

    private void t_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_usernameActionPerformed

    private void t_username2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_username2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_t_username2FocusGained

    private void t_username2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_username2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_t_username2FocusLost

    private void t_username2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_username2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_username2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    Form_Login Login = new Form_Login();  
    Login.setVisible(true);                 
    this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Form_SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pn_bg;
    private javax.swing.JPanel pn_sign;
    private javax.swing.JTextField t_username;
    private javax.swing.JTextField t_username1;
    private javax.swing.JTextField t_username2;
    // End of variables declaration//GEN-END:variables

//    private void setActionButton() {       
//        btn_login.addMouseListener(new MouseAdapter(){
//            @Override
//            public void mouseClicked(MouseEvent e) {
//            prosesLogin();
//            }
//    });
//        
//        txt_password.addKeyListener(new KeyAdapter(){
//        @Override
//        public void keyPressed(KeyEvent e){
//            if(e.getKeyCode() == KeyEvent.VK_ENTER){
//            btn_login.doClick();
//            }
//        }
//    });        
//}
//    
//    private boolean validasiInput(){
//        boolean valid = false;
//        if(t_username.getText().trim().isEmpty()){
//            JOptionPane.showMessageDialog(this,"Username tidak boleh kosong");
//        } else if(txt_password.getText().trim().isEmpty()){
//            JOptionPane.showMessageDialog(this,"Password tidak boleh kosong");
//        } else{
//            valid = true;
//        }
//        return valid;
//    }
//    
//    private String checkLogin(String username, String password){
//        if(conn !=null){
//            try{
//                String sql = "SELECT * FROM user WHERE Username=? AND Password=?";
//                PreparedStatement pst = conn.prepareStatement(sql);
//                pst.setString(1, username);
//                pst.setString(2, password);
//                
//                ResultSet rs = pst.executeQuery();
//                if(rs.next()){
//                    return rs.getString("ID_User");
//                }
//            } catch (SQLException e){
//                e.printStackTrace();
//            }
//    }
//        return null;
//}
//    
//    private void prosesLogin(){
//        if(validasiInput()){
//            String username = t_username.getText();
//            String password = new String(txt_password.getPassword());                       
//            String userID   = checkLogin(username, password);
//            
//            if(userID != null){
//                Menu_Utama mn = new Menu_Utama(userID);
//                mn.setVisible(true);
//                mn.revalidate();
//                
//                dispose();
//            }else{
//                JOptionPane.showMessageDialog(this, "Username dan Password Salah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
//                
//            }
//        }
//    }   
}
