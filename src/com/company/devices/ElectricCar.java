package com.company.devices;



public class ElectricCar extends Car {
    public ElectricCar(String producer, String model, Boolean HOT, Integer nrOfDoors) {
        super(producer, model, HOT, nrOfDoors);
    }

    @Override
    public void refuel() {
        System.out.println("when you oil you make them boil");
    }
    public String toString() {
        return "Broom Broom speaker engine " + super.toString();
    }
}