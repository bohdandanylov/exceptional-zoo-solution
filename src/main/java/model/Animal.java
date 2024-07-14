package model;

public class Animal {

    private boolean isHungry = true;
    private boolean isAllergic = false;
    private int eaten = 0;

    public Animal (boolean hungry, boolean allergic) {
        isHungry = hungry;
        isAllergic = allergic;
    }

    public int eat() {
        System.out.println("Animal not hungry!");
        isHungry = false;
        eaten++;
        return eaten;
    }

    public boolean isHungry() {
        return isHungry;
    }
}