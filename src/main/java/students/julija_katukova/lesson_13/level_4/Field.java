package students.julija_katukova.lesson_13.level_4;

class Field {

    private final boolean[][] field;

    public Field(int width, int height) {
        this.field = new boolean[width][height];
    }

    public boolean[][] getField() {
        return field;
    }

    public void setAsTrue(int width, int height) {
        field[width][height] = true;
    }
}