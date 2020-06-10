package com.company;

public class Car {

    public final String producer;
    public final String model;
    public final boolean    HOT;
    public final Integer nrOfDoors;

    public Car(String producer, String model, Boolean HOT, Integer nrOfDoors){
        this.producer = producer;
        this.model = model;
        this.HOT = HOT;
        this.nrOfDoors = nrOfDoors;

    }
}
