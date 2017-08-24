/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiiutscuaca.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.table.DefaultTableModel;
import piiiutscuaca.model.Cuaca;
import piiiutscuaca.model.User;

/**
 *
 * @author Rangga A.W / 1641809
 */
public class MonitoringCuaca extends javax.swing.JFrame {

    /**
     * Creates new form MonitoringCuaca
     */
    User temp;
    public MonitoringCuaca(User temp) {
        initComponents();
        this.temp = temp;
        this.jLabel1.setText("Selamat Datang, "+temp.getNama());
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date d = new Date();
        this.jLabel2.setText("Last login: "+df.format(d));
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/p3_u","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from t_kota");
            while(rs.next()){
                this.jComboBox1.addItem(rs.getString(2));
            }
//            rs = stmt.executeQuery("select * from t_cuaca where idKota = "+(this.jComboBox1.getSelectedIndex()+1));
//            DefaultTableModel model = (DefaultTableModel) this.jTable2.getModel();
//            int i = 1;
//            while(rs.next()){
//                model.addRow(new Object[]{i, rs.getDate(2), rs.getDouble(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6), rs.getDouble(7), rs.getDouble(8)});
//            }
            
        }catch(Exception e){}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        hapus = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Selamat datang, ");

        jLabel2.setText("Last login: ");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Waktu", "Suhu", "Suhu Max", "Suhu Min", "Kec Angin", "Kelembapan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        scrollPane1.add(jScrollPane2);

        jLabel3.setText("Kota");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        tambah.setText("TAMBAH");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Administrasi User");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Tambah User");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("Keluar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(196, 196, 196))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tambah)
                        .addGap(18, 18, 18)
                        .addComponent(edit)
                        .addGap(18, 18, 18)
                        .addComponent(hapus))
                    .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapus)
                    .addComponent(edit)
                    .addComponent(tambah))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try{
            DefaultTableModel model = (DefaultTableModel) this.jTable2.getModel();
            int count = model.getRowCount();
            //System.out.println("Ini jumlah Row "+count);
            for(int i=count -1;i >= 0; i--){
                model.removeRow(i);
            }
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/p3_u","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from t_cuaca where idKota = "+(this.jComboBox1.getSelectedIndex()+1));
            
            int i = 1;
            while(rs.next()){
                model.addRow(new Object[]{i, rs.getDate(2), rs.getDouble(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6), rs.getDouble(7), rs.getDouble(8)});
            }
            //count = model.getRowCount();
            //System.out.println("Ini jumlah Row setelah "+count);
        }catch(Exception e){}
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        int r = this.jTable2.getSelectedRow();
        int c = 0;
        DefaultTableModel model = (DefaultTableModel) this.jTable2.getModel();
        
        String t1 = (this.jComboBox1.getSelectedIndex()+1)+"";
        String t2 = model.getValueAt(r, c+1)+"";
        String t3 = model.getValueAt(r, c)+"";
        
        if(temp.getSu_user()==0||temp.getSu_user()==2){
            int reply = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ingin menghapus data "+t3);

            if(reply == JOptionPane.YES_OPTION){
                model.removeRow(r);
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/p3_u","root","");
                    Statement stmt = con.createStatement();

                    stmt.executeUpdate("DELETE FROM `t_cuaca` WHERE idkota = "+t1+" AND tanggal = '"+t2+"'");
                    System.out.println("DELETE FROM `t_cuaca` WHERE idkota = "+t1+" AND date = '"+t2+"'");
                }catch(Exception e){System.out.println("GAGAL");}
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Anda Bukan Admin", "Failed", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        if(temp.getSu_user()==0||temp.getSu_user()==2){
            TambahGUI t = new TambahGUI();
            t.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Anda Bukan Admin", "Failed", WARNING_MESSAGE);
        }
        //System.out.println(temp.getSu_user());
    }//GEN-LAST:event_tambahActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        int r = this.jTable2.getSelectedRow();
        int c = 0;
        DefaultTableModel model = (DefaultTableModel) this.jTable2.getModel();
        
        String t1 = (this.jComboBox1.getSelectedIndex()+1)+"";
        String t2 = model.getValueAt(r, c+1)+"";
        String t3 = model.getValueAt(r, c)+"";
        
        int reply = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ingin edit data "+t3);
        
        if(reply == JOptionPane.YES_OPTION){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/p3_u","root","");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from t_cuaca where idkota = "+t1+" AND tanggal = '"+t2+"'");
                //System.out.println("select * from t_cuaca where idkota = "+t1+" AND tanggal = "+t2);
                rs.next();
                Cuaca a;
                a = new Cuaca(0, rs.getDate(2), rs.getString(1), rs.getDouble(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(7), rs.getDouble(6), rs.getDouble(8));
                if(temp.getSu_user()==0||temp.getSu_user()==2){
                    EditCuaca ed = new EditCuaca(a);
                    ed.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Anda Bukan Admin", "Failed", WARNING_MESSAGE);
                }
                
            }catch(Exception e){System.out.println("GAGAL");}
        }
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/p3_u","root","");
//            Statement stmt = con.createStatement();
//            
//            
//        }catch(Exception e){}
    }//GEN-LAST:event_editActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(temp.getSu_user()==1||temp.getSu_user()==2){
            ManajemenUser mu = new ManajemenUser();
            mu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Anda Bukan Root", "Failed", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if(temp.getSu_user()==1||temp.getSu_user()==2){
            TambahUser mu = new TambahUser();
            mu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Anda Bukan Root", "Failed", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(MonitoringCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonitoringCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonitoringCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonitoringCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new MonitoringCuaca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable2;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JButton tambah;
    // End of variables declaration//GEN-END:variables
}
