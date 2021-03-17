package students.deniss_jankovskis.lesson_6.level_7.task_33;

class Move {

    private int x;
    private int y;

    Move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Move{" +
                "x = " + x +
                ", y = " + y +
                '}';
    }
}
