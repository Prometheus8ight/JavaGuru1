package students.deniss_jankovskis.lesson_5.level_5;

class ArraysTest {

    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        int length = 8;
        int expectedResult = 8;
        int realResult = Arrays.create(8).length;
        check(realResult, expectedResult, "CreateArrayLength");

    }

    public void shouldFindMaxNumber() {
        int[] array = {20, 78, 104, 350, 500, 650, 730, 920};
        int expectedResult = 920;
        int realResult = Arrays.findMax(array);
        check(realResult, expectedResult, "FindMaxNumber");
    }

    public void shouldFindMinNumber() {
        int[] array = {150, 315, 520, 700, 810, 920, 1000, 1240};
        int expectedResult = 150;
        int realResult = Arrays.findMin(array);
        check(realResult, expectedResult, "FindMinNumber");
    }


    public void check(int expectedResult, int realResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " test has passed!");
        }
        else {
            System.out.println(testName + " test has failed!");
        }
    }



}
