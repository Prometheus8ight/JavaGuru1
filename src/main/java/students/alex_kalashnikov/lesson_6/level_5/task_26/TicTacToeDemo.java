package students.alex_kalashnikov.lesson_6.level_5.task_26;

class TicTacToeDemo {

    public static void main(String[] args) {

        TicTacToe newGame = new TicTacToe();

        int[][] array = newGame.create(3);
        array[0][0] = 1;
        array[0][1] = 1;
        array[0][2] = 1;
        array[1][0] = 1;
        array[1][1] = 0;
        array[1][2] = 1;
        array[2][0] = 0;
        array[2][1] = 1;
        array[2][2] = 0;

        System.out.println("Win for Horizontal: " + newGame.isWinPositionForHorizontals(array,0));
        System.out.println("Win for Vertical: " + newGame.isWinPositionForVerticals(array,0));
        System.out.println("Win for Diagonal: " + newGame.isWinPositionForDiagonals(array,0));
        System.out.println("Game Win: " + newGame.isWinPosition(array,0));
        System.out.println("Draw: " + newGame.isDrawPosition(array));

    }

}
