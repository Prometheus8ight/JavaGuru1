package students.julija_katukova.lesson_8.level_7.task_32;

class MathOperationTest {
    public static void main(String[] args) {
        MathOperationTest mathOperationTest = new MathOperationTest();
        mathOperationTest.additionTest1();
        mathOperationTest.additionTest2();
        mathOperationTest.subtractionTest1();
        mathOperationTest.subtractionTest2();
        mathOperationTest.multiplicationTest1();
        mathOperationTest.multiplicationTest2();
        mathOperationTest.divisionTest1();
        mathOperationTest.divisionTest2();
    }

    public void additionTest1() {
        Argument arg1 = new Argument(7);
        Argument arg2 = new Argument(2);
        MathOperation addition = new Addition(arg1, arg2);
        double realResult = addition.calculate();
        check(realResult, 9.0, "Addition Test 1");
    }

    public void additionTest2() {
        Argument arg1 = new Argument(-10);
        Argument arg2 = new Argument(-2);
        MathOperation addition = new Addition(arg1, arg2);
        double realResult = addition.calculate();
        check(realResult, -12, "Addition Test 2");
    }

    public void subtractionTest1() {
        Argument arg1 = new Argument(-10);
        Argument arg2 = new Argument(-5);
        MathOperation subtraction = new Subtraction(arg1, arg2);
        double realResult = subtraction.calculate();
        check(realResult, -5, "Subtraction Test 1");
    }

    public void subtractionTest2() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(5);
        MathOperation subtraction = new Subtraction(arg1, arg2);
        double realResult = subtraction.calculate();
        check(realResult, 5, "Subtraction Test 2");
    }

    public void multiplicationTest1() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(-5);
        MathOperation multiplication = new Multiplication(arg1, arg2);
        double realResult = multiplication.calculate();
        check(realResult, -50, "Multiplication Test 1");
    }

    public void multiplicationTest2() {
        Argument arg1 = new Argument(-10);
        Argument arg2 = new Argument(-5);
        MathOperation multiplication = new Multiplication(arg1, arg2);
        double realResult = multiplication.calculate();
        check(realResult, 50, "Multiplication Test 2");
    }

    public void divisionTest1() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(-5);
        MathOperation division = new Division(arg1, arg2);
        double realResult = division.calculate();
        check(realResult, -2, "Division Test 1");
    }

    public void divisionTest2() {
        Argument arg1 = new Argument(-10);
        Argument arg2 = new Argument(-5);
        MathOperation division = new Division(arg1, arg2);
        double realResult = division.calculate();
        check(realResult, 2, "Division Test 2");
    }

    public void check (double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
