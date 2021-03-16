package students.deniss_jankovskis.lesson_6.level_3.task_12;

public class ArrayServiceTest {


    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.trueNumberTest();
        test.falseNumberTest();
    }

    public void trueNumberTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {45, 10, 28, 74};
        boolean realResult = arrayService.contains(arr, 74);
        checkTestResult(realResult, "TrueNumber");
    }

    public void falseNumberTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {8, 14, 26, 85};
        boolean realResult = arrayService.contains(arr, 23);
        checkTestResult(!realResult, "FalseNumber");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

}
