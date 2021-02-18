package students.julija_katukova.lesson_5.level_6.task_36;

import java.util.Objects;

class ArraysTest {
    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        int length = 5;
        int expectedResult = 5;
        int realResult = Arrays.create(5).length;
        check(realResult, expectedResult, "ArrayLengthTest");
    }

    public void shouldFindMaxNumber() {
        int[] array = {346, 9283, 9457, 324, 532};
        int expectedResult = 9457;
        int realResult = Arrays.findMax(array);
        check(realResult,expectedResult, "ArrayMaxNumberTest");
    }

    public void check(int realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
