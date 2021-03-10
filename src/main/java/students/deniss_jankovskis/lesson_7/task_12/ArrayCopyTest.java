package students.deniss_jankovskis.lesson_7.task_12;

import java.util.Arrays;

public class ArrayCopyTest {


    public static void main(String[] args) {

        ArrayCopyTest test = new ArrayCopyTest();
        test.copyInRangeTest1();
        test.copyInRangeTest2();
        test.copyInRangeTest3();
        test.copyInRangeTest4();
    }

    private void copyInRangeTest1() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] arr = {3, 30, 5, 50, 7, 700, 9, 1000, 1, 90};
        int[] expectedResult = {3, 5, 7, 9, 1};
        checkTestResult(expectedResult, arrayCopy.copyInRange(arr, 1, 10), "copyInRangeTest1");
    }

    private void copyInRangeTest2() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] arr = {25, 255, 40, 400, 222, 80, 856, 64, 1000, 43};
        int[] expectedResult = {25, 40, 80, 64, 43};
        checkTestResult(expectedResult, arrayCopy.copyInRange(arr, 25, 100), "copyInRangeTest2");
    }

    private void copyInRangeTest3() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] arr = {250, 1, 400, 4, 31, 850, 5, 56, 630, 10};
        int[] expectedResult = {250, 400, 850, 630};
        checkTestResult(expectedResult, arrayCopy.copyInRange(arr, 250, 1000), "copyInRangeTest3");
    }

    private void copyInRangeTest4() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] arr = {500, 50, 5, 4, 3000, 850, 1, 56, 630, 53};
        int[] expectedResult = {50, 56, 53};
        checkTestResult(expectedResult, arrayCopy.copyInRange(arr, 50, 60), "copyInRangeTest4");
    }


    private void checkTestResult(int[] expectedResult, int[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}

