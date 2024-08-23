package carDeals;


import deals.DealsListener;
import deals.DealsSubject;
import deals.DealsType;

import java.util.ArrayList;
import java.util.List;

public class Car implements DealsSubject {

    List<DealsListener> subscribers = new ArrayList<>();
    private DealsType dealsType;

    public void registerSubscriber(DealsListener subscriber){
        subscribers.add(subscriber);
    }
    public void unRegisterSubscriber(DealsListener subscriber){
        subscribers.remove(subscriber);
    }
    public void sendNotification(){
        for(DealsListener subscriber:subscribers){
            subscriber.update(this.dealsType);
        }

    }

    public void setDealType(){
        this.dealsType = DealsType.Car;
        sendNotification();
    }
}
