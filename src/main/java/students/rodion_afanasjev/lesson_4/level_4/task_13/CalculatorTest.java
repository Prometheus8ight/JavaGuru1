package students.rodion_afanasjev.lesson_4.level_4.task_13;

class CalculatorTest {

    public void sumPlusTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedNumber = 15;
        Calculator calculator = new Calculator();
        int realNumber = calculator.sumPlus(firstNumber,secondNumber);
        if ( realNumber == expectedNumber){
            System.out.println("Success");
        }
        else {
            System.out.println("FAIL");
        }
    }

    public void sumMinusTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedNumber = 5;
        Calculator calculator = new Calculator();
        int realNumber = calculator.sumMinus(firstNumber,secondNumber);
        if ( realNumber == expectedNumber){
            System.out.println("Success");
        }
        else {
            System.out.println("FAIL");
        }
    }

    public void sumMultiplyTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedNumber = 50;
        Calculator calculator = new Calculator();
        int realNumber = calculator.sumMultiply(firstNumber,secondNumber);
        if ( realNumber == expectedNumber){
            System.out.println("Success");
        }
        else {
            System.out.println("FAIL");
        }
    }

    public void sumDivideTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedNumber = 2;
        Calculator calculator = new Calculator();
        int realNumber = calculator.sumDivide(firstNumber,secondNumber);
        if ( realNumber == expectedNumber){
            System.out.println("Success");
        }
        else {
            System.out.println("FAIL");
        }
    }
    
    public boolean evenTest() {
        int number = 6;
        boolean expected = true;
        Calculator calculator = new Calculator();
        boolean realNumber = calculator.isEven(number);
        return realNumber == expected;
    }
}
