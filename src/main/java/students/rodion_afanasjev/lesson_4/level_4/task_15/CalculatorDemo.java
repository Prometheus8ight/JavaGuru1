package students.rodion_afanasjev.lesson_4.level_4.task_15;

class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int maxNumber = calculator.maxOfThreeNumbers(0, 0,0);
        System.out.println(maxNumber);

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.maxFirstNumberTest(); // a > b and c
        calculatorTest.maxSecondNumberTest(); // b > a and c
        calculatorTest.maxThirdNumberTest(); // c > a and b
        calculatorTest.equalFirstSecondLessThanThirdNumberTest(); // a = b   a < c
        calculatorTest.equalFirstSecondMoreThanThirdNumberTest(); // a = b   a > c
        calculatorTest.equalFirstThirdLessThanSecondNumberTest(); // a = c   a < b
        calculatorTest.equalFirstThirdMoreThanSecondNumberTest(); // a = c   a > b
        calculatorTest.equalSecondThirdLessThanFirstNumberTest(); // b = c   b < a
        calculatorTest.equalSecondThirdMoreThanFirstNumberTest(); // b = c   b > a
        calculatorTest.allNumbersEqualTest(); // a = b   b = c


    }

}
