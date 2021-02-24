package instructor.lesson_6.static_kw;

public class LightDetector {

    static final String RED = "red";
    static final String NOT_FOUND = "not found";

    public static String detect(int wavelength) {
        if (wavelength >= 450 && wavelength <= 499) {
            return RED;
        } else {
            return NOT_FOUND;
        }
    }
}
