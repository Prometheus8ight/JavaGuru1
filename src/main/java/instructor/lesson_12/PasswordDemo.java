package instructor.lesson_12;

public class PasswordDemo {

    public static void main(String[] args) {

        Password password1 = new Password("qwerty12345dog");
        System.out.println(password1.getMasked());

        Password password2 = new Password(null);
//        System.out.println(password2.getMasked());

    }
}
