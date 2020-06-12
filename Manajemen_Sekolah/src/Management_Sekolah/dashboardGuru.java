/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management_Sekolah;

import Management_Sekolah.DatabaseConnection;
import java.sql.Connection;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
/**
 *
 * @author Asus
 */
public class dashboardGuru extends javax.swing.JFrame {

    Connection koneksi;
    
    public dashboardGuru() {
        initComponents();
        koneksi = DatabaseConnection.getKoneksi("localhost", "3306", "root", "", "db_manajemensekolah");
        
        showData();
        showData2();
        
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
    public void showData2(){
        String[] kolom = {"NO","Nama Siswa","T1","T2","T3","T4","T5","P","TA","PAS"};
        
        dtm2 = new DefaultTableModel(null, kolom);
        try{
            Statement stmt = koneksi.createStatement();
            String query = "SELECT * FROM t_siswa,t_matpel JOIN t_rekapnilai\n" 
                    + "WHERE t_matpel.kd_matpel = t_rekapnilai.kd_matpel "
                    + "AND t_siswa.nis = t_rekapnilai.nis ";
            ResultSet rs = stmt.executeQuery(query);
            int no = 1;
            while(rs.next()){
                String nama_lengkap  = rs.getString("nama_lengkap");
                String t1            = rs.getString("t1");
                String t2            = rs.getString("t2");
                String t3            = rs.getString("t3");
                String t4            = rs.getString("t4");
                String t5            = rs.getString("t5");
                String presentasi    = rs.getString("presentasi");
                String takhir        = rs.getString("takhir");
                String pas           = rs.getString("pas");
                
                dtm2.addRow(new String[]{no+"",nama_lengkap,t1,t2,t3,t4,t5,presentasi,takhir,pas});
                no++;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan di Query");
        }
        tbl_nilai1.setModel(dtm2);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDSGuru = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        search = new javax.swing.JTextField();
        menubar = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
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
        jLabel25 = new javax.swing.JLabel();
        btnLogout2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        btnLogout1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        tampilHome = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tampilMateri = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
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
        jPanel9 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        tampilNilai = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_rapot1 = new javax.swing.JTable();
        jComboBox4 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_nilai1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel26 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jPanel30 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jPanel34 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jPanel38 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jPanel42 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jPanel46 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jPanel50 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jPanel54 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        jPanel58 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jPanel59 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        Tnis = new javax.swing.JTextField();
        Tnama = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        Tt1 = new javax.swing.JTextField();
        Tt2 = new javax.swing.JTextField();
        Tt4 = new javax.swing.JTextField();
        Tt3 = new javax.swing.JTextField();
        Tpas = new javax.swing.JTextField();
        Tt5 = new javax.swing.JTextField();
        Tp = new javax.swing.JTextField();
        Tta = new javax.swing.JTextField();
        jPanel60 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        Tkelas = new javax.swing.JComboBox();
        Tjurusan = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        tampilMaPel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tampilSetting = new javax.swing.JPanel();
        Theme = new javax.swing.JPanel();
        Theme1 = new javax.swing.JPanel();
        Theme2 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelDSGuru.setMinimumSize(new java.awt.Dimension(1000, 625));
        PanelDSGuru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        menubar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-2-24.png"))); // NOI18N
        menubar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menubar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menubarMouseClicked(evt);
            }
        });

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/active-search-24.png"))); // NOI18N

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoSM1.png"))); // NOI18N
        jLabel104.setText("jLabel104");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel104)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addGap(26, 26, 26)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(menubar)
                .addGap(44, 44, 44))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel104)
                .addContainerGap())
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menubar)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelDSGuru.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        sidebar.setBackground(new java.awt.Color(0, 0, 0));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setBackground(new java.awt.Color(0, 0, 0));
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
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHomeLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap())
        );

        sidebar.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 50));

        btnMateri.setBackground(new java.awt.Color(0, 0, 0));
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
            .addGroup(btnMateriLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        btnMateriLayout.setVerticalGroup(
            btnMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMateriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        sidebar.add(btnMateri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, 50));

        btnNilai.setBackground(new java.awt.Color(0, 0, 0));
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
            .addGroup(btnNilaiLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        btnNilaiLayout.setVerticalGroup(
            btnNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNilaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        sidebar.add(btnNilai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, 50));

        btnMapel.setBackground(new java.awt.Color(0, 0, 0));
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
            .addGroup(btnMapelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        btnMapelLayout.setVerticalGroup(
            btnMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMapelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        sidebar.add(btnMapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 210, 50));

        btnSetting.setBackground(new java.awt.Color(0, 0, 0));
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
            .addGroup(btnSettingLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        btnSettingLayout.setVerticalGroup(
            btnSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSettingLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
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
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book-16-24.png"))); // NOI18N
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

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/door-9-24.png"))); // NOI18N
        jLabel25.setText("Logout");

        javax.swing.GroupLayout btnLogoutLayout = new javax.swing.GroupLayout(btnLogout);
        btnLogout.setLayout(btnLogoutLayout);
        btnLogoutLayout.setHorizontalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogoutLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        btnLogoutLayout.setVerticalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogoutLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        sidebar.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 210, 50));

        btnLogout2.setBackground(new java.awt.Color(0, 0, 0));
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

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/door-9-24.png"))); // NOI18N
        jLabel27.setText("Logout");

        btnLogout1.setBackground(new java.awt.Color(0, 0, 0));
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

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/door-9-24.png"))); // NOI18N
        jLabel26.setText("Logout");

        javax.swing.GroupLayout btnLogout1Layout = new javax.swing.GroupLayout(btnLogout1);
        btnLogout1.setLayout(btnLogout1Layout);
        btnLogout1Layout.setHorizontalGroup(
            btnLogout1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogout1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        btnLogout1Layout.setVerticalGroup(
            btnLogout1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogout1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout btnLogout2Layout = new javax.swing.GroupLayout(btnLogout2);
        btnLogout2.setLayout(btnLogout2Layout);
        btnLogout2Layout.setHorizontalGroup(
            btnLogout2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogout2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(btnLogout2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnLogout2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnLogout2Layout.setVerticalGroup(
            btnLogout2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogout2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(btnLogout2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnLogout2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        sidebar.add(btnLogout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 210, 50));

        jLabel80.setFont(new java.awt.Font("Futura Md BT", 0, 24)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("Dashboard");
        sidebar.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 124, 27));

        PanelDSGuru.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 210, 540));

        tampilHome.setBackground(new java.awt.Color(255, 255, 255));
        tampilHome.setForeground(new java.awt.Color(204, 204, 204));

        jPanel5.setBackground(new java.awt.Color(204, 0, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus-8-24.png"))); // NOI18N
        jLabel2.setText("Pengumuman");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 8, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout tampilHomeLayout = new javax.swing.GroupLayout(tampilHome);
        tampilHome.setLayout(tampilHomeLayout);
        tampilHomeLayout.setHorizontalGroup(
            tampilHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tampilHomeLayout.createSequentialGroup()
                .addContainerGap(626, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        tampilHomeLayout.setVerticalGroup(
            tampilHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(475, Short.MAX_VALUE))
        );

        PanelDSGuru.add(tampilHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 790, 530));

        tampilMateri.setBackground(new java.awt.Color(255, 255, 255));
        tampilMateri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tampilMateriMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Tambah Materi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 574, Short.MAX_VALUE)
                .addComponent(jLabel118)
                .addGap(18, 18, 18))
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel118)
                    .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(237, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("New", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel85.setBackground(new java.awt.Color(204, 0, 0));

        jLabel119.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(255, 255, 255));
        jLabel119.setText("PKN");

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/globe-5-32.png"))); // NOI18N

        jLabel121.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setText("Belum ada tugas");

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel120)
                .addContainerGap())
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(295, Short.MAX_VALUE))
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel120)
                    .addComponent(jLabel119))
                .addGap(82, 82, 82)
                .addComponent(jLabel121)
                .addContainerGap(143, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addContainerGap())
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel122)
                .addGap(145, 145, 145))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(292, Short.MAX_VALUE))
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
                .addContainerGap(147, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("B. Indonesia", jPanel17);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        jPanel21.setBackground(new java.awt.Color(0, 102, 102));

        jLabel42.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("MATEMATIKA");

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/math-32.png"))); // NOI18N

        jLabel124.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(255, 255, 255));
        jLabel124.setText("Belum ada tugas");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addContainerGap())
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(jLabel47))
                .addGap(75, 75, 75)
                .addComponent(jLabel124)
                .addContainerGap(150, Short.MAX_VALUE))
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

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/literature-32.png"))); // NOI18N

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
                .addComponent(jLabel55)
                .addContainerGap())
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addGap(67, 67, 67)
                .addComponent(jLabel125)
                .addContainerGap(150, Short.MAX_VALUE))
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
                .addContainerGap(298, Short.MAX_VALUE))
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
                .addContainerGap(150, Short.MAX_VALUE))
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
                .addContainerGap(292, Short.MAX_VALUE))
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
                .addContainerGap(152, Short.MAX_VALUE))
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
                .addContainerGap(299, Short.MAX_VALUE))
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
                .addContainerGap(158, Short.MAX_VALUE))
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
                .addContainerGap(288, Short.MAX_VALUE)
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
                .addContainerGap(148, Short.MAX_VALUE))
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
                .addContainerGap(291, Short.MAX_VALUE))
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
                .addContainerGap(159, Short.MAX_VALUE))
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
                .addContainerGap(300, Short.MAX_VALUE))
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
                .addContainerGap(153, Short.MAX_VALUE))
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
                .addContainerGap(301, Short.MAX_VALUE))
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
                .addContainerGap(156, Short.MAX_VALUE))
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
                .addContainerGap(285, Short.MAX_VALUE)
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
                .addContainerGap(153, Short.MAX_VALUE))
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

        jPanel9.setBackground(new java.awt.Color(255, 204, 0));

        jLabel30.setBackground(new java.awt.Color(255, 204, 0));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit-11-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel30)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel30)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel12.setBackground(new java.awt.Color(204, 0, 0));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jLabel31)
                    .addGap(0, 4, Short.MAX_VALUE)))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel32)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel31)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel32)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout tampilMateriLayout = new javax.swing.GroupLayout(tampilMateri);
        tampilMateri.setLayout(tampilMateriLayout);
        tampilMateriLayout.setHorizontalGroup(
            tampilMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tampilMateriLayout.createSequentialGroup()
                .addGroup(tampilMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tampilMateriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane2))
                    .addGroup(tampilMateriLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        tampilMateriLayout.setVerticalGroup(
            tampilMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilMateriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilMateriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        PanelDSGuru.add(tampilMateri, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 790, 530));

        tampilNilai.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Semester 1" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        tbl_rapot1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "Nama Siswa", "Mata Pelajaran", "Pengetahuan", "Keterampilan", "Sikap"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_rapot1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_rapot1);
        if (tbl_rapot1.getColumnModel().getColumnCount() > 0) {
            tbl_rapot1.getColumnModel().getColumn(0).setResizable(false);
            tbl_rapot1.getColumnModel().getColumn(1).setResizable(false);
            tbl_rapot1.getColumnModel().getColumn(2).setResizable(false);
            tbl_rapot1.getColumnModel().getColumn(3).setResizable(false);
            tbl_rapot1.getColumnModel().getColumn(4).setResizable(false);
            tbl_rapot1.getColumnModel().getColumn(5).setResizable(false);
        }

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XI RPL 1", "XI RPL 2", "XI RPL 3" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Rapor", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_nilai1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Siswa", "T1", "T2", "T3", "T4", "T5", "P", "TA", "PAS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_nilai1.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tbl_nilai1);
        if (tbl_nilai1.getColumnModel().getColumnCount() > 0) {
            tbl_nilai1.getColumnModel().getColumn(0).setResizable(false);
            tbl_nilai1.getColumnModel().getColumn(1).setResizable(false);
            tbl_nilai1.getColumnModel().getColumn(2).setResizable(false);
            tbl_nilai1.getColumnModel().getColumn(3).setResizable(false);
            tbl_nilai1.getColumnModel().getColumn(4).setResizable(false);
            tbl_nilai1.getColumnModel().getColumn(5).setResizable(false);
            tbl_nilai1.getColumnModel().getColumn(6).setResizable(false);
            tbl_nilai1.getColumnModel().getColumn(7).setResizable(false);
            tbl_nilai1.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel6.setBackground(new java.awt.Color(255, 204, 0));

        jLabel4.setBackground(new java.awt.Color(255, 204, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit-11-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel7.setBackground(new java.awt.Color(204, 0, 0));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 4, Short.MAX_VALUE)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PKN", jPanel1);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Siswa", "T1", "T2", "T3", "T4", "T5", "P", "TA", "PAS"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        jPanel10.setBackground(new java.awt.Color(255, 204, 0));

        jLabel7.setBackground(new java.awt.Color(255, 204, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit-11-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel11.setBackground(new java.awt.Color(204, 0, 0));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jLabel28)
                    .addGap(0, 4, Short.MAX_VALUE)))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel29)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel28)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel29)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PAI", jPanel8);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Siswa", "T1", "T2", "T3", "T4", "T5", "P", "TA", "PAS"
            }
        ));
        jScrollPane6.setViewportView(jTable4);

        jPanel18.setBackground(new java.awt.Color(255, 204, 0));

        jLabel35.setBackground(new java.awt.Color(255, 204, 0));
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit-11-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel35)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel35)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel19.setBackground(new java.awt.Color(204, 0, 0));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jLabel36)
                    .addGap(0, 4, Short.MAX_VALUE)))
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel37)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel36)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel37)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("B. Indonesia", jPanel16);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Siswa", "T1", "T2", "T3", "T4", "T5", "P", "TA", "PAS"
            }
        ));
        jScrollPane7.setViewportView(jTable5);

        jPanel22.setBackground(new java.awt.Color(255, 204, 0));

        jLabel39.setBackground(new java.awt.Color(255, 204, 0));
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit-11-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel39)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel39)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel23.setBackground(new java.awt.Color(204, 0, 0));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jLabel40)
                    .addGap(0, 4, Short.MAX_VALUE)))
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel41)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel40)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel41)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Matematika", jPanel20);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Siswa", "T1", "T2", "T3", "T4", "T5", "P", "TA", "PAS"
            }
        ));
        jScrollPane8.setViewportView(jTable6);

        jPanel26.setBackground(new java.awt.Color(255, 204, 0));

        jLabel44.setBackground(new java.awt.Color(255, 204, 0));
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit-11-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel26Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel44)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel26Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel44)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel27.setBackground(new java.awt.Color(204, 0, 0));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel27Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jLabel45)
                    .addGap(0, 4, Short.MAX_VALUE)))
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel27Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel46)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel27Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel45)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel27Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel46)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("B. Inggris", jPanel24);

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Siswa", "T1", "T2", "T3", "T4", "T5", "P", "TA", "PAS"
            }
        ));
        jScrollPane9.setViewportView(jTable7);

        jPanel30.setBackground(new java.awt.Color(255, 204, 0));

        jLabel48.setBackground(new java.awt.Color(255, 204, 0));
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit-11-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel30Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel48)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel30Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel48)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel31.setBackground(new java.awt.Color(204, 0, 0));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel31Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jLabel49)
                    .addGap(0, 4, Short.MAX_VALUE)))
            .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel31Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel50)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel31Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel49)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel31Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel50)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("OR", jPanel28);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Siswa", "T1", "T2", "T3", "T4", "T5", "P", "TA", "PAS"
            }
        ));
        jScrollPane10.setViewportView(jTable8);

        jPanel34.setBackground(new java.awt.Color(255, 204, 0));

        jLabel52.setBackground(new java.awt.Color(255, 204, 0));
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit-11-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel34Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel52)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel34Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel52)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel35.setBackground(new java.awt.Color(204, 0, 0));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel35Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jLabel53)
                    .addGap(0, 4, Short.MAX_VALUE)))
            .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel35Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel54)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel35Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel53)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel35Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel54)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("B. Sunda", jPanel32);

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Siswa", "T1", "T2", "T3", "T4", "T5", "P", "TA", "PAS"
            }
        ));
        jScrollPane11.setViewportView(jTable9);

        jPanel38.setBackground(new java.awt.Color(255, 204, 0));

        jLabel56.setBackground(new java.awt.Color(255, 204, 0));
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit-11-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel38Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel56)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel38Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel56)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel39.setBackground(new java.awt.Color(204, 0, 0));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel39Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jLabel57)
                    .addGap(0, 4, Short.MAX_VALUE)))
            .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel39Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel58)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel39Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel57)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel39Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel58)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BK", jPanel36);

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Siswa", "T1", "T2", "T3", "T4", "T5", "P", "TA", "PAS"
            }
        ));
        jScrollPane12.setViewportView(jTable10);

        jPanel42.setBackground(new java.awt.Color(255, 204, 0));

        jLabel60.setBackground(new java.awt.Color(255, 204, 0));
        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit-11-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel42Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel60)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel42Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel60)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel43.setBackground(new java.awt.Color(204, 0, 0));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel43Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jLabel61)
                    .addGap(0, 4, Short.MAX_VALUE)))
            .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel43Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel62)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel43Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel61)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel43Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel62)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PKK", jPanel40);

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Siswa", "T1", "T2", "T3", "T4", "T5", "P", "TA", "PAS"
            }
        ));
        jScrollPane13.setViewportView(jTable11);

        jPanel46.setBackground(new java.awt.Color(255, 204, 0));

        jLabel64.setBackground(new java.awt.Color(255, 204, 0));
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit-11-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel46Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel64)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel46Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel64)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel47.setBackground(new java.awt.Color(204, 0, 0));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel47Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jLabel65)
                    .addGap(0, 4, Short.MAX_VALUE)))
            .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel47Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel66)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel47Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel65)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel47Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel66)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PPL", jPanel44);

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Siswa", "T1", "T2", "T3", "T4", "T5", "P", "TA", "PAS"
            }
        ));
        jScrollPane14.setViewportView(jTable12);

        jPanel50.setBackground(new java.awt.Color(255, 204, 0));

        jLabel68.setBackground(new java.awt.Color(255, 204, 0));
        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit-11-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel50Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel68)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel50Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel68)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel51.setBackground(new java.awt.Color(204, 0, 0));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel51Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jLabel69)
                    .addGap(0, 4, Short.MAX_VALUE)))
            .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel51Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel70)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel51Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel69)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel51Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel70)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Basis Data", jPanel48);

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Siswa", "T1", "T2", "T3", "T4", "T5", "P", "TA", "PAS"
            }
        ));
        jScrollPane15.setViewportView(jTable13);

        jPanel54.setBackground(new java.awt.Color(255, 204, 0));

        jLabel72.setBackground(new java.awt.Color(255, 204, 0));
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit-11-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel54Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel72)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel54Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel72)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel55.setBackground(new java.awt.Color(204, 0, 0));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel55Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jLabel73)
                    .addGap(0, 4, Short.MAX_VALUE)))
            .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel55Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel74)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel55Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel73)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel55Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel74)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PWPB", jPanel52);

        jPanel56.setBackground(new java.awt.Color(255, 255, 255));

        jTable14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Siswa", "T1", "T2", "T3", "T4", "T5", "P", "TA", "PAS"
            }
        ));
        jScrollPane16.setViewportView(jTable14);

        jPanel58.setBackground(new java.awt.Color(255, 204, 0));

        jLabel76.setBackground(new java.awt.Color(255, 204, 0));
        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit-11-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel58Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel76)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel58Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel76)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel59.setBackground(new java.awt.Color(204, 0, 0));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel59Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jLabel77)
                    .addGap(0, 4, Short.MAX_VALUE)))
            .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel59Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel78)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel59Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel77)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel59Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel78)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PBO", jPanel56);

        jLabel9.setText("Nama :");

        jLabel81.setText("NIS :");

        jLabel82.setText("Kelas :");

        Tnis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnisActionPerformed(evt);
            }
        });

        jLabel83.setText("T1");

        jLabel84.setText("T2");

        jLabel85.setText("T3");

        jLabel86.setText("T4");

        jLabel87.setText("T5");

        jLabel88.setText("P");

        jLabel89.setText("TA");

        jLabel90.setText("PAS");

        Tt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tt1ActionPerformed(evt);
            }
        });

        Tt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tt2ActionPerformed(evt);
            }
        });

        Tt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tt4ActionPerformed(evt);
            }
        });

        Tt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tt3ActionPerformed(evt);
            }
        });

        Tpas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TpasActionPerformed(evt);
            }
        });

        Tt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tt5ActionPerformed(evt);
            }
        });

        Tp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TpActionPerformed(evt);
            }
        });

        Tta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtaActionPerformed(evt);
            }
        });

        jPanel60.setBackground(new java.awt.Color(51, 153, 0));

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("Tambah Data");

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel60Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel91)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel60Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel91)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel61.setBackground(new java.awt.Color(51, 153, 0));
        jPanel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel61MouseClicked(evt);
            }
        });

        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("Tambah Data");

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel61Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel92)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel61Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel92)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Tkelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XI RPL 1", "XI RPL 2", "XI RPL 3" }));

        Tjurusan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rekayasa Perangkat Lunak" }));

        jLabel1.setText("Jurusan :");

        javax.swing.GroupLayout tampilNilaiLayout = new javax.swing.GroupLayout(tampilNilai);
        tampilNilai.setLayout(tampilNilaiLayout);
        tampilNilaiLayout.setHorizontalGroup(
            tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilNilaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tampilNilaiLayout.createSequentialGroup()
                        .addGroup(tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel81)
                            .addComponent(jLabel9)
                            .addComponent(jLabel82)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tnis)
                            .addComponent(Tnama)
                            .addComponent(Tkelas, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel85)
                            .addComponent(jLabel84)
                            .addComponent(jLabel83))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tt1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tt2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tt3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel86)
                            .addComponent(jLabel87))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tampilNilaiLayout.createSequentialGroup()
                                .addComponent(Tt5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(tampilNilaiLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel90)
                                        .addGap(18, 18, 18)
                                        .addComponent(Tpas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(tampilNilaiLayout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addGroup(tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel88)
                                            .addGroup(tampilNilaiLayout.createSequentialGroup()
                                                .addComponent(jLabel89)
                                                .addGap(18, 18, 18)
                                                .addComponent(Tta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(tampilNilaiLayout.createSequentialGroup()
                                .addComponent(Tt4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(Tp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tampilNilaiLayout.createSequentialGroup()
                        .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addContainerGap())
            .addGroup(tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tampilNilaiLayout.createSequentialGroup()
                    .addGap(345, 345, 345)
                    .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(345, Short.MAX_VALUE)))
        );
        tampilNilaiLayout.setVerticalGroup(
            tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilNilaiLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilNilaiLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel81)
                            .addComponent(Tnis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel83)
                            .addComponent(jLabel86)
                            .addComponent(Tt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel88)
                            .addComponent(Tp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel89))
                    .addGroup(tampilNilaiLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel84)
                            .addComponent(Tt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87)
                            .addComponent(Tt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(121, 121, 121)
                .addGroup(tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel90)
                        .addComponent(Tpas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel82)
                    .addGroup(tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel85))
                    .addComponent(Tkelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(4, 4, 4)
                .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(tampilNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tampilNilaiLayout.createSequentialGroup()
                    .addGap(269, 269, 269)
                    .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(350, Short.MAX_VALUE)))
        );

        PanelDSGuru.add(tampilNilai, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 790, 530));

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
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(tampilMaPelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tampilMaPelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        PanelDSGuru.add(tampilMaPel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 790, 530));

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
            .addGap(0, 244, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 244, Short.MAX_VALUE)
        );

        jLabel79.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel79.setText("Tema");

        javax.swing.GroupLayout tampilSettingLayout = new javax.swing.GroupLayout(tampilSetting);
        tampilSetting.setLayout(tampilSettingLayout);
        tampilSettingLayout.setHorizontalGroup(
            tampilSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilSettingLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(tampilSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilSettingLayout.createSequentialGroup()
                        .addGroup(tampilSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel79)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tampilSettingLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Theme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addComponent(Theme1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addComponent(Theme2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))))
        );
        tampilSettingLayout.setVerticalGroup(
            tampilSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilSettingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tampilSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Theme2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Theme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Theme1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        PanelDSGuru.add(tampilSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 790, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelDSGuru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelDSGuru, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE))
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
        
        Tt1.setEnabled(false);
        Tt2.setEnabled(false);
        Tt3.setEnabled(false);
        Tt4.setEnabled(false);
        Tt5.setEnabled(false);
        Tp.setEnabled(false);
        Tta.setEnabled(false);
        Tpas.setEnabled(false);
        
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
        
        Tt1.setEnabled(false);
        Tt2.setEnabled(false);
        Tt3.setEnabled(false);
        Tt4.setEnabled(false);
        Tt5.setEnabled(false);
        Tp.setEnabled(false);
        Tta.setEnabled(false);
        Tpas.setEnabled(false);
        
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
        
        Tt1.setEnabled(false);
        Tt2.setEnabled(false);
        Tt3.setEnabled(false);
        Tt4.setEnabled(false);
        Tt5.setEnabled(false);
        Tp.setEnabled(false);
        Tta.setEnabled(false);
        Tpas.setEnabled(false);
        
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
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void menubarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menubarMouseClicked
        new addProfile(null,true).show();
    }//GEN-LAST:event_menubarMouseClicked

    private void tampilMateriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tampilMateriMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tampilMateriMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new addMateri(null,true).show();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       new addPengumuman(null,true).show();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void TnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TnisActionPerformed

    private void Tt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tt1ActionPerformed

    private void Tt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tt2ActionPerformed

    private void Tt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tt4ActionPerformed

    private void Tt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tt3ActionPerformed

    private void TpasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TpasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TpasActionPerformed

    private void Tt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tt5ActionPerformed

    private void TpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TpActionPerformed

    private void TtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtaActionPerformed

    private void jPanel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel61MouseClicked
        String nis          = Tnis.getText();
        String nama_lengkap = Tnama.getText();
        String kelas        = Tkelas.getSelectedItem().toString();
        String jurusan      = Tjurusan.getSelectedItem().toString();

        try{
            Statement stmt = koneksi.createStatement();
            String query = "INSERT INTO t_siswa (nis,nama_lengkap,kelas,jurusan)" 
                            + "VALUES('"+nis+"','"+nama_lengkap+"','"+kelas+"','"+jurusan+"')";
            System.out.println(query);
            int berhasil = stmt.executeUpdate(query);
            showData();
            if(berhasil == 1){
                JOptionPane.showMessageDialog(null,"Data Berhasil Ditambahkan");
            }else {
                JOptionPane.showMessageDialog(null,"Data Gagal DiTambahkan");
            }
        }catch (SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan Pada Database");
        }
    }//GEN-LAST:event_jPanel61MouseClicked

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
            java.util.logging.Logger.getLogger(dashboardGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboardGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboardGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboardGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboardGuru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDSGuru;
    private javax.swing.JPanel Theme;
    private javax.swing.JPanel Theme1;
    private javax.swing.JPanel Theme2;
    private javax.swing.JComboBox Tjurusan;
    private javax.swing.JComboBox Tkelas;
    private javax.swing.JTextField Tnama;
    private javax.swing.JTextField Tnis;
    private javax.swing.JTextField Tp;
    private javax.swing.JTextField Tpas;
    private javax.swing.JTextField Tt1;
    private javax.swing.JTextField Tt2;
    private javax.swing.JTextField Tt3;
    private javax.swing.JTextField Tt4;
    private javax.swing.JTextField Tt5;
    private javax.swing.JTextField Tta;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
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
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JLabel menubar;
    private javax.swing.JTextField search;
    private javax.swing.JPanel sidebar;
    private javax.swing.JPanel tampilHome;
    private javax.swing.JPanel tampilMaPel;
    private javax.swing.JPanel tampilMateri;
    private javax.swing.JPanel tampilNilai;
    private javax.swing.JPanel tampilSetting;
    private javax.swing.JTable tbl_nilai1;
    private javax.swing.JTable tbl_rapot1;
    // End of variables declaration//GEN-END:variables
}
