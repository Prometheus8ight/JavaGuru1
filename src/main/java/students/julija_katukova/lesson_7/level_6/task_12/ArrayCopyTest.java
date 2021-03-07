package students.julija_katukova.lesson_7.level_6.task_12;

import java.util.Arrays;

class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest arrayCopyTest = new ArrayCopyTest();
        arrayCopyTest.test1(new int[]{20, 30, 40, 50, 100, 200});
        arrayCopyTest.test2(new int[]{-4637, 1572, -176, 716, 0, -7315, 8897});
    }

    public void test1(int[] in) {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] realResult = arrayCopy.copyInRange(in, 0, 3);
        check(realResult, new int[]{20, 30, 40, 50}, "Test1");
    }

    public void test2(int[] in) {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] realResult = arrayCopy.copyInRange(in, 2, 4);
        check(realResult, new int[]{-176, 716, 0}, "Test2");
    }

    public void check(int[] realResult, int[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
