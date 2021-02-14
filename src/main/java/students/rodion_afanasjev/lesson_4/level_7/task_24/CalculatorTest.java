package students.rodion_afanasjev.lesson_4.level_7.task_24;

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

    public void evenResultCheck(boolean realResult, boolean expectedResult){
        if (realResult == expectedResult){
            System.out.println("Success");
        }
        else{
            System.out.println("FAIL");
        }
    }

    public void resultCheck(int realResult, int expectedResult) {
        if (realResult == expectedResult) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }
    }

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        int expectedResult = 75;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        resultCheck(realResult, expectedResult);
    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        resultCheck(realResult, expectedResult);
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        resultCheck(realResult, expectedResult);
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        resultCheck(realResult, expectedResult);
    }

    public void isEvenTest1() {
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(40);
        evenResultCheck(realResult, expectedResult);
    }

    public void isEvenTest2() {
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(41);
        evenResultCheck(realResult, expectedResult);
    }

}
