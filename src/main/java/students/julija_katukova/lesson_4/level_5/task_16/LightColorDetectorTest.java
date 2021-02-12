package students.julija_katukova.lesson_4.level_5.task_16;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.detectTest();
    }
    public void detectTest() {
        int waveLength = 400;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        check(realResult, expectedResult, "Violet");

        waveLength = 470;
        expectedResult = "Blue";
        realResult = lightColorDetector.detect(waveLength);
        check(realResult, expectedResult, "Blue");

        waveLength = 500;
        expectedResult = "Green";
        realResult = lightColorDetector.detect(waveLength);
        check(realResult, expectedResult, "Green");

        waveLength = 580;
        expectedResult = "Yellow";
        realResult = lightColorDetector.detect(waveLength);
        check(realResult, expectedResult, "Yellow");

        waveLength = 600;
        expectedResult = "Orange";
        realResult = lightColorDetector.detect(waveLength);
        check(realResult, expectedResult, "Orange");

        waveLength = 700;
        expectedResult = "Red";
        realResult = lightColorDetector.detect(waveLength);
        check(realResult, expectedResult, "Red");

        waveLength = 1000;
        expectedResult = "Invisible Light";
        realResult = lightColorDetector.detect(waveLength);
        check(realResult, expectedResult, "InvisibleLight");

    }

    public void check (String realResult, String expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }

    }

}
