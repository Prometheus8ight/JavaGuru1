package students.vitaly_porsev.lesson_6.level_6.task_29;

import java.util.Arrays;

class TicTacToe {

    public void printFieldToConsole(int[][] field) {
        for (int[] num : field) {
            System.out.println(Arrays.toString(num));
        }
    }
}