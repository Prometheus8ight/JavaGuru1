package students.julija_katukova.lesson_5.level_6.task_35;

class Arrays {
    public int findMax(int[] array) {
        int max = java.util.Arrays.stream(array).max().getAsInt();
        return max;
    }
}
