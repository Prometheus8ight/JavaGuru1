package students.vitaly_porsev.lesson_13.level_4.allTasks;

public class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {
        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration[i].length; j++) {
                if (currentGeneration[i][j]) {
                    int aliveNeighbours = calculateGeneration(currentGeneration, i, j);
                    {
                        if (aliveNeighbours < 2) {
                            currentGeneration[i][j] = false;
                        } else currentGeneration[i][j] = aliveNeighbours == 2 || aliveNeighbours == 3;
                    }
                } else if (!currentGeneration[i][j]) {
                    int aliveNeighbours = calculateGeneration(currentGeneration, i, j);
                    {
                        if (aliveNeighbours == 3) {
                            currentGeneration[i][j] = true;
                        }
                    }
                }
            }
        }
        return currentGeneration;
    }

    private int calculateGeneration(boolean[][] board, int x, int y) {
        int count = 0;

        if (checkArrayIndex(board, x - 1, y - 1) && board[x - 1][y - 1]) {
            count++;
        }
        if (checkArrayIndex(board, x, y - 1) && board[x][y - 1]) {
            count++;
        }
        if (checkArrayIndex(board, x + 1, y - 1) && board[x + 1][y - 1]) {
            count++;
        }

        if (checkArrayIndex(board, x - 1, y) && board[x - 1][y]) {
            count++;
        }
        if (checkArrayIndex(board, x + 1, y) && board[x + 1][y]) {
            count++;
        }

        if (checkArrayIndex(board, x - 1, y + 1) && board[x - 1][y + 1]) {
            count++;
        }
        if (checkArrayIndex(board, x, y + 1) && board[x][y + 1]) {
            count++;
        }
        if (checkArrayIndex(board, x + 1, y + 1) && board[x + 1][y + 1]) {
            count++;
        }
        return count;
    }

    private boolean checkArrayIndex(boolean[][] board, int x, int y) {
        if (x < 0 || x >= board.length) {
            return false;
        }
        return y >= 0 && y < board[x].length;
    }
}
