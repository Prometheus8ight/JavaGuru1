package students.kate_br.lesson_6.level_3.task_15;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.positiveNumberTestPositive(new int[]{1, 3, 7, 3, 8, 9, 3, 4, 3}, 3, 6);
        test.positiveNumberTestNegative(new int[]{1, 3, 4, 3, 5, 6, 3}, 2, 7);
        test.negativeNumberTestPositive(new int[]{-4, -8, -4, -9, -1, -4}, -4, -5);
        test.numbersTest(new int[]{123, -3, 45, 56, -69, 46, 7, -69}, -69, 13);
    }

    public void positiveNumberTestPositive(int[] arr, int numberToReplace, int newNumber) {

        ArrayService service = new ArrayService();
        int realResult = service.replaceAll(arr, numberToReplace, newNumber);
        checkResultTest(realResult, 4, "PositiveNumberTestPositive");
    }

    public void positiveNumberTestNegative(int[] arr, int numberToReplace, int newNumber) {

        ArrayService service = new ArrayService();
        int realResult = service.replaceAll(arr, numberToReplace, newNumber);
        checkResultTest(realResult, 2, "PositiveNumberTestNegative");
    }

    public void negativeNumberTestPositive(int[] arr, int numberToReplace, int newNumber) {

        ArrayService service = new ArrayService();
        int realResult = service.replaceAll(arr, numberToReplace, newNumber);
        checkResultTest(realResult, 3, "NegativeNumberTestPositive");
    }

    public void numbersTest(int[] arr, int numberToReplace, int newNumber) {

        ArrayService service = new ArrayService();
        int realResult = service.replaceAll(arr, numberToReplace, newNumber);
        checkResultTest(realResult, 2, "NumberTestPositive");
    }

    private void checkResultTest(int realResult, int expectedResult, String testName) {

        if (realResult == expectedResult) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test FAIL");
        }
    }
}
