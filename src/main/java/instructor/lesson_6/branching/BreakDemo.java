package instructor.lesson_6.branching;

public class BreakDemo {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Before while");

        while (true) {
            System.out.println("Inside while");
            break;
        }

        System.out.println("After while");
    }
}
