package students.darja_scavrovica.lesson_4.level_4.task_11_12_13;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
      calculatorTest.sumTest();
      calculatorTest.subTest();
      calculatorTest.divTest();
      calculatorTest.multiplyTest();
      calculatorTest.isEvenTest();
    }

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }
    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("div test = OK");
        } else {
            System.out.println("div test = FAIL");
        }
    }
    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("multiply test = OK");
        } else {
            System.out.println("multiply test = FAIL");
        }
    }
    public void isEvenTest() {
        int number = 1;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("Even Test = TRUE");
        } else {
            System.out.println("Even Test = FALSE");
        }
    }
}