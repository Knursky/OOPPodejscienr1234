package com.company.devices;

public class DieselCar extends Car {
    public DieselCar(String producer, String model, Boolean HOT, Integer nrOfDoors) {
        super(producer, model, HOT, nrOfDoors);
    }

    @Override
    public void refuel() {
        System.out.println("when you oil you make them boil");
    }
    public String toString() {
        return "Diesel cars are true men cars " + super.toString();
    }
}