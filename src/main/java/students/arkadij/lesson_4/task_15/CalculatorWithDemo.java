package students.arkadij.lesson_4.task_15;

class CalculatorWithDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int maxNum = calculator.maxOfThree(1,2,3);
        System.out.print("The max number of 1 & 2 & 3 is: ");
        System.out.println(maxNum);

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.maxANumberTest();
        calculatorTest.maxBNumberTest();
        calculatorTest.maxCNumberTest();
        calculatorTest.moreEqualABThanCNumberTest();
        calculatorTest.lessEqualABThanCNumberTest();
        calculatorTest.moreEqualACThanBNumberTest();
        calculatorTest.lessEqualACThanBNumberTest();
        calculatorTest.moreEqualBCThanANumberTest();
        calculatorTest.lessEqualBCThanANumberTest();
        calculatorTest.aBCNumberEqualTest();

    }

}
