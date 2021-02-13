package students.bogdans_pavlovs.lesson_4.level_4.task_15;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.addTest();
        calculatorTest.subtractTest();
        calculatorTest.divideTest();
        calculatorTest.multiplyTest();
        calculatorTest.isEvenTest();
        calculatorTest.highestOfTwoTest1();
        calculatorTest.highestOfTwoTest2();
        calculatorTest.highestOfTwoTest3();
        calculatorTest.highestOfThreeTest1();
        calculatorTest.highestOfThreeTest2();
        calculatorTest.highestOfThreeTest3();
        calculatorTest.highestOfThreeTest4();
        calculatorTest.highestOfThreeTest5();
        calculatorTest.highestOfThreeTest6();
        calculatorTest.highestOfThreeTest7();
    }

    public void addTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.add(firstNumber, secondNumber);
        if (realResult == expectedResult) {
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

    public void isEvenTest() {
        int yourNumber = 7;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(yourNumber);
        if (realResult == expectedResult) {
            System.out.println("Remainder test = OK");
        } else {
            System.out.println("Remainder test = FAIL");
        }
    }

    public void highestOfTwoTest1(){
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.highestOfTwo(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("Highest of two test 1 = OK");
        } else {
            System.out.println("Highest of two test 1 = FAIL");
        }

    }

    public void highestOfTwoTest2(){
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.highestOfTwo(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("Highest of two test 2 = OK");
        } else {
            System.out.println("Highest of two test 2 = FAIL");
        }

    }

    public void highestOfTwoTest3(){
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.highestOfTwo(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("Highest of two test 3 = OK");
        } else {
            System.out.println("Highest of two test 3 = FAIL");
        }

    }

    public void highestOfThreeTest1(){
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 7;
        int expectedResult = 10;

        Calculator calculator = new Calculator();
        int realResult = calculator.highestOfThree(firstNumber, secondNumber, thirdNumber);
            if (realResult == expectedResult){
                System.out.println("Highest of three test 1 = OK");
            } else {
                System.out.println("Highest of three test 1 = FAIL");
            }

        }

    public void highestOfThreeTest2(){
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 7;
        int expectedResult = 10;

        Calculator calculator = new Calculator();
        int realResult = calculator.highestOfThree(firstNumber, secondNumber, thirdNumber);

            if (realResult == expectedResult){
                System.out.println("Highest of three test 2 = OK");
            } else {
                System.out.println("Highest of three test 2 = FAIL");
            }

    }

    public void highestOfThreeTest3(){
        int firstNumber = 7;
        int secondNumber = 5;
        int thirdNumber = 10;
        int expectedResult = 10;

        Calculator calculator = new Calculator();
        int realResult = calculator.highestOfThree(firstNumber, secondNumber, thirdNumber);

            if (realResult == expectedResult){
                System.out.println("Highest of three test 3 = OK");
            } else {
                System.out.println("Highest of three test 3 = FAIL");
            }

    }

    public void highestOfThreeTest4(){
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 7;
        int expectedResult = 10;

        Calculator calculator = new Calculator();
        int realResult = calculator.highestOfThree(firstNumber, secondNumber, thirdNumber);

            if (realResult == expectedResult){
                System.out.println("Highest of three test 4 = OK");
            } else {
                System.out.println("Highest of three test 4 = FAIL");
            }

    }

    public void highestOfThreeTest5(){
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;

        Calculator calculator = new Calculator();
        int realResult = calculator.highestOfThree(firstNumber, secondNumber, thirdNumber);

            if (realResult == expectedResult){
                System.out.println("Highest of three test 5 = OK");
            } else {
                System.out.println("Highest of three test 5 = FAIL");
            }

    }

    public void highestOfThreeTest6(){
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 10;
        int expectedResult = 10;

        Calculator calculator = new Calculator();
        int realResult = calculator.highestOfThree(firstNumber, secondNumber, thirdNumber);

            if (realResult == expectedResult){
                System.out.println("Highest of three test 6 = OK");
            } else {
                System.out.println("Highest of three test 6 = FAIL");
            }

    }

    public void highestOfThreeTest7(){
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;

        Calculator calculator = new Calculator();
        int realResult = calculator.highestOfThree(firstNumber, secondNumber, thirdNumber);

            if (realResult == expectedResult){
                System.out.println("Highest of three test 7 = OK");
            } else {
                System.out.println("Highest of three test 7 = FAIL");
            }

        }


}

/*
Добавьте в класс CalculatorTest тесты для этого метода.
Тесты должны покрывать следующие тестовые сценарии:
- первое число больше второго и третьего
- второе число больше первого и третьего
- третье число больше первого и второго
- первые два равны и больше третьего
- ...
- три числа равны
По одному тесту на каждый из сценариев!
 */