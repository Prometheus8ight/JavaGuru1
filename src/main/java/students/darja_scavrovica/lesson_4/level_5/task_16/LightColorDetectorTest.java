package students.darja_scavrovica.lesson_4.level_5.task_16;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.invisibleLight();
    }

    public void violetTest() {
        int wavelength = 440;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("VioletTest = OK" );}
        else { System.out.println("VioletTest = FAIL" );}
    }
    public void blueTest() {
        int wavelength = 470;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Blue Test = OK" );}
        else { System.out.println("Blue Test = FAIL" );}
    }
    public void yellowTest() {
        int wavelength = 580;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Yellow Test = OK" );}
        else { System.out.println("Yellow Test = FAIL" );}
    }
    public void greenTest() {
        int wavelength = 500;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Green Test = OK" );}
        else { System.out.println("Green Test = FAIL" );}
    }
    public void orangeTest() {
        int wavelength = 600;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Orange Test = OK" );}
        else { System.out.println("Orange Test = FAIL" );}
    }
    public void redTest() {
        int wavelength = 700;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Red Test = OK" );}
        else { System.out.println("Red Test = FAIL" );}
    }
    public void invisibleLight() {
        int wavelength = 900;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Invisible Light = OK" );}
        else { System.out.println("Invisible Light = FAIL" );}
    }
}