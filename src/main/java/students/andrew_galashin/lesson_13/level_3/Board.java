package students.andrew_galashin.lesson_13.level_3;

class Board {
    boolean[][] board;

    public Board(int height, int width){
        this.board = new boolean[height][width];
    }

    public boolean[][] getBoard() {
        return board;
    }
    public void ttrue(int x, int y){
        board[x][y] = true;
    }


}
