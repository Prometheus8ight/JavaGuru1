package students.andrejs_kuramsins.lesson_2.level_0.task_0.lesson_4.task_12;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multiTest();
        calculatorTest.divTest();
    }


    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  //
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);  //
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }
        public void multiTest () {
            int firstNumber = 10;
            int secondNumber = 5;
            int expectedResult = 50;
            Calculator calculator = new Calculator();
            int realResult = calculator.multi(firstNumber, secondNumber);
            if (realResult == expectedResult) {
                System.out.println("Multi test = OK");
            } else {
                System.out.println("Multi test = FAIL");
            }
        }

        public void divTest () {
            int firstNumber = 10;
            int secondNumber = 5;
            int expectedResult = 2;
            Calculator calculator = new Calculator();
            int realResult = calculator.div(firstNumber, secondNumber);  //
            if (realResult == expectedResult) {
                System.out.println("Div test = OK");
            } else {
                System.out.println("Div test = FAIL");
            }
        }
    }


