package students.andrew_galashin.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.List;

class List4 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(1);
        number.add(2);
        System.out.println(number);
        System.out.println("Size: " + number.size());
    }
}
