package students.julija_katukova.lesson_9.level_7.task_34;

import java.util.Arrays;
import java.util.Scanner;

class ConnectFour { // 2 players: red and yellow
    private final char[][] field = new char[6][7]; // field with 6 rows and 7 columns
    private WinningRule[] winningRules = initializeArray();

    public static void main(String[] args) {
        ConnectFour game = new ConnectFour();
        game.play();
    }

    private void play() {
        WinningDetector winningDetector = new WinningDetector(winningRules);
        char[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move moveR = getNextMove();
            field[moveR.getRow()][moveR.getColumn()] = 'R';
            printFieldToConsole(field);

            if (winningDetector.isWin(field)) {
                System.out.println("Red player WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move moveY = getNextMove();
            field[moveY.getRow()][moveY.getColumn()] = 'Y';
            printFieldToConsole(field);
            if (winningDetector.isWin(field)) {
                System.out.println("Yellow player WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    private char[][] createField() {
        for (char[] chars : field) {
            Arrays.fill(chars, '.');
        }
        return field;
    }

    private void printFieldToConsole(char[][] field) {
        for (char[] chars : field) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }

    private boolean isEmptySpots(char[][] field) {
        char emptyToCheck = '.';
        for (char[] chars : field) {
            for (int aChar : chars) {
                if (aChar == emptyToCheck) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isDraw(char[][] field) {
        WinningDetector winningDetector = new WinningDetector(winningRules);
        return !winningDetector.isWin(field) && !isEmptySpots(field);
    }

    private Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter row (from 0 to 5) for your next move: ");//// запросите у пользователя с консоли две координаты
        int row = scanner.nextInt();
        System.out.println("Please enter column (from 0 to 6) for your next move: ");
        int column = scanner.nextInt();
        return new Move(row, column);
    }

    private WinningRule[] initializeArray() {
        return new WinningRule[]{
                new WinningRuleForVerticals("Winning Rule For Verticals"),
                new WinningRuleForHorizontals("Winning Rule For Horizontals"),
                new WinningRuleForDiagonalFromLeftCorner("Winning Rule For Diagonal From Left Corner"),
                new WinningRuleForDiagonalFromRightCorner("Winning Rule For Diagonals From Right Corner")
        };
    }

}
