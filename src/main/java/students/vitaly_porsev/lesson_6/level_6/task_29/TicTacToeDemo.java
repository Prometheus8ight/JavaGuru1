package students.vitaly_porsev.lesson_6.level_6.task_29;

class TicTacToeDemo {
    public static void main(String[] args) {
        TicTacToe method = new TicTacToe();
        int[][] field = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        method.printFieldToConsole(field);
    }
}