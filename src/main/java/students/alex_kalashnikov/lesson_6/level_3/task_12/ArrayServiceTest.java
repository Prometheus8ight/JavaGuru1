package students.alex_kalashnikov.lesson_6.level_3.task_12;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.testContains();
        test.testNotContains();

    }

    public void test(int[] array, int numberToSearch, boolean expectedResult) {
        ArrayService test = new ArrayService();
        boolean realResult = test.contains(array, numberToSearch);
        if (expectedResult == realResult) {
            System.out.println("Contains test is OK!");
        } else {
            System.out.println("Contains test is FAILED!");
        }
    }

    public void testContains() {
        int[] array = {0, 1, 0, 3, 2};
        boolean expectedResult = true;
        test(array, 2, expectedResult);
    }

    public void testNotContains() {
        int[] array = {0, 1, 0, 3, 2};
        boolean expectedResult = false;
        test(array, -3, expectedResult);
    }

}