package students.vitaly_porsev.lesson_6.level_3.task_12;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest methods = new ArrayServiceTest();
        methods.findNumTestTrue();
        methods.findNumTestFalse();
    }

    void findNumTestTrue() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 23, 55, 75, 89, 32, 9};
        boolean realResult = arrayService.findNumberInArray(array, 89);
        checkTestResult(realResult, "findNumTrue");
    }

    void findNumTestFalse() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 23, 55, 75, 89, 32, 9};
        boolean realResult = arrayService.findNumberInArray(array, 90);
        checkTestResult(!realResult, "findNumFalse");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}

