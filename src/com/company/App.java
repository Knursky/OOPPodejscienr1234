package com.company;


public class App {
    private String name;
    private String version;
    private Double price;
    private String http;

    public App(String name) {
        this.name = name;
        this.version = version;
        this.price = price;
    }
    public App(String name, String version) {
        this.name = name;
        this.version = version;
        this.price = price;
    }
    public App(String name, String version, String http) {
        this.name = name;
        this.version = version;
        this.price = price;
        this.http = http;
    }
    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return this.name + " " + this.version;
    }
}