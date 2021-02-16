package students.arkadij.lesson_4.task_14;



class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.additionTest();
        calculatorTest.subtractionTest();
        calculatorTest.divisionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.evenTest();
        calculatorTest.maxFirstNumberTest();
        calculatorTest.maxSecondNumberTest();
        calculatorTest.equalNumberTest();
    }
    public void additionTest(){
        int num1 = 3;
        int num2 = 4;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.addition(num1,num2);
        if (realResult == expectedResult){
            System.out.println("Addition = OK");
        } else {
            System.out.println("Addition = FAIL");
        }
    }
    public void subtractionTest(){
        int num1 = 3;
        int num2 = 4;
        int expectedResult = -1;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(num1,num2);
        if (realResult == expectedResult){
            System.out.println("Subtraction = OK");
        } else {
            System.out.println("Subtraction = FAIL");
        }
    }
    public void divisionTest(){
        int num1 = 3;
        int num2 = 4;
        int expectedResult = 0;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(num1,num2);
        if (realResult == expectedResult){
            System.out.println("Division = OK");
        } else {
            System.out.println("Division = FAIL");
        }
    }
    public void multiplicationTest(){
        int num1 = 3;
        int num2 = 4;
        int expectedResult = 12;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(num1,num2);
        if (realResult == expectedResult){
            System.out.println("Multiplication = OK");
        } else {
            System.out.println("Multiplication = FAIL");
        }
    }
    public void evenTest(){
        int number = 3;
        boolean expected = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expected){
            System.out.println("Even = OK");
        } else {
            System.out.println("Even = FAIL");
        }
    }
    public void maxFirstNumberTest(){
        int firNumber = 10;
        int secNumber = 5;
        int expNumber = 10;
        Calculator calculator = new Calculator();
        int resultNumber = calculator.maxOfTwoNumbers(firNumber,secNumber);
        if (resultNumber == expNumber){
            System.out.println("1st highest number = OK");
        } else {
            System.out.println("1st highest number = FAIL");
        }
    }
    public void maxSecondNumberTest(){
        int firNumber = 5;
        int secNumber = 10;
        int expNumber = 10;
        Calculator calculator = new Calculator();
        int resultNumber = calculator.maxOfTwoNumbers(firNumber,secNumber);
        if (resultNumber == expNumber){
            System.out.println("2nd highest number = OK");
        } else {
            System.out.println("2nd highest number = FAIL");
        }
    }
    public void equalNumberTest(){
        int firNumber = 5;
        int secNumber = 5;
        int expNumber = 5;
        Calculator calculator = new Calculator();
        int resultNumber = calculator.maxOfTwoNumbers(firNumber,secNumber);
        if (resultNumber == expNumber){
            System.out.println("Highest number equal = OK");
        } else {
            System.out.println("Highest number equal = FAIL");
        }
    }
}
