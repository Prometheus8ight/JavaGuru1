package students.pavels_steinbors._lesson_11._level_1._task_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Оба класса используются для хранения элементов в списке,
 но основное различие между классами ArrayList и LinkedList заключается в том,
 что ArrayList позволяет произвольный доступ к элементам в списке,
 так как он работает на индекс основе структуры данных.
 В свою очередь, LinkedList не разрешает произвольный доступ, так как не имеет индексов для прямого доступа к элементам,
 он должен пройти по списку, чтобы получить доступ к элементу из списка. */

class ListDemo {

    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();
        List<String> motorcycles = new LinkedList<>();

    }

}
