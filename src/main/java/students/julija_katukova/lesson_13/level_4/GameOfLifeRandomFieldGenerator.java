package students.julija_katukova.lesson_13.level_4;

import java.util.Random;

class GameOfLifeRandomFieldGenerator {

    public boolean[][] generate(int fieldWidth, int fieldHeight) {
        boolean[][] out = new Field(fieldWidth, fieldHeight).getField();
        Random random = new Random();
        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out[i].length; j++) {
                int randomNum = random.nextInt(100);
                if (randomNum % 2 == 0) {
                    out[i][j] = true;
                }
            }
        }
        return out;
    }

}
