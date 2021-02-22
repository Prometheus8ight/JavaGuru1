package students.vitaly_porsev.lesson_5.level_7.task_41;

import java.util.Arrays;

class ArrayDemo {

    public static void main(String[] args) {
        Array methods = new Array();
        int[] array = {10, 5, 99, 34, 89, 31, 1, 69};
        int[] array2 = {10, 5, 99, 34, 89, 31, 1, 69};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        methods.equalArrays(array, array2);

        System.out.println();

        methods.sortArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        System.out.println();

        methods.searchIndex(array, 89);
        System.out.println();


        methods.fillArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        methods.equalArrays(array, array2);

        System.out.println();

        methods.copyRangeArray(array2,3,6);
    }

}

