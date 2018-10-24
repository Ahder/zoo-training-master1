package main.java.com.fges.rizomm.m1.zoo;

import main.java.com.fges.rizomm.m1.zoo.animals.*;
import main.java.com.fges.rizomm.m1.zoo.persons.*;


public class ZooApplication {

    private static final String ZOO_NAME = "PARIDAIZA";

    public static void main(String[] args) {

        System.out.println("************************");
        System.out.println("Welcome to " + ZOO_NAME);
        System.out.println("************************");

        Dog rex = new Dog();
        Dog gaia = new Dog();
        gaia.setRepro(Reproduction.Mammal);

        Cat felix = new Cat();
        felix.setName("Felix");
        System.out.println(Vertebrate.description());

        Snake snake = new Snake();
        snake.setName("Boa");

        rex.setName("Rex");
        gaia.setName("Gaia");

        Person toto = new Cleaner();
        toto.setAge(State.Adult);
        System.out.println(toto.getAge());


      /*  toto.addAnimal(gaia);
        toto.addAnimal(felix);

        System.out.println("Animals of toto");
        for (int i = 0; i < toto.getAnimals().size(); i++) {
            Animal animal = toto.getAnimals().get(i);
            switch (animal.getClass().getSimpleName()) {
                case "Dog":
                    System.out.println("Dog");
                    break;
                case "Cat":
                    System.out.println("Cat");
                    break;
            }

        }*/

        AnimalKeeper keeper = new KeeperInvertebrate();
        Animal dog = new Dog();
        dog.setName("Cyrus");
        //dog.setInCage(false);

        Cleaner c1 = new Cleaner();
        System.out.println(c1.cleanCage(dog));
        System.out.println(dog.getEatCount());
        keeper.feed(dog, "steak");
        System.out.println(dog.getEatCount());




        Vet vete = new Vet<Dog>("vertebrate");
        Visitor v1 = new Visitor(State.Child);


    }

}
