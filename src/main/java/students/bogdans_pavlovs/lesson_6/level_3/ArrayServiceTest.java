package students.bogdans_pavlovs.lesson_6.level_3;

/*
Создайте класс ArrayServiceTest и напишите автоматические тесты
для разработанного вами метода. Не забудьте написать тесты для
позитивного и негативного сценариев работы вашего метода.
Если при работе над сигнатурой метода вы придумали примеры
входных данных и ожидаемого результата, то вы можете взять их
в качестве примеров и на их основе написать автоматические тесты.
 */

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();

        arrayServiceTest.arrayTestSuccess(new int[]{1, 2, -3, 4, 5}, 4);
        arrayServiceTest.arrayTestFail(new int[]{1, 2, -3, 4, 5}, 69);

        arrayServiceTest.countTestSuccess(new int[]{2, 2, 2, 2, 2}, 2);
        arrayServiceTest.countTestFail(new int[]{2, 2, 2, 2, 2}, 4);

        arrayServiceTest.replaceTestSuccess(new int[]{5, 2, 4, 8, 16}, 5, 1);
        arrayServiceTest.replaceTestFail(new int[]{5, 2, 4, 8, 16}, 3, 1);

        arrayServiceTest.replaceAllTestSuccess(new int[]{6, 6, 6, 6, 6}, 6, 1);
        arrayServiceTest.replaceAllTestFail(new int[]{6, 6, 6, 6, 6}, 2, 1);

        arrayServiceTest.reverseArrayTest(new int[]{5, 4, 3, 2, 1});
        arrayServiceTest.sortArrayTest(new int[]{2, 5, 3, 1, 4});

    }


    public void arrayTestSuccess (int[] arr, int numberToSearch){
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.contains(arr, numberToSearch);
        checkResult(true, realResult, "Array Success Test");
    }

    public void arrayTestFail (int[] arr, int numberToSearch){
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.contains(arr, numberToSearch);
        checkResult(false, realResult, "Array Fail Test");
    }

    public void countTestSuccess (int[] arr, int numberToSearch){
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.countOccurrences(arr, numberToSearch);
        checkCount(5, realResult,"Count Success Test" );
    }

    public void countTestFail (int[] arr, int numberToSearch){
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.countOccurrences(arr, numberToSearch);
        checkCount(0, realResult,"Count Fail Test" );
    }

    public void replaceTestSuccess(int[] arr, int numberToReplace, int newNumber){
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.replaceFirst(arr, numberToReplace, newNumber);
        checkResult(true, realResult, "Replace Success Test");
    }

    public void replaceTestFail(int[] arr, int numberToReplace, int newNumber){
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.replaceFirst(arr, numberToReplace, newNumber);
        checkResult(false, realResult, "Replace Fail Test");
    }

    public void replaceAllTestSuccess(int[] arr, int numberToReplace, int newNumber){
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.replaceAll(arr, numberToReplace, newNumber);
        checkCount(5, realResult,"Replace All Success Test" );
    }

    public void replaceAllTestFail(int[] arr, int numberToReplace, int newNumber){
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.replaceAll(arr, numberToReplace, newNumber);
        checkCount(0, realResult,"Replace All Fail Test" );
    }

    public void reverseArrayTest(int[] arr){

        int[] expectedArray = new int[]{1, 2, 3, 4, 5};
        ArrayService arrayService = new ArrayService();
        arrayService.revert(arr);
        checkArray(arr, expectedArray, "Reverse Array Test");
    }

    public void sortArrayTest(int[] arr){

        int[] expectedArray = new int[]{1, 2, 3, 4, 5};
        ArrayService arrayService = new ArrayService();
        arrayService.sort(arr);
        checkArray(arr, expectedArray, "Sort Array Test");
    }


    public void checkResult (boolean expectedResult, boolean realResult, String testName){

        if (expectedResult == realResult){
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }

    }

    public void checkCount (int expectedResult, int realResult, String testName){

        if (expectedResult == realResult){
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }

    }

    public void checkArray (int[] arr, int[] expectedArray, String testName){

        if(Arrays.equals(arr, expectedArray)){
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }

    }

}
