/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LocalRehab;

import Business.Organization.LocalRehabCentreOrganization;
import Business.Organization.Organization;

/**
 *
 * @author narcos
 */
public class LabAssistant {
    private String labAssistantName;

    public String getLabAssistantName() {
        return labAssistantName;
    }

    public void setLabAssistantName(String labAssistantName) {
        this.labAssistantName = labAssistantName;
    }

    
    
    @Override
    public String toString(){
        return labAssistantName;
    }
    
}
