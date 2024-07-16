package model;

import exceptions.AllergyException;
import exceptions.NotHungry;

public class Animal {

    private boolean isHungry = true;
    private boolean isAllergic = true;
    private int eaten = 0;

    public int eat() throws NotHungry, AllergyException {
        if(!isHungry){
            throw new NotHungry();
        }
        if(isAllergic){
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