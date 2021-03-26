package students.julija_katukova.lesson_10.level_4.task_12;

class KelvinConverterTest {
    public static void main(String[] args) {
        KelvinConverterTest kelvinConverterTest = new KelvinConverterTest();
        kelvinConverterTest.test1();
        kelvinConverterTest.test2();
    }

    public void test1() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double realResult = kelvinConverter.convert(20.1);
        check(realResult, 293.25, "Test1");
    }

    public void test2() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double realResult = kelvinConverter.convert(-10);
        check(realResult, 263.15, "Test2");
    }

    public void check(double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
