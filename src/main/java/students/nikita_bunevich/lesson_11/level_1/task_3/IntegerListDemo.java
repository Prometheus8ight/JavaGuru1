package students.nikita_bunevich.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(0, 100);//Добавить элемент в начало списка
        num.add(100);//Добавить элемент в конец списка

        num.size();//Узнать размер списка

        num.remove(0);//Удалить элемент с индексом из списка
        num.remove(Integer.valueOf(100));//Удалить элемент без индекса из списка

        num.isEmpty();//Узнать пустой ли список или нет
        System.out.println(num);


    }
}
