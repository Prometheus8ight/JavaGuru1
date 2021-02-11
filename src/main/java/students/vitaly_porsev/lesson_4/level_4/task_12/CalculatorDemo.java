package students.vitaly_porsev.lesson_4.level_4.task_12;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(10, 5));
        System.out.println(calculator.subtract(100, 45));
        System.out.println(calculator.multiply(25, 4));
        System.out.println(calculator.divide(100, 4));

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtract();
        calculatorTest.multiply();
        calculatorTest.divide();

    }
}
