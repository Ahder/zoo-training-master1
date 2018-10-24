package main.java.com.fges.rizomm.m1.zoo.animals;

public  class Tigre extends Animal implements  Vertebrate{


    @Override
    public String toString() {
        return "Tigre : " + super.toString();
    }


    public String scream() {
        return "GGGGRrrrrrr";
    }

}



