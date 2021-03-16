package students.deniss_jankovskis.lesson_6.level_3.task_13;


public class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.positiveNumberSearch1();
        test.positiveNumberSearch2();
        test.zeroNumberSearch();
        test.negativeNumberSearch1();
        test.negativeNumberSearch2();
    }


    public void positiveNumberSearch1() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 3};
        int realResult = ArrayService.countOccurrences(arr, 3);
        checkTestResult(2, realResult, "Positive Number Test 1");
    }


    public void positiveNumberSearch2() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 3};
        int realResult = ArrayService.countOccurrences(arr, 4);
        checkTestResult(0, realResult, "Positive Number Test 2");
    }


    public void zeroNumberSearch() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {0, 2, 9, 0};
        int realResult = ArrayService.countOccurrences(arr, 0);
        checkTestResult(2, realResult, "Zero Number Search");
    }

    public void negativeNumberSearch1() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {-5, -10, -27, -27};
        int realResult = ArrayService.countOccurrences(arr, -12);
        checkTestResult(0, realResult, "Negative Number Search 1");
    }

    public void negativeNumberSearch2() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {-100, -354, -548, -856};
        int realResult = ArrayService.countOccurrences(arr, -25);
        checkTestResult(0, realResult, "Negative Number Search 2");
    }


    private void checkTestResult(int expectedResult, int realResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test FAIL");
        }
    }

}
