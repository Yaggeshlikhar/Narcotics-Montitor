/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author narcos
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.LocalPoliceDepartment.getValue())){
            organization = new LocalPoliceDepartmentOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.LocalRehabCentre.getValue())){
            organization = new LocalRehabCentreOrganization();
            organizationList.add(organization);
        }
       
        else if (type.getValue().equals(Type.DoctorOrganization.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PoliceOfficerOrganization.getValue())){
            organization = new PoliceOfficerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CitizenOrganization.getValue())){
            organization = new CitizenOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}