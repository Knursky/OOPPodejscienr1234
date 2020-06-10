package com.company;

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

    }
}
