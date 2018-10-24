package main.java.com.fges.rizomm.m1.zoo.animals;

public  class Lion extends Animal implements  Vertebrate {
    @Override
    public String toString() {
        return "Lion : " + super.toString();
    }


    public String scream() {
        return "waaaaaa";
    }

}



