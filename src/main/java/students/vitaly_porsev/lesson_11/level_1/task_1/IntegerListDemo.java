package students.vitaly_porsev.lesson_11.level_1.task_1;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(100);
        integers.add(0, 10000);
        System.out.println(integers.size());
        integers.remove(1);
        integers.remove((Integer) 100);
        System.out.println(integers.isEmpty());
        System.out.println(integers);

    }
}
