package students.deniss_jankovskis.lesson_8.level_7.task_32;

class MathOperationTest {

    public static void main(String[] args) {

        MathOperationTest test = new MathOperationTest();
        test.additionTest();
        test.subtractionTest();
        test.multiplicationTest();
        test.divisionTest();
    }

    public void additionTest() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(20);
        MathOperation addition = new Addition(arg1, arg2);
        double realResult = addition.calculate();
        checkTestResult(realResult, 30, "Addition Test");
    }

    public void subtractionTest() {
        Argument arg3 = new Argument(20);
        Argument arg4 = new Argument(10);
        MathOperation subtraction = new Subtraction(arg3, arg4);
        double realResult = subtraction.calculate();
        checkTestResult(realResult, 10, "Subtraction Test");
    }

    public void multiplicationTest() {
        Argument arg5 = new Argument(20);
        Argument arg6 = new Argument(5);
        MathOperation multiplication = new Multiplication(arg5, arg6);
        double realResult = multiplication.calculate();
        checkTestResult(realResult, 100, "Multiplication Test");
    }

    public void divisionTest() {
        Argument arg7 = new Argument(20);
        Argument arg8 = new Argument(5);
        MathOperation division = new Division(arg7, arg8);
        double realResult = division.calculate();
        checkTestResult(realResult, 4, "Division Test");
    }


    public void checkTestResult(double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
