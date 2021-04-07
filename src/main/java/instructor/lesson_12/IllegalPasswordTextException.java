package instructor.lesson_12;

public class IllegalPasswordTextException extends RuntimeException {

    public IllegalPasswordTextException() {
        super("Password text must not be null!");
    }
}
