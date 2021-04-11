package students.pavels_steinbors._lesson_11._level_1._task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(21);
        integerList.add(33);
        integerList.add(55);

        System.out.println("Size = " + integerList.size());

        integerList.remove(0);
        integerList.remove(Integer.valueOf(33));
        integerList.isEmpty();

        System.out.println(integerList);


    }
}
