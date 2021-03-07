package students.lolita_polakova.lesson_5.level_5.task_32;

class ArraysTest {

    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        int expectedResult = 7;
        int realResult = Arrays.create(7).length;
        if (realResult == expectedResult) {
            System.out.println("Create Array Test: OK");
        } else {
            System.out.println("Create Array Test: FAIL");
        }
    }
}