package students.rodion_afanasjev.lesson_14.level_2.task_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FruitStorageTest {

    @Test
    public void findRedApples(){
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), new RedApplePredicate()));
    }

    @Test
    public void findGreenApples(){
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), new GreenApplePredicate()));
    }

    @Test
    public void findHeavyApples(){
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), new HeavyApplePredicate()));
    }

    @Test
    public void findLightApples(){
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), new LightApplePredicate()));
    }

    @Test
    public void findGreenAndHeavyApples(){
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 200));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleGreenAndHeavyWeightPredicate()));
    }

    @Test
    public void findRedApplesAnonymousClass() {
        ApplePredicate red = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("red");
            }
        };
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), red));
    }

    @Test
    public void findHeavyApplesAnonymousClass() {
        ApplePredicate heavy = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        };
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), heavy));
    }

    @Test
    public void findRedApplesAnonymousClassLambda() {
        ApplePredicate red = apple -> apple.getColor().equals("red");
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), red));
    }

    @Test
    public void findHeavyApplesAnonymousClassLambda() {
        ApplePredicate heavy = apple -> apple.getWeight() > 150;
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), heavy));
    }

}