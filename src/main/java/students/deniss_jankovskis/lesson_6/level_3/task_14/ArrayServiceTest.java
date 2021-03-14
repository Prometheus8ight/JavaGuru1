package students.deniss_jankovskis.lesson_6.level_3.task_14;

public class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.replaceFirstNumberTrue();
        test.replaceFirstNumberFalse();

    }

    public void replaceFirstNumberTrue() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {3, 14, 65, 8, 95};
        boolean realResult = arrayService.replaceFirst(arr, 14, 74);
        checkTestResult(realResult, "Replace First Number True Test");

    }

    public void replaceFirstNumberFalse() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {25, 47, 84, 14, 3};
        boolean realResult = arrayService.replaceFirst(arr, 25, 28);
        checkTestResult(realResult, "Replace First Number False Test");
    }



    private void checkTestResult(boolean checkNumber, String testName) {
        if (checkNumber) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test FAIL");
        }
    }
}
