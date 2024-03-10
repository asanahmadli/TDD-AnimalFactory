package rocks.zipcodewilmington;

import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Before
    public void setUp() {
        // Clear the CatHouse before each test
        DogHouse.clear();
    }
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void add(){
        Date date = new Date();
        Dog expected = new Dog("tiger",date,1);
        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(1);
        assertEquals(expected,actual);

    }

    @Test
    public void remove_Dog(){
        Date date = new Date();
        Dog dog = new Dog("tiger",date,1);
        DogHouse.remove(dog);
        Dog expected = null;
        Dog actual = DogHouse.getDogById(1);
        assertNull(null,actual);

    }

    @Test
    public void remove_Id(){
        Date date = new Date();
        Dog dog = new Dog("tiger",date,1);
        DogHouse.remove(1);
        Dog expected = null;
        Dog actual = DogHouse.getDogById(1);
        assertEquals(expected,actual);
    }

    @Test
    public void getDogById(){
        Date date = new Date();
        Dog expected = new Dog("tiger",date,1);
        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(1);
        assertEquals(expected,actual);
    }

    @Test
    public void getNumberOfDog(){
        Date date = new Date();
        Dog dog = new Dog("tiger",date,1);
        DogHouse.add(dog);
        int  expected = 1;
        int actual = DogHouse.getNumberOfDogs();
        assertEquals(expected,actual);
    }
}
