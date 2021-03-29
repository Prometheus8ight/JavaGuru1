package students.andrew_galashin.lesson_4.level_4.task_14;



class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.mulTest();
        calculatorTest.isEvenTest();
        calculatorTest.highestOfTwoTest1();
        calculatorTest.highestOfTwoTest2();
        calculatorTest.highestOfTwoTest3();

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
            System.out.println("Sub test is OK");
        } else {
            System.out.println("Sub test FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test is OK");
        } else {
            System.out.println("Mul test FAIL");
        }


    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test is OK");
        } else {
            System.out.println("Div test FAIL");
        }
    }

    public void isEvenTest() {
        int yourNumber = 7;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(yourNumber);
        if (realResult == expectedResult) {
            System.out.println("Even test is OK");
        } else {
            System.out.println("Even test FAIL");
        }
    }

    public void highestOfTwoTest1() {
        int firstNumber = 20;
        int secondNumber = 10;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.highestOfTwo(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Highest of two test 1 is OK");
        } else {
            System.out.println("Highest of two test 1 FAIL");
        }

    }

    public void highestOfTwoTest2() {
        int firstNumber = 10;
        int secondNumber = 20;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.highestOfTwo(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Highest of two test 2 is OK");
        } else {
            System.out.println("Highest of two test 2 FAIL");
        }

    }

    public void highestOfTwoTest3() {
        int firstNumber = 20;
        int secondNumber = 20;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.highestOfTwo(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Highest of two test 3 is OK");
        } else {
            System.out.println("Highest of two test 3 FAIL");
        }
    }
}
