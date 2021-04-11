package students.alex_kalashnikov.lesson_10.level_7.task_28;

import java.util.Arrays;

class TemperatureConverterTest {

    public static void main(String[] args) {

        TemperatureConverterTest victim = new TemperatureConverterTest();
        victim.testConvertCelsius();
        victim.testConvertCelsius1();
        victim.testConvertCelsius2();
        victim.testConvertKelvin();
        victim.testConvertKelvin1();
        victim.testConvertFahrenheit();
        victim.testConvertFahrenheit1();
        victim.testConvertFahrenheit2();

    }

    void test(double[] expectedResult, double[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testConvertCelsius() {
        Strategy newStrategy = new Strategy(new Celsius());
        double[] expectedResult = {0, 273.15, 32};
        double[] realResult = new double[3];
        realResult[0] = newStrategy.executeConvertToCelsius(0);
        realResult[1] = newStrategy.executeConvertToKelvin(0);
        realResult[2] = newStrategy.executeConvertToFahrenheit(0);
        test(expectedResult, realResult);
    }

    void testConvertCelsius1() {
        Strategy newStrategy = new Strategy(new Celsius());
        double[] expectedResult = {-273.15, 0, -459.66999999999996};
        double[] realResult = new double[3];
        realResult[0] = newStrategy.executeConvertToCelsius(-273.15);
        realResult[1] = newStrategy.executeConvertToKelvin(-273.15);
        realResult[2] = newStrategy.executeConvertToFahrenheit(-273.15);
        test(expectedResult, realResult);
    }

    void testConvertCelsius2() {
        Strategy newStrategy = new Strategy(new Celsius());
        double[] expectedResult = {6000, 6273.15, 10832};
        double[] realResult = new double[3];
        realResult[0] = newStrategy.executeConvertToCelsius(6000);
        realResult[1] = newStrategy.executeConvertToKelvin(6000);
        realResult[2] = newStrategy.executeConvertToFahrenheit(6000);
        test(expectedResult, realResult);
    }

    void testConvertKelvin() {
        Strategy newStrategy = new Strategy(new Kelvin());
        double[] expectedResult = {-273.15, 0, -459.66999999999996};
        double[] realResult = new double[3];
        realResult[0] = newStrategy.executeConvertToCelsius(0);
        realResult[1] = newStrategy.executeConvertToKelvin(0);
        realResult[2] = newStrategy.executeConvertToFahrenheit(0);
        test(expectedResult, realResult);
    }

    void testConvertKelvin1() {
        Strategy newStrategy = new Strategy(new Kelvin());
        double[] expectedResult = {5726.85, 6000, 10340.330000000002};
        double[] realResult = new double[3];
        realResult[0] = newStrategy.executeConvertToCelsius(6000);
        realResult[1] = newStrategy.executeConvertToKelvin(6000);
        realResult[2] = newStrategy.executeConvertToFahrenheit(6000);
        test(expectedResult, realResult);
    }

    void testConvertFahrenheit() {
        Strategy newStrategy = new Strategy(new Fahrenheit());
        double[] expectedResult = {-17.77777777777778, 255.3722222222222, 0};
        double[] realResult = new double[3];
        realResult[0] = newStrategy.executeConvertToCelsius(0);
        realResult[1] = newStrategy.executeConvertToKelvin(0);
        realResult[2] = newStrategy.executeConvertToFahrenheit(0);
        test(expectedResult, realResult);
    }

    void testConvertFahrenheit1() {
        Strategy newStrategy = new Strategy(new Fahrenheit());
        double[] expectedResult = {-240, 33.14999999999998, -400};
        double[] realResult = new double[3];
        realResult[0] = newStrategy.executeConvertToCelsius(-400);
        realResult[1] = newStrategy.executeConvertToKelvin(-400);
        realResult[2] = newStrategy.executeConvertToFahrenheit(-400);
        test(expectedResult, realResult);
    }

    void testConvertFahrenheit2() {
        Strategy newStrategy = new Strategy(new Fahrenheit());
        double[] expectedResult = {260, 533.15, 500};
        double[] realResult = new double[3];
        realResult[0] = newStrategy.executeConvertToCelsius(500);
        realResult[1] = newStrategy.executeConvertToKelvin(500);
        realResult[2] = newStrategy.executeConvertToFahrenheit(500);
        test(expectedResult, realResult);
    }

}