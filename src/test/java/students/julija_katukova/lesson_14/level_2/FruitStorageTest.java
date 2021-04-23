package students.julija_katukova.lesson_14.level_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FruitStorageTest {

    FruitStorage fruitStorage = new FruitStorage();

    @Test
    void findGreenApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        Assertions.assertEquals(fruitStorage.findApples(new AppleGreenColorPredicate()), apples);
    }

    @Test
    void findRedApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        Assertions.assertEquals(fruitStorage.findApples(new AppleRedColorPredicate()), apples);
    }

    @Test
    void findHeavyApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));
        Assertions.assertEquals(fruitStorage.findApples(new AppleHeavyWeightPredicate()), apples);
    }

    @Test
    void findLightApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        Assertions.assertEquals(fruitStorage.findApples(new AppleLightWeightPredicate()), apples);
    }

    @Test
    void findGreenHeavyApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 200));
        Assertions.assertEquals(fruitStorage.findApples(new AppleGreenAndHeavyWeightPredicate()), apples);
    }

    @Test
    void findGreenApplesWithAntonymClass() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        Assertions.assertEquals(fruitStorage.findApples(new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("green");
            }
        }), apples);
    }

    @Test
    void findRedApplesWithAntonymClass() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        Assertions.assertEquals(fruitStorage.findApples(new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("red");
            }
        }), apples);
    }

    @Test
    void findHeavyApplesWithAntonymClass() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));
        Assertions.assertEquals(fruitStorage.findApples(new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        }), apples);
    }

    @Test
    void findLightApplesWithAntonymClass() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        Assertions.assertEquals(fruitStorage.findApples(new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() < 150;
            }
        }), apples);
    }

    @Test
    void findGreenApplesWithLambda() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        Assertions.assertEquals(fruitStorage.findApples(apple -> apple.getColor().equals("green")), apples);
    }

    @Test
    void findRedApplesWithLambda() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        Assertions.assertEquals(fruitStorage.findApples(apple -> apple.getColor().equals("red")), apples);
    }

    @Test
    void findHeavyApplesWithLambda() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));
        Assertions.assertEquals(fruitStorage.findApples(apple -> apple.getWeight() > 150), apples);
    }

    @Test
    void findLightApplesWithLambda() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        Assertions.assertEquals(fruitStorage.findApples(apple -> apple.getWeight() < 150), apples);
    }
}