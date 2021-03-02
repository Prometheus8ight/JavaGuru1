package students.julija_katukova.lesson_6.level_3.task_15;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.positiveNumbers1(new int[]{4, 6, 7, 2, 3, 8, 10, 7, 6}, 7, 27);
        arrayServiceTest.positiveNumbers2(new int[]{777, 777, 777, 777, 777}, 777, 333);
        arrayServiceTest.positiveNumbers3(new int[]{4, 6, 7, 2, 3, 8, 10, 7, 6}, 100, 27);
        arrayServiceTest.zeroNumber1(new int[]{4, 0, 7, 0, 3, 0}, 0, 10);
        arrayServiceTest.negativeNumbers1(new int[]{-2, -56, -2, -2, -953, -2, -10, -5}, -2, -25);
        arrayServiceTest.mixNumbers1(new int[]{4, 5, -7, 1, 6, 7, -4, -3}, 1, -1);
    }

    public void positiveNumbers1 (int[] arr, int numberToReplace, int newNumber) {
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.replaceAll(arr, numberToReplace, newNumber);
        check(realResult, 2,"Positive Numbers Test1");
    }

    public void positiveNumbers2 (int[] arr, int numberToReplace, int newNumber) {
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.replaceAll(arr, numberToReplace, newNumber);
        check(realResult, 5,"Positive Numbers Test2");
    }

    public void positiveNumbers3 (int[] arr, int numberToReplace, int newNumber) {
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.replaceAll(arr, numberToReplace, newNumber);
        check(realResult, 0,"Positive Numbers Test3");
    }

    public void zeroNumber1 (int[] arr, int numberToReplace, int newNumber) {
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.replaceAll(arr, numberToReplace, newNumber);
        check(realResult, 3,"Zero Number Test1");
    }

    public void negativeNumbers1 (int[] arr, int numberToReplace, int newNumber) {
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.replaceAll(arr, numberToReplace, newNumber);
        check(realResult, 4,"Negative Numbers Test1");
    }

    public void mixNumbers1 (int[] arr, int numberToReplace, int newNumber) {
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.replaceAll(arr, numberToReplace, newNumber);
        check(realResult, 1,"Mix Numbers Test1");
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
