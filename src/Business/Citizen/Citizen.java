/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Citizen;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author Parija
 */
public class Citizen {
    
    private static int cCountcID;
    private String cID;
    private String fname;
    private String lname;
    private String address1;
    private String address2;
    private String gender;
    private String state;
    private String city;

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    
    public static int getcCountcID() {
        return cCountcID;
    }

    public static void setcCountcID(int cCountcID) {
        Citizen.cCountcID = cCountcID;
    }

    public String getcID() {
        return cID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

   

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    private WorkQueue workQueue;

    public Citizen() {
        cID= "CID"+(++cCountcID);
        workQueue= new WorkQueue();
    }
    
    @Override
    public String toString(){
        return fname +" "+ lname;
    }
    
       
}
