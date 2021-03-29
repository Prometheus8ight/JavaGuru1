package students.alex_kalashnikov.lesson_9.level_7.task_34;

class ConnectFour {

    private String[][] createField() {
        String[][] array = new String[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                array[i][j] = ".";
            }
        }
        return array;
    }

    private Move getFromKeyboard(String[][] field, String playerToCheck) { // запрашивает координаты ячейки [X,Y]
        boolean checkY = true;  // проверяет число Y
        boolean checkField = true;// проверяет был ли уже ход в ячейке [X,Y] массива
        int x = 0;
        int y = 0;
        while (checkField) { // если в колонке все поля заняты, то запускает цикл заново, пока игрок не выберет колонку со свободным полем "."
            while (checkY) { // если число правильное, то прерывает цикл
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                System.out.print("Player " + playerToCheck + " enter Y (0 - 6): ");
                y = scanner.nextInt();
                if (y >= 0 && y <= 6) {
                    checkY = false;
                } else {
                    System.out.println("Wrong number! Please, reenter!");
                }
            }
            for (int i = 5; i > -1; i--) { // выбирает свободное поле с наибольшим индексом
                if (field[i][y].equals(".")) {
                    x = i;
                    break;
                }
            }
            if (field[x][y].equals("0") || field[x][y].equals("X")) {
                System.out.println("This cell already moved!!! Please, reenter!");
                checkY = true;
            } else {
                checkField = false;
            }
        }
        return new Move(x, y);
    }

    private void printFieldToConsole(String[][] field) {

        for (String[] strings : field) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(strings[j] + "  ");
            }
            System.out.println(" ");
        }
    }

    private boolean isWinPositionForHorizontals(String[][] field, String playerToCheck) {
        boolean hit = false;
        for (String[] strings : field) {
            int numberOfHits = 0;
            for (int j = 0; j < field[0].length; j++) {
                if (strings[j].equals(playerToCheck)) {
                    numberOfHits++;
                } else {
                    numberOfHits = 0;
                }
                if (numberOfHits == 4) {
                    return hit = true;
                }
            }
        }
        return hit;
    }

    private boolean isWinPositionForVerticals(String[][] field, String playerToCheck) {
        boolean hit = false;
        for (int i = 0; i < field[0].length; i++) {
            int numberOfHits = 0;
            for (String[] strings : field) {
                if (strings[i].equals(playerToCheck)) {
                    numberOfHits++;
                } else {
                    numberOfHits = 0;
                }
                if (numberOfHits == 4) {
                    return hit = true;
                }
            }
        }
        return hit;
    }

    private boolean isWinPositionForDiagonals(String[][] field, String playerToCheck) {
        boolean hit = false;
        int j = 0;
        int k = 0;
        int l = 0;
        int numberOfHits = 0;
        int count = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 3; i > -1; i--) {
            if (field[i][j].equals(playerToCheck)) {
                numberOfHits++;
            }
            if (!field[i][j].equals(playerToCheck)) {
                numberOfHits = 0;
            }
            if (numberOfHits == 4) {
                return hit = true;
            }
            j++;
            if (j == 7) {
                break;
            }
            if (i == 0) {
                count++;
                i = 4;
                j = count;
            }
        }

        for (int i = 4; i > 0; i--) {
            if (field[i][k].equals(playerToCheck)) {
                numberOfHits++;
            }
            if (!field[i][k].equals(playerToCheck)) {
                numberOfHits = 0;
            }
            if (numberOfHits == 4) {
                return hit = true;
            }
            k++;
            if (i == 1) {
                count1++;
                i = 5;
                k = count1;
            }
            if (k == 7) {
                break;
            }
        }

        for (int i = 5; i > 1; i--) {
            if (field[i][l].equals(playerToCheck)) {
                numberOfHits++;
            }
            if (!field[i][l].equals(playerToCheck)) {
                numberOfHits = 0;
            }
            if (numberOfHits == 4) {
                return hit = true;
            }
            l++;
            if (i == 2) {
                count2++;
                i = 5;
                l = count2;
            }
            if (l == 7) {
                break;
            }
        }
        return hit;
    }

    private boolean isWinPositionForDiagonals1(String[][] field, String playerToCheck) {
        boolean hit = false;

        int j = 3;
        int k = 4;
        int l = 5;
        int m = 6;
        int numberOfHits = 0;
        int count = 6;
        int count1 = 6;
        int count2 = 6;
        int count3 = 6;

        for (int i = 5; i > -1; i--) {
            if (field[i][j].equals(playerToCheck)) {
                numberOfHits++;
            }
            if (!field[i][j].equals(playerToCheck)) {
                numberOfHits = 0;
            }
            if (numberOfHits == 4) {
                return hit = true;
            }
            j--;
            if (i == 0) {
                break;
            }
            if (j == -1) {
                count--;
                j = 3;
                i = count;
            }
        }

        for (int i = 5; i > -1; i--) {
            if (field[i][k].equals(playerToCheck)) {
                numberOfHits++;
            }
            if (!field[i][k].equals(playerToCheck)) {
                numberOfHits = 0;
            }
            if (numberOfHits == 4) {
                return hit = true;
            }
            k--;
            if (i == 0) {
                break;
            }
            if (k == 0) {
                count1--;
                k = 4;
                i = count1;
            }
        }

        for (int i = 5; i > -1; i--) {
            if (field[i][l].equals(playerToCheck)) {
                numberOfHits++;
            }
            if (!field[i][l].equals(playerToCheck)) {
                numberOfHits = 0;
            }
            if (numberOfHits == 4) {
                return hit = true;
            }
            l--;
            if (i == 0) {
                break;
            }
            if (l == 1) {
                count2--;
                l = 5;
                i = count2;
            }
        }

        for (int i = 5; i > -1; i--) {
            if (field[i][m].equals(playerToCheck)) {
                numberOfHits++;
            }
            if (!field[i][m].equals(playerToCheck)) {
                numberOfHits = 0;
            }
            if (numberOfHits == 4) {
                return hit = true;
            }
            m--;
            if (i == 0) {
                break;
            }
            if (m == 2) {
                count3--;
                m = 6;
                i = count3;
            }
        }

        return hit;
    }

    private boolean isWinPosition(String[][] field, String playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck)
                || isWinPositionForVerticals(field, playerToCheck)
                || isWinPositionForDiagonals(field, playerToCheck)
                || isWinPositionForDiagonals1(field, playerToCheck);
    }

    private boolean isDrawPosition(String[][] field) {
        if (isWinPosition(field, "0") || isWinPosition(field, "X")) {
            return false;
        } else {
            for (String[] strings : field) {
                for (int j = 0; j < field[0].length; j++) {
                    if (strings[j].equals(".")) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public void play() {
        String[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getFromKeyboard(field, "0");
            field[move0.getX()][move0.getY()] = "0";
            if (isWinPosition(field, "0")) {
                System.out.println("Player 0 WIN!");
                printFieldToConsole(field);
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getFromKeyboard(field, "X");
            field[move1.getX()][move1.getY()] = "X";
            if (isWinPosition(field, "X")) {
                printFieldToConsole(field);
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