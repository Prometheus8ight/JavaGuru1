package students.deniss_jankovskis.lesson_11.level_1.task_1;

import java.util.ArrayList;
import java.util.List;

class Task_1 {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(fruits.size());
        fruits.remove("Banana");
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
    }
}
