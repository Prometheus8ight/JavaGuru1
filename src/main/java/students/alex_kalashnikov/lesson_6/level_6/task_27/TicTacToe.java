package students.alex_kalashnikov.lesson_6.level_6.task_27;

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

}
