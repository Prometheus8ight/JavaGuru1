package students.julija_katukova.lesson_4.level_4;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.multiTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbers();
        calculatorTest.maxOfThreeNumbers();
    }

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        check(realResult,expectedResult, "Sum");
    }


    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        check(realResult,expectedResult, "Sub");
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        check(realResult,expectedResult, "Div");
    }

    public void multiTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multi(firstNumber, secondNumber);
        check(realResult,expectedResult, "Multi");
    }

    public void isEvenTest() {
        int number = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("IsEven test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }

        number = 9;
        expectedResult = false;
        realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("IsEven test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }
    }

    public void maxOfTwoNumbers() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        check(realResult,expectedResult, "MaxOfTwoNumbers");

        firstNumber = 5;
        secondNumber = 10;
        expectedResult = 10;
        realResult = calculator.maxOfTwoNumbers(firstNumber,secondNumber);
        check(realResult,expectedResult, "MaxOfTwoNumbers");

        firstNumber = 10;
        secondNumber = 10;
        expectedResult = 10;
        realResult = calculator.maxOfTwoNumbers(firstNumber,secondNumber);
        check(realResult,expectedResult, "MaxOfTwoNumbers");

    }

    public void maxOfThreeNumbers () {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 3;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult,expectedResult, "MaxOfThreeNumbers");

        firstNumber = 5;
        secondNumber = 10;
        thirdNumber = 3;
        expectedResult = 10;
        realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult,expectedResult, "MaxOfThreeNumbers");

        firstNumber = 3;
        secondNumber = 5;
        thirdNumber = 10;
        expectedResult = 10;
        realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult,expectedResult, "MaxOfThreeNumbers");

        firstNumber = 10;
        secondNumber = 10;
        thirdNumber = 3;
        expectedResult = 10;
        realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult,expectedResult, "MaxOfThreeNumbers");

        firstNumber = 5;
        secondNumber = 10;
        thirdNumber = 10;
        expectedResult = 10;
        realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult,expectedResult, "MaxOfThreeNumbers");

        firstNumber = 10;
        secondNumber = 5;
        thirdNumber = 10;
        expectedResult = 10;
        realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult,expectedResult, "MaxOfThreeNumbers");

        firstNumber = 5;
        secondNumber = 5;
        thirdNumber = 10;
        expectedResult = 10;
        realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult,expectedResult, "MaxOfThreeNumbers");

        firstNumber = 5;
        secondNumber = 10;
        thirdNumber = 5;
        expectedResult = 10;
        realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult,expectedResult, "MaxOfThreeNumbers");

        firstNumber = 10;
        secondNumber = 5;
        thirdNumber = 5;
        expectedResult = 10;
        realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult,expectedResult, "MaxOfThreeNumbers");

        firstNumber = 10;
        secondNumber = 10;
        thirdNumber = 10;
        expectedResult = 10;
        realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult,expectedResult, "MaxOfThreeNumbers");
    }


    public void check (int realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }


}
