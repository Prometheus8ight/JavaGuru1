package instructor.lesson_6.branching;

public class ContinueDemo {

    public static void main(String[] args) {

        Dumpling[] dumplings = {
                new Dumpling(1, true),
                new Dumpling(2, true),
                new Dumpling(3, false),
                new Dumpling(4, true),
                new Dumpling(5, true),
                new Dumpling(6, false),
                new Dumpling(7, true)
        };

        System.out.println("Dinner time!");

        for (int i = 0; i < dumplings.length; i++) {
            if (!dumplings[i].isBeatiful) {
                continue;
            }
            System.out.println("Nom nom: 🥟 " + dumplings[i].id + " is delicious");
        }

        System.out.println("Good for me");

    }
}
