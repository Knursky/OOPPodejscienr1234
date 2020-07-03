package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.devices.Device;


public class Main {

    public static void main(String[] args)throws    Exception {
	// write your code here

        Animal dog = new Animal("dog");
        dog.name = "Pug";

        Phone zFlip = new Phone("Samsung", "zFlip", 6.2);

        Human me = new Human();
        me.firstName = "Adrian";
        me.lastName = "And";
        me.pet = dog;
        me.mobile = zFlip;
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();


        Car forDzik = new Car("Ford", "Focus", Boolean.FALSE, 4);
        me.car = forDzik;
        System.out.println(me.car.producer + " " + me.car.model + " " +"HOT?" + " " + me.car.HOT);
        System.out.println("blablablabla");
        System.out.println(me instanceof Animal);
        System.out.println(me instanceof Human);
        System.out.println(me instanceof Object);

me.feed();
me.pet .feed();

zFlip.turnOn();
forDzik.turnOn();
//task 6
 Human knurzyca = new Human();
 knurzyca.firstName = "Katarzyna";
 knurzyca.lastName = "Pogo";
 knurzyca.car = forDzik;
 System.out.println(me.car);
 System.out.println(me);


 Human brother = new Human();

 brother.firstName = "Patryk";
 brother.lastName = "P";

 me.car.sell(brother, me, 222.0);

 System.out.println("Current Cash is " + me.cash    + "$");
 System.out.println("Brother now has" + brother.cash + "$");
 System.out.println("Car = " + me.car);
 System.out.println("Brother car is now " + brother.car);

    }

}
