package students.lolita_polakova.lesson_4.level_4.task_13;

class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.isEvenTest();
    }

    public void isEvenTest() {

        int a = 20;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(a);
        if (realResult == expectedResult) {
            System.out.println("IsEven Test = OK");
        } else {
            System.out.println("IsEven Test = FAIL");
        }

        a = 19;
        expectedResult = false;
        realResult = calculator.isEven(a);
        if (realResult == expectedResult) {
            System.out.println("IsEven Test = OK");
        } else {
            System.out.println("IsEven Test = FAIL");
        }
    }
}
