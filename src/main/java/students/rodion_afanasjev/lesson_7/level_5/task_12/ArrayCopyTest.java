package students.rodion_afanasjev.lesson_7.level_5.task_12;

import java.util.Arrays;

class ArrayCopyTest {

    public static void main(String[] args) {

        ArrayCopy arrayCopy = new ArrayCopy();
        int[] arr = {1,4,12,43,15,32,34,59,18};
        int[] array = arrayCopy.copyInRange(arr,1,20);
        System.out.println(Arrays.toString(array));

        ArrayCopyTest arrayCopyTest = new ArrayCopyTest();
        arrayCopyTest.copyInRangeTrueTest();
        arrayCopyTest.copyInRangeFalseTest();
        arrayCopyTest.copyInRangeTrueTest2();
        arrayCopyTest.copyInRangeTrueTest3();

    }

    void copyInRangeTrueTest() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] array = {1,2,3,4,5};
        int[] expectedResult = {2,3,4};
        int[] realResult = arrayCopy.copyInRange(array,2,4);
        equalCheck(realResult,expectedResult, "copyInRangeTrueTest");
    }

    void copyInRangeFalseTest() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] array = {1,2,3,4,5};
        int[] expectedResult = {2,3,5};
        int[] realResult = arrayCopy.copyInRange(array,2,4);
        notEqualCheck(realResult,expectedResult, "copyInRangeFalseTest");
    }

    void copyInRangeTrueTest2() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] array = {10,20,30,40,50,60,70};
        int[] expectedResult = {20,30,40,50,60,70};
        int[] realResult = arrayCopy.copyInRange(array,20,70);
        equalCheck(realResult,expectedResult, "copyInRangeTrueTest2");
    }

    void copyInRangeTrueTest3() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] array = {2,12,22,32,42,52,62};
        int[] expectedResult = {2,12,22,32};
        int[] realResult = arrayCopy.copyInRange(array,2,32);
        equalCheck(realResult,expectedResult, "copyInRangeTrueTest3");
    }

    void equalCheck(int[] realResult, int[] expectedResult, String testName) {
        if (Arrays.equals(realResult,expectedResult)) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FALSE");
        }
    }

    void notEqualCheck(int[] realResult, int[] expectedResult, String testName) {
        if (!Arrays.equals(realResult,expectedResult)) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FALSE");
        }
    }

}
