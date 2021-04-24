package students.deniss_jankovskis.lesson_14.level_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FruitStorageTest {

    @BeforeEach
    void setUp() {
        FruitStorage fruitStorage = new FruitStorage();
    }

    @Test
    void findGreenApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleGreenColorPredicate()));
    }

    @Test
    void findRedApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleRedColorPredicate()));
    }

    @Test
    void findYellowApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleYellowColorPredicate()));
    }

    @Test
    void findHeavyApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));
        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleHeavyWeightPredicate()));
    }

    @Test
    void findLightApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleLightWeightPredicate()));
    }

    @Test
    void anonymousGreenApplesClass() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> greenApples = new ArrayList<>();
        ApplePredicate greenApplePredicate = apple -> apple.getColor().equals("green");
        greenApples.add(new Apple("green", 200));
        greenApples.add(new Apple("green", 90));
        greenApples.add(new Apple("green", 50));
        Assertions.assertEquals(greenApples, fruitStorage.findApples(fruitStorage.getAllApples(), greenApplePredicate));
    }

    @Test
    void anonymousRedApplesClass() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> redApples = new ArrayList<>();
        ApplePredicate redApplePredicate = apple -> apple.getColor().equals("red");
        redApples.add(new Apple("red", 100));
        redApples.add(new Apple("red", 160));
        redApples.add(new Apple("red", 200));
        Assertions.assertEquals(redApples, fruitStorage.findApples(fruitStorage.getAllApples(), redApplePredicate));
    }

    @Test
    void anonymousYellowApplesClass() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> yellowApples = new ArrayList<>();
        ApplePredicate yellowApplePredicate = apple -> apple.getColor().equals("yellow");
        yellowApples.add(new Apple("yellow", 50));
        yellowApples.add(new Apple("yellow", 170));
        Assertions.assertEquals(yellowApples, fruitStorage.findApples(fruitStorage.getAllApples(), yellowApplePredicate));
    }


    @Test
    void anonymousHeavyApplesClass() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> heavyApples = new ArrayList<>();
        ApplePredicate heavyApplesPredicate = apple -> apple.getWeight() > 150;
        heavyApples.add(new Apple("red", 160));
        heavyApples.add(new Apple("red", 200));
        heavyApples.add(new Apple("green", 200));
        heavyApples.add(new Apple("yellow", 170));
        Assertions.assertEquals(heavyApples, fruitStorage.findApples(fruitStorage.getAllApples(), heavyApplesPredicate));
    }

    @Test
    void anonymousLightApplesClass() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> lightApples = new ArrayList<>();
        lightApples.add(new Apple("red", 100));
        lightApples.add(new Apple("green", 90));
        lightApples.add(new Apple("green", 50));
        lightApples.add(new Apple("yellow", 50));
        ApplePredicate lightApplesPredicate = apple -> apple.getWeight() < 150;
        Assertions.assertEquals(lightApples, fruitStorage.findApples(fruitStorage.getAllApples(), lightApplesPredicate));
    }
}





