package Login;

import Main.Menu_Utama;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Font;
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
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import koneksi.Koneksi;
import pn_utama.Produk;

public class Form_Login extends javax.swing.JFrame {
    private Connection conn;
    public Form_Login() {
        initComponents();  
        conn = koneksi.Koneksi.ambilKoneksi();
        setActionButton();
    }
    
    void bersih(){
        t_username.setText("Username");       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_login = new javax.swing.JPanel();
        eye = new javax.swing.JLabel();
        hide = new javax.swing.JLabel();
        t_username = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        password = new javax.swing.JLabel();
        pn_bg = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        icon_username = new javax.swing.JLabel();
        icon_pw = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/barber_.png")).getImage()
        );

        pn_login.setBackground(new java.awt.Color(255, 255, 255));
        pn_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        pn_login.setForeground(new java.awt.Color(0, 0, 153));
        pn_login.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        pn_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_hide.png"))); // NOI18N
        pn_login.add(eye, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, 30));

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_show.png"))); // NOI18N
        pn_login.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, 30));

        t_username.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        t_username.setForeground(new java.awt.Color(83, 17, 42));
        t_username.setText("Username");
        t_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(83, 17, 42)));
        t_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_usernameFocusLost(evt);
            }
        });
        pn_login.add(t_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 125, 245, 35));

        btn_login.setBackground(new java.awt.Color(83, 17, 42));
        btn_login.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("LOGIN");
        btn_login.setBorder(null);
        pn_login.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 247, 245, 35));

        password.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(83, 17, 42));
        password.setText("Lupa Password ?");
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        pn_login.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 100, -1));

        pn_bg.setBackground(new java.awt.Color(83, 17, 42));

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WELCOME");

        jLabel4.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TO THE PAGE");

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
                        .addGap(100, 100, 100))))
        );
        pn_bgLayout.setVerticalGroup(
            pn_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_bgLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_login.add(pn_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, -1, -1, 400));

        icon_username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_admin.png"))); // NOI18N
        pn_login.add(icon_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 130, -1, -1));

        icon_pw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_password.png"))); // NOI18N
        pn_login.add(icon_pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 190, -1, -1));

        txt_password.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txt_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(83, 17, 42)));
        pn_login.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 185, 243, 35));

        jLabel3.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(83, 17, 42));
        jLabel3.setText("CASHIER LOGIN");
        pn_login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
    Form_SignIn SignIn = new Form_SignIn();  
    SignIn.setVisible(true);                 
    this.dispose();
    }//GEN-LAST:event_passwordMouseClicked

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel(new FlatLightLaf());
            UIManager.put("TableHeader.background", new Color(83,17,42));
            UIManager.put("TableHeader.foreground", Color.WHITE);
            UIManager.put("Table.selectionBackground", new Color(83,17,42));
            UIManager.put("Table.font", new FontUIResource(new Font("Poppins", Font.BOLD, 12)));

        } catch (Exception e){
            e.printStackTrace();          
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel eye;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel icon_pw;
    private javax.swing.JLabel icon_username;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel password;
    private javax.swing.JPanel pn_bg;
    private javax.swing.JPanel pn_login;
    private javax.swing.JTextField t_username;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables

    private void setActionButton() {
        eye.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
            eye.setVisible(false);
            hide.setVisible(true);
            txt_password.setEchoChar((char)0); 
            }
    });
        
        hide.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e) {
            eye.setVisible(true);
            hide.setVisible(false);
            txt_password.setEchoChar('*'); 
            }
    });
        
        btn_login.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
            prosesLogin();
            }
    });
        
        txt_password.addKeyListener(new KeyAdapter(){
        @Override
        public void keyPressed(KeyEvent e){
            if(e.getKeyCode() == KeyEvent.VK_ENTER){
            btn_login.doClick();
            }
        }
    });        
}
    
    private boolean validasiInput(){
        boolean valid = false;
        if(t_username.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this,"Username Tidak Boleh Kosong");
        } else if(txt_password.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this,"Password Tidak Boleh Kosong");
        } else{
            valid = true;
        }
        return valid;
    }
    
    private String checkLogin(String username, String password){
        if(conn !=null){
            try{
                String sql = "SELECT * FROM user WHERE Nama_User=? AND Password=?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, username);
                pst.setString(2, password);
                
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    return rs.getString("ID_User");
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
    }
        return null;
}
    
    private void prosesLogin(){
        if(validasiInput()){
            String username = t_username.getText();
            String password = new String(txt_password.getPassword());                       
            String userID   = checkLogin(username, password);
            
            if(userID != null){
                Menu_Utama mn = new Menu_Utama(userID);
                mn.setVisible(true);
                mn.revalidate();
                
                dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Username dan Password Salah", "Pesan", JOptionPane.INFORMATION_MESSAGE);                
            }
        }
    }   
}
