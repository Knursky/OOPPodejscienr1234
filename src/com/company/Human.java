package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;


public class Human extends Animal{
    public String firstName;
    public String lastName;
    public Animal pet;
 public Phone mobile;
 public Car car;


    protected String phoneNumber;
    private Double salary;

    public Human(){
        super("Homo Sapiens");

    }

    public Double getSalary(){
        return salary;
    }
}