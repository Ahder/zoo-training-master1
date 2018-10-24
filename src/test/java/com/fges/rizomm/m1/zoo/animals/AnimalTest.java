package test.java.com.fges.rizomm.m1.zoo.animals;

import main.java.com.fges.rizomm.m1.zoo.animals.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AnimalTest {

    @Test
    void when_animal_scream_then_string() {

        Animal dog = new Dog();
        assertTrue(dog.scream().matches(".*"));
        assertTrue(dog.scream().equals("Woof"));
        assertTrue(!dog.scream().isEmpty());

        Animal snake = new Snake();
        assertTrue(snake.scream().matches(".*"));
        assertTrue(snake.scream().equals("SSSSSSSS"));
        assertTrue(!snake.scream().isEmpty());

        Animal cat = new Cat();
        assertTrue(cat.scream().matches(".*"));
        assertTrue(cat.scream().equals("Miaou"));
        assertTrue(!cat.scream().isEmpty());

        Animal tigre = new Tigre();
        assertTrue(tigre.scream().matches(".*"));
        assertTrue(tigre.scream().equals("GGGGRrrrrrr"));
        assertTrue(!tigre.scream().isEmpty());



    }



}
