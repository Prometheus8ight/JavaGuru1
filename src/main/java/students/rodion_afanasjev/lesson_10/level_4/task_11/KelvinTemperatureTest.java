package students.rodion_afanasjev.lesson_10.level_4.task_11;

class KelvinTemperatureTest {

    public static void main(String[] args) {

        KelvinTemperatureTest tempTest = new KelvinTemperatureTest();
        tempTest.kelvinPlusTest();
        tempTest.kelvinMinusTest();

    }

    public void kelvinPlusTest(){
        KelvinTemperature kelv = new KelvinTemperature();
        double expectedResult = 283.15;
        double realResult = kelv.tempConvert(10);
        check(realResult,expectedResult,"kelvinPlusTest");
    }

    public void kelvinMinusTest(){
        KelvinTemperature kelv = new KelvinTemperature();
        double expectedResult = 263.15;
        double realResult = kelv.tempConvert(-10);
        check(realResult,expectedResult,"kelvinMinusTest");
    }

    public void check(double realResult, double expectedResult, String testName){
        if (realResult == expectedResult){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}
