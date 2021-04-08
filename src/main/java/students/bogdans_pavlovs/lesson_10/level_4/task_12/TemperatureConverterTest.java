package students.bogdans_pavlovs.lesson_10.level_4.task_12;

class TemperatureConverterTest {

    public static void main(String[] args) {

        TemperatureConverterTest test = new TemperatureConverterTest();

        test.toFahrenheitTest();
        test.toKelvinTest();

    }


    void toFahrenheitTest(){
        FahrenheitConverter toFahrenheit = new FahrenheitConverter();

        double realResult = toFahrenheit.convert(80);
        checkResult(realResult, 180, "Fahrenheit Converter Test");

    }

    void toKelvinTest(){
        KelvinConverter toKelvin = new KelvinConverter();
        double realResult = toKelvin.convert(26.85);
        checkResult(realResult, 300, "Kelvin Converter Test" );
    }

    void checkResult(double realResult, double expectedResult, String testName){

        if (realResult == expectedResult) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }

    }

}
