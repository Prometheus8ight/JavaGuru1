package students.bogdans_pavlovs.lesson_11.level_1.task_3;

import java.util.ArrayList;

public class IntegerListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        //- добавить в список элемент (в начало и в конец)
        integers.add(0,1);
        integers.add(2);

        //- узнать длину списка
        System.out.println("'integers' size = " + integers.size());

        //- удалить элемент из списка (по интексу и без)
        integers.remove(1);
        System.out.println("'integers' size = " + integers.size());

        integers.add(1);
        integers.remove(Integer.valueOf(1));
        System.out.println("'integers' size = " + integers.size());

        //- узнать пустой список или нет
        System.out.println(integers.isEmpty());

        //- обойти список и вывести на консоль каждый элемент.
        integers.add(10);
        integers.add(20);
        integers.add(30);
        System.out.println(integers);


    }


}
