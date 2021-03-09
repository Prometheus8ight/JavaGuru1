package students.lolita_polakova.lesson_4.level_4.task_12;

class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multiTest();
        calculatorTest.divTest();
    }

    public void sumTest() {
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(10, 5);
        if (realResult == expectedResult) {
            System.out.println("Summary Test = OK");
        } else {
            System.out.println("Summary Test = FAIL");
        }
    }

    public void subTest() {
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(10, 5);
        if (realResult == expectedResult) {
            System.out.println("Subtraction Test = OK");
        } else {
            System.out.println("Subtraction Test = FAIL");
        }
    }

    public void multiTest() {
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multi(10, 5);
        if (realResult == expectedResult) {
            System.out.println("Multiplication Test = OK");
        } else {
            System.out.println("Multiplication Test = FAIL");
        }
    }

    public void divTest() {
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(10, 5);
        if (realResult == expectedResult) {
            System.out.println("Division Test = OK");
        } else {
            System.out.println("Division Test = FAIL");
        }
    }
}
