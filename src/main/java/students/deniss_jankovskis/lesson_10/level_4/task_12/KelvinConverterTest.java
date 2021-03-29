package students.deniss_jankovskis.lesson_10.level_4.task_12;

class KelvinConverterTest {

    public static void main(String[] args) {

        KelvinConverterTest test = new KelvinConverterTest();
        test.kelvinConverterTest1();
        test.kelvinConverterTest2();
    }

    public void kelvinConverterTest1() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double realResult = kelvinConverter.convert(-15);
        checkTestResult(realResult, 258.15, "Kelvin Converter Test 1");
    }

    public void kelvinConverterTest2() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double realResult = kelvinConverter.convert(20);
        checkTestResult(realResult, 293.15, "Kelvin Converter Test 2");
    }

    public void checkTestResult(double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
