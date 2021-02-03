package instructor.lesson_3;

public class StringDemo {

    public static void main(String[] args) {

        String text = "Hello World!";
        System.out.println(text);

        System.out.println("text.toUpperCase() = " + text.toUpperCase());
        System.out.println("text.toLowerCase() = " + text.toLowerCase());

        System.out.println("text.contains(\"Hello\") = " + text.contains("Hello"));
        System.out.println("text.charAt(1) = " + text.charAt(1));

    }
}
