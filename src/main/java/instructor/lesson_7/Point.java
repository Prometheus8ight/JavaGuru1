package instructor.lesson_7;

class Point {

    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getDoubledX() {
        return x * 2;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        if (x > 0) {
            this.x = x;
        } else {
            this.x = 0;
        }
    }

    public void setY(int y) {
        if (x > 0) {
            this.y = y;
        } else {
            this.y = 0;
        }
    }
}
