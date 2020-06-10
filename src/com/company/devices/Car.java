package com.company.devices;

public class Car extends Device {

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
}
