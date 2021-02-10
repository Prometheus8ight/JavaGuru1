package instructor.lesson_4;

public class IfElseIfElseDemo {

    public static void main(String[] args) {

        System.out.println("Today is a great day.."); // 1
        System.out.println("Time to get a cup of ☕️"); // 2

        boolean hasCream = false;
        boolean hasMilk = false;

        if (hasCream) {
            System.out.println("Adding a bit of cream"); // 3
        } else if (hasMilk) {
            System.out.println("Adding a bit of milk"); // 4
        } else {
            System.out.println("Just add H2O"); // 5
        }

        System.out.println("Sip.."); // 6

    }
}
