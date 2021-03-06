package students.alex_kalashnikov.lesson_6.level_6.task_28;

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

    public Move getNextMove() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter X: ");
        int x = scanner.nextInt();

        System.out.print("Enter Y: ");
        int y = scanner.nextInt();

        return new Move(x,y);
    }

}
