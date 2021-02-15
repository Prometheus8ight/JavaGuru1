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
        calculatorTest.maxOfThreeNumbers1Test();
        calculatorTest.maxOfThreeNumbers1Test1();
        calculatorTest.maxOfThreeNumbers1Test2();
        calculatorTest.maxOfThreeNumbers1Test3();
        calculatorTest.maxOfThreeNumbers1Test4();
        calculatorTest.maxOfThreeNumbers1Test5();
        calculatorTest.maxOfThreeNumbers1Test6();
        calculatorTest.maxOfThreeNumbers1Test7();
        calculatorTest.maxOfThreeNumbers1Test8();
        calculatorTest.maxOfThreeNumbers1Test9();

    }

    public void sum1Test() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum1(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum1Test = OK");
        } else {
            System.out.println("Sum1Test = FAIL");
        }
    }

    public void sub1Test() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub1(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub1Test = OK");
        } else {
            System.out.println("Sub1Test = FAIL");
        }
    }

    public void div1Test() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div1(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div1Test = OK");
        } else {
            System.out.println("Div1Test = FAIL");
        }
    }

    public void multi1Test() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multi1(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multi1Test = OK");
        } else {
            System.out.println("Multi1Test = FAIL");
        }
    }

    public void isEven1Test() {
        int number = 11;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven1(number);
        if (realResult == expectedResult) {
            System.out.println("IsEvenTest = OK");
        } else {
            System.out.println("IsEvenTest = FAIL");
        }
    }

    public void maxOfTwoNumbers1Test() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers1(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfTwoNumbers1Test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers1Test = FAIL");
        }
    }
    public void maxOfTwoNumbers1Test1() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers1(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfTwoNumbers1Test1 = OK");
        } else {
            System.out.println("MaxOfTwoNumbers1Test1 = FAIL");
        }
    }

    public void maxOfTwoNumbers1Test2() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers1(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfTwoNumbers1Test2 = OK");
        } else {
            System.out.println("MaxOfTwoNumbers1Test2 = FAIL");
        }
    }

    public void maxOfThreeNumbers1Test() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 0;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers1(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers1Test = OK");
        } else {
            System.out.println("maxOfThreeNumbers1Test = FAIL");
        }
    }

    public void maxOfThreeNumbers1Test1() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers1(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers1Test1 = OK");
        } else {
            System.out.println("maxOfThreeNumbers1Test1 = FAIL");
        }
    }

    public void maxOfThreeNumbers1Test2() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers1(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers1Test2 = OK");
        } else {
            System.out.println("maxOfThreeNumbers1Test2 = FAIL");
        }
    }

    public void maxOfThreeNumbers1Test3() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 0;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers1(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers1Test3 = OK");
        } else {
            System.out.println("maxOfThreeNumbers1Test3 = FAIL");
        }
    }

    public void maxOfThreeNumbers1Test4() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers1(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers1Test4 = OK");
        } else {
            System.out.println("maxOfThreeNumbers1Test4 = FAIL");
        }
    }

    public void maxOfThreeNumbers1Test5() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers1(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers1Test5 = OK");
        } else {
            System.out.println("maxOfThreeNumbers1Test5 = FAIL");
        }
    }

    public void maxOfThreeNumbers1Test6() {
        int firstNumber = 0;
        int secondNumber = 5;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers1(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers1Test6 = OK");
        } else {
            System.out.println("maxOfThreeNumbers1Test6 = FAIL");
        }
    }

    public void maxOfThreeNumbers1Test7() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers1(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers1Test7 = OK");
        } else {
            System.out.println("maxOfThreeNumbers1Test7 = FAIL");
        }
    }

    public void maxOfThreeNumbers1Test8() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers1(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers1Test8 = OK");
        } else {
            System.out.println("maxOfThreeNumbers1Test8 = FAIL");
        }
    }

    public void maxOfThreeNumbers1Test9() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers1(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers1Test9 = OK");
        } else {
            System.out.println("maxOfThreeNumbers1Test9 = FAIL");
        }
    }
}
