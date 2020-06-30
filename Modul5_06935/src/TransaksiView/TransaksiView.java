
package TransaksiView;

import CRUD.crud;
import Models.*;
import modul5_06935.Modul5_06935;
import database.Koneksi;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static java.util.Date.parse;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.util.Date;

public class TransaksiView extends javax.swing.JFrame {
    private Transaksi transaksi;
    private Admin admin;
    private Penyewa penyewa;
    private crud crudz;
    private ArrayList<Detail_Transaksi> arrDetail;
    private int total;
    
    int i;
    
    public TransaksiView() throws SQLException {
        initComponents();
        this.transaksi = new Transaksi();
        this.admin = new Admin();
        this.crudz = new crud();
        this.showCbAdmin();
        this.showCbBarang();
        this.showCbPenyewa();
        this.showTabel();
    }
    
    public void showTabel() throws SQLException{
        DefaultTableModel tbl = new DefaultTableModel(new String[]{"ID_TRANSAKSI", "NAMA ADMIN", "NAMA PENYEWA", "NAMA BARANG", "JUMLAH", "HARGA TOTAL"}, 0);
        for(viewTabel view : this.crudz.getDataView()){
            System.out.println("Admin : " + view.getAdmin());
            tbl.addRow(new String[]{view.getTransaksi().toString(), view.getAdmin(), view.getPenyewa(), view.getBarang(), view.getJumlah().toString(), view.getHarga_total().toString()});
        }
        this.jTable.setModel(tbl);
    }
    
    public void showCbAdmin() throws SQLException{
        DefaultComboBoxModel dtmAdmin = new DefaultComboBoxModel();
        for(Admin adm : this.crudz.getDataAdmin()){
            dtmAdmin.addElement(adm.getUsername());
        }
        this.jAdmin.setModel(dtmAdmin);
    }
    public void showCbBarang() throws SQLException{
        DefaultComboBoxModel dtmBarang = new DefaultComboBoxModel();
        for(Barang barang : this.crudz.getDataBarang()){
            dtmBarang.addElement(barang.getNmbarang());
        }
        this.jBarang.setModel(dtmBarang);
    }
    public void showCbPenyewa() throws SQLException{
        DefaultComboBoxModel dtmsewa = new DefaultComboBoxModel();
        for(Penyewa sewa : this.crudz.getDataPenyewa()){
            dtmsewa.addElement(sewa.getNm_penyewa());
        }
        this.cbPenyewa.setModel(dtmsewa);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jAdmin = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTglsewa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLsewa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBarang = new javax.swing.JComboBox<>();
        jJumlah = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        cbPenyewa = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Admin");

        jAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Nama Penyewa");

        jLabel3.setText("Tanggal Sewa");

        jTglsewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTglsewaActionPerformed(evt);
            }
        });

        jLabel4.setText("Lama Sewa");

        jLabel5.setText("Nama Barang");

        jBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Jumlah");

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel7.setText("Total");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable);

        cbPenyewa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(25, 25, 25))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTotal)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbPenyewa, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(jAdmin, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLsewa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTglsewa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jJumlah, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBarang, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(98, 98, 98)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbPenyewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTglsewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLsewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsert)
                            .addComponent(btnDelete))
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setTotal(){
        this.jTotal.setText(String.valueOf(this.total));
    }
    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        try {
            System.out.println("ADMin : " + this.jAdmin.getSelectedItem().toString());
            Admin admin = this.crudz.getDataIdAdmin(this.jAdmin.getSelectedItem().toString());
            Penyewa penyewa = this.crudz.getDataIdPenyewa(this.cbPenyewa.getSelectedItem().toString());
            Transaksi transaksi = new Transaksi();
            transaksi.setId_admin(admin.getId_admin());
            transaksi.setId_penyewa(penyewa.getId_penyewa());
            transaksi.setLama_sewa(Integer.parseInt(this.jLsewa.getText()));
            transaksi.setTgl_Sewa(new SimpleDateFormat("dd/MM/yyyy").parse(this.jTglsewa.getText()));
            Barang barang = this.crudz.getDataIdBarang(this.jBarang.getSelectedItem().toString());
            Detail_Transaksi detail = new Detail_Transaksi();
            detail.setId_barang(barang.getId_Barang());
            detail.setNmbarang(barang.getNmbarang());
            detail.setTransaksi(transaksi);
            detail.setJumlah_barang(Integer.parseInt(this.jJumlah.getText()));
            Integer harga_total = (Integer.parseInt(this.jLsewa.getText()) * barang.getHrg_Sewa()) * Integer.parseInt(this.jJumlah.getText());
            detail.setHarga_total(harga_total);
            transaksi.setDetail(detail);
            
            this.crudz.insert(transaksi);
            this.showTabel();
            this.jTotal.setText(harga_total.toString());
            this.jTglsewa.setText("");
            this.jLsewa.setText("");
            this.jJumlah.setText("");
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(TransaksiView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnInsertActionPerformed

    private void jTglsewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTglsewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTglsewaActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        try {
            String select = this.jTable.getValueAt(this.jTable.getSelectedRow(), 0).toString();
            this.crudz.delete(Integer.parseInt(select));
            this.showTabel();
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        try {
            String select = this.jTable.getValueAt(this.jTable.getSelectedRow(), 0).toString();
            String selectBarang = this.jTable.getValueAt(this.jTable.getSelectedRow(), 3).toString();
            System.out.println("Barang : " + selectBarang);
            Transaksi transaksi = new Transaksi();
            transaksi.setId_transaksi(Integer.parseInt(select));
            transaksi.setLama_sewa(Integer.parseInt(this.jLsewa.getText()));
            Detail_Transaksi detail = new Detail_Transaksi();
            Barang barang = this.crudz.getDataIdBarang(selectBarang);
            detail.setJumlah_barang(Integer.parseInt(this.jJumlah.getText()));
            System.out.println("Id Barang : " + barang.getId_Barang().toString());
            detail.setId_barang(barang.getId_Barang());
            Integer Harga_total = (Integer.parseInt(this.jLsewa.getText()) * barang.getHrg_Sewa()) * Integer.parseInt(this.jJumlah.getText());
            detail.setHarga_total(Harga_total);
            transaksi.setDetail(detail);
            
            this.crudz.update(transaksi);
            this.showTabel();
            this.jTotal.setText(Harga_total.toString());
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(TransaksiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransaksiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransaksiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransaksiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TransaksiView().setVisible(true);
                } catch (SQLDataException ex) {
                    Logger.getLogger(TransaksiView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TransaksiView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbPenyewa;
    private javax.swing.JComboBox<String> jAdmin;
    private javax.swing.JComboBox<String> jBarang;
    private javax.swing.JTextField jJumlah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jLsewa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTglsewa;
    private javax.swing.JTextField jTotal;
    // End of variables declaration//GEN-END:variables



    private void jAdmin() throws SQLException{
        DefaultComboBoxModel cbAdmin = new DefaultComboBoxModel();
        for (Admin at : this.crudz.arrAdmin){
            cbAdmin.addElement(at.getUsername());
        }
        this.jAdmin.setModel(cbAdmin);
        
    }

    private void jBarang() throws SQLException{
        DefaultComboBoxModel cbBarang = new DefaultComboBoxModel();
        
        for(Barang b : this.crudz.arrBarang){
            cbBarang.addElement(b.getNmbarang());
            
        }
        
        this.jBarang.setModel(cbBarang);
    }

    private void jTotal() {

    }

}
