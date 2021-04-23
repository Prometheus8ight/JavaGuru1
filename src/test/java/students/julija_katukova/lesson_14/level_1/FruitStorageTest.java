package students.julija_katukova.lesson_14.level_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FruitStorageTest {

    FruitStorage fruitStorage = new FruitStorage();

    @Test
    void getGreenApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        Assertions.assertEquals(fruitStorage.getSpecificColorApples("green"), apples);
    }

    @Test
    void getRedApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        Assertions.assertEquals(fruitStorage.getSpecificColorApples("red"), apples);
    }

    @Test
    void getYellowApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        Assertions.assertEquals(fruitStorage.getSpecificColorApples("yellow"), apples);
    }
}