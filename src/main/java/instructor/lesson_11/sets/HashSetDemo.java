package instructor.lesson_11.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        Set<String> strings = new HashSet<>();
//        strings.add("hello world");
//        strings.add("hello world");
        strings.add("hello world");
        strings.add("it's wednesday my dudes");
//        strings.add("hello world");

        System.out.println("strings = " + strings);

        for (String string : strings) {

        }

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
        }

    }

}
