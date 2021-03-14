package students.alex_kalashnikov.lesson_6.level_7.task_33;

class TicTacToe {

    private String[][] createField() {
        String[][] array = new String[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = ".";
            }
        }
        return array;
    }

    private Move getFromKeyboard(String[][] field, String playerToCheck) { // запрашивает координаты ячейки [X,Y] - числа от 0 до 2
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

    private void printFieldToConsole(String[][] field) {
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

    private boolean isWinPositionForHorizontals(String[][] field, String playerToCheck) {
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

    private boolean isWinPositionForVerticals(String[][] field, String playerToCheck) {
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

    private boolean isWinPositionForDiagonals(String[][] field, String playerToCheck) {
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

    private boolean isWinPosition(String[][] field, String playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck);
    }

    private boolean isDrawPosition(String[][] field) {
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

            Move move1 = TicTacToeAI.computer(field);
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