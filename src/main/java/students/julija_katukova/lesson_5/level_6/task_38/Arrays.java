package students.julija_katukova.lesson_5.level_6.task_38;

class Arrays {
    public static int[] create(int length) {
        return new int[length];
    }
    public static int findMax(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    public static int findMin(int[] array)
    {
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

}
