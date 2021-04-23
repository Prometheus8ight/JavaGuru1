package students.julija_katukova.lesson_14.level_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Apple> getSpecificColorApples(String color) {
        return getAllApples().stream().filter(apple -> apple.getColor().equals(color)).collect(Collectors.toList());
    }

    public List<Apple> getApplesFromSpecificWeight(int weight) {
        return getAllApples().stream().filter(apple1 -> apple1.getWeight() > weight).collect(Collectors.toList());
    }
}