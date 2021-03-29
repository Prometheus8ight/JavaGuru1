package students.vitaly_porsev.lesson_10.level_4.task_11;

class WeatherUtilTest {

    public static void main(String[] args) {
        WeatherUtilTest weatherUtilTest = new WeatherUtilTest();
        weatherUtilTest.testFahrenheit();
        weatherUtilTest.testKelvin();
    }

    void testFahrenheit(){
        WeatherUtil weatherUtil = new WeatherUtil();
        checkWeather(77, weatherUtil.turnCelsiusToFahrenheit(25),"testFahrenheit");
    }

    void testKelvin(){
        WeatherUtil weatherUtil = new WeatherUtil();
        checkWeather(308, weatherUtil.turnCelsiusToKelvin(35),"testKelvin");
    }

    void checkWeather(int expectedResult, int realResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - False");
        }
    }
}
