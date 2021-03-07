package students.bogdans_pavlovs.lesson_6.level_6;

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe {



    public void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            //printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            //printFieldToConsole(field);
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


    //etc.

    public void printFieldToConsole(int[][] field) {
        // распечатайте поле на консоль в читаемом формате
        for (int[] i : field) {
            System.out.println(Arrays.toString(i));
        }
    }

    public int[][] createField(){

        int[][] field = new int[3][3];

        for (int i = 0; i < field.length; i++){

            for (int j = 0; j < field.length; j++){

               field[i][j] = -1;

            }

        }

        return field;

    }

    public Move getNextMove() {

        Scanner scanner = new Scanner(System.in);

        // запросите у пользователя с консоли две координаты
        System.out.print("Enter 1st coordinate (0 - 2): ");

        int x = scanner.nextInt();

        System.out.print("Enter 2nd coordinate (0 - 2): ");

        int y = scanner.nextInt();

        // верните созданный объект Move из метода.
        return new Move(x, y);
    }




    //Check Result

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {

        for (int i = 0; i < field.length; i++) {
            int count = 0;

            for (int j = 0; j < field[i].length; j++) {

                if (field[i][j] == playerToCheck) {

                    count++;
                    if (count == 3) {

                        return true;

                    }
                }
            }
        }

        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {

        for (int i = 0; i < field.length; i++) {
            int count = 0;

            for (int j = 0; j < field[i].length; j++) {

                if (field[j][i] == playerToCheck) {

                    count++;
                    if (count == 3) {

                        return true;

                    }
                }
            }
        }

        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {

        int count = 0;

        for (int i = 0; i < field.length; i++) {

            if (field[i][i] == playerToCheck) {

                count++;
                if (count == 3) {

                    return true;

                }
            }

        }

        return field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck){

        return (isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForDiagonals(field, playerToCheck));

    }

    public boolean isDrawPosition(int[][] field){

        if (!isWinPosition(field, 0) && !isWinPosition(field, 1)) {

            return isFull(field);
        }

        return false;
    }

    public boolean isFull(int[][] field){

        for (int i = 0; i < field.length; i++){

            for (int j = 0; j < field.length; j++){

                if (field[i][j] == -1){
                    return false;
                }
            }


        }
        return true;

    }


}
