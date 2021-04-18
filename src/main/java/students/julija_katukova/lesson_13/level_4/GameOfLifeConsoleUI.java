package students.julija_katukova.lesson_13.level_4;

public class GameOfLifeConsoleUI {
    public void show(boolean[][] field) {

        for (boolean[] booleans : field) {
            for (boolean aBoolean : booleans) {
                if (!aBoolean)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
