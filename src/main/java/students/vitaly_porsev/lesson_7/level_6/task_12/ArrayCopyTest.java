package students.vitaly_porsev.lesson_7.level_6.task_12;

import java.util.Arrays;

class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest method = new ArrayCopyTest();
        method.copyInRangeTest1();
        method.copyInRangeTest2();
        method.copyInRangeTest3();
    }

    void copyInRangeTest1() {
        ArrayCopy method = new ArrayCopy();
        int[] array = {1, 50, 5, 100, 8, 45, 55, 7, 32, 4};
        int[] expectedResult = {1, 5, 8, 7, 4};
        check(expectedResult, method.copyInRange(array, 1, 10), "copyInRangeTest1");
    }

    void copyInRangeTest2() {
        ArrayCopy method = new ArrayCopy();
        int[] array = {10, 555, 56, 111, 100, 99, 678, 7, 77, 88};
        int[] expectedResult = {10, 56, 100, 99, 77, 88};
        check(expectedResult, method.copyInRange(array, 10, 100), "copyInRangeTest2");
    }

    void copyInRangeTest3() {
        ArrayCopy method = new ArrayCopy();
        int[] array = {100, 500, 5, 56, 888, 45, 320, 498, 32, 4};
        int[] expectedResult = {100, 500, 888, 320, 498};
        check(expectedResult, method.copyInRange(array, 100, 999), "copyInRangeTest3");
    }


    void check(int[] expectedResult, int[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}