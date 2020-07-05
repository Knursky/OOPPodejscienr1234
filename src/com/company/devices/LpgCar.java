package com.company.devices;

public class LpgCar extends Car {
public LpgCar(String producer, String model, boolean HOT, int nrOfDoors){
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