package students.julija_katukova.lesson_6.level_3.task_13;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.positiveNumbers1(new int[]{1, 2, 3, 3}, 3);
        arrayServiceTest.positiveNumbers2(new int[]{1, 2, 3, 3}, 4);
        arrayServiceTest.positiveNumbers3(new int[]{77777, 77777, 77777, 77777, 77777}, 77777);
        arrayServiceTest.zeroNumber1(new int[]{0, 2, 0}, 0);
        arrayServiceTest.zeroNumber2(new int[]{-4, 9946543, -963217, 15}, 0);
        arrayServiceTest.negativeNumbers1(new int[]{-48, -3, -48, -48, -48, -98, -2}, -48);
        arrayServiceTest.negativeNumbers2(new int[]{-488766585, -5642663, -268985}, 9);
    }

    public void positiveNumbers1 (int[] arr, int numberToSearch){
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.countOccurrences(arr, numberToSearch);
        check(realResult, 2,"Positive Numbers Test1");
    }

    public void positiveNumbers2 (int[] arr, int numberToSearch){
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.countOccurrences(arr, numberToSearch);
        check(realResult, 0,"Positive Numbers Test2");
    }

    public void positiveNumbers3 (int[] arr, int numberToSearch){
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.countOccurrences(arr, numberToSearch);
        check(realResult, 5,"Positive Numbers Test3");
    }

    public void zeroNumber1 (int[] arr, int numberToSearch){
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.countOccurrences(arr, numberToSearch);
        check(realResult, 2,"Zero Number Test1");
    }

    public void zeroNumber2 (int[] arr, int numberToSearch){
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.countOccurrences(arr, numberToSearch);
        check(realResult, 0,"Zero Number Test2");
    }

    public void negativeNumbers1 (int[] arr, int numberToSearch){
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.countOccurrences(arr, numberToSearch);
        check(realResult, 4,"Negative Numbers Test1");
    }

    public void negativeNumbers2 (int[] arr, int numberToSearch){
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.countOccurrences(arr, numberToSearch);
        check(realResult, 0,"Negative Numbers Test2");
    }

    public void check (int realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}
