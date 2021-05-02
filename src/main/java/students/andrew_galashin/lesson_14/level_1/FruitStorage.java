package students.andrew_galashin.lesson_14.level_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FruitStorage {

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

    public List<Apple> findApplesByColor(List<Apple> apples, String color) {
        return apples.stream()
                .filter(apple -> apple.getColor().equals(color))
                .collect(Collectors.toList());
    }

    public List<Apple> findApplesByWeight(List<Apple> apples, int weight) {
        return apples.stream()
                .filter(apple -> apple.getWeight() > weight)
                .collect(Collectors.toList());
    }
}
