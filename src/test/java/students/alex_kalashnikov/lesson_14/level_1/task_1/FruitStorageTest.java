package students.alex_kalashnikov.lesson_14.level_1.task_1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class FruitStorageTest {

    @Test
    public void greenApples1() {
        FruitStorage victim = new FruitStorage();
        List<Apple> expectedResult = List.of(
                new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 50)
        );
        assertEquals(expectedResult, victim.getGreenApples(victim.getAllApples()));
    }

    @Test
    public void greenApples2() {
        FruitStorage victim = new FruitStorage();
        List<Apple> arr = new ArrayList<>();
        List<Apple> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, victim.getGreenApples(arr));
    }

    @Test
    public void greenApples3() {
        FruitStorage victim = new FruitStorage();
        List<Apple> expectedResult = List.of(
                new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200)
        );
        assertNotEquals(expectedResult, victim.getGreenApples(victim.getAllApples()));
    }

}