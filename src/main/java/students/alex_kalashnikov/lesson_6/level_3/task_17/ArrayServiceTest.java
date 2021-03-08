package students.alex_kalashnikov.lesson_6.level_3.task_17;

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.testSortFromMinToMax();
        test.testSortFromMaxToMin();

    }

    public void test(int[] array, int[] expectedResult) {
        ArrayService test = new ArrayService();
        test.sortFromMinToMax(array);
        if (Arrays.equals(array,expectedResult)) {
            System.out.println("SortFromMinToMax Test is OK!");
        } else {
            System.out.println("SortFromMinToMax Test is FAILED!");
        }
    }

    public void test1(int[] array, int[] expectedResult) {
        ArrayService test = new ArrayService();
        test.sortFromMaxToMin(array);
        if (Arrays.equals(array,expectedResult)) {
            System.out.println("SortFromMaxToMin Test is OK!");
        } else {
            System.out.println("SortFromMaxToMin Test is FAILED!");
        }
    }

    public void testSortFromMinToMax() {
        int[] array = {4, 2, 4, 5, 0};
        int[] expectedResult = {0, 2, 4, 4, 5};
        test(array,expectedResult);
    }

    public void testSortFromMaxToMin() {
        int[] array = {1, 8, -3, 5, 0};
        int[] expectedResult = {8, 5, 1, 0, -3};
        test1(array,expectedResult);
    }

}
