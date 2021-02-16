package students.julija_katukova.lesson_4.level_7.task_24;

import java.util.Objects;

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

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        int expectedResult = 75;
        check(result, expectedResult, "Sum");
    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        int expectedResult = 20;
        check(result, expectedResult, "Sub");
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        int expectedResult = 25;
        check(result, expectedResult, "Mul");
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        int expectedResult = 5;
        check(result, expectedResult, "Div");
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(40);
        checkBoolean(result, true, "isEven");
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(41);
        checkBoolean(result, false, "isEven");
    }

    public void check (int result, int expectedResult, String testName) {
        if (result == expectedResult) {
            System.out.println(testName + " test = OK");
        }
        else {
            System.out.println(testName + " test = FAIL");
        }
    }

    public void checkBoolean (boolean result, boolean expectedResult, String testName) {
        if (Objects.equals(result, expectedResult)) {
            System.out.println(testName + " test = OK");
        }
        else {
            System.out.println(testName + " test = FAIL");
        }
    }



}
