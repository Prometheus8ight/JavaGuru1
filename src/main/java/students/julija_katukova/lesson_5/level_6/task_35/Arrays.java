package students.julija_katukova.lesson_5.level_6.task_35;

class Arrays {
    public int findMax(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
