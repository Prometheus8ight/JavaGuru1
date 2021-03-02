package students.julija_katukova.lesson_6.level_6.task_29;

class TicTacToe {
    public void printFieldToConsole(int[][] field) {
        for (int[] ints : field) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
