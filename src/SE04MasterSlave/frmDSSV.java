/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE04MasterSlave;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class frmDSSV extends javax.swing.JInternalFrame {

    private String header[] = {"MSSV", "Họ Tên", "Ngày Sinh", "Địa Chỉ", "Email"};
    private DefaultTableModel tblModel = new DefaultTableModel(header, 0);
    /**
     * Creates new form frmDSSV
     */
    public frmDSSV() {
        initComponents();
        
        loadKhoaAndFillToCBBox();
    }

    private void loadKhoaAndFillToCBBox(){
    Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String dbURL = "jdbc:sqlserver://phantrunghieu\\mssqlserver:1433;databaseName=stdmngt;user=sa;password=123456";

        try {
            conn = DriverManager.getConnection(dbURL);

            // Câu lệnh xem dữ liệu
            String sql = "select * from khoa ";

            // Tạo đối tượng thực thi câu lệnh Select
            st = conn.createStatement();

            // Thực thi 
            rs = st.executeQuery(sql);
            Vector data = null;
            DefaultComboBoxModel cmbModel = new DefaultComboBoxModel();

            // Nếu sách không tồn tại
            if (rs.isBeforeFirst() == false) {
                JOptionPane.showMessageDialog(this, "The Khoa is not available!");
                return;
            }

            // Trong khi chưa hết dữ liệu
            while (rs.next()) {
                data = new Vector();
                data.add(rs.getInt("makhoa"));
                data.add(rs.getString("tenkhoa"));

                // Thêm một dòng vào table model
                cmbModel.addElement(data);
            }

             jComboBoxDSKhoa.setModel(cmbModel);

            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private void loadSVbyKhoa(){
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String dbURL = "jdbc:sqlserver://phantrunghieu\\mssqlserver:1433;databaseName=stdmngt;user=sa;password=123456";

        int index = jComboBoxDSKhoa.getSelectedIndex();
        if(index <0) // khong kho nao duoc chon.
            return;
        Vector item = (Vector)jComboBoxDSKhoa.getSelectedItem();
        int makhoa = Integer.parseInt(item.get(0).toString());
        
        int k = 0;
        
        try {
            conn = DriverManager.getConnection(dbURL);

            
            // Câu lệnh xem dữ liệu
            String sql = "select mssv, hoten, ngaysinh, diachi, email from sinhvien where makhoa = "+ makhoa;
            

            // Tạo đối tượng thực thi câu lệnh Select
            st = conn.createStatement();

            // Thực thi 
            rs = st.executeQuery(sql);
            Vector data = null;

            tblModel.setRowCount(0);

            // Nếu sách không tồn tại
            if (rs.isBeforeFirst() == false) {
                JOptionPane.showMessageDialog(this, "The SinhVien is not available!");
                return;
            }

            // Trong khi chưa hết dữ liệu
            while (rs.next()) {
                data = new Vector();
                data.add(rs.getString("mssv"));
                data.add(rs.getString("hoten"));
                data.add(rs.getString("ngaysinh"));
                data.add(rs.getString("diachi"));
                data.add(rs.getString("email"));
                // Thêm một dòng vào table model
                tblModel.addRow(data);
            }

            jTableDSSV.setModel(tblModel); // Thêm dữ liệu vào table

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
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

        jComboBoxDSKhoa = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDSSV = new javax.swing.JTable();

        setClosable(true);
        setTitle("Danh Sách Sinh Viên");

        jComboBoxDSKhoa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxDSKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDSKhoaActionPerformed(evt);
            }
        });

        jLabel1.setText("Chọn Khoa:");

        jTableDSSV.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableDSSV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 140, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxDSKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDSKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxDSKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDSKhoaActionPerformed
        // TODO add your handling code here:
        loadSVbyKhoa();
    }//GEN-LAST:event_jComboBoxDSKhoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBoxDSKhoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDSSV;
    // End of variables declaration//GEN-END:variables
}
