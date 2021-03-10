package students.alex_kalashnikov.lesson_6.level_7.task_33;

class TicTacToe {

    public String[][] createField() {
        String[][] array = new String[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = ".";
            }
        }
        return array;
    }

    public Move getFromKeyboard(String[][] field, String playerToCheck) { // запрашивает координаты ячейки [X,Y] - числа от 0 до 2
        boolean checkX = true; // проверяет число X
        boolean checkY = true;  // проверяет число Y
        boolean checkField = true;// проверяет был ли уже ход в ячейке [X,Y] массива
        int x = 0;
        int y = 0;
        while (checkField) { // если в ячейке был ход, то запускает цикл заново, пока игрок не заведет координаты ячейки со значением "."
            while (checkX) { // если число правильное, то прерывает цикл
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                System.out.print("Player " + playerToCheck + " enter X (0 - 2): ");
                x = scanner.nextInt();
                if (x == 0 || x == 1 || x == 2) {
                    checkX = false;
                } else {
                    System.out.println("Wrong number! Please, reenter!");
                }
            }
            while (checkY) { // если число правильное, то прерывает цикл
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                System.out.print("Player " + playerToCheck + " enter Y (0 - 2): ");
                y = scanner.nextInt();
                if (y == 0 || y == 1 || y == 2) {
                    checkY = false;
                } else {
                    System.out.println("Wrong number! Please, reenter!");
                }
            }
            if (field[x][y] == "0" || field[x][y] == "X") {
                System.out.println("This cell already occupied!!! Please, reenter!");
                checkX = true;
                checkY = true;
            } else {
                checkField = false;
            }
        }
        return new Move(x, y);
    }

    /*======================================= начало секции ИИ ====================================================== */

    // возвращает номер ряда, где два значения равны "X"
    public int computerHorizontal(String[][] field, String playerToCheck) {
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
    public int computerVertical(String[][] field, String playerToCheck) {
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
    public int computerDiagonalOne(String[][] field, String playerToCheck) {
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
    public int computerDiagonalTwo(String[][] field, String playerToCheck) {
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

    public int computerDefenceHorizontal(String[][] field) {
        return computerHorizontal(field, "0");
    }

    public int computerDefenceVertical(String[][] field) {
        return computerVertical(field, "0");
    }

    public int computerDefenceDiagonalOne(String[][] field) {
        return computerDiagonalOne(field, "0");
    }

    public int computerDefenceDiagonalTwo(String[][] field) {
        return computerDiagonalTwo(field, "0");
    }


    public Move computer(String[][] field) {
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

    /*======================================= конец секции ИИ ======================================================= */

    public void printFieldToConsole(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            System.out.print(field[0][i] + "  ");
        }
        System.out.println(" ");
        for (int i = 0; i < field.length; i++) {
            System.out.print(field[1][i] + "  ");
        }
        System.out.println(" ");
        for (int i = 0; i < field.length; i++) {
            System.out.print(field[2][i] + "  ");
        }
        System.out.println(" ");
    }

    public boolean isWinPositionForHorizontals(String[][] field, String playerToCheck) {
        boolean hit = false;
        for (int i = 0; i < field.length; i++) {
            int numberOfHits = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == playerToCheck) {
                    numberOfHits++;
                }
            }
            if (numberOfHits == 3) {
                return hit = true;
            }
        }
        return hit;
    }

    public boolean isWinPositionForVerticals(String[][] field, String playerToCheck) {
        boolean hit = false;
        for (int i = 0; i < field.length; i++) {
            int numberOfHits = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[j][i] == playerToCheck) {
                    numberOfHits++;
                }
            }
            if (numberOfHits == 3) {
                return hit = true;
            }
        }
        return hit;
    }

    public boolean isWinPositionForDiagonals(String[][] field, String playerToCheck) {
        boolean hit = false;
        boolean hit1 = false;
        int j = 0;
        int k = 0;
        int numberOfHits = 0;
        int numberOfHits1 = 0;

        for (int i = 0; i < field.length; i++) {                    // для одной диагонали
            if (field[i][j] == playerToCheck) {
                numberOfHits++;
            }
            j++;
            if (numberOfHits == 3) {
                return hit = true;
            }
        }
        for (int i = 2; i > -1; i--) {                              // для другой диагонали
            if (field[k][i] == playerToCheck) {
                numberOfHits1++;
            }
            k++;
            if (numberOfHits1 == 3) {
                return hit1 = true;
            }
        }
        return hit || hit1;
    }

    public boolean isWinPosition(String[][] field, String playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(String[][] field) {
        if (isWinPosition(field, "0") || isWinPosition(field, "X")) {
            return false;
        } else {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    if (field[i][j] == ".") {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public void play() {
        String[][] field = createField();
        printFieldToConsole(field);
        while (true) {
            Move move0 = getFromKeyboard(field, "0");
            field[move0.getX()][move0.getY()] = "0";
            if (isWinPosition(field, "0")) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            Move move1 = computer(field);
            field[move1.getX()][move1.getY()] = "X";
            printFieldToConsole(field);
            if (isWinPosition(field, "X")) {
                System.out.println("Computer WINS!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

}