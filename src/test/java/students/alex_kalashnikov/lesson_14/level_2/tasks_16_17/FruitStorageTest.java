package students.alex_kalashnikov.lesson_14.level_2.tasks_16_17;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FruitStorageTest {

    @Test
    void getGreenApples() {
        FruitStorage victim = new FruitStorage();
        List<Apple> expectedResult = List.of(
                new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 50)
        );
        assertEquals(expectedResult, victim.getApples(victim.getAllApples(),
                (Apple apple) -> apple.getColor().equals("green")));
    }

    @Test
    void getRedApples() {
        FruitStorage victim = new FruitStorage();
        List<Apple> expectedResult = List.of(
                new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200)
        );
        assertEquals(expectedResult, victim.getApples(victim.getAllApples(),
                (Apple apple) -> apple.getColor().equals("red")));
    }

    @Test
    void getHeavyApples() {
        FruitStorage victim = new FruitStorage();
        List<Apple> expectedResult = List.of(
                new Apple("red", 160),
                new Apple("red", 200),
                new Apple("green", 200),
                new Apple("yellow", 170)
        );
        assertEquals(expectedResult, victim.getApples(victim.getAllApples(),
                (Apple apple) -> apple.getWeight() > 150));
    }

    @Test
    void getLightApples() {
        FruitStorage victim = new FruitStorage();
        List<Apple> expectedResult = List.of(
                new Apple("red", 100),
                new Apple("green", 90),
                new Apple("green", 50),
                new Apple("yellow", 50)
        );
        assertEquals(expectedResult, victim.getApples(victim.getAllApples(),
                (Apple apple) -> apple.getWeight() < 150));
    }

    @Test
    void getGreenAndHeavyApples() {
        FruitStorage victim = new FruitStorage();
        List<Apple> expectedResult = List.of(
                new Apple("green", 200)
        );
        assertEquals(expectedResult, victim.getApples(victim.getAllApples(),
                (Apple apple) -> apple.getColor().equals("green")
                        && apple.getWeight() > 150));
    }

}