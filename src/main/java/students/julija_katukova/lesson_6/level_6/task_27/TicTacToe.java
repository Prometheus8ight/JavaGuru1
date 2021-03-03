package students.julija_katukova.lesson_6.level_6.task_27;

class TicTacToe {
    public int[][] createField(int length) { //добавила параментр длинны массива, чтобы при необходимости можно было играть и на поле 4 на 4, например
        int[][] field = new int[length][length];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) { //а через arrays.fill нельзя было?
                field[i][j] = -1;
            }
        }
        return field;
    }
}
