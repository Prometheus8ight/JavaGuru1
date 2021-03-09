package students.deniss_jankovskis.lesson_4.level_4;

class  CalculatorTest {


    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multiTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbers();
        calculatorTest.maxOfThreeNumbers();

    }

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Addition test = OK");
        } else {
            System.out.println("Addition test = FAIL");
        }

    }

    public void subTest() {
        int firstNumber = 25;
        int secondNumber = 8;
        int expectedResult = 17;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    public void multiTest() {
        int firstNumber = 5;
        int secondNumber = 100;
        int expectedResult = 500;
        Calculator calculator = new Calculator();
        int realResult = calculator.multi(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }


    public void divTest() {
        int firstNumber = 85;
        int secondNumber = 5;
        int expectedResult = 17;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }


    public void isEvenTest() {
        int number = 20;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("IsEven test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }
    }


    public void maxOfTwoNumbers() {

        Calculator victim = new Calculator();  //первое число больше второго
        int firstNumber = 15;
        int secondNumber = 5;
        int expectedResult = 15;
        int realResult = victim.maxOfTwoNumbers(firstNumber, secondNumber);
        check(realResult, expectedResult, "maxOfTwoNumbers");


        //второе число больше первого
        firstNumber = 5;
        secondNumber = 15;
        expectedResult = 15;
        realResult = victim.maxOfTwoNumbers(firstNumber, secondNumber);
        check(realResult, expectedResult, "maxOfTwoNumbers");

        //оба числа равны
        firstNumber = 15;
        secondNumber = 15;
        expectedResult = 15;
        realResult = victim.maxOfTwoNumbers(firstNumber, secondNumber);
        check(realResult, expectedResult, "maxOfTwoNumbers");

    }


    public void maxOfThreeNumbers() {

        Calculator victim = new Calculator();  //первое число больше второго и третьего
        int firstNumber = 15;
        int secondNumber = 7;
        int thirdNumber = 5;
        int expectedResult = 15;
        int realResult = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult, expectedResult, "maxOfThreeNumbers");


        //второе число больше первого и третьего
        firstNumber = 7;
        secondNumber = 15;
        thirdNumber = 5;
        expectedResult = 15;
        realResult = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult, expectedResult, "maxOfThreeNumbers");


        //третье число больше первого и второго
        firstNumber = 5;
        secondNumber = 7;
        thirdNumber = 15;
        expectedResult = 15;
        realResult = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult, expectedResult, "maxOfThreeNumbers");


        //первое и второе больше третьего
        firstNumber = 15;
        secondNumber = 15;
        thirdNumber = 7;
        expectedResult = 15;
        realResult = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult, expectedResult, "maxOfThreeNumbers");


        //первое и третье больше второго
        firstNumber = 15;
        secondNumber = 7;
        thirdNumber = 15;
        expectedResult = 15;
        realResult = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult, expectedResult, "maxOfThreeNumbers");


        //второе и третье больше первого
        firstNumber = 7;
        secondNumber = 15;
        thirdNumber = 15;
        expectedResult = 15;
        realResult = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult, expectedResult, "maxOfThreeNumbers");


        //первое больше второго и третьего
        firstNumber = 15;
        secondNumber = 7;
        thirdNumber = 5;
        expectedResult = 15;
        realResult = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult, expectedResult, "maxOfThreeNumbers");


        //второе больше первого и третьего
        firstNumber = 5;
        secondNumber = 15;
        thirdNumber = 7;
        expectedResult = 15;
        realResult = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult, expectedResult, "maxOfThreeNumbers");


        //третье больше первого и второго
        firstNumber = 5;
        secondNumber = 7;
        thirdNumber = 15;
        expectedResult = 15;
        realResult = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult, expectedResult, "maxOfThreeNumbers");


        //все числа равны
        firstNumber = 15;
        secondNumber = 15;
        thirdNumber = 15;
        expectedResult = 15;
        realResult = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(realResult, expectedResult, "maxOfThreeNumbers");

    }


        public void check(int realResult, int expectedResult, String testName) {
            if (realResult == expectedResult) {
                System.out.println(testName + " has passed!");
            } else {
                System.out.println(testName + " has failed!");
                System.out.println("Expected " + expectedResult + " but was " + realResult);
            }
        }



}


