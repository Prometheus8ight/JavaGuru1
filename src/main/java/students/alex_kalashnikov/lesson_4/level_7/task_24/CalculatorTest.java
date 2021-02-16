package students.alex_kalashnikov.lesson_4.level_7.task_24;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    int firstNumber = 40;    // одинаковые цифры для всех тестов
    int secondNumber = 20;
    int thirdNumber = 21;

    public void test(int result,int expectedResult) {
        if (result == expectedResult) {
            System.out.println("Test = OK");
        }
        else {
            System.out.println("Test = FAIL");
        }
    }

    public void testBoolean(boolean result, boolean expectedResult) {
        if (result == expectedResult) {
            System.out.println("Test = OK");
        }
        else {
            System.out.println("Test = FAIL");
        }
    }

    public void sumTest() {
        int expectedResult = 60;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        test(result,expectedResult);
    }

    public void subTest() {
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        test(result,expectedResult);
    }

    public void mulTest() {
        int expectedResult = 800;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        test(result,expectedResult);
    }

    public void divTest() {
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        test(result,expectedResult);
    }

    public void isEvenTest1() {
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(firstNumber);
        testBoolean(result,expectedResult);
    }

    public void isEvenTest2() {
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(thirdNumber);
        testBoolean(result,expectedResult);
    }
}
