/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS7;

/**
 *
 * @author someone
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class FormDataBuku extends javax.swing.JFrame {

    /**
     * Creates new form FormDataBuku
     */
    private DefaultTableModel model; //membuat model pada database
    private Connection con = Koneksi.getConnection(); // mengambil koneksi
    private Statement stt; // eksekusi querry
    private ResultSet rss; // menampung data dari database
    
    public FormDataBuku() {
        initComponents();
    }

    public void InitTable(){
        model = new DefaultTableModel(); //IOC variabel model
        model.addColumn("ID"); // merubah nama column lewat model
        model.addColumn("JUDUL"); // merubah nama column lewat model
        model.addColumn("PENULIS"); // merubah nama column lewat model
        model.addColumn("HARGA"); // merubah nama column lewat model
        tabel1.setModel(model); //mengeset column pada tabel1 berdasarkan model 
    }
    
    
    private void TampilData(){
        try{
            String sql = "SELECT * FROM buku"; // var sql menampung querry mysql
            stt = con.createStatement(); // pembuatan statement
            rss = stt.executeQuery(sql); // querry dieksekusi dan data ditampung
            while(rss.next()){ // perlulangan berlanjut selama cursor mendeteksi data selanjutnya
                Object[] o = new Object[4]; // pembuatan objek aray 4 index dengan var o 
                o[0] = rss.getString("id"); // menampung data pada column dari letak cursor pada baris saat ini
                o[1] = rss.getString("judul"); // menampung data pada column dari letak cursor pada baris saat ini
                o[2] = rss.getString("penulis"); // menampung data pada column dari letak cursor pada baris saat ini
                o[3] = rss.getInt("harga"); // menampung data pada column dari letak cursor pada baris saat ini
                model.addRow(o); } // menambahkan baris berdasarkan var array o
            }catch(SQLException e){ // jika terjadi exception
                    System.out.println(e.getMessage()); // menampilkan pesan error
                    }
        }
    
    private void TambahData(String judul,String penulis, String harga){ // method untuk menambah data
        try{
            String sql = "INSERT INTO buku VALUES (NULL,'"+judul+"','"+penulis+"',"+harga+")"; // var sql menampung querry mysql
        stt = con.createStatement(); // pembuatan statement
        stt.executeUpdate(sql); // eksekusi update statement pada var sql
        sql = "SELECT * FROM buku"; // var menampung querry
        rss = stt.executeQuery(sql); //querry dieksekusi dan data ditampung
        rss.last(); //letak cursor berada di akhir
        Object[] o= new Object[4]; // pembuatan objek aray 4 index dengan var o 
                o[0] = rss.getString("id"); // menampung data pada column dari letak cursor pada baris saat ini
                o[1] = rss.getString("judul"); // menampung data pada column dari letak cursor pada baris saat ini
                o[2] = rss.getString("penulis"); // menampung data pada column dari letak cursor pada baris saat ini
                o[3] = rss.getInt("harga"); // menampung data pada column dari letak cursor pada baris saat ini
                model.addRow(o);
        }catch(SQLException e){ //jika terjadi exception
            System.out.println(e.getMessage()); // menampilkan pesan error
        }
        
    }
    
    private void EditData(int id,String judul,String penulis, String harga,int baris){
        try{
            //String sql = "INSERT INTO buku VALUES (NULL,'"+judul+"','"+penulis+"',"+harga+")";
            String sql = "UPDATE buku SET judul = '"+judul+"',penulis = '"+penulis+"',harga = '"+harga+"' WHERE buku.id = "+id+""; //querry update data
        stt = con.createStatement(); // membuat stament
        stt.executeUpdate(sql); // eksekusi statement update
        tabel1.setValueAt(String.valueOf(id), baris, 0); //mengeset nilai table pada baris sekian dan kolom sekian
        tabel1.setValueAt(judul, baris, 1); //mengeset nilai table pada baris sekian dan kolom sekian
        tabel1.setValueAt(penulis, baris, 2); //mengeset nilai table pada baris sekian dan kolom sekian
        tabel1.setValueAt(harga, baris, 3); //mengeset nilai table pada baris sekian dan kolom sekian
        }catch(SQLException e){ // penanganan exception
            System.out.println(e.getMessage());
        }
        
    }
    
    private void HapusData(int id){
        try{
            //String sql = "INSERT INTO buku VALUES (NULL,'"+judul+"','"+penulis+"',"+harga+")";
            String sql = "DELETE FROM buku WHERE buku.id = "+id+""; // var menampung wuerry hapus data
        stt = con.createStatement(); // pembuatan wadah yang sudah terkoneksi ke database untuk menampung statement
        stt.executeUpdate(sql); // eksekusi statement dari var sql
        }catch(SQLException e){ // jika terjadi exception
            System.out.println(e.getMessage()); // menampilkan pesan
        }
        
    }
    
    private void Searching(String kolom,String data){
        try{
            //String sql = "INSERT INTO buku VALUES (NULL,'"+judul+"','"+penulis+"',"+harga+")";
            String sql = "SELECT * from buku ";
        stt = con.createStatement();
        rss = stt.executeQuery(sql);
            while(rss.next()){
                Object[] o = new Object[4];
                o[0] = rss.getString("id");
                o[1] = rss.getString("judul");
                o[2] = rss.getString("penulis");
                o[3] = rss.getInt("harga");
                model.addRow(o); }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        comboPenulis = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        simpan = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        Pencarian = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        by = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Form Data Buku");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Judul");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Penulis");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Harga");

        txtJudul.setText("jTextField1");

        txtHarga.setText("jTextField3");

        comboPenulis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tere Liye", "Eichiro Oda", "Felix Siauw", "Asma Nadia", "Dewi Lestari" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHarga)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(comboPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 300, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14)
                        .addComponent(txtJudul, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        jPanel3.add(simpan);

        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        jPanel3.add(ubah);

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        jPanel3.add(hapus);

        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jPanel3.add(keluar);

        Pencarian.setText("jTextField1");
        Pencarian.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                PencarianCaretUpdate(evt);
            }
        });
        Pencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PencarianActionPerformed(evt);
            }
        });
        Pencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PencarianKeyPressed(evt);
            }
        });

        jLabel5.setText("Search :");

        jLabel6.setText("By :");

        by.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id", "judul", "penulis", "harga", " " }));

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(5, 5, 5)
                                .addComponent(Pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        InitTable(); // menjalankan method
        TampilData(); // menjalankan method agar data dari database tampil di table java
        txtJudul.setText(""); // mengeset nilai pada jtextfield
        txtHarga.setText(""); // mengeset nilai pada jtextfield
        Pencarian.setText(""); // mengeset nilai pada jtextfield
     
    }//GEN-LAST:event_formComponentShown

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        String judul = txtJudul.getText(); // mengambil nilai dari jtextfield dan ditampung di var judul
        String penulis = comboPenulis.getSelectedItem().toString(); // mengambil nilai dari combobuton dan ditampung di var judul
        String harga = txtHarga.getText(); // mengambil nilai dari jtextfield dan ditampung di var judul
        TambahData(judul,penulis,harga); // menjalankan method dengan mengirimkan 3 parameter
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        int baris = tabel1.getSelectedRow(); // mengambil nilai saat mouse mengklik tabel
        int ID = Integer.parseInt(tabel1.getValueAt(baris, 0).toString()); // mengambil nilai object dari baris yang ditunjuk dengan dikonversi ke string dan dikonversi lagi menjadi int
        HapusData(ID); // menjalankan method hapus data pada table dan berpengaruh ke java
          model.removeRow(baris); // menghapus baris
    }//GEN-LAST:event_hapusActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        int baris = tabel1.getSelectedRow(); //mengambil nilai pada baris yang diklik
        int ID = Integer.parseInt(tabel1.getValueAt(baris, 0).toString()); // mengambil nilai object dari baris yang ditunjuk dengan dikonversi ke string dan dikonversi lagi menjadi int
        String A = txtJudul.getText(); // mengambil nila pada jtextfield dan ditampung ke var
        String B = String.valueOf(comboPenulis.getSelectedItem()); // mengambil nila pada combobuton dan ditampung ke var
        String C = txtHarga.getText(); // mengambil nila pada jtextfield dan ditampung ke var
        EditData(ID,A,B,C,baris); //menjalankan method
    }//GEN-LAST:event_ubahActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0); // jika di klik program selesai
    }//GEN-LAST:event_keluarActionPerformed

    private void PencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PencarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PencarianActionPerformed

    private void PencarianKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PencarianKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_PencarianKeyPressed

    private void PencarianCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_PencarianCaretUpdate
        // TODO add your handling code here
        /*if(Pencarian.getText().length()==0){
            initable.setVisible(true);
            initable2.setVisible(false);
        }else{ 
            //Searching(by.getSelectedItem().toString(),Pencarian.getText());
            initable.setVisible(false);
            initable2.setVisible(true);
        }*/
    }//GEN-LAST:event_PencarianCaretUpdate

    private void tabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel1MouseClicked
        // TODO add your handling code here:
        int baris = tabel1.getSelectedRow(); // menagmbil nilai saat mouse mengklik baris
        // TODO add your handling code here:
        String A= tabel1.getValueAt(baris, 1).toString(); // mengambil data pada baris sekian dan olom sekian
        String B = tabel1.getValueAt(baris, 2).toString(); // mengambil data pada baris sekian dan olom sekian
        String C = tabel1.getValueAt(baris, 3).toString(); // mengambil data pada baris sekian dan olom sekian
        
        txtJudul.setText(A); //mengeset jtextfield berdasarkan var A
        comboPenulis.setSelectedItem(B); //mengeset jtextfield berdasarkan var B
        txtHarga.setText(C); //mengeset jtextfield berdasarkan var C
    }//GEN-LAST:event_tabel1MouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Pencarian;
    private javax.swing.JComboBox<String> by;
    private javax.swing.JComboBox<String> comboPenulis;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabel1;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
