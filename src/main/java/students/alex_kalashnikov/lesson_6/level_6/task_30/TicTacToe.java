package students.alex_kalashnikov.lesson_6.level_6.task_30;

class TicTacToe {

    public int[][] createField() {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = -1;
            }
        }
        return array;
    }

    public Move getFromKeyboard(int[][] field, int playerToCheck) { // запрашивает числа X и Y от 0 до 2
        boolean checkX = true; // проверяет число X
        boolean checkY = true;  // проверяет число Y
        boolean checkField = true;// проверяет был ли уже ход в ячейке массива [X,Y]
        int x = 0;
        int y = 0;
        while (checkField) { // если в ячейке был ход, то запускает цикл заново, пока игрок не заведет координаты ячейки со значением -1
            while (checkX) { // если число правильное, то прерывает цикл
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                System.out.print("Player " + playerToCheck + " enter X: ");
                x = scanner.nextInt();
                if (x == 0 || x == 1 || x == 2) {
                    checkX = false;
                } else {
                    System.out.println("Wrong number! Please, reenter!");
                }
            }
            while (checkY) { // если число правильное, то прерывает цикл
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                System.out.print("Player " + playerToCheck + " enter Y: ");
                y = scanner.nextInt();
                if (y == 0 || y == 1 || y == 2) {
                    checkY = false;
                } else {
                    System.out.println("Wrong number! Please, reenter!");
                }
            }
            if (field[x][y] == 0 || field[x][y] == 1) {
                System.out.println("Field already moved!!!");
                checkX = true;
                checkY = true;
            } else {
                checkField = false;
            }
        }
        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
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

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
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

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
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

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
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

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        if (isWinPosition(field, 0) || isWinPosition(field, 1)) {
            return false;
        } else {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    if (field[i][j] == -1) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getFromKeyboard(field, 0);
            field[move0.getX()][move0.getY()] = 0;
//            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getFromKeyboard(field, 1);
            field[move1.getX()][move1.getY()] = 1;
//            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

}
