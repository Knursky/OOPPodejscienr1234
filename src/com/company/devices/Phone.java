package com.company.devices;




public class Phone extends Device{

    final Double screenSize;

    public Phone(String producer, String model, Double screenSize) {
      super(producer,model);
        this.screenSize = screenSize;
    }
    @Override
    public void turnOn(){
        System.out.println("Galaxy Turned on");
    }
}

