package students.andrew_galashin.lesson_11.level_1.task_3;


import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        System.out.println("Size: " + number.size());
        System.out.println(number);
        number.remove(0);
        System.out.println("Size: " + number.size());
        System.out.println(number);
        number.remove(Integer.valueOf(2));
        System.out.println("Size: " + number.size());
        System.out.println(number);


    }
}
