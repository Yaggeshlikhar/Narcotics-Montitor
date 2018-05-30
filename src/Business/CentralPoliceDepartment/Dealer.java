/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CentralPoliceDepartment;

/**
 *
 * @author likha
 */
public class Dealer {
    
    private String name;
    private String alias;
    private String status;
    private String activityArea;
    
    //need to associate dealer with area.

    public String getName() {
        return name;
    }

    public String getActivityArea() {
        return activityArea;
    }

    public void setActivityArea(String activityArea) {
        this.activityArea = activityArea;
    }
    
    

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    @Override
    public String toString(){
        return name;
    }
}
