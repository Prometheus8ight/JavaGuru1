package students.julija_katukova.lesson_6.level_7.task_33;

import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public void play() {
        int[][] field = createField(3);
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            if (isVictoryInOneMovePosition(field, 1)) { //есть выигрыш в 1 ход - делаем этот ход автоматически
                victoryInOneMove(field, 1);
            /* не доработано - не проверять
            } else if (isVictoryInOneMovePosition(field, 0)) { //опотенет может выиграть в 1 ход - автоматически делаем ход экстренной защиты
                urgentDefenseInOneMove(field, 1, 0); */
            } else {
                randomMoveAI(field, 1); // делаем рандомный ход
            }
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    public void randomMoveAI(int[][] field, int player) {
        while (true) {
            Move move1 = getNextRandomMove();
            if (field[move1.getX()][move1.getY()] == -1) {
                field[move1.getX()][move1.getY()] = player;
                break;
            }
        }
    }
/* Метод не доработан - не проверять
    public void urgentDefenseInOneMove(int[][] field, int playerToCheck, int opponent) {
        while (true) {
            Move move3 = getNextRandomMove();
            if (field[move3.getX()][move3.getY()] == -1) {
                field[move3.getX()][move3.getY()] = playerToCheck;
                if (!isVictoryInOneMovePosition(field, opponent)){
                    break;
                }
            }
        }
    }*/

    public void victoryInOneMove(int[][] field, int playerToCheck) {
        while (true) {
            Move move2 = getNextRandomMove();
            if (field[move2.getX()][move2.getY()] == -1) {
                field[move2.getX()][move2.getY()] = playerToCheck;
                if (isWinPosition(field, playerToCheck)) {
                    break;
                }
            }
        }
    }

    public int[][] createField(int length) { //добавила параментр длинны массива, чтобы при необходимости можно было играть и на поле 4 на 4, например
        int[][] field = new int[length][length];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) { //а через arrays.fill нельзя было?
                field[i][j] = -1;
            }
        }
        return field;
    }

    public void printFieldToConsole(int[][] field) {
        for (int[] ints : field) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Х coordinate for your next move: ");//// запросите у пользователя с консоли две координаты
        int x = scanner.nextInt();
        System.out.println("Please enter Y coordinate for your next move: ");
        int y = scanner.nextInt();
        Move move = new Move(x, y);
        return move;
    }

    public Move getNextRandomMove() {
        Random random = new Random();
        int x = random.nextInt(2); //заменили вместо ввода на использование рандомных значений для определения индекса элемента
        int y = random.nextInt(2);
        Move move = new Move(x, y);
        return move;
    }

    public boolean isDraw(int[][] field) {
        return !isWin(field) && !isEmptySpots(field);
    }

    public boolean isEmptySpots(int[][] field) {
        int emptyToCheck = -1;
        for (int[] ints : field) {
            for (int anInt : ints) {
                if (anInt == emptyToCheck) {
                    return true;
                }
            }
        }
        return false;
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

    public boolean isWin(int[][] field) {
        boolean winFor0 = isWinPosition(field, 0);
        boolean winFor1 = isWinPosition(field, 1);
        return winFor0 || winFor1;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        boolean winHorizontals = isWinPositionForHorizontals(field, playerToCheck);
        boolean winVerticals = isWinPositionForVerticals(field, playerToCheck);
        boolean winDiagonals = isWinPositionForDiagonals(field, playerToCheck);
        return winHorizontals || winVerticals || winDiagonals;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        return checkForHorizontals(field, playerToCheck);
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        return checkForVerticals(field, playerToCheck);
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return checkForDiagonals(field, playerToCheck);
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

    public boolean fromLeftCorner(int[][] field, int playerToCheck) { //для диагонали слевого верхнего угла, в правый нижний угол
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

    public boolean fromRightCorner(int[][] field, int playerToCheck) { //для диагонали справого верхнего угла, в левый нижний угол
        int count = 0;
        int j = field.length - 1;
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
