package students.julija_katukova.lesson_6.level_3.task_16;

import java.util.Arrays;
import java.util.Objects;

class ArrayServiceTest {
    public static void main(String[] args){
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.positiveNumbers1(new int[]{1, 2, 3});
        arrayServiceTest.positiveNumbers2(new int[]{1000, 2000, 3000, 4000});
        arrayServiceTest.zeroNumber1(new int[]{0, 1, 0, 1, 0, 0});
        arrayServiceTest.negativeNumbers1(new int[]{-1, -5696511, -2, -89856151, -3});
        arrayServiceTest.mixNumbers1(new int[]{1, -87981, -2, 942587, 0});
    }

    public void positiveNumbers1 (int[] arr) {
        ArrayService arrayService = new ArrayService();
        arrayService.revert(arr);
        String realResult = Arrays.toString(arr);
        check(realResult, "[3, 2, 1]", "Positive Numbers Test1");
    }

    public void positiveNumbers2 (int[] arr) {
        ArrayService arrayService = new ArrayService();
        arrayService.revert(arr);
        String realResult = Arrays.toString(arr);
        check(realResult, "[4000, 3000, 2000, 1000]", "Positive Numbers Test2");
    }

    public void zeroNumber1 (int[] arr) {
        ArrayService arrayService = new ArrayService();
        arrayService.revert(arr);
        String realResult = Arrays.toString(arr);
        check(realResult, "[0, 0, 1, 0, 1, 0]", "Zero Number Test1");
    }

    public void negativeNumbers1 (int[] arr) {
        ArrayService arrayService = new ArrayService();
        arrayService.revert(arr);
        String realResult = Arrays.toString(arr);
        check(realResult, "[-3, -89856151, -2, -5696511, -1]", "Negative Numbers Test1");
    }

    public void mixNumbers1 (int[] arr) {
        ArrayService arrayService = new ArrayService();
        arrayService.revert(arr);
        String realResult = Arrays.toString(arr);
        check(realResult, "[0, 942587, -2, -87981, 1]", "Mix Numbers Test1");
    }

    public void check (String realResult, String expectedResult, String testName) {
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}
