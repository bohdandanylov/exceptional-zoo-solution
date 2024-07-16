package model;

import exceptions.AllergyException;
import exceptions.NotHungry;

public class Animal {

    private boolean isHungry = true;
    private boolean isAllergic = false;
    private int eaten = 0;

    public Animal (boolean hungry, boolean allergic){
        isHungry = hungry;
        isAllergic = allergic;
    }

    public int eat() throws NotHungry, AllergyException {
        if(!isHungry){
            System.out.println("Animal not hungry!");
            throw new NotHungry();
        }
        if(isAllergic){
            System.out.println("Animal allergic!");
            throw new AllergyException();
        }
        System.out.println("Animal is eating!");
        isHungry = false;
        eaten++;
        return eaten;
    }

    public boolean isHungry() {
        return isAllergic;
    }
}