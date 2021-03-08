package students.bogdans_pavlovs.lesson_7.level_5.task_9;

public class PowerCalculatorTest {

    public static void main(String[] args) {

        PowerCalculatorTest test = new PowerCalculatorTest();

        test.positiveTest();
        test.negativeTest();
        test.zeroTest();
    }

    public void positiveTest (){
        PowerCalculator powerCalculator = new PowerCalculator();
        int realResult = powerCalculator.exponentiate(2, 10);
        int expectedResult = 1024;
        check(realResult, expectedResult, "Positive Test");


    }

    public void negativeTest (){
        PowerCalculator powerCalculator = new PowerCalculator();
        int realResult = powerCalculator.exponentiate(-6, 5);
        int expectedResult = -7776;
        check(realResult, expectedResult, "Negative Test");
    }

    public void zeroTest (){
        PowerCalculator powerCalculator = new PowerCalculator();
        int realResult = powerCalculator.exponentiate(6969, 0);
        int expectedResult = 1;
        check(realResult, expectedResult, "Zero Test");
    }


    public void check (int realResult, int expectedResult, String testName){

        if (realResult == expectedResult){

            System.out.println(testName + " = OK!");

        } else {

            System.out.println(testName + " = FAIL!");

        }
    }
}
