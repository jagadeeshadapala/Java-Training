package org.app;

import carDeals.Car;
import carDeals.CarListener;
import deals.DealsListener;
import deals.DealsType;
import flightDeals.Flight;
import flightDeals.FlightListener;
import hotelDeals.Hotel;
import hotelDeals.HotelListener;

public class Main {

    public void sendNotificationToSubscribers(DealsType dealsType){
        DealsListener subscriber = null;
        switch(dealsType){
            case Flight -> {
                subscriber = new FlightListener();
                Flight flight = new Flight();
                flight.registerSubscriber(subscriber);
                flight.setDealType();

            }
            case Car ->{
                subscriber = new CarListener();
                Car car = new Car();
                car.registerSubscriber(subscriber);
                car.setDealType();
            }
            case Hotel -> {
                subscriber = new HotelListener();
                Hotel hotel = new Hotel();
                hotel.registerSubscriber(subscriber);
                hotel.setDealType();
            }

        }
    }
    public static void main(String[] args) {
        Main app = new Main();

        app.sendNotificationToSubscribers(DealsType.Flight);


    }
}