/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Main;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CitizenOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.Citizen.CitizenRegistrationWorkAreaJPanel;
import Interface.User.Choice;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Interface.SystemAdminWorkAreas.ManageNetworkJPanel;

/**
 *
 * @author narcos
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    EcoSystem system;
    Enterprise enterprise;
    Network network;
    DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    Organization organization;
    
    
    UserAccount account;
    CitizenOrganization citizenOrganization;

    public MainJFrame() {
        initComponents();
      //dB4OUtil.storeSystem(system);
      system = dB4OUtil.retrieveSystem();
        //dB4OUtil.storeSystem(system);
       EcoSystem.setInstance(system);
       setExtendedState(getExtendedState()| JFrame.MAXIMIZED_BOTH);
//        VaccineDirectory v= new VaccineDirectory();
//        DiseaseDirectory d= new DiseaseDirectory();
//        system.setDiseaseList(d);
//        system.setVaccineList(v);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        btnReportACase = new javax.swing.JButton();
        btnGetRegistered = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Password");

        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        btnReportACase.setText("Report a Case");
        btnReportACase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportACaseActionPerformed(evt);
            }
        });

        btnGetRegistered.setText("Get Registered");
        btnGetRegistered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetRegisteredActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReportACase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginJLabel))
            .addComponent(btnGetRegistered, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnReportACase, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGetRegistered, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome To Narcos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(422, Short.MAX_VALUE))
        );

        container.add(jPanel2, "card2");
        jPanel2.getAccessibleContext().setAccessibleDescription("");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name
        String userName = userNameJTextField.getText();
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system user account directory if you have the user
//        system = dB4OUtil.retrieveSystem();
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        if (userAccount == null) {
            //Step2: Go inside each network to check each enterprise
            for (Network network : system.getNetworkList()) {
                //Step 2-a: Check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        //Step3: Check against each organization inside that enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            
                            if (userAccount != null) {
                            //    System.out.println("organi"+ organization.getName());
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }
                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }
    
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid Credentails!");
            return;
        } else {
            CardLayout layout = (CardLayout) container.getLayout();
            container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system));
            layout.next(container);
        }
         loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);

        userNameJTextField.setText("");
        passwordField.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void btnReportACaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportACaseActionPerformed
        // TODO add your handling code here:
        Choice c=new Choice(container,system,enterprise,network,organization);
        container.add("c",c);
        CardLayout layout=(CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnReportACaseActionPerformed

    private void btnGetRegisteredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetRegisteredActionPerformed
        // TODO add your handling code here:
        CitizenRegistrationWorkAreaJPanel crwajp = new CitizenRegistrationWorkAreaJPanel(container,system,enterprise,network,citizenOrganization,account);
        container.add("CitizenWorkAreJPanel", crwajp);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnGetRegisteredActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetRegistered;
    private javax.swing.JButton btnReportACase;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
