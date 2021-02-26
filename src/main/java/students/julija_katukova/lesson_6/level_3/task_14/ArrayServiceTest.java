package students.julija_katukova.lesson_6.level_3.task_14;

import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.positiveNumbers1(new int[]{2, 4, 3, 5, 3, 4}, 3, 7);
        arrayServiceTest.positiveNumbers2(new int[]{852, 554987, 85461, 15},100, 1500);
        arrayServiceTest.zeroNumber1(new int[]{0, 0, 0, 0},0, 10);
        arrayServiceTest.zeroNumber2(new int[]{1, 2, 3, 4, 0},0, -1);
        arrayServiceTest.zeroNumber3(new int[]{-10, 75, 64, -98, 4593, -8}, 0, -100);
        arrayServiceTest.negativeNumbers1(new int[]{-10, -7, -4, -8, -8}, -8, -80);
        arrayServiceTest.negativeNumbers2(new int[]{-14520, -721257, -478148}, -97775, -800);
        arrayServiceTest.mixNumbers1(new int[]{-120, 2, 89956589 -478489148, 8521}, 8521, 0);
        arrayServiceTest.mixNumbers2(new int[]{-120, 2, 5, -74, 8521}, 556, 10);
    }

    public void positiveNumbers1 (int[] arr, int numberToReplace, int newNumber) {
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.replaceFirst(arr, numberToReplace, newNumber);
        check(realResult, true,"Positive Numbers Test1");
    }

    public void positiveNumbers2 (int[] arr, int numberToReplace, int newNumber) {
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.replaceFirst(arr, numberToReplace, newNumber);
        check(realResult, false,"Positive Numbers Test2");
    }

    public void zeroNumber1 (int[] arr, int numberToReplace, int newNumber) {
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.replaceFirst(arr, numberToReplace, newNumber);
        check(realResult, true,"Zero Number Test1");
    }

    public void zeroNumber2 (int[] arr, int numberToReplace, int newNumber) {
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.replaceFirst(arr, numberToReplace, newNumber);
        check(realResult, true,"Zero Number Test2");
    }

    public void zeroNumber3 (int[] arr, int numberToReplace, int newNumber) {
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.replaceFirst(arr, numberToReplace, newNumber);
        check(realResult, false,"Zero Number Test3");
    }

    public void negativeNumbers1 (int[] arr, int numberToReplace, int newNumber) {
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.replaceFirst(arr, numberToReplace, newNumber);
        check(realResult, true,"Negative Numbers Test1");
    }

    public void negativeNumbers2 (int[] arr, int numberToReplace, int newNumber) {
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.replaceFirst(arr, numberToReplace, newNumber);
        check(realResult, false,"Negative Numbers Test2");
    }

    public void mixNumbers1 (int[] arr, int numberToReplace, int newNumber) {
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.replaceFirst(arr, numberToReplace, newNumber);
        check(realResult, true,"Mix Numbers Test1");
    }

    public void mixNumbers2 (int[] arr, int numberToReplace, int newNumber) {
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.replaceFirst(arr, numberToReplace, newNumber);
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