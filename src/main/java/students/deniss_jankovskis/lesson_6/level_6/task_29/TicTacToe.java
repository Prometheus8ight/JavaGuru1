package students.deniss_jankovskis.lesson_6.level_6.task_29;

import java.util.Arrays;

class TicTacToe {

    public void printFieldToConsole(int[][] field) {

        for (int[] ints : field) {
            for (int anInt : ints) {
                System.out.println(anInt + " ");
            }

            System.out.println(Arrays.toString(ints));
        }
    }
}
