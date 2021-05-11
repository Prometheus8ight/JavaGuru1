package students.andrew_galashin.lesson_13.level_4;

import java.util.Random;

class RandomBoard {
    public boolean[][] generate(int widht, int height) {
        boolean[][] board = new Board(widht, height).getBoard();
        Random random = new Random();
        for (int i = 0; i < board.length; i++) {
            for (int a = 0; a < board.length; a++) {
                int randomNum = random.nextInt(100);
                if (randomNum % 2 == 0) {
                    board[i][a] = true;
                }
            }
        }
        return board;
    }
}
