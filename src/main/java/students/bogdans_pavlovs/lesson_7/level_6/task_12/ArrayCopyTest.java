package students.bogdans_pavlovs.lesson_7.level_6.task_12;

import java.util.Arrays;

class ArrayCopyTest {

    public static void main(String[] args) {

        ArrayCopyTest arrayCopyTest = new ArrayCopyTest();
        arrayCopyTest.arrayCopyTest1();
        arrayCopyTest.arrayCopyTest2();
    }

    void arrayCopyTest1(){

        ArrayCopy arrayCopy = new ArrayCopy();
        int[] expectedResult = new int[] {20, 30, 40, 50};
        int[] realResult = arrayCopy.copyInRange(new int[] {10, 20, 30, 40, 50, 60}, 20, 50);
        resultCheck(expectedResult, realResult, "Array Copy Test 1");

    }

    void arrayCopyTest2(){

        ArrayCopy arrayCopy = new ArrayCopy();
        int[] expectedResult = new int[] {-10, 69, 79};
        int[] realResult = arrayCopy.copyInRange(new int[] {-10, -50, -99, 69, 79, 159}, -40, 158);
        resultCheck(expectedResult, realResult, "Array Copy Test 2");

    }

    void resultCheck(int[] expectedResult, int[] realResult, String testName){

        if (Arrays.equals(expectedResult, realResult)){
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }

    }

}
