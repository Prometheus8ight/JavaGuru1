package students.andrew_galashin.lesson_10.level_4.task_12;

class FahrenheitConverterTest {

    public static void main(String[] args) {
        FahrenheitConverterTest start = new FahrenheitConverterTest();
        start.test1();
        start.test2();
    }

    void test1() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double result = fahrenheitConverter.convert(10);
        check(result, 50, "Test1");
    }

    void test2() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double result = fahrenheitConverter.convert(-20);
        check(result, -4, "Test2");
    }

    void check(double result, double expected, String testName) {
        if (result == expected) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
