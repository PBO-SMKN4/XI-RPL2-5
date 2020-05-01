
package Management_Sekolah;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class FIRekapNilai_Guru extends javax.swing.JInternalFrame {

    Connection koneksi;
    public FIRekapNilai_Guru() {
        initComponents();
        koneksi = DatabaseConnection.getKoneksi("localhost", "3306", "root", "", "db_manajemensekolah");
        showData();
        
        BtnEdit.setEnabled(false);
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
    DefaultTableModel dtm;
    public void showData(){
        String[] kolom = {"NO","NIS","Nama Lengkap","Kelas","Nama Matpel","Tugas 1","Tugas 2","Tugas 3","Tugas 4","Tugas 5"};
        
        dtm = new DefaultTableModel(null, kolom);
        try{
            Statement stmt = koneksi.createStatement();
            String query = "SELECT * FROM t_siswa,t_matpel JOIN t_rekapnilai\n" 
                    + "WHERE t_matpel.kd_matpel = t_rekapnilai.kd_matpel "
                    + "AND t_siswa.nis = t_rekapnilai.nis ";
            ResultSet rs = stmt.executeQuery(query);
            int no = 1;
            while(rs.next()){
                String nis             = rs.getString("nis");
                String nama_lengkap    = rs.getString("nama_lengkap");
                String kelas           = rs.getString("kelas");
                String nama_matpel     = rs.getString("nama_matpel");
                String tugas1          = rs.getString("tugas1");
                String tugas2          = rs.getString("tugas2");
                String tugas3          = rs.getString("tugas3");
                String tugas4          = rs.getString("tugas4");
                String tugas5          = rs.getString("tugas5");
                
                dtm.addRow(new String[]{no+"",nis,nama_lengkap,kelas,nama_matpel,tugas1,tugas2,tugas3,tugas4,tugas5});
                no++;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan di Query");
        }
        tbl_nilai.setModel(dtm);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnSearch = new javax.swing.JButton();
        Inputcari = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_nilai = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Inputnis = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Inputnama = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Inputkelas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Inputt1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Inputt2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Inputt3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Inputt4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Inputt5 = new javax.swing.JTextField();
        BtnEdit = new javax.swing.JButton();
        BtnRefresh = new javax.swing.JButton();
        BtnTambah = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(840, 520));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel1.setText("Form Rekap Nilai Siswa");

        BtnSearch.setText("Search");
        BtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchActionPerformed(evt);
            }
        });

        Inputcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputcariActionPerformed(evt);
            }
        });

        jLabel11.setText("*Cari Berdasarkan Nis/Nama/Kelas");

        tbl_nilai.setModel(new javax.swing.table.DefaultTableModel(
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
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tbl_nilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_nilaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_nilai);

        jLabel2.setText("NIS");

        Inputnis.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Inputnis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputnisActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Lengkap");

        Inputnama.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Inputnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputnamaActionPerformed(evt);
            }
        });

        jLabel10.setText("Kelas");

        Inputkelas.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Tugas 1");

        jLabel6.setText("Tugas 2");

        jLabel7.setText("Tugas 3");

        jLabel8.setText("Tugas 4");

        jLabel9.setText("Tugas 5");

        BtnEdit.setText("Edit");
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });

        BtnRefresh.setText("Refresh");
        BtnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefreshActionPerformed(evt);
            }
        });

        BtnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_16px.png"))); // NOI18N
        BtnTambah.setText("Tambah");
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(BtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Inputcari, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel11)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Inputnis, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(Inputt1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(Inputt3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Inputt2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Inputt4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(Inputt5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(7, 7, 7)
                                    .addComponent(Inputnama))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(52, 52, 52)
                                    .addComponent(Inputkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnRefresh)))))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Inputcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Inputnis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Inputnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Inputkelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Inputt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(Inputt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Inputt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(Inputt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Inputt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnTambah)
                            .addComponent(BtnEdit)
                            .addComponent(BtnRefresh))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_nilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_nilaiMouseClicked
        Inputnis.setText(tbl_nilai.getValueAt(tbl_nilai.getSelectedRow(), 1).toString());
        Inputnama.setText(tbl_nilai.getValueAt(tbl_nilai.getSelectedRow(), 2).toString());
        Inputkelas.setText(tbl_nilai.getValueAt(tbl_nilai.getSelectedRow(), 3).toString());
        Inputt1.setText(tbl_nilai.getValueAt(tbl_nilai.getSelectedRow(), 5).toString());
        Inputt2.setText(tbl_nilai.getValueAt(tbl_nilai.getSelectedRow(), 6).toString());
        Inputt3.setText(tbl_nilai.getValueAt(tbl_nilai.getSelectedRow(), 7).toString());
        Inputt4.setText(tbl_nilai.getValueAt(tbl_nilai.getSelectedRow(), 8).toString());
        Inputt5.setText(tbl_nilai.getValueAt(tbl_nilai.getSelectedRow(), 9).toString());

        BtnEdit.setEnabled(true);
        Inputnis.setEnabled(false);
        Inputnama.setEnabled(false);
        Inputkelas.setEnabled(false);
    }//GEN-LAST:event_tbl_nilaiMouseClicked

    private void InputcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputcariActionPerformed

    private void InputnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputnamaActionPerformed

    private void InputnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputnisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputnisActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        String nis     = Inputnis.getText();
        String tugas1  = Inputt1.getText();
        String tugas2  = Inputt2.getText();
        String tugas3  = Inputt3.getText();
        String tugas4  = Inputt4.getText();
        String tugas5  = Inputt5.getText();

        try{
            Statement stmt = koneksi.createStatement();
            String query = "UPDATE t_rekapnilai SET "
            + "tugas1      = "+tugas1+","
            + "tugas2      = "+tugas2+","
            + "tugas3      = "+tugas3+","
            + "tugas4      = "+tugas4+","
            + "tugas5      = "+tugas5+" "
            + "WHERE nis   = '"+nis+"'  " ;
            System.out.println(query);
            int berhasil = stmt.executeUpdate(query);
            showData();
            if(berhasil == 1){
                JOptionPane.showMessageDialog(null,"Data Berhasil DiEdit");
            }else {
                JOptionPane.showMessageDialog(null,"Data Gagal DiDiedit");
            }
        }catch (SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan Pada Database");
        }
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        String nis      = Inputnis.getText();
        String nama     = Inputnama.getText();
        String kelas    = Inputkelas.getText();

        try{
            Statement stmt = koneksi.createStatement();
            String query = "INSERT INTO t_siswa VALUES( "
            + "nis          = '"+nis+"',"
            + "nama_lengkap = '"+nama+"',"
            + "kelas        = '"+kelas+"')";
            System.out.println(query);
            int berhasil = stmt.executeUpdate(query);
            showData();
            if(berhasil == 1){
                JOptionPane.showMessageDialog(null,"Data Berhasil DiEdit");
            }else {
                JOptionPane.showMessageDialog(null,"Data Gagal DiDiedit");
            }
        }catch (SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan Pada Database");
        }
    }//GEN-LAST:event_BtnTambahActionPerformed

    private void BtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefreshActionPerformed
        Inputnis.setEnabled(true);
        Inputnama.setEnabled(true);
        Inputkelas.setEnabled(true);
        Inputnis.setText("");
        Inputnama.setText("");
        Inputkelas.setText("");
        Inputt1.setText("");
        Inputt2.setText("");
        Inputt3.setText("");
        Inputt4.setText("");
        Inputt5.setText("");
    }//GEN-LAST:event_BtnRefreshActionPerformed

    private void BtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchActionPerformed
        try{
            Statement stmt = koneksi.createStatement();
            String query = "SELECT * FROM t_rekapnilai,t_siswa JOIN t_matpel "
            + " WHERE t_matpel.kd_matpel = t_rekapnilai.kd_matpel "
            + " AND t_siswa.nis = t_rekapnilai.nis "
            + " AND t_rekapnilai.nis LIKE '%" + Inputcari.getText() + "%'"
            + " OR t_siswa.nama_lengkap LIKE '%" + Inputcari.getText() + "%'"
            + " OR t_siswa.kelas LIKE '%" + Inputcari.getText() + "%'";
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);
            showData();
        }catch (Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan Pada Database");
        }
    }//GEN-LAST:event_BtnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnRefresh;
    private javax.swing.JButton BtnSearch;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JTextField Inputcari;
    private javax.swing.JTextField Inputkelas;
    private javax.swing.JTextField Inputnama;
    private javax.swing.JTextField Inputnis;
    private javax.swing.JTextField Inputt1;
    private javax.swing.JTextField Inputt2;
    private javax.swing.JTextField Inputt3;
    private javax.swing.JTextField Inputt4;
    private javax.swing.JTextField Inputt5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_nilai;
    // End of variables declaration//GEN-END:variables
}
