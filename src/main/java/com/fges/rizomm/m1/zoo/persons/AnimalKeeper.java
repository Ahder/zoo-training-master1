package main.java.com.fges.rizomm.m1.zoo.persons;

import main.java.com.fges.rizomm.m1.zoo.animals.Animal;

public abstract class AnimalKeeper extends Employee {

   public String specialtyKeeper;

    public AnimalKeeper(State age) {
        super(age);
    }

    public AnimalKeeper() {

    }


    public abstract void feed(Animal animal, String food);


}

