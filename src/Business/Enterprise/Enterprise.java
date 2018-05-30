/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Citizen.CitizenDirectory;
import Business.CentralPoliceDepartment.DealerCatalog;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author narcos
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private CitizenDirectory citizenDirectory;
    private DealerCatalog dealerCatalog;

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        citizenDirectory = new CitizenDirectory();
        dealerCatalog = new DealerCatalog();
    }

    public enum EnterpriseType {
        CentralPoliceDepartment("Police Department"), CentralRehabDepartment("Rehab Department");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public CitizenDirectory getCitizenDirectory() {
        return citizenDirectory;
    }

    public DealerCatalog getDealerCatalog() {
        return dealerCatalog;
    }

}
