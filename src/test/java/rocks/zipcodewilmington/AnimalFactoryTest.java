package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDog(){
        String expectedDogName = "guy";
        Date actualDogName = new Date();
        Dog dog = AnimalFactory.createDog(expectedDogName,actualDogName);
        String actual = dog.getName();
        assertEquals(expectedDogName,actual);
    }

    @Test
    public void createCat(){
        String expectedCatName = "pink";
        Date catBirthdate = new Date();
        Cat cat = AnimalFactory.createCat(expectedCatName,catBirthdate);
        String actualCatName = cat.getName();
        assertEquals(expectedCatName,actualCatName);
    }

}//class