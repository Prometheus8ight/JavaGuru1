package students.bogdans_pavlovs.lesson_4.level_7.task_25;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet(405);
        lightColorDetector.testBlue(475);
        lightColorDetector.testGreen(505);
        lightColorDetector.testYellow(585);
        lightColorDetector.testOrange(619);
        lightColorDetector.testRed(620);
        lightColorDetector.testInvisible(760);
    }
    public void testViolet(int wavelength) {
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.compareResult(result, expectedResult);
    }
    public void testBlue(int wavelength) {
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.compareResult(result, expectedResult);
    }
    public void testGreen(int wavelength) {
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.compareResult(result, expectedResult);
    }
    public void testYellow(int wavelength) {
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.compareResult(result, expectedResult);
    }
    public void testOrange(int wavelength) {
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.compareResult(result, expectedResult);
    }
    public void testRed(int wavelength) {
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.compareResult(result, expectedResult);
    }
    public void testInvisible(int wavelength) {
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.compareResult(result, expectedResult);
    }

    public void compareResult (String result, String expectedResult){
        if(result.equals(expectedResult)) {
            System.out.println("LightColorDetector test - " + expectedResult + " = OK");
        } else {
            System.out.println("LightColorDetector test - " + expectedResult + " = FAIL");
        }
    }


}
