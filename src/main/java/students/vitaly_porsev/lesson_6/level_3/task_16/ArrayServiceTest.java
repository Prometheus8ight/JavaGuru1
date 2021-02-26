package students.vitaly_porsev.lesson_6.level_3.task_16;

import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest method = new ArrayServiceTest();
        method.reverseArrayTest();
    }

    void reverseArrayTest() {
        ArrayService method = new ArrayService();
        int[] array = {1, 2, 3, 4, 5};
        int[] expectedResult = {5, 4, 3, 2, 1};
        method.reverseArray(array);
        checkResult(expectedResult, array, "reverseArrayTest");
    }

    void checkResult(int[] expectedResult, int[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
