/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CaseRegistration;

/**
 *
 * @author likha
 */
public class CaseRegistration {
    
    private String caseId;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private int zip;
    private String caseDescription;
    private static int caseCount;

    public CaseRegistration(){
        caseId= "Case"+(++caseCount);
    }
    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public static int getCaseCount() {
        return caseCount;
    }

    public static void setCaseCount(int caseCount) {
        CaseRegistration.caseCount = caseCount;
    }

    public String getCaseDescription() {
        return caseDescription;
    }

    public void setCaseDescription(String caseDescription) {
        this.caseDescription = caseDescription;
    }

    public String getAddressLine1() {
        return addressLine1;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    
    
    
}
