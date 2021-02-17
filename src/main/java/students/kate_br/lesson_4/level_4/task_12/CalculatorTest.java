package students.kate_br.lesson_4.level_4.task_12;

 class CalculatorTest {

     public static void main(String[] args) {
         CalculatorTest calculatorTest = new CalculatorTest();
         calculatorTest.sumTest();
         calculatorTest.multiplicationTest();
         calculatorTest.subtractionTest();
         calculatorTest.divisionTest();


     }

     public void sumTest(){
         int firstNumber = 10;
         int secondNumber = 15;
         int expectedResult = 25;
         Calculator calculator = new Calculator();
         int realResult = calculator.sum(firstNumber, secondNumber);

         if(realResult == expectedResult){
             System.out.println("Sum test = OK");
         }else {
             System.out.println("Sum test = FAIL");
         }
     }

     public void multiplicationTest(){
         int firstNumber = 5;
         int secondNumber = 10;
         int expectedResult = 50;
         Calculator calculator = new Calculator();
         int realResult = calculator.multiplication(firstNumber, secondNumber);

         if(realResult == expectedResult){
             System.out.println("Multiplication test = OK");
         }else{
             System.out.println("Multiplication test = FAIL");
         }
     }

     public void subtractionTest(){
         int firstNumber = 10;
         int secondNumber = 5;
         int expectedResult = 5;
         Calculator calculator = new Calculator();
         int realResult = calculator.subtraction(firstNumber, secondNumber);

         if(realResult == expectedResult){
             System.out.println("Subtraction test = OK");
         }else {
             System.out.println("Subtraction test = FAIL");
         }
     }

     public void divisionTest(){
         int firstNumber = 10;
         int secondNumber = 5;
         int expectedResult = 2;
         Calculator calculator = new Calculator();
         int realResult = calculator.division(firstNumber, secondNumber);

         if(realResult == expectedResult){
             System.out.println("Division test = OK");
         }else {
             System.out.println("Division test = FAIL");
         }
     }
}
