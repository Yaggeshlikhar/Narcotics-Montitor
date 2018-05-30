/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CentralRehabilitationDepartment;

import java.util.ArrayList;

/**
 *
 * @author Dhruv Sharma
 */
public class LocalRehabCenterDirectory {
    private ArrayList<LocalRehabCenter> localRehabCenterDirectory;
    
    public LocalRehabCenterDirectory(){
    localRehabCenterDirectory=new ArrayList<>();
    }

    public ArrayList<LocalRehabCenter> getLocalRehabCenterDirectory() {
        return localRehabCenterDirectory;
    }
 
    public LocalRehabCenter addLocalRehab(){
        LocalRehabCenter localrehab=new LocalRehabCenter();
        localRehabCenterDirectory.add(localrehab);
        return localrehab;
    }
    public void removeLocalRehab(LocalRehabCenter localRehabCenter ){
        localRehabCenterDirectory.remove(localRehabCenter);
    }
}
