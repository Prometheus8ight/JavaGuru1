package students.lolita_polakova.lesson_4.level_4.task_14;

class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.aMaxTest();
        calculatorTest.bMaxTest();
        calculatorTest.evenTest();

    }

    public void aMaxTest() {
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(10, 8);
        if (realResult == expectedResult) {
            System.out.println("a Max Test = OK");
        } else {
            System.out.println("a Max Test = FAIL");
        }
    }

    public void bMaxTest() {
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(4, 7);
        if (realResult == expectedResult) {
            System.out.println("b Max Test = OK");
        } else {
            System.out.println("b Max Test = FAIL");
        }
    }

    public void evenTest() {
        int expectedResult = 11;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(11, 11);
        if (realResult == expectedResult) {
            System.out.println("Even Test = OK");
        } else {
            System.out.println("Even Test = FAIL");
        }
    }
}
