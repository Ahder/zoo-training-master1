package main.java.com.fges.rizomm.m1.zoo.animals;

public class Horse extends Animal implements Vertebrate {
    @Override
    public String toString() {
        return "Horse : " + super.toString();
    }


    public String scream() {
        return "houyhnhnm";

    }


}
