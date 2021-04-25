package students.alex_kalashnikov.lesson_14.level_2.tasks_7_13;

import java.util.ArrayList;
import java.util.List;

class FruitStorage {

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    List<Apple> getApples(List<Apple> apples, ApplePredicate predicate) {
        List<Apple> arr = new ArrayList<>();
        for (int i = 0; i < apples.size(); i++) {
            if (predicate.test(apples.get(i))) {
                arr.add(apples.get(i));
            }
        }
        return arr;
    }

}