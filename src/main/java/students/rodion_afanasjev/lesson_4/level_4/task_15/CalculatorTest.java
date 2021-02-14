package students.rodion_afanasjev.lesson_4.level_4.task_15;

class CalculatorTest {

    public void maxFirstNumberTest() {
        int firstNumber = 150;
        int secondNumber = 50;
        int thirdNumber = 50;
        int expectedNumber = 150;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realNumber == expectedNumber) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }
    }

    public void maxSecondNumberTest() {
        int firstNumber = 50;
        int secondNumber = 150;
        int thirdNumber = 50;
        int expectedNumber = 150;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realNumber == expectedNumber) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }
    }

    public void maxThirdNumberTest() {
        int firstNumber = 50;
        int secondNumber = 50;
        int thirdNumber = 150;
        int expectedNumber = 150;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realNumber == expectedNumber) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }
    }

    public void equalFirstSecondMoreThanThirdNumberTest() {
        int firstNumber = 50;
        int secondNumber = 50;
        int thirdNumber = 25;
        int expectedNumber = 50;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realNumber == expectedNumber) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }
    }

    public void equalFirstSecondLessThanThirdNumberTest() {
        int firstNumber = 50;
        int secondNumber = 50;
        int thirdNumber = 100;
        int expectedNumber = 100;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realNumber == expectedNumber) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }
    }

    public void equalFirstThirdLessThanSecondNumberTest() {
        int firstNumber = 50;
        int secondNumber = 150;
        int thirdNumber = 50;
        int expectedNumber = 150;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realNumber == expectedNumber) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }
    }

    public void equalFirstThirdMoreThanSecondNumberTest() {
        int firstNumber = 100;
        int secondNumber = 50;
        int thirdNumber = 100;
        int expectedNumber = 100;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realNumber == expectedNumber) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }
    }

    public void equalSecondThirdMoreThanFirstNumberTest() {
        int firstNumber = 50;
        int secondNumber = 100;
        int thirdNumber = 100;
        int expectedNumber = 100;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realNumber == expectedNumber) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }
    }

    public void equalSecondThirdLessThanFirstNumberTest() {
        int firstNumber = 100;
        int secondNumber = 50;
        int thirdNumber = 50;
        int expectedNumber = 100;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realNumber == expectedNumber) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }
    }

    public void allNumbersEqualTest() {
        int firstNumber = 100;
        int secondNumber = 100;
        int thirdNumber = 100;
        int expectedNumber = 100;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realNumber == expectedNumber) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }
    }
}
