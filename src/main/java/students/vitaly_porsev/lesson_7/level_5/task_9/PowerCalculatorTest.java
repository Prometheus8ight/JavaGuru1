package students.vitaly_porsev.lesson_7.level_5.task_9;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest method = new PowerCalculatorTest();
        method.allTests();
    }

    void allTests(){
        PowerCalculatorTest method = new PowerCalculatorTest();
        method.elevate2Test();
        method.elevate3Test();
        method.elevate4Test();
        method.elevate5Test();
        method.elevate6Test();
        method.elevate7Test();
        method.elevate8Test();
        method.elevate9Test();
    }

    void elevate2Test(){
        PowerCalculator method = new PowerCalculator();
        checkResult(512, method.elevate(2,9), "elevate2Test");
    }

    void elevate3Test(){
        PowerCalculator method = new PowerCalculator();
        checkResult(6561, method.elevate(3,8), "elevate3Test");
    }

    void elevate4Test(){
        PowerCalculator method = new PowerCalculator();
        checkResult(16384, method.elevate(4,7), "elevate4Test");
    }

    void elevate5Test(){
        PowerCalculator method = new PowerCalculator();
        checkResult(15625, method.elevate(5,6), "elevate5Test");
    }

    void elevate6Test(){
        PowerCalculator method = new PowerCalculator();
        checkResult(7776, method.elevate(6,5), "elevate6Test");
    }

    void elevate7Test(){
        PowerCalculator method = new PowerCalculator();
        checkResult(2401, method.elevate(7,4), "elevate7Test");
    }

    void elevate8Test(){
        PowerCalculator method = new PowerCalculator();
        checkResult(512, method.elevate(8,3), "elevate8Test");
    }

    void elevate9Test(){
        PowerCalculator method = new PowerCalculator();
        checkResult(81, method.elevate(9,2), "elevate9Test");
    }

    void checkResult(int expectedResult, int realResult, String testName){
        if(expectedResult == realResult){
            System.out.println(testName + " - OK");
        }else{
            System.out.println(" - FALSE");
        }
    }
}