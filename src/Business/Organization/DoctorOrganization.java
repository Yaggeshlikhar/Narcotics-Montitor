/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author likha
 */
public class DoctorOrganization extends Organization{

    public DoctorOrganization() {
        super(Organization.Type.DoctorOrganization.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new DoctorRole());
        return roles;
    }
    
}
