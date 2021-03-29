package students.andrew_galashin.lesson_6.level_6.task_28;

class Move {
    private int x;
    private int y;

    public Move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String string() {
        return "Move {" + "x = " + x + "; y = " + y + "}";
    }
}
