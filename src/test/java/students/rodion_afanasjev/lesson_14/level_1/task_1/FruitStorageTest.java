package students.rodion_afanasjev.lesson_14.level_1.task_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FruitStorageTest {

    @Test
    public void findRedApples(){
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red",100));
        apples.add(new Apple("red",160));
        apples.add(new Apple("red",200));

        Assertions.assertEquals(fruitStorage.findByColor("red"), apples);
    }

    @Test
    public void findGreenApples(){
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green",200));
        apples.add(new Apple("green",90));
        apples.add(new Apple("green",50));

        Assertions.assertEquals(fruitStorage.findByColor("green"), apples);
    }

    @Test
    public void findYellowApples(){
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("yellow",50));
        apples.add(new Apple("yellow",170));

        Assertions.assertEquals(fruitStorage.findByColor("yellow"), apples);
    }

    @Test
    public void findByWeight(){
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));

        Assertions.assertEquals(fruitStorage.findByWeight(150), apples);
    }

}