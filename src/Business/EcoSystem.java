package Business;

import Business.CaseRegistration.CaseRegistrationDirectory;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.PersonalDetails.PersonalDetailsDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Role.CentralPoliceDepartmentAdminRole;
import Business.Role.CentralRehabDepartmentAdminRole;
import Business.Role.CitizenRole;
import Business.Role.DoctorRole;
import Business.Role.LocalPoliceDepartmentPoliceOfficer;

import Business.Role.LocalRehabCentreAdminRole;
import Business.Role.ReportingOfficerRole;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Administrator
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private PersonalDetailsDirectory personalDetailsDirectory;
    private CaseRegistrationDirectory caseRegistrationDirectory;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        personalDetailsDirectory = new PersonalDetailsDirectory();
        caseRegistrationDirectory = new CaseRegistrationDirectory();

    }

    public PersonalDetailsDirectory getPersonalDetailsDirectory() {
        return personalDetailsDirectory;
    }

    public void setPersonalDetailsDirectory(PersonalDetailsDirectory personalDetailsDirectory) {
        this.personalDetailsDirectory = personalDetailsDirectory;
    }

    public CaseRegistrationDirectory getCaseRegistrationDirectory() {
        return caseRegistrationDirectory;
    }

    public void setCaseRegistrationDirectory(CaseRegistrationDirectory caseRegistrationDirectory) {
        this.caseRegistrationDirectory = caseRegistrationDirectory;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public static void setInstance(EcoSystem system) {
        business = system;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new SystemAdminRole());
        roles.add(new CentralPoliceDepartmentAdminRole());
        roles.add(new CentralRehabDepartmentAdminRole());
        roles.add(new LocalPoliceDepartmentPoliceOfficer());
        roles.add(new LocalRehabCentreAdminRole());

        roles.add(new DoctorRole());
        roles.add(new CitizenRole());
        roles.add(new ReportingOfficerRole());
        return roles;
    }

    public static boolean checkIfUsernameIsUnique(String username) {

        for (Network network : business.getNetworkList()) {

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equals(username)) {
                        return false;
                    }
                }

                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getUsername().equals(username)) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
