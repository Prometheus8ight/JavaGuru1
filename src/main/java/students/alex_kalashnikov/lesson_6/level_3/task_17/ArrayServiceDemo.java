package students.alex_kalashnikov.lesson_6.level_3.task_17;

import java.util.Arrays;

class ArrayServiceDemo {

    public static void main(String[] args) {

        ArrayService object = new ArrayService();

        int[] array = object.create(5);
        object.fillRandomly(array);

        System.out.println("Values of Array: " + Arrays.toString(array));

        System.out.println("==============");

        object.sortFromMinToMax(array);

        System.out.println("Sorted from Min to Max: " + Arrays.toString(array));

        object.sortFromMaxToMin(array);

        System.out.println("Sorted from Max to Min: " + Arrays.toString(array));

    }

}