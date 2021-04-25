package students.deniss_jankovskis.lesson_13.level_3;

import java.util.Arrays;

class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGen) {
        boolean[][] nextGen = Arrays.copyOf(currentGen, currentGen.length);
        for (int i = 0; i < currentGen.length; i++) {
            for (int j = 0; j < currentGen[i].length; j++) {
                int numOfNeighbors = countCellNeighbours(currentGen, i, j);
                if (currentGen[i][j]) {
                    if (numOfNeighbors < 2) {
                        nextGen[i][j] = false;
                    } else nextGen[i][j] = (numOfNeighbors == 2) || (numOfNeighbors == 3);
                } else {
                    if (numOfNeighbors == 3) {
                        nextGen[i][j] = true;
                    }
                }
            }
        }
        return nextGen;
    }

    private int countCellNeighbours(boolean[][] currentGen, int row, int col) {
        int numOfNeighbors = 0;

        if ((row - 1 >= 0) && (col - 1 >= 0)) {
            if (currentGen[row - 1][col - 1]) {
                numOfNeighbors++;
            }
        }
        if ((row >= 0) && (col - 1 >= 0)) {
            if (currentGen[row][col - 1]) {
                numOfNeighbors++;
            }
        }
        if ((row + 1 < currentGen.length) && (col - 1 >= 0)) {
            if (currentGen[row + 1][col - 1]) {
                numOfNeighbors++;
            }
        }
        if ((row + 1 < currentGen.length) && (col < currentGen[0].length)) {
            if (currentGen[row + 1][col]) {
                numOfNeighbors++;
            }
        }
        if ((row + 1 < currentGen.length) && (col + 1 < currentGen[0].length)) {
            if (currentGen[row + 1][col + 1]) {
                numOfNeighbors++;
            }
        }
        if ((row < currentGen.length) && (col + 1 < currentGen[0].length)) {
            if (currentGen[row][col + 1]) {
                numOfNeighbors++;
            }
        }
        if ((row - 1 >= 0) && (col + 1 < currentGen[0].length)) {
            if (currentGen[row - 1][col + 1]) {
                numOfNeighbors++;
            }
        }
        if ((row - 1 >= 0) && (col < currentGen[0].length)) {
            if (currentGen[row - 1][col]) {
                numOfNeighbors++;
            }
        }
        return numOfNeighbors;
    }
}

