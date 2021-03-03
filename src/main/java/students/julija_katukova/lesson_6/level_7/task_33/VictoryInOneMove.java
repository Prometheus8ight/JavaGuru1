package students.julija_katukova.lesson_6.level_7.task_33;

public class VictoryInOneMove {

    public void victoryInOneMove(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        while (true) {
            Move move2 = ticTacToe.getNextRandomMove();
            if (field[move2.getX()][move2.getY()] == -1) {
                field[move2.getX()][move2.getY()] = playerToCheck;
                if (ticTacToe.isWinPosition(field, playerToCheck)) {
                    break;
                }
            }
        }
    }

    public boolean isVictoryInOneMovePosition(int[][] field, int playerToCheck) {
        boolean victoryInOneMoveForHorizontals = isVictoryInOneMoveForHorizontals(field, playerToCheck);
        boolean victoryInOneMoveForVerticals = isVictoryInOneMoveForVerticals(field, playerToCheck);
        boolean victoryInOneMoveForDiagonals = isVictoryInOneMoveForDiagonals(field, playerToCheck);
        return victoryInOneMoveForHorizontals || victoryInOneMoveForVerticals || victoryInOneMoveForDiagonals;
    }

    public boolean isVictoryInOneMoveForHorizontals(int[][] field, int playerToCheck) {
        return checkVictoryInOneMoveForHorizontals(field, playerToCheck);
    }

    public boolean isVictoryInOneMoveForVerticals(int[][] field, int playerToCheck) {
        return checkVictoryInOneMoveForVerticals(field, playerToCheck);
    }

    public boolean isVictoryInOneMoveForDiagonals(int[][] field, int playerToCheck) {
        return checkVictoryInOneMoveForDiagonals(field, playerToCheck);
    }

    public boolean checkVictoryInOneMoveForHorizontals(int[][] field, int playerToCheck) {
        for (int[] ints : field) {
            int count = 0;
            for (int anInt : ints) {
                if (anInt == playerToCheck) {
                    count++;
                }
                if (count == (field.length - 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkVictoryInOneMoveForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            int count = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[j][i] == playerToCheck) {
                    count++;
                }
                if (count == (field[i].length - 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkVictoryInOneMoveForDiagonals(int[][] field, int playerToCheck) {
        boolean check1 = checkVictoryInOneMoveFromLeftCorner(field, playerToCheck);
        boolean check2 = checkVictoryInOneMoveFromRightCorner(field, playerToCheck);
        return check1 || check2;
    }

    public boolean checkVictoryInOneMoveFromLeftCorner(int[][] field, int playerToCheck) { //для диагонали слевого верхнего угла, в правый нижний угол
        int count = 0;
        int j = 0;
        for (int[] ints : field) {
            if (ints[j] == playerToCheck) {
                count++;
            }
            j++;
            if (count == (field.length - 1)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkVictoryInOneMoveFromRightCorner(int[][] field, int playerToCheck) { //для диагонали справого верхнего угла, в левый нижний угол
        int count = 0;
        int j = field.length - 1;
        for (int[] ints : field) {
            if (ints[j] == playerToCheck) {
                count++;
            }
            j--;
            if (count == (field.length - 1)) {
                return true;
            }
        }
        return false;
    }
}
