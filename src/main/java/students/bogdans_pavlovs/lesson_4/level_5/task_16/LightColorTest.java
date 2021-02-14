package students.bogdans_pavlovs.lesson_4.level_5.task_16;

class LightColorTest {

    public static void main(String[] args) {

        LightColorTest lightColorTest = new LightColorTest();

        lightColorTest.testViolet();
        lightColorTest.testBlue();
        lightColorTest.testGreen();
        lightColorTest.testYellow();
        lightColorTest.testOrange();
        lightColorTest.testRed();
        lightColorTest.testInvisible();

    }


    public void testViolet() {
        int waveLength = 400;
        String expectedResult = "Violet";

        LightColorDetector detectorTest = new LightColorDetector();
        String realResult = detectorTest.detect(waveLength);
        if (realResult == expectedResult){
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");
        }

    }

    public void testBlue() {
        int waveLength = 460;
        String expectedResult = "Blue";

        LightColorDetector detectorTest = new LightColorDetector();
        String realResult = detectorTest.detect(waveLength);
        if (realResult == expectedResult){
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");
        }
    }

    public void testGreen() {
        int waveLength = 510;
        String expectedResult = "Green";

        LightColorDetector detectorTest = new LightColorDetector();
        String realResult = detectorTest.detect(waveLength);
        if (realResult == expectedResult){
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");
        }
    }

    public void testYellow() {
        int waveLength = 580;
        String expectedResult = "Yellow";

        LightColorDetector detectorTest = new LightColorDetector();
        String realResult = detectorTest.detect(waveLength);
        if (realResult == expectedResult){
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }

    public void testOrange() {
        int waveLength = 605;
        String expectedResult = "Orange";

        LightColorDetector detectorTest = new LightColorDetector();
        String realResult = detectorTest.detect(waveLength);
        if (realResult == expectedResult){
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }

    public void testRed() {
        int waveLength = 749;
        String expectedResult = "Red";

        LightColorDetector detectorTest = new LightColorDetector();
        String realResult = detectorTest.detect(waveLength);
        if (realResult == expectedResult){
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");
        }
    }

    public void testInvisible() {
        int waveLength = 123;
        String expectedResult = "Invisible Light";

        LightColorDetector detectorTest = new LightColorDetector();
        String realResult = detectorTest.detect(waveLength);
        if (realResult == expectedResult){
            System.out.println("Invisible test = OK");
        } else {
            System.out.println("Invisible test = FAIL");
        }
    }



}


/*
Написать тестовые сценарии для класса LightColorDetector
в классе LightColorDetectorTest. Тестовые сценарии должны
покрывать все возможные варианты.
 */