package com.company;

import com.company.animals.FarmAnimal;
import com.company.animals.Human;
import com.company.animals.Pet;
import com.company.devices.*;




public class Main {

    public static void main(String[] args)throws    Exception {
	// write your code here

        Pet dog = new Pet("dog");
        dog.name = "Pug";

        Phone zFlip = new Phone("Samsung", "zFlip", 6.2);

        Human me = new Human();
        me.firstName = "Adrian";
        me.lastName = "And";
        me.pet = dog;
        me.mobile = zFlip;


        Car forDzik = new ElectricCar("Ford", "Focus", Boolean.FALSE, 4);
        me.setCar(forDzik,0);
        System.out.println(me.getCar(0).producer + " " + me.getCar(0).model + " " +"HOT?" + " " + me.getCar(0).HOT);



zFlip.turnOn();
forDzik.turnOn();

 Human knurzyca = new Human();
 knurzyca.firstName = "Katarzyna";
 knurzyca.lastName = "Pogo";
 knurzyca.setCar(new DieselCar("Mercedes", "S class", Boolean.TRUE, 4),0);
 System.out.println(me.getCar(0));
 System.out.println(me);


 Human brother = new Human();

 brother.firstName = "Patryk";
 brother.lastName = "P";

 me.getCar(0).sell(brother, me, 222.0);

 System.out.println("Current Cash is " + me.cash    + "$");
 System.out.println("Brother now has" + brother.cash + "$");
 System.out.println("Car = " + me.getCar(0));
 System.out.println("Brother car is now " + brother.getCar(0));


 zFlip.installAnApp("Youtube");
 zFlip.installAnApp("Youtube", 1.2);
 ;
        FarmAnimal pig = new FarmAnimal("Pig");
        pig.eat();

        System.out.println(brother.getCar(0));
        System.out.println(knurzyca.getCar(0));
    }

}
