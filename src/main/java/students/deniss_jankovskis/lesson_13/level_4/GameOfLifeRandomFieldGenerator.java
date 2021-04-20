package students.deniss_jankovskis.lesson_13.level_4;

import java.util.Random;

class GameOfLifeRandomFieldGenerator {

    public boolean[][] generate(int fieldWidth, int fieldHeight) {
        Random random = new Random();
        boolean[][] field = new Field(fieldWidth, fieldHeight).getField();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                int randomNum = random.nextInt(10);
                if (randomNum % 2 == 0) {
                    field[i][j] = true;
                }
            }
        }
        return field;
    }
}
