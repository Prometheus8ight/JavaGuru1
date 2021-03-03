package students.deniss_jankovskis.lesson_6.level_3.task_16;

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.positiveNumbers(new int[]{1, 2, 3, 4, 5});
        test.zeroNumbers(new int[]{0, 1, 0, 2, 0, 3});
        test.negativeNumbers(new int[]{-1, -2, -3, -4, -5});
    }

    public void positiveNumbers(int[] arr) {
        ArrayService arrayService = new ArrayService();
        arrayService.revert(arr);
        checkTestResult(arr, new int[]{5, 4, 3, 2, 1}, "Positive Numbers Test");
    }

    public void zeroNumbers(int[] arr) {
        ArrayService arrayService = new ArrayService();
        arrayService.revert(arr);
        checkTestResult(arr, new int[]{3, 0, 2, 0, 1, 0}, "Zero Number Test");
    }

    public void negativeNumbers(int[] arr) {
        ArrayService arrayService = new ArrayService();
        arrayService.revert(arr);
        checkTestResult(arr, new int[]{-5, -4, -3, -2, -1}, "Negative Numbers Test");
    }


    public void checkTestResult(int[] realResult, int[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}