package students.arkadij.lesson_4.task_16;

class LightColorDetectorDemo {

    public static void main(String[] args) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        System.out.println("The blue color detection with number 493.");
        System.out.println(lightColorDetector.detection(493));

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest(); // test fail :)
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleLightTest();
    }

}
