package students.alex_kalashnikov.lesson_4.level_7.task_25;

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

    public void test(int wavelength, String expectedResult) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == expectedResult) {
            System.out.println("LightColorDetector test - " + expectedResult + " = OK");
        }
        else {
            System.out.println("LightColorDetector test - " + expectedResult + " = FAIL");
        }
    }

    public void testViolet(int wavelength) {
        String expectedResult = "Violet";
        test(wavelength,expectedResult);
    }
    public void testBlue(int wavelength) {
        String expectedResult = "Blue";
        test(wavelength,expectedResult);
    }
    public void testGreen(int wavelength) {
        String expectedResult = "Green";
        test(wavelength,expectedResult);
    }
    public void testYellow(int wavelength) {
        String expectedResult = "Yellow";
        test(wavelength,expectedResult);
    }
    public void testOrange(int wavelength) {
        String expectedResult = "Orange";
        test(wavelength,expectedResult);
    }
    public void testRed(int wavelength) {
        String expectedResult = "Red";
        test(wavelength,expectedResult);
    }
    public void testInvisible(int wavelength) {
        String expectedResult = "Invisible Light";
        test(wavelength,expectedResult);
    }

}
