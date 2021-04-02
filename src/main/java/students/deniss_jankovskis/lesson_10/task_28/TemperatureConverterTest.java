package students.deniss_jankovskis.lesson_10.task_28;

class TemperatureConverterTest {

    public static void main(String[] args) {

        TemperatureConverterTest test = new TemperatureConverterTest();
        test.celsiusToFahrenheitConverter();
        test.celsiusToKelvinConverter();
        test.fahrenheitToCelsiusConverter();
        test.fahrenheitToKelvinConverter();
        test.kelvinToCelsiusConverter();
        test.kelvinToFahrenheitConverter();
    }

    public void celsiusToFahrenheitConverter() {
        Methods methods = new Methods(new FahrenheitConverter());
        double realResult = methods.convertCelsius(20);
        checkTestResult(realResult, 68, "Celsius To FahrenheitConverter Test");
    }

    public void celsiusToKelvinConverter() {
        Methods methods = new Methods(new KelvinConverter());
        double realResult = methods.convertCelsius(15);
        checkTestResult(realResult, 288.15, "Celsius To Kelvin Converter Test");
    }

    public void fahrenheitToCelsiusConverter() {
        Methods methods = new Methods(new CelsiusConverter());
        double realResult = methods.convertFahrenheit(74);
        checkTestResult(realResult, 23.3333, "Fahrenheit To Celsius Converter Test");
    }

    public void fahrenheitToKelvinConverter() {
        Methods methods = new Methods(new KelvinConverter());
        double realResult = methods.convertFahrenheit(65);
        checkTestResult(realResult, 291.483, "Fahrenheit To Kelvin Converter Test");
    }

    public void kelvinToCelsiusConverter() {
        Methods methods = new Methods(new CelsiusConverter());
        double realResult = methods.convertKelvin(250);
        checkTestResult(realResult, -23.15, "Kelvin To Celsius Converter Test");
    }

    public void kelvinToFahrenheitConverter() {
        Methods methods = new Methods(new FahrenheitConverter());
        double realResult = methods.convertKelvin(300);
        checkTestResult(realResult, 80.33, "Kelvin To Fahrenheit Converter Test");
    }

    public void checkTestResult(double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
