package students.julija_katukova.lesson_5.level_6.task_37;

class Arrays {
    public int findMin(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
