package students.kate_br.lesson_6.leevel_6.task_30;

import java.util.Scanner;

public class TicTacToe {

    public boolean isWinPosition(int[][] field, int playerToCheck){

        boolean isWinHorizontal = isWinPositionForHorizontals(field, playerToCheck);
        boolean isWinVertical = isWinPositionForVerticals(field, playerToCheck);
        boolean isWinDiagonal = isWinPositionForDiagonals(field, playerToCheck);
        return isWinHorizontal || isWinVertical || isWinDiagonal;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {

        return checkHorizontalPosition(field, playerToCheck);
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck){

        return checkVerticalPosition(field, playerToCheck);
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){

        return checkDiagonalPosition(field, playerToCheck);
    }

    public boolean checkHorizontalPosition(int[][] field, int playerToCheck) {

        for (int i = 0; i < field.length; i++) {
            int count = 0;
            for (int j = 0; j < field[i].length; j++){

                if (field[i][j] == playerToCheck){
                    count++;
                }

                if(count == field[i].length){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkVerticalPosition(int[][] field, int playerToCheck){

        for (int i = 0; i < field.length; i++){
            int count = 0;
            for (int j = 0; j < field[i].length; j++){

                if (field[j][i] == playerToCheck){
                    count++;
                }

                if (count == field[i].length){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkDiagonalPosition(int[][] field, int playerToCheck){

        if (field[0][0] == field[1][1] && field[1][1] == field[2][2]){
            return true;
        }else if (field[2][0] == field[1][1] && field[1][1] == field[0][2]){
            return true;
        }
        return false;
    }

    public boolean isDrawPosition(int[][] field){

        return !isWin(field) && !isDraw(field);

    }

    public boolean isDraw(int[][] field){

        int num = -1;

        for (int[] ints : field){
            for (int anInt : ints){

                if (anInt == num){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWin(int[][] field){

        boolean isWinFor0 = isWinPosition(field, 0);
        boolean isWinFor1 = isWinPosition(field,1);
        return isWinFor0 || isWinFor1;
    }

    public int[][] createField(){

        int[][] field = new int[3][3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){

                field[i][j] = -1;
            }
        }
        return field;

    }

    public Move getNextMove(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input coordinates: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field){

        for (int[] ints : field){
            for (int anInt : ints){
                System.out.println(anInt + " ");
            }

            System.out.println();
        }

    }

    public void play(){

        int[][] field = createField();

        while (true){
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWin(field)){
                System.out.println("Player 0 WIN!");
                break;
            }

            if (isDraw(field)){
                System.out.println("DRAW");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWin(field)){
                System.out.println("Player 1 WIN!");
                break;
            }

            if (isDraw(field)){
                System.out.println("DRAW");
                break;
            }


        }
    }




}

