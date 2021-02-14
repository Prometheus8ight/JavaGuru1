package students.vitaly_porsev.lesson_4.level_4.task_13;

class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        CalculatorTest calculatorTest = new CalculatorTest();

        System.out.println(calculator.isEven(10));

        calculatorTest.isEvenTest();

    }
}
