package students.lolita_polakova.lesson_5.level_6.task_37;

class Arrays {

    public static int[] create(int length) {
        return new int[length];
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
