package students.alex_kalashnikov.lesson_4.level_5.task_16;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleLightTest();



    }

    public void violetTest() {
        int wavelenght = 400;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (realResult == expectedResult) {
            System.out.println("violetTest is OK");
        }
        else {
            System.out.println("violetTest is FAILED");
        }
    }

    public void blueTest() {
        int wavelenght = 475;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (realResult == expectedResult) {
            System.out.println("blueTest is OK");
        }
        else {
            System.out.println("blueTest is FAILED");
        }
    }

    public void greenTest() {
        int wavelenght = 495;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (realResult == expectedResult) {
            System.out.println("greenTest is OK");
        }
        else {
            System.out.println("greenTest is FAILED");
        }
    }

    public void yellowTest() {
        int wavelenght = 570;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (realResult == expectedResult) {
            System.out.println("yellowTest is OK");
        }
        else {
            System.out.println("yellowTest is FAILED");
        }
    }

    public void orangeTest() {
        int wavelenght = 600;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (realResult == expectedResult) {
            System.out.println("orangeTest is OK");
        }
        else {
            System.out.println("orangeTest is FAILED");
        }
    }

    public void redTest() {
        int wavelenght = 725;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (realResult == expectedResult) {
            System.out.println("redTest is OK");
        }
        else {
            System.out.println("redTest is FAILED");
        }
    }

    public void invisibleLightTest() {
        int wavelenght = 10;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (realResult == expectedResult) {
            System.out.println("invisibleLightTest is OK");
        }
        else {
            System.out.println("invisibleLightTest is FAILED");
        }
    }
}
