package students.bogdans_pavlovs.lesson_14.level_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FruitStorageTest {

    FruitStorage fruitStorage = new FruitStorage();

    @Test
    public void findRedApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), new RedApplePredicate()));
    }

    @Test
    public void findGreenApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), new GreenApplePredicate()));
    }

    @Test
    public void findHeavyApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));
        apples.add(new Apple("yellow", 200));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), new HeavyApplePredicate()));
    }

    @Test
    public void findLightApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), new LightApplePredicate()));
    }

    @Test
    public void findGreenAndHeavyApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 200));


        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), new GreenAndHeavyApplePredicate()));
    }

    @Test
    public void findRedApplesAnonymous() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) { return apple.getColor().equals("red"); }
        }));
    }

    @Test
    public void findGreenApplesAnonymous() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) { return apple.getColor().equals("green"); }
        }));
    }


    @Test
    public void findHeavyApplesAnonymous() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));
        apples.add(new Apple("yellow", 200));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) { return apple.getWeight() > 150; }
        }));
    }


    @Test
    public void findLightApplesAnonymous() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) { return apple.getWeight() < 150; }
        }));
    }

    @Test
    public void findRedApplesLambda() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(),
                apple -> apple.getColor().equals("red")));
    }

    @Test
    public void findGreenApplesLambda() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(),
                apple -> apple.getColor().equals("green")));
    }


    @Test
    public void findHeavyApplesLambda() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));
        apples.add(new Apple("yellow", 200));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(),
                apple -> apple.getWeight() > 150));
    }


    @Test
    public void findLightApplesLambda() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));

        Assertions.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(),
                apple -> apple.getWeight() < 150));
    }

}
