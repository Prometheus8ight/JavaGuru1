package students.vitaly_porsev.lesson_6.level_3.task_17;

import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest method = new ArrayServiceTest();
        method.sortArrayTest();
    }

    void sortArrayTest() {
        ArrayService method = new ArrayService();
        int[] array = {40, 2, 55, 67, 23, 99, 7};
        int[] expectedResult = {2, 7, 23, 40, 55, 67, 99};
        method.sort(array);
        checkResult(expectedResult, array, "sortArrayTest");
    }

    void checkResult(int[] expectedResult, int[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
