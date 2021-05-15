package students.bogdans_pavlovs.lesson_14.level_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FruitStorageTest {

    FruitStorage fruitStorage = new FruitStorage();


    @Test
    public void findRedApples(){
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red",100));
        apples.add(new Apple("red",160));
        apples.add(new Apple("red",200));

        Assertions.assertEquals(fruitStorage.findApplesByColor("red"), apples);
    }

    @Test
    public void findGreenApples(){
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green",200));
        apples.add(new Apple("green",90));
        apples.add(new Apple("green",50));

        Assertions.assertEquals(fruitStorage.findApplesByColor("green"), apples);
    }

    @Test
    public void findYellowApples(){
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("yellow",50));
        apples.add(new Apple("yellow",170));
        apples.add(new Apple("yellow", 200));

        Assertions.assertEquals(fruitStorage.findApplesByColor("yellow"), apples);
    }

    @Test
    public void findByWeight(){
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));
        apples.add(new Apple("yellow", 200));

        Assertions.assertEquals(fruitStorage.findApplesByWeight(100), apples);
    }

}
