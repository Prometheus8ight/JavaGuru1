package students.julija_katukova.lesson_6.level_5.task_25;

class TicTacToe {
    public boolean isWinPosition(int[][] field, int playerToCheck){
        TicTacToe ticTacToe = new TicTacToe();
            boolean winHorizontals = ticTacToe.isWinPositionForHorizontals(field, playerToCheck);
            boolean winVerticals = ticTacToe.isWinPositionForVerticals(field, playerToCheck);
            boolean winDiagonals = ticTacToe.isWinPositionForDiagonals(field, playerToCheck);
        return winHorizontals || winVerticals || winDiagonals;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        return ticTacToe.checkForHorizontals(field, playerToCheck);
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        return ticTacToe.checkForVerticals(field, playerToCheck);
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        return ticTacToe.checkForDiagonals(field, playerToCheck);
    }

    public boolean checkForHorizontals(int[][] field, int playerToCheck) {
        for (int[] ints : field) {
            int count = 0;
            for (int anInt : ints) {
                if (anInt == playerToCheck) {
                    count++;
                }
                if (count == ints.length) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            int count = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[j][i] == playerToCheck) {
                    count++;
                }
                if (count == field[i].length) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkForDiagonals(int[][] field, int playerToCheck) {
        boolean check1 = fromLeftCorner(field, playerToCheck);
        boolean check2 = fromRightCorner(field, playerToCheck);
        return check1 || check2;
    }

    public boolean fromLeftCorner(int[][] field, int playerToCheck){ //для диагонали слевого верхнего угла, в правый нижний угол
        int count = 0;
        int j = 0;
        for (int[] ints : field) {
            if (ints[j] == playerToCheck) {
                count++;
            }
            j++;
            if (count == ints.length) {
                return true;
            }
        }
        return false;
    }

    public boolean fromRightCorner(int[][] field, int playerToCheck){ //для диагонали справого верхнего угла, в левый нижний угол
        int count = 0;
        int j = field.length-1;
        for (int[] ints : field) {
            if (ints[j] == playerToCheck) {
                count++;
            }
            j--;
            if (count == ints.length) {
                return true;
            }
        }
        return false;
    }

}
