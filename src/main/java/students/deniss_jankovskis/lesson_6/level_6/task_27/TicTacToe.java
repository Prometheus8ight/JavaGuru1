package students.deniss_jankovskis.lesson_6.level_6.task_27;

class TicTacToe {

    public int[][] createField() {

        int[][] field = new int[3][3]; //добавил поля
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                field[i][j] = -1;
            }
        }
        return field;

    }
}




