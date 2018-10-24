package test.java.com.fges.rizomm.m1.zoo.persons;

import main.java.com.fges.rizomm.m1.zoo.animals.Animal;
import main.java.com.fges.rizomm.m1.zoo.animals.Snake;
import main.java.com.fges.rizomm.m1.zoo.persons.Cleaner;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class CleanerTest {
    @Test
     public void when_cleaner_cannot_clean_while_animal_in_cage_then_string(){
        Animal snake = new Snake();
        Cleaner cleaner= new Cleaner();
        assertTrue(cleaner.cleanCage(snake).equals("Cant clean : "+ snake.getName()+" is in cage"));
        snake.setInVisitingArea(true);
        assertTrue(cleaner.cleanVisitingArea(snake).equals("Cant clean : "+ snake.getName()+" is in visiting area"));

    }

    @Test
    public void when_cleaner_can_clean_while_animal_not_in_cage_then_string(){

        Animal snake = new Snake();
        Cleaner cleaner= new Cleaner();
        snake.setInCage(false);
        assertTrue(cleaner.cleanCage(snake).equals("Cleaning cage ... "));
        snake.setInVisitingArea(false);
        assertTrue(cleaner.cleanVisitingArea(snake).equals("Cleaning visiting area ... "));

    }
}
