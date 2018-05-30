/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Dhruv Sharma
 */
public class VictimOrganization extends Organization{

    public VictimOrganization(String name) {
        super(name);
    }
    

    @Override
    public HashSet<Role> getSupportedRole() {
        return null;//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
