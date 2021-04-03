package students.vitaly_porsev.lesson_10.level_7.task_28;

public class TemperatureConvertTests {
    public static void main(String[] args) {
        TemperatureConvertTests method = new TemperatureConvertTests();
        method.convertFromFahrenheitToCelsius();
        method.convertFromFahrenheitToKelvin();
        method.convertFromKelvinToFahrenheit();
        method.convertFromKelvinToCelsius();
        method.convertFromCelsiusToFahrenheit();
        method.convertFromCelsiusToKelvin();
    }

    void convertFromFahrenheitToCelsius() {
        ConverterMethods fTC = new ConverterMethods(new CelsiusConverter());
        check(15.555555555555555, fTC.convertFromFahrenheit(60), "convertFromFahrenheitToCelsius");
    }

    void convertFromFahrenheitToKelvin() {
        ConverterMethods fTK = new ConverterMethods(new KelvinConverter());
        check(273.15, fTK.convertFromFahrenheit(32), "convertFromFahrenheitToKelvin");
    }

    void convertFromKelvinToFahrenheit() {
        ConverterMethods kTF = new ConverterMethods(new FahrenheitConverter());
        check(-405.66999999999996, kTF.convertFromKelvin(30), "convertFromKelvinToFahrenheit");
    }

    void convertFromKelvinToCelsius() {
        ConverterMethods kTC = new ConverterMethods(new CelsiusConverter());
        check(-258.15, kTC.convertFromKelvin(15), "convertFromKelvinToCelsius");
    }

    void convertFromCelsiusToFahrenheit() {
        ConverterMethods cTF = new ConverterMethods(new FahrenheitConverter());
        check(68, cTF.convertFromCelsius(20), "convertFromCelsiusToFahrenheit");
    }

    void convertFromCelsiusToKelvin() {
        ConverterMethods cTF = new ConverterMethods(new KelvinConverter());
        check(298.15, cTF.convertFromCelsius(25), "convertFromCelsiusToFahrenheit");
    }

    void check(double expectedResult, double realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
