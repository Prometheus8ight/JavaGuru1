package students.rodion_afanasjev.lesson_10.level_4.task_11;

class FahrenheitTemperatureTest {

    public static void main(String[] args) {

        FahrenheitTemperatureTest fahrTemp = new FahrenheitTemperatureTest();
        fahrTemp.fahrenheitPlusTest();
        fahrTemp.fahrenheitMinusTest();

    }

    public void fahrenheitPlusTest(){
        FahrenheitTemperature fahr = new FahrenheitTemperature();
        double expectedResult = 86;
        double realResult = fahr.tempConvert(30);
        check(realResult,expectedResult,"fahrenheitPlusTest");
    }

    public void fahrenheitMinusTest(){
        FahrenheitTemperature fahr = new FahrenheitTemperature();
        double expectedResult = 5;
        double realResult = fahr.tempConvert(-15);
        check(realResult,expectedResult,"fahrenheitMinusTest");
    }

    public void check(double realResult, double expectedResult, String testName){
        if (realResult == expectedResult){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}
