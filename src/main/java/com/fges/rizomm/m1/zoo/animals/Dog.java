package main.java.com.fges.rizomm.m1.zoo.animals;

public  class Dog extends Animal implements Vertebrate {

    @Override
    public String toString() {
        return "Dog : " + super.toString();
    }


    public String scream() {
        return "Woof";
    }

}


