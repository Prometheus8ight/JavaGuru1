package students.julija_katukova.lesson_6.level_3.task_17;

import java.util.Arrays;
import java.util.Objects;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.positiveNumbers1(new int[]{2, 3, 1});
        arrayServiceTest.positiveNumbers2(new int[]{298612312, 354563, 1641, 7, 6944, 989956654});
        arrayServiceTest.zeroNumber1(new int[]{11, 20, 0, 7});
        arrayServiceTest.zeroNumber2(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0});
        arrayServiceTest.negativeNumbers1(new int[]{-5, -6644, -15, -5, -74956, -1});
        arrayServiceTest.mixNumbers1(new int[]{0, 942587, -2, -87981, 1});
    }

    public void positiveNumbers1 (int[] arr) {
        ArrayService arrayService = new ArrayService();
        arrayService.sort(arr);
        String realResult = Arrays.toString(arr);
        check(realResult, "[1, 2, 3]", "Positive Numbers Test1");
    }

    public void positiveNumbers2 (int[] arr) {
        ArrayService arrayService = new ArrayService();
        arrayService.sort(arr);
        String realResult = Arrays.toString(arr);
        check(realResult, "[7, 1641, 6944, 354563, 298612312, 989956654]", "Positive Numbers Test2");
    }

    public void zeroNumber1 (int[] arr) {
        ArrayService arrayService = new ArrayService();
        arrayService.sort(arr);
        String realResult = Arrays.toString(arr);
        check(realResult, "[0, 7, 11, 20]", "Zero Number Test1");
    }

    public void zeroNumber2 (int[] arr) {
        ArrayService arrayService = new ArrayService();
        arrayService.sort(arr);
        String realResult = Arrays.toString(arr);
        check(realResult, "[0, 0, 0, 0, 0, 0, 0, 0, 0]", "Zero Number Test2");
    }

    public void negativeNumbers1 (int[] arr) {
        ArrayService arrayService = new ArrayService();
        arrayService.sort(arr);
        String realResult = Arrays.toString(arr);
        check(realResult, "[-74956, -6644, -15, -5, -5, -1]", "Negative Numbers Test1");
    }

    public void mixNumbers1 (int[] arr) {
        ArrayService arrayService = new ArrayService();
        arrayService.sort(arr);
        String realResult = Arrays.toString(arr);
        check(realResult, "[-87981, -2, 0, 1, 942587]", "Mix Numbers Test1");
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
