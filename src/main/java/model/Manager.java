package model;

import exceptions.AllergyException;
import exceptions.BrokeException;
import exceptions.NotHungry;

import java.util.List;

public class Manager {

    private final List<Animal> animalsToManage;
    private final Keeper keeper;

    public Manager(List<Animal> animals, Keeper keeper) {
        this.animalsToManage = animals;
        this.keeper = keeper;
    }

    public void manage() throws BrokeException {
        System.out.println("Manager is managing the keeper");
        try {
            keeper.feed();
        } catch (NotHungry notHungry) {
            System.out.println("Caught notHungry: FEED LESS OFTEN!");
            throw new BrokeException();
        } catch (AllergyException e) {
            System.out.println("Caught Allergy: Get the doctor!");
        } finally {
            System.out.println("Finally Manager says: Regardless of what happens");
        }
    }
}