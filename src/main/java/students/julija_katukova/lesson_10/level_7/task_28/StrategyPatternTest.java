package students.julija_katukova.lesson_10.level_7.task_28;

class StrategyPatternTest {
    public static void main(String[] args) {
        StrategyPatternTest strategyPatternTest = new StrategyPatternTest();
        strategyPatternTest.convertCelsiusToFahrenheit1();
        strategyPatternTest.convertCelsiusToFahrenheit2();
        strategyPatternTest.convertCelsiusToKelvin1();
        strategyPatternTest.convertCelsiusToKelvin2();
        strategyPatternTest.convertFahrenheitToCelsius1();
        strategyPatternTest.convertFahrenheitToCelsius2();
        strategyPatternTest.convertFahrenheitToKelvin1();
        strategyPatternTest.convertFahrenheitToKelvin2();
        strategyPatternTest.convertKelvinToFahrenheit1();
        strategyPatternTest.convertKelvinToFahrenheit2();
        strategyPatternTest.convertKelvinToCelsius1();
        strategyPatternTest.convertKelvinToCelsius2();
    }

    private void convertCelsiusToFahrenheit1() {
        Context context = new Context(new FahrenheitConverter());
        double realResult = context.convertCelsius(15.4);
        check(realResult, 59.72, "Convert Celsius To Fahrenheit Test1");
    }

    private void convertCelsiusToFahrenheit2() {
        Context context = new Context(new FahrenheitConverter());
        double realResult = context.convertCelsius(-15.1);
        check(realResult, 4.82, "Convert Celsius To Fahrenheit Test2");
    }

    private void convertCelsiusToKelvin1() {
        Context context = new Context(new KelvinConverter());
        double realResult = context.convertCelsius(10.6);
        check(realResult, 283.75, "Convert Celsius To Kelvin Test1");
    }

    private void convertCelsiusToKelvin2() {
        Context context = new Context(new KelvinConverter());
        double realResult = context.convertCelsius(-10.5);
        check(realResult, 262.65, "Convert Celsius To Kelvin Test2");
    }

    private void convertFahrenheitToCelsius1() {
        Context context = new Context(new CelsiusConverter());
        double realResult = context.convertFahrenheit(59);
        check(realResult, 15, "Convert Fahrenheit To Celsius Test1");
    }

    private void convertFahrenheitToCelsius2() {
        Context context = new Context(new CelsiusConverter());
        double realResult = context.convertFahrenheit(-4);
        check(realResult, -20, "Convert Fahrenheit To Celsius Test2");
    }

    private void convertFahrenheitToKelvin1() {
        Context context = new Context(new KelvinConverter());
        double realResult = context.convertFahrenheit(5);
        check(realResult, 258.15, "Convert Fahrenheit To Kelvin Test1");
    }

    private void convertFahrenheitToKelvin2() {
        Context context = new Context(new KelvinConverter());
        double realResult = context.convertFahrenheit(-31);
        check(realResult, 238.14999999999998, "Convert Fahrenheit To Kelvin Test2");
    }

    private void convertKelvinToFahrenheit1() {
        Context context = new Context(new FahrenheitConverter());
        double realResult = context.convertKelvin(100);
        check(realResult, -279.67, "Convert Kelvin To Fahrenheit Test1");
    }

    private void convertKelvinToFahrenheit2() {
        Context context = new Context(new FahrenheitConverter());
        double realResult = context.convertKelvin(-10);
        check(realResult, -477.67, "Convert Kelvin To Fahrenheit Test2");
    }

    private void convertKelvinToCelsius1() {
        Context context = new Context(new CelsiusConverter());
        double realResult = context.convertKelvin(41);
        check(realResult, -232.14999999999998, "Convert Kelvin To Celsius Test1");
    }

    private void convertKelvinToCelsius2() {
        Context context = new Context(new CelsiusConverter());
        double realResult = context.convertKelvin(-12);
        check(realResult, -285.15, "Convert Kelvin To Celsius Test2");
    }

    private void check(double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
