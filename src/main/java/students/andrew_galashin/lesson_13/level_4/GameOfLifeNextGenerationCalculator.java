package students.andrew_galashin.lesson_13.level_4;

import java.util.Arrays;

class GameOfLifeNextGenerationCalculator {
    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] nextGeneration = Arrays.copyOf(currentGeneration, currentGeneration.length);
        for (int row = 0; row < currentGeneration.length; ++row) {
            for (int col = 0; col < currentGeneration[row].length; ++col) {
                int numNeighbors = calculateGenerate(currentGeneration, row, col);
                if ((numNeighbors < 2) || (numNeighbors > 3)) {
                    nextGeneration[row][col] = false;
                }
                if (numNeighbors == 2 || numNeighbors == 3) {
                    nextGeneration[row][col] = true;
                }
            }
        }

        return nextGeneration;
    }


    private int calculateGenerate(boolean[][] board, int x, int y) {
        int a = 0;

        if ((x - 1 >= 0) && (y - 1 >= 0)) {
            if (board[x - 1][y - 1]) {
                a++;
            }
        }
        if ((x >= 0) && (y - 1 >= 0)) {
            if (board[x][y - 1]) {
                a++;
            }
        }
        if ((x + 1 < board.length) && (y - 1 >= 0)) {
            if (board[x + 1][y - 1]) {
                a++;
            }
        }
        if ((x + 1 < board.length) && (y < board[0].length)) {
            if (board[x + 1][y]) {
                a++;
            }
        }
        if ((x + 1 < board.length) && (y + 1 < board[0].length)) {
            if (board[x + 1][y + 1]) {
                a++;
            }
        }
        if ((x < board.length) && (y + 1 < board[0].length)) {
            if (board[x][y + 1]) {
                a++;
            }
        }
        if ((x - 1 >= 0) && (y + 1 < board[0].length)) {
            if (board[x - 1][y + 1]) {
                a++;
            }
        }
        if ((x - 1 >= 0) && (y < board[0].length)) {
            if (board[x - 1][y]) {
                a++;
            }
        }
        return a;
    }
}