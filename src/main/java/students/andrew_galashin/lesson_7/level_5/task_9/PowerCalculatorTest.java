package students.andrew_galashin.lesson_7.level_5.task_9;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest start = new PowerCalculatorTest();
        start.test1();
        start.test2();
        start.test3();
        start.test4();
        start.test5();
        start.test6();
    }

    void test1() {
        PowerCalculator start = new PowerCalculator();
        int x = start.raise(5, 2);
        check(x, 25, "test1");
    }

    void test2() {
        PowerCalculator start = new PowerCalculator();
        int x = start.raise(5, 0);
        check(x, 1, "test2");
    }

    void test3() {
        PowerCalculator start = new PowerCalculator();
        int x = start.raise(0, 2);
        check(x, 0, "test3");
    }

    void test4() {
        PowerCalculator start = new PowerCalculator();
        int x = start.raise(-5, 2);
        check(x, 25, "test4");
    }

    void test5() {
        PowerCalculator start = new PowerCalculator();
        int x = start.raise(5, -2);
        check(x, 0, "test5");
    }

    void test6() {
        PowerCalculator start = new PowerCalculator();
        int x = start.raise(-5, -2);
        check(x, 0, "test6");
    }


    void check(int result, int expected, String testName) {
        if (result == expected) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
