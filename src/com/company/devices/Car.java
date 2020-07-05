package com.company.devices;


import com.company.Soldable;
import com.company.animals.Human;
import java.util.Comparator;




public abstract class Car extends Device implements Soldable,  Comparable<Car> {

    public final boolean HOT;
    public final Integer nrOfDoors;

    public Car(String producer, String model, Boolean HOT, Integer nrOfDoors) {
        super(producer, model);

        this.HOT = HOT;
        this.nrOfDoors = nrOfDoors;
    }

    abstract public void refuel();

    @Override
    public void turnOn() {
        System.out.println("Brum Brum");
    }

    public String toString() {
        return this.producer + " " + this.model + " " + this.nrOfDoors;
    }

    @Override
    public int compareTo(Car otherCar) {
        return this.nrOfDoors - otherCar.nrOfDoors;
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if (!seller.hasACar(this)) {
            throw new Exception("Seller needs a car first");
        }
        if (!buyer.hasAFreePlace()) {
            throw new Exception("buyer needs a car first");
        }
        if (buyer.cash < price) {
            throw new Exception("Not enaught cash");
        }
        buyer.removeCar(this);
        seller.addCar(this);
        buyer.cash -= price;
        seller.cash += price;
    }
}
