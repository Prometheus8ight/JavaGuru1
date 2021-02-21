package students.alex_kalashnikov.lesson_4.level_4.task_15;

class CalculatorTest {

   Calculator test = new Calculator();

        public static void main(String[] args) {
            CalculatorTest calculatorTest = new CalculatorTest();
            calculatorTest.sumTest();
            calculatorTest.subTest();
            calculatorTest.divTest();
            calculatorTest.multiTest();
            calculatorTest.isEvenTest();
            calculatorTest.maxOfTwoNumbersTest();
            calculatorTest.maxOfTwoNumbersTest1();
            calculatorTest.maxOfTwoNumbersTest2();
            calculatorTest.maxOfThreeNumbersTest();
            calculatorTest.maxOfThreeNumbersTest1();
            calculatorTest.maxOfThreeNumbersTest2();
            calculatorTest.maxOfThreeNumbersTest3();
            calculatorTest.maxOfThreeNumbersTest4();
            calculatorTest.maxOfThreeNumbersTest5();
            calculatorTest.maxOfThreeNumbersTest6();
            calculatorTest.maxOfThreeNumbersTest7();
            calculatorTest.maxOfThreeNumbersTest8();
            calculatorTest.maxOfThreeNumbersTest9();

        }

        public void sumTest() {
            int firstNumber = 10;
            int secondNumber = 5;
            int expectedResult = 15;
            Calculator calculator = new Calculator();
            int realResult = calculator.sum(firstNumber, secondNumber);
            if (realResult == expectedResult) {
                System.out.println("Sum1Test = OK");
            } else {
                System.out.println("Sum1Test = FAIL");
            }
        }

        public void subTest() {
            int firstNumber = 10;
            int secondNumber = 5;
            int expectedResult = 5;
            Calculator calculator = new Calculator();
            int realResult = calculator.sub(firstNumber, secondNumber);
            if (realResult == expectedResult) {
                System.out.println("Sub1Test = OK");
            } else {
                System.out.println("Sub1Test = FAIL");
            }
        }

        public void divTest() {
            int firstNumber = 10;
            int secondNumber = 5;
            int expectedResult = 2;
            Calculator calculator = new Calculator();
            int realResult = calculator.div(firstNumber, secondNumber);
            if (realResult == expectedResult) {
                System.out.println("Div1Test = OK");
            } else {
                System.out.println("Div1Test = FAIL");
            }
        }

        public void multiTest() {
            int firstNumber = 10;
            int secondNumber = 5;
            int expectedResult = 50;
            Calculator calculator = new Calculator();
            int realResult = calculator.multi(firstNumber, secondNumber);
            if (realResult == expectedResult) {
                System.out.println("Multi1Test = OK");
            } else {
                System.out.println("Multi1Test = FAIL");
            }
        }

        public void isEvenTest() {
            int number = 11;
            boolean expectedResult = false;
            Calculator calculator = new Calculator();
            boolean realResult = calculator.isEven(number);
            if (realResult == expectedResult) {
                System.out.println("IsEvenTest = OK");
            } else {
                System.out.println("IsEvenTest = FAIL");
            }
        }

        public void maxOfTwoNumbersTest() {
            int firstNumber = 10;
            int secondNumber = 5;
            int expectedResult = 10;
            Calculator calculator = new Calculator();
            int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber);
            if (realResult == expectedResult) {
                System.out.println("MaxOfTwoNumbers1Test = OK");
            } else {
                System.out.println("MaxOfTwoNumbers1Test = FAIL");
            }
        }

        public void maxOfTwoNumbersTest1() {
            int firstNumber = 5;
            int secondNumber = 10;
            int expectedResult = 10;
            Calculator calculator = new Calculator();
            int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber);
            if (realResult == expectedResult) {
                System.out.println("MaxOfTwoNumbers1Test1 = OK");
            } else {
                System.out.println("MaxOfTwoNumbers1Test1 = FAIL");
            }
        }

        public void maxOfTwoNumbersTest2() {
            int firstNumber = 10;
            int secondNumber = 10;
            int expectedResult = 10;
            Calculator calculator = new Calculator();
            int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber);
            if (realResult == expectedResult) {
                System.out.println("MaxOfTwoNumbers1Test2 = OK");
            } else {
                System.out.println("MaxOfTwoNumbers1Test2 = FAIL");
            }
        }

        public void maxOfThreeNumbersTest() {
            int firstNumber = 10;
            int secondNumber = 5;
            int thirdNumber = 0;
            int expectedResult = 10;
            Calculator calculator = new Calculator();
            int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber);
            int x = result;
            int realResult = calculator.maxOfThreeNumbers(x, thirdNumber);
            if (realResult == expectedResult) {
                System.out.println("maxOfThreeNumbers1Test = OK");
            } else {
                System.out.println("maxOfThreeNumbers1Test = FAIL");
            }
        }

        public void maxOfThreeNumbersTest1() {
            int firstNumber = 10;
            int secondNumber = 5;
            int thirdNumber = 10;
            int expectedResult = 10;
            Calculator calculator = new Calculator();
            int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber);
            int x = result;
            int realResult = calculator.maxOfThreeNumbers(x, thirdNumber);
            if (realResult == expectedResult) {
                System.out.println("maxOfThreeNumbers1Test1 = OK");
            } else {
                System.out.println("maxOfThreeNumbers1Test1 = FAIL");
            }
        }

        public void maxOfThreeNumbersTest2() {
            int firstNumber = 10;
            int secondNumber = 10;
            int thirdNumber = 5;
            int expectedResult = 10;
            Calculator calculator = new Calculator();
            int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber);
            int x = result;
            int realResult = calculator.maxOfThreeNumbers(x, thirdNumber);
            if (realResult == expectedResult) {
                System.out.println("maxOfThreeNumbers1Test2 = OK");
            } else {
                System.out.println("maxOfThreeNumbers1Test2 = FAIL");
            }
        }

        public void maxOfThreeNumbersTest3() {
            int firstNumber = 5;
            int secondNumber = 10;
            int thirdNumber = 0;
            int expectedResult = 10;
            Calculator calculator = new Calculator();
            int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber);
            int x = result;
            int realResult = calculator.maxOfThreeNumbers(x, thirdNumber);
            if (realResult == expectedResult) {
                System.out.println("maxOfThreeNumbers1Test3 = OK");
            } else {
                System.out.println("maxOfThreeNumbers1Test3 = FAIL");
            }
        }

        public void maxOfThreeNumbersTest4() {
            int firstNumber = 5;
            int secondNumber = 10;
            int thirdNumber = 10;
            int expectedResult = 10;
            Calculator calculator = new Calculator();
            int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber);
            int x = result;
            int realResult = calculator.maxOfThreeNumbers(x, thirdNumber);
            if (realResult == expectedResult) {
                System.out.println("maxOfThreeNumbers1Test4 = OK");
            } else {
                System.out.println("maxOfThreeNumbers1Test4 = FAIL");
            }
        }

        public void maxOfThreeNumbersTest5() {
            int firstNumber = 10;
            int secondNumber = 10;
            int thirdNumber = 5;
            int expectedResult = 10;
            Calculator calculator = new Calculator();
            int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber);
            int x = result;
            int realResult = calculator.maxOfThreeNumbers(x, thirdNumber);
            if (realResult == expectedResult) {
                System.out.println("maxOfThreeNumbers1Test5 = OK");
            } else {
                System.out.println("maxOfThreeNumbers1Test5 = FAIL");
            }
        }

        public void maxOfThreeNumbersTest6() {
            int firstNumber = 0;
            int secondNumber = 5;
            int thirdNumber = 10;
            int expectedResult = 10;
            Calculator calculator = new Calculator();
            int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber);
            int x = result;
            int realResult = calculator.maxOfThreeNumbers(x, thirdNumber);
            if (realResult == expectedResult) {
                System.out.println("maxOfThreeNumbers1Test6 = OK");
            } else {
                System.out.println("maxOfThreeNumbers1Test6 = FAIL");
            }
        }

        public void maxOfThreeNumbersTest7() {
            int firstNumber = 5;
            int secondNumber = 10;
            int thirdNumber = 10;
            int expectedResult = 10;
            Calculator calculator = new Calculator();
            int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber);
            int x = result;
            int realResult = calculator.maxOfThreeNumbers(x, thirdNumber);
            if (realResult == expectedResult) {
                System.out.println("maxOfThreeNumbers1Test7 = OK");
            } else {
                System.out.println("maxOfThreeNumbers1Test7 = FAIL");
            }
        }

        public void maxOfThreeNumbersTest8() {
            int firstNumber = 10;
            int secondNumber = 5;
            int thirdNumber = 10;
            int expectedResult = 10;
            Calculator calculator = new Calculator();
            int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber);
            int x = result;
            int realResult = calculator.maxOfThreeNumbers(x, thirdNumber);
            if (realResult == expectedResult) {
                System.out.println("maxOfThreeNumbers1Test8 = OK");
            } else {
                System.out.println("maxOfThreeNumbers1Test8 = FAIL");
            }
        }

        public void maxOfThreeNumbersTest9() {
            int firstNumber = 10;
            int secondNumber = 10;
            int thirdNumber = 10;
            int expectedResult = 10;
            Calculator calculator = new Calculator();
            int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber);
            int x = result;
            int realResult = calculator.maxOfThreeNumbers(x, thirdNumber);
            if (realResult == expectedResult) {
                System.out.println("maxOfThreeNumbers1Test9 = OK");
            } else {
                System.out.println("maxOfThreeNumbers1Test9 = FAIL");
            }
        }

}
