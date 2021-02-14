package students.rodion_afanasjev.lesson_4.level_5.task_16;

public class LightColorDetectorDemo {

    public static void main(String[] args) {

        LightColorDetector lightColorDetector = new LightColorDetector();
        String color = lightColorDetector.detect(450);
        System.out.println(color);

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violet();
        lightColorDetectorTest.blue();
        lightColorDetectorTest.green();
        lightColorDetectorTest.yellow();
        lightColorDetectorTest.orange();
        lightColorDetectorTest.red();
        lightColorDetectorTest.invisible();




    }

}
