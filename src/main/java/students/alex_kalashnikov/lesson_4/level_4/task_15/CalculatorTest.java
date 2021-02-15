package students.alex_kalashnikov.lesson_4.level_4.task_15;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sum1Test();
        calculatorTest.sub1Test();
        calculatorTest.div1Test();
        calculatorTest.multi1Test();
        calculatorTest.isEven1Test();
        calculatorTest.maxOfTwoNumbers1Test();
        calculatorTest.maxOfTwoNumbers1Test1();
        calculatorTest.maxOfTwoNumbers1Test2();

    }

    public void sum1Test() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum1(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void sub1Test() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub1(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void div1Test() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div1(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void multi1Test() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multi1(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void isEven1Test() {
        int number = 11;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven1(number);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void maxOfTwoNumbers1Test() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers1(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void maxOfTwoNumbers1Test1() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers1(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void maxOfTwoNumbers1Test2() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers1(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
}
