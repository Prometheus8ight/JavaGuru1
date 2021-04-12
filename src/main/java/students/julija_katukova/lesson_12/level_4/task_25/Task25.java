package students.julija_katukova.lesson_12.level_4.task_25;

import java.util.ArrayList;
import java.util.List;

class Task25 {

    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1_000_000_000; i++) {
            list.add(i, i^i);
        }
    }
}
