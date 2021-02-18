package students.alex_kalashnikov.lesson_5.level_6.task_36;

class ArraysTest {

    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        int expectedResult = 5;
        Arrays test = new Arrays();
        int[] testArray = test.create(5);
        int realResult = testArray.length;
        if (realResult == expectedResult) {
            System.out.println("shouldCreateArray test is OK");
        }
        else {
            System.out.println("shouldCreateArray test is FAILED");
        }

    }

    public void shouldFindMaxNumber() {
        int expectedResult = 152;
        Arrays test = new Arrays();
        int[] testArray = test.create(5);
        testArray[0] = -15;
        testArray[1] = 25;
        testArray[2] = 2;
        testArray[3] = 152;
        testArray[4] = -34;
        int realResult = test.findMax(testArray);
        if (realResult == expectedResult) {
            System.out.println("shouldFindMaxNumber test is OK");
        }
        else {
            System.out.println("shouldFindMaxNumber test is FAILED");
        }
    }

}