package students.rodion_afanasjev.lesson_13.level_3.task_10;

import java.util.Arrays;

class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] nextGen = Arrays.copyOf(currentGeneration, currentGeneration.length);
        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration[i].length; j++) {
                int lives = countNeighbors(currentGeneration, i, j);
                if(currentGeneration[i][j]){
                    if(lives < 2){
                        nextGen[i][j] = false;
                    } else if ((lives == 2) || (lives ==3)){
                        nextGen[i][j] = true;
                    } else if (lives > 3){
                        nextGen[i][j] = false;
                    }
                } else {
                    if(lives == 3){
                        nextGen[i][j] = true;
                    }
                }
            }
        }
        return nextGen;
    }

    private int countNeighbors(boolean[][] currentGeneration, int row, int y) {
        int count = 0;

        if ((row - 1 >= 0) && (y - 1 >= 0)) {
            if (currentGeneration[row - 1][y - 1]) {
                count++;
            }
        }
        if ((row >= 0) && (y - 1 >= 0)) {
            if (currentGeneration[row][y - 1]) {
                count++;
            }
        }
        if ((row + 1 < currentGeneration.length) && (y - 1 >= 0)) {
            if (currentGeneration[row + 1][y - 1]) {
                count++;
            }
        }
        if ((row + 1 < currentGeneration.length) && (y < currentGeneration[0].length)) {
            if (currentGeneration[row + 1][y]) {
                count++;
            }
        }
        if ((row + 1 < currentGeneration.length) && (y + 1 < currentGeneration[0].length)) {
            if (currentGeneration[row + 1][y + 1]) {
                count++;
            }
        }
        if ((row < currentGeneration.length) && (y + 1 < currentGeneration[0].length)) {
            if (currentGeneration[row][y + 1]) {
                count++;
            }
        }
        if ((row - 1 >= 0) && (y + 1 < currentGeneration[0].length)) {
            if (currentGeneration[row - 1][y + 1]) {
                count++;
            }
        }
        if ((row - 1 >= 0) && (y < currentGeneration[0].length)) {
            if (currentGeneration[row - 1][y]) {
                count++;
            }
        }
        return count;
    }

}
