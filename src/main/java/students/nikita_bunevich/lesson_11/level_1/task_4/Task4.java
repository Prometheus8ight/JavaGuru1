package students.nikita_bunevich.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.List;
/* Могут ли реализации интерфейса java.util.List хранить одинаковые
элементы (дубликаты)?
*/
//Могут.

class Task4 {
    public static void main(String[] args) {
    List<Integer> num = new ArrayList<>();

    num.add(10);
    num.add(10);
    num.add(10);
        System.out.println(num.size());
        System.out.println(num);
    }
}
