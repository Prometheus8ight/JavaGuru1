package students.lolita_polakova.lesson_4.level_5.task_16;

class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleTest();
    }

    public void violetTest() {
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(406);
        if (realResult.equals(expectedResult)) {
            System.out.println("Violet Light Test = OK");
        } else {
            System.out.println("Violet Light Test = FAIL");
        }
    }

    public void blueTest() {
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(473);
        if (realResult.equals(expectedResult)) {
            System.out.println("Blue Light Test = OK");
        } else {
            System.out.println("Blue Light Test = FAIL");
        }
    }

    public void greenTest() {
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(561);
        if (realResult.equals(expectedResult)) {
            System.out.println("Green Light Test = OK");
        } else {
            System.out.println("Green Light Test = FAIL");
        }
    }

    public void yellowTest() {
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(580);
        if (realResult.equals(expectedResult)) {
            System.out.println("Yellow Light Test = OK");
        } else {
            System.out.println("Yellow Light Test = FAIL");
        }
    }

    public void orangeTest() {
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(592);
        if (realResult.equals(expectedResult)) {
            System.out.println("Orange Light Test = OK");
        } else {
            System.out.println("Orange Light Test = FAIL");
        }
    }

    public void redTest() {
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(699);
        if (realResult.equals(expectedResult)) {
            System.out.println("Red Light Test = OK");
        } else {
            System.out.println("Red Light Test = FAIL");
        }
    }

    public void invisibleTest() {
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(101);
        if (realResult.equals(expectedResult)) {
            System.out.println("Invisible Light Test = OK");
        } else {
            System.out.println("Invisible Light Test = FAIL");
        }
    }
}
