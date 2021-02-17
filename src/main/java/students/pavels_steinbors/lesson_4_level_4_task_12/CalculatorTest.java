package students.pavels_steinbors.lesson_4_level_4_task_12;

class CalculatorTest {

    public void sumTest() {
        int firstNumber = 80;
        int secondNumber = 20;
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
        public void subtractionTest() {
            int firstNumber = 21;
            int secondNumber = 11;
            int expectedResult = 10;
            Calculator calculator = new Calculator();
            int realResult = calculator.subtraction(firstNumber, secondNumber);
            if (realResult == expectedResult) {
                System.out.println("Subtraction test = OK");
            } else {
                System.out.println("Subtraction test = FAIL");
            }
    }

    public void divideTest() {
        int firstNumber = 100;
        int secondNumber = 25;
        int expectedResult = 4;
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }

    public void multiplicationTest() {
        int firstNumber = 85;
        int secondNumber = 19;
        int expectedResult = 1615;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }
}

