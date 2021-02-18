package students.julija_katukova.lesson_5.level_6.task_38;

class ArraysTest {
    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        int length = 5;
        int expectedResult = 5;
        int realResult = Arrays.create(5).length;
        check(realResult, expectedResult, "ArrayLengthTest");
    }

    public void shouldFindMaxNumber() {
        int[] array = {235, 375, 325, 394, 941};
        int expectedResult = 941;
        int realResult = Arrays.findMax(array);
        check(realResult, expectedResult, "ArrayMaxNumberTest");
    }

    public void shouldFindMinNumber() {
        int[] array = {643, 1152, 25852, 145, 531};
        int expectedResult = 145;
        int realResult = Arrays.findMin(array);
        check(realResult, expectedResult, "ArrayMinNumberTest");
    }

    public void check(int realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
