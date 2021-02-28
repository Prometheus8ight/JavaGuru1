package students.vitaly_porsev.lesson_6.level_6.task_27;

import java.util.Arrays;

class TicTacToe {

    public int[][] createField(){
        int[][] field = new int[3][3];
        for (int[] ints : field) {
            Arrays.fill(ints, -1);
        }
        return field;
    }
}
