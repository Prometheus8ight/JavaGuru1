package students.rodion_afanasjev.lesson_8.level_7.task_32;

class MathOperationTest {

    public static void main(String[] args) {

        MathOperationTest test = new MathOperationTest();
        test.addTest();
        test.subTest();
        test.multiplyTest();
        test.divideTest();
        test.complicatedMultiplyTest();
        test.complicatedDivideTest();

    }

    public void addTest(){
        Argument num1 = new Argument(4); // первое число
        Argument num2 = new Argument(4); // второе число
        double expectedResult = 8; // ожидаемый результат
        MathOperation addition = new Addition(num1, num2); // Новый объект на сложение
        double realResult = addition.calculate(); // реальный результат сложения
        equalCheck(realResult,expectedResult,"addTest"); // сравнение
    }

    public void subTest(){
        Argument num1 = new Argument(8);
        Argument num2 = new Argument(4);
        double expectedResult = 4;
        MathOperation subtraction = new Subtraction(num1, num2);
        double realResult = subtraction.calculate();
        equalCheck(realResult,expectedResult,"subTest");
    }

    public void multiplyTest(){
        Argument num1 = new Argument(4);
        Argument num2 = new Argument(4);
        double expectedResult = 16;
        MathOperation multiplication = new Multiplication(num1, num2);
        double realResult = multiplication.calculate();
        equalCheck(realResult,expectedResult,"multiplyTest");
    }

    public void divideTest(){
        Argument num1 = new Argument(8);
        Argument num2 = new Argument(4);
        double expectedResult = 2;
        MathOperation divide = new Divide(num1, num2);
        double realResult = divide.calculate();
        equalCheck(realResult,expectedResult,"divideTest");
    }

    public void complicatedMultiplyTest(){
        Argument num1 = new Argument(8);
        Argument num2 = new Argument(4);
        MathOperation sub = new Subtraction(num1, num2);
        MathOperation divide = new Divide(num1, num2);
        MathOperation multiply = new Multiplication(sub, divide);
        double expectedResult = 8;
        double realResult = multiply.calculate();
        equalCheck(realResult,expectedResult,"complicatedMultiplyTest");

    }

    public void complicatedDivideTest(){
        Argument num1 = new Argument(8);
        Argument num2 = new Argument(4);
        MathOperation sub = new Subtraction(num1, num2);
        MathOperation divide = new Divide(num1, num2);
        MathOperation divide1 = new Divide(sub, divide);
        double expectedResult = 2;
        double realResult = divide1.calculate();
        equalCheck(realResult,expectedResult,"complicatedDivideTest");

    }

    public void equalCheck(double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }

    }
}
