package students.alex_kalashnikov.lesson_7.level_6.task_12;

import java.util.Arrays;

class ArrayCopyTest {

    public static void main(String[] args) {

        ArrayCopyTest newObject = new ArrayCopyTest();
        newObject.testCopyInRange();
        newObject.testCopyInRange1();
        newObject.testCopyInRange2();
        newObject.testCopyInRange3();
        newObject.testCopyInRange4();

    }

    void test(int[] arr, int numberFrom, int numberTo, int[] expectedResult) {
        ArrayCopy newTest = new ArrayCopy();
        int[] realResult = newTest.copyInRange(arr, numberFrom, numberTo);
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testCopyInRange() {
        int[] arr = {-5, 7, 9, 0, 4, -7, 3, -3, -2, 2};
        int numberFrom = -2;
        int numberTo = 2;
        int[] expectedResult = {0, -2, 2};
        test(arr, numberFrom, numberTo, expectedResult);
    }

    void testCopyInRange1() {
        int[] arr = {56, 7, -943, 17, 4, -237, 334, -34, -21, 298};
        int numberFrom = 2;
        int numberTo = -2;
        int[] expectedResult = {};
        test(arr, numberFrom, numberTo, expectedResult);
    }

    void testCopyInRange2() {
        int[] arr = {-5, 7, 9, 0, 4, -7, 3, -3, -2, 2};
        int numberFrom = -200;
        int numberTo = -100;
        int[] expectedResult = {};
        test(arr, numberFrom, numberTo, expectedResult);
    }

    void testCopyInRange3() {
        int[] arr = {-5, 7, 9, 0, 4, -7, 3, -3, -2, 2};
        int numberFrom = 100;
        int numberTo = 200;
        int[] expectedResult = {};
        test(arr, numberFrom, numberTo, expectedResult);
    }

    void testCopyInRange4() {
        int[] arr = {-5, 7, 9, 0, 4, -7, 3, -3, -2, 2};
        int numberFrom = -200;
        int numberTo = 200;
        int[] expectedResult = {-5, 7, 9, 0, 4, -7, 3, -3, -2, 2};
        test(arr, numberFrom, numberTo, expectedResult);
    }

}