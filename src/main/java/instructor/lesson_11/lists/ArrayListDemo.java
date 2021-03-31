package instructor.lesson_11.lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> todo = new LinkedList<>();

        System.out.println("todo.size() = " + todo.size());

        todo.add("Buy some milk");
        todo.add("Buy some bread");
        todo.add("Buy some yoghurt");
        todo.add("Do homework");
        todo.add("Drink coffee ☕️");

        System.out.println("todo.size() = " + todo.size());

        System.out.println("todo = " + todo);
        System.out.println("todo.get(0) = " + todo.get(0));
        System.out.println("todo.get(3) = " + todo.get(3));

        todo.remove("Buy some bread");
        todo.remove(0);

        System.out.println();

        System.out.println("todo.size() = " + todo.size());
        System.out.println("todo = " + todo);

        System.out.println();

        todo.set(1, "Do javaguru homework");

        System.out.println("todo.size() = " + todo.size());
        System.out.println("todo = " + todo);

        System.out.println();

        todo.add(0, "Drink coffee ☕️");
        todo.remove(todo.lastIndexOf("Drink coffee ☕️"));

        System.out.println("todo.size() = " + todo.size());
        System.out.println("todo = " + todo);

        todo.sort(Comparator.naturalOrder());

        System.out.println("todo = " + todo);

        System.out.println();

        todo.clear();

        System.out.println("todo.size() = " + todo.size());
        System.out.println("todo = " + todo);

    }
}


