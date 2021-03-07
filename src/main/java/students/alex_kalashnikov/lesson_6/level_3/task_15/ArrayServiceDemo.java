package students.alex_kalashnikov.lesson_6.level_3.task_15;

import java.util.Arrays;

class ArrayServiceDemo {

    public static void main(String[] args) {

        ArrayService object = new ArrayService();

        int[] array = object.create(7);
        object.fillRandomly(array);

        System.out.println("Values of Array: " + Arrays.toString(array));

        System.out.println("==============");

        System.out.println("Integer was found and replaced: " + object.replaceAll(array,2,-5));

        System.out.println("==============");

        System.out.println("New values of Array: " + Arrays.toString(array));

    }

}