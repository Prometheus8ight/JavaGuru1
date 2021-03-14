package students.kristine_paskevica.lesson_6.level_6;

import java.util.Arrays;

class TicTacToe {

    public int[][] createField() {
        int[][] lauks = new int[3][3];
        fillField(lauks);
        return lauks;
    }
    private void fillField(int[][] lauks){
        for (int[] ints: lauks){
            Arrays.fill(ints, -1);
        }
    }
}
