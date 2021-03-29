package students.deniss_jankovskis.lesson_10.level_4.task_12;

class FahrenheitConverterTest {

    public static void main(String[] args) {

        FahrenheitConverterTest test = new FahrenheitConverterTest();
        test.fahrenheitConverterTest1();
        test.fahrenheitConverterTest2();
    }

    public void fahrenheitConverterTest1() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double realResult = fahrenheitConverter.convert(-15);
        checkTestResult(realResult, 5, "Fahrenheit Converter Test 1");
    }

    public void fahrenheitConverterTest2() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double realResult = fahrenheitConverter.convert(20);
        checkTestResult(realResult, 68, "Fahrenheit Converter Test 2");
    }

    public void checkTestResult(double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
