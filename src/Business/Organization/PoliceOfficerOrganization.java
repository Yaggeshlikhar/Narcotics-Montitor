/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.CentralPoliceDepartment.LocalPoliceDepartment;
import Business.Role.LocalPoliceDepartmentPoliceOfficer;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Dhruv Sharma
 */
public class PoliceOfficerOrganization extends Organization{
    LocalPoliceDepartment policeOfficer;
    public PoliceOfficerOrganization(){
        super(Type.LocalPoliceDepartment.getValue());
        policeOfficer=new LocalPoliceDepartment();
    }

    public LocalPoliceDepartment getPoliceOfficer() {
        return policeOfficer;
    }

    public void setPoliceOfficer(LocalPoliceDepartment policeOfficer) {
        this.policeOfficer = policeOfficer;
    }
    
    

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new LocalPoliceDepartmentPoliceOfficer());
        return roles;
    }
    
}
