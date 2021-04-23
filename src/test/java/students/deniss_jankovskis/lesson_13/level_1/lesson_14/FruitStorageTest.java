package students.deniss_jankovskis.lesson_13.level_1.lesson_14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import students.deniss_jankovskis.lesson_14.level_1.Apple;
import students.deniss_jankovskis.lesson_14.level_1.FruitStorage;


import java.util.ArrayList;
import java.util.List;


class FruitStorageTest {

    @BeforeEach
    void setUp() {
        FruitStorage fruitStorage = new FruitStorage();
    }

    @Test
    void findGreenApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        Assertions.assertEquals(apples, fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"green"));
    }

    @Test
    void findRedApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        Assertions.assertEquals(apples, fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"red"));
    }

    @Test
    void findApplesByWeight() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));
        Assertions.assertEquals(apples, fruitStorage.findApplesByWeight(fruitStorage.getAllApples(),200));
    }
}
