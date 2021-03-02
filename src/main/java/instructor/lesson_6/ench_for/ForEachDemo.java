package instructor.lesson_6.ench_for;

public class ForEachDemo {

    public static void main(String[] args) {

        int[] foo = {1, 3, 5, 2, 4, 6, 7, 8};

        for (int i = 0; i < foo.length; i++) {
            System.out.println("foo[" + i + "]: " + foo[i]);
        }

        int min = foo[0];
        for (int current : foo) {
            if (current < min) {
                min = current;
            }
            System.out.println("current = " + current);
        }

        // dogs
        // for (Dog dog : dogs)

        // dumplings
        // for (Dumpling dumpling : dumplings)

        // strings
        // for (String string : strings)

    }
}
