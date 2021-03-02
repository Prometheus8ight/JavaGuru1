package students.Dmitry_Gr.lesson_6.level_5.Task_24;

public class TicTacToe {
    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i = 0; i < field.length; i++) {
            toright &= (field[i][i] == playerToCheck);
            toleft &= (field[field.length - i - 1][i] == playerToCheck);
        }

        if (toright || toleft) return true;
        return false;
    }
}
