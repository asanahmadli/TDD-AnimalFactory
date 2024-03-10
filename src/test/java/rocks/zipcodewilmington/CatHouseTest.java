package rocks.zipcodewilmington;

import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Before
    public void setUp() {
        // Clear the CatHouse before each test
        CatHouse.clear();
    }
    @Test
    public void add(){
        Date date = new Date();
       Cat expected = new Cat("garfield",date,1);
       CatHouse.add(expected);
       Cat actual = CatHouse.getCatById(1);
       assertEquals(expected,actual);

    }

    @Test
    public void remove_Cat(){
        Date date = new Date();
        Cat cat = new Cat("garfield",date,1);
        CatHouse.remove(cat);
        Cat expected = null;
        Cat actual = CatHouse.getCatById(1);
        assertEquals(expected,actual);

    }

    @Test
    public void remove_Id(){
        Date date = new Date();
        Cat cat = new Cat("garfield",date,1);
        CatHouse.remove(1);
        Cat expected = null;
        Cat actual = CatHouse.getCatById(1);
        assertEquals(expected,actual);
    }

    @Test
    public void getCatById(){
        Date date = new Date();
        Cat expected = new Cat("garfield",date,1);
        CatHouse.add(expected);
        Cat actual = CatHouse.getCatById(1);
        assertEquals(expected,actual);
    }

    @Test
    public void getNumberOfCats(){
        Date date = new Date();
        Cat cat = new Cat("garfield",date,1);
        CatHouse.add(cat);
        int expected = 1;
        int actual = CatHouse.getNumberOfCats();
        assertEquals(expected,actual);
    }

}
