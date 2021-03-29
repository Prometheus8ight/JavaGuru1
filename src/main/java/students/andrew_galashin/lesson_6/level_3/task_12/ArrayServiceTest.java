package students.andrew_galashin.lesson_6.level_3.task_12;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        System.out.println("Positive number test TRUE: ");
        arrayServiceTest.posNumber1(new int[]{1, 2, 3,}, 3);
        System.out.println("Positive number test FALSE: ");
        arrayServiceTest.posNumber2(new int[]{4, 5, 6,}, 3);
        System.out.println("Zero number test TRUE: ");
        arrayServiceTest.zeroNumber1(new int[]{0, 2, 3,}, 0);
        System.out.println("Zero number test FALSE: ");
        arrayServiceTest.zeroNumber2(new int[]{1, 2, 3,}, 0);
        System.out.println("Negative number test TRUE: ");
        arrayServiceTest.negativeNumber1(new int[]{-1, -2, -3,}, -3);
        System.out.println("Negative number test FALSE: ");
        arrayServiceTest.negativeNumber2(new int[]{-4, -5, -6,}, -3);
    }

    public void posNumber1(int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        boolean result = arrayService.contains(arr, numberToSearch);
        check(result, true, "Positive number test - 1");
    }

    public void posNumber2(int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        boolean result = arrayService.contains(arr, numberToSearch);
        check(result, false, "Positive number test - 2");
    }

    public void zeroNumber1(int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        boolean result = arrayService.contains(arr, numberToSearch);
        check(result, true, "Zero number test - 1");
    }

    public void zeroNumber2(int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        boolean result = arrayService.contains(arr, numberToSearch);
        check(result, false, "Zero number test - 2");
    }

    public void negativeNumber1(int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        boolean result = arrayService.contains(arr, numberToSearch);
        check(result, true, "Negative number test - 1");
    }

    public void negativeNumber2(int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        boolean result = arrayService.contains(arr, numberToSearch);
        check(result, false, "Negative number test - 2");
    }


    public void check(boolean result, boolean expected, String testName) {
        if (result == expected) {
            System.out.println("Complete");
        } else {
            System.out.println("Fail");
        }
    }
}
