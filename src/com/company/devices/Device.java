package com.company.devices;
import com.company.Soldable;
import com.company.Human;

public abstract class Device {
    final public String producer;
    final public String model;

    public  Device(String producer, String model){
        this.producer = producer;
                this.model = model;

    }

    public abstract void turnOn();
    public String getModel(){
        return this.model;

    }
}
