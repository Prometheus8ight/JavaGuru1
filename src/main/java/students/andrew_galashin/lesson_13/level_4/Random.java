package students.andrew_galashin.lesson_13.level_4;

import java.util.Random;

class RandomBoard {
    public boolean[][] generate(int widht, int height) {
        boolean[][] out = new Board(widht, height).getBoard();
        Random random = new Random();
        for (int i = 0; i < out.length; i++) {
            for (int a = 0; a < out.length; a++) {
                int x = random.nextInt(100);
                if (x % 2 == 0) {
                    out[i][a] = true;
                }
            }
        }
        return out;
    }
}
