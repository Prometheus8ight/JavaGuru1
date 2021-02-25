package students.julija_katukova.lesson_6.level_3.task_12;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.positiveNumbers1(new int[]{1, 8, 3, 2, 5}, 2);
        arrayServiceTest.positiveNumbers2(new int[]{64561, 156468, 12183, 5485892, 166526}, 1);
        arrayServiceTest.zeroNumber1(new int[]{0, 0, 0, 0}, 0);
        arrayServiceTest.zeroNumber2(new int[]{0, 8, -9, 7}, 0);
        arrayServiceTest.zeroNumber3(new int[]{-4, 8, -9, 7}, 0);
        arrayServiceTest.negativeNumbers1(new int[]{-7, -13, -10}, -13);
        arrayServiceTest.negativeNumbers2(new int[]{-6798564, -6798735, -784, -87812, -87431, 864}, -50);
        arrayServiceTest.mixNumbers1(new int[]{-123456, 1, 0, -16, 876331}, -16);
        arrayServiceTest.mixNumbers2(new int[]{878952, 0, 9, -946, -6787532}, 89);
    }

    public void positiveNumbers1 (int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.contains(arr, numberToSearch);
        check(realResult, true,"Positive Numbers Test1");
    }

    public void positiveNumbers2 (int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.contains(arr, numberToSearch);
        check(realResult, false,"Positive Numbers Test2");
    }

    public void zeroNumber1 (int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.contains(arr, numberToSearch);
        check(realResult, true,"Zero Number Test1");
    }

    public void zeroNumber2 (int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.contains(arr, numberToSearch);
        check(realResult, true,"Zero Number Test2");
    }

    public void zeroNumber3 (int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.contains(arr, numberToSearch);
        check(realResult, false,"Zero Number Test3");
    }

    public void negativeNumbers1 (int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.contains(arr, numberToSearch);
        check(realResult, true,"Negative Numbers Test1");
    }

    public void negativeNumbers2 (int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.contains(arr, numberToSearch);
        check(realResult, false,"Negative Numbers Test2");
    }

    public void mixNumbers1 (int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.contains(arr, numberToSearch);
        check(realResult, true,"Mix Numbers Test1");
    }

    public void mixNumbers2 (int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.contains(arr, numberToSearch);
        check(realResult, false,"Mix Numbers Test2");
    }

    public void check (boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }


}
