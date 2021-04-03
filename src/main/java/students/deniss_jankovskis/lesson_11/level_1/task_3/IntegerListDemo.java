package students.deniss_jankovskis.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(0,20);
        integerList.add(1,50);
        integerList.add(2,130);
        integerList.size();
        System.out.println(integerList);
        integerList.remove(0);
        integerList.remove(integerList.isEmpty());
        System.out.println(integerList);
        integerList.clear();
        System.out.println(integerList);
    }
}
