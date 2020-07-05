package com.company.animals;


public class Animal   {
    final String species;
    private Double weight;
    public String name;


    private static Double NEW_DOG_WEIGHT = 1.0;
    private static Double NEW_LION_WEIGHT = 10.0;
    private static Double NEW_OTHER_ANIMAL_WEIGHT = 3.0;

    public Animal(String species) {
        System.out.println("New Animal has been born");
        this.species = species;

        switch (species) {
            case "Dog": {
                weight = NEW_DOG_WEIGHT;
                break;
            }
            case "Lion": {
                weight = NEW_LION_WEIGHT;
                break;
            }
            default: {
                weight = NEW_OTHER_ANIMAL_WEIGHT;
                break;
            }
        }
    }


   public void feed() {
        if (weight == 0) {
            System.out.println("Your Animal, " + name + " is already dead");
        } else {
            ++weight;
            System.out.println(name + " has been fed");
        }
    }

    public void takeForAWalk() {
        if(weight == 0.0){
            System.out.println("your animal is already dead");
        } else if (weight > 3.0) {
            --weight;
            System.out.println(name + " your animal seems to be happy");
        } else if (weight > 1.0) {
            --weight;
            System.out.println(name + " your animal seems to be exhousted");
        } else {
            weight = 0.0;
            System.out.println(name + " died, remember to feed your animals");
        }
    }

    Double getWeight() {
        return weight;
    }



    protected void kill() throws Exception {
        System.out.println("Animal is dead");

    }

}