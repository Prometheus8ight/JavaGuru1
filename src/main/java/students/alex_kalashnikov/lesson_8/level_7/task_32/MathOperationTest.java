package students.alex_kalashnikov.lesson_8.level_7.task_32;

class MathOperationTest {

    public static void main(String[] args) {

        MathOperationTest newObject = new MathOperationTest();
        newObject.testAddition();

    }

    void test(double expectedResult, double realResult) {

        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testAddition() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(5);
        Argument arg3 = new Argument(20);
        Argument arg4 = new Argument(5);
        double expectedResult = (10 - 5) * (20 / 5);
        MathOperation subtraction = new Subtraction(arg1, arg2);
        MathOperation division = new Division(arg3, arg4);
        MathOperation multiplication = new Multiplication(subtraction, division);
        double realResult = multiplication.calculate();
        test(expectedResult, realResult);
    }

}