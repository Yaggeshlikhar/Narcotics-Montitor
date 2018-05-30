/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.CentralPoliceDepartment.DealerCatalog;
import Business.CentralPoliceDepartment.LocalPoliceDepartmentDirectory;
import Business.Role.LocalPoliceDepartmentPoliceOfficer;
import Business.Role.Role;
import java.util.HashSet;
import Business.CentralPoliceDepartment.LocalPoliceDepartment;
import Business.Role.ReportingOfficerRole;

/**
 *
 * @author narcos
 */
public class LocalPoliceDepartmentOrganization extends Organization {

    private LocalPoliceDepartmentDirectory localPoliceDepartmentDirectory;
    private LocalPoliceDepartment localPoliceDepartment;
    private DealerCatalog dealerCatalog;

    public LocalPoliceDepartmentOrganization() {
        super(Type.LocalPoliceDepartment.getValue());
        dealerCatalog = new DealerCatalog();
    }

    public DealerCatalog getDealerCatalog() {
        return dealerCatalog;
    }

    public void setDealerCatalog(DealerCatalog dealerCatalog) {
        this.dealerCatalog = dealerCatalog;
    }

    public LocalPoliceDepartment getLocalPoliceDepartment() {
        return localPoliceDepartment;
    }

    public void setLocalPoliceDepartment(LocalPoliceDepartment localPoliceDepartment) {
        this.localPoliceDepartment = localPoliceDepartment;
    }

    public LocalPoliceDepartmentDirectory getLocalPoliceDepartmentDirectory() {
        return localPoliceDepartmentDirectory;
    }

    public void setLocalPoliceDepartmentDirectory(LocalPoliceDepartmentDirectory localPoliceDepartmentDirectory) {
        this.localPoliceDepartmentDirectory = localPoliceDepartmentDirectory;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new LocalPoliceDepartmentPoliceOfficer());
        roles.add(new ReportingOfficerRole());
        return roles;
    }

}
