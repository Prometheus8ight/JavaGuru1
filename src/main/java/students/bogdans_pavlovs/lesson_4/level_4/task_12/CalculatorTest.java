package students.bogdans_pavlovs.lesson_4.level_4.task_12;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.addTest();
        calculatorTest.subtractTest();
        calculatorTest.divideTest();
        calculatorTest.multiplyTest();
        // по аналогии реализуйте тесты для остальных методов
    }

    public void addTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.add(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Add test = OK");
        } else {
            System.out.println("Add test = FAIL");
        }
    }

    public void subtractTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtract(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtract test = OK");
        } else {
            System.out.println("Subtract test = FAIL");
        }
    }

    public void divideTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }

    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }

}
