package students.rodion_afanasjev.lesson_6.level_3.task_12;

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.findNumberTrueTest();
        arrayServiceTest.findNumberFalseTest();
        arrayServiceTest.countOccurrencesTrueTest();
        arrayServiceTest.countOccurrencesFalseTest();
        arrayServiceTest.replaceFirstTrueTest();
        arrayServiceTest.replaceFirstFalseTest();
        arrayServiceTest.replaceAllNumbersTrueTest();
        arrayServiceTest.replaceAllNumbersFalseTest();
        arrayServiceTest.invertTest();
        arrayServiceTest.sortFromMinToMaxTest();

    }

    private void equalCheck(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

    public void findNumberTrueTest() {
        int[] array = {1, 3, 5, 7, 9, 11};
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.findNumberInArray(array, 7);
        equalCheck(realResult, "findNumberTrueTest"); // условие realResult = true
    }

    public void findNumberFalseTest() {
        int[] array = {1, 3, 5, 7, 9, 11};
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.findNumberInArray(array, 6);
        equalCheck(!realResult, "findNumberFalseTest"); // условие !realResult = false
    }

    public void countOccurrencesTrueTest() {
        int expectedResult = 3;
        int[] array = {1, 3, 7, 7, 7, 11};
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.countOccurrences(array, 7);
        if (realResult == expectedResult) {
            System.out.println("countOccurrencesTrueTest : OK");
        } else {
            System.out.println("countOccurrencesTrueTest : FAIL");
        }
    }

    public void countOccurrencesFalseTest() {
        int expectedResult = 2;
        int[] array = {1, 3, 7, 7, 7, 11};
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.countOccurrences(array, 7);
        if (realResult != expectedResult) {
            System.out.println("countOccurrencesFalseTest : OK");
        } else {
            System.out.println("countOccurrencesFalseTest : FAIL");
        }
    }

    public void replaceFirstTrueTest(){
        int[] array = {1, 3, 5, 7, 9, 11};
        ArrayService arrayService = new ArrayService();
        boolean realResult  = arrayService.replaceFirst(array,5,4);
        equalCheck(realResult,"replaceFirstTrueTest");
    }

    public void replaceFirstFalseTest(){
        int[] array = {1, 3, 6, 7, 9, 11};
        ArrayService arrayService = new ArrayService();
        boolean realResult  = arrayService.replaceFirst(array,5,4);
        equalCheck(!realResult,"replaceFirstFalseTest");
    }

    public void replaceAllNumbersTrueTest(){
        int expectedResult = 2;
        int[] array = {1, 3, 3, 2, 9, 11};
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.replaceAllNumbers(array,3,4);
        if (realResult == expectedResult){
            System.out.println("replaceAllNumbersTrueTest : OK");
        } else {
            System.out.println("replaceAllNumbersTrueTest : FAIL");
        }
    }

    public void replaceAllNumbersFalseTest(){
        int expectedResult = 3;
        int[] array = {1, 3, 3, 3, 9, 11};
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.replaceAllNumbers(array,9,4);
        if (realResult != expectedResult){
            System.out.println("replaceAllNumbersFalseTest : OK");
        } else {
            System.out.println("replaceAllNumbersFalseTest : FAIL");
        }
    }

    public void invertTest(){
        int[] expectedResult = {11, 9, 3, 6, 4, 8};
        int[] array = {8, 4, 6, 3, 9, 11};
        ArrayService arrayService = new ArrayService();
        arrayService.invert(array);
        if (Arrays.equals(expectedResult,array)){
            System.out.println("invertTrueTest : OK");
        } else {
            System.out.println("invertTrueTest : FAIL");
        }
    }

    public void sortFromMinToMaxTest(){
        int[] expectedResult = {3, 4, 6, 8, 9, 11};
        int[] array = {8, 4, 6, 3, 9, 11};
        ArrayService arrayService = new ArrayService();
        arrayService.sortFromMinToMax(array);
        if (Arrays.equals(expectedResult,array)){
            System.out.println("sortFromMinToMaxTest : OK");
        } else {
            System.out.println("sortFromMinToMaxTest : FAIL");
        }
    }

}
