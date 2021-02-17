package students.arkadij.lesson_4.task_12;


class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.additionalTest();
        calculatorTest.subtractionTest();
        calculatorTest.divisionTest();
        calculatorTest.multiplicationTest();
    }
    public void additionalTest(){
        int num1 = 2;
        int num2 = 3;
        int expectedResult = 5;
        Calculators calculators = new Calculators();
        int realResult = calculators.additional(num1,num2);
        if (realResult == expectedResult){
            System.out.println("Addition test = OK");
        } else {
            System.out.println("Addition test = FAIL");
        }
    }
    public void subtractionTest(){
        int num1 = 2;
        int num2 = 3;
        int expectedResult = -1;
        Calculators calculators = new Calculators();
        int realResult = calculators.subtraction(num1,num2);
        if (realResult == expectedResult){
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }
    public void divisionTest(){
        int num1 = 2;
        int num2 = 3;
        int expectedResult = 0;
        Calculators calculators = new Calculators();
        int realResult = calculators.division(num1,num2);
        if (realResult == expectedResult){
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }
    public void multiplicationTest(){
        int num1 = 2;
        int num2 = 3;
        int expectedResult = 6;
        Calculators calculators = new Calculators();
        int realResult = calculators.multiplication(num1,num2);
        if (realResult == expectedResult){
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }
}
