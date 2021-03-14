package students.alex_kalashnikov.lesson_7.level_5.task_9;

class PowerCalculatorTest {

    public static void main(String[] args) {

        PowerCalculatorTest newTest = new PowerCalculatorTest();
        newTest.testPositivePower();
        newTest.testNegativePower();
        newTest.testZeroPower();
        newTest.testNegativeNumberPositivePower();
        newTest.testNegativeNumberNegativePower();
        newTest.testFractionalNumber();

    }

    public void test(double number, int power, double expected) {
        PowerCalculator newPowerCalculator = new PowerCalculator();
        double real = newPowerCalculator.raiseToThePower(number, power);
        if (expected == real) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    public void testPositivePower() {
        test(3.0, 2, 9);
    }

    public void testNegativePower() {
        test(2.0, -3, 0.125);
    }

    public void testZeroPower() {
        test(1 - 247 - 134, 0, 1);
    }

    public void testNegativeNumberPositivePower() {
        test(-2.0, 3, -8);
    }

    public void testNegativeNumberNegativePower() {
        test(-2, -3, -0.125);
    }

    public void testFractionalNumber() {
        test(2.5, 2, 6.25);
    }

}