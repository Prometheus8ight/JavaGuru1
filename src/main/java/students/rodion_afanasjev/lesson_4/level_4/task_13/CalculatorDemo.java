package students.rodion_afanasjev.lesson_4.level_4.task_13;

class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int plus = calculator.sumPlus(25,10);
        System.out.println(plus);
        int minus = calculator.sumMinus(25,10);
        System.out.println(minus);
        int multiply = calculator.sumMultiply(2,10);
        System.out.println(multiply);
        int divide = calculator.sumDivide(20,10);
        System.out.println(divide);

        boolean even = calculator.isEven(divide);
        System.out.println(even);

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumPlusTest();
        calculatorTest.sumMinusTest();
        calculatorTest.sumMultiplyTest();
        calculatorTest.sumDivideTest();

        System.out.println(calculatorTest.evenTest());

    }


}
