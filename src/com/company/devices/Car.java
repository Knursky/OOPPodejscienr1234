package com.company.devices;
import com.company.animals.Human;
import com.company.Soldable;

public class Car extends Device implements Soldable {

    public final boolean    HOT;
    public final Integer nrOfDoors;

    public Car(String producer, String model, Boolean HOT, Integer nrOfDoors){
     super(producer, model);

        this.HOT = HOT;
        this.nrOfDoors = nrOfDoors;

    }

    @Override
    public void turnOn(){
        System.out.println("Car engine started");

    }

      public String toString() {
        return this.producer + " " + this.model + " " + " nr of doors" + this.nrOfDoors;
    }


@Override
public void sell(Human buyer, Human seller, Double price) throws Exception {
    if (buyer.cash >= price) {
        buyer.car = this;
        buyer.cash -= price;
        seller.car = null;
        seller.cash += price;
        System.out.println(seller.firstName + " sell a car (" + this.model + ") to " + buyer + " for " + price);


    } else {


        throw new Exception("you don't have enough cash to buy it");


    }
}}



