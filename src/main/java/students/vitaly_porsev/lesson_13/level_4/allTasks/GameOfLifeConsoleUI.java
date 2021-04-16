package students.vitaly_porsev.lesson_13.level_4.allTasks;

public class GameOfLifeConsoleUI {

    public void show(boolean[][] field) {
        System.out.println("---");
        for (int i = 0; i < field.length; i++) {
            StringBuilder line = new StringBuilder("|");
            for (int j = 0; j < field[i].length; j++) {
                if (!field[i][j]) {
                    line.append(".");
                } else {
                    line.append("*");
                }
            }
            line.append("|");
            System.out.println(line);
        }
        System.out.println("---\n");
    }
}
