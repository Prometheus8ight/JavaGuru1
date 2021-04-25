package students.alex_kalashnikov.lesson_14.level_1.task_5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class FruitStorageTest {

    @Test
    public void heavyApples1() {
        FruitStorage victim = new FruitStorage();
        List<Apple> expectedResult = List.of(
                new Apple("red", 160),
                new Apple("red", 200),
                new Apple("green", 200),
                new Apple("yellow", 170)
        );
        assertEquals(expectedResult, victim.getApplesByWeight(victim.getAllApples(), 150));
    }

    @Test
    public void heavyApples2() {
        FruitStorage victim = new FruitStorage();
        List<Apple> arr = new ArrayList<>();
        List<Apple> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, victim.getApplesByWeight(arr, 150));
    }

    @Test
    public void heavyApples3() {
        FruitStorage victim = new FruitStorage();
        List<Apple> expectedResult = List.of(
                new Apple("red", 160),
                new Apple("red", 200),
                new Apple("green", 200),
                new Apple("green", 90),
                new Apple("yellow", 170)
        );
        assertNotEquals(expectedResult, victim.getApplesByWeight(victim.getAllApples(), 150));
    }

}