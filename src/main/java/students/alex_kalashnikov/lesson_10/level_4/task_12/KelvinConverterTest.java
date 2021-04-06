package students.alex_kalashnikov.lesson_10.level_4.task_12;

class KelvinConverterTest {

    public static void main(String[] args) {

        KelvinConverterTest victim = new KelvinConverterTest();
        victim.testKelvinConverter();
        victim.testKelvinConverter1();
        victim.testKelvinConverter2();
        victim.testKelvinConverter3();
        victim.testKelvinConverter4();
        victim.testKelvinConverter5();
        victim.testKelvinConverter6();
        victim.testKelvinConverter7();

    }

    void test(double expectedResult, double realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testKelvinConverter() {
        KelvinConverter newKelvin = new KelvinConverter();
        double expectedResult = 293.15;
        double realResult = newKelvin.convert(20);
        test(expectedResult, realResult);
    }

    void testKelvinConverter1() {
        KelvinConverter newKelvin = new KelvinConverter();
        double expectedResult = 253.14999999999998;
        double realResult = newKelvin.convert(-20.0);
        test(expectedResult, realResult);
    }

    void testKelvinConverter2() {
        KelvinConverter newKelvin = new KelvinConverter();
        double expectedResult = 273.15;
        double realResult = newKelvin.convert(0.0);
        test(expectedResult, realResult);
    }

    void testKelvinConverter3() {
        KelvinConverter newKelvin = new KelvinConverter();
        double expectedResult = 0.0;
        double realResult = newKelvin.convert(-273.15);
        test(expectedResult, realResult);
    }

    void testKelvinConverter4() {
        KelvinConverter newKelvin = new KelvinConverter();
        double expectedResult = 273.15;
        double realResult = newKelvin.convert(0.0);
        test(expectedResult, realResult);
    }

    void testKelvinConverter5() {
        KelvinConverter newKelvin = new KelvinConverter();
        double expectedResult = 1500273.15;
        double realResult = newKelvin.convert(1500000.0);
        test(expectedResult, realResult);
    }

    void testKelvinConverter6() {
        KelvinConverter newKelvin = new KelvinConverter();
        double expectedResult = 0;
        double realResult = newKelvin.convert(-273.16);
        test(expectedResult, realResult);
    }

    void testKelvinConverter7() {
        KelvinConverter newKelvin = new KelvinConverter();
        double expectedResult = 0;
        double realResult = newKelvin.convert(-500000);
        test(expectedResult, realResult);
    }

}