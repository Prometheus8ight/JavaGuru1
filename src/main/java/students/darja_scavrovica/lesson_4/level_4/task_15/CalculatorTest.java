package students.darja_scavrovica.lesson_4.level_4.task_15;

 class CalculatorTest {
  public static void main(String[] args) {
 CalculatorTest calculatorTest = new CalculatorTest();
   calculatorTest.ComperingNumbers();
   calculatorTest.ComperingNumbers2();
   calculatorTest.ComperingNumbers3();
   calculatorTest.ComperingNumbers4();
   calculatorTest.ComperingNumbers5();
   calculatorTest.ComperingNumbers6();
   calculatorTest.ComperingNumbers7();
  }


   public void ComperingNumbers() {
    int firstNumber = 9;
    int secondNumber = 4;
    int thirdNumber = 5;
    int expectedResult = 9;
    Calculator calculator = new Calculator();
    int realResult = calculator.ComperingNumbers(firstNumber, secondNumber, thirdNumber);
    if (realResult == expectedResult) {
     System.out.println(" test1 = OK");
    } else {
     System.out.println("test1 = FAIL");
    } }
  public void ComperingNumbers2() {
   int firstNumber = 6;
   int secondNumber = 9;
   int thirdNumber = 5;
   int expectedResult = 9;
   Calculator calculator = new Calculator();
   int realResult = calculator.ComperingNumbers(firstNumber, secondNumber, thirdNumber);
   if (realResult == expectedResult) {
    System.out.println(" test2 = OK");
   } else {
    System.out.println("test2 = FAIL");
   } }
  public void ComperingNumbers3() {
   int firstNumber = 6;
   int secondNumber = 9;
   int thirdNumber = 10;
   int expectedResult = 10;
   Calculator calculator = new Calculator();
   int realResult = calculator.ComperingNumbers(firstNumber, secondNumber, thirdNumber);
   if (realResult == expectedResult) {
    System.out.println(" test3 = OK");
   } else {
    System.out.println("test3 = FAIL");
   } }
  public void ComperingNumbers4() {
   int firstNumber = 6;
   int secondNumber = 6;
   int thirdNumber = 2;
   int expectedResult = 6;
   Calculator calculator = new Calculator();
   int realResult = calculator.ComperingNumbers(firstNumber, secondNumber, thirdNumber);
   if (realResult == expectedResult) {
    System.out.println(" test4 = OK");
   } else {
    System.out.println("test4 = FAIL");
   } }

  public void ComperingNumbers5() {
   int firstNumber = 6;
   int secondNumber = 2;
   int thirdNumber = 6;
   int expectedResult = 6;
   Calculator calculator = new Calculator();
   int realResult = calculator.ComperingNumbers(firstNumber, secondNumber, thirdNumber);
   if (realResult == expectedResult) {
    System.out.println(" test5 = OK");
   } else {
    System.out.println("test5 = FAIL");
   } }
  public void ComperingNumbers6() {
   int firstNumber = 2;
   int secondNumber = 6;
   int thirdNumber = 6;
   int expectedResult = 6;
   Calculator calculator = new Calculator();
   int realResult = calculator.ComperingNumbers(firstNumber, secondNumber, thirdNumber);
   if (realResult == expectedResult) {
    System.out.println(" test6 = OK");
   } else {
    System.out.println("test6 = FAIL");
   } }
  public void ComperingNumbers7() {
   int firstNumber = 6;
   int secondNumber = 6;
   int thirdNumber = 6;
   int expectedResult = 6;
   Calculator calculator = new Calculator();
   int realResult = calculator.ComperingNumbers(firstNumber, secondNumber, thirdNumber);
   if (realResult == expectedResult) {
    System.out.println(" test7 = OK");
   } else {
    System.out.println("test7 = FAIL");
   } }







  }

