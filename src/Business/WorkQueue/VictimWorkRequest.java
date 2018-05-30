/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.CaseRegistration.CaseRegistration;

/**
 *
 * @author narcos
 */
public class VictimWorkRequest extends WorkRequest{
    private String addressLine1;
    private String addressLine2;
    private String caseDesc;
    private String area;
    private boolean add;
    private CaseRegistration caseRegistration;

    public CaseRegistration getCaseRegistration() {
        return caseRegistration;
    }

    public void setCaseRegistration(CaseRegistration caseRegistration) {
        this.caseRegistration = caseRegistration;
    }
    
    public VictimWorkRequest(){
        add = false;
    }
    
    public String getAddressLine1() {
        return addressLine1;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCaseDesc() {
        return caseDesc;
    }

    public void setCaseDesc(String caseDesc) {
        this.caseDesc = caseDesc;
    }
    
}
