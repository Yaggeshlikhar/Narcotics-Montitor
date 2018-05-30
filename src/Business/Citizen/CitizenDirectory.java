/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Citizen;

import java.util.ArrayList;

/**
 *
 * @author Parija
 */
public class CitizenDirectory {
    
    private ArrayList<Citizen> citizenDirectory;
    
    public CitizenDirectory() {
        citizenDirectory = new ArrayList<>();
    }

    public ArrayList<Citizen> getCitizenDirectory() {
        return citizenDirectory;
    }

    public void setCitizenDirectory(ArrayList<Citizen> citizenDirectory) {
        this.citizenDirectory = citizenDirectory;
    }

    public Citizen addCitizen(String name){
    
        Citizen citizen = new Citizen();
        citizenDirectory.add(citizen);
        return citizen;
        
    }
    
    
}
