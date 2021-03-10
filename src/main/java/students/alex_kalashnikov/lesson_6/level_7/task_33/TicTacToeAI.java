package students.alex_kalashnikov.lesson_6.level_7.task_33;

class TicTacToeAI {

    // возвращает номер ряда, где два значения равны "X"
    private static int computerHorizontal(String[][] field, String playerToCheck) {
        int row = -1;
        for (int i = 0; i < field.length; i++) {
            int numberOfMoves = 0;
            int emptyField = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[i][j].equals(playerToCheck)) {
                    numberOfMoves++;
                }
                if (field[i][j] == ".") {
                    emptyField++;
                }
                if (numberOfMoves == 2 && emptyField == 1) {
                    row = i;
                }
            }
        }
        return row;
    }

    // возвращает номер колонки, где два значения равны "X"
    private static int computerVertical(String[][] field, String playerToCheck) {
        int column = -1;
        for (int i = 0; i < field.length; i++) {
            int numberOfMoves = 0;
            int emptyField = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[j][i].equals(playerToCheck)) {
                    numberOfMoves++;
                }
                if (field[j][i] == ".") {
                    emptyField++;
                }
                if (numberOfMoves == 2 && emptyField == 1) {
                    column = i;
                }
            }
        }
        return column;
    }

    // возвращает номер ряда и колонки в диагонали 1, где два значения равны "X"
    private static int computerDiagonalOne(String[][] field, String playerToCheck) {
        boolean x = false;
        int rowAndColumn = -1;
        int numberOfMoves = 0;
        int emptyField = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i].equals(playerToCheck)) {
                numberOfMoves++;
            }
            if (field[i][i] == ".") {
                emptyField++;
                rowAndColumn = i;
            }
            if (numberOfMoves == 2 && emptyField == 1) {
                x = true;
            }
        }
        if (x) {
            return rowAndColumn;
        } else {
            return -1;
        }
    }

    // возвращает номер ряда в диагонали 2, где два значения равны "X"
    private static int computerDiagonalTwo(String[][] field, String playerToCheck) {
        boolean x = false;
        int row = -1;
        int numberOfMoves = 0;
        int emptyField = 0;
        int i = 0;
        for (int j = 2; j > -1; j--) {
            if (field[i][j].equals(playerToCheck)) {
                numberOfMoves++;
            }
            if (field[i][j] == ".") {
                emptyField++;
                row = i;
            }
            i++;
            if (numberOfMoves == 2 && emptyField == 1) {
                x = true;
            }
        }
        if (x) {
            return row;
        } else {
            return -1;
        }
    }

    private static int computerDefenceHorizontal(String[][] field) {
        return computerHorizontal(field, "0");
    }

    private static int computerDefenceVertical(String[][] field) {
        return computerVertical(field, "0");
    }

    private static int computerDefenceDiagonalOne(String[][] field) {
        return computerDiagonalOne(field, "0");
    }

    private static int computerDefenceDiagonalTwo(String[][] field) {
        return computerDiagonalTwo(field, "0");
    }

    private static boolean checkEmptyField(String[][] field, int x, int y) {
        return field[x][y].equals(".");
    }


    private static Move findNextMoveCoordinates(String[][] field) {
        boolean checkField = true;
        int x = 0;
        int y = 0;

        if (computerHorizontal(field, "X") > -1) {
            x = computerHorizontal(field, "X");
            while (checkField) {
                y = (int) (Math.random() * 3);
                if (field[x][y].equals(".")) {
                    checkField = false;
                }
            }
        }

        if (computerVertical(field, "X") > -1 && computerHorizontal(field, "X") == -1) {
            y = computerVertical(field, "X");
            while (checkField) {
                x = (int) (Math.random() * 3);
                if (field[x][y].equals(".")) {
                    checkField = false;
                }
            }
        }

        if (computerDiagonalOne(field, "X") > -1 && computerHorizontal(field, "X") == -1
                && computerVertical(field, "X") == -1) {
            x = computerDiagonalOne(field, "X");
            y = computerDiagonalOne(field, "X");
            if (field[x][y].equals(".")) {
                checkField = false;
            }
        }

        if (computerDiagonalTwo(field, "X") > -1 && computerHorizontal(field, "X") == -1
                && computerVertical(field, "X") == -1
                && computerDiagonalOne(field, "X") == -1) {
            x = computerDiagonalTwo(field, "X");
            switch (x) {
                case 0:
                    y = 2;
                    break;
                case 1:
                    y = 1;
                    break;
                case 2:
                    y = 0;
            }
            if (field[x][y].equals(".")) {
                checkField = false;
            }
        }

        if (computerDefenceHorizontal(field) > -1 && computerHorizontal(field, "X") == -1
                && computerVertical(field, "X") == -1 && computerDiagonalOne(field, "X") == -1
                && computerDiagonalTwo(field, "X") == -1) {
            x = computerDefenceHorizontal(field);
            while (checkField) {
                y = (int) (Math.random() * 3);
                if (field[x][y].equals(".")) {
                    checkField = false;
                }
            }
        }

        if (computerDefenceVertical(field) > -1 && computerDefenceHorizontal(field) == -1
                && computerHorizontal(field, "X") == -1 && computerVertical(field, "X") == -1
                && computerDiagonalOne(field, "X") == -1
                && computerDiagonalTwo(field, "X") == -1) {
            y = computerDefenceVertical(field);
            while (checkField) {
                x = (int) (Math.random() * 3);
                if (field[x][y].equals(".")) {
                    checkField = false;
                }
            }
        }

        if (computerDefenceDiagonalOne(field) > -1 && computerDefenceVertical(field) == -1
                && computerDefenceHorizontal(field) == -1
                && computerHorizontal(field, "X") == -1 && computerVertical(field, "X") == -1
                && computerDiagonalOne(field, "X") == -1
                && computerDiagonalTwo(field, "X") == -1) {
            x = computerDefenceDiagonalOne(field);
            y = computerDefenceDiagonalOne(field);
            if (field[x][y].equals(".")) {
                checkField = false;

            }
        }

        if (computerDefenceDiagonalTwo(field) > -1 && computerDefenceDiagonalOne(field) == -1
                && computerDefenceVertical(field) == -1 && computerDefenceHorizontal(field) == -1
                && computerHorizontal(field, "X") == -1 && computerVertical(field, "X") == -1
                && computerDiagonalOne(field, "X") == -1
                && computerDiagonalTwo(field, "X") == -1) {
            x = computerDefenceDiagonalTwo(field);
            switch (computerDefenceDiagonalTwo(field)) {
                case 0:
                    y = 2;
                    break;
                case 1:
                    y = 1;
                    break;
                case 2:
                    y = 0;
            }
            if (field[x][y].equals(".")) {
                checkField = false;
            }
        } else {
            while (checkField) {
                x = (int) (Math.random() * 3);
                y = (int) (Math.random() * 3);
                if (field[x][y].equals(".")) {
                    checkField = false;
                }
            }
        }
        return new Move(x, y);
    }

    public static Move computer(String[][] field) {
        return findNextMoveCoordinates(field);
    }

    /*======================================= конец секции ИИ ======================================================= */


}
