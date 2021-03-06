package students.lolita_polakova.lesson_4.level_7.task_24;

public class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    public void intExam(int realResult, int expectedResult) {
        if (realResult == expectedResult) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    public void sumTest() {
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(35, 40);
        intExam(realResult, 75);
    }

    public void subTest() {
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(35, 15);
        intExam(realResult, 20);

    }

    public void mulTest() {
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(5, 5);
        intExam(realResult, 25);

    }

    public void divTest() {
        Calculator calculator = new Calculator();
        int realResult = calculator.div(40, 8);
        intExam(realResult, 5);
    }

    public void booExam(boolean realResult, boolean expectedResult) {
        if (realResult == expectedResult) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(40);
        booExam(realResult, true);
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(41);
        booExam(realResult, false);
    }
}
