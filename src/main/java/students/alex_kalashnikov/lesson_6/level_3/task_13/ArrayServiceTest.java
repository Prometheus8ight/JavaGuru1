package students.alex_kalashnikov.lesson_6.level_3.task_13;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.testCountOccurrences();

    }

    public void test(int[] array, int numberToSearch, int expectedResult) {
        ArrayService test = new ArrayService();
        int realResult = test.countOccurrences(array, numberToSearch);
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    public void testCountOccurrences() {
        int[] array = {3, 1, 0, 3, 2};
        int expectedResult = 2;
        test(array, 3, expectedResult);
    }

}