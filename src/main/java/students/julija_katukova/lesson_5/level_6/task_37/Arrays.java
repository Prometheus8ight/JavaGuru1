package students.julija_katukova.lesson_5.level_6.task_37;

class Arrays {
    public int findMin(int[] array) {
        return java.util.Arrays.stream(array).min().getAsInt();
    }
}
