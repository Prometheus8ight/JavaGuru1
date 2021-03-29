package students.deniss_jankovskis.lesson_4.level_5;

class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.detectTest();

    }

    public void detectTest() {
        int wavelength = 420;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        check(realResult, expectedResult, "Violet");


        wavelength = 490;
        expectedResult = "Blue";
        realResult = lightColorDetector.detect(wavelength);
        check(realResult, expectedResult, "Blue");


        wavelength = 530;
        expectedResult = "Green";
        realResult = lightColorDetector.detect(wavelength);
        check(realResult, expectedResult, "Green");


        wavelength = 577;
        expectedResult = "Yellow";
        realResult = lightColorDetector.detect(wavelength);
        check(realResult, expectedResult, "Yellow");


        wavelength = 600;
        expectedResult = "Orange";
        realResult = lightColorDetector.detect(wavelength);
        check(realResult, expectedResult, "Orange");


        wavelength = 700;
        expectedResult = "Red";
        realResult = lightColorDetector.detect(wavelength);
        check(realResult, expectedResult, "Red");


        wavelength = 900;
        expectedResult = "Invisible light";
        realResult = lightColorDetector.detect(wavelength);
        check(realResult, expectedResult, "Invisible light");

    }


    public void check(String realResult, String expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " has passed!");
        }
        else {
            System.out.println(testName + " has failed!");

        }
    }


}
