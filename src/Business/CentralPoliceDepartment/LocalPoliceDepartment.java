/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CentralPoliceDepartment;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author narcos
 */
public class LocalPoliceDepartment {
    private String officerName;
    private static int pCount;
    private String officerId;
    private WorkQueue workQueue;
    
    private DealerCatalog dealerCatalogue;
    
    public LocalPoliceDepartment(){
        officerId= "PID"+(++pCount);
        workQueue= new WorkQueue();
        dealerCatalogue=new DealerCatalog();
    }

    

    public DealerCatalog getDealerCatalogue() {
        return dealerCatalogue;
    }

    public void setDealerCatalogue(DealerCatalog dealerCatalogue) {
        this.dealerCatalogue = dealerCatalogue;
    }
    
    

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public String getOfficerId() {
        return officerId;
    }

    public void setOfficerId(String officerId) {
        this.officerId = officerId;
    }
    
    
    @Override
    public String toString(){
        return officerName;
    }
}
