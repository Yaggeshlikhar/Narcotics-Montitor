/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ReportingOfficer;

import Business.CentralPoliceDepartment.Dealer;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.LocalPoliceDepartmentOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VictimWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author likha
 */
public class ReportingOfficerJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    LocalPoliceDepartmentOrganization organization;
    Enterprise enterprise;
    EcoSystem business;
    ArrayList<WorkRequest> listofreq;
    ArrayList<Employee> emp;

    /**
     * Creates new form LocalPoliceDepartmentWorkArea
     */
    public ReportingOfficerJPanel(JPanel userProcessContainer, UserAccount account, LocalPoliceDepartmentOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        this.organization = organization;
        this.listofreq = organization.getWorkQueue().getWorkRequestList();
        this.emp = organization.getEmployeeDirectory().getEmployeeList();
        setSize(1000, 1000);
        populateRequestTable(emp);

    }

    public void populateRequestTable(ArrayList<Employee> emp) {
        DefaultTableModel model = (DefaultTableModel) requestTable1.getModel();
        model.setRowCount(0);

        for (WorkRequest work : listofreq) {

            if (work instanceof VictimWorkRequest) {
                if (((VictimWorkRequest) work).getArea().equals(enterprise.toString())) {

                    Object[] row = new Object[4];

                    row[0] = ((VictimWorkRequest) work).getAddressLine1();
                    row[2] = ((VictimWorkRequest) work).getCaseDesc();
                    row[1] = work;

                    row[3] = ((VictimWorkRequest) work).getArea();
                    model.addRow(row);

                }
            }
        }
    }

    public void populateSuspects() {

        DefaultTableModel model = (DefaultTableModel) tblSuspects.getModel();
        model.setRowCount(0);

        for (Dealer dealer : organization.getDealerCatalog().getDealerCatalog()) {
            if (dealer.getStatus().equalsIgnoreCase("Active")) {
                Object[] row = new Object[4];

                row[0] = dealer;
                row[1] = dealer.getAlias();
                row[2] = dealer.getActivityArea();
                row[3] = dealer.getStatus();
                model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSuspects = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCaseDesc = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        requestTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Local Police Department");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 28, -1, -1));

        tblSuspects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Alias", "Area", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSuspects);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 470, 115));

        txtCaseDesc.setEditable(false);
        txtCaseDesc.setColumns(20);
        txtCaseDesc.setRows(5);
        txtCaseDesc.setEnabled(false);
        jScrollPane1.setViewportView(txtCaseDesc);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 265, 256, 157));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Case Description:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 225, -1, -1));

        jButton1.setText("Case Description");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 150, 38));

        requestTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Address", "Status", "Description", "Area"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(requestTable1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 75, 470, 115));

        jButton2.setText("Suspects");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 150, 38));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = requestTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!");
        } else {
            // listofreq list= requestTable.getValueAt(selectedRow, 0);
            txtCaseDesc.setText((String) requestTable1.getValueAt(selectedRow, 2));
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        populateSuspects();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable requestTable1;
    private javax.swing.JTable tblSuspects;
    private javax.swing.JTextArea txtCaseDesc;
    // End of variables declaration//GEN-END:variables
}
