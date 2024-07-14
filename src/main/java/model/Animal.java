package model;

import exceptions.NotHungry;

public class Animal {

    private boolean isHungry = false;
    private boolean hungry;
    private int eaten = 0;

    public int eat() throws NotHungry {
        if(!isHungry){
            throw new NotHungry();
        }
        System.out.println("Animal is eating!");
        isHungry = false;
        eaten++;
        return eaten;
    }

    public boolean isHungry() {
        return hungry;
    }
}