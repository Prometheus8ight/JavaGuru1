package students.vitaly_porsev.lesson_4.level_4.task_14;

class CalculatorTest {

    public void maxTestFirstNumber(){
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(10, 5);
        if (realResult == expectedResult) {
            System.out.println("Max test = OK");
        } else {
            System.out.println("Max test = FAIL");
        }
    }

    public void maxTestSecondNumber(){
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(10, 100);
        if (realResult == expectedResult) {
            System.out.println("Max test = OK");
        } else {
            System.out.println("Max test = FAIL");
        }
    }

    public void equalNumberTest(){
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(50, 50);
        if (realResult == expectedResult) {
            System.out.println("Equal test = OK");
        } else {
            System.out.println("Equal test = FAIL");
        }
    }
}
