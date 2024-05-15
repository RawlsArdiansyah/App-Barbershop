package pn_utama;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import koneksi.Koneksi;

public class Karyawan extends javax.swing.JPanel{
    private Connection conn;
    public Karyawan() {
        initComponents();
        conn = Koneksi.ambilKoneksi();
        setTabelModel();
        loadData();
        setIDKaryawan();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_main = new javax.swing.JPanel();
        pn_view = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblkaryawan = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        btn_edit = new javax.swing.JButton();
        pn_add = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txthp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtpw = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_batal1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cb_kelamin = new javax.swing.JComboBox<>();
        tgl_bergabung = new com.toedter.calendar.JDateChooser();
        btn_update = new javax.swing.JButton();
        txtlevel = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        pn_main.setBackground(new java.awt.Color(255, 255, 255));
        pn_main.setLayout(new java.awt.CardLayout());

        pn_view.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(83, 17, 42));

        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Karyawan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(9, 9, 9))
        );

        tblkaryawan.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        tblkaryawan.setForeground(new java.awt.Color(83, 17, 42));
        tblkaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblkaryawan.setGridColor(new java.awt.Color(83, 17, 42));
        tblkaryawan.setRowHeight(30);
        tblkaryawan.setShowGrid(false);
        tblkaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblkaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblkaryawan);

        btn_add.setBackground(new java.awt.Color(0, 153, 102));
        btn_add.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_plus.png"))); // NOI18N
        btn_add.setText("Tambah");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_hapus.setBackground(new java.awt.Color(255, 0, 51));
        btn_hapus.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btn_hapus.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_delete.png"))); // NOI18N
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        txt_search.setFont(new java.awt.Font("Poppins Light", 2, 12)); // NOI18N
        txt_search.setForeground(new java.awt.Color(102, 102, 102));
        txt_search.setText("Search");
        txt_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_searchFocusLost(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_searchKeyTyped(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(83, 17, 42));
        btn_edit.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_edit.png"))); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_viewLayout = new javax.swing.GroupLayout(pn_view);
        pn_view.setLayout(pn_viewLayout);
        pn_viewLayout.setHorizontalGroup(
            pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_viewLayout.createSequentialGroup()
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        pn_viewLayout.setVerticalGroup(
            pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        pn_main.add(pn_view, "card2");

        pn_add.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(83, 17, 42));

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tambah Data Karyawan");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addGap(9, 9, 9))
        );

        btn_simpan.setBackground(new java.awt.Color(83, 17, 42));
        btn_simpan.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_save.png"))); // NOI18N
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel8.setText("ID Karyawan");

        txtid.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 17, 42)));

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel9.setText("Nama User");

        txtnama.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtnama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 17, 42)));

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel10.setText("No HP");

        txthp.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txthp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 17, 42)));
        txthp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txthpKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel11.setText("Password");

        txtpw.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtpw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 17, 42)));

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel12.setText("Jenis Kelamin");

        btn_batal1.setBackground(new java.awt.Color(255, 204, 0));
        btn_batal1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btn_batal1.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_cancel.png"))); // NOI18N
        btn_batal1.setText("Batal");
        btn_batal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batal1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel13.setText("Tgl Bergabung");

        cb_kelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));

        tgl_bergabung.setDateFormatString("yyyy-MM-dd");

        btn_update.setBackground(new java.awt.Color(83, 17, 42));
        btn_update.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_edit.png"))); // NOI18N
        btn_update.setText("Edit");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        txtlevel.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtlevel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 17, 42)));

        jLabel14.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel14.setText("Level");

        javax.swing.GroupLayout pn_addLayout = new javax.swing.GroupLayout(pn_add);
        pn_add.setLayout(pn_addLayout);
        pn_addLayout.setHorizontalGroup(
            pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_addLayout.createSequentialGroup()
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnama, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txthp)
                            .addComponent(txtid)))
                    .addGroup(pn_addLayout.createSequentialGroup()
                        .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btn_batal1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE))
                    .addGroup(pn_addLayout.createSequentialGroup()
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtlevel)
                            .addComponent(txtpw)
                            .addComponent(tgl_bergabung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_kelamin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
        );
        pn_addLayout.setVerticalGroup(
            pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgl_bergabung, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpw, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlevel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pn_main.add(pn_add, "card2");

        add(pn_main, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        insertData();
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        pn_main.removeAll();
        pn_main.add(pn_add);
        pn_main.repaint();
        pn_main.revalidate();
        
        txtid.setText(setIDKaryawan());
        btn_update.setVisible(false);
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_batal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batal1ActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_btn_batal1ActionPerformed

    private void tblkaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblkaryawanMouseClicked
        btn_edit.setVisible(true);
        btn_hapus.setVisible(true);
    }//GEN-LAST:event_tblkaryawanMouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        dataTabel();
        btn_simpan.setVisible(false);
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        updateData();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        deleteData();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void txt_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyTyped
        searchData();
    }//GEN-LAST:event_txt_searchKeyTyped

    private void txt_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_searchFocusGained
        String search=txt_search.getText();
        if(search.equals("Search")){
            txt_search.setText("");
        }
    }//GEN-LAST:event_txt_searchFocusGained

    private void txt_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_searchFocusLost
        String search=txt_search.getText();
        if(search.equals("")||search.equals("Search")){
            txt_search.setText("Search");
        }
    }//GEN-LAST:event_txt_searchFocusLost

    private void txthpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthpKeyTyped
    char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();}
    }//GEN-LAST:event_txthpKeyTyped
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_batal1;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cb_kelamin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pn_add;
    private javax.swing.JPanel pn_main;
    private javax.swing.JPanel pn_view;
    private javax.swing.JTable tblkaryawan;
    private com.toedter.calendar.JDateChooser tgl_bergabung;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txthp;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlevel;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtpw;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        getData((DefaultTableModel) tblkaryawan.getModel());   
        btn_edit.setVisible(false);
        btn_hapus.setVisible(false);
    }
    
    private void showPanel(){
        pn_main.removeAll();
        pn_main.add(new Karyawan());
        pn_main.repaint();
        pn_main.revalidate();
    }
    
    private void resetForm() {
        txtid.setText("");
        txtnama.setText("");
        txthp.setText("");
        cb_kelamin.setSelectedItem(ABORT);
        txtpw.setText("");
        txtlevel.setText("");
    }
    
    private String setIDKaryawan(){
        String urutan = null;
        Date now = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("MM");
        String no = noFormat.format(now);
        
        String sql = "SELECT RIGHT(ID_User, 2) AS Nomor " +
                "FROM user "+
                "WHERE ID_User LIKE 'ID" + no + "%' " +
                "ORDER BY ID_User DESC " +
                "LiMIT 1";
        
        try (PreparedStatement pst = conn.prepareStatement(sql)){
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                int nomor = Integer.parseInt(rs.getString("Nomor")) + 1;
                urutan = "PGW" + no + String.format("%03d", nomor);
            }else {
                urutan = "PGW" + no + "001";
            }           
        }catch (Exception e) {
            Logger.getLogger(Karyawan.class.getName()).log(Level.SEVERE, null, e);
        }
        return urutan;
    }
    
    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tblkaryawan.getModel();
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("No HP");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Tanggal Bergabung");
        model.addColumn("Password");
        model.addColumn("Level");
    }
    
    private void dataTabel() {
        pn_view.setVisible(false);
        pn_add.setVisible(true);
        
        int row = tblkaryawan.getSelectedRow();
        jLabel3.setText("Perbarui Data Karyawan");
        
        txtid.setEnabled(false);
        tgl_bergabung.setEnabled(false);
        
        txtid.setText(tblkaryawan.getValueAt(row,0).toString());
        txtnama.setText(tblkaryawan.getValueAt(row,1).toString());
        txthp.setText(tblkaryawan.getValueAt(row,2).toString());
        cb_kelamin.setSelectedItem(tblkaryawan.getValueAt(row, 3).toString());
        java.sql.Date sqlDate = (java.sql.Date) tblkaryawan.getValueAt(row, 4);
        java.util.Date utilDate = new java.util.Date(sqlDate.getTime());
        tgl_bergabung.setDate(utilDate);
        txtpw.setText(tblkaryawan.getValueAt(row,5).toString());   
        txtlevel.setText(tblkaryawan.getValueAt(row,6).toString());         
    }

    private void getData(DefaultTableModel model){
        model.setRowCount(0);

        try {
            String sql = "SELECT * FROM user";
        try (PreparedStatement pst = conn.prepareStatement(sql)){
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
                String idKaryawan    = rs.getString("ID_User");
                String namaKaryawan  = rs.getString("Nama_User");
                String hp            = rs.getString("No_HP");
                String jeniskelamin  = rs.getString("Jenis_Kelamin");
                java.sql.Date tanggalbergabung = rs.getDate("Tgl_Bergabung");
                String pw            = rs.getString("Password");
                String level         = rs.getString("Level");

                
                Object[] rowData = {idKaryawan, namaKaryawan, hp, jeniskelamin, tanggalbergabung, pw, level};
                model.addRow(rowData);
                }
            }   
        } catch (Exception e){
            Logger.getLogger(Karyawan.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    private void insertData() {
    String idKaryawan    = txtid.getText();
    String namaKaryawan  = txtnama.getText();
    String hp            = txthp.getText();
    String jeniskelamin  = (String) cb_kelamin.getSelectedItem();
    java.util.Date tgl_bergabung = new java.util.Date();
    java.sql.Date sqlDate = new java.sql.Date(tgl_bergabung.getTime());
    String pw             = txtpw.getText();
    String level         = txtlevel.getText();

    try {
        String sql = "INSERT INTO user (ID_User, Nama_User, No_HP, Jenis_Kelamin, Tgl_Bergabung, Password, Level) VALUES (?,?,?,?,?,?,?)";
            
        try(PreparedStatement pst = conn.prepareStatement(sql)){
            pst.setString(1,idKaryawan);
            pst.setString(2,namaKaryawan);
            pst.setString(3,hp);
            pst.setString(4,jeniskelamin);
            pst.setDate(  5, sqlDate);
            pst.setString(6,pw);
            pst.setString(7,level);
           
            int rowInserted = pst.executeUpdate();
            if(rowInserted > 0){
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                resetForm();
                loadData();
                showPanel();
                }        
            }   
        }catch (Exception e) {
        Logger.getLogger(Karyawan.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void updateData() {
        String idKaryawan    = txtid.getText();
        String namaKaryawan  = txtnama.getText();
        String hp            = txthp.getText();
        String jeniskelamin  = (String) cb_kelamin.getSelectedItem();
        java.util.Date tgl_bergabung = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(tgl_bergabung.getTime());
        String pw             = txtpw.getText();
        String level         = txtlevel.getText();
        
    try {
        String sql = "UPDATE user SET Nama_User=?, NO_HP=?, Jenis_Kelamin=?, Tgl_Bergabung=? , Password=?, Level=? WHERE ID_User=?";           
        try(PreparedStatement pst = conn.prepareStatement(sql)){
            pst.setString(1,idKaryawan);
            pst.setString(2,namaKaryawan);
            pst.setString(3,hp);
            pst.setString(4,jeniskelamin);
            pst.setDate  (5, sqlDate);
            pst.setString(6,pw);
            pst.setString(7,level);
           
            int rowUpdated = pst.executeUpdate();
            if(rowUpdated > 0){
                JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
                setIDKaryawan();
                loadData();
                showPanel();
                }        
            }   
        }catch (Exception e) {
        Logger.getLogger(Karyawan.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void deleteData() {
        int selectedRow = tblkaryawan.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah yakin ingin menghapus data ini ?", "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_NO_OPTION){
            String id = tblkaryawan.getValueAt(selectedRow,0).toString();
            try{
                String sql = "DELETE FROM user WHERE ID_User=?";
                try(PreparedStatement pst = conn.prepareStatement(sql)){
                pst.setString(1,id);
                
                int rowDeleted = pst.executeUpdate();
                if(rowDeleted > 0){
                    JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                    resetForm();
                    loadData();
                    showPanel();
                }else{
                    JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
                    }
                }                
            }catch (Exception e) {
            Logger.getLogger(Karyawan.class.getName()).log(Level.SEVERE, null, e);
            }
        }        
    }

    private void searchData() {
        String kataKunci = txt_search.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblkaryawan.getModel();
        model.setRowCount(0);

        try {
            String sql = "SELECT * FROM pegawai WHERE ID_Pegawai LIKE ? OR Nama_Pegawai LIKE ? OR No_HP LIKE ?";           
        try (PreparedStatement pst = conn.prepareStatement(sql)){
            pst.setString(1, "%" + kataKunci + "%");
            pst.setString(2, "%" + kataKunci + "%");
            pst.setString(3, "%" + kataKunci + "%");
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
                String idPelanggan   = rs.getString("ID_Pegawai");
                String namaPelanggan = rs.getString("Nama_Pegawai");
                String email         = rs.getString("Email");
                String telepon       = rs.getString("No_HP");
                String jeniskelamin  = rs.getString("Jenis_Kelamin");
                java.sql.Date tanggalbergabung = rs.getDate("Tgl_Bergabung");
                
                Object[] rowData = {idPelanggan,namaPelanggan,email,telepon,jeniskelamin,tanggalbergabung};
                model.addRow(rowData);
                }
            }   
        } catch (Exception e){
            Logger.getLogger(Karyawan.class.getName()).log(Level.SEVERE,null,e);
        }   
    }  
}

    
    

        
        
