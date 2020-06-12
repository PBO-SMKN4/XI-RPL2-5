
package Management_Sekolah;

import Management_Sekolah.DatabaseConnection;
import java.sql.Connection;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class dashboardSiswa extends javax.swing.JFrame {
    
    Connection koneksi;
    
    public dashboardSiswa() {
        initComponents();
        koneksi = DatabaseConnection.getKoneksi("localhost", "3306", "root", "", "db_manajemensekolah");
        showData();
        showDataMateri();
        header.setFocusable(true);       
    }
    
    DefaultTableModel dtm;
    public void showData(){
        String[] kolom = {"NO","Nama Matpel","pengetahuan","keterampilan","sikap"};
        
        dtm = new DefaultTableModel(null, kolom);
        try{
            Statement stmt = koneksi.createStatement();
            String query = "SELECT * FROM t_siswa,t_matpel JOIN t_rekapnilai\n" 
                    + "WHERE t_matpel.kd_matpel = t_rekapnilai.kd_matpel "
                    + "AND t_siswa.nis = t_rekapnilai.nis ";
            ResultSet rs = stmt.executeQuery(query);
            int no = 1;
            while(rs.next()){
                String nama_matpel    = rs.getString("nama_matpel");
                String pengetahuan    = rs.getString("pengetahuan");
                String keterampilan   = rs.getString("keterampilan");
                String sikap          = rs.getString("sikap");
                
                dtm.addRow(new String[]{no+"",nama_matpel,pengetahuan,keterampilan,sikap});
                no++;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan di Query");
        }
        tbl_rapot1.setModel(dtm);
    }
    
    DefaultTableModel dtm2;
    public void showDataMateri(){
        String[] kolom = {"NO","Nama Matpel","Tugas","Keterangan"};
        
        dtm2 = new DefaultTableModel(null, kolom);
        try{
            Statement stmt = koneksi.createStatement();
            String query = "SELECT * FROM t_materi";
            ResultSet rs = stmt.executeQuery(query);
            int no = 1;
            while(rs.next()){
                String nama_matpel    = rs.getString("nama_matpel");
                String judul          = rs.getString("judul");
                String catatan        = rs.getString("catatan");
                JJudul.setText(rs.getString("judul"));
                Jcatatan.setText(rs.getString("catatan")); 
                
                dtm2.addRow(new String[]{no+"",nama_matpel,judul,catatan});
                no++;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan di Query");
        }
        tbl_materi1.setModel(dtm2);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDSsiswa = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        search = new javax.swing.JTextField();
        profile = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        btnHome = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnMateri = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnNilai = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnMapel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnSetting = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnHome1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        btnMateri1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnNilai1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnMapel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnSetting1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnHome2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        btnMateri2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btnNilai2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        btnMapel2 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        btnSetting2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        btnLogout1 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        btnLogout2 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        tampilHome = new javax.swing.JPanel();
        tampilMateri = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel17 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_materi1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        Jcatatan = new javax.swing.JLabel();
        JJudul = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jPanel63 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jPanel66 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jPanel69 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jPanel75 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jPanel78 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jPanel81 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        tampilNilai = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_rapot1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        tampilMaPel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tampilSetting = new javax.swing.JPanel();
        Theme = new javax.swing.JPanel();
        Theme1 = new javax.swing.JPanel();
        Theme2 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelDSsiswa.setMinimumSize(new java.awt.Dimension(1000, 625));
        PanelDSsiswa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(0, 0, 0));

        search.setBackground(new java.awt.Color(0, 0, 0));
        search.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        search.setForeground(new java.awt.Color(153, 153, 153));
        search.setText("Search...");
        search.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFocusLost(evt);
            }
        });

        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-2-24.png"))); // NOI18N
        profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/active-search-24.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoSM1.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(profile)
                .addGap(42, 42, 42))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(headerLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel43))
                            .addGroup(headerLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(headerLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(profile)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        PanelDSsiswa.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 90));

        sidebar.setBackground(new java.awt.Color(0, 0, 0));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setBackground(new java.awt.Color(0, 0, 0));
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home-5-24.png"))); // NOI18N
        jLabel18.setText("Beranda");

        javax.swing.GroupLayout btnHomeLayout = new javax.swing.GroupLayout(btnHome);
        btnHome.setLayout(btnHomeLayout);
        btnHomeLayout.setHorizontalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHomeLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHomeLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        sidebar.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 50));

        btnMateri.setBackground(new java.awt.Color(0, 0, 0));
        btnMateri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMateri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMateriMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMateriMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMateriMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book-16-24.png"))); // NOI18N
        jLabel10.setText("Materi");

        javax.swing.GroupLayout btnMateriLayout = new javax.swing.GroupLayout(btnMateri);
        btnMateri.setLayout(btnMateriLayout);
        btnMateriLayout.setHorizontalGroup(
            btnMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(btnMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMateriLayout.createSequentialGroup()
                    .addContainerGap(18, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(83, Short.MAX_VALUE)))
        );
        btnMateriLayout.setVerticalGroup(
            btnMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMateriLayout.createSequentialGroup()
                    .addContainerGap(13, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        sidebar.add(btnMateri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, 50));

        btnNilai.setBackground(new java.awt.Color(0, 0, 0));
        btnNilai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNilaiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNilaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNilaiMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/analytics-24.png"))); // NOI18N
        jLabel11.setText("Daftar Nilai");

        javax.swing.GroupLayout btnNilaiLayout = new javax.swing.GroupLayout(btnNilai);
        btnNilai.setLayout(btnNilaiLayout);
        btnNilaiLayout.setHorizontalGroup(
            btnNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(btnNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNilaiLayout.createSequentialGroup()
                    .addContainerGap(36, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(59, Short.MAX_VALUE)))
        );
        btnNilaiLayout.setVerticalGroup(
            btnNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNilaiLayout.createSequentialGroup()
                    .addContainerGap(13, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        sidebar.add(btnNilai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, 50));

        btnMapel.setBackground(new java.awt.Color(0, 0, 0));
        btnMapel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMapelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMapelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMapelMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/list-ingredients-24.png"))); // NOI18N
        jLabel12.setText("Daftar Pelajaran");

        javax.swing.GroupLayout btnMapelLayout = new javax.swing.GroupLayout(btnMapel);
        btnMapel.setLayout(btnMapelLayout);
        btnMapelLayout.setHorizontalGroup(
            btnMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(btnMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnMapelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnMapelLayout.setVerticalGroup(
            btnMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnMapelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        sidebar.add(btnMapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 210, 50));

        btnSetting.setBackground(new java.awt.Color(0, 0, 0));
        btnSetting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSetting.setFocusCycleRoot(true);
        btnSetting.setFocusTraversalPolicyProvider(true);
        btnSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSettingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSettingMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSettingMousePressed(evt);
            }
        });
        btnSetting.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnSettingKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gear-2-24.png"))); // NOI18N
        jLabel13.setText("Pengaturan");

        javax.swing.GroupLayout btnSettingLayout = new javax.swing.GroupLayout(btnSetting);
        btnSetting.setLayout(btnSettingLayout);
        btnSettingLayout.setHorizontalGroup(
            btnSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSettingLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        btnSettingLayout.setVerticalGroup(
            btnSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSettingLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        sidebar.add(btnSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 210, 50));

        btnHome1.setBackground(new java.awt.Color(0, 0, 0));
        btnHome1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHome1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome1MouseExited(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home-5-24.png"))); // NOI18N
        jLabel19.setText("Beranda");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnHome1Layout = new javax.swing.GroupLayout(btnHome1);
        btnHome1.setLayout(btnHome1Layout);
        btnHome1Layout.setHorizontalGroup(
            btnHome1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHome1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        btnHome1Layout.setVerticalGroup(
            btnHome1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHome1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        sidebar.add(btnHome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 50));

        btnMateri1.setBackground(new java.awt.Color(0, 0, 0));
        btnMateri1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMateri1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMateri1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMateri1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMateri1MouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book-16-24.png"))); // NOI18N
        jLabel14.setText("Materi");

        javax.swing.GroupLayout btnMateri1Layout = new javax.swing.GroupLayout(btnMateri1);
        btnMateri1.setLayout(btnMateri1Layout);
        btnMateri1Layout.setHorizontalGroup(
            btnMateri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(btnMateri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMateri1Layout.createSequentialGroup()
                    .addContainerGap(18, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(83, Short.MAX_VALUE)))
        );
        btnMateri1Layout.setVerticalGroup(
            btnMateri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnMateri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMateri1Layout.createSequentialGroup()
                    .addContainerGap(13, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        sidebar.add(btnMateri1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, 50));

        btnNilai1.setBackground(new java.awt.Color(0, 0, 0));
        btnNilai1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNilai1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNilai1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNilai1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNilai1MouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/analytics-24.png"))); // NOI18N
        jLabel15.setText("Daftar Nilai");

        javax.swing.GroupLayout btnNilai1Layout = new javax.swing.GroupLayout(btnNilai1);
        btnNilai1.setLayout(btnNilai1Layout);
        btnNilai1Layout.setHorizontalGroup(
            btnNilai1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(btnNilai1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNilai1Layout.createSequentialGroup()
                    .addContainerGap(36, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(59, Short.MAX_VALUE)))
        );
        btnNilai1Layout.setVerticalGroup(
            btnNilai1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnNilai1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNilai1Layout.createSequentialGroup()
                    .addContainerGap(13, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        sidebar.add(btnNilai1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, 50));

        btnMapel1.setBackground(new java.awt.Color(0, 0, 0));
        btnMapel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMapel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMapel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMapel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMapel1MouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/list-ingredients-24.png"))); // NOI18N
        jLabel16.setText("Daftar Pelajaran");

        javax.swing.GroupLayout btnMapel1Layout = new javax.swing.GroupLayout(btnMapel1);
        btnMapel1.setLayout(btnMapel1Layout);
        btnMapel1Layout.setHorizontalGroup(
            btnMapel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(btnMapel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnMapel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnMapel1Layout.setVerticalGroup(
            btnMapel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnMapel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnMapel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        sidebar.add(btnMapel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 210, 50));

        btnSetting1.setBackground(new java.awt.Color(0, 0, 0));
        btnSetting1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSetting1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSetting1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSetting1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSetting1MouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gear-2-24.png"))); // NOI18N
        jLabel17.setText("Pengaturan");

        javax.swing.GroupLayout btnSetting1Layout = new javax.swing.GroupLayout(btnSetting1);
        btnSetting1.setLayout(btnSetting1Layout);
        btnSetting1Layout.setHorizontalGroup(
            btnSetting1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSetting1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        btnSetting1Layout.setVerticalGroup(
            btnSetting1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSetting1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        sidebar.add(btnSetting1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 210, 50));

        btnHome2.setBackground(new java.awt.Color(44, 62, 80));
        btnHome2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHome2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome2MouseExited(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home-5-24.png"))); // NOI18N
        jLabel20.setText("Beranda");

        javax.swing.GroupLayout btnHome2Layout = new javax.swing.GroupLayout(btnHome2);
        btnHome2.setLayout(btnHome2Layout);
        btnHome2Layout.setHorizontalGroup(
            btnHome2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHome2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        btnHome2Layout.setVerticalGroup(
            btnHome2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHome2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        sidebar.add(btnHome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 50));

        btnMateri2.setBackground(new java.awt.Color(44, 62, 80));
        btnMateri2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMateri2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMateri2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMateri2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMateri2MouseExited(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book-16-24.png"))); // NOI18N
        jLabel21.setText("Materi");

        javax.swing.GroupLayout btnMateri2Layout = new javax.swing.GroupLayout(btnMateri2);
        btnMateri2.setLayout(btnMateri2Layout);
        btnMateri2Layout.setHorizontalGroup(
            btnMateri2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(btnMateri2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMateri2Layout.createSequentialGroup()
                    .addContainerGap(18, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(83, Short.MAX_VALUE)))
        );
        btnMateri2Layout.setVerticalGroup(
            btnMateri2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnMateri2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMateri2Layout.createSequentialGroup()
                    .addContainerGap(13, Short.MAX_VALUE)
                    .addComponent(jLabel21)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        sidebar.add(btnMateri2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, 50));

        btnNilai2.setBackground(new java.awt.Color(44, 62, 80));
        btnNilai2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNilai2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNilai2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNilai2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNilai2MouseExited(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/analytics-24.png"))); // NOI18N
        jLabel22.setText("Daftar Nilai");

        javax.swing.GroupLayout btnNilai2Layout = new javax.swing.GroupLayout(btnNilai2);
        btnNilai2.setLayout(btnNilai2Layout);
        btnNilai2Layout.setHorizontalGroup(
            btnNilai2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(btnNilai2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNilai2Layout.createSequentialGroup()
                    .addContainerGap(36, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(59, Short.MAX_VALUE)))
        );
        btnNilai2Layout.setVerticalGroup(
            btnNilai2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnNilai2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNilai2Layout.createSequentialGroup()
                    .addContainerGap(13, Short.MAX_VALUE)
                    .addComponent(jLabel22)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        sidebar.add(btnNilai2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, 50));

        btnMapel2.setBackground(new java.awt.Color(44, 62, 80));
        btnMapel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMapel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMapel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMapel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMapel2MouseExited(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/list-ingredients-24.png"))); // NOI18N
        jLabel23.setText("Daftar Pelajaran");

        javax.swing.GroupLayout btnMapel2Layout = new javax.swing.GroupLayout(btnMapel2);
        btnMapel2.setLayout(btnMapel2Layout);
        btnMapel2Layout.setHorizontalGroup(
            btnMapel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(btnMapel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnMapel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel23)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnMapel2Layout.setVerticalGroup(
            btnMapel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnMapel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnMapel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel23)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        sidebar.add(btnMapel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 210, 50));

        btnSetting2.setBackground(new java.awt.Color(44, 62, 80));
        btnSetting2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSetting2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSetting2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSetting2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSetting2MouseExited(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gear-2-24.png"))); // NOI18N
        jLabel24.setText("Pengaturan");

        javax.swing.GroupLayout btnSetting2Layout = new javax.swing.GroupLayout(btnSetting2);
        btnSetting2.setLayout(btnSetting2Layout);
        btnSetting2Layout.setHorizontalGroup(
            btnSetting2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSetting2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        btnSetting2Layout.setVerticalGroup(
            btnSetting2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSetting2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        sidebar.add(btnSetting2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 210, 50));

        btnLogout.setBackground(new java.awt.Color(0, 0, 0));
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogoutMousePressed(evt);
            }
        });
        btnLogout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnLogoutKeyReleased(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/door-9-24.png"))); // NOI18N
        jLabel45.setText("Logout");

        javax.swing.GroupLayout btnLogoutLayout = new javax.swing.GroupLayout(btnLogout);
        btnLogout.setLayout(btnLogoutLayout);
        btnLogoutLayout.setHorizontalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogoutLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        btnLogoutLayout.setVerticalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogoutLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        sidebar.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 210, 50));

        btnLogout1.setBackground(new java.awt.Color(0, 0, 0));
        btnLogout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogout1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogout1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogout1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogout1MousePressed(evt);
            }
        });
        btnLogout1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnLogout1KeyReleased(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/door-9-24.png"))); // NOI18N
        jLabel46.setText("Logout");

        javax.swing.GroupLayout btnLogout1Layout = new javax.swing.GroupLayout(btnLogout1);
        btnLogout1.setLayout(btnLogout1Layout);
        btnLogout1Layout.setHorizontalGroup(
            btnLogout1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogout1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        btnLogout1Layout.setVerticalGroup(
            btnLogout1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogout1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        sidebar.add(btnLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 210, 50));

        btnLogout2.setBackground(new java.awt.Color(44, 62, 80));
        btnLogout2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogout2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogout2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogout2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogout2MousePressed(evt);
            }
        });
        btnLogout2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnLogout2KeyReleased(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/door-9-24.png"))); // NOI18N
        jLabel47.setText("Logout");

        javax.swing.GroupLayout btnLogout2Layout = new javax.swing.GroupLayout(btnLogout2);
        btnLogout2.setLayout(btnLogout2Layout);
        btnLogout2Layout.setHorizontalGroup(
            btnLogout2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogout2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        btnLogout2Layout.setVerticalGroup(
            btnLogout2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogout2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        sidebar.add(btnLogout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 210, 50));

        jLabel42.setFont(new java.awt.Font("Futura Md BT", 0, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Dashboard");
        sidebar.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 124, 27));

        PanelDSsiswa.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 210, 540));

        tampilHome.setBackground(new java.awt.Color(255, 255, 255));
        tampilHome.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout tampilHomeLayout = new javax.swing.GroupLayout(tampilHome);
        tampilHome.setLayout(tampilHomeLayout);
        tampilHomeLayout.setHorizontalGroup(
            tampilHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        tampilHomeLayout.setVerticalGroup(
            tampilHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        PanelDSsiswa.add(tampilHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 790, 540));

        tampilMateri.setBackground(new java.awt.Color(255, 255, 255));
        tampilMateri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tampilMateriMouseClicked(evt);
            }
        });

        jPanel84.setBackground(new java.awt.Color(255, 153, 204));
        jPanel84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel84MouseClicked(evt);
            }
        });

        jLabel117.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setText("<html> MATERI<p>TERBARU</p> </html>");

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/literature-32.png"))); // NOI18N

        tbl_materi1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_materi1.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tbl_materi1);
        if (tbl_materi1.getColumnModel().getColumnCount() > 0) {
            tbl_materi1.getColumnModel().getColumn(0).setResizable(false);
            tbl_materi1.getColumnModel().getColumn(1).setResizable(false);
            tbl_materi1.getColumnModel().getColumn(2).setResizable(false);
            tbl_materi1.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 569, Short.MAX_VALUE)
                .addComponent(jLabel118)
                .addGap(18, 18, 18))
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel118)
                    .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addComponent(jPanel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("New", jPanel17);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel85.setBackground(new java.awt.Color(204, 0, 0));

        jLabel119.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(255, 255, 255));
        jLabel119.setText("PKN");

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/globe-5-32.png"))); // NOI18N

        jLabel121.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setText("deadline  :");

        jLabel134.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(255, 255, 255));
        jLabel134.setText("judul        :");

        jLabel135.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(255, 255, 255));
        jLabel135.setText("tugas       :");

        jLabel136.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(255, 255, 255));
        jLabel136.setText("12-06-2020/ 23.59 WIB");

        Jcatatan.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        Jcatatan.setForeground(new java.awt.Color(255, 255, 255));
        Jcatatan.setText("....");

        JJudul.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        JJudul.setForeground(new java.awt.Color(255, 255, 255));
        JJudul.setText("....");

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 577, Short.MAX_VALUE)
                .addComponent(jLabel120)
                .addContainerGap())
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel85Layout.createSequentialGroup()
                        .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Jcatatan, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel85Layout.createSequentialGroup()
                        .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel136))
                    .addGroup(jPanel85Layout.createSequentialGroup()
                        .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel120)
                    .addComponent(jLabel119))
                .addGap(66, 66, 66)
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel121)
                    .addComponent(jLabel136))
                .addGap(18, 18, 18)
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel134)
                    .addComponent(JJudul))
                .addGap(18, 18, 18)
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel135)
                    .addComponent(Jcatatan))
                .addContainerGap(295, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("PKN", jPanel4);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(0, 102, 51));

        jLabel3.setFont(new java.awt.Font("Futura Md BT", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>\nPENDIDIKAN\n<p>AGAMA ISLAM\n</html>");

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mosque-32.png"))); // NOI18N

        jLabel122.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(255, 255, 255));
        jLabel122.setText("Belum ada tugas");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 577, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addContainerGap())
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(82, 82, 82)
                .addComponent(jLabel122)
                .addContainerGap(349, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("PAI", jPanel13);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jPanel15.setBackground(new java.awt.Color(255, 102, 0));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel15MouseClicked(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("<html>\nBAHASA\n<p>INDONESIA</p>\n</html>");

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/literature-32.png"))); // NOI18N

        jLabel123.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setText("Belum ada tugas");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addContainerGap())
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(70, 70, 70)
                .addComponent(jLabel123)
                .addContainerGap(359, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("B. Indonesia", jPanel19);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        jPanel21.setBackground(new java.awt.Color(0, 102, 102));

        jLabel54.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("MATEMATIKA");

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/math-32.png"))); // NOI18N

        jLabel124.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(255, 255, 255));
        jLabel124.setText("Belum ada tugas");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel55)
                .addContainerGap())
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55))
                .addGap(75, 75, 75)
                .addComponent(jLabel124)
                .addContainerGap(362, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Matematika", jPanel29);

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));

        jPanel25.setBackground(new java.awt.Color(255, 102, 0));

        jLabel51.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("<html> BAHASA <p>INGGRIS</p> </html>");

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/literature-32.png"))); // NOI18N

        jLabel125.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(255, 255, 255));
        jLabel125.setText("Belum ada tugas");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel56)
                .addContainerGap())
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addGap(67, 67, 67)
                .addComponent(jLabel125)
                .addContainerGap(362, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("B. Inggris", jPanel41);

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));

        jPanel33.setBackground(new java.awt.Color(204, 0, 0));

        jLabel59.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("OLAHRAGA");

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/soccer-2-32.png"))); // NOI18N

        jLabel126.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(255, 255, 255));
        jLabel126.setText("Belum ada tugas");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel63)
                .addContainerGap())
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59)
                    .addComponent(jLabel63))
                .addGap(75, 75, 75)
                .addComponent(jLabel126)
                .addContainerGap(362, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("OR", jPanel53);

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));

        jPanel37.setBackground(new java.awt.Color(0, 102, 102));

        jLabel67.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("<html> BAHASA <p>SUNDA</p> </html>");

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/literature-32.png"))); // NOI18N

        jLabel127.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(255, 255, 255));
        jLabel127.setText("Belum ada tugas");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel71)
                .addContainerGap())
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71))
                .addGap(65, 65, 65)
                .addComponent(jLabel127)
                .addContainerGap(364, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("B. Sunda", jPanel63);

        jPanel66.setBackground(new java.awt.Color(255, 255, 255));

        jPanel45.setBackground(new java.awt.Color(0, 102, 51));

        jLabel75.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("KONSELING");

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/favorite-7-32.png"))); // NOI18N

        jLabel128.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(255, 255, 255));
        jLabel128.setText("Belum ada tugas");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel93)
                .addContainerGap())
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel75)
                    .addComponent(jLabel93))
                .addGap(67, 67, 67)
                .addComponent(jLabel128)
                .addContainerGap(370, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("BK", jPanel66);

        jPanel69.setBackground(new java.awt.Color(255, 255, 255));

        jPanel49.setBackground(new java.awt.Color(255, 102, 0));

        jLabel94.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("PKK");

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cash-receiving-32.png"))); // NOI18N

        jLabel129.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(255, 255, 255));
        jLabel129.setText("Belum ada tugas");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel95)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel49Layout.createSequentialGroup()
                .addContainerGap(283, Short.MAX_VALUE)
                .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel94)
                    .addComponent(jLabel95))
                .addGap(77, 77, 77)
                .addComponent(jLabel129)
                .addContainerGap(360, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("PKK", jPanel69);

        jPanel72.setBackground(new java.awt.Color(255, 255, 255));

        jPanel57.setBackground(new java.awt.Color(0, 102, 102));

        jLabel96.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("PPL");

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/flow-chart-32.png"))); // NOI18N

        jLabel130.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(255, 255, 255));
        jLabel130.setText("Belum ada tugas");

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel97)
                .addContainerGap())
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel96)
                    .addComponent(jLabel97))
                .addGap(66, 66, 66)
                .addComponent(jLabel130)
                .addContainerGap(371, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("PPL", jPanel72);

        jPanel75.setBackground(new java.awt.Color(255, 255, 255));

        jPanel62.setBackground(new java.awt.Color(204, 0, 0));

        jLabel98.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("<html> BASIS <p>DATA</p> </html>");

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/database-5-32.png"))); // NOI18N

        jLabel131.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(255, 255, 255));
        jLabel131.setText("Belum ada tugas");

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel99)
                .addContainerGap())
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(295, Short.MAX_VALUE))
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99))
                .addGap(64, 64, 64)
                .addComponent(jLabel131)
                .addContainerGap(365, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Basis Data", jPanel75);

        jPanel78.setBackground(new java.awt.Color(255, 255, 255));

        jPanel64.setBackground(new java.awt.Color(0, 102, 51));

        jLabel100.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setText("PWPB");

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/website-design-32.png"))); // NOI18N

        jLabel132.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(255, 255, 255));
        jLabel132.setText("Belum ada tugas");

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel101)
                .addContainerGap())
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel101)
                    .addComponent(jLabel100))
                .addGap(69, 69, 69)
                .addComponent(jLabel132)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("PWPB", jPanel78);

        jPanel81.setBackground(new java.awt.Color(255, 255, 255));

        jPanel65.setBackground(new java.awt.Color(204, 0, 0));

        jLabel102.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("PBO");

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/code-optimization-32.png"))); // NOI18N

        jLabel133.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(255, 255, 255));
        jLabel133.setText("Belum ada tugas");

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel65Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel103)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel65Layout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(303, 303, 303))
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102)
                    .addComponent(jLabel103))
                .addGap(72, 72, 72)
                .addComponent(jLabel133)
                .addContainerGap(365, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("PBO", jPanel81);

        javax.swing.GroupLayout tampilMateriLayout = new javax.swing.GroupLayout(tampilMateri);
        tampilMateri.setLayout(tampilMateriLayout);
        tampilMateriLayout.setHorizontalGroup(
            tampilMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilMateriLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTabbedPane2)
                .addGap(21, 21, 21))
        );
        tampilMateriLayout.setVerticalGroup(
            tampilMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilMateriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelDSsiswa.add(tampilMateri, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 790, 540));

        tampilNilai.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Semester1", "Semester 2" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        tbl_rapot1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mata Pelajaran", "Pengetahuan", "Keterampilan", "Sikapl"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_rapot1);
        if (tbl_rapot1.getColumnModel().getColumnCount() > 0) {
            tbl_rapot1.getColumnModel().getColumn(0).setResizable(false);
            tbl_rapot1.getColumnModel().getColumn(1).setResizable(false);
            tbl_rapot1.getColumnModel().getColumn(2).setResizable(false);
            tbl_rapot1.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Rapor", jPanel2);

        jTable2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "T1", "T2", "T3", "PRESENTASl", "UH1", "UH2", "UH3", "TA", "PAS"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.setSelectionBackground(new java.awt.Color(62, 226, 141));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        javax.swing.GroupLayout tampilNilaiLayout = new javax.swing.GroupLayout(tampilNilai);
        tampilNilai.setLayout(tampilNilaiLayout);
        tampilNilaiLayout.setHorizontalGroup(
            tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilNilaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        tampilNilaiLayout.setVerticalGroup(
            tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilNilaiLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelDSsiswa.add(tampilNilai, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 790, 540));

        tampilMaPel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("MAPEL");

        javax.swing.GroupLayout tampilMaPelLayout = new javax.swing.GroupLayout(tampilMaPel);
        tampilMaPel.setLayout(tampilMaPelLayout);
        tampilMaPelLayout.setHorizontalGroup(
            tampilMaPelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(tampilMaPelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tampilMaPelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        tampilMaPelLayout.setVerticalGroup(
            tampilMaPelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(tampilMaPelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tampilMaPelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        PanelDSsiswa.add(tampilMaPel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 790, 540));

        tampilSetting.setBackground(new java.awt.Color(255, 255, 255));

        Theme.setBackground(new java.awt.Color(153, 0, 51));
        Theme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThemeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ThemeLayout = new javax.swing.GroupLayout(Theme);
        Theme.setLayout(ThemeLayout);
        ThemeLayout.setHorizontalGroup(
            ThemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        ThemeLayout.setVerticalGroup(
            ThemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );

        Theme1.setBackground(new java.awt.Color(0, 153, 153));
        Theme1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Theme1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Theme1Layout = new javax.swing.GroupLayout(Theme1);
        Theme1.setLayout(Theme1Layout);
        Theme1Layout.setHorizontalGroup(
            Theme1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Theme1Layout.setVerticalGroup(
            Theme1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );

        Theme2.setBackground(new java.awt.Color(255, 255, 102));
        Theme2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Theme2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Theme2Layout = new javax.swing.GroupLayout(Theme2);
        Theme2.setLayout(Theme2Layout);
        Theme2Layout.setHorizontalGroup(
            Theme2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Theme2Layout.setVerticalGroup(
            Theme2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );

        jLabel79.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel79.setText("Tema");

        jLabel48.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jLabel48.setText("Tema 1");

        jLabel49.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jLabel49.setText("Tema 2");

        jLabel50.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        jLabel50.setText("Tema 3");

        javax.swing.GroupLayout tampilSettingLayout = new javax.swing.GroupLayout(tampilSetting);
        tampilSetting.setLayout(tampilSettingLayout);
        tampilSettingLayout.setHorizontalGroup(
            tampilSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilSettingLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(tampilSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilSettingLayout.createSequentialGroup()
                        .addGroup(tampilSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tampilSettingLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(Theme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(Theme1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(Theme2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))))
            .addGroup(tampilSettingLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel48)
                .addGap(184, 184, 184)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addGap(137, 137, 137))
        );
        tampilSettingLayout.setVerticalGroup(
            tampilSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilSettingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tampilSettingLayout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(Theme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Theme2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Theme1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tampilSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50))
                .addGap(0, 152, Short.MAX_VALUE))
        );

        PanelDSsiswa.add(tampilSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 790, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelDSsiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelDSsiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setColor(JPanel p){
        p.setBackground(new Color(153,0,51));
    }
    public void resetColor(JPanel pi){
        pi.setBackground(new Color(0, 0 ,0));
    }
    
    
    
    
    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        // TODO add your handling code here:
        
        tampilHome.setVisible(true);
        tampilMateri.setVisible(false);
        tampilNilai.setVisible(false);
        tampilMaPel.setVisible(false);
        tampilSetting.setVisible(false);
        
        Theme.setEnabled(true);
        Theme1.setEnabled(true);
        Theme2.setEnabled(true);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        // TODO add your handling code here:
        setColor(btnHome);
        
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        // TODO add your handling code here:
        resetColor(btnHome);
    }//GEN-LAST:event_btnHomeMouseExited

    
    
    
    private void btnMateriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMateriMouseClicked
        // TODO add your handling code here:
        tampilHome.setVisible(false);
        tampilMateri.setVisible(true);
        tampilNilai.setVisible(false);
        tampilMaPel.setVisible(false);
        tampilSetting.setVisible(false);
        
        Theme.setEnabled(true);
        Theme1.setEnabled(true);
        Theme2.setEnabled(true);
        
    }//GEN-LAST:event_btnMateriMouseClicked

    private void btnMateriMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMateriMouseEntered
        // TODO add your handling code here:
        setColor(btnMateri);
    }//GEN-LAST:event_btnMateriMouseEntered

    private void btnMateriMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMateriMouseExited
        // TODO add your handling code here:
        resetColor(btnMateri);
    }//GEN-LAST:event_btnMateriMouseExited

    private void btnNilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNilaiMouseClicked
        // TODO add your handling code here:
        tampilHome.setVisible(false);
        tampilMateri.setVisible(false);
        tampilNilai.setVisible(true);
        tampilMaPel.setVisible(false);
        tampilSetting.setVisible(false);
        
        Theme.setEnabled(true);
        Theme1.setEnabled(true);
        Theme2.setEnabled(true);
        
    }//GEN-LAST:event_btnNilaiMouseClicked

    private void btnNilaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNilaiMouseEntered
        // TODO add your handling code here:
        setColor(btnNilai);
    }//GEN-LAST:event_btnNilaiMouseEntered

    private void btnNilaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNilaiMouseExited
        // TODO add your handling code here:
        resetColor(btnNilai);
    }//GEN-LAST:event_btnNilaiMouseExited

    private void btnMapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMapelMouseClicked
        // TODO add your handling code here:
        tampilHome.setVisible(false);
        tampilMateri.setVisible(false);
        tampilNilai.setVisible(false);
        tampilMaPel.setVisible(true);
        tampilSetting.setVisible(false);
        
        Theme.setEnabled(true);
        Theme1.setEnabled(true);
        Theme2.setEnabled(true);
    }//GEN-LAST:event_btnMapelMouseClicked

    private void btnMapelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMapelMouseEntered
        // TODO add your handling code here:
        setColor(btnMapel);
    }//GEN-LAST:event_btnMapelMouseEntered

    private void btnMapelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMapelMouseExited
        // TODO add your handling code here:
        resetColor(btnMapel);
    }//GEN-LAST:event_btnMapelMouseExited

    private void btnSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingMouseClicked
        // TODO add your handling code here:
        tampilHome.setVisible(false);
        tampilMateri.setVisible(false);
        tampilNilai.setVisible(false);
        tampilMaPel.setVisible(false);
        tampilSetting.setVisible(true);
        
    }//GEN-LAST:event_btnSettingMouseClicked

    private void btnSettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingMouseEntered
        // TODO add your handling code here:
        setColor(btnSetting);
    }//GEN-LAST:event_btnSettingMouseEntered

    private void btnSettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingMouseExited
        // TODO add your handling code here:
        resetColor(btnSetting);
    }//GEN-LAST:event_btnSettingMouseExited

    
    
    
    public void setColor1(JPanel p){
        p.setBackground(new Color(0, 153, 153));
    }
    public void resetColor1(JPanel pi){
        pi.setBackground(new Color(0, 0, 0));
    }
    
    private void btnHome1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome1MouseClicked
        // TODO add your handling code here:
        tampilHome.setVisible(true);
        tampilMateri.setVisible(false);
        tampilNilai.setVisible(false);
        tampilMaPel.setVisible(false);
        tampilSetting.setVisible(false);
        
        Theme.setEnabled(true);
        Theme1.setEnabled(true);
        Theme2.setEnabled(true);
    }//GEN-LAST:event_btnHome1MouseClicked

    private void btnHome1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome1MouseEntered
        // TODO add your handling code here:
        setColor1(btnHome1);
    }//GEN-LAST:event_btnHome1MouseEntered

    private void btnHome1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome1MouseExited
        // TODO add your handling code here:
        resetColor1(btnHome1);
    }//GEN-LAST:event_btnHome1MouseExited

    private void btnMateri1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMateri1MouseClicked
        // TODO add your handling code here:
        tampilHome.setVisible(false);
        tampilMateri.setVisible(true);
        tampilNilai.setVisible(false);
        tampilMaPel.setVisible(false);
        tampilSetting.setVisible(false);
        
        Theme.setEnabled(true);
        Theme1.setEnabled(true);
        Theme2.setEnabled(true);
    }//GEN-LAST:event_btnMateri1MouseClicked

    private void btnMateri1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMateri1MouseEntered
        // TODO add your handling code here:
        setColor1(btnMateri1);
    }//GEN-LAST:event_btnMateri1MouseEntered

    private void btnMateri1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMateri1MouseExited
        // TODO add your handling code here:
        resetColor1(btnMateri1);
    }//GEN-LAST:event_btnMateri1MouseExited

    private void btnNilai1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNilai1MouseClicked
        // TODO add your handling code here:
        tampilHome.setVisible(false);
        tampilMateri.setVisible(false);
        tampilNilai.setVisible(true);
        tampilMaPel.setVisible(false);
        tampilSetting.setVisible(false);
        
        Theme.setEnabled(true);
        Theme1.setEnabled(true);
        Theme2.setEnabled(true);
    }//GEN-LAST:event_btnNilai1MouseClicked

    private void btnNilai1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNilai1MouseEntered
        // TODO add your handling code here:
        setColor1(btnNilai1);
    }//GEN-LAST:event_btnNilai1MouseEntered

    private void btnNilai1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNilai1MouseExited
        // TODO add your handling code here:
        resetColor1(btnNilai1);
    }//GEN-LAST:event_btnNilai1MouseExited

    private void btnMapel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMapel1MouseClicked
        // TODO add your handling code here:
        tampilHome.setVisible(false);
        tampilMateri.setVisible(false);
        tampilNilai.setVisible(false);
        tampilMaPel.setVisible(true);
        tampilSetting.setVisible(false);
        
        Theme.setEnabled(true);
        Theme1.setEnabled(true);
        Theme2.setEnabled(true);
    }//GEN-LAST:event_btnMapel1MouseClicked

    private void btnMapel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMapel1MouseEntered
        // TODO add your handling code here:
        setColor1(btnMapel1);
    }//GEN-LAST:event_btnMapel1MouseEntered

    private void btnMapel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMapel1MouseExited
        // TODO add your handling code here:
        resetColor1(btnMapel1);
    }//GEN-LAST:event_btnMapel1MouseExited

    private void btnSetting1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetting1MouseClicked
        // TODO add your handling code here:
        tampilHome.setVisible(false);
        tampilMateri.setVisible(false);
        tampilNilai.setVisible(false);
        tampilMaPel.setVisible(false);
        tampilSetting.setVisible(true);
        
    }//GEN-LAST:event_btnSetting1MouseClicked

    private void btnSetting1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetting1MouseEntered
        // TODO add your handling code here:
        setColor1(btnSetting1);
    }//GEN-LAST:event_btnSetting1MouseEntered

    private void btnSetting1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetting1MouseExited
        // TODO add your handling code here:
        resetColor1(btnSetting1);
    }//GEN-LAST:event_btnSetting1MouseExited

    
    public void setColor2(JPanel p){
        p.setBackground(new Color(0,204,204));
    }
    public void resetColor2(JPanel pi){
        pi.setBackground(new Color(44, 62, 80));
    }
    
    private void btnHome2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome2MouseClicked
        // TODO add your handling code here:
        tampilHome.setVisible(true);
        tampilMateri.setVisible(false);
        tampilNilai.setVisible(false);
        tampilMaPel.setVisible(false);
        tampilSetting.setVisible(false);
        
        Theme.setEnabled(true);
        Theme1.setEnabled(true);
        Theme2.setEnabled(true);
    }//GEN-LAST:event_btnHome2MouseClicked

    private void btnHome2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome2MouseEntered
        // TODO add your handling code here:
        setColor2(btnHome2);
    }//GEN-LAST:event_btnHome2MouseEntered

    private void btnHome2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome2MouseExited
        // TODO add your handling code here:
        resetColor2(btnHome2);
    }//GEN-LAST:event_btnHome2MouseExited

    private void btnMateri2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMateri2MouseClicked
        // TODO add your handling code here:
        tampilHome.setVisible(false);
        tampilMateri.setVisible(true);
        tampilNilai.setVisible(false);
        tampilMaPel.setVisible(false);
        tampilSetting.setVisible(false);
        
        Theme.setEnabled(true);
        Theme1.setEnabled(true);
        Theme2.setEnabled(true);
    }//GEN-LAST:event_btnMateri2MouseClicked

    private void btnMateri2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMateri2MouseEntered
        // TODO add your handling code here:
        setColor2(btnMateri2);
    }//GEN-LAST:event_btnMateri2MouseEntered

    private void btnMateri2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMateri2MouseExited
        // TODO add your handling code here:
        resetColor2(btnMateri2);
    }//GEN-LAST:event_btnMateri2MouseExited

    private void btnNilai2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNilai2MouseClicked
        // TODO add your handling code here:
        tampilHome.setVisible(false);
        tampilMateri.setVisible(false);
        tampilNilai.setVisible(true);
        tampilMaPel.setVisible(false);
        tampilSetting.setVisible(false);
        
        Theme.setEnabled(true);
        Theme1.setEnabled(true);
        Theme2.setEnabled(true);
    }//GEN-LAST:event_btnNilai2MouseClicked

    private void btnNilai2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNilai2MouseEntered
        // TODO add your handling code here:
        setColor2(btnNilai2);
    }//GEN-LAST:event_btnNilai2MouseEntered

    private void btnNilai2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNilai2MouseExited
        // TODO add your handling code here:
        resetColor2(btnNilai2);
    }//GEN-LAST:event_btnNilai2MouseExited

    private void btnMapel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMapel2MouseClicked
        // TODO add your handling code here:
        tampilHome.setVisible(false);
        tampilMateri.setVisible(false);
        tampilNilai.setVisible(false);
        tampilMaPel.setVisible(true);
        tampilSetting.setVisible(false);
        
        Theme.setEnabled(true);
        Theme1.setEnabled(true);
        Theme2.setEnabled(true);
    }//GEN-LAST:event_btnMapel2MouseClicked

    private void btnMapel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMapel2MouseEntered
        // TODO add your handling code here:
        setColor2(btnMapel2);
    }//GEN-LAST:event_btnMapel2MouseEntered

    private void btnMapel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMapel2MouseExited
        // TODO add your handling code here:
        resetColor2(btnMapel2);
    }//GEN-LAST:event_btnMapel2MouseExited

    private void btnSetting2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetting2MouseClicked
        // TODO add your handling code here:
        tampilHome.setVisible(false);
        tampilMateri.setVisible(false);
        tampilNilai.setVisible(false);
        tampilMaPel.setVisible(false);
        tampilSetting.setVisible(true);
    }//GEN-LAST:event_btnSetting2MouseClicked

    private void btnSetting2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetting2MouseEntered
        // TODO add your handling code here:
        setColor2(btnSetting2);
    }//GEN-LAST:event_btnSetting2MouseEntered

    private void btnSetting2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetting2MouseExited
        // TODO add your handling code here:
        resetColor2(btnSetting2);
    }//GEN-LAST:event_btnSetting2MouseExited

    
    public void header(JPanel p){
        p.setBackground(new Color(0, 0, 0));
    }
    public void sidebar(JPanel pi){
        pi.setBackground(new Color(0, 0, 0));
    }
    public void search(JTextField p){
        p.setBackground(new Color(0, 0, 0));
    }
    
    private void ThemeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThemeMouseClicked
        // TODO add your handling code here:
        header(header);
        sidebar(sidebar);
        search(search);
        
        btnHome.setVisible(true);
        btnHome1.setVisible(false);
        btnHome2.setVisible(false);
        
        btnMateri.setVisible(true);
        btnMateri1.setVisible(false);
        btnMateri2.setVisible(false);
        
        btnNilai.setVisible(true);
        btnNilai1.setVisible(false);
        btnNilai2.setVisible(false);
        
        btnMapel.setVisible(true);
        btnMapel1.setVisible(false);
        btnMapel2.setVisible(false);
        
        btnSetting.setVisible(true);
        btnSetting1.setVisible(false);
        btnSetting2.setVisible(false);
        
        btnLogout.setVisible(true);
        btnLogout1.setVisible(false);
        btnLogout2.setVisible(false);
    }//GEN-LAST:event_ThemeMouseClicked

    public void header1(JPanel p){
        p.setBackground(new Color(0, 153, 153));
    }
    public void sidebar1(JPanel pi){
        pi.setBackground(new Color(0, 0, 0));
    }
    public void search1(JTextField p){
        p.setBackground(new Color(0, 153, 153));
    }
    
    private void Theme1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Theme1MouseClicked
        // TODO add your handling code here:
        header1(header);
        sidebar1(sidebar);
        search1(search);
        
        btnHome.setVisible(false);
        btnHome1.setVisible(true);
        btnHome2.setVisible(false);
        
        btnMateri.setVisible(false);
        btnMateri1.setVisible(true);
        btnMateri2.setVisible(false);
        
        btnNilai.setVisible(false);
        btnNilai1.setVisible(true);
        btnNilai2.setVisible(false);
        
        btnMapel.setVisible(false);
        btnMapel1.setVisible(true);
        btnMapel2.setVisible(false);
        
        btnSetting.setVisible(false);
        btnSetting1.setVisible(true);
        btnSetting2.setVisible(false);
        
        btnLogout.setVisible(false);
        btnLogout1.setVisible(true);
        btnLogout2.setVisible(false);
    }//GEN-LAST:event_Theme1MouseClicked

    public void header2(JPanel p){
        p.setBackground(new Color(255,255,102));
    }
    public void sidebar2(JPanel pi){
        pi.setBackground(new Color(44, 62, 80));
    }
    public void search2(JTextField p){
        p.setBackground(new Color(255, 255, 102));
    }
    
    private void Theme2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Theme2MouseClicked
        // TODO add your handling code here:
        header2(header);
        sidebar2(sidebar);
        search2(search);
        
        
        btnHome.setVisible(false);
        btnHome1.setVisible(false);
        btnHome2.setVisible(true);
        
        btnMateri.setVisible(false);
        btnMateri1.setVisible(false);
        btnMateri2.setVisible(true);
        
        btnNilai.setVisible(false);
        btnNilai1.setVisible(false);
        btnNilai2.setVisible(true);
        
        btnMapel.setVisible(false);
        btnMapel1.setVisible(false);
        btnMapel2.setVisible(true);
        
        btnSetting.setVisible(false);
        btnSetting1.setVisible(false);
        btnSetting2.setVisible(true);
        
        btnLogout.setVisible(false);
        btnLogout1.setVisible(false);
        btnLogout2.setVisible(true);
    }//GEN-LAST:event_Theme2MouseClicked

    private void btnSettingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingMousePressed
        // TODO add your handling code here:
        resetColor(btnSetting);
    }//GEN-LAST:event_btnSettingMousePressed

    private void btnSettingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSettingKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSettingKeyReleased

    private void searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFocusGained
        if(search.getText().trim().equals("Search...")){
            search.setText("");
        }
        
        search.setForeground(Color.WHITE);
    }//GEN-LAST:event_searchFocusGained

    private void searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFocusLost
        if(search.getText().trim().equals("")){
            search.setText("Search...");
        }
        
        search.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_searchFocusLost
    
    private void tampilMateriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tampilMateriMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tampilMateriMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        new addProfile(null,true).show();
    }//GEN-LAST:event_profileMouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        this.setVisible(false);
        new Index().setVisible(true);
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        // TODO add your handling code here:
        setColor(btnLogout);
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
        // TODO add your handling code here:
        resetColor(btnLogout);
    }//GEN-LAST:event_btnLogoutMouseExited

    private void btnLogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnLogoutMousePressed

    private void btnLogoutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLogoutKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_btnLogoutKeyReleased

    private void btnLogout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogout1MouseClicked
        this.setVisible(false);
        new Index().setVisible(true);
    }//GEN-LAST:event_btnLogout1MouseClicked

    private void btnLogout1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogout1MouseEntered
        // TODO add your handling code here:
        setColor1(btnLogout1);
    }//GEN-LAST:event_btnLogout1MouseEntered

    private void btnLogout1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogout1MouseExited
        // TODO add your handling code here:
        resetColor1(btnLogout1);
    }//GEN-LAST:event_btnLogout1MouseExited

    private void btnLogout1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogout1MousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnLogout1MousePressed

    private void btnLogout1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLogout1KeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_btnLogout1KeyReleased

    private void btnLogout2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogout2MouseClicked
        this.setVisible(false);
        new Index().setVisible(true);
    }//GEN-LAST:event_btnLogout2MouseClicked

    private void btnLogout2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogout2MouseEntered
        // TODO add your handling code here:
        setColor2(btnLogout2);
    }//GEN-LAST:event_btnLogout2MouseEntered

    private void btnLogout2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogout2MouseExited
        // TODO add your handling code here:
        resetColor2(btnLogout2);
    }//GEN-LAST:event_btnLogout2MouseExited

    private void btnLogout2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogout2MousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnLogout2MousePressed

    private void btnLogout2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLogout2KeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_btnLogout2KeyReleased

    private void jPanel84MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel84MouseClicked

    }//GEN-LAST:event_jPanel84MouseClicked

    private void jPanel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseClicked
        new addMateri(null,true).show();
    }//GEN-LAST:event_jPanel15MouseClicked
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dashboardSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboardSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboardSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboardSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboardSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JJudul;
    private javax.swing.JLabel Jcatatan;
    private javax.swing.JPanel PanelDSsiswa;
    private javax.swing.JPanel Theme;
    private javax.swing.JPanel Theme1;
    private javax.swing.JPanel Theme2;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnHome1;
    private javax.swing.JPanel btnHome2;
    private javax.swing.JPanel btnLogout;
    private javax.swing.JPanel btnLogout1;
    private javax.swing.JPanel btnLogout2;
    private javax.swing.JPanel btnMapel;
    private javax.swing.JPanel btnMapel1;
    private javax.swing.JPanel btnMapel2;
    private javax.swing.JPanel btnMateri;
    private javax.swing.JPanel btnMateri1;
    private javax.swing.JPanel btnMateri2;
    private javax.swing.JPanel btnNilai;
    private javax.swing.JPanel btnNilai1;
    private javax.swing.JPanel btnNilai2;
    private javax.swing.JPanel btnSetting;
    private javax.swing.JPanel btnSetting1;
    private javax.swing.JPanel btnSetting2;
    private javax.swing.JPanel header;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel profile;
    private javax.swing.JTextField search;
    private javax.swing.JPanel sidebar;
    private javax.swing.JPanel tampilHome;
    private javax.swing.JPanel tampilMaPel;
    private javax.swing.JPanel tampilMateri;
    private javax.swing.JPanel tampilNilai;
    private javax.swing.JPanel tampilSetting;
    private javax.swing.JTable tbl_materi1;
    private javax.swing.JTable tbl_rapot1;
    // End of variables declaration//GEN-END:variables
}
