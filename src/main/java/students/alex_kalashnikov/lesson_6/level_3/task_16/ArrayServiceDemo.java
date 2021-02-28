package students.alex_kalashnikov.lesson_6.level_3.task_16;

import java.util.Arrays;

class ArrayServiceDemo {

    public static void main(String[] args) {

        ArrayService object = new ArrayService();

        int[] array = object.create(5);
        object.fillRandomly(array);

        System.out.println("Values of Array: " + Arrays.toString(array));

        System.out.println("==============");

        object.revert(array);

        System.out.println("New values of Array: " + Arrays.toString(array));

    }

}