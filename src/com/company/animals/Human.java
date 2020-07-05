package com.company.animals;

import com.company.devices.Car;
import com.company.devices.Phone;


public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;
 public Phone mobile;
 public Car car;


    protected String phoneNumber;
    private Double salary;//task 3,4
    public Double cash = 666.0;//task8
    public Human(){
        super("Homo Sapiens");

    }

    public Double getSalary(){
        return salary;
    }
    public void sell() throws Exception{

        throw new Exception("Selling Human for candies");


    }

    public void eat() throws Exception{
        throw new Exception("Eating human like candies");

    }
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}