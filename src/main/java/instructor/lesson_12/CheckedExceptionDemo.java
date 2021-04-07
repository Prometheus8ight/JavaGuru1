package instructor.lesson_12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

public class CheckedExceptionDemo {

    public static void main(String[] args) {

        Optional<String> text = read("/Users/konstantins/Desktop/message-of-the-day.txt");

        if (text.isPresent()) {
            System.out.println(text);
        } else {
            System.out.println("Nothing..");
        }
    }

    public static Optional<String> read(String path) {
        try {
            String txt = Files.readString(Paths.get(path));
            return Optional.of(txt);
        } catch (IOException ex) {
//            throw new IllegalStateException(ex);
            return Optional.empty();
        } finally {
            System.out.println("I'm in finally block");
        }
    }
}
