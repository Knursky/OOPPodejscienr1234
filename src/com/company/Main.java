package com.company;

import javafx.scene.input.ScrollEvent;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal dog = new Animal("dog");
        dog.name = "Pug";

        Phone zFlip = new Phone("Samsung", "zFlip", 6.2);

        Human me = new Human();
        me.firstName = "Adrian";
        me.lastName = "Andrzejewski";
        me.pet = dog;
        me.mobile = zFlip;
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();


        Car forDzik = new Car("Ford", "Focus", Boolean.FALSE, 4);
        me.car = forDzik;
        System.out.println(me.car.producer + " " + me.car.model + " " +"HOT?" + " " + me.car.HOT);
    }
}
