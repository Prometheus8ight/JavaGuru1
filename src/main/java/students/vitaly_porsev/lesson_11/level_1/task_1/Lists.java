package students.vitaly_porsev.lesson_11.level_1.task_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(12);
        integers.add(15);
        System.out.println(integers);

        List<String> str = new LinkedList<>();
        str.add("Hello");
        str.add("Bye");
        System.out.println(str);

    }
}
