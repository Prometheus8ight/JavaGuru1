package students.vitaly_porsev.lesson_6.level_3.task_14;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest methods = new ArrayServiceTest();
        methods.replaceFirstTestTrue();
        methods.replaceFirstTestFalse();
    }

    void replaceFirstTestTrue() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 23, 65, 73, 98, 4, 8};
        boolean realResult = arrayService.replaceFirst(array, 73, 9);
        checkTestTrue(realResult, "replaceFirstTestTrue");
    }

    void replaceFirstTestFalse() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 23, 65, 73, 98, 4, 8};
        boolean realResult = arrayService.replaceFirst(array, 10, 9);
        checkTestFalse(realResult, "replaceFirstTestFalse");
    }

    void checkTestTrue(boolean trueOrNot, String testName) {
        if (trueOrNot) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }

    void checkTestFalse(boolean trueOrNot, String testName) {
        if (!trueOrNot) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
