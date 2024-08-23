package carDeals;

import deals.DealsListener;
import deals.DealsType;

public class CarListener implements DealsListener {

    public void update(DealsType dealsType){
        System.out.println("Send Notification to "+dealsType.name()+" deals subscribers");
    }
}
