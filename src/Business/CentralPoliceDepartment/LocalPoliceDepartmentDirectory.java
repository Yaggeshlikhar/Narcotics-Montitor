/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CentralPoliceDepartment;

import java.util.ArrayList;

/**
 *
 * @author narcos
 */
public class LocalPoliceDepartmentDirectory {
    private ArrayList<LocalPoliceDepartment> localPoliceDepartmentList;
    
    public LocalPoliceDepartmentDirectory(){
        localPoliceDepartmentList= new ArrayList<>();
    }

    public ArrayList<LocalPoliceDepartment> getLocalPoliceDepartmentList() {
        return localPoliceDepartmentList;
    }

    public void setPoliceOfficerList(ArrayList<LocalPoliceDepartment> localPoliceDepartmentList) {
        this.localPoliceDepartmentList = localPoliceDepartmentList;
    }

   
     public LocalPoliceDepartment addPoliceOfficer() {
        LocalPoliceDepartment localPoliceDepartment =new LocalPoliceDepartment();
        localPoliceDepartmentList.add(localPoliceDepartment);
        return localPoliceDepartment;
    }
    
    //Removing an Employee from the Directory
    public void removePoliceOfficer(LocalPoliceDepartment localPoliceDepartment) {
        localPoliceDepartmentList.remove(localPoliceDepartment);
    }
    
}
