package students.alex_kalashnikov.lesson_5.level_5.task_32;

class ArraysTest {

    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        int expectedResult = 5;
        Arrays test = new Arrays();
        test.create(5);
        int realResult = test.create(5).length;
        if (realResult == expectedResult) {
            System.out.println("shouldCreateArray test is OK");
        }
        else {
            System.out.println("shouldCreateArray test is FAILED");
        }

    }

}