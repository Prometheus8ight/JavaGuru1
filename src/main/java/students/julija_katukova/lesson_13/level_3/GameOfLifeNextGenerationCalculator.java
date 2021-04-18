package students.julija_katukova.lesson_13.level_3;

import java.util.Arrays;

class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] nextGeneration = Arrays.copyOf(currentGeneration, currentGeneration.length);
        for (int row = 0; row < currentGeneration.length; ++row) {
            for (int col = 0; col < currentGeneration[row].length; ++col) {
                final int numNeighbors = countNeighbors(currentGeneration, row, col);
                //Правило 1: Любая живая клетка с меньше чем двумя живыми соседями умирает в следующем поколении.
                //Правило 2: Любая живая клетка с больше чем тремя живыми соседями умирает в следующем поколении.
                if ((numNeighbors < 2) || (numNeighbors > 3)) {
                    nextGeneration[row][col] = false;
                }
                //Правило 3: Любая живая клетка с двумя или тремя живыми соседями остаётся живой в следующем поколении.
                //Правило 4: Любая мёртвая клетка с тремя живыми соседями становится живой в следующем поколении.
                if (numNeighbors == 2 || numNeighbors == 3) {
                    nextGeneration[row][col] = true;
                }
            }
        }

        return nextGeneration;
    }


    private int countNeighbors(boolean[][] currentGeneration, int row, int col) {
        int numNeighbors = 0;

        if ((row - 1 >= 0) && (col - 1 >= 0)) {
            if (currentGeneration[row - 1][col - 1]) {
                numNeighbors++;
            }
        }
        if ((row >= 0) && (col - 1 >= 0)) {
            if (currentGeneration[row][col - 1]) {
                numNeighbors++;
            }
        }
        if ((row + 1 < currentGeneration.length) && (col - 1 >= 0)) {
            if (currentGeneration[row + 1][col - 1]) {
                numNeighbors++;
            }
        }
        if ((row + 1 < currentGeneration.length) && (col < currentGeneration[0].length)) {
            if (currentGeneration[row + 1][col]) {
                numNeighbors++;
            }
        }
        if ((row + 1 < currentGeneration.length) && (col + 1 < currentGeneration[0].length)) {
            if (currentGeneration[row + 1][col + 1]) {
                numNeighbors++;
            }
        }
        if ((row < currentGeneration.length) && (col + 1 < currentGeneration[0].length)) {
            if (currentGeneration[row][col + 1]) {
                numNeighbors++;
            }
        }
        if ((row - 1 >= 0) && (col + 1 < currentGeneration[0].length)) {
            if (currentGeneration[row - 1][col + 1]) {
                numNeighbors++;
            }
        }
        if ((row - 1 >= 0) && (col < currentGeneration[0].length)) {
            if (currentGeneration[row - 1][col]) {
                numNeighbors++;
            }
        }
        return numNeighbors;
    }
}
