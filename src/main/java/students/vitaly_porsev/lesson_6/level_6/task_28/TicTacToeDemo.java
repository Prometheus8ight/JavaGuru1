package students.vitaly_porsev.lesson_6.level_6.task_28;

class TicTacToeDemo {
    public static void main(String[] args) {
        TicTacToe method = new TicTacToe();
        Move coordinates = method.getNextMove();
        System.out.println(coordinates);
    }
}
