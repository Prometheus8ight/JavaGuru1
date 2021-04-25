package students.alex_kalashnikov.lesson_14.level_1.task_3;

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
        assertEquals(expectedResult, victim.getApplesByColour(victim.getAllApples(), "red"));
    }

    @Test
    public void redApples2() {
        FruitStorage victim = new FruitStorage();
        List<Apple> arr = new ArrayList<>();
        List<Apple> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, victim.getApplesByColour(arr, "red"));
    }

    @Test
    public void greenApples() {
        FruitStorage victim = new FruitStorage();
        List<Apple> expectedResult = List.of(
                new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 50)
        );
        assertEquals(expectedResult, victim.getApplesByColour(victim.getAllApples(), "green"));
    }

    @Test
    public void blackApples() {
        FruitStorage victim = new FruitStorage();
        List<Apple> expectedResult = List.of(
                new Apple("green", 200),
                new Apple("red", 90),
                new Apple("yellow", 50)
        );
        assertNotEquals(expectedResult, victim.getApplesByColour(victim.getAllApples(), "black"));
    }

}