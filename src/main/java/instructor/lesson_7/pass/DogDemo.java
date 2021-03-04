package instructor.lesson_7.pass;

import java.util.Arrays;

public class DogDemo {

    public static void main(String[] args) {

        Dog max = new Dog();
        max.name = "Max";

        System.out.println("max = " + max.name);

        Dog fafa = foo(max);

        System.out.println("max = " + max.name);
    }

    static int[] sort(int[] a) {
        int[] temp = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }

        // Bubble sort temp array

        return temp;
    }

    static Dog foo(Dog dog) {
        dog.name = "Fifi";

        dog = new Dog();
        dog.name = "Fafa";

        return dog;
    }
}
