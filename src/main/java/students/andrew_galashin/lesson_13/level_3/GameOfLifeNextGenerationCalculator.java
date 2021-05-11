package students.andrew_galashin.lesson_13.level_3;

import java.util.Arrays;

class GameOfLifeNextGenerationCalculator {
    public boolean[][] calculate(boolean[][] currentGeneration) {
        for (int i = 0; i < currentGeneration.length; i++) {
            for (int a = 0; a < currentGeneration[i].length; a++) {
                if (currentGeneration[i][a]) {
                    int alive = calculateGenerater(currentGeneration, i, a);
                    {
                        if (alive < 2) {
                            currentGeneration[i][a] = false;
                        } else currentGeneration[i][a] = alive == 2 || alive == 3;
                    }
                } else if (!currentGeneration[i][a]) {
                    int alive = calculateGenerater(currentGeneration, i, a);
                    {
                        if (alive == 3) {
                            currentGeneration[i][a] = true;
                        }
                    }
                }
            }
        }
        return currentGeneration;
    }


    private int calculateGenerater(boolean[][] board, int x, int y) {
        int count = 0;

        if (arrIndex(board, x - 1, y - 1) && board[x - 1][y - 1]) {
            count++;
        }
        if (arrIndex(board, x, y - 1) && board[x][y - 1]) {
            count++;
        }
        if (arrIndex(board, x + 1, y - 1) && board[x + 1][y - 1]) {
            count++;
        }

        if (arrIndex(board, x - 1, y) && board[x - 1][y]) {
            count++;
        }
        if (arrIndex(board, x + 1, y) && board[x + 1][y]) {
            count++;
        }

        if (arrIndex(board, x - 1, y + 1) && board[x - 1][y + 1]) {
            count++;
        }
        if (arrIndex(board, x, y + 1) && board[x][y + 1]) {
            count++;
        }
        if (arrIndex(board, x + 1, y + 1) && board[x + 1][y + 1]) {
            count++;
        }
        return count;
    }
    private boolean arrIndex(boolean[][] board, int x, int y) {
        if (x < 0 || x >= board.length) {
            return false;
        }
        return y >= 0 && y < board[x].length;
    }
}