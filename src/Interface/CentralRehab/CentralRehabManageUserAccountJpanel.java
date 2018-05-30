/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.CentralRehab;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.LocalRehabCentreOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Parija
 */
public class CentralRehabManageUserAccountJpanel extends javax.swing.JPanel {

    private JPanel container;
    private Enterprise enterprise;
    LocalRehabCentreOrganization organization;

    /**
     * Creates new form LocalUserJPanel
     */
    public CentralRehabManageUserAccountJpanel(JPanel container, Enterprise enterprise, LocalRehabCentreOrganization organization) {
        initComponents();
        this.container = container;
        this.enterprise = enterprise;
        this.organization = organization;

        populateComboLocalDept();

    }

    public void populateLocalUser() {

        DefaultTableModel model = (DefaultTableModel) tblLocalUserDept.getModel();
        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();

                ((DefaultTableModel) tblLocalUserDept.getModel()).addRow(row);
            }
        }
    }

    public void populateComboRole(LocalRehabCentreOrganization e) {
        comboRole.removeAllItems();
        for (Role role : e.getSupportedRole()) {
            comboRole.addItem(role);
        }
    }

    public void populateComboLocalDept() {
        comboLocalDept1.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            comboLocalDept1.addItem(organization);
        }
    }

    public void populateEmployeeCombo(Organization organization) {
        comboEmployee.removeAllItems();

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            comboEmployee.addItem(employee);
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

        comboRole = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboLocalDept1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comboEmployee = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPwd = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLocalUserDept = new javax.swing.JTable();
        btnAddEmp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(comboRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 317, 187, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Network:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 256, 96, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Role:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 316, -1, -1));

        comboLocalDept1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboLocalDept1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLocalDept1ActionPerformed(evt);
            }
        });
        add(comboLocalDept1, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 258, 187, -1));

        jButton2.setText("Remove Employee");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 74, 200, 73));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage Local User");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 34, -1, -1));

        comboEmployee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(comboEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 287, 187, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Employee:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 287, 96, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 346, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 377, -1, -1));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 348, 187, -1));
        add(txtPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 379, 187, -1));

        tblLocalUserDept.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLocalUserDept);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 74, 417, 165));

        btnAddEmp.setText("Add Employee");
        btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpActionPerformed(evt);
            }
        });
        add(btnAddEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 419, 187, -1));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 457, 187, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed

        String userName = txtUserName.getText();
        String pwd = String.valueOf(txtPwd.getPassword());

        if (EcoSystem.checkIfUsernameIsUnique(userName)) {
            Organization organization = (Organization) comboLocalDept1.getSelectedItem();
            Role role = (Role) comboRole.getSelectedItem();
            Employee employee = (Employee) comboEmployee.getSelectedItem();

            organization.getUserAccountDirectory().createUserAccount(userName, pwd, employee, role, null);

            populateLocalUser();
        } else {
            JOptionPane.showMessageDialog(null, "Please Enter Unique Credentials", "Warning", JOptionPane.WARNING_MESSAGE);
        }

        txtUserName.setText("");
        txtPwd.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddEmpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboLocalDept1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLocalDept1ActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) comboLocalDept1.getSelectedItem();
        if (organization != null) {
            populateEmployeeCombo(organization);
            populateComboRole((LocalRehabCentreOrganization) organization);
        }
    }//GEN-LAST:event_comboLocalDept1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmp;
    private javax.swing.JComboBox comboEmployee;
    private javax.swing.JComboBox comboLocalDept1;
    private javax.swing.JComboBox comboRole;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLocalUserDept;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
