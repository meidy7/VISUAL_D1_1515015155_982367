/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS4;

/**
 *
 * @author someone
 */
public class LatihanBorderLayout extends javax.swing.JFrame {

    /**
     * Creates new form LatihanBorderLayout
     */
    public LatihanBorderLayout() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTengah = new javax.swing.JPanel();
        pCatatan = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        tgl = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btswktu = new javax.swing.JTextField();
        judul = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        isi = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        pHome = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pProfile = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pGaleri = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pInfo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pAbout = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jAtas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jBawah = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jKiri = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTengah.setBackground(new java.awt.Color(153, 255, 255));
        jTengah.setLayout(new java.awt.CardLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Tanggal          :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Batas Waktu  :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Judul              :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("isi                   :");

        isi.setColumns(20);
        isi.setRows(5);
        jScrollPane1.setViewportView(isi);

        jButton7.setText("SAVE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCatatanLayout = new javax.swing.GroupLayout(pCatatan);
        pCatatan.setLayout(pCatatanLayout);
        pCatatanLayout.setHorizontalGroup(
            pCatatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCatatanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCatatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCatatanLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pCatatanLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(btswktu, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pCatatanLayout.createSequentialGroup()
                        .addGroup(pCatatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(pCatatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                            .addGroup(pCatatanLayout.createSequentialGroup()
                                .addComponent(judul)
                                .addGap(2, 2, 2)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pCatatanLayout.setVerticalGroup(
            pCatatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCatatanLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pCatatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCatatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(btswktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCatatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCatatanLayout.createSequentialGroup()
                        .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pCatatanLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTengah.add(pCatatan, "card7");

        pHome.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TUGAS4/24745.jpg"))); // NOI18N

        javax.swing.GroupLayout pHomeLayout = new javax.swing.GroupLayout(pHome);
        pHome.setLayout(pHomeLayout);
        pHomeLayout.setHorizontalGroup(
            pHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pHomeLayout.setVerticalGroup(
            pHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTengah.add(pHome, "card2");

        pProfile.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TUGAS4/MMeidyFjava.jpg"))); // NOI18N

        jLabel1.setText("MUHAMMAD MEIDY FACHREZA");

        javax.swing.GroupLayout pProfileLayout = new javax.swing.GroupLayout(pProfile);
        pProfile.setLayout(pProfileLayout);
        pProfileLayout.setHorizontalGroup(
            pProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProfileLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(pProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pProfileLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addContainerGap(202, Short.MAX_VALUE))
                    .addGroup(pProfileLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pProfileLayout.setVerticalGroup(
            pProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jTengah.add(pProfile, "card3");

        pGaleri.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("check It now in instagram");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("@d15_magazine");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("don`t forget to follow hehe");

        javax.swing.GroupLayout pGaleriLayout = new javax.swing.GroupLayout(pGaleri);
        pGaleri.setLayout(pGaleriLayout);
        pGaleriLayout.setHorizontalGroup(
            pGaleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGaleriLayout.createSequentialGroup()
                .addGroup(pGaleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pGaleriLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(pGaleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pGaleriLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel12)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        pGaleriLayout.setVerticalGroup(
            pGaleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGaleriLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        jTengah.add(pGaleri, "card4");

        pInfo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TUGAS4/jadwal111.PNG"))); // NOI18N

        javax.swing.GroupLayout pInfoLayout = new javax.swing.GroupLayout(pInfo);
        pInfo.setLayout(pInfoLayout);
        pInfoLayout.setHorizontalGroup(
            pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel10)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        pInfoLayout.setVerticalGroup(
            pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTengah.add(pInfo, "card5");

        pAbout.setBackground(new java.awt.Color(255, 51, 51));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setText("ABOUT");
        jLabel11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel11FocusGained(evt);
            }
        });

        javax.swing.GroupLayout pAboutLayout = new javax.swing.GroupLayout(pAbout);
        pAbout.setLayout(pAboutLayout);
        pAboutLayout.setHorizontalGroup(
            pAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAboutLayout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(240, 240, 240))
        );
        pAboutLayout.setVerticalGroup(
            pAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAboutLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel11)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        jTengah.add(pAbout, "card6");

        getContentPane().add(jTengah, java.awt.BorderLayout.CENTER);

        jAtas.setBackground(new java.awt.Color(0, 0, 204));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SISTEM INFORMASI PRIBADI");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PROGRAM STUID INFORMASI TEKIK INFORMATIKA");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FAKULTAS ILMU KOMPUTER DAN TEKNOLOGI INFORMASI");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TUGAS4/unmullogo.png"))); // NOI18N

        javax.swing.GroupLayout jAtasLayout = new javax.swing.GroupLayout(jAtas);
        jAtas.setLayout(jAtasLayout);
        jAtasLayout.setHorizontalGroup(
            jAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAtasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(123, 123, 123))
        );
        jAtasLayout.setVerticalGroup(
            jAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAtasLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jAtasLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(jLabel14))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jAtas, java.awt.BorderLayout.PAGE_START);

        jBawah.setBackground(new java.awt.Color(0, 102, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("MODUL PRAKTIKUM PEMROGRAMAN VISUAL JAVA");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("Copyright@2017");

        javax.swing.GroupLayout jBawahLayout = new javax.swing.GroupLayout(jBawah);
        jBawah.setLayout(jBawahLayout);
        jBawahLayout.setHorizontalGroup(
            jBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBawahLayout.createSequentialGroup()
                .addGroup(jBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBawahLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel3))
                    .addGroup(jBawahLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel6)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jBawahLayout.setVerticalGroup(
            jBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBawahLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jBawah, java.awt.BorderLayout.PAGE_END);

        jKiri.setBackground(new java.awt.Color(0, 102, 255));

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("PROFILE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("GALERI");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("INFORMASI");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("ABOUT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("CATATAN");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jKiriLayout = new javax.swing.GroupLayout(jKiri);
        jKiri.setLayout(jKiriLayout);
        jKiriLayout.setHorizontalGroup(
            jKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jKiriLayout.setVerticalGroup(
            jKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        getContentPane().add(jKiri, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        pHome.setVisible(false);
        pProfile.setVisible(false);
        pInfo.setVisible(false);
        pAbout.setVisible(false);
        pGaleri.setVisible(true);
        pCatatan.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        pHome.setVisible(true);
        pProfile.setVisible(false);
        pInfo.setVisible(false);
        pAbout.setVisible(false);
        pGaleri.setVisible(false);
        pCatatan.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        pHome.setVisible(false);
        pProfile.setVisible(true);
        pInfo.setVisible(false);
        pAbout.setVisible(false);
        pGaleri.setVisible(false);
        pCatatan.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        pHome.setVisible(false);
        pProfile.setVisible(false);
        pInfo.setVisible(true);
        pAbout.setVisible(false);
        pGaleri.setVisible(false);
        pCatatan.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        pHome.setVisible(false);
        pProfile.setVisible(false);
        pInfo.setVisible(false);
        pAbout.setVisible(true);
        pGaleri.setVisible(false);
        pCatatan.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new CATATAN(tgl.getText(),btswktu.getText(),judul.getText(),isi.getText()).setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        pHome.setVisible(false);
        pProfile.setVisible(false);
        pInfo.setVisible(false);
        pAbout.setVisible(false);
        pGaleri.setVisible(false);
        pCatatan.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel11FocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel11FocusGained

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
            java.util.logging.Logger.getLogger(LatihanBorderLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LatihanBorderLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LatihanBorderLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LatihanBorderLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LatihanBorderLayout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField btswktu;
    private javax.swing.JTextArea isi;
    private javax.swing.JPanel jAtas;
    private javax.swing.JPanel jBawah;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jKiri;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jTengah;
    private javax.swing.JTextField judul;
    private javax.swing.JPanel pAbout;
    private javax.swing.JPanel pCatatan;
    private javax.swing.JPanel pGaleri;
    private javax.swing.JPanel pHome;
    private javax.swing.JPanel pInfo;
    private javax.swing.JPanel pProfile;
    private javax.swing.JTextField tgl;
    // End of variables declaration//GEN-END:variables
}