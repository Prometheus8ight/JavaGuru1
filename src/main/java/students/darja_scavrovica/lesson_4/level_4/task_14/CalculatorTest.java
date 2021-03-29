package students.darja_scavrovica.lesson_4.level_4.task_14;


class CalculatorTest {

 public static void main(String[] args) {
  CalculatorTest calculatorTest = new CalculatorTest();
  calculatorTest.maxFirstNumber();
  calculatorTest.maxSecondNumber();
  calculatorTest.NumberAreEqual();
 }

 public void maxFirstNumber() {
  int firstNumber = 10;
  int secondNumber = 5;
  int expectedResult = 10;
  Calculator calculator = new Calculator();
  int realResult = calculator.maxFirstNumber(firstNumber, secondNumber);
  if (realResult == expectedResult) {
   System.out.println("maxFirstNumber test = OK");
  } else {
   System.out.println("maxSecondNumber = FAIL");
  }}


 public void maxSecondNumber() {
  int firstNumber = 5;
  int secondNumber = 10;
  int expectedResult =10;
  Calculator calculator = new Calculator();
  int realResult = calculator.maxFirstNumber(firstNumber, secondNumber);
  if (realResult == expectedResult) {
   System.out.println("maxSecondNumber test = OK");
  } else {
   System.out.println("maxFirstNumber = FAIL");
  }}
 public void NumberAreEqual() {
  int firstNumber = 10;
  int secondNumber = 10;
  int expectedResult = 10;
  Calculator calculator = new Calculator();
  int realResult = calculator.maxFirstNumber(firstNumber, secondNumber);
  if (realResult == expectedResult) {
   System.out.println("NumberAreEqual test = OK");
  } else {
   System.out.println("NumberAreEqual = FAIL");
  }}
}
