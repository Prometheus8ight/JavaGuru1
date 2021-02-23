package students.vitaly_porsev.lesson_5.level_4.task_28;

import java.util.Arrays;

class ArrayDemo {
    public static void main(String[] args) {
        Array methods = new Array();

        int[] array = new int[10];

        methods.fillArray(array);

        System.out.println(Arrays.toString(array));
        System.out.println(methods.findMinNum(array));

    }
}
