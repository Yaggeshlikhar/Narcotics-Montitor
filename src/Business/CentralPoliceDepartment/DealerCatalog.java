/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CentralPoliceDepartment;

import Business.CentralPoliceDepartment.Dealer;
import java.util.ArrayList;

/**
 *
 * @author likha
 */
public class DealerCatalog {

    private ArrayList<Dealer> dealerCatalog;

    public ArrayList<Dealer> getDealerCatalog() {
        return dealerCatalog;
    }

    public void setDealerCatalog(ArrayList<Dealer> dealerCatalog) {
        this.dealerCatalog = dealerCatalog;
    }

    public DealerCatalog() {

        dealerCatalog = new ArrayList<>();
    }

    public Dealer addDealer() {

        Dealer dealer = new Dealer();

        dealerCatalog.add(dealer);
        return dealer;

    }

    public void removeDealer(Dealer dealer) {
        dealerCatalog.remove(dealer);

    }

}
