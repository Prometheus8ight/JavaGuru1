package students.andrew_galashin.lesson_13.level_4;

public class UI {
    public void show(boolean[][] board) {
        for (boolean[] boolean1 : board) {
            for (boolean a : boolean1) {
                if (!a) {
                    System.out.println(".");
                } else {
                    System.out.println("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
