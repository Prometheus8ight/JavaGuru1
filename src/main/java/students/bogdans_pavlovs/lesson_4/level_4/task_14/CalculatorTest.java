package students.bogdans_pavlovs.lesson_4.level_4.task_14;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.addTest();
        calculatorTest.subtractTest();
        calculatorTest.divideTest();
        calculatorTest.multiplyTest();
        calculatorTest.isEvenTest();
        calculatorTest.highestOfTwoTest1();
        calculatorTest.highestOfTwoTest2();
        calculatorTest.highestOfTwoTest3();

    }

    public void addTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.add(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Add test = OK");
        } else {
            System.out.println("Add test = FAIL");
        }
    }

    public void subtractTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtract(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtract test = OK");
        } else {
            System.out.println("Subtract test = FAIL");
        }
    }

    public void divideTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }

    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }

    public void isEvenTest() {
        int yourNumber = 7;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(yourNumber);
        if (realResult == expectedResult) {
            System.out.println("Remainder test = OK");
        } else {
            System.out.println("Remainder test = FAIL");
        }
    }

    public void highestOfTwoTest1(){
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.highestOfTwo(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("Highest of two test 1 = OK");
        } else {
            System.out.println("Highest of two test 1 = FAIL");
        }

    }

    public void highestOfTwoTest2(){
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.highestOfTwo(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("Highest of two test 2 = OK");
        } else {
            System.out.println("Highest of two test 2 = FAIL");
        }

    }

    public void highestOfTwoTest3(){
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.highestOfTwo(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("Highest of two test 3 = OK");
        } else {
            System.out.println("Highest of two test 3 = FAIL");
        }

    }


}
