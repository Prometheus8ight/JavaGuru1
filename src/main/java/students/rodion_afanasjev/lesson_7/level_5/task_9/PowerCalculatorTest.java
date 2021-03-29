package students.rodion_afanasjev.lesson_7.level_5.task_9;

class PowerCalculatorTest {

    public static void main(String[] args) {

        PowerCalculator powerCalculator = new PowerCalculator();
        double number = powerCalculator.input();
        double power = powerCalculator.input();
        System.out.println("Answer is: " + powerCalculator.calcPower(number,power));

        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.calcPowerTrueTest();
        powerCalculatorTest.calcPowerFalseTest();
        powerCalculatorTest.calcPowerZeroTest();
        powerCalculatorTest.calcNegativePowerTest();

    }

    void calcPowerTrueTest(){
        PowerCalculator powerCalculator = new PowerCalculator();
        double number = 3;
        double power = 4;
        double expectedResult = 81;
        double realResult = powerCalculator.calcPower(number,power);
        equalCheck(realResult,expectedResult,"calcPowerTrueTest");
    }

    void calcPowerFalseTest(){
        PowerCalculator powerCalculator = new PowerCalculator();
        double number = 3;
        double power = 4;
        double expectedResult = 71;
        double realResult = powerCalculator.calcPower(number,power);
        notEqualCheck(realResult,expectedResult,"calcPowerFalseTest");
    }

    void calcPowerZeroTest(){
        PowerCalculator powerCalculator = new PowerCalculator();
        double number = 3;
        double power = 0;
        double expectedResult = 1;
        double realResult = powerCalculator.calcPower(number,power);
        equalCheck(realResult,expectedResult,"calcPowerZeroTest");
    }

    void calcNegativePowerTest(){
        PowerCalculator powerCalculator = new PowerCalculator();
        double number = 2;
        double power = -2;
        double expectedResult = 0.25;
        double realResult = powerCalculator.calcPower(number,power);
        equalCheck(realResult,expectedResult,"calcNegativePowerTest");
    }

    void equalCheck(double realResult,double expectedResult,String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " :FAIL");
        }
    }

    void notEqualCheck(double realResult,double expectedResult,String testName) {
        if (realResult != expectedResult) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " :FAIL");
        }
    }
}
