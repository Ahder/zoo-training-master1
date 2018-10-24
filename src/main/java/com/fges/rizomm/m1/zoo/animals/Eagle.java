package main.java.com.fges.rizomm.m1.zoo.animals;

public  class Eagle extends Animal implements Vertebrate{

    @Override
    public String toString() {
        return "Eagle : " + super.getName();
    }

    @Override
    public String scream() {
        return "eeeeaaaaa";
    }

}
