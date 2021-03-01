package students.deniss_jankovskis.lesson_6.level_3.task_16;

import java.util.Arrays;
import java.util.Objects;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.positiveNumbersTest(new int[]{1, 2, 3, 4, 5});
        test.zeroNumberTest(new int[]{0, 1, 0, 2, 0, 3});
        test.negativeNumbersTest(new int[]{-1, -2, -3, -4, -5});

    }

    public void positiveNumbersTest(int[] arr) {
        ArrayService arrayService = new ArrayService();
        arrayService.revert(arr);
        String realResult = Arrays.toString(arr);
        checkTestResult(realResult, "5, 4, 3, 2, 1", "Positive Numbers Test");
    }


    public void zeroNumberTest(int[] arr) {
        ArrayService arrayService = new ArrayService();
        arrayService.revert(arr);
        String realResult = Arrays.toString(arr);
        checkTestResult(realResult, "0, 1, 0, 2, 0, 3", "Zero Number Test");
    }

    public void negativeNumbersTest(int[] arr) {
        ArrayService arrayService = new ArrayService();
        arrayService.revert(arr);
        String realResult = Arrays.toString(arr);
        checkTestResult(realResult, "-5, -4, -3, -2, -1", "Negative Numbers Test");
    }


    public void checkTestResult(String realResult, String expectedResult, String testName) {
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
