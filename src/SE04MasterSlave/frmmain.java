/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE04MasterSlave;

/**
 *
 * @author Administrator
 */
public class frmmain extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public frmmain() {
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

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemThemKhoa = new javax.swing.JMenuItem();
        jMenuItemQLKhoa = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemDSSV = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management");
        getContentPane().setLayout(new java.awt.BorderLayout());

        jDesktopPane1.setName("Student Management"); // NOI18N
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Khoa");

        jMenuItemThemKhoa.setText("Thêm Khoa");
        jMenuItemThemKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemThemKhoaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemThemKhoa);

        jMenuItemQLKhoa.setText("QL Khoa");
        jMenuItemQLKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQLKhoaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemQLKhoa);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Sinh Viên");

        jMenuItemDSSV.setText("Danh Sách Sinh Viên");
        jMenuItemDSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDSSVActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemDSSV);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItemThemKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemThemKhoaActionPerformed
        // TODO add your handling code here:
        frmThemKhoa nif = new frmThemKhoa();
        jDesktopPane1.add(nif);
        nif.setVisible(true);
    }//GEN-LAST:event_jMenuItemThemKhoaActionPerformed

    private void jMenuItemQLKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQLKhoaActionPerformed
        // TODO add your handling code here:
        frmQLKhoa qlk = new frmQLKhoa();
        jDesktopPane1.add(qlk);
        qlk.setVisible(true);

    }//GEN-LAST:event_jMenuItemQLKhoaActionPerformed

    private void jMenuItemDSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDSSVActionPerformed
        // TODO add your handling code here:
        frmDSSV dssv= new frmDSSV();
        jDesktopPane1.add(dssv);
        dssv.setVisible(true);
    }//GEN-LAST:event_jMenuItemDSSVActionPerformed

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
            java.util.logging.Logger.getLogger(frmmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmmain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemDSSV;
    private javax.swing.JMenuItem jMenuItemQLKhoa;
    private javax.swing.JMenuItem jMenuItemThemKhoa;
    // End of variables declaration//GEN-END:variables
}