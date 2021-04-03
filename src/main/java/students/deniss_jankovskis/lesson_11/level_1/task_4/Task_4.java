package students.deniss_jankovskis.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.List;

class Task_4 {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("JAVA");
        strings.add("JavA");
        System.out.println(strings.size());
        System.out.println(strings);
    }
}
