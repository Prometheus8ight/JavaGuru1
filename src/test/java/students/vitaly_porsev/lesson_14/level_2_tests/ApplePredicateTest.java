package students.vitaly_porsev.lesson_14.level_2_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import students.vitaly_porsev.lesson_14.level_2.allTasks.*;

import java.util.ArrayList;
import java.util.List;

public class ApplePredicateTest {

    @Test
    void findGreenApples() {
        FruitStorage fruitStorage = new FruitStorage();

        List<Apple> greenApples = new ArrayList<>();
        greenApples.add(new Apple("green", 200));
        greenApples.add(new Apple("green", 90));
        greenApples.add(new Apple("green", 50));

        Assertions.assertEquals(greenApples, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleGreenColorPredicate()));
    }

    @Test
    void findRedApples() {
        FruitStorage fruitStorage = new FruitStorage();

        List<Apple> redApples = new ArrayList<>();
        redApples.add(new Apple("red", 100));
        redApples.add(new Apple("red", 160));
        redApples.add(new Apple("red", 200));

        Assertions.assertEquals(redApples, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleRedColorPredicate()));
    }

    @Test
    void findHeavyApples() {
        FruitStorage fruitStorage = new FruitStorage();

        List<Apple> heavyApples = new ArrayList<>();
        heavyApples.add(new Apple("red", 160));
        heavyApples.add(new Apple("red", 200));
        heavyApples.add(new Apple("green", 200));
        heavyApples.add(new Apple("yellow", 170));

        Assertions.assertEquals(heavyApples, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleHeavyWeightPredicate()));
    }

    @Test
    void findLightApples() {
        FruitStorage fruitStorage = new FruitStorage();

        List<Apple> lightApples = new ArrayList<>();
        lightApples.add(new Apple("red", 100));
        lightApples.add(new Apple("green", 90));
        lightApples.add(new Apple("green", 50));
        lightApples.add(new Apple("yellow", 50));

        Assertions.assertEquals(lightApples, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleLightWeightPredicate()));
    }


    @Test
    void anonymousGreenClass() {
        ApplePredicate appleGreenPredicate = apple -> apple.getColor().equals("green");

        FruitStorage fruitStorage = new FruitStorage();

        List<Apple> greenApples = new ArrayList<>();
        greenApples.add(new Apple("green", 200));
        greenApples.add(new Apple("green", 90));
        greenApples.add(new Apple("green", 50));

        Assertions.assertEquals(greenApples, fruitStorage.findApples(fruitStorage.getAllApples(), appleGreenPredicate));
    }

    @Test
    void anonymousRedClass() {
        ApplePredicate appleRedPredicate = apple -> apple.getColor().equals("red");

        FruitStorage fruitStorage = new FruitStorage();

        List<Apple> redApples = new ArrayList<>();
        redApples.add(new Apple("red", 100));
        redApples.add(new Apple("red", 160));
        redApples.add(new Apple("red", 200));

        Assertions.assertEquals(redApples, fruitStorage.findApples(fruitStorage.getAllApples(), appleRedPredicate));
    }

    @Test
    void anonymousLightClass() {
        ApplePredicate appleLightPredicate = apple -> apple.getWeight() <= 150;

        FruitStorage fruitStorage = new FruitStorage();

        List<Apple> lightApples = new ArrayList<>();
        lightApples.add(new Apple("red", 100));
        lightApples.add(new Apple("green", 90));
        lightApples.add(new Apple("green", 50));
        lightApples.add(new Apple("yellow", 50));

        Assertions.assertEquals(lightApples, fruitStorage.findApples(fruitStorage.getAllApples(), appleLightPredicate));
    }

    @Test
    void anonymousHeavyClass() {
        ApplePredicate appleHeavyPredicate = apple -> apple.getWeight() > 150;

        FruitStorage fruitStorage = new FruitStorage();

        List<Apple> heavyApples = new ArrayList<>();
        heavyApples.add(new Apple("red", 160));
        heavyApples.add(new Apple("red", 200));
        heavyApples.add(new Apple("green", 200));
        heavyApples.add(new Apple("yellow", 170));

        Assertions.assertEquals(heavyApples, fruitStorage.findApples(fruitStorage.getAllApples(), appleHeavyPredicate));
    }
}
