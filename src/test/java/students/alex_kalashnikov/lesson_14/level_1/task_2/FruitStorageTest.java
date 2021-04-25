package students.alex_kalashnikov.lesson_14.level_1.task_2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class FruitStorageTest {

    @Test
    public void redApples1() {
        FruitStorage victim = new FruitStorage();
        List<Apple> expectedResult = List.of(
                new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200)
        );
        assertEquals(expectedResult, victim.getRedApples(victim.getAllApples()));
    }

    @Test
    public void redApples2() {
        FruitStorage victim = new FruitStorage();
        List<Apple> arr = new ArrayList<>();
        List<Apple> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, victim.getRedApples(arr));
    }

    @Test
    public void redApples3() {
        FruitStorage victim = new FruitStorage();
        List<Apple> expectedResult = List.of(
                new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 50)
        );
        assertNotEquals(expectedResult, victim.getRedApples(victim.getAllApples()));
    }

}