package pn_utama;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import koneksi.Koneksi;

public class Produk extends javax.swing.JPanel {
    private Connection conn;

    public Produk() {
        initComponents(); 
        conn = Koneksi.ambilKoneksi();
        setTabelModel();
        loadData();
        setIDBarang();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_main = new javax.swing.JPanel();
        pn_view = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbarang = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        pn_add = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtidproduk = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtnamaproduk = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtstok = new javax.swing.JTextField();
        btn_batal = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        pn_main.setBackground(new java.awt.Color(255, 255, 255));
        pn_main.setLayout(new java.awt.CardLayout());

        pn_view.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(83, 17, 42));

        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Produk");

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

        tblbarang.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        tblbarang.setForeground(new java.awt.Color(83, 17, 42));
        tblbarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblbarang.setRowHeight(30);
        tblbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblbarang);

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

        btn_edit.setBackground(new java.awt.Color(82, 17, 42));
        btn_edit.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_edit.png"))); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
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
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        pn_main.add(pn_view, "card2");

        pn_add.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(83, 17, 42));

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tambah Data Produk");

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
        jLabel8.setText("ID Produk");

        txtidproduk.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtidproduk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 17, 42)));

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel9.setText("Nama Produk");

        txtnamaproduk.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtnamaproduk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 17, 42)));

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel10.setText("Harga");

        txtharga.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtharga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 17, 42)));
        txtharga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txthargaKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel11.setText("Stok");

        txtstok.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtstok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 17, 42)));
        txtstok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtstokKeyTyped(evt);
            }
        });

        btn_batal.setBackground(new java.awt.Color(255, 204, 0));
        btn_batal.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_cancel.png"))); // NOI18N
        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(82, 17, 42));
        btn_update.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_edit.png"))); // NOI18N
        btn_update.setText("Edit");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_addLayout = new javax.swing.GroupLayout(pn_add);
        pn_add.setLayout(pn_addLayout);
        pn_addLayout.setHorizontalGroup(
            pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_addLayout.createSequentialGroup()
                        .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 367, Short.MAX_VALUE))
                    .addGroup(pn_addLayout.createSequentialGroup()
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(17, 17, 17)
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtstok)
                            .addComponent(txtnamaproduk, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtharga)
                            .addComponent(txtidproduk))))
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
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnamaproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
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
        
        txtidproduk.setText(setIDBarang());
        btn_update.setVisible(false);
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        dataTabel();
        btn_simpan.setVisible(false);
    }//GEN-LAST:event_btn_editActionPerformed

    private void txt_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyTyped
        searchData();
    }//GEN-LAST:event_txt_searchKeyTyped

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        deleteData();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        updateData();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void tblbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbarangMouseClicked
        btn_edit.setVisible(true);
        btn_hapus.setVisible(true);
    }//GEN-LAST:event_tblbarangMouseClicked

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_btn_batalActionPerformed

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
    
    private void txtstokKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstokKeyTyped
    char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtstokKeyTyped

    private void txthargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthargaKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txthargaKeyTyped
              
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pn_add;
    private javax.swing.JPanel pn_main;
    private javax.swing.JPanel pn_view;
    private javax.swing.JTable tblbarang;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtidproduk;
    private javax.swing.JTextField txtnamaproduk;
    private javax.swing.JTextField txtstok;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
       getData((DefaultTableModel) tblbarang.getModel());
       btn_edit.setVisible(false);
       btn_hapus.setVisible(false);
    }

    private void showPanel(){
        pn_main.removeAll();
        pn_main.add(new Produk());
        pn_main.repaint();
        pn_main.revalidate();
    }
    
    private void resetForm() {
        txtidproduk.setText("");
        txtnamaproduk.setText("");
        txtharga.setText("");
        txtstok.setText("");
    }
    
    private String setIDBarang(){
        String urutan = null;
        Date now  = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("MM");
        String no = noFormat.format(now);
        
        String sql = "SELECT RIGHT(ID_Produk, 3) AS Nomor " +
                     "FROM produk " +
                     "WHERE ID_Produk LIKE 'PRD" + no + "%' " +
                     "ORDER BY ID_Produk DESC " +
                     "LIMIT 1";
        
        try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                
            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor")) + 1;
                urutan = "PRD" + no + String.format("%03d", nomor);
            }else{
                urutan = "PRD" + no + "001";
            }           
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(Produk.class.getName()).log(Level.SEVERE, null, e);
        }        
        return urutan;
    }
    
    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tblbarang.getModel();
        model.addColumn("ID Produk");
        model.addColumn("Nama Produk");
        model.addColumn("Harga");
        model.addColumn("Stok");
    }
    
    private void dataTabel() {
        pn_view.setVisible(false);
        pn_add.setVisible(true);
        
        int row = tblbarang.getSelectedRow();
        jLabel3.setText("Perbarui Data Produk");
        
        txtidproduk.setEnabled(false);
        
        txtidproduk.setText(tblbarang.getValueAt(row, 0).toString());
        txtnamaproduk.setText(tblbarang.getValueAt(row, 1).toString());
        txtharga.setText(tblbarang.getValueAt(row, 2).toString());
        txtstok.setText(tblbarang.getValueAt(row,3).toString());
    }

    public void getData(DefaultTableModel model) {
        model.setRowCount(0);

        try {
            String sql = "SELECT * FROM produk";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idBarang     = rs.getString("ID_Produk");
                    String namaBarang   = rs.getString("Nama_Produk");
                    String hargabeli    = rs.getString("Harga_Produk");
                    String hargasewa    = rs.getString("Stok");
                    
                    
                    
                    Object[] rowData = {idBarang, namaBarang, hargabeli, hargasewa};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Produk.class.getName()).log(Level.SEVERE, null, e);
        }
    }
   
    private void insertData() {
        String idBarang   = txtidproduk.getText();
        String namaBarang = txtnamaproduk.getText();
        String hargabeli  = txtharga.getText();
        String hargasewa  = txtstok.getText();
 
        if(idBarang.isEmpty() || namaBarang.isEmpty() || 
                hargabeli.isEmpty() || hargasewa.isEmpty() ){
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Diisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "INSERT INTO produk (ID_Produk, Nama_Produk, Harga_Produk, Stok) VALUES (?,?,?,?)";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, idBarang);
                st.setString(2, namaBarang);
                st.setString(3, hargabeli);
                st.setString(4, hargasewa);

                int rowInserted = st.executeUpdate();
                if(rowInserted > 0){
                    JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                    resetForm();
                    loadData();
                    showPanel();
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Produk.class.getName()).log(Level.SEVERE,null,e);
        }
    }
   
    private void updateData() {
        String idBarang   = txtidproduk.getText();
        String namaBarang = txtnamaproduk.getText();
        String hargabeli  = txtharga.getText();
        String hargasewa  = txtstok.getText();
 
        if(idBarang.isEmpty() || namaBarang.isEmpty() || 
                hargabeli.isEmpty() || hargasewa.isEmpty() ){
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Diisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "UPDATE produk SET Nama_Produk=?, Harga_Produk=?, Stok=? WHERE ID_Produk=?";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, namaBarang);
                st.setString(2, hargabeli);
                st.setString(3, hargasewa);
                st.setString(4, idBarang);
                
                int rowUpdated = st.executeUpdate();
                if(rowUpdated > 0){
                    JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
                    resetForm();
                    loadData();
                    showPanel();
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Produk.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    private void deleteData() {
        int selectedRow = tblbarang.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, 
                "Apakah yakin ingin menghapus data ini?",
                "Konfirmasi Hapus Data", 
                JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION){
            String id = tblbarang.getValueAt(selectedRow, 0).toString();
            try {
                String sql =  "DELETE FROM produk WHERE ID_Produk=?";
                try(PreparedStatement st = conn.prepareStatement(sql)){
                    st.setString(1, id);
                    
                    int rowDeleted = st.executeUpdate();
                    if(rowDeleted > 0){
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                        resetForm();
                        loadData();
                        showPanel();
                    }else{
                        JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
                    }
                }
            } catch (SQLException e) {
                Logger.getLogger(Produk.class.getName()).log(Level.SEVERE,null,e);
            }
        }

    }
    
    private void searchData() {
        String kataKunci = txt_search.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblbarang.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM produk WHERE ID_Produk LIKE ? OR Nama_Produk LIKE ? OR Harga_Produk LIKE ?";
                    
            try (PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, "%" + kataKunci + "%");
                st.setString(2, "%" + kataKunci + "%");
                st.setString(3, "%" + kataKunci + "%");
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idBarang     = rs.getString("ID_Produk");
                    String namaBarang   = rs.getString("Nama_Produk");
                    String hargaBeli    = rs.getString("Harga_Produk");
                    String hargaSewa    = rs.getString("Stok");
           
                    Object[] rowData = {idBarang, namaBarang, hargaBeli, hargaSewa};
                    model.addRow(rowData);
                }
            } 
        } catch (SQLException e) {
            Logger.getLogger(Produk.class.getName()).log(Level.SEVERE,null,e);
        }
    }
}

               



        
