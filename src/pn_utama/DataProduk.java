package pn_utama;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class DataProduk extends javax.swing.JDialog {
    private Connection conn;

    private String idProduk;
    private String namaProduk;
    private String harga;
    
    public String getIdProduk() {
        return idProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public String getHarga() {
        return harga;
    }

    public DataProduk(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        conn = koneksi.Koneksi.ambilKoneksi();
        setTabelModel();
        loadData();   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Scroll = new javax.swing.JScrollPane();
        tblpelanggan = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(82, 17, 42));

        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Produk");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Scroll.setBackground(new java.awt.Color(255, 255, 255));

        tblpelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblpelanggan.setRowHeight(30);
        tblpelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpelangganMouseClicked(evt);
            }
        });
        Scroll.setViewportView(tblpelanggan);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons_searchfile.png"))); // NOI18N

        txtsearch.setFont(new java.awt.Font("Poppins Light", 2, 12)); // NOI18N
        txtsearch.setForeground(new java.awt.Color(102, 102, 102));
        txtsearch.setText("Search");
        txtsearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82, 17, 42)));
        txtsearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtsearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtsearchFocusLost(evt);
            }
        });
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtsearch)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtsearch))
                .addGap(10, 10, 10)
                .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(514, 366));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        searchData();
    }//GEN-LAST:event_txtsearchActionPerformed

    private void tblpelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpelangganMouseClicked
        dataTabel();
    }//GEN-LAST:event_tblpelangganMouseClicked

    private void txtsearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsearchFocusLost
        String search=txtsearch.getText();
        if(search.equals("")||search.equals("Search")){
            txtsearch.setText("Search");
        }
    }//GEN-LAST:event_txtsearchFocusLost

    private void txtsearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsearchFocusGained
        String search=txtsearch.getText();
        if(search.equals("Search")){
            txtsearch.setText("");
        }
    }//GEN-LAST:event_txtsearchFocusGained

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
            java.util.logging.Logger.getLogger(DataProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DataProduk dialog = new DataProduk(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTable tblpelanggan;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        getData((DefaultTableModel) tblpelanggan.getModel());   
    }
    
    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tblpelanggan.getModel();
        model.addColumn("ID_Produk");
        model.addColumn("Nama_Produk");
        model.addColumn("Harga_Produk");   
    }
    
    private void dataTabel(){
    int row = tblpelanggan.getSelectedRow();
    
    idProduk = tblpelanggan.getValueAt(row, 0).toString();
    namaProduk = tblpelanggan.getValueAt(row, 1).toString();
    harga = tblpelanggan.getValueAt(row, 2).toString();
    
    dispose();   
    }

    public void getData(DefaultTableModel model) {
        model.setRowCount(0);

        try {
        String sql = "SELECT * FROM produk";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
                
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String idBarang   = rs.getString("ID_Produk");
                String namaBarang = rs.getString("Nama_Produk");
                String hargasewa  = rs.getString("Harga_Produk");
                    
                    
                Object[] rowData = {idBarang, namaBarang, hargasewa};
                model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Produk.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void searchData() {
        String kataKunci = txtsearch.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblpelanggan.getModel();
        model.setRowCount(0);
        
        try {
        String sql = "SELECT * FROM produk WHERE ID_Produk LIKE ? OR Nama_Produk LIKE ?";
        try (PreparedStatement st = conn.prepareStatement(sql)){
            st.setString(1, "%" + kataKunci + "%");
            st.setString(2, "%" + kataKunci + "%");
            ResultSet rs = st.executeQuery();
                
            while (rs.next()) {
                String idBarang   = rs.getString("ID_Produk");
                String namaBarang = rs.getString("Nama_Produk");
                String hargasewa  = rs.getString("Harga_Produk");

                Object[] rowData = {idBarang,namaBarang,hargasewa};
                model.addRow(rowData);
                }
            } 
        } catch (SQLException e) {
            Logger.getLogger(Produk.class.getName()).log(Level.SEVERE,null,e);
        }
    }  
}

