package students.deniss_jankovskis.lesson_13.level_3;

class Field {

    private boolean[][] field;

    public Field(int width, int height) {
        this.field = new boolean[width][height];
    }

    public boolean[][] getField() {
        return field;
    }

    public void boolTrue(int width, int height) {
        field[width][height] = true;
    }
}
