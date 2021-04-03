package students.julija_katukova.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(0, 125); // добавить в список элемент в начало
        integerList.add(100); // добавить в список элемент в конец
        integerList.add(700);
        integerList.add(300);


        integerList.size(); // узнать длину списка

        integerList.remove(0); //удалить элемент из списка по индексу
        integerList.remove(Integer.valueOf(700)); //удалить элемент из списка без индекса

        integerList.isEmpty(); // узнать пустой список или нет

        System.out.println(integerList);

    }
}
