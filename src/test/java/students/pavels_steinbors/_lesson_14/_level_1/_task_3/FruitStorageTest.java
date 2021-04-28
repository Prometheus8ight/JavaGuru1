package students.pavels_steinbors._lesson_14._level_1._task_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FruitStorageTest {

    @Test
    public void findGreenApples() {
        FruitStorage fruitStorage = new FruitStorage();

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));

        Assertions.assertEquals(apples, fruitStorage.findApplesByColor(apples, "green"));
    }

    @Test
    public void findRedApples() {
        FruitStorage fruitStorage = new FruitStorage();

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));

        Assertions.assertEquals(apples, fruitStorage.findApplesByColor(apples, "red"));
    }

    @Test
    public void findYellowApples() {
        FruitStorage fruitStorage = new FruitStorage();

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));

        Assertions.assertEquals(apples, fruitStorage.findApplesByColor(apples, "yellow"));
    }
}
