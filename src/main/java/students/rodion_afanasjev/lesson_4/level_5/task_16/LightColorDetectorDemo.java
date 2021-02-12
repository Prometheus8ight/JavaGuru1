package students.rodion_afanasjev.lesson_4.level_5.task_16;

public class LightColorDetectorDemo {

    public static void main(String[] args) {

        LightColorDetector lightColorDetector = new LightColorDetector();
        lightColorDetector.detectColor(lightColorDetector.detect(700));

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.Violet();
        lightColorDetectorTest.Blue();
        lightColorDetectorTest.Green();
        lightColorDetectorTest.Yellow();
        lightColorDetectorTest.Orange();
        lightColorDetectorTest.Red();
        lightColorDetectorTest.Invisible();




    }

}
