package students.vitaly_porsev.lesson_14.level_1_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import students.vitaly_porsev.lesson_14.level_1.allTasks.Apple;
import students.vitaly_porsev.lesson_14.level_1.allTasks.FruitStorage;
import java.util.ArrayList;
import java.util.List;

public class FruitStorageTest {

    @Test
    void findGreenApples() {
        FruitStorage fruitStorage = new FruitStorage();

        List<Apple> greenApples = new ArrayList<>();
        greenApples.add(new Apple("green", 200));
        greenApples.add(new Apple("green", 90));
        greenApples.add(new Apple("green", 50));

        Assertions.assertEquals(greenApples, fruitStorage.findApplesByColor(fruitStorage.getAllApples(), "green"));

    }

    @Test
    void findRedApples() {
        FruitStorage fruitStorage = new FruitStorage();

        List<Apple> redApples = new ArrayList<>();
        redApples.add(new Apple("red", 100));
        redApples.add(new Apple("red", 160));
        redApples.add(new Apple("red", 200));

        Assertions.assertEquals(redApples, fruitStorage.findApplesByColor(fruitStorage.getAllApples(), "red"));

    }

    @Test
    void findApplesByWeight() {
        FruitStorage fruitStorage = new FruitStorage();

        List<Apple> heavyApples = new ArrayList<>();
        heavyApples.add(new Apple("red", 160));
        heavyApples.add(new Apple("red", 200));
        heavyApples.add(new Apple("green", 200));
        heavyApples.add(new Apple("yellow", 170));

        Assertions.assertEquals(heavyApples, fruitStorage.findApplesByWeight(fruitStorage.getAllApples(), 150));

    }

}
