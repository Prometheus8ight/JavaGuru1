package students.andrew_galashin.lesson_6.level_3.task_15;

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
        System.out.println("Occurrences test TRUE: ");
        arrayServiceTest.occurrencesNumbers1(new int[]{1, 2, 3, 3}, 3);
        System.out.println("Occurrences test FALSE: ");
        arrayServiceTest.occurrencesNumbers2(new int[]{1, 2, 3, 3}, 4);
        System.out.println("Replacement test TRUE: ");
        arrayServiceTest.replacementNumbers1(new int[]{1, 2, 3, 4}, 4, 7);
        System.out.println("Replacement test FALSE: ");
        arrayServiceTest.replacementNumbers2(new int[]{1, 2, 3, 4}, 5, 7);
        System.out.println("Replacement all test TRUE: ");
        arrayServiceTest.replacementAllNumbers1(new int[]{1, 2, 2, 3}, 2, 7);
        System.out.println("Replacement all test FALSE: ");
        arrayServiceTest.replacementAllNumbers2(new int[]{1, 2, 2, 3}, 4, 7);
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

    public void occurrencesNumbers1(int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        int reasult = arrayService.occurrences(arr, numberToSearch);
        check2(reasult, 2, "Occurrences test - 1");

    }

    public void occurrencesNumbers2(int[] arr, int numberToSearch) {
        ArrayService arrayService = new ArrayService();
        int reasult = arrayService.occurrences(arr, numberToSearch);
        check2(reasult, 0, "Occurrences test - 2");

    }

    public void replacementNumbers1(int[] arr, int numberToSearch, int number) {
        ArrayService arrayService = new ArrayService();
        boolean reasult = arrayService.replacement(arr, numberToSearch, number);
        check(reasult, true, "Replacement test - 1");

    }

    public void replacementNumbers2(int[] arr, int numberToSearch, int number) {
        ArrayService arrayService = new ArrayService();
        boolean reasult = arrayService.replacement(arr, numberToSearch, number);
        check(reasult, false, "Replacement test - 2");

    }

    public void replacementAllNumbers1(int[] arr, int numberToReplace, int number) {
        ArrayService arrayService = new ArrayService();
        int reasult = arrayService.replacementAll(arr, numberToReplace, number);
        check2(reasult, 2, "Replacement All test - 1");
    }


    public void replacementAllNumbers2(int[] arr, int numberToReplace, int number) {
        ArrayService arrayService = new ArrayService();
        int reasult = arrayService.replacementAll(arr, numberToReplace, number);
        ;
        check2(reasult, 0, "Replacement All test - 2");
    }


    public void check(boolean result, boolean expected, String testName) {
        if (result == expected) {
            System.out.println("Complete");
        } else {
            System.out.println("Fail");
        }
    }

    public void check2(int result, int expected, String testName) {
        if (result == expected) {
            System.out.println("Complete");
        } else {
            System.out.println("Fail");
        }
    }
}
