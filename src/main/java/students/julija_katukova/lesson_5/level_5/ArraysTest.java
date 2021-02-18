package students.julija_katukova.lesson_5.level_5;

import java.util.Objects;

class ArraysTest {
    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        int length = 5;
        int expectedResult = 5;
        int realResult = Arrays.create(5).length;
        check(realResult,  expectedResult,"ArrayLengthTest");
    }

    public void check (int realResult, int expectedResult, String testName){
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println(testName + " test = OK");
        }
        else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
