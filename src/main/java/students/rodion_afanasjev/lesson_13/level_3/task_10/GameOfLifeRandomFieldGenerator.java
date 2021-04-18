package students.rodion_afanasjev.lesson_13.level_3.task_10;

import java.util.Random;

class GameOfLifeRandomFieldGenerator {

    public boolean[][] generate(int fieldWidth, int fieldHeight) {
        Random rand = new Random();
        boolean[][] field = new Field(fieldWidth, fieldHeight).getField();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                int randomNum = rand.nextInt(100);
                if (randomNum % 2 == 0) {
                    field[i][j] = true;
                }
            }
        }
        return field;
    }

}
