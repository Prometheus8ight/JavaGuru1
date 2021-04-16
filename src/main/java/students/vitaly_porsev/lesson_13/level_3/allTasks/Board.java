package students.vitaly_porsev.lesson_13.level_3.allTasks;

public class Board {

    private boolean[][] board;
    private int width;
    private int height;

    public Board(int height, int width) {
        this.board = new boolean[height][width];
    }

    public boolean[][] getBoard() {
        return board;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void makeTrue(int a, int b) {
        board[a][b] = true;
    }

    public void printBoard() {
        for (boolean[] aBooleans : board) {
            System.out.println("");
            for (boolean bBoolean : aBooleans) {
                System.out.print(bBoolean + " ");
            }
        }
    }
}
