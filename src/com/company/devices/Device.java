package com.company.devices;
import com.company.Soldable;
public abstract class Device implements Soldable {
//task 7
    final public String producer;
    final public String model;

    public  Device(String producer, String model){
        this.producer = producer;
                this.model = model;

    }
//task7
    public abstract void turnOn();
    public String getModel(){
        return this.model;

    }
    public void sell(){
        System.out.println("sold");

    }
}
