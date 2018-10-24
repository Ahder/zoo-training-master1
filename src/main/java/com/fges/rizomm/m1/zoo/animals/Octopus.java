package main.java.com.fges.rizomm.m1.zoo.animals;

public class Octopus extends Animal implements Invertebrate{

    @Override
    public String toString() {
        return "Octopus : " + super.toString();
    }


    public String scream() {
        return "Glouglou";
    }

}


