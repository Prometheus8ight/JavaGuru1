package students.vitaly_porsev.lesson_4.level_4.task_15;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.findMaxNumber(100, 100, 100));

        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.maxFirstNum();
        calculatorTest.maxSecondNum();
        calculatorTest.maxThirdNum();
        calculatorTest.firstThirdEqualMaxNums();
        calculatorTest.secondThirdEqualMaxNums();
        calculatorTest.firstThirdEqualMaxNums();
        calculatorTest.allEqualNums();
    }
}
