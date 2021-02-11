package students.vitaly_porsev.lesson_4.level_4.task_12;

public class CalculatorTest {

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

    public void subtract() {
        int firstNumber = 100;
        int secondNumber = 45;
        int expectedNumber = 55;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtract(firstNumber, secondNumber);
        if (realResult == expectedNumber) {
            System.out.println("Subtract test = OK");
        } else {
            System.out.println("Subtract test = FAIL");
        }
    }

    public void multiply() {
        int a = 25;
        int b = 4;
        int expectedNumber = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(a, b);
        if (realResult == expectedNumber) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }

    public void divide() {
        int a = 100;
        int b = 4;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(a, b);
        if (realResult == expectedResult) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }

}
