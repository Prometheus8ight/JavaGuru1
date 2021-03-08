package students.alex_kalashnikov.lesson_6.level_3.task_16;

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.testRevert();

    }

    public void test(int[] array, int[] expectedResult) {
        ArrayService test = new ArrayService();
        test.revert(array);
        if (Arrays.equals(array,expectedResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    public void testRevert() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expectedResult = {5, 4, 3, 2, 1};
        test(array,expectedResult);
    }

}
