package students.alex_kalashnikov.lesson_6.level_5.task_24;

class TicTacToeDemo {

    public static void main(String[] args) {

        TicTacToe newGame = new TicTacToe();

        int[][] array = newGame.create(3);
        array[0][0] = -1;
        array[0][1] = 1;
        array[0][2] = 1;
        array[1][0] = -1;
        array[1][1] = 1;
        array[1][2] = 0;
        array[2][0] = 1;
        array[2][1] = -1;
        array[2][2] = 0;

        System.out.println("Win for Horizontal: " + newGame.isWinPositionForHorizontals(array,1));
        System.out.println("Win for Vertical: " + newGame.isWinPositionForVerticals(array,1));
        System.out.println("Win for Diagonal: " + newGame.isWinPositionForDiagonals(array,1));

    }

}
