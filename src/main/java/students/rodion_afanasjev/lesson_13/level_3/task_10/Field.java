package students.rodion_afanasjev.lesson_13.level_3.task_10;

class Field {

    private boolean[][] field;

    public Field(int width, int height) {
        this.field = new boolean[width][height];
    }

    public boolean[][] getField() {
        return field;
    }

}
