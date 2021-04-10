package students.andrew_galashin.lesson_10.level_4.task_12;

class CelsiusToKelvinTest {

    public static void main(String[] args) {
        CelsiusToKelvinTest start = new CelsiusToKelvinTest();
        start.test1();
        start.test2();
    }

    void test1() {
        CelsiusToKelvin celsius = new CelsiusToKelvin();
        double result = celsius.convert(10);
        check(result, 283.15, "Test1");
    }

    void test2() {
        CelsiusToKelvin celsius = new CelsiusToKelvin();
        double result = celsius.convert(-10);
        check(result, 263.15, "Test2");
    }

    void check(double result, double expected, String testName) {
        if (result == expected) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
