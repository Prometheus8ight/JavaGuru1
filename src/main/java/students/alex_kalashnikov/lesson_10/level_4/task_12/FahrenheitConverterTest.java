package students.alex_kalashnikov.lesson_10.level_4.task_12;

class FahrenheitConverterTest {

    public static void main(String[] args) {

        FahrenheitConverterTest victim = new FahrenheitConverterTest();
        victim.testFahrenheitConverter();
        victim.testFahrenheitConverter1();
        victim.testFahrenheitConverter2();
        victim.testFahrenheitConverter3();
        victim.testFahrenheitConverter4();
        victim.testFahrenheitConverter5();
        victim.testFahrenheitConverter6();
        victim.testFahrenheitConverter7();

    }

    void test(double expectedResult, double realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFahrenheitConverter() {
        FahrenheitConverter newFahrenheit = new FahrenheitConverter();
        double expectedResult = 68.0;
        double realResult = newFahrenheit.convert(20);
        test(expectedResult, realResult);
    }

    void testFahrenheitConverter1() {
        FahrenheitConverter newFahrenheit = new FahrenheitConverter();
        double expectedResult = -4.0;
        double realResult = newFahrenheit.convert(-20);
        test(expectedResult, realResult);
    }

    void testFahrenheitConverter2() {
        FahrenheitConverter newFahrenheit = new FahrenheitConverter();
        double expectedResult = 32.0;
        double realResult = newFahrenheit.convert(0.0);
        test(expectedResult, realResult);
    }

    void testFahrenheitConverter3() {
        FahrenheitConverter newFahrenheit = new FahrenheitConverter();
        double expectedResult = 0.0;
        double realResult = newFahrenheit.convert(-17.777777777777777);
        test(expectedResult, realResult);
    }

    void testFahrenheitConverter4() {
        FahrenheitConverter newFahrenheit = new FahrenheitConverter();
        double expectedResult = -459.66999999999996;
        double realResult = newFahrenheit.convert(-273.15);
        test(expectedResult, realResult);
    }

    void testFahrenheitConverter5() {
        FahrenheitConverter newFahrenheit = new FahrenheitConverter();
        double expectedResult = 2700032.0;
        double realResult = newFahrenheit.convert(1500000.0);
        test(expectedResult, realResult);
    }

    void testFahrenheitConverter6() {
        FahrenheitConverter newFahrenheit = new FahrenheitConverter();
        double expectedResult = -459.66999999999996;
        double realResult = newFahrenheit.convert(-273.16);
        test(expectedResult, realResult);
    }

    void testFahrenheitConverter7() {
        FahrenheitConverter newFahrenheit = new FahrenheitConverter();
        double expectedResult = -459.66999999999996;
        double realResult = newFahrenheit.convert(-500000);
        test(expectedResult, realResult);
    }

}