package instructor.lesson_5.loop;

public class ForDemo {

    public static void main(String[] args) {

        System.out.println("Let's do some push ups 💪");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ") Doing push up");

            if (i == 5) {
                System.out.println("Let's rest a bit");
            } else {
                System.out.println("Working hard");
            }
        }

        System.out.println("Done 😫");
    }
}
