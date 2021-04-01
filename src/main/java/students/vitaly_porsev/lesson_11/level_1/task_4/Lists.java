package students.vitaly_porsev.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Lists {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(100);
        integers.add(100);
        integers.add(100);
        System.out.println(integers);

        List<String> str = new LinkedList<>();
        str.add("Hello");
        str.add("Hello");
        str.add("Hello");
        System.out.println(str); // могут

    }
}
