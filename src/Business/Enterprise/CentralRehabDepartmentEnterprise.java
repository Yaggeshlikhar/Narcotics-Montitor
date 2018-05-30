/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.CentralRehabDepartmentAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author likha
 */
public class CentralRehabDepartmentEnterprise extends Enterprise {

    public CentralRehabDepartmentEnterprise(String name) {
        super(name,Enterprise.EnterpriseType.CentralRehabDepartment);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new CentralRehabDepartmentAdminRole());
        return roles;
    }
    
}
