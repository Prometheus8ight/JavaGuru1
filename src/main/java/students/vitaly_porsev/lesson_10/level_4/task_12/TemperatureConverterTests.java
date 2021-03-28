package students.vitaly_porsev.lesson_10.level_4.task_12;

public class TemperatureConverterTests {

    public static void main(String[] args) {
        TemperatureConverterTests temperatureConverterTests = new TemperatureConverterTests();
        temperatureConverterTests.testFahrenheit();
        temperatureConverterTests.testKelvin();
    }

    void testFahrenheit() {
        TemperatureConverter temperatureConverter = new CelsiusConverter();
        checkWeather(77.0, temperatureConverter.convert(25), "testFahrenheit");
    }

    void testKelvin() {
        TemperatureConverter temperatureConverter = new KelvinConverter();
        checkWeather(308.15, temperatureConverter.convert(35), "testKelvin");
    }

    private void checkWeather(double expectedResult, double realResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - False");
        }
    }
}
