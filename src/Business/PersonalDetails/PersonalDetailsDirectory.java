/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PersonalDetails;

import java.util.ArrayList;

/**
 *
 * @author likha
 */
public class PersonalDetailsDirectory {
    
    private ArrayList<PersonalDetails> personalDetailsDirectory;

    public PersonalDetailsDirectory() {
    
    personalDetailsDirectory = new ArrayList<>();
        
    }

    public ArrayList<PersonalDetails> getPersonalDetailsDirectory() {
        return personalDetailsDirectory;
    }

    public void setPersonalDetailsDirectory(ArrayList<PersonalDetails> personalDetailsDirectory) {
        this.personalDetailsDirectory = personalDetailsDirectory;
    }
    
    
    
}
