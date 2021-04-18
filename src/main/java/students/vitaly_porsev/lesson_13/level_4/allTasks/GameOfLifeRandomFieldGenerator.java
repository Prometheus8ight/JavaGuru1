package students.vitaly_porsev.lesson_13.level_4.allTasks;

import java.util.Random;

public class GameOfLifeRandomFieldGenerator {

    boolean[][] generate(int fieldHeight, int fieldWidth) {
        Random rnd = new Random();
        boolean[][] field = new Board(fieldHeight, fieldWidth).getBoard();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                int random = rnd.nextInt(10);
                if (random % 2 == 0) {
                    field[i][j] = true;
                }
            }
        }
        return field;
    }
}
