package com.company.animals;

import com.company.devices.Car;
import com.company.devices.Phone;


public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Pet pet;
    public Phone mobile;
    public Car[] garage; // 10.1

    public Animal[] farm;

    protected String phoneNumber;
    private Double salary;//task 3,4
    public Double cash = 666.0;//task8
    private static Double DEFAULT_FEED_WEIGHT = 2.5;
    private static final int DEFAULT_FARM_SIZE = 3;
    private static final int DEFAULT_GARAGE_SIZE = 3;



    public Human(Integer farmSize, Integer garageSize) {
        super("Homo Sapiens");
        this.farm = new Animal[farmSize];
        this.garage = new Car[garageSize];

    }

    public Human(Integer farmSize){
        super("Homo Sapiens");
        this.farm = new Animal[farmSize];
        this.garage = new Car[DEFAULT_GARAGE_SIZE];

    }

    public Human(){
        super("Homo Sapiens");
        this.farm = new Animal[DEFAULT_FARM_SIZE];
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }
    public Double getSalary() {
        return salary;
    }

    public void sell() throws Exception {

        throw new Exception("Selling Human for candies");


    }

    public void eat() throws Exception {
        throw new Exception("Eating human like candies");

    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    public void feed() {
        System.out.println("I'm a human I will use fork and knife");
        super.feed(DEFAULT_FEED_WEIGHT);

    }

    public Double valueOfCars(){
        Double value = 0.0;
        for (Car car : garage){
            if (car != null) {
                value += car.value;
            }
        }
        return value;
    }
    public Car getCar(Integer index) {
        return this.garage[index];

    }
    public void setCar(Car car, Integer index){
        this.garage[index] = car;

    }

    public boolean hasACar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar) {
                return true; }
        }
        return false;
    }
    public boolean hasAFreePlace() {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                return true;
            }
        }
        return false;
    }
    public void removeCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == car) {
                garage[i] = null;
            }
        }
    }
    public void addCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                garage[i] = car;
                break;
            }
        }
    }
    }
