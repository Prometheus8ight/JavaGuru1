package students.deniss_jankovskis.lesson_13.level_4;

public class GameOfLifeConsoleUI {

    public void show(boolean[][] field) {

        System.out.println("---");
        for (boolean[] booleans : field) {
            String line = "|";
            for (boolean aBoolean : booleans) {
                if (!aBoolean) {
                    line += ".";
                } else {
                    line += "*";
                }
            }
            line += "|";
            System.out.println(line);
        }
        System.out.println("---\n");
    }
}
