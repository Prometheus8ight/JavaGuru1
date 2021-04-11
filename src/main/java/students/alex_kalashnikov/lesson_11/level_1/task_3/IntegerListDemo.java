package students.alex_kalashnikov.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.Arrays;

class IntegerListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(50);
        arr.add(100);
        System.out.println(arr.size());

        arr.remove(Integer.valueOf(50));
        arr.remove(0);
        System.out.println(arr.isEmpty());

        arr.add(50);
        arr.add(100);
        arr.add(150);
        arr.add(200);
        System.out.println(Arrays.toString(arr.toArray()));

    }

}