/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CitizenRole;
import Business.Role.Role;
import java.util.HashSet;
import Business.Citizen.Citizen;

/**
 *
 * @author Dhruv Sharma
 */
public class CitizenOrganization extends Organization {

    Citizen citizen;

    public CitizenOrganization() {
        super(Type.CitizenOrganization.getValue());
    }

    public Citizen getCitizen() {
        return citizen;
    }

    public void setCitizen(Citizen citizen) {
        this.citizen = citizen;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new CitizenRole());
        return roles;
    }

}
