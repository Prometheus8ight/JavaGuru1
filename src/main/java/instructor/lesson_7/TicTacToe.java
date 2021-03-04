package instructor.lesson_7;

public class TicTacToe {

    public boolean isWin() {
        return isHorizontalWin() || isVerticalWin() || isDiagonalWin();
    }

    public boolean isDraw() {
        return !isWin() || hasEmptyCells();
    }

    private boolean hasEmptyCells() {
        return true;
    }

    private boolean isHorizontalWin() {
        return true;
    }

    private boolean isVerticalWin() {
        return true;
    }

    private boolean isDiagonalWin() {
        return true;
    }
}
