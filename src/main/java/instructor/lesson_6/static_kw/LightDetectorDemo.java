package instructor.lesson_6.static_kw;

public class LightDetectorDemo {

    public static void main(String[] args) {

        LightDetector lightDetector = new LightDetector();
        System.out.println("LightDetector.RED = " + LightDetector.RED);
        System.out.println("LightDetector.NOT_FOUND = " + LightDetector.NOT_FOUND);

        LightDetector.detect(470);

    }
}
