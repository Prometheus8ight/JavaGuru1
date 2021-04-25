package students.alex_kalashnikov.lesson_14.level_1.task_1;

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

//    List<Apple> getGreenApples(List<Apple> apples) {
//        return apples.stream()
//                .filter(apple -> apple.getColor().equals("green"))
//                .collect(Collectors.toList());
//    }

    List<Apple> getGreenApples(List<Apple> apples) {
        List<Apple> greenApples = new ArrayList<>();
        for (int i = 0; i < apples.size(); i++) {
            if (apples.get(i).getColor().equals("green")) {
                greenApples.add(apples.get(i));
            }
        }
        return greenApples;
    }

}