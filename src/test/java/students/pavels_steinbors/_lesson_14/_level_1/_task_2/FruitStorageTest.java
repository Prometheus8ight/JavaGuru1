package students.pavels_steinbors._lesson_14._level_1._task_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FruitStorageTest {

    @Test
    public void findRedApples() {
        FruitStorage fruitStorage = new FruitStorage();

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));

        Assertions.assertEquals(apples, fruitStorage.findRedApples(fruitStorage.getAllApples()));
    }
}
