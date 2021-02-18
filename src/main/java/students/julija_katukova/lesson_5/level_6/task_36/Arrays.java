package students.julija_katukova.lesson_5.level_6.task_36;

class Arrays {

    public static int[] create(int length) {
        return new int[length];
    }

    public static int findMax(int[] array) {
        return java.util.Arrays.stream(array).max().getAsInt();
    }
}
