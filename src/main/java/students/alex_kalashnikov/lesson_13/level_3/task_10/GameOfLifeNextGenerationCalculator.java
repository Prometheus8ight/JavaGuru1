package students.alex_kalashnikov.lesson_13.level_3.task_10;

class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] nextGeneration = copyTwoDimensionalArr(currentGeneration);
        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration.length; j++) {
                if (!checkRuleOne(currentGeneration, i, j)) {
                    nextGeneration[i][j] = false;
                }
                if (checkRuleTwo(currentGeneration, i, j)) {
                    nextGeneration[i][j] = false;
                }
                if (!currentGeneration[i][j] && checkRuleFour(currentGeneration, i, j)) {
                    nextGeneration[i][j] = true;
                }
            }
        }
        return nextGeneration;
    }

    private boolean[][] copyTwoDimensionalArr(boolean[][] currentGeneration) {
        boolean[][] arr = new boolean[10][10];
        for (int x = 0; x < currentGeneration.length; x++) {
            for (int y = 0; y < currentGeneration.length; y++) {
                arr[x][y] = currentGeneration[x][y];
            }
        }
        return arr;
    }

    // Первое правило - любая живая клетка с меньше чем двумя живыми соседями умирает в следующем поколении.
    private boolean checkRuleOne(boolean[][] currentGeneration, int row, int col) {
        int counter = 0;
        for (int i = row - 1; i < row + 2; i++) {
            for (int j = col - 1; j < col + 2; j++) {
                if (i == row && j == col) {
                    continue;
                } else if (currentGeneration[shiftRow(currentGeneration, i)][shiftColumn(currentGeneration, j)]) {
                    counter++;
                }
            }
        }
        return counter >= 2;
    }

    // Второе правило - любая живая клетка с больше чем тремя живыми соседями умирает в следующем поколении.
    private boolean checkRuleTwo(boolean[][] currentGeneration, int row, int col) {
        int counter = 0;
        for (int i = row - 1; i < row + 2; i++) {
            for (int j = col - 1; j < col + 2; j++) {
                if (i == row && j == col) {
                    continue;
                } else if (currentGeneration[shiftRow(currentGeneration, i)][shiftColumn(currentGeneration, j)]) {
                    counter++;
                }
            }
        }
        return counter > 3;
    }

    /*
     Третье правило - любая живая клетка с двумя или тремя живыми соседями остаётся живой в следующем поколении.
     Первое и Второе правила подразумевают Третье.
     */


    // Четвертое правило - любая мёртвая клетка с тремя живыми соседями становится живой в следующем поколении.
    private boolean checkRuleFour(boolean[][] currentGeneration, int row, int col) {
        int counter = 0;
        for (int i = row - 1; i < row + 2; i++) {
            for (int j = col - 1; j < col + 2; j++) {
                if (i == row && j == col) {
                    continue;
                } else if (currentGeneration[shiftRow(currentGeneration, i)][shiftColumn(currentGeneration, j)]) {
                    counter++;
                }
            }
        }
        return counter == 3;
    }

    // колонки 0 и 9 - соседние!
    private int shiftColumn(boolean[][] currentGeneration, int col) {
        if (col > -1 && col < currentGeneration.length) {
            return col;
        } else if (col == -1) {
            return currentGeneration.length - 1;
        } else {
            return 0;
        }
    }

    // ряды 0 и 9 - соседние!
    private int shiftRow(boolean[][] currentGeneration, int row) {
        if (row > -1 && row < currentGeneration.length) {
            return row;
        } else if (row == -1) {
            return currentGeneration.length - 1;
        } else {
            return 0;
        }
    }

}