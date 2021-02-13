package instructor.lesson_4;

public class IfElseDemo {

    public static void main(String[] args) {

        System.out.println("Nochnoj dozhor"); // 1

        boolean hasDumplings = true;
        boolean hasSourCream = false;

        if (hasDumplings) {
            System.out.println("The greatest food ever.. Mm.. dumplings.."); // 2

            if (hasSourCream) {
                System.out.println("A little bit of sour cream as well"); // 3
            }

        } else {
            System.out.println("Fine, Rolton will do.."); // 4
        }

        System.out.println("That's it, folks"); // 5

    }
}
