package students.andrew_galashin.lesson_6.level_6.task_27;

import java.util.Arrays;

class TicTacToe {
    public int[][] createField() {
        int field[][] = new int[3][3];
        fill(field);
        return field;
    }

    void fill(int[][] field) {
        for (int[] arr : field) {
            Arrays.fill(arr, -1);
        }
    }

    public boolean field(int[][] field) {
        for (int[] arr : field) {
            for (int i : arr) {
                if (i != -1) {
                    return false;
                }
            }
        }
        return true;
    }
}
