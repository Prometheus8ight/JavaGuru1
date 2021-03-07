package students.darja_scavrovica.lesson_4.level_6.task_24;

import java.util.Objects;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest(75);
        calculatorTest.subTest(20);
        calculatorTest.mulTest(25);
        calculatorTest.divTest(5);
        calculatorTest.isEvenTest1(40);
    }

    public void sumTest(int result) {
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(35, 40);
        check(realResult ,75);
    }

    public void subTest(int result) {
        Calculator calculator = new Calculator();
        int realResult  = calculator.sub(35, 15);
        check(realResult ,75);
    }

    public void mulTest(int result) {
        Calculator calculator = new Calculator();
        int realResult  = calculator.mul(5, 5);
        check(realResult ,25);
    }

    public void divTest(int result) {
        Calculator calculator = new Calculator();
        int realResult  = calculator.div(40, 8);
        check(realResult ,5);
    }

    public void isEvenTest1(int result) {
            boolean expectedResult = true;
            Calculator calculator = new Calculator();
            boolean realResult  = calculator.isEven(39);
            check(realResult,expectedResult);
    }


    public void check (int result,int expectedResult ){
        if(Objects.equals(result,expectedResult)){
            System.out.println("Calculator Test = TRUE");
        }else
            System.out.println("Calculator Test  = FALSE");
    }

    public void check(boolean realResult,boolean expectedResult ){
        if(Objects.equals(realResult, expectedResult)){
            System.out.println("Calculator Test = TRUE");
        }else System.out.println("Calculator Test  = FALSE");
    }
}
