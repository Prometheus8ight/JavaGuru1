package students.pavels_steinbors._lesson_5._level_4._task_25;

import java.util.Arrays;

class ArrayDemo {

    public static void main(String[] args) {

        Array array = new Array();

        int[] foo = new int[array.length()];

        for (int i = 0; i < foo.length; i++) {
            foo[i] = array.value();
        }
        System.out.println(Arrays.toString(foo));
    }
}
