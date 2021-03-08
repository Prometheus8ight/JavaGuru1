package students.deniss_jankovskis.lesson_7.level_5;

class PowerCalculatorTest {

    public static void main(String[] args) {

        PowerCalculatorTest test = new PowerCalculatorTest();
        test.powerCalculatorTest1();
        test.powerCalculatorTest2();
        test.powerCalculatorTest3();
        test.powerCalculatorTest4();
        test.powerCalculatorTest5();
        test.powerCalculatorTest6();
        test.powerCalculatorTest7();
    }


    public void powerCalculatorTest1() {
        PowerCalculator calculator = new PowerCalculator();
        checkTestResult(16, calculator.power(2, 4), "PowerCalculator Test1");
    }

    public void powerCalculatorTest2() {
        PowerCalculator calculator = new PowerCalculator();
        checkTestResult(243, calculator.power(3, 5), "PowerCalculator Test2");
    }

    public void powerCalculatorTest3() {
        PowerCalculator calculator = new PowerCalculator();
        checkTestResult(1024, calculator.power(4, 5), "PowerCalculator Test3");
    }

    public void powerCalculatorTest4() {
        PowerCalculator calculator = new PowerCalculator();
        checkTestResult(15625, calculator.power(5, 6), "PowerCalculator Test4");
    }

    public void powerCalculatorTest5() {
        PowerCalculator calculator = new PowerCalculator();
        checkTestResult(46656, calculator.power(6, 6), "PowerCalculator Test5");
    }

    public void powerCalculatorTest6() {
        PowerCalculator calculator = new PowerCalculator();
        checkTestResult(343, calculator.power(7, 3), "PowerCalculator Test6");
    }

    public void powerCalculatorTest7() {
        PowerCalculator calculator = new PowerCalculator();
        checkTestResult(4096, calculator.power(8, 4), "PowerCalculator Test7");
    }


    public void checkTestResult(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - has passed");
        } else {
            System.out.println(" - has failed");
        }
    }
}

