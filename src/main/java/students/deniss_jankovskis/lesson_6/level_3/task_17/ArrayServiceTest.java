package students.deniss_jankovskis.lesson_6.level_3.task_17;

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.sortNumbersTest();
        test.sortZeroNumbersTest();
        test.sortNumbersTest2();
    }

    public void sortNumbersTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {2, 10, 35, 49, 68, 89, 99};
        int[] expectedResult = {99, 89, 68, 49, 35, 10, 2};
        arrayService.sort(arr);
        checkTestResult(expectedResult, arr, "Sort Numbers Test");
    }

    public void sortZeroNumbersTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {0, 0, 0, 0, 0, 0, 0};
        int[] expectedResult = {0, 0, 0, 0, 0, 0, 0};
        arrayService.sort(arr);
        checkTestResult(expectedResult, arr, "Zero Numbers Test");
    }

    public void sortNumbersTest2() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {-1, -5, -10, -25, -35, -50, -99};
        int[] expectedResult = {-50, -99, -35, -10, -25, -1, -5};
        arrayService.sort(arr);
        checkTestResult(expectedResult, arr, "Sort Numbers Test 2");
    }

    public void checkTestResult(int[] expectedResult, int[] realResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
