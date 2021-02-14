package students.vitaly_porsev.lesson_4.level_4.task_14;

class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        CalculatorTest calculatorTest = new CalculatorTest();

        System.out.println(calculator.maxOfTwoNumbers(111, 111));

        calculatorTest.maxTestFirstNumber();

        calculatorTest.maxTestSecondNumber();

        calculatorTest.equalNumberTest();
    }
}
