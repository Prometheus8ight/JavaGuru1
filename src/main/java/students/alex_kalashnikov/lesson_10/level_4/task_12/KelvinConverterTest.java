package students.alex_kalashnikov.lesson_10.level_4.task_12;

import java.util.Optional;

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

    void test(Optional expectedResult, Optional realResult) {
        if (expectedResult.equals(realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testKelvinConverter() {
        KelvinConverter newKelvin = new KelvinConverter();
        Optional<Double> expectedResult = Optional.of(293.15);
        Optional realResult = newKelvin.convert(20);
        test(expectedResult, realResult);
    }

    void testKelvinConverter1() {
        KelvinConverter newKelvin = new KelvinConverter();
        Optional<Double> expectedResult = Optional.of(253.14999999999998);
        Optional realResult = newKelvin.convert(-20.0);
        test(expectedResult, realResult);
    }

    void testKelvinConverter2() {
        KelvinConverter newKelvin = new KelvinConverter();
        Optional<Double> expectedResult = Optional.of(273.15);
        Optional realResult = newKelvin.convert(0.0);
        test(expectedResult, realResult);
    }

    void testKelvinConverter3() {
        KelvinConverter newKelvin = new KelvinConverter();
        Optional<Double> expectedResult = Optional.of(0.0);
        Optional realResult = newKelvin.convert(-273.15);
        test(expectedResult, realResult);
    }

    void testKelvinConverter4() {
        KelvinConverter newKelvin = new KelvinConverter();
        Optional<Double> expectedResult = Optional.of(273.15);
        Optional realResult = newKelvin.convert(0.0);
        test(expectedResult, realResult);
    }

    void testKelvinConverter5() {
        KelvinConverter newKelvin = new KelvinConverter();
        Optional<Double> expectedResult = Optional.of(1500273.15);
        Optional realResult = newKelvin.convert(1500000.0);
        test(expectedResult, realResult);
    }

    void testKelvinConverter6() {
        KelvinConverter newKelvin = new KelvinConverter();
        Optional<String> expectedResult = Optional.of("No temperature below absolute zero!");
        Optional realResult = newKelvin.convert(-273.16);
        test(expectedResult, realResult);
    }

    void testKelvinConverter7() {
        KelvinConverter newKelvin = new KelvinConverter();
        Optional<String> expectedResult = Optional.of("No temperature below absolute zero!");
        Optional realResult = newKelvin.convert(-500000);
        test(expectedResult, realResult);
    }

}