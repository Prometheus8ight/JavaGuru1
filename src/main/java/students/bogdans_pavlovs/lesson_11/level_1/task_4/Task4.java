package students.bogdans_pavlovs.lesson_11.level_1.task_4;

/*
Могут ли реализации интерфейса java.util.List хранить одинаковые
элементы (дубликаты)? Напишите код программы, который демонстрирует
ответ на этот вопрос.
 */

import java.util.ArrayList;

class Task4 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Bogdans");
        names.add("Bogdans");
        names.add("Bogdans");
        names.add("Bogdans");
        names.add("Bogdans");

        System.out.println(names);

    }
}
