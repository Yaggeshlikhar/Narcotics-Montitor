/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.CentralPoliceDepartment.DealerCatalog;
import java.util.ArrayList;

/**
 *
 * @author narcos
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.CentralPoliceDepartment){
            enterprise = new CentralPoliceDepartmentEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.CentralRehabDepartment){
            enterprise = new CentralRehabDepartmentEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
    
}
