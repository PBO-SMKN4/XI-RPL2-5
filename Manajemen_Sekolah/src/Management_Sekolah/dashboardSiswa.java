
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
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDSsiswa = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        search = new javax.swing.JTextField();
        profile = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
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
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel11 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
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

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(648, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(profile)
                .addGap(37, 37, 37))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(profile)
                            .addComponent(jLabel43))))
                .addContainerGap())
        );

        PanelDSsiswa.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

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

        PanelDSsiswa.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 570));

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
            .addGap(0, 570, Short.MAX_VALUE)
        );

        PanelDSsiswa.add(tampilHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 790, 570));

        tampilMateri.setBackground(new java.awt.Color(255, 255, 255));
        tampilMateri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tampilMateriMouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<html>\nBAHASA\n<p>INDONESIA</p>\n</html>");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/literature-32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 0, 0));

        jLabel2.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PKN");

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/globe-5-32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0, 102, 51));

        jLabel3.setFont(new java.awt.Font("Futura Md BT", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>\nPENDIDIKAN\n<p>AGAMA ISLAM\n</html>");

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mosque-32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addGap(19, 19, 19))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addGap(1, 1, 1)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MATEMATIKA");

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/math-32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel30)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));

        jLabel6.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("<html> BAHASA <p>SUNDA</p> </html>");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(204, 0, 0));

        jLabel7.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("OLAHRAGA");

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/soccer-2-32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(0, 102, 51));

        jLabel25.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("KONSELING");

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/favorite-7-32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel41)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(0, 102, 102));

        jLabel27.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("PPL");

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/flow-chart-32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(204, 0, 0));

        jLabel28.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("<html> BASIS <p>DATA</p> </html>");

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/database-5-32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(0, 102, 51));

        jLabel29.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("PWPB");

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/website-design-32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addGap(18, 18, 18))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addContainerGap())
        );

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("Kejuruan");

        jPanel11.setBackground(new java.awt.Color(255, 102, 0));

        jLabel32.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("PKK");

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cash-receiving-32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addContainerGap())
        );

        jPanel18.setBackground(new java.awt.Color(204, 0, 0));

        jLabel33.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("PBO");

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/code-optimization-32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(255, 102, 0));

        jLabel26.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("<html> BAHASA <p>INGGRIS</p> </html>");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout tampilMateriLayout = new javax.swing.GroupLayout(tampilMateri);
        tampilMateri.setLayout(tampilMateriLayout);
        tampilMateriLayout.setHorizontalGroup(
            tampilMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilMateriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilMateriLayout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tampilMateriLayout.createSequentialGroup()
                        .addGroup(tampilMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tampilMateriLayout.createSequentialGroup()
                                .addGroup(tampilMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(tampilMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(tampilMateriLayout.createSequentialGroup()
                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(tampilMateriLayout.createSequentialGroup()
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tampilMateriLayout.setVerticalGroup(
            tampilMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilMateriLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(tampilMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(tampilMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(tampilMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tampilMateriLayout.createSequentialGroup()
                        .addGroup(tampilMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(tampilMateriLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tampilMateriLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        PanelDSsiswa.add(tampilMateri, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 790, 570));

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
                .addContainerGap(22, Short.MAX_VALUE))
        );

        PanelDSsiswa.add(tampilNilai, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 790, 570));

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
            .addGap(0, 570, Short.MAX_VALUE)
            .addGroup(tampilMaPelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tampilMaPelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        PanelDSsiswa.add(tampilMaPel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 790, 570));

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
                .addGap(0, 182, Short.MAX_VALUE))
        );

        PanelDSsiswa.add(tampilSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 790, 570));

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
        // TODO add your handling code here:
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
        // TODO add your handling code here:
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
        // TODO add your handling code here:
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

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        new addMateri(null,true).show();
    }//GEN-LAST:event_jPanel4MouseClicked
    
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel profile;
    private javax.swing.JTextField search;
    private javax.swing.JPanel sidebar;
    private javax.swing.JPanel tampilHome;
    private javax.swing.JPanel tampilMaPel;
    private javax.swing.JPanel tampilMateri;
    private javax.swing.JPanel tampilNilai;
    private javax.swing.JPanel tampilSetting;
    private javax.swing.JTable tbl_rapot1;
    // End of variables declaration//GEN-END:variables
}
