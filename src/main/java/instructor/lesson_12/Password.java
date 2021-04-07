package instructor.lesson_12;

public class Password {

    private String text;

    public Password(String text) {
//        Objects.requireNonNull(text, "Password field 'text' must not be null!");

        if (text == null) {
            throw new IllegalPasswordTextException();
//            throw new IllegalArgumentException("Password field 'text' must not be null!");
        }

        this.text = text;
    }

    public String getMasked() {
        return text.replaceAll("[a-zA-Z0-9]", "*");
    }
}
