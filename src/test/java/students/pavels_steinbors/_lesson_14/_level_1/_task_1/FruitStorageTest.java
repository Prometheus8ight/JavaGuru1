package students.pavels_steinbors._lesson_14._level_1._task_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FruitStorageTest {

    @Test
    public void findGreenApples() {
        FruitStorage fruitStorage = new FruitStorage();

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green",200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));

        Assertions.assertEquals(apples, fruitStorage.findGreenApples(fruitStorage.getAllApples()));
    }
}

