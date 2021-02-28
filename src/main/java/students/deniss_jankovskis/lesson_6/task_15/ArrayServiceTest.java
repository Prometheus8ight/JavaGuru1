package students.deniss_jankovskis.lesson_6.task_15;


public class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.replaceAllPositive();
        test.replaceAllNegative();
    }

    public void replaceAllPositive() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {3, 10, 56, 67, 85, 99};
        int realResult = arrayService.replaceAll(arr, 99, 74);
        checkTestResult(1, realResult, "Replace All Positive");

    }

    public void replaceAllNegative() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {-5, -22, -53, -75, -14, -96, -22};
        int realResult = arrayService.replaceAll(arr, -22, -7);
        checkTestResult(2, realResult, "Replace All Negative");
    }


    private void checkTestResult(int expectedResult, int realResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test FAIL");
        }
    }

}
