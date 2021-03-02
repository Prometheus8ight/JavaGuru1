package students.vitaly_porsev.lesson_6.level_3.task_13;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest methods = new ArrayServiceTest();
        methods.num0Test();
        methods.num2Test();
        methods.num5Test();
    }

    void num2Test() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 5, 16, 2, 8, 8, 1};
        checkTheResult(2, arrayService.countOccurrences(array, 8),
                "num2Test");
    }

    void num5Test() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 5, 16, 2, 8, 8, 1, 8, 212, 8, 500, 8};
        checkTheResult(5, arrayService.countOccurrences(array, 8),
                "num5Test");
    }

    void num0Test() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 5, 16, 2, 1};
        checkTheResult(0, arrayService.countOccurrences(array, 8),
                "num0Test");
    }

    void checkTheResult(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }
}
