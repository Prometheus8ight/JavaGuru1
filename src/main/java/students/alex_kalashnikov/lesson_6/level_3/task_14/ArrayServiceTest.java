package students.alex_kalashnikov.lesson_6.level_3.task_14;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.testReplaceFirst();
        test.testNotReplacedFirst();

    }

    public void test(int[] array, int numberToReplace, int newNumber, boolean expectedResult) {
        ArrayService test = new ArrayService();
        boolean realResult = test.replaceFirst(array, numberToReplace, newNumber);
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    public void testReplaceFirst() {
        int[] array = {3, 2, 0, 3, 2, 3, 1};
        boolean expectedResult = true;
        test(array, 2, -5, expectedResult);
    }

    public void testNotReplacedFirst() {
        int[] array = {3, 2, 0, 3, 2, 3, 1};
        boolean expectedResult = false;
        test(array, 5, -5, expectedResult);

    }

}
