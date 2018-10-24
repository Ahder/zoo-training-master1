package main.java.com.fges.rizomm.m1.zoo.persons;

import main.java.com.fges.rizomm.m1.zoo.animals.Animal;

public class Vet<T extends Animal> extends Employee {

    private String specialty;

    public Vet(String specialty) {
        super();

        this.specialty = specialty;
    }
    public void cure(T animal) {
        if(specialty.equals("vertebrate")){

            System.out.println("cured");
        }
        else{
            System.out.println("wrong speciality");
        }
        if(specialty.equals(("invertebrate"))){

            System.out.println("cured");
        }
        else{
            System.out.println("wrong speciality");
        }

        }



    public void checkHealth(T animal) {
        if(animal.getHealthState().equals("in shape")){

            System.out.println("Dosen't need a medical attention");
        }
        else{

            System.out.print("need a mediacal attention");

        }


    }

}
