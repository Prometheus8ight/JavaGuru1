package students.julija_katukova.lesson_13.level_3;

class Field {

    private boolean[][] field;

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
