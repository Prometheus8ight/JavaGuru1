package instructor.lesson_10.sort;

import java.util.Comparator;

public class Person /*implements Comparable<Person>*/ {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

/*    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
