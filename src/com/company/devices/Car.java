package com.company.devices;


import com.company.Soldable;
import com.company.animals.Human;



public abstract class Car extends Device implements Soldable {

    public final boolean    HOT;
    public final Integer nrOfDoors;

    public Car(String producer, String model, Boolean HOT, Integer nrOfDoors){
        super(producer, model);

        this.HOT = HOT;
        this.nrOfDoors = nrOfDoors;
    }

    abstract public void refuel();

    @Override
    public void turnOn() {
        System.out.println("car is ready to go");
    }

    public String toString() {
        return this.producer + " " + this.model + " " + this.nrOfDoors;
    }


    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if (buyer.cash >= price) {
            buyer.car = this;
            buyer.cash -= price;
            seller.car = null;
            seller.cash += price;
            System.out.println(seller.firstName + " sell (" + this.model + ") to " + buyer + " for " + price);
        } else {
            throw new Exception("You dont have enaught money");
        }
    }
}
