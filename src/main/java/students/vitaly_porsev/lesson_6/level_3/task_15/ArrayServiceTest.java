package students.vitaly_porsev.lesson_6.level_3.task_15;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest method = new ArrayServiceTest();
        method.replace1NumTest();
        method.replace5NumTest();
        method.replace0NumTest();
    }

    void replace1NumTest() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 25, 67, 54, 39, 78};
        checkResult(1, arrayService.replaceAll(array, 54, 8), "replace1NumTest");
    }

    void replace5NumTest() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 25, 67, 54, 39, 54, 67, 54, 89, 1, 54, 54};
        checkResult(5, arrayService.replaceAll(array, 54, 8), "replace5NumTest");
    }

    void replace0NumTest() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 25, 67, 39, 78};
        checkResult(0, arrayService.replaceAll(array, 54, 8), "replace0NumTest");
    }

    void checkResult(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - Test OK");
        } else {
            System.out.println(testName + " - Test FALSE");
        }
    }
}
