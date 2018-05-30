/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Citizen.CitizenDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.HashSet;

/**
 *
 * @author narcos
 */
public abstract class Organization {

    private String name;

    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private CitizenDirectory citizenDirectory;
    private int organizationID;
    private static int counter = 0;
    public HashSet<Role> roles;

    public enum Type {
        LocalPoliceDepartment("Local Police Department"),
        LocalRehabCentre("Local Rehab Centre"),
        PoliceOfficerOrganization("Police Officer Organization"),
        DoctorOrganization("Doctor Organization"),
        LabAssistantOrganization("Lab Assistant Organization"),
        CitizenOrganization("Citizen Organization"),
        VictimOrganization("Victim Organization");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        citizenDirectory = new CitizenDirectory();
        userAccountDirectory = new UserAccountDirectory();

        organizationID = counter;
        roles = new HashSet<>();
        ++counter;
    }

    public abstract HashSet<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public CitizenDirectory getCitizenDirectory() {
        return citizenDirectory;
    }

    public void setCitizenDirectory(CitizenDirectory citizenDirectory) {
        this.citizenDirectory = citizenDirectory;
    }

    @Override
    public String toString() {
        return name;
    }

}
