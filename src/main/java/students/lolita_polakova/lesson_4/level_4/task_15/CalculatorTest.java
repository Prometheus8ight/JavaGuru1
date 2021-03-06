package students.lolita_polakova.lesson_4.level_4.task_15;

class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.aMaxTest();
        calculatorTest.bMaxTest();
        calculatorTest.cMaxTest();
        calculatorTest.abMaxTest();
        calculatorTest.bcMaxTest();
        calculatorTest.acMaxTest();
        calculatorTest.allEvenTest();
    }

    public void aMaxTest() {
        int expectedResult = 30;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(30, 20, 10);
        if (realResult == expectedResult) {
            System.out.println("a Max Test = OK");
        } else {
            System.out.println("a Max Test = FAIL");
        }
    }

    public void bMaxTest() {
        int expectedResult = 110;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(5, 110, 60);
        if (realResult == expectedResult) {
            System.out.println("b Max Test = OK");
        } else {
            System.out.println("b Max Test = FAIL");
        }
    }

    public void cMaxTest() {
        int expectedResult = 13;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(11, 12, 13);
        if (realResult == expectedResult) {
            System.out.println("c Max Test = OK");
        } else {
            System.out.println("c Max Test = FAIL");
        }
    }

    public void abMaxTest() {
        int expectedResult = 28;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(28, 28, 18);
        if (realResult == expectedResult) {
            System.out.println("a AND b Max Test = OK");
        } else {
            System.out.println("a AND b Max Test = FAIL");
        }
    }

    public void bcMaxTest() {
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(1, 3, 3);
        if (realResult == expectedResult) {
            System.out.println("b AND c Max Test = OK");
        } else {
            System.out.println("b AND c Max Test = FAIL");
        }
    }

    public void acMaxTest() {
        int expectedResult = 19;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(19, 2, 19);
        if (realResult == expectedResult) {
            System.out.println("a AND c Max Test = OK");
        } else {
            System.out.println("a AND c Max Test = FAIL");
        }
    }

    public void allEvenTest() {
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(10, 10, 10);
        if (realResult == expectedResult) {
            System.out.println("All Even Test = OK");
        } else {
            System.out.println("All Even Test = FAIL");
        }
    }
}
