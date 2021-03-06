package students.julija_katukova.lesson_7.level_5.task_9;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.test1();
        powerCalculatorTest.test2();
        powerCalculatorTest.test3();
        powerCalculatorTest.test4();
        powerCalculatorTest.test5();
    }

    public void test1() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int realResult = powerCalculator.raiseNumberInPower(2, 8);
        check(realResult, 256, "Test1");
    }

    public void test2() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int realResult = powerCalculator.raiseNumberInPower(0, 5);
        check(realResult, 0, "Test2");
    }

    public void test3() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int realResult = powerCalculator.raiseNumberInPower(14, 0);
        check(realResult, 1, "Test3");
    }

    public void test4() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int realResult = powerCalculator.raiseNumberInPower(-3, 17);
        check(realResult, -129140163, "Test4");
    }

    public void test5() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int realResult = powerCalculator.raiseNumberInPower(-3, -5);
        System.out.println(realResult);
        check(realResult, 0, "Test5");
    }

    public void check(int realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
