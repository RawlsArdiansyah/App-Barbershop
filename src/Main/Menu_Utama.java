package Main;

import Login.Form_Login;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.UIManager;
import pn_utama.Dashboard;
import koneksi.Koneksi;
import pn_utama.Karyawan;
import pn_utama.Produk;
import pn_utama.Transaksi;
import pn_utama.Laporan;

public class Menu_Utama extends javax.swing.JFrame {
    private Timer timer;
    private String userID;

    public Menu_Utama(String userID) {
        initComponents();
        this.userID = userID;
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        showDayDateTime();
    }
    
    public void checkUser() {
        if(getUserID().equals("USR2025")) {
            pn_btnLaporan.setVisible(false);
        }
    }

    public String getUserID(){
        return userID;
    }    

    private void showDayDateTime(){
        timer = new Timer (1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        Calendar calendar = Calendar.getInstance();
        Date now = new Date ();
        SimpleDateFormat formatHari = new SimpleDateFormat("EEEE", new Locale("in", "ID"));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String hari = formatHari.format(calendar.getTime());
        String dateTime = dateFormat.format(now);
        lb_tanggal.setText(hari+", "+dateTime);
        }
    });
        timer.start();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_kiri = new javax.swing.JPanel();
        pn_btnKasir = new javax.swing.JPanel();
        pn_lineksr = new javax.swing.JPanel();
        jLabelksr = new javax.swing.JLabel();
        btn_Kasir = new javax.swing.JLabel();
        pn_btnProduk = new javax.swing.JPanel();
        pn_lineprd = new javax.swing.JPanel();
        jLabelprd = new javax.swing.JLabel();
        btn_Produk = new javax.swing.JLabel();
        pn_btnPegawai = new javax.swing.JPanel();
        pn_linepgw = new javax.swing.JPanel();
        jLabelpgw = new javax.swing.JLabel();
        btn_Pegawai = new javax.swing.JLabel();
        pn_btnDashboard = new javax.swing.JPanel();
        pn_linedsh = new javax.swing.JPanel();
        jLabeldsh = new javax.swing.JLabel();
        btn_Dashboard = new javax.swing.JLabel();
        pn_btnLaporan = new javax.swing.JPanel();
        pn_linelpr = new javax.swing.JPanel();
        jLabellpr = new javax.swing.JLabel();
        btn_Laporan = new javax.swing.JLabel();
        pn_btnLogout = new javax.swing.JPanel();
        pn_linelg = new javax.swing.JPanel();
        jLabellpr1 = new javax.swing.JLabel();
        btn_Logout = new javax.swing.JLabel();
        pn_navbar = new javax.swing.JPanel();
        lb_tanggal = new javax.swing.JLabel();
        side_part = new javax.swing.JLabel();
        jLabellpr2 = new javax.swing.JLabel();
        lbuser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pn_kanan = new javax.swing.JPanel();
        utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/barber_.png")).getImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                WindowOpened(evt);
            }
        });

        pn_kiri.setBackground(new java.awt.Color(83, 17, 42));
        pn_kiri.setPreferredSize(new java.awt.Dimension(180, 200));

        pn_btnKasir.setBackground(new java.awt.Color(83, 17, 42));
        pn_btnKasir.setForeground(new java.awt.Color(255, 255, 255));
        pn_btnKasir.setPreferredSize(new java.awt.Dimension(170, 35));

        pn_lineksr.setBackground(new java.awt.Color(83, 17, 42));
        pn_lineksr.setPreferredSize(new java.awt.Dimension(6, 25));

        javax.swing.GroupLayout pn_lineksrLayout = new javax.swing.GroupLayout(pn_lineksr);
        pn_lineksr.setLayout(pn_lineksrLayout);
        pn_lineksrLayout.setHorizontalGroup(
            pn_lineksrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        pn_lineksrLayout.setVerticalGroup(
            pn_lineksrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabelksr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_notes.png"))); // NOI18N

        btn_Kasir.setFont(new java.awt.Font("Poppins SemiBold", 1, 13)); // NOI18N
        btn_Kasir.setForeground(new java.awt.Color(255, 255, 255));
        btn_Kasir.setText("Transaksi");
        btn_Kasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_KasirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_KasirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_KasirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnKasirLayout = new javax.swing.GroupLayout(pn_btnKasir);
        pn_btnKasir.setLayout(pn_btnKasirLayout);
        pn_btnKasirLayout.setHorizontalGroup(
            pn_btnKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnKasirLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(pn_lineksr, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelksr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btn_Kasir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_btnKasirLayout.setVerticalGroup(
            pn_btnKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnKasirLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pn_btnKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Kasir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_btnKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelksr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pn_lineksr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );

        pn_btnProduk.setBackground(new java.awt.Color(83, 17, 42));
        pn_btnProduk.setForeground(new java.awt.Color(255, 255, 255));
        pn_btnProduk.setPreferredSize(new java.awt.Dimension(170, 35));

        pn_lineprd.setBackground(new java.awt.Color(83, 17, 42));
        pn_lineprd.setPreferredSize(new java.awt.Dimension(6, 25));

        javax.swing.GroupLayout pn_lineprdLayout = new javax.swing.GroupLayout(pn_lineprd);
        pn_lineprd.setLayout(pn_lineprdLayout);
        pn_lineprdLayout.setHorizontalGroup(
            pn_lineprdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        pn_lineprdLayout.setVerticalGroup(
            pn_lineprdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabelprd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_products.png"))); // NOI18N

        btn_Produk.setFont(new java.awt.Font("Poppins SemiBold", 1, 13)); // NOI18N
        btn_Produk.setForeground(new java.awt.Color(255, 255, 255));
        btn_Produk.setText("Produk");
        btn_Produk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ProdukMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ProdukMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ProdukMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnProdukLayout = new javax.swing.GroupLayout(pn_btnProduk);
        pn_btnProduk.setLayout(pn_btnProdukLayout);
        pn_btnProdukLayout.setHorizontalGroup(
            pn_btnProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnProdukLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(pn_lineprd, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelprd)
                .addGap(10, 10, 10)
                .addComponent(btn_Produk, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pn_btnProdukLayout.setVerticalGroup(
            pn_btnProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnProdukLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pn_btnProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Produk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_btnProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelprd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addComponent(pn_lineprd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );

        pn_btnPegawai.setBackground(new java.awt.Color(83, 17, 42));
        pn_btnPegawai.setForeground(new java.awt.Color(255, 255, 255));
        pn_btnPegawai.setPreferredSize(new java.awt.Dimension(170, 35));

        pn_linepgw.setBackground(new java.awt.Color(83, 17, 42));
        pn_linepgw.setPreferredSize(new java.awt.Dimension(6, 25));

        javax.swing.GroupLayout pn_linepgwLayout = new javax.swing.GroupLayout(pn_linepgw);
        pn_linepgw.setLayout(pn_linepgwLayout);
        pn_linepgwLayout.setHorizontalGroup(
            pn_linepgwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        pn_linepgwLayout.setVerticalGroup(
            pn_linepgwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabelpgw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_group.png"))); // NOI18N

        btn_Pegawai.setFont(new java.awt.Font("Poppins SemiBold", 1, 13)); // NOI18N
        btn_Pegawai.setForeground(new java.awt.Color(255, 255, 255));
        btn_Pegawai.setText("Karyawan");
        btn_Pegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PegawaiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_PegawaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_PegawaiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnPegawaiLayout = new javax.swing.GroupLayout(pn_btnPegawai);
        pn_btnPegawai.setLayout(pn_btnPegawaiLayout);
        pn_btnPegawaiLayout.setHorizontalGroup(
            pn_btnPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPegawaiLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(pn_linepgw, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelpgw)
                .addGap(10, 10, 10)
                .addComponent(btn_Pegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        pn_btnPegawaiLayout.setVerticalGroup(
            pn_btnPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPegawaiLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pn_btnPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Pegawai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_btnPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelpgw, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pn_linepgw, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );

        pn_btnDashboard.setBackground(new java.awt.Color(83, 17, 42));
        pn_btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        pn_btnDashboard.setPreferredSize(new java.awt.Dimension(170, 35));

        pn_linedsh.setBackground(new java.awt.Color(83, 17, 42));
        pn_linedsh.setPreferredSize(new java.awt.Dimension(6, 25));

        javax.swing.GroupLayout pn_linedshLayout = new javax.swing.GroupLayout(pn_linedsh);
        pn_linedsh.setLayout(pn_linedshLayout);
        pn_linedshLayout.setHorizontalGroup(
            pn_linedshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        pn_linedshLayout.setVerticalGroup(
            pn_linedshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabeldsh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_home.png"))); // NOI18N

        btn_Dashboard.setFont(new java.awt.Font("Poppins SemiBold", 1, 13)); // NOI18N
        btn_Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        btn_Dashboard.setText("Dashboard");
        btn_Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_DashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_DashboardMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnDashboardLayout = new javax.swing.GroupLayout(pn_btnDashboard);
        pn_btnDashboard.setLayout(pn_btnDashboardLayout);
        pn_btnDashboardLayout.setHorizontalGroup(
            pn_btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnDashboardLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(pn_linedsh, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabeldsh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btn_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_btnDashboardLayout.setVerticalGroup(
            pn_btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnDashboardLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pn_btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabeldsh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addComponent(pn_linedsh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );

        pn_btnLaporan.setBackground(new java.awt.Color(83, 17, 42));
        pn_btnLaporan.setForeground(new java.awt.Color(255, 255, 255));
        pn_btnLaporan.setPreferredSize(new java.awt.Dimension(170, 35));

        pn_linelpr.setBackground(new java.awt.Color(83, 17, 42));
        pn_linelpr.setPreferredSize(new java.awt.Dimension(6, 25));

        javax.swing.GroupLayout pn_linelprLayout = new javax.swing.GroupLayout(pn_linelpr);
        pn_linelpr.setLayout(pn_linelprLayout);
        pn_linelprLayout.setHorizontalGroup(
            pn_linelprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        pn_linelprLayout.setVerticalGroup(
            pn_linelprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabellpr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_laporan.png"))); // NOI18N

        btn_Laporan.setFont(new java.awt.Font("Poppins SemiBold", 1, 13)); // NOI18N
        btn_Laporan.setForeground(new java.awt.Color(255, 255, 255));
        btn_Laporan.setText("Laporan");
        btn_Laporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LaporanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LaporanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LaporanMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnLaporanLayout = new javax.swing.GroupLayout(pn_btnLaporan);
        pn_btnLaporan.setLayout(pn_btnLaporanLayout);
        pn_btnLaporanLayout.setHorizontalGroup(
            pn_btnLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnLaporanLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(pn_linelpr, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabellpr)
                .addGap(10, 10, 10)
                .addComponent(btn_Laporan, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        pn_btnLaporanLayout.setVerticalGroup(
            pn_btnLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnLaporanLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pn_btnLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Laporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_btnLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabellpr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addComponent(pn_linelpr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );

        pn_btnLogout.setBackground(new java.awt.Color(83, 17, 42));
        pn_btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        pn_btnLogout.setPreferredSize(new java.awt.Dimension(170, 35));

        pn_linelg.setBackground(new java.awt.Color(83, 17, 42));
        pn_linelg.setPreferredSize(new java.awt.Dimension(6, 25));

        javax.swing.GroupLayout pn_linelgLayout = new javax.swing.GroupLayout(pn_linelg);
        pn_linelg.setLayout(pn_linelgLayout);
        pn_linelgLayout.setHorizontalGroup(
            pn_linelgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        pn_linelgLayout.setVerticalGroup(
            pn_linelgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabellpr1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_logout.png"))); // NOI18N

        btn_Logout.setFont(new java.awt.Font("Poppins SemiBold", 1, 13)); // NOI18N
        btn_Logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_Logout.setText("Keluar");
        btn_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LogoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnLogoutLayout = new javax.swing.GroupLayout(pn_btnLogout);
        pn_btnLogout.setLayout(pn_btnLogoutLayout);
        pn_btnLogoutLayout.setHorizontalGroup(
            pn_btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnLogoutLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(pn_linelg, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabellpr1)
                .addGap(10, 10, 10)
                .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_btnLogoutLayout.setVerticalGroup(
            pn_btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnLogoutLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pn_btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabellpr1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addComponent(pn_linelg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout pn_kiriLayout = new javax.swing.GroupLayout(pn_kiri);
        pn_kiri.setLayout(pn_kiriLayout);
        pn_kiriLayout.setHorizontalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_btnKasir, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(pn_btnProduk, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(pn_btnPegawai, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(pn_btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(pn_btnLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(pn_btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addContainerGap())
        );
        pn_kiriLayout.setVerticalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(pn_btnKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(pn_btnProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pn_btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pn_kiri, java.awt.BorderLayout.LINE_START);

        pn_navbar.setBackground(new java.awt.Color(171, 65, 56));
        pn_navbar.setPreferredSize(new java.awt.Dimension(700, 50));

        lb_tanggal.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        lb_tanggal.setForeground(new java.awt.Color(255, 255, 255));
        lb_tanggal.setText("- - - - - - - - - - - - - - -");

        side_part.setFont(new java.awt.Font("CocogooseProTrial", 0, 24)); // NOI18N
        side_part.setForeground(new java.awt.Color(255, 255, 255));
        side_part.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/side.png"))); // NOI18N
        side_part.setPreferredSize(new java.awt.Dimension(100, 18));

        jLabellpr2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_user.png"))); // NOI18N

        lbuser.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        lbuser.setForeground(new java.awt.Color(255, 255, 255));
        lbuser.setText("OWNER");

        javax.swing.GroupLayout pn_navbarLayout = new javax.swing.GroupLayout(pn_navbar);
        pn_navbar.setLayout(pn_navbarLayout);
        pn_navbarLayout.setHorizontalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_navbarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(side_part, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addComponent(lb_tanggal)
                .addGap(18, 18, 18)
                .addComponent(jLabellpr2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbuser, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pn_navbarLayout.setVerticalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_navbarLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabellpr2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(lb_tanggal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(side_part, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        getContentPane().add(pn_navbar, java.awt.BorderLayout.PAGE_START);

        utama.setBackground(new java.awt.Color(255, 255, 255));
        utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_kananLayout = new javax.swing.GroupLayout(pn_kanan);
        pn_kanan.setLayout(pn_kananLayout);
        pn_kananLayout.setHorizontalGroup(
            pn_kananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_kananLayout.setVerticalGroup(
            pn_kananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pn_kanan, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_KasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_KasirMouseClicked
        utama.removeAll();
        utama.add(new Transaksi(getUserID()));
        utama.repaint();
        utama.revalidate();
    }//GEN-LAST:event_btn_KasirMouseClicked

    private void btn_KasirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_KasirMouseEntered
        pn_btnKasir.setBackground(new Color(171, 65, 56));
        pn_lineksr.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_btn_KasirMouseEntered

    private void btn_KasirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_KasirMouseExited
        pn_btnKasir.setBackground(new Color(83, 17, 42));
        pn_lineksr.setBackground(new Color(83, 17, 42));
    }//GEN-LAST:event_btn_KasirMouseExited

    private void btn_ProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProdukMouseClicked
        utama.removeAll();
        utama.add(new Produk());
        utama.repaint();
        utama.revalidate();
    }//GEN-LAST:event_btn_ProdukMouseClicked

    private void btn_ProdukMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProdukMouseEntered
        pn_btnProduk.setBackground(new Color(171, 65, 56));
        pn_lineprd.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_btn_ProdukMouseEntered

    private void btn_ProdukMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProdukMouseExited
        pn_btnProduk.setBackground(new Color(83, 17, 42));
        pn_lineprd.setBackground(new Color(83, 17, 42));
    }//GEN-LAST:event_btn_ProdukMouseExited

    private void btn_PegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PegawaiMouseClicked
        utama.removeAll();
        utama.add(new Karyawan());
        utama.repaint();
        utama.revalidate();
    }//GEN-LAST:event_btn_PegawaiMouseClicked

    private void btn_PegawaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PegawaiMouseEntered
        pn_btnPegawai.setBackground(new Color(171, 65, 56));
        pn_linepgw.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_btn_PegawaiMouseEntered

    private void btn_PegawaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PegawaiMouseExited
        pn_btnPegawai.setBackground(new Color(83, 17, 42));
        pn_linepgw.setBackground(new Color(83, 17, 42));
    }//GEN-LAST:event_btn_PegawaiMouseExited

    private void btn_DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DashboardMouseClicked
        utama.removeAll();
        utama.add(new Dashboard());
        utama.repaint();
        utama.revalidate();
    }//GEN-LAST:event_btn_DashboardMouseClicked

    private void btn_DashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DashboardMouseEntered
        pn_btnDashboard.setBackground(new Color(171, 65, 56));
        pn_linedsh.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_btn_DashboardMouseEntered

    private void btn_DashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DashboardMouseExited
        pn_btnDashboard.setBackground(new Color(83, 17, 42));
        pn_linedsh.setBackground(new Color(83, 17, 42));
    }//GEN-LAST:event_btn_DashboardMouseExited

    private void btn_LaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LaporanMouseClicked
        utama.removeAll();
        utama.add(new Laporan());
        utama.repaint();
        utama.revalidate();
    }//GEN-LAST:event_btn_LaporanMouseClicked

    private void btn_LaporanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LaporanMouseEntered
        pn_btnLaporan.setBackground(new Color(171, 65, 56));
        pn_linelpr.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_btn_LaporanMouseEntered

    private void btn_LaporanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LaporanMouseExited
        pn_btnLaporan.setBackground(new Color(83, 17, 42));
        pn_linelpr.setBackground(new Color(83, 17, 42));
    }//GEN-LAST:event_btn_LaporanMouseExited

    private void btn_LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogoutMouseClicked
        Form_Login Login = new Form_Login();  
        Login.setVisible(true);                 
        this.dispose();
    }//GEN-LAST:event_btn_LogoutMouseClicked

    private void btn_LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogoutMouseEntered
        pn_btnLogout.setBackground(new Color(171, 65, 56));
        pn_linelg.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_btn_LogoutMouseEntered

    private void btn_LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogoutMouseExited
        pn_btnLogout.setBackground(new Color(83, 17, 42));
        pn_linelg.setBackground(new Color(83, 17, 42));
    }//GEN-LAST:event_btn_LogoutMouseExited

    private void WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_WindowOpened
        utama.removeAll();
        utama.add(new Dashboard());
        utama.repaint();
        utama.revalidate();
    }//GEN-LAST:event_WindowOpened

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e){
            e.printStackTrace();          
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String userID = "ID";
                new Menu_Utama(userID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Dashboard;
    private javax.swing.JLabel btn_Kasir;
    private javax.swing.JLabel btn_Laporan;
    private javax.swing.JLabel btn_Logout;
    private javax.swing.JLabel btn_Pegawai;
    private javax.swing.JLabel btn_Produk;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabeldsh;
    private javax.swing.JLabel jLabelksr;
    private javax.swing.JLabel jLabellpr;
    private javax.swing.JLabel jLabellpr1;
    private javax.swing.JLabel jLabellpr2;
    private javax.swing.JLabel jLabelpgw;
    private javax.swing.JLabel jLabelprd;
    private javax.swing.JLabel lb_tanggal;
    private javax.swing.JLabel lbuser;
    private javax.swing.JPanel pn_btnDashboard;
    private javax.swing.JPanel pn_btnKasir;
    private javax.swing.JPanel pn_btnLaporan;
    private javax.swing.JPanel pn_btnLogout;
    private javax.swing.JPanel pn_btnPegawai;
    private javax.swing.JPanel pn_btnProduk;
    private javax.swing.JPanel pn_kanan;
    private javax.swing.JPanel pn_kiri;
    private javax.swing.JPanel pn_linedsh;
    private javax.swing.JPanel pn_lineksr;
    private javax.swing.JPanel pn_linelg;
    private javax.swing.JPanel pn_linelpr;
    private javax.swing.JPanel pn_linepgw;
    private javax.swing.JPanel pn_lineprd;
    private javax.swing.JPanel pn_navbar;
    private javax.swing.JLabel side_part;
    private javax.swing.JPanel utama;
    // End of variables declaration//GEN-END:variables

private String Level;
public void checkUser(String role) {
    if (role != null) {
        if (role.equals("1")) {
            // Tampilkan panel untuk owner
            pn_btnLaporan.setVisible(true);
        } else if (role.equals("2")) {
            // Tampilkan panel untuk karyawan
            pn_btnLaporan.setVisible(false);
            lbuser.setText("Karyawan");
        }
    } else {
        // Penanganan jika login gagal atau koneksi database tidak tersedia
    }
}

   

}
