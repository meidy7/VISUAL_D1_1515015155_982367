/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS6;


import javax.swing.table.DefaultTableModel;

/**
 *
 * @author someone
 */
public class TUGAS6 extends javax.swing.JFrame {
private DefaultTableModel model;
    /**
     * Creates new form TUGAS6
     */
    public TUGAS6() {
        initComponents();
    }

    public void InitTable(){
    
    model = new DefaultTableModel();
    model.addColumn("Judul");
    model.addColumn("Penerbit");
    model.addColumn("Tahun");
    model.addColumn("Harga");
    jTable1.setModel(model);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPenerbit = new javax.swing.JComboBox<>();
        jHarga = new javax.swing.JTextField();
        jJudul = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTahun = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Tambah = new javax.swing.JButton();
        Ulang = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Data Buku");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));

        jLabel2.setText("Judul");

        jLabel3.setText("Harga");

        jLabel4.setText("Penerbit");

        jPenerbit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Waterlangga", "Kadokawa", "Square Enix", "Unknown" }));

        jHarga.setText("jTextField1");
        jHarga.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jHargaCaretUpdate(evt);
            }
        });

        jJudul.setText("jTextField2");
        jJudul.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jJudulCaretUpdate(evt);
            }
        });

        jLabel5.setText("Tahun");

        jTahun.setText("jTextField3");
        jTahun.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTahunCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPenerbit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jJudul)
                    .addComponent(jHarga)
                    .addComponent(jTahun))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setLayout(new java.awt.GridLayout());

        Tambah.setText("Tambah");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });
        jPanel3.add(Tambah);

        Ulang.setText("Ulang");
        Ulang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UlangActionPerformed(evt);
            }
        });
        jPanel3.add(Ulang);

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel3.add(Update);

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        jPanel3.add(Hapus);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        // TODO add your handling code here:
        Object[]tau= new Object[4];
        tau[0]=jJudul.getText();
        tau[3]=jHarga.getText();
        tau[2]=jTahun.getText();
        tau[1]=jPenerbit.getSelectedItem();
    
        model.addRow(tau);
    }//GEN-LAST:event_TambahActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        int baris = jTable1.getSelectedRow();
        
        jTable1.setValueAt(jJudul.getText(), baris, 0);
        jTable1.setValueAt(jHarga.getText(), baris, 3);
        jTable1.setValueAt(jTahun.getText(), baris, 2);
        jTable1.setValueAt(jPenerbit.getSelectedItem(), baris, 1);
    }//GEN-LAST:event_UpdateActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        int baris = jTable1.getSelectedRow();
          model.removeRow(baris);
    }//GEN-LAST:event_HapusActionPerformed

    private void UlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UlangActionPerformed
        // TODO add your handling code here:
        jJudul.setText("");
        jHarga.setText("");
        jTahun.setText("");
        jJudul.requestFocus();
    }//GEN-LAST:event_UlangActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jJudul.setText("");
        jHarga.setText("");
        jTahun.setText("");
        
        
    }//GEN-LAST:event_formWindowOpened

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code he
        InitTable();
    }//GEN-LAST:event_formComponentShown

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int baris = 0;
        // TODO add your handling code here:
        String A = jTable1.getValueAt(baris, 0).toString();
        String B = jTable1.getValueAt(baris, 1).toString();
        String C = jTable1.getValueAt(baris, 2).toString();
        String D = jTable1.getValueAt(baris, 3).toString();
        
        jJudul.setText(A);
        jPenerbit.setSelectedItem(B);
        jTahun.setText(C);
        jHarga.setText(D);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jJudulCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jJudulCaretUpdate
        // TODO add your handling code here:
        if(jJudul.getText().length()==0||jHarga.getText().length()==0||jTahun.getText().length()==0){
            Tambah.setEnabled(false);
            Ulang.setEnabled(false);
            Update.setEnabled(false);
            Hapus.setEnabled(false);
        }else{
            Tambah.setEnabled(true);
            Ulang.setEnabled(true);
            Update.setEnabled(true);
            Hapus.setEnabled(true);
        }
    }//GEN-LAST:event_jJudulCaretUpdate

    private void jHargaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jHargaCaretUpdate
        // TODO add your handling code here:
        if(jJudul.getText().length()==0||jHarga.getText().length()==0||jTahun.getText().length()==0){
            Tambah.setEnabled(false);
            Ulang.setEnabled(false);
            Update.setEnabled(false);
            Hapus.setEnabled(false);
        }else{
            Tambah.setEnabled(true);
            Ulang.setEnabled(true);
            Update.setEnabled(true);
            Hapus.setEnabled(true);
        }
    }//GEN-LAST:event_jHargaCaretUpdate

    private void jTahunCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTahunCaretUpdate
        // TODO add your handling code here:
        if(jJudul.getText().length()==0||jHarga.getText().length()==0||jTahun.getText().length()==0){
            Tambah.setEnabled(false);
            Ulang.setEnabled(false);
            Update.setEnabled(false);
            Hapus.setEnabled(false);
        }else{
            Tambah.setEnabled(true);
            Ulang.setEnabled(true);
            Update.setEnabled(true);
            Hapus.setEnabled(true);
        }
    }//GEN-LAST:event_jTahunCaretUpdate

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
            java.util.logging.Logger.getLogger(TUGAS6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TUGAS6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TUGAS6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TUGAS6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TUGAS6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Tambah;
    private javax.swing.JButton Ulang;
    private javax.swing.JButton Update;
    private javax.swing.JTextField jHarga;
    private javax.swing.JTextField jJudul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jPenerbit;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTahun;
    // End of variables declaration//GEN-END:variables
}
