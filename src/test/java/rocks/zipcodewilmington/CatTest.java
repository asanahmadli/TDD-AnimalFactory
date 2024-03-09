package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    Cat cat = new Cat("elvin", new Date(1992, 12, 30), 30);

    @Test
    public void set_Name() {
        String expected = "nick";
        cat.setName(expected);

        String actual = cat.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void set_Birthdate() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date expected = simpleDateFormat.parse("1992-30-12");
            cat.setBirthDate(expected);
            Date actual = cat.getBirthDate();
            assertEquals(expected, actual);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void speak() {
        String expected = "meow!";
        String actual = cat.speak();
        assertEquals(expected,actual);
    }

    @Test
    public void eat(){
        int expected = 1;
        cat.eat(new Food("bone"));
        int actual = cat.getNumberOfMealsEaten();
        assertEquals(expected,actual);
    }

    @Test
    public void getId(){
        int expected = 30;
        int actual = cat.getId();
        assertEquals(expected,actual);
    }

    @Test
    public void instanceOfAnimal(){
        Animal mammal = cat;
        boolean expected = true;
        boolean actual = mammal instanceof Animal;
        assertEquals(expected,actual);
    }

    @Test
    public void instanceOfMammal(){
        Mammal mammal = cat;
        boolean expected = true;
        boolean actual = mammal instanceof Mammal;
        assertEquals(expected,actual);
    }



}
