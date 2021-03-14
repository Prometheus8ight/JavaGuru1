package students.deniss_jankovskis.lesson_6.level_5.task_22;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {

        int count = 0;
        for (int[] ints : field) {
            for (int anInt : ints) {
                if (anInt == playerToCheck) {
                    count++;
                }
                if (count == ints.length) {
                    return true;
                }

            }

        }
        return false;

    }

}


