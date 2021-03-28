package students.julija_katukova.lesson_10.level_4.task_12;

class FahrenheitConverterTest {
    public static void main(String[] args) {
        FahrenheitConverterTest fahrenheitConverterTest = new FahrenheitConverterTest();
        fahrenheitConverterTest.test1();
        fahrenheitConverterTest.test2();
    }

    public void test1() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double realResult = fahrenheitConverter.convert(20.1);
        check(realResult, 68.18, "Test1");
    }

    public void test2() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double realResult = fahrenheitConverter.convert(-10);
        check(realResult, 14, "Test2");
    }

    public void check(double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
