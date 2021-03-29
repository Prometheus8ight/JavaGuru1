package instructor.lesson_10.sort;

import java.util.Arrays;

public class PersonSortDemo {

    public static void main(String[] args) {

        Person[] people = new Person[] {
          new Person(10),
          new Person(5),
          new Person(23),
          new Person(76),
          new Person(44),
          new Person(39),
          new Person(1),
          new Person(100),
          new Person(58),
        };

        System.out.println(Arrays.toString(people));

        Arrays.sort(people);
        Arrays.sort(people, new PersonComparator());

        System.out.println(Arrays.toString(people));

    }
}
