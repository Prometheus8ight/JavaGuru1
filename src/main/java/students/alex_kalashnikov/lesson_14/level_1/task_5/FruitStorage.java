package students.alex_kalashnikov.lesson_14.level_1.task_5;

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

    List<Apple> getApplesByColour(List<Apple> apples, String colour) {
        List<Apple> redApples = new ArrayList<>();
        for (int i = 0; i < apples.size(); i++) {
            if (apples.get(i).getColor().equals(colour)) {
                redApples.add(apples.get(i));
            }
        }
        return redApples;
    }

    List<Apple> getApplesByWeight(List<Apple> apples, int weight) {
        List<Apple> heavyWeightApples = new ArrayList<>();
        for (int i = 0; i < apples.size(); i++) {
            if (apples.get(i).getWeight() > weight) {
                heavyWeightApples.add(apples.get(i));
            }
        }
        return heavyWeightApples;
    }

}