/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CaseRegistration;

import java.util.ArrayList;

/**
 *
 * @author likha
 */
public class CaseRegistrationDirectory {
    
    private ArrayList<CaseRegistration> caseRegistrationDirectory;

    public CaseRegistrationDirectory() {
        
        caseRegistrationDirectory = new ArrayList<>();
    }

    public ArrayList<CaseRegistration> getCaseRegistrationDirectory() {
        return caseRegistrationDirectory;
    }

    public void setCaseRegistrationDirectory(ArrayList<CaseRegistration> caseRegistrationDirectory) {
        this.caseRegistrationDirectory = caseRegistrationDirectory;
    }
    
    public CaseRegistration addCaseRegistration() {
        CaseRegistration caseRegistration = new CaseRegistration();
        caseRegistrationDirectory.add(caseRegistration);
        return caseRegistration;
    }
    
    //Removing an Employee from the Directory
    public void removeSupplier(CaseRegistration caseRegistration) {
        caseRegistrationDirectory.remove(caseRegistration);
    }
    
}
