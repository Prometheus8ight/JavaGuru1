package students.andrew_galashin.task_32;

class MathOperationTest {

    public static void main(String[] args) {
        MathOperationTest start = new MathOperationTest();
        start.additionTest1();
        start.additionTest2();
        start.additionTest3();
        start.divisionTest1();
        start.divisionTest2();
        start.divisionTest3();
        start.multiplicationTest1();
        start.multiplicationTest2();
        start.multiplicationTest3();
        start.subtractionTest1();
        start.subtractionTest2();
        start.subtractionTest3();
    }

    void subtractionTest1() {
        Argument ar1 = new Argument(50);
        Argument ar2 = new Argument(20);
        MathOperation substraction = new Subtraction(ar1, ar2);
        double result = substraction.calculate();
        check(result, 30, "SubtractionTest 1");
    }

    void subtractionTest2() {
        Argument ar1 = new Argument(-50);
        Argument ar2 = new Argument(-20);
        MathOperation subtraction = new Subtraction(ar1, ar2);
        double result = subtraction.calculate();
        check(result, -30, "SubtractionTest 2");
    }

    void subtractionTest3() {
        Argument ar1 = new Argument(50);
        Argument ar2 = new Argument(-20);
        MathOperation subtraction = new Multiplication(ar1, ar2);
        double result = subtraction.calculate();
        check(result, 70, "SubtractionTest 3");
    }

    void multiplicationTest1() {
        Argument ar1 = new Argument(5);
        Argument ar2 = new Argument(2);
        MathOperation multiplication = new Multiplication(ar1, ar2);
        double result = multiplication.calculate();
        check(result, 10, "MultiplicationTest 1");
    }

    void multiplicationTest2() {
        Argument ar1 = new Argument(5);
        Argument ar2 = new Argument(-2);
        MathOperation multiplication = new Multiplication(ar1, ar2);
        double result = multiplication.calculate();
        check(result, -10, "MultiplicationTest 2");
    }

    void multiplicationTest3() {
        Argument ar1 = new Argument(-5);
        Argument ar2 = new Argument(-2);
        MathOperation multiplication = new Multiplication(ar1, ar2);
        double result = multiplication.calculate();
        check(result, 10, "MultiplicationTest 3");
    }

    void divisionTest1() {
        Argument ar1 = new Argument(10);
        Argument ar2 = new Argument(2);
        MathOperation division = new Division(ar1, ar2);
        double result = division.calculate();
        check(result, 5, "DivisionTest 1");
    }

    void divisionTest2() {
        Argument ar1 = new Argument(10);
        Argument ar2 = new Argument(-2);
        MathOperation division = new Division(ar1, ar2);
        double result = division.calculate();
        check(result, -5, "DivisionTest 2");
    }

    void divisionTest3() {
        Argument ar1 = new Argument(-10);
        Argument ar2 = new Argument(-2);
        MathOperation division = new Division(ar1, ar2);
        double result = division.calculate();
        check(result, 5, "DivisionTest 3");
    }

    void additionTest1() {
        Argument ar1 = new Argument(8);
        Argument ar2 = new Argument(2);
        MathOperation addition = new Addition(ar1, ar2);
        double result = addition.calculate();
        check(result, 10, "AdditionTest 1");
    }

    void additionTest2() {
        Argument ar1 = new Argument(8);
        Argument ar2 = new Argument(-2);
        MathOperation addition = new Addition(ar1, ar2);
        double result = addition.calculate();
        check(result, 6, "AdditionTest 2");
    }

    void additionTest3() {
        Argument ar1 = new Argument(-8);
        Argument ar2 = new Argument(-2);
        MathOperation addition = new Addition(ar1, ar2);
        double result = addition.calculate();
        check(result, -10, "AdditionTest 3");
    }

    void check(double result, double expected, String testName) {
        if (result == expected) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
