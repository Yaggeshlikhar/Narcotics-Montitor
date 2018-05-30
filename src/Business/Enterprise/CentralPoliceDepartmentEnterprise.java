/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.CentralPoliceDepartmentAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author likha
 */
public class CentralPoliceDepartmentEnterprise extends Enterprise {

    public CentralPoliceDepartmentEnterprise(String name) {
        super(name,Enterprise.EnterpriseType.CentralPoliceDepartment);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new CentralPoliceDepartmentAdminRole());
        return roles;
    }
    
}
