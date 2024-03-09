package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    Dog dog = new Dog("cek", new Date(2000, 12, 30), 5);

    @Test
    public void set_Name() {
        String expected = "marsel";
        dog.setName(expected);

        String actual = dog.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void set_Birthdate() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date expected = simpleDateFormat.parse("2001-20-12");
            dog.setBirthDate(expected);
            Date actual = dog.getBirthDate();
            assertEquals(expected, actual);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void speak() {
        String expected = "bark!";
        String actual = dog.speak();
        assertEquals(expected,actual);
    }

    @Test
    public void eat(){
        int expected = 1;
        dog.eat(new Food("bone"));
        int actual = dog.getNumberOfMealsEaten();
        assertEquals(expected,actual);
    }

    @Test
    public void getId(){
        int expected = 5;
        int actual = dog.getId();
        assertEquals(expected,actual);
    }

    @Test
    public void instanceOfAnimal(){
        Animal mammal = dog;
        boolean expected = true;
        boolean actual = mammal instanceof Animal;
        assertEquals(expected,actual);
    }

    @Test
    public void instanceOfMammal(){
        Mammal mammal = dog;
        boolean expected = true;
        boolean actual = mammal instanceof Mammal;
        assertEquals(expected,actual);
    }
}
