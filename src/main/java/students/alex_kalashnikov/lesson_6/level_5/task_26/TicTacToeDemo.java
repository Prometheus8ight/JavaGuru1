package students.alex_kalashnikov.lesson_6.level_5.task_26;

class TicTacToeDemo {

    public static void main(String[] args) {


        TicTacToe newGame = new TicTacToe();

        int[][] array = newGame.create(3);
        array[0][0] = 1;
        array[0][1] = 0;
        array[0][2] = 0;
        array[1][0] = 1;
        array[1][1] = 0;
        array[1][2] = 1;
        array[2][0] = 0;
        array[2][1] = 1;
        array[2][2] = 0;

        newGame.isWinPositionForHorizontals(array,0);

        System.out.println(newGame.isWinPositionForHorizontals(array,0));
        System.out.println(newGame.isWinPositionForVerticals(array,0));
        System.out.println(newGame.isWinPositionForDiagonals(array,0));
        System.out.println(newGame.isWinPosition(array,0));
        System.out.println(newGame.isDrawPosition(array,0));



    }



}
