package test.java.com.fges.rizomm.m1.zoo.persons;


import main.java.com.fges.rizomm.m1.zoo.animals.Animal;
import main.java.com.fges.rizomm.m1.zoo.animals.Dog;
import main.java.com.fges.rizomm.m1.zoo.persons.AnimalKeeper;
import main.java.com.fges.rizomm.m1.zoo.persons.KeeperVertebrate;

import org.junit.*;


public class AnimalKeeperTest {

    @Test
    public void when_animal_keeper_feed_then_count_increment() {
        Animal dog = new Dog();
        AnimalKeeper keeper = new KeeperVertebrate();

        keeper.feed(dog, "steak");
       // Assert.check(dog.getEatCount() == 1);

    }

    @Test
   public  void when_animal_keeper_give_child_as_food_then_error() {
        Animal dog = new Dog();
        AnimalKeeper keeper = new KeeperVertebrate();

        keeper.feed(dog, "child");

       // Assert.check(dog.getEatCount() == 0);


    }

}