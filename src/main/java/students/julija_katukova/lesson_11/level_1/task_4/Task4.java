package students.julija_katukova.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.List;

class Task4 {

    //реализации интерфейса java.util.List могут хранить одинаковые элементы (дубликаты)

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(10);
        integerList.add(10);

        System.out.println(integerList.size());
        System.out.println(integerList);
    }
}
