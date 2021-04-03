package students.rodion_afanasjev.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(0, 20);
        numbers.add(50);
        numbers.add(75);
        numbers.add(100);

        System.out.println("numbers.size() = " + numbers.size());

        numbers.remove(0);
        numbers.remove(Integer.valueOf(75));

        System.out.println(numbers.isEmpty());

        System.out.println(numbers);

    }

}
