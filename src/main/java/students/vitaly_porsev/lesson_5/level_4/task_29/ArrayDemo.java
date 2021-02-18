package students.vitaly_porsev.lesson_5.level_4.task_29;

import java.util.Arrays;

class ArrayDemo {
    public static void main(String[] args) {
        Array method = new Array();

        int[] array = new int[10];

        method.fillArray(array);
        System.out.println(Arrays.toString(array));
        method.findEvenNum(array);

    }

}
