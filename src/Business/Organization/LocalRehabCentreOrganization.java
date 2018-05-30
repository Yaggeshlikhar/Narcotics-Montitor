/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author narcos
 */
public class LocalRehabCentreOrganization extends Organization{

    public LocalRehabCentreOrganization() {
        super(Type.LocalRehabCentre.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        
        roles.add(new DoctorRole());
        return roles;
    }
     
}
