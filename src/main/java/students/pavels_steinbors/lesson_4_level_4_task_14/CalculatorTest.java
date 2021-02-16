package students.pavels_steinbors.lesson_4_level_4_task_14;

class CalculatorTest {

    public void MaxFirstNumberTest() {
        Calculator calculator1 = new Calculator();
        int expectedResult = 7;
        int realResult = calculator1.maxOfTwoNumbers(7, 5);

        if (realResult == expectedResult) {
            System.out.println("Max first number test is OK");
        }
        else {
            System.out.println("Max first number test is FAIL");
        }
    }

    public void MaxSecondNumberTest() {
        Calculator calculator1 = new Calculator();
        int expectedResult = 9;
        int realResult = calculator1.maxOfTwoNumbers(7, 9);

        if (realResult == expectedResult) {
            System.out.println("Max second number test is OK");
        }
        else {
            System.out.println("Max second number test is FAIL");
        }
    }

    public void EqualNumbersTest() {
        Calculator calculator1 = new Calculator();
        int expectedResult = 9;
        int realResult = calculator1.maxOfTwoNumbers(9, 9);

        if (realResult == expectedResult) {
            System.out.println("Equal number test is OK");
        }
        else {
            System.out.println("Equal number test is FAIL");
        }
    }

}
