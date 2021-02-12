package students.vitaly_porsev.lesson_4.level_5.task_16;

class LightColorDetectorDemo {
    public static void main(String[] args) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        System.out.println(lightColorDetector.detect(100));

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.LCDVioletTest();
        lightColorDetectorTest.LCDBlueTest();
        lightColorDetectorTest.LCDGreenTest();
        lightColorDetectorTest.LCDYellowTest();
        lightColorDetectorTest.LCDOrangeTest();
        lightColorDetectorTest.LCDRedTest();
        lightColorDetectorTest.LCDInvisibleLightTest();
    }
}
