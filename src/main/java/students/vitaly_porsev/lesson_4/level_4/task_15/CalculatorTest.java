package students.vitaly_porsev.lesson_4.level_4.task_15;

public class CalculatorTest {

    public void maxFirstNum(){
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.findMaxNumber(100, 20, 20);
        if (realResult == expectedResult) {
            System.out.println("Max test = OK");
        } else {
            System.out.println("Max test = FAIL");
        }
    }

    public void maxSecondNum(){
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.findMaxNumber(10, 100, 20);
        if (realResult == expectedResult) {
            System.out.println("Max test = OK");
        } else {
            System.out.println("Max test = FAIL");
        }
    }

    public void maxThirdNum(){
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.findMaxNumber(10, 20, 100);
        if (realResult == expectedResult) {
            System.out.println("Max test = OK");
        } else {
            System.out.println("Max test = FAIL");
        }
    }

    public void firstSecondEqualMaxNums(){
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.findMaxNumber(100, 100, 20);
        if (realResult == expectedResult) {
            System.out.println("Max test = OK");
        } else {
            System.out.println("Max test = FAIL");
        }
    }

    public void secondThirdEqualMaxNums(){
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.findMaxNumber(10, 100, 100);
        if (realResult == expectedResult) {
            System.out.println("Max test = OK");
        } else {
            System.out.println("Max test = FAIL");
        }
    }

    public void firstThirdEqualMaxNums(){
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.findMaxNumber(100, 10, 100);
        if (realResult == expectedResult) {
            System.out.println("Max test = OK");
        } else {
            System.out.println("Max test = FAIL");
        }
    }

    public void allEqualNums(){
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.findMaxNumber(100, 100, 100);
        if (realResult == expectedResult) {
            System.out.println("Max test = OK");
        } else {
            System.out.println("Max test = FAIL");
        }
    }



    }

