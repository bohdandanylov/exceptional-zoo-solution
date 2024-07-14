package model;

import java.util.List;

public class Keeper {

    List<Animal> animalsToFeed;

    public Keeper(List<Animal> animals) {
        animalsToFeed = animals;
    }

    public void feed() {
        System.out.println("Keeper is feeding the animals");
        for (Animal animal : animalsToFeed) {
            if (!animal.isHungry()) {
                int eatenTimes = animal.eat();
                System.out.println("Animal has been fed " + eatenTimes + " times");
            }
        }
    }
}